package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    //write post
    public void write(Board board) {

        boardRepository.save(board);

    }

    //post list
    public List<Board> boardList() {

        return boardRepository.findAll();
    }

    //detail of a post ex. post 1, post 2,...
    public Board boardView(Integer id) {

        return boardRepository.findById(id).get();
    }

    //delete
    public void boardDelete(Integer id) {

        boardRepository.deleteById(id);
    }

}

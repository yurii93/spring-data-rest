package com.yuravashchenko.spring.springboot.spring_data_rest.repository;

import com.yuravashchenko.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

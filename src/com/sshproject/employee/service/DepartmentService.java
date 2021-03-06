package com.sshproject.employee.service;

import com.sshproject.employee.domain.Department;
import com.sshproject.employee.domain.PageBean;

/**
 * Created by yunfei on 2017/2/5.
 */
public interface DepartmentService {
    PageBean<Department> findByPage(Integer currPage);
    void save(Department department);
    Department findById(Integer did);
    void update(Department department);
    void delete(Department department);
}

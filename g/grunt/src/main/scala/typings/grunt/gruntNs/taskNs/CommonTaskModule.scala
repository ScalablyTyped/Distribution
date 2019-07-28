package typings.grunt.gruntNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.task}
  */
@js.native
trait CommonTaskModule extends js.Object {
  /**
    * Check with the name, if a task exists in the registered tasks.
    * @param name The task name to check.
    * @since 0.4.5
    */
  def exists(name: java.lang.String): Boolean = js.native
  def registerMultiTask(
    taskName: java.lang.String,
    taskDescription: java.lang.String,
    taskFunction: js.ThisFunction1[/* this */ IMultiTask[_], /* repeated */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Register a "multi task." A multi task is a task that implicitly iterates over all of its
    * named sub-properties (AKA targets) if no target was specified.
    * In addition to the default properties and methods, extra multi task-specific properties
    * are available inside the task function as properties of the this object.
    *
    * @note taskFunction.apply(scope: grunt.task.IMultiTask<any>, args: any[])
    */
  def registerMultiTask(
    taskName: java.lang.String,
    taskFunction: js.ThisFunction1[/* this */ IMultiTask[_], /* repeated */ js.Any, Unit]
  ): Unit = js.native
  def registerTask(
    taskName: java.lang.String,
    description: java.lang.String,
    taskFunction: js.ThisFunction1[/* this */ ITask, /* repeated */ js.Any, Unit]
  ): Unit = js.native
  def registerTask(taskName: java.lang.String, description: java.lang.String, taskList: js.Array[java.lang.String]): Unit = js.native
  /**
    * If a description and taskFunction are passed, the specified function will be executed
    * whenever the task is run.
    *
    * In addition, the specified description will be shown when grunt --help is run.
    * Task-specific properties and methods are available inside the task function as properties
    * of the this object. The task function can return false to indicate that the task has failed.
    *
    * @note taskFunction.apply(scope: grunt.task.ITask, args: any[])
    */
  def registerTask(
    taskName: java.lang.String,
    taskFunction: js.ThisFunction1[/* this */ ITask, /* repeated */ js.Any, Unit]
  ): Unit = js.native
  /**
    * If a task list is specified, the new task will be an alias for one or more other tasks.
    * Whenever this "alias task" is run, every specified task in taskList will be run, in the order specified.
    * The taskList argument must be an array of tasks.
    */
  def registerTask(taskName: java.lang.String, taskList: js.Array[java.lang.String]): Unit = js.native
  /**
    * Rename a task. This might be useful if you want to override the default behavior of a task, while retaining the old name.
    * Note that if a task has been renamed, the this.name and this.nameArgs properties will change accordingly.
    * @see ITask
    * @param oldname The previous name of the task.
    * @param newname The new name for the task.
    */
  def renameTask(oldname: java.lang.String, newname: java.lang.String): Unit = js.native
}


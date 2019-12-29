package typings.grunt.grunt.task

import typings.grunt.grunt.config.IProjectConfig
import typings.grunt.grunt.file.IFileMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.task#queueing-tasks}
  */
@js.native
trait TaskModule extends CommonTaskModule {
  /**
    * The currently running task or multitask.
    * @see http://gruntjs.com/api/inside-tasks
    */
  var current: IMultiTask[_] = js.native
  /**
    * Empty the task queue completely. Unless additional tasks are enqueued, no more tasks will be run.
    */
  def clearQueue(): Unit = js.native
  /**
    * Normalizes a task target configuration object into an array of src-dest file mappings.
    * This method is used internally by the multi task system this.files / grunt.task.current.files property.
    */
  def normalizeMultiTaskFiles(data: IProjectConfig): js.Array[IFileMap] = js.native
  def normalizeMultiTaskFiles(data: IProjectConfig, targetname: String): js.Array[IFileMap] = js.native
  def run(task: String, thenTasks: String*): Unit = js.native
  /**
    * Enqueue one or more tasks.
    * Every specified task in taskList will be run immediately after the current task completes,
    * in the order specified. The task list can be an array of tasks or individual task arguments.
    */
  def run(tasks: js.Array[String]): Unit = js.native
}


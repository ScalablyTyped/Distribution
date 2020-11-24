package typings.grunt.grunt.task

import typings.grunt.grunt.IFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @link http://gruntjs.com/inside-tasks
  *
  * Grunt version 0.4.x
  */
@js.native
trait ITask extends js.Object {
  
  /**
    * An array of arguments passed to the task.
    * For example, if a "sample" task was run as grunt sample:foo:bar,
    * inside the task function, this.args would be ["foo", "bar"].
    */
  var args: js.Array[String] = js.native
  
  /**
    * If a task is asynchronous, this method must be invoked to instruct Grunt to wait.
    * It returns a handle to a "done" function that should be called when the task has completed.
    *
    *   // Tell Grunt this task is asynchronous.
    *   var done = this.async();
    *   // Your async code.
    *   setTimeout(function() {
    *     // Let's simulate an error, sometimes.
    *     var success = Math.random() > 0.5;
    *     // All done!
    *     done(success);
    *   }, 1000);
    */
  def async(): AsyncResultCatcher = js.native
  
  /**
    * The number of grunt.log.error calls that occurred during this task.
    * This can be used to fail a task if errors were logged during the task.
    */
  var errorCount: Double = js.native
  
  /**
    * An object generated from the arguments passed to the task.
    * For example, if a "sample" task was run as grunt sample:foo:bar,
    * inside the task function, this.flags would be {foo: true, bar: true}.
    */
  var flags: js.Array[IFlag] = js.native
  
  /**
    * The name of the task, as defined in grunt.registerTask.
    * For example, if a "sample" task was run as grunt sample or grunt sample:foo,
    * inside the task function, this.name would be "sample".
    */
  var name: String = js.native
  
  /**
    * The name of the task, including any colon-separated arguments or flags specified on the command-line.
    * For example, if a "sample" task was run as grunt sample:foo,
    * inside the task function, this.nameArgs would be "sample:foo".
    */
  var nameArgs: String = js.native
  
  def options(defaultsObj: js.Any): ITaskOptions = js.native
  /**
    * Returns an options object.
    * Properties of the optional defaultsObj argument will be overridden by any task-level options
    * object properties, which will be further overridden in multi tasks by any target-level
    * options object properties.
    */
  def options[T](defaultsObj: T): T = js.native
  
  def requires(tasks: String, otherTasks: String*): Unit = js.native
  /**
    * If one task depends on the successful completion of another task (or tasks),
    * this method can be used to force Grunt to abort if the other task didn't run,
    * or if the other task failed.
    *
    * @param tasks an array of task names or individual task names, as arguments.
    * @note that this won't actually run the specified task(s),
    * it will just fail the current task if they haven't already run successfully.
    */
  def requires(tasks: js.Array[String]): Unit = js.native
  def requires(tasks: js.Array[String], otherTasks: js.Array[String]*): Unit = js.native
  
  /**
    * Fail the current task if one or more required config properties is missing.
    * One or more string or array config properties may be specified.
    * this.requiresConfig(prop [, prop [, ...]])
    */
  def requiresConfig(prop: String, andProps: String*): Unit = js.native
}

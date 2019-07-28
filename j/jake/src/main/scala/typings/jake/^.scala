package typings.jake

import typings.jake.jakeNs.DirectoryTask
import typings.jake.jakeNs.FileTask
import typings.jake.jakeNs.FileTaskOptions
import typings.jake.jakeNs.NpmPublishTask
import typings.jake.jakeNs.Task
import typings.jake.jakeNs.TaskOptions
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * Complets an asynchronous task, allowing Jake's execution to proceed to the next task
    * @param value A value to return from the task.
    */
  def complete(): Unit = js.native
  def complete(value: js.Any): Unit = js.native
  /**
    * Creates a description for a Jake Task (or FileTask, DirectoryTask). When invoked, the description that iscreated will be associated with whatever Task is created next.
    * @param description The description for the Task
    */
  def desc(description: String): Unit = js.native
  /**
    * Creates a Jake DirectoryTask. Can be used as a prerequisite for FileTasks, or for simply ensuring a directory exists for use with a Task's action.
    * @param name The name of the DiretoryTask
    */
  def directory(name: String): DirectoryTask = js.native
  /**
    * Causes Jake execution to abort with an error. Allows passing an optional error code, which will be used to set the exit-code of exiting process.
    * @param err The error to thow when aborting execution. If this argument is an Error object, it will simply be thrown. If a String, it will be used as the error-message. (If it is a multi-line String, the first line will be used as the Error message, and the remaining lines will be used as the error-stack.)
    */
  def fail(err: (js.Any | Error | String)*): Unit = js.native
  /**
    * Creates a Jake FileTask.
    * @name name The name of the Task
    * @param prereqs Prerequisites to be run before this task
    * @param action The action to perform for this task
    * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
    */
  def file(name: String): FileTask = js.native
  def file(name: String, prereqs: js.Array[String]): FileTask = js.native
  def file(name: String, prereqs: js.Array[String], action: js.ThisFunction0[/* this */ FileTask, Unit]): FileTask = js.native
  def file(
    name: String,
    prereqs: js.Array[String],
    action: js.ThisFunction0[/* this */ FileTask, Unit],
    opts: FileTaskOptions
  ): FileTask = js.native
  /**
    * Creates a namespace which allows logical grouping of tasks, and prevents name-collisions with task-names. Namespaces can be nested inside of other namespaces.
    * @param name The name of the namespace
    * @param scope The enclosing scope for the namespaced tasks
    */
  def namespace(name: String, scope: js.Function0[Unit]): Unit = js.native
  def npmPublishTask(name: String): NpmPublishTask = js.native
  def npmPublishTask(name: String, definition: js.Function0[Unit]): NpmPublishTask = js.native
  /**
    * @param name The name of the NpmPublishTask
    * @param packageFiles The files to include in the package
    * @param definition A function that creates the package definition
    */
  def npmPublishTask(name: String, packageFiles: js.Array[String]): NpmPublishTask = js.native
  /**
    * Creates Jake FileTask from regex patterns
    * @name name/pattern of the Task
    * @param source calculated from the name pattern
    * @param prereqs Prerequisites to be run before this task
    * @param action The action to perform for this task
    * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
    */
  def rule(pattern: RegExp, source: String): Unit = js.native
  def rule(pattern: RegExp, source: String, prereqs: js.Array[String]): Unit = js.native
  def rule(pattern: RegExp, source: String, prereqs: js.Array[String], action: js.Function0[Unit]): Unit = js.native
  def rule(
    pattern: RegExp,
    source: String,
    prereqs: js.Array[String],
    action: js.Function0[Unit],
    opts: TaskOptions
  ): Unit = js.native
  def rule(pattern: RegExp, source: Fn_Name): Unit = js.native
  def rule(pattern: RegExp, source: Fn_Name, prereqs: js.Array[String]): Unit = js.native
  def rule(pattern: RegExp, source: Fn_Name, prereqs: js.Array[String], action: js.Function0[Unit]): Unit = js.native
  def rule(
    pattern: RegExp,
    source: Fn_Name,
    prereqs: js.Array[String],
    action: js.Function0[Unit],
    opts: TaskOptions
  ): Unit = js.native
  /**
    * @param name The name of the Task
    * @param prereqs Prerequisites to be run before this task
    * @param action The action to perform for this task
    * @param opts
    */
  def task(name: String): Task = js.native
  def task(name: String, action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _]): Task = js.native
  def task(
    name: String,
    action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _],
    opts: TaskOptions
  ): Task = js.native
  def task(name: String, opts: TaskOptions): Task = js.native
  def task(
    name: String,
    opts: TaskOptions,
    action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _]
  ): Task = js.native
  def task(name: String, prereqs: js.Array[String]): Task = js.native
  def task(
    name: String,
    prereqs: js.Array[String],
    action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _]
  ): Task = js.native
  def task(
    name: String,
    prereqs: js.Array[String],
    action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _],
    opts: TaskOptions
  ): Task = js.native
}


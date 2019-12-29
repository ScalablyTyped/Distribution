package typings.jake.jakeMod._Global_.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jake.FileTask")
@js.native
class FileTask protected () extends Task {
  /**
  		 * @param name The name of the Task
  		 * @param prereqs Prerequisites to be run before this task
  		 * @param action The action to perform to create this file
  		 * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
  	     */
  def this(name: String) = this()
  def this(name: String, prereqs: js.Array[String]) = this()
  def this(name: String, prereqs: js.Array[String], action: js.ThisFunction0[/* this */ FileTask, Unit]) = this()
  def this(
    name: String,
    prereqs: js.Array[String],
    action: js.ThisFunction0[/* this */ FileTask, Unit],
    opts: FileTaskOptions
  ) = this()
}


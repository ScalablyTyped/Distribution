package typings
package jakeLib.jakeNs

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
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, prereqs: js.Array[java.lang.String]) = this()
  def this(name: java.lang.String, prereqs: js.Array[java.lang.String], action: js.ThisFunction0[/* this */ FileTask, scala.Unit]) = this()
  def this(name: java.lang.String, prereqs: js.Array[java.lang.String], action: js.ThisFunction0[/* this */ FileTask, scala.Unit], opts: FileTaskOptions) = this()
}


package typings
package jakeLib.jakeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jake.Task")
@js.native
class Task protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  /**
  		 * @name name The name of the Task
  		 * @param prereqs Prerequisites to be run before this task
  		 * @param action The action to perform for this task
  		 * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
  		 */
  def this(name: java.lang.String) = this()
  /**
  		 * @name name The name of the Task
  		 * @param prereqs Prerequisites to be run before this task
  		 * @param action The action to perform for this task
  		 * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
  		 */
  def this(name: java.lang.String, prereqs: js.Array[java.lang.String]) = this()
  /**
  		 * @name name The name of the Task
  		 * @param prereqs Prerequisites to be run before this task
  		 * @param action The action to perform for this task
  		 * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
  		 */
  def this(name: java.lang.String, prereqs: js.Array[java.lang.String], action: js.ThisFunction0[/* this */ Task, scala.Unit]) = this()
  /**
  		 * @name name The name of the Task
  		 * @param prereqs Prerequisites to be run before this task
  		 * @param action The action to perform for this task
  		 * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
  		 */
  def this(name: java.lang.String, prereqs: js.Array[java.lang.String], action: js.ThisFunction0[/* this */ Task, scala.Unit], opts: TaskOptions) = this()
  var action: js.UndefOr[js.Function1[/* repeated */js.Any, _]] = js.native
  var async: js.UndefOr[scala.Boolean] = js.native
  var description: js.UndefOr[java.lang.String] = js.native
  var fullName: java.lang.String = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  var prereqs: js.UndefOr[js.Array[java.lang.String]] = js.native
  var taskStatus: js.UndefOr[java.lang.String] = js.native
  var value: js.Any = js.native
  def addListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def complete(): scala.Unit = js.native
  def complete(value: js.Any): scala.Unit = js.native
  /**
  		 * Runs prerequisites, then this task. If the task has already been run, will not run the task again.
  		 */
  def invoke(): scala.Unit = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def once(event: java.lang.String, listener: js.Function): this.type = js.native
  /**
  		 * Runs this task, without running any prerequisites. If the task has already been run, it will still run it again.
  		 */
  def reenable(): scala.Unit = js.native
  def removeListener(event: java.lang.String, listener: js.Function): this.type = js.native
}


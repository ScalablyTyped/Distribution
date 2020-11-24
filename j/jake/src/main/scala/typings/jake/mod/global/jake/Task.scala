package typings.jake.mod.global.jake

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("jake.Task")
@js.native
class Task protected () extends EventEmitter {
  /**
    * @name name The name of the Task
    * @param prereqs Prerequisites to be run before this task
    * @param action The action to perform for this task
    * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
    */
  def this(name: String) = this()
  def this(name: String, prereqs: js.Array[String]) = this()
  def this(name: String, prereqs: js.UndefOr[scala.Nothing], action: js.ThisFunction0[/* this */ Task, Unit]) = this()
  def this(name: String, prereqs: js.Array[String], action: js.ThisFunction0[/* this */ Task, Unit]) = this()
  def this(
    name: String,
    prereqs: js.UndefOr[scala.Nothing],
    action: js.UndefOr[scala.Nothing],
    opts: TaskOptions
  ) = this()
  def this(
    name: String,
    prereqs: js.UndefOr[scala.Nothing],
    action: js.ThisFunction0[/* this */ Task, Unit],
    opts: TaskOptions
  ) = this()
  def this(name: String, prereqs: js.Array[String], action: js.UndefOr[scala.Nothing], opts: TaskOptions) = this()
  def this(
    name: String,
    prereqs: js.Array[String],
    action: js.ThisFunction0[/* this */ Task, Unit],
    opts: TaskOptions
  ) = this()
  
  var action: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  def addListener(event: String, listener: js.Function): this.type = js.native
  
  var async: js.UndefOr[Boolean] = js.native
  
  def complete(): Unit = js.native
  def complete(value: js.Any): Unit = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var fullName: String = js.native
  
  /**
    * Runs prerequisites, then this task. If the task has already been run, will not run the task again.
    */
  def invoke(): Unit = js.native
  
  var name: js.UndefOr[String] = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  
  def once(event: String, listener: js.Function): this.type = js.native
  
  var prereqs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Runs this task, without running any prerequisites. If the task has already been run, it will still run it again.
    */
  def reenable(): Unit = js.native
  
  def removeListener(event: String, listener: js.Function): this.type = js.native
  
  var taskStatus: js.UndefOr[String] = js.native
  
  var value: js.Any = js.native
}

package typings.jake.mod.global

import typings.jake.mod.global.jake.FileTask
import typings.jake.mod.global.jake.FileTaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("file")
@js.native
object file extends js.Object {
  /**
    * Creates a Jake FileTask.
    * @name name The name of the Task
    * @param prereqs Prerequisites to be run before this task
    * @param action The action to perform for this task
    * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
    */
  def apply(name: String): FileTask = js.native
  def apply(
    name: String,
    prereqs: js.UndefOr[scala.Nothing],
    action: js.UndefOr[scala.Nothing],
    opts: FileTaskOptions
  ): FileTask = js.native
  def apply(
    name: String,
    prereqs: js.UndefOr[scala.Nothing],
    action: js.ThisFunction0[/* this */ FileTask, Unit]
  ): FileTask = js.native
  def apply(
    name: String,
    prereqs: js.UndefOr[scala.Nothing],
    action: js.ThisFunction0[/* this */ FileTask, Unit],
    opts: FileTaskOptions
  ): FileTask = js.native
  def apply(name: String, prereqs: js.Array[String]): FileTask = js.native
  def apply(name: String, prereqs: js.Array[String], action: js.UndefOr[scala.Nothing], opts: FileTaskOptions): FileTask = js.native
  def apply(name: String, prereqs: js.Array[String], action: js.ThisFunction0[/* this */ FileTask, Unit]): FileTask = js.native
  def apply(
    name: String,
    prereqs: js.Array[String],
    action: js.ThisFunction0[/* this */ FileTask, Unit],
    opts: FileTaskOptions
  ): FileTask = js.native
}


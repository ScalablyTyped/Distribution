package typings.jake

import typings.jake.jake.TaskOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("rule")
@js.native
object rule extends js.Object {
  /**
    * Creates Jake FileTask from regex patterns
    * @name name/pattern of the Task
    * @param source calculated from the name pattern
    * @param prereqs Prerequisites to be run before this task
    * @param action The action to perform for this task
    * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
    */
  def apply(pattern: RegExp, source: String): Unit = js.native
  def apply(pattern: RegExp, source: String, prereqs: js.Array[String]): Unit = js.native
  def apply(pattern: RegExp, source: String, prereqs: js.Array[String], action: js.Function0[Unit]): Unit = js.native
  def apply(
    pattern: RegExp,
    source: String,
    prereqs: js.Array[String],
    action: js.Function0[Unit],
    opts: TaskOptions
  ): Unit = js.native
  def apply(pattern: RegExp, source: Fn_Name): Unit = js.native
  def apply(pattern: RegExp, source: Fn_Name, prereqs: js.Array[String]): Unit = js.native
  def apply(pattern: RegExp, source: Fn_Name, prereqs: js.Array[String], action: js.Function0[Unit]): Unit = js.native
  def apply(
    pattern: RegExp,
    source: Fn_Name,
    prereqs: js.Array[String],
    action: js.Function0[Unit],
    opts: TaskOptions
  ): Unit = js.native
}


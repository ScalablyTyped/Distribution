package typings
package atIonicCliDashFrameworkLib.libTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/tasks", "TaskChain")
@js.native
class TaskChain ()
  extends eventsLib.eventsMod.EventEmitter {
  def this(hasTaskOptions: TaskChainOptions) = this()
  var current: js.UndefOr[Task] = js.native
  val taskOptions: stdLib.Partial[TaskOptions] = js.native
  val tasks: js.Array[Task] = js.native
  def cleanup(): this.type = js.native
  def createTask(options: TaskOptions): Task = js.native
  @JSName("emit")
  def emit_end(name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.end): scala.Boolean = js.native
  @JSName("emit")
  def emit_end(name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.end, lastTask: Task): scala.Boolean = js.native
  @JSName("emit")
  def emit_failure(name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.failure): scala.Boolean = js.native
  @JSName("emit")
  def emit_failure(name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.failure, failedTask: Task): scala.Boolean = js.native
  @JSName("emit")
  def emit_next(name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.next, task: Task): scala.Boolean = js.native
  def end(): this.type = js.native
  def fail(): this.type = js.native
  def next(msg: java.lang.String): Task = js.native
  def nextTask(task: Task): Task = js.native
  @JSName("on")
  def on_end(
    name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.end,
    handler: js.Function1[/* lastTask */ js.UndefOr[Task], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_failure(
    name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.failure,
    handler: js.Function1[/* failedTask */ js.UndefOr[Task], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_next(
    name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.next,
    handler: js.Function1[/* task */ Task, scala.Unit]
  ): this.type = js.native
}


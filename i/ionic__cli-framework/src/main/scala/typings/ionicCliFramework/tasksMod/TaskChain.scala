package typings.ionicCliFramework.tasksMod

import typings.ionicCliFramework.anon.PartialTaskOptions
import typings.ionicCliFramework.ionicCliFrameworkStrings.end
import typings.ionicCliFramework.ionicCliFrameworkStrings.failure
import typings.ionicCliFramework.ionicCliFrameworkStrings.next
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/tasks", "TaskChain")
@js.native
class TaskChain () extends EventEmitter {
  def this(hasTaskOptions: TaskChainOptions) = this()
  var current: js.UndefOr[Task] = js.native
  val taskOptions: PartialTaskOptions = js.native
  val tasks: js.Array[Task] = js.native
  def cleanup(): this.type = js.native
  def createTask(options: TaskOptions): Task = js.native
  @JSName("emit")
  def emit_end(name: end): Boolean = js.native
  @JSName("emit")
  def emit_end(name: end, lastTask: Task): Boolean = js.native
  @JSName("emit")
  def emit_failure(name: failure): Boolean = js.native
  @JSName("emit")
  def emit_failure(name: failure, failedTask: Task): Boolean = js.native
  @JSName("emit")
  def emit_next(name: next, task: Task): Boolean = js.native
  def end(): this.type = js.native
  def fail(): this.type = js.native
  def next(msg: String): Task = js.native
  def nextTask(task: Task): Task = js.native
  @JSName("on")
  def on_end(name: end, handler: js.Function1[/* lastTask */ js.UndefOr[Task], Unit]): this.type = js.native
  @JSName("on")
  def on_failure(name: failure, handler: js.Function1[/* failedTask */ js.UndefOr[Task], Unit]): this.type = js.native
  @JSName("on")
  def on_next(name: next, handler: js.Function1[/* task */ Task, Unit]): this.type = js.native
}


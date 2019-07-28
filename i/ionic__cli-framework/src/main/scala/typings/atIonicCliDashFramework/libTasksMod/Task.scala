package typings.atIonicCliDashFramework.libTasksMod

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.clear
import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.end
import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.failure
import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.success
import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.tick
import typings.node.NodeJSNs.Timer
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/tasks", "Task")
@js.native
class Task () extends EventEmitter {
  def this(hasMsgTickInterval: TaskOptions) = this()
  var _msg: String = js.native
  var intervalId: js.UndefOr[Timer] = js.native
  var msg: String = js.native
  var progressRatio: js.UndefOr[Double] = js.native
  var running: Boolean = js.native
  var tickInterval: js.UndefOr[Double] = js.native
  def clear(): this.type = js.native
  @JSName("emit")
  def emit_clear(name: clear): Boolean = js.native
  @JSName("emit")
  def emit_end(name: end): Boolean = js.native
  @JSName("emit")
  def emit_failure(name: failure): Boolean = js.native
  @JSName("emit")
  def emit_success(name: success): Boolean = js.native
  @JSName("emit")
  def emit_tick(name: tick): Boolean = js.native
  def end(): this.type = js.native
  def fail(): this.type = js.native
  @JSName("on")
  def on_clear(name: clear, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_end(name: end, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_failure(name: failure, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_success(name: success, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_tick(name: tick, handler: js.Function0[Unit]): this.type = js.native
  def progress(prog: Double, total: Double): this.type = js.native
  def start(): this.type = js.native
  def succeed(): this.type = js.native
  def tick(): this.type = js.native
}


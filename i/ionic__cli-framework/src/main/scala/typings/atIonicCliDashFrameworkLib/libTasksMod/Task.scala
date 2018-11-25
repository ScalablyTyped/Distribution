package typings
package atIonicCliDashFrameworkLib.libTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/tasks", "Task")
@js.native
class Task ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(hasMsgTickInterval: TaskOptions) = this()
  var _msg: java.lang.String = js.native
  var intervalId: js.UndefOr[nodeLib.NodeJSNs.Timer] = js.native
  var msg: java.lang.String = js.native
  var progressRatio: js.UndefOr[scala.Double] = js.native
  var running: scala.Boolean = js.native
  var tickInterval: js.UndefOr[scala.Double] = js.native
  def clear(): this.type = js.native
  @JSName("emit")
  def emit_clear(name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.clear): scala.Boolean = js.native
  @JSName("emit")
  def emit_end(name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.end): scala.Boolean = js.native
  @JSName("emit")
  def emit_failure(name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.failure): scala.Boolean = js.native
  @JSName("emit")
  def emit_success(name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.success): scala.Boolean = js.native
  @JSName("emit")
  def emit_tick(name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.tick): scala.Boolean = js.native
  def end(): this.type = js.native
  def fail(): this.type = js.native
  @JSName("on")
  def on_clear(
    name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.clear,
    handler: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_end(
    name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.end,
    handler: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_failure(
    name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.failure,
    handler: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_success(
    name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.success,
    handler: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_tick(
    name: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.tick,
    handler: js.Function0[scala.Unit]
  ): this.type = js.native
  def progress(prog: scala.Double, total: scala.Double): this.type = js.native
  def start(): this.type = js.native
  def succeed(): this.type = js.native
  def tick(): this.type = js.native
}


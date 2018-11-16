package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Button")
@js.native
class Button protected () extends js.Object {
  def this(pin: java.lang.String) = this()
  def this(pin: ButtonOption) = this()
  def this(pin: scala.Double) = this()
  var downValue: scala.Double = js.native
  var holdtime: scala.Double = js.native
  var id: java.lang.String = js.native
  var pin: scala.Double | java.lang.String = js.native
  var upValue: scala.Double = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_down(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.down, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_hold(
    event: johnnyDashFiveLib.johnnyDashFiveLibStrings.hold,
    cb: js.Function1[/* holdTime */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_press(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.press, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_release(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.release, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_up(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.up, cb: js.Function0[scala.Unit]): this.type = js.native
}


package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Joystick")
@js.native
class Joystick protected () extends js.Object {
  def this(option: JoystickOption) = this()
  var axis: js.Array[scala.Double] = js.native
  var id: java.lang.String = js.native
  var raw: js.Array[scala.Double] = js.native
  val x: scala.Double = js.native
  val y: scala.Double = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_axismove(
    event: johnnyDashFiveLib.johnnyDashFiveLibStrings.axismove,
    cb: js.Function2[/* error */ nodeLib.Error, /* date */ stdLib.Date, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_change(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.change, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(
    event: johnnyDashFiveLib.johnnyDashFiveLibStrings.data,
    cb: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
}


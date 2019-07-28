package typings.johnnyDashFive.johnnyDashFiveMod

import typings.johnnyDashFive.johnnyDashFiveStrings.axismove
import typings.johnnyDashFive.johnnyDashFiveStrings.change
import typings.johnnyDashFive.johnnyDashFiveStrings.data
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Joystick")
@js.native
class Joystick protected () extends js.Object {
  def this(option: JoystickOption) = this()
  var axis: js.Array[Double] = js.native
  var id: String = js.native
  var raw: js.Array[Double] = js.native
  val x: Double = js.native
  val y: Double = js.native
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_axismove(event: axismove, cb: js.Function2[/* error */ Error, /* date */ Date, Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
}


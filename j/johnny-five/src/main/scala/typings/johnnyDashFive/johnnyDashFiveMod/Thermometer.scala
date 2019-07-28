package typings.johnnyDashFive.johnnyDashFiveMod

import typings.johnnyDashFive.johnnyDashFiveStrings.change
import typings.johnnyDashFive.johnnyDashFiveStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Thermometer")
@js.native
class Thermometer protected () extends js.Object {
  def this(option: ThermometerOption) = this()
  val C: Double = js.native
  val F: Double = js.native
  val K: Double = js.native
  val celsius: Double = js.native
  val fahrenheit: Double = js.native
  var id: String = js.native
  val kelvin: Double = js.native
  var pin: Double | String = js.native
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
}


package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Thermometer")
@js.native
class Thermometer protected () extends js.Object {
  def this(option: ThermometerOption) = this()
  val C: scala.Double = js.native
  val F: scala.Double = js.native
  val K: scala.Double = js.native
  val celsius: scala.Double = js.native
  val fahrenheit: scala.Double = js.native
  var id: java.lang.String = js.native
  val kelvin: scala.Double = js.native
  var pin: scala.Double | java.lang.String = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.change, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(
    event: johnnyDashFiveLib.johnnyDashFiveLibStrings.data,
    cb: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
}


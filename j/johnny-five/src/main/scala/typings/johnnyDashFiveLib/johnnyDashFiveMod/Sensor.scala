package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Sensor")
@js.native
class Sensor protected () extends js.Object {
  def this(option: java.lang.String) = this()
  def this(option: SensorOption) = this()
  def this(option: scala.Double) = this()
  val analog: scala.Double = js.native
  val boolean: scala.Boolean = js.native
  val constrained: scala.Double = js.native
  var id: java.lang.String = js.native
  var pin: scala.Double | java.lang.String = js.native
  val raw: scala.Double = js.native
  var threshold: scala.Double = js.native
  val value: scala.Double = js.native
  def booleanAt(barrier: scala.Double): scala.Boolean = js.native
  def fscaleTo(low: scala.Double, high: scala.Double): scala.Double = js.native
  def fscaleTo(range: js.Array[scala.Double]): scala.Double = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.change, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(
    event: johnnyDashFiveLib.johnnyDashFiveLibStrings.data,
    cb: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
  def scaleTo(low: scala.Double, high: scala.Double): scala.Double = js.native
  def scaleTo(range: js.Array[scala.Double]): scala.Double = js.native
  def within(range: js.Array[scala.Double], cb: js.Function0[scala.Unit]): scala.Unit = js.native
}


package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Accelerometer")
@js.native
class Accelerometer protected () extends js.Object {
  def this(option: AccelerometerAnalogOption) = this()
  def this(option: AccelerometerGeneralOption) = this()
  def this(option: AccelerometerMMA7361Option) = this()
  def this(option: AccelerometerMPU6050Option) = this()
  val acceleration: scala.Double = js.native
  var id: java.lang.String = js.native
  val inclination: scala.Double = js.native
  val orientation: scala.Double = js.native
  var pins: js.Array[java.lang.String] = js.native
  val pitch: scala.Double = js.native
  val roll: scala.Double = js.native
  val x: scala.Double = js.native
  val y: scala.Double = js.native
  val z: scala.Double = js.native
  var zeroV: scala.Double = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def hasAxis(name: java.lang.String): scala.Unit = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.change, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(
    event: johnnyDashFiveLib.johnnyDashFiveLibStrings.data,
    cb: js.Function1[/* freq */ js.Any, scala.Unit]
  ): this.type = js.native
}


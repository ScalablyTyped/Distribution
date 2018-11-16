package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Gyro")
@js.native
class Gyro protected () extends js.Object {
  def this(option: GyroAnalogOption) = this()
  def this(option: GyroGeneralOption) = this()
  def this(option: GyroMPU6050Option) = this()
  var id: java.lang.String = js.native
  val isCalibrated: scala.Boolean = js.native
  var pins: js.Array[java.lang.String] = js.native
  val pitch: js.Any = js.native
  val rate: js.Any = js.native
  val roll: js.Any = js.native
  val x: scala.Double = js.native
  val y: scala.Double = js.native
  val yaw: js.Any = js.native
  val z: scala.Double = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.change, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(
    event: johnnyDashFiveLib.johnnyDashFiveLibStrings.data,
    cb: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
  def recalibrate(): scala.Unit = js.native
}


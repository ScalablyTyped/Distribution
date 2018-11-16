package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "IMU")
@js.native
class IMU protected () extends js.Object {
  def this(option: IMUGeneralOption) = this()
  def this(option: IMUMPU6050Option) = this()
  val accelerometer: Accelerometer = js.native
  val compass: Compass = js.native
  val gyro: Gyro = js.native
  val orientation: Orientiation = js.native
  val thermometer: Thermometer = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_calibrated(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.calibrated, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.change, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(
    event: johnnyDashFiveLib.johnnyDashFiveLibStrings.data,
    cb: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
}


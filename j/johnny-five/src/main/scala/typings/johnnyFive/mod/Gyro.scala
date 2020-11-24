package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.change
import typings.johnnyFive.johnnyFiveStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Gyro")
@js.native
class Gyro protected () extends js.Object {
  def this(option: GyroAnalogOption) = this()
  def this(option: GyroGeneralOption) = this()
  def this(option: GyroMPU6050Option) = this()
  
  var id: String = js.native
  
  val isCalibrated: Boolean = js.native
  
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  
  var pins: js.Array[String] = js.native
  
  val pitch: js.Any = js.native
  
  val rate: js.Any = js.native
  
  def recalibrate(): Unit = js.native
  
  val roll: js.Any = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
  
  val yaw: js.Any = js.native
  
  val z: Double = js.native
}

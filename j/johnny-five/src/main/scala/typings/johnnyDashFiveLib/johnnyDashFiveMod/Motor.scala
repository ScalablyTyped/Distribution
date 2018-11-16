package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Motor")
@js.native
class Motor protected () extends js.Object {
  def this(option: MotorOption) = this()
  def this(option: js.Array[scala.Double]) = this()
  val isOn: scala.Boolean = js.native
  def brake(): scala.Unit = js.native
  def forward(speed: scala.Double): scala.Unit = js.native
  def fwd(speed: scala.Double): scala.Unit = js.native
  def release(): scala.Unit = js.native
  def rev(speed: scala.Double): scala.Unit = js.native
  def reverse(speed: scala.Double): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def start(speed: scala.Double): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}


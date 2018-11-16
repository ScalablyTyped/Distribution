package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Motors")
@js.native
class Motors protected () extends js.Object {
  def this(option: js.Array[MotorOption | scala.Double]) = this()
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


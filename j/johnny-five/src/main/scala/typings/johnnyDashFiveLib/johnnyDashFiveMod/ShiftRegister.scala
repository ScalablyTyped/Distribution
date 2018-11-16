package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "ShiftRegister")
@js.native
class ShiftRegister protected () extends js.Object {
  def this(option: ShiftRegisterOption) = this()
  var id: java.lang.String = js.native
  val isAnode: scala.Boolean = js.native
  var pins: js.Any = js.native
  val value: js.Any = js.native
  def clear(): scala.Unit = js.native
  def display(number: java.lang.String): scala.Unit = js.native
  def display(number: scala.Double): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def send(value: scala.Double*): scala.Unit = js.native
}


package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "ShiftRegister")
@js.native
class ShiftRegister protected () extends js.Object {
  def this(option: ShiftRegisterOption) = this()
  var id: String = js.native
  val isAnode: Boolean = js.native
  var pins: js.Any = js.native
  val value: js.Any = js.native
  def clear(): Unit = js.native
  def display(number: String): Unit = js.native
  def display(number: Double): Unit = js.native
  def reset(): Unit = js.native
  def send(value: Double*): Unit = js.native
}


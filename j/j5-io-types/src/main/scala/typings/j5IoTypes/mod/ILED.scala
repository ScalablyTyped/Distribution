package typings.j5IoTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILED extends IPeripheral {
  def hasLed(): Boolean = js.native
  def read(): Value = js.native
  def write(value: Value): Unit = js.native
}


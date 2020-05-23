package typings.j5IoTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDigitalOutput extends IPeripheral {
  val value: Double = js.native
  def write(value: Value): Unit = js.native
}


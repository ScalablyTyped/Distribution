package typings.j5IoTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait II2CModule extends js.Object {
  def createI2C(portId: String): II2C = js.native
  def createI2C(portId: Double): II2C = js.native
}


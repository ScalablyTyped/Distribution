package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PiezoOption extends js.Object {
  var pin: Double
}

object PiezoOption {
  @scala.inline
  def apply(pin: Double): PiezoOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiezoOption]
  }
}


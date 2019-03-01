package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PiezoOption extends js.Object {
  var pin: scala.Double
}

object PiezoOption {
  @scala.inline
  def apply(pin: scala.Double): PiezoOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pin")(pin)
    __obj.asInstanceOf[PiezoOption]
  }
}


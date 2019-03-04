package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompassOption extends js.Object {
  var controller: java.lang.String
  var gauss: js.UndefOr[scala.Double] = js.undefined
}

object CompassOption {
  @scala.inline
  def apply(controller: java.lang.String, gauss: scala.Int | scala.Double = null): CompassOption = {
    val __obj = js.Dynamic.literal(controller = controller)
    if (gauss != null) __obj.updateDynamic("gauss")(gauss.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassOption]
  }
}


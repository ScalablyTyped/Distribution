package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompassOption extends js.Object {
  var controller: String
  var gauss: js.UndefOr[Double] = js.undefined
}

object CompassOption {
  @scala.inline
  def apply(controller: String, gauss: Int | Double = null): CompassOption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    if (gauss != null) __obj.updateDynamic("gauss")(gauss.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassOption]
  }
}


package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompassOption extends js.Object {
  var controller: String
  var gauss: js.UndefOr[Double] = js.undefined
}

object CompassOption {
  @scala.inline
  def apply(controller: String, gauss: js.UndefOr[Double] = js.undefined): CompassOption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    if (!js.isUndefined(gauss)) __obj.updateDynamic("gauss")(gauss.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassOption]
  }
}


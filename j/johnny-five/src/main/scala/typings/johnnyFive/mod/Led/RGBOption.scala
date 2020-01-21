package typings.johnnyFive.mod.Led

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBOption extends js.Object {
  var controller: js.UndefOr[String] = js.undefined
  var isAnode: js.UndefOr[Boolean] = js.undefined
  var pins: js.Array[Double]
}

object RGBOption {
  @scala.inline
  def apply(pins: js.Array[Double], controller: String = null, isAnode: js.UndefOr[Boolean] = js.undefined): RGBOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnode)) __obj.updateDynamic("isAnode")(isAnode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBOption]
  }
}


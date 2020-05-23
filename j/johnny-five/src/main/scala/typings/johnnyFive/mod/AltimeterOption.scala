package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AltimeterOption extends js.Object {
  var address: js.UndefOr[Double] = js.undefined
  var controller: String
  var elevation: js.UndefOr[Double] = js.undefined
  var freq: js.UndefOr[Double] = js.undefined
}

object AltimeterOption {
  @scala.inline
  def apply(
    controller: String,
    address: js.UndefOr[Double] = js.undefined,
    elevation: js.UndefOr[Double] = js.undefined,
    freq: js.UndefOr[Double] = js.undefined
  ): AltimeterOption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.get.asInstanceOf[js.Any])
    if (!js.isUndefined(elevation)) __obj.updateDynamic("elevation")(elevation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freq)) __obj.updateDynamic("freq")(freq.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltimeterOption]
  }
}


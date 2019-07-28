package typings.johnnyDashFive.johnnyDashFiveMod

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
    address: Int | Double = null,
    elevation: Int | Double = null,
    freq: Int | Double = null
  ): AltimeterOption = {
    val __obj = js.Dynamic.literal(controller = controller)
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltimeterOption]
  }
}


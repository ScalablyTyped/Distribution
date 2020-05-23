package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LCDI2COption extends LCDGeneralOption {
  var backlight: js.UndefOr[Double] = js.undefined
  var controller: String
}

object LCDI2COption {
  @scala.inline
  def apply(
    controller: String,
    backlight: js.UndefOr[Double] = js.undefined,
    cols: js.UndefOr[Double] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined
  ): LCDI2COption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    if (!js.isUndefined(backlight)) __obj.updateDynamic("backlight")(backlight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCDI2COption]
  }
}


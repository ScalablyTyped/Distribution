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
    backlight: Int | Double = null,
    cols: Int | Double = null,
    rows: Int | Double = null
  ): LCDI2COption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    if (backlight != null) __obj.updateDynamic("backlight")(backlight.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCDI2COption]
  }
}


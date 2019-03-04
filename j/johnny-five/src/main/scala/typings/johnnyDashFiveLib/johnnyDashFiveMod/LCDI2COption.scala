package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LCDI2COption extends LCDGeneralOption {
  var backlight: js.UndefOr[scala.Double] = js.undefined
  var controller: java.lang.String
}

object LCDI2COption {
  @scala.inline
  def apply(
    controller: java.lang.String,
    backlight: scala.Int | scala.Double = null,
    cols: scala.Int | scala.Double = null,
    rows: scala.Int | scala.Double = null
  ): LCDI2COption = {
    val __obj = js.Dynamic.literal(controller = controller)
    if (backlight != null) __obj.updateDynamic("backlight")(backlight.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCDI2COption]
  }
}


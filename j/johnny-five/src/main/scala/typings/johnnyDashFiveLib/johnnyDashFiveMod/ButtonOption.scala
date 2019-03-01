package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOption extends js.Object {
  var holdtime: js.UndefOr[scala.Double] = js.undefined
  var invert: js.UndefOr[scala.Boolean] = js.undefined
  var isPulldown: js.UndefOr[scala.Boolean] = js.undefined
  var isPullup: js.UndefOr[scala.Boolean] = js.undefined
  var pin: scala.Double | java.lang.String
}

object ButtonOption {
  @scala.inline
  def apply(
    pin: scala.Double | java.lang.String,
    holdtime: scala.Int | scala.Double = null,
    invert: js.UndefOr[scala.Boolean] = js.undefined,
    isPulldown: js.UndefOr[scala.Boolean] = js.undefined,
    isPullup: js.UndefOr[scala.Boolean] = js.undefined
  ): ButtonOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
    if (holdtime != null) __obj.updateDynamic("holdtime")(holdtime.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert)
    if (!js.isUndefined(isPulldown)) __obj.updateDynamic("isPulldown")(isPulldown)
    if (!js.isUndefined(isPullup)) __obj.updateDynamic("isPullup")(isPullup)
    __obj.asInstanceOf[ButtonOption]
  }
}


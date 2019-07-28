package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOption extends js.Object {
  var holdtime: js.UndefOr[Double] = js.undefined
  var invert: js.UndefOr[Boolean] = js.undefined
  var isPulldown: js.UndefOr[Boolean] = js.undefined
  var isPullup: js.UndefOr[Boolean] = js.undefined
  var pin: Double | String
}

object ButtonOption {
  @scala.inline
  def apply(
    pin: Double | String,
    holdtime: Int | Double = null,
    invert: js.UndefOr[Boolean] = js.undefined,
    isPulldown: js.UndefOr[Boolean] = js.undefined,
    isPullup: js.UndefOr[Boolean] = js.undefined
  ): ButtonOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (holdtime != null) __obj.updateDynamic("holdtime")(holdtime.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert)
    if (!js.isUndefined(isPulldown)) __obj.updateDynamic("isPulldown")(isPulldown)
    if (!js.isUndefined(isPullup)) __obj.updateDynamic("isPullup")(isPullup)
    __obj.asInstanceOf[ButtonOption]
  }
}


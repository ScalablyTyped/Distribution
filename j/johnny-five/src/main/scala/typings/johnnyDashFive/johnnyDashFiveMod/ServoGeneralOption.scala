package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServoGeneralOption extends js.Object {
  var center: js.UndefOr[Boolean] = js.undefined
  var controller: js.UndefOr[String] = js.undefined
  var isInverted: js.UndefOr[Boolean] = js.undefined
  var pin: Double | String
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  var startAt: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ServoGeneralOption {
  @scala.inline
  def apply(
    pin: Double | String,
    center: js.UndefOr[Boolean] = js.undefined,
    controller: String = null,
    isInverted: js.UndefOr[Boolean] = js.undefined,
    range: js.Array[Double] = null,
    startAt: Int | Double = null,
    `type`: String = null
  ): ServoGeneralOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (!js.isUndefined(isInverted)) __obj.updateDynamic("isInverted")(isInverted)
    if (range != null) __obj.updateDynamic("range")(range)
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ServoGeneralOption]
  }
}


package typings.johnnyFive.mod

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
    startAt: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): ServoGeneralOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.get.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (!js.isUndefined(isInverted)) __obj.updateDynamic("isInverted")(isInverted.get.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(startAt)) __obj.updateDynamic("startAt")(startAt.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoGeneralOption]
  }
}


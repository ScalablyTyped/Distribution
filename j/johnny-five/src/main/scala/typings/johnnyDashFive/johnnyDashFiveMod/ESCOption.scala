package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ESCOption extends js.Object {
  var controller: js.UndefOr[String] = js.undefined
  var device: js.UndefOr[String] = js.undefined
  var neutral: js.UndefOr[Double] = js.undefined
  var pin: Double | String
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  var startAt: js.UndefOr[Double] = js.undefined
}

object ESCOption {
  @scala.inline
  def apply(
    pin: Double | String,
    controller: String = null,
    device: String = null,
    neutral: Int | Double = null,
    range: js.Array[Double] = null,
    startAt: Int | Double = null
  ): ESCOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (device != null) __obj.updateDynamic("device")(device)
    if (neutral != null) __obj.updateDynamic("neutral")(neutral.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESCOption]
  }
}


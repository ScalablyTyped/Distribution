package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SonarOption extends js.Object {
  var device: String
  var freq: js.UndefOr[Double] = js.undefined
  var pin: Double | String
  var threshold: js.UndefOr[Double] = js.undefined
}

object SonarOption {
  @scala.inline
  def apply(
    device: String,
    pin: Double | String,
    freq: js.UndefOr[Double] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined
  ): SonarOption = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any])
    if (!js.isUndefined(freq)) __obj.updateDynamic("freq")(freq.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SonarOption]
  }
}


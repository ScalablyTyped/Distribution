package typings.johnnyDashFive.johnnyDashFiveMod

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
  def apply(device: String, pin: Double | String, freq: Int | Double = null, threshold: Int | Double = null): SonarOption = {
    val __obj = js.Dynamic.literal(device = device, pin = pin.asInstanceOf[js.Any])
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SonarOption]
  }
}


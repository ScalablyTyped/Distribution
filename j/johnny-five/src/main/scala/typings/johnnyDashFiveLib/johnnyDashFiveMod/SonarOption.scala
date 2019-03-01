package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SonarOption extends js.Object {
  var device: java.lang.String
  var freq: js.UndefOr[scala.Double] = js.undefined
  var pin: scala.Double | java.lang.String
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object SonarOption {
  @scala.inline
  def apply(
    device: java.lang.String,
    pin: scala.Double | java.lang.String,
    freq: scala.Int | scala.Double = null,
    threshold: scala.Int | scala.Double = null
  ): SonarOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("device")(device)
    __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SonarOption]
  }
}


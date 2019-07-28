package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerMMA7361Option extends AccelerometerGeneralOption {
  var sleepPin: js.UndefOr[Double | String] = js.undefined
}

object AccelerometerMMA7361Option {
  @scala.inline
  def apply(controller: String = null, sleepPin: Double | String = null): AccelerometerMMA7361Option = {
    val __obj = js.Dynamic.literal()
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (sleepPin != null) __obj.updateDynamic("sleepPin")(sleepPin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerMMA7361Option]
  }
}


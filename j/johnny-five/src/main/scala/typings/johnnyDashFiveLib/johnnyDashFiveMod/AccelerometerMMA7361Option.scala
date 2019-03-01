package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerMMA7361Option extends AccelerometerGeneralOption {
  var sleepPin: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object AccelerometerMMA7361Option {
  @scala.inline
  def apply(controller: java.lang.String = null, sleepPin: scala.Double | java.lang.String = null): AccelerometerMMA7361Option = {
    val __obj = js.Dynamic.literal()
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (sleepPin != null) __obj.updateDynamic("sleepPin")(sleepPin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerMMA7361Option]
  }
}


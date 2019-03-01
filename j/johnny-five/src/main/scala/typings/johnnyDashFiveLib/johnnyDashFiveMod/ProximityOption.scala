package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProximityOption extends js.Object {
  var controller: java.lang.String
  var pin: scala.Double | java.lang.String
}

object ProximityOption {
  @scala.inline
  def apply(controller: java.lang.String, pin: scala.Double | java.lang.String): ProximityOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("controller")(controller)
    __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximityOption]
  }
}


package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProximityOption extends js.Object {
  var controller: String
  var pin: Double | String
}

object ProximityOption {
  @scala.inline
  def apply(controller: String, pin: Double | String): ProximityOption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProximityOption]
  }
}


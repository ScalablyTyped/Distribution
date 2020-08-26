package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProximityOption extends js.Object {
  var controller: String = js.native
  var pin: Double | String = js.native
}

object ProximityOption {
  @scala.inline
  def apply(controller: String, pin: Double | String): ProximityOption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximityOption]
  }
  @scala.inline
  implicit class ProximityOptionOps[Self <: ProximityOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def setPin(value: Double | String): Self = this.set("pin", value.asInstanceOf[js.Any])
  }
  
}


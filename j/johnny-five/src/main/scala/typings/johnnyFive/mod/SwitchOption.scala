package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.NC
import typings.johnnyFive.johnnyFiveStrings.NO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchOption extends js.Object {
  var pin: Double | String = js.native
  var `type`: js.UndefOr[NO | NC] = js.native
}

object SwitchOption {
  @scala.inline
  def apply(pin: Double | String): SwitchOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchOption]
  }
  @scala.inline
  implicit class SwitchOptionOps[Self <: SwitchOption] (val x: Self) extends AnyVal {
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
    def setPin(value: Double | String): Self = this.set("pin", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NO | NC): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonOption extends js.Object {
  
  var holdtime: js.UndefOr[Double] = js.native
  
  var invert: js.UndefOr[Boolean] = js.native
  
  var isPulldown: js.UndefOr[Boolean] = js.native
  
  var isPullup: js.UndefOr[Boolean] = js.native
  
  var pin: Double | String = js.native
}
object ButtonOption {
  
  @scala.inline
  def apply(pin: Double | String): ButtonOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOption]
  }
  
  @scala.inline
  implicit class ButtonOptionOps[Self <: ButtonOption] (val x: Self) extends AnyVal {
    
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
    def setHoldtime(value: Double): Self = this.set("holdtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoldtime: Self = this.set("holdtime", js.undefined)
    
    @scala.inline
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    
    @scala.inline
    def setIsPulldown(value: Boolean): Self = this.set("isPulldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPulldown: Self = this.set("isPulldown", js.undefined)
    
    @scala.inline
    def setIsPullup(value: Boolean): Self = this.set("isPullup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPullup: Self = this.set("isPullup", js.undefined)
  }
}

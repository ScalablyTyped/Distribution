package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PingOption extends js.Object {
  
  var freq: js.UndefOr[Double] = js.native
  
  var pin: Double | String = js.native
  
  var pulse: js.UndefOr[Double] = js.native
}
object PingOption {
  
  @scala.inline
  def apply(pin: Double | String): PingOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingOption]
  }
  
  @scala.inline
  implicit class PingOptionOps[Self <: PingOption] (val x: Self) extends AnyVal {
    
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
    def setFreq(value: Double): Self = this.set("freq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreq: Self = this.set("freq", js.undefined)
    
    @scala.inline
    def setPulse(value: Double): Self = this.set("pulse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePulse: Self = this.set("pulse", js.undefined)
  }
}

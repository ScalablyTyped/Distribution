package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.DEFAULT
import typings.johnnyFive.johnnyFiveStrings.FORWARD
import typings.johnnyFive.johnnyFiveStrings.FORWARD_REVERSE
import typings.johnnyFive.johnnyFiveStrings.FORWARD_REVERSE_BRAKE
import typings.johnnyFive.johnnyFiveStrings.PCA9685
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ESCOption extends js.Object {
  
  var address: js.UndefOr[String] = js.native
  
  var controller: js.UndefOr[PCA9685 | DEFAULT] = js.native
  
  var device: js.UndefOr[FORWARD | FORWARD_REVERSE | FORWARD_REVERSE_BRAKE] = js.native
  
  var neutral: js.UndefOr[Double] = js.native
  
  var pin: Double | String = js.native
  
  var pwmRange: js.UndefOr[js.Array[Double]] = js.native
}
object ESCOption {
  
  @scala.inline
  def apply(pin: Double | String): ESCOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESCOption]
  }
  
  @scala.inline
  implicit class ESCOptionOps[Self <: ESCOption] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setController(value: PCA9685 | DEFAULT): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setDevice(value: FORWARD | FORWARD_REVERSE | FORWARD_REVERSE_BRAKE): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setNeutral(value: Double): Self = this.set("neutral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutral: Self = this.set("neutral", js.undefined)
    
    @scala.inline
    def setPwmRangeVarargs(value: Double*): Self = this.set("pwmRange", js.Array(value :_*))
    
    @scala.inline
    def setPwmRange(value: js.Array[Double]): Self = this.set("pwmRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePwmRange: Self = this.set("pwmRange", js.undefined)
  }
}

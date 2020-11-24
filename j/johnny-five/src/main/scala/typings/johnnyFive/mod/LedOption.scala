package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedOption extends js.Object {
  
  var address: js.UndefOr[Double] = js.native
  
  var controller: js.UndefOr[String] = js.native
  
  var isAnode: js.UndefOr[Boolean] = js.native
  
  var pin: Double = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object LedOption {
  
  @scala.inline
  def apply(pin: Double): LedOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedOption]
  }
  
  @scala.inline
  implicit class LedOptionOps[Self <: LedOption] (val x: Self) extends AnyVal {
    
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
    def setPin(value: Double): Self = this.set("pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: Double): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setIsAnode(value: Boolean): Self = this.set("isAnode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAnode: Self = this.set("isAnode", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

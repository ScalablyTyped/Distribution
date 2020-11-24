package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AltimeterOption extends js.Object {
  
  var address: js.UndefOr[Double] = js.native
  
  var controller: String = js.native
  
  var elevation: js.UndefOr[Double] = js.native
  
  var freq: js.UndefOr[Double] = js.native
}
object AltimeterOption {
  
  @scala.inline
  def apply(controller: String): AltimeterOption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltimeterOption]
  }
  
  @scala.inline
  implicit class AltimeterOptionOps[Self <: AltimeterOption] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: Double): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setElevation(value: Double): Self = this.set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    
    @scala.inline
    def setFreq(value: Double): Self = this.set("freq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreq: Self = this.set("freq", js.undefined)
  }
}

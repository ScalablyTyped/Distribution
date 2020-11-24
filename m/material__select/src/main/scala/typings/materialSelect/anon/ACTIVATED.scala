package typings.materialSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ACTIVATED extends js.Object {
  
  var ACTIVATED: String = js.native
  
  var DISABLED: String = js.native
  
  var FOCUSED: String = js.native
  
  var INVALID: String = js.native
  
  var MENU_INVALID: String = js.native
  
  var OUTLINED: String = js.native
  
  var REQUIRED: String = js.native
  
  var ROOT: String = js.native
  
  var WITH_LEADING_ICON: String = js.native
}
object ACTIVATED {
  
  @scala.inline
  def apply(
    ACTIVATED: String,
    DISABLED: String,
    FOCUSED: String,
    INVALID: String,
    MENU_INVALID: String,
    OUTLINED: String,
    REQUIRED: String,
    ROOT: String,
    WITH_LEADING_ICON: String
  ): ACTIVATED = {
    val __obj = js.Dynamic.literal(ACTIVATED = ACTIVATED.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any], FOCUSED = FOCUSED.asInstanceOf[js.Any], INVALID = INVALID.asInstanceOf[js.Any], MENU_INVALID = MENU_INVALID.asInstanceOf[js.Any], OUTLINED = OUTLINED.asInstanceOf[js.Any], REQUIRED = REQUIRED.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], WITH_LEADING_ICON = WITH_LEADING_ICON.asInstanceOf[js.Any])
    __obj.asInstanceOf[ACTIVATED]
  }
  
  @scala.inline
  implicit class ACTIVATEDOps[Self <: ACTIVATED] (val x: Self) extends AnyVal {
    
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
    def setACTIVATED(value: String): Self = this.set("ACTIVATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDISABLED(value: String): Self = this.set("DISABLED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFOCUSED(value: String): Self = this.set("FOCUSED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINVALID(value: String): Self = this.set("INVALID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMENU_INVALID(value: String): Self = this.set("MENU_INVALID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOUTLINED(value: String): Self = this.set("OUTLINED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREQUIRED(value: String): Self = this.set("REQUIRED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROOT(value: String): Self = this.set("ROOT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWITH_LEADING_ICON(value: String): Self = this.set("WITH_LEADING_ICON", value.asInstanceOf[js.Any])
  }
}

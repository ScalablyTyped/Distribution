package typings.materialTextfield.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DISABLED extends js.Object {
  
  var DISABLED: String = js.native
  
  var FOCUSED: String = js.native
  
  var HELPER_LINE: String = js.native
  
  var INVALID: String = js.native
  
  var LABEL_FLOATING: String = js.native
  
  var NO_LABEL: String = js.native
  
  var OUTLINED: String = js.native
  
  var ROOT: String = js.native
  
  var TEXTAREA: String = js.native
  
  var WITH_LEADING_ICON: String = js.native
  
  var WITH_TRAILING_ICON: String = js.native
}
object DISABLED {
  
  @scala.inline
  def apply(
    DISABLED: String,
    FOCUSED: String,
    HELPER_LINE: String,
    INVALID: String,
    LABEL_FLOATING: String,
    NO_LABEL: String,
    OUTLINED: String,
    ROOT: String,
    TEXTAREA: String,
    WITH_LEADING_ICON: String,
    WITH_TRAILING_ICON: String
  ): DISABLED = {
    val __obj = js.Dynamic.literal(DISABLED = DISABLED.asInstanceOf[js.Any], FOCUSED = FOCUSED.asInstanceOf[js.Any], HELPER_LINE = HELPER_LINE.asInstanceOf[js.Any], INVALID = INVALID.asInstanceOf[js.Any], LABEL_FLOATING = LABEL_FLOATING.asInstanceOf[js.Any], NO_LABEL = NO_LABEL.asInstanceOf[js.Any], OUTLINED = OUTLINED.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], TEXTAREA = TEXTAREA.asInstanceOf[js.Any], WITH_LEADING_ICON = WITH_LEADING_ICON.asInstanceOf[js.Any], WITH_TRAILING_ICON = WITH_TRAILING_ICON.asInstanceOf[js.Any])
    __obj.asInstanceOf[DISABLED]
  }
  
  @scala.inline
  implicit class DISABLEDOps[Self <: DISABLED] (val x: Self) extends AnyVal {
    
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
    def setDISABLED(value: String): Self = this.set("DISABLED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFOCUSED(value: String): Self = this.set("FOCUSED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHELPER_LINE(value: String): Self = this.set("HELPER_LINE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINVALID(value: String): Self = this.set("INVALID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLABEL_FLOATING(value: String): Self = this.set("LABEL_FLOATING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO_LABEL(value: String): Self = this.set("NO_LABEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOUTLINED(value: String): Self = this.set("OUTLINED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROOT(value: String): Self = this.set("ROOT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEXTAREA(value: String): Self = this.set("TEXTAREA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWITH_LEADING_ICON(value: String): Self = this.set("WITH_LEADING_ICON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWITH_TRAILING_ICON(value: String): Self = this.set("WITH_TRAILING_ICON", value.asInstanceOf[js.Any])
  }
}

package typings.materialCheckbox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARIACHECKEDATTR extends js.Object {
  
  var ARIA_CHECKED_ATTR: String = js.native
  
  var ARIA_CHECKED_INDETERMINATE_VALUE: String = js.native
  
  var DATA_INDETERMINATE_ATTR: String = js.native
  
  var NATIVE_CONTROL_SELECTOR: String = js.native
  
  var TRANSITION_STATE_CHECKED: String = js.native
  
  var TRANSITION_STATE_INDETERMINATE: String = js.native
  
  var TRANSITION_STATE_INIT: String = js.native
  
  var TRANSITION_STATE_UNCHECKED: String = js.native
}
object ARIACHECKEDATTR {
  
  @scala.inline
  def apply(
    ARIA_CHECKED_ATTR: String,
    ARIA_CHECKED_INDETERMINATE_VALUE: String,
    DATA_INDETERMINATE_ATTR: String,
    NATIVE_CONTROL_SELECTOR: String,
    TRANSITION_STATE_CHECKED: String,
    TRANSITION_STATE_INDETERMINATE: String,
    TRANSITION_STATE_INIT: String,
    TRANSITION_STATE_UNCHECKED: String
  ): ARIACHECKEDATTR = {
    val __obj = js.Dynamic.literal(ARIA_CHECKED_ATTR = ARIA_CHECKED_ATTR.asInstanceOf[js.Any], ARIA_CHECKED_INDETERMINATE_VALUE = ARIA_CHECKED_INDETERMINATE_VALUE.asInstanceOf[js.Any], DATA_INDETERMINATE_ATTR = DATA_INDETERMINATE_ATTR.asInstanceOf[js.Any], NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any], TRANSITION_STATE_CHECKED = TRANSITION_STATE_CHECKED.asInstanceOf[js.Any], TRANSITION_STATE_INDETERMINATE = TRANSITION_STATE_INDETERMINATE.asInstanceOf[js.Any], TRANSITION_STATE_INIT = TRANSITION_STATE_INIT.asInstanceOf[js.Any], TRANSITION_STATE_UNCHECKED = TRANSITION_STATE_UNCHECKED.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIACHECKEDATTR]
  }
  
  @scala.inline
  implicit class ARIACHECKEDATTROps[Self <: ARIACHECKEDATTR] (val x: Self) extends AnyVal {
    
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
    def setARIA_CHECKED_ATTR(value: String): Self = this.set("ARIA_CHECKED_ATTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARIA_CHECKED_INDETERMINATE_VALUE(value: String): Self = this.set("ARIA_CHECKED_INDETERMINATE_VALUE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDATA_INDETERMINATE_ATTR(value: String): Self = this.set("DATA_INDETERMINATE_ATTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNATIVE_CONTROL_SELECTOR(value: String): Self = this.set("NATIVE_CONTROL_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRANSITION_STATE_CHECKED(value: String): Self = this.set("TRANSITION_STATE_CHECKED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRANSITION_STATE_INDETERMINATE(value: String): Self = this.set("TRANSITION_STATE_INDETERMINATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRANSITION_STATE_INIT(value: String): Self = this.set("TRANSITION_STATE_INIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRANSITION_STATE_UNCHECKED(value: String): Self = this.set("TRANSITION_STATE_UNCHECKED", value.asInstanceOf[js.Any])
  }
}

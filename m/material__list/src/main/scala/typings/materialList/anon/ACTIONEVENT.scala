package typings.materialList.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ACTIONEVENT extends js.Object {
  
  var ACTION_EVENT: String = js.native
  
  var ARIA_CHECKED: String = js.native
  
  var ARIA_CHECKED_CHECKBOX_SELECTOR: String = js.native
  
  var ARIA_CHECKED_RADIO_SELECTOR: String = js.native
  
  var ARIA_CURRENT: String = js.native
  
  var ARIA_DISABLED: String = js.native
  
  var ARIA_ORIENTATION: String = js.native
  
  var ARIA_ORIENTATION_HORIZONTAL: String = js.native
  
  var ARIA_ROLE_CHECKBOX_SELECTOR: String = js.native
  
  var ARIA_SELECTED: String = js.native
  
  var CHECKBOX_RADIO_SELECTOR: String = js.native
  
  var CHECKBOX_SELECTOR: String = js.native
  
  var CHILD_ELEMENTS_TO_TOGGLE_TABINDEX: String = js.native
  
  var FOCUSABLE_CHILD_ELEMENTS: String = js.native
  
  var RADIO_SELECTOR: String = js.native
}
object ACTIONEVENT {
  
  @scala.inline
  def apply(
    ACTION_EVENT: String,
    ARIA_CHECKED: String,
    ARIA_CHECKED_CHECKBOX_SELECTOR: String,
    ARIA_CHECKED_RADIO_SELECTOR: String,
    ARIA_CURRENT: String,
    ARIA_DISABLED: String,
    ARIA_ORIENTATION: String,
    ARIA_ORIENTATION_HORIZONTAL: String,
    ARIA_ROLE_CHECKBOX_SELECTOR: String,
    ARIA_SELECTED: String,
    CHECKBOX_RADIO_SELECTOR: String,
    CHECKBOX_SELECTOR: String,
    CHILD_ELEMENTS_TO_TOGGLE_TABINDEX: String,
    FOCUSABLE_CHILD_ELEMENTS: String,
    RADIO_SELECTOR: String
  ): ACTIONEVENT = {
    val __obj = js.Dynamic.literal(ACTION_EVENT = ACTION_EVENT.asInstanceOf[js.Any], ARIA_CHECKED = ARIA_CHECKED.asInstanceOf[js.Any], ARIA_CHECKED_CHECKBOX_SELECTOR = ARIA_CHECKED_CHECKBOX_SELECTOR.asInstanceOf[js.Any], ARIA_CHECKED_RADIO_SELECTOR = ARIA_CHECKED_RADIO_SELECTOR.asInstanceOf[js.Any], ARIA_CURRENT = ARIA_CURRENT.asInstanceOf[js.Any], ARIA_DISABLED = ARIA_DISABLED.asInstanceOf[js.Any], ARIA_ORIENTATION = ARIA_ORIENTATION.asInstanceOf[js.Any], ARIA_ORIENTATION_HORIZONTAL = ARIA_ORIENTATION_HORIZONTAL.asInstanceOf[js.Any], ARIA_ROLE_CHECKBOX_SELECTOR = ARIA_ROLE_CHECKBOX_SELECTOR.asInstanceOf[js.Any], ARIA_SELECTED = ARIA_SELECTED.asInstanceOf[js.Any], CHECKBOX_RADIO_SELECTOR = CHECKBOX_RADIO_SELECTOR.asInstanceOf[js.Any], CHECKBOX_SELECTOR = CHECKBOX_SELECTOR.asInstanceOf[js.Any], CHILD_ELEMENTS_TO_TOGGLE_TABINDEX = CHILD_ELEMENTS_TO_TOGGLE_TABINDEX.asInstanceOf[js.Any], FOCUSABLE_CHILD_ELEMENTS = FOCUSABLE_CHILD_ELEMENTS.asInstanceOf[js.Any], RADIO_SELECTOR = RADIO_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ACTIONEVENT]
  }
  
  @scala.inline
  implicit class ACTIONEVENTOps[Self <: ACTIONEVENT] (val x: Self) extends AnyVal {
    
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
    def setACTION_EVENT(value: String): Self = this.set("ACTION_EVENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARIA_CHECKED(value: String): Self = this.set("ARIA_CHECKED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARIA_CHECKED_CHECKBOX_SELECTOR(value: String): Self = this.set("ARIA_CHECKED_CHECKBOX_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARIA_CHECKED_RADIO_SELECTOR(value: String): Self = this.set("ARIA_CHECKED_RADIO_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARIA_CURRENT(value: String): Self = this.set("ARIA_CURRENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARIA_DISABLED(value: String): Self = this.set("ARIA_DISABLED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARIA_ORIENTATION(value: String): Self = this.set("ARIA_ORIENTATION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARIA_ORIENTATION_HORIZONTAL(value: String): Self = this.set("ARIA_ORIENTATION_HORIZONTAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARIA_ROLE_CHECKBOX_SELECTOR(value: String): Self = this.set("ARIA_ROLE_CHECKBOX_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARIA_SELECTED(value: String): Self = this.set("ARIA_SELECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCHECKBOX_RADIO_SELECTOR(value: String): Self = this.set("CHECKBOX_RADIO_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCHECKBOX_SELECTOR(value: String): Self = this.set("CHECKBOX_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCHILD_ELEMENTS_TO_TOGGLE_TABINDEX(value: String): Self = this.set("CHILD_ELEMENTS_TO_TOGGLE_TABINDEX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFOCUSABLE_CHILD_ELEMENTS(value: String): Self = this.set("FOCUSABLE_CHILD_ELEMENTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRADIO_SELECTOR(value: String): Self = this.set("RADIO_SELECTOR", value.asInstanceOf[js.Any])
  }
}

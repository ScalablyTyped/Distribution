package typings.materialTextfield.anon

import typings.materialTextfield.foundationMod.MDCTextFieldCharacterCounterFoundation
import typings.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation
import typings.materialTextfield.iconFoundationMod.MDCTextFieldIconFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/textfield.@material/textfield/types.MDCTextFieldFoundationMap> */
@js.native
trait PartialMDCTextFieldFounda extends js.Object {
  
  var characterCounter: js.UndefOr[MDCTextFieldCharacterCounterFoundation] = js.native
  
  var helperText: js.UndefOr[MDCTextFieldHelperTextFoundation] = js.native
  
  var leadingIcon: js.UndefOr[MDCTextFieldIconFoundation] = js.native
  
  var trailingIcon: js.UndefOr[MDCTextFieldIconFoundation] = js.native
}
object PartialMDCTextFieldFounda {
  
  @scala.inline
  def apply(): PartialMDCTextFieldFounda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTextFieldFounda]
  }
  
  @scala.inline
  implicit class PartialMDCTextFieldFoundaOps[Self <: PartialMDCTextFieldFounda] (val x: Self) extends AnyVal {
    
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
    def setCharacterCounter(value: MDCTextFieldCharacterCounterFoundation): Self = this.set("characterCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacterCounter: Self = this.set("characterCounter", js.undefined)
    
    @scala.inline
    def setHelperText(value: MDCTextFieldHelperTextFoundation): Self = this.set("helperText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelperText: Self = this.set("helperText", js.undefined)
    
    @scala.inline
    def setLeadingIcon(value: MDCTextFieldIconFoundation): Self = this.set("leadingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadingIcon: Self = this.set("leadingIcon", js.undefined)
    
    @scala.inline
    def setTrailingIcon(value: MDCTextFieldIconFoundation): Self = this.set("trailingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailingIcon: Self = this.set("trailingIcon", js.undefined)
  }
}

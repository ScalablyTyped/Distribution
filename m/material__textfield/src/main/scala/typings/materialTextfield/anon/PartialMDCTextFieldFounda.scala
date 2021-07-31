package typings.materialTextfield.anon

import typings.materialTextfield.foundationMod.MDCTextFieldCharacterCounterFoundation
import typings.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation
import typings.materialTextfield.iconFoundationMod.MDCTextFieldIconFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/textfield.@material/textfield/types.MDCTextFieldFoundationMap> */
trait PartialMDCTextFieldFounda extends StObject {
  
  var characterCounter: js.UndefOr[MDCTextFieldCharacterCounterFoundation] = js.undefined
  
  var helperText: js.UndefOr[MDCTextFieldHelperTextFoundation] = js.undefined
  
  var leadingIcon: js.UndefOr[MDCTextFieldIconFoundation] = js.undefined
  
  var trailingIcon: js.UndefOr[MDCTextFieldIconFoundation] = js.undefined
}
object PartialMDCTextFieldFounda {
  
  @scala.inline
  def apply(): PartialMDCTextFieldFounda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTextFieldFounda]
  }
  
  @scala.inline
  implicit class PartialMDCTextFieldFoundaMutableBuilder[Self <: PartialMDCTextFieldFounda] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacterCounter(value: MDCTextFieldCharacterCounterFoundation): Self = StObject.set(x, "characterCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterCounterUndefined: Self = StObject.set(x, "characterCounter", js.undefined)
    
    @scala.inline
    def setHelperText(value: MDCTextFieldHelperTextFoundation): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    @scala.inline
    def setLeadingIcon(value: MDCTextFieldIconFoundation): Self = StObject.set(x, "leadingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingIconUndefined: Self = StObject.set(x, "leadingIcon", js.undefined)
    
    @scala.inline
    def setTrailingIcon(value: MDCTextFieldIconFoundation): Self = StObject.set(x, "trailingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingIconUndefined: Self = StObject.set(x, "trailingIcon", js.undefined)
  }
}

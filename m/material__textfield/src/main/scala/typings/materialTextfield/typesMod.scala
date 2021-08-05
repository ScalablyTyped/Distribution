package typings.materialTextfield

import typings.materialTextfield.anon.PickValidityStatebadInput
import typings.materialTextfield.foundationMod.MDCTextFieldCharacterCounterFoundation
import typings.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation
import typings.materialTextfield.iconFoundationMod.MDCTextFieldIconFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait MDCTextFieldFoundationMap extends StObject {
    
    var characterCounter: MDCTextFieldCharacterCounterFoundation
    
    var helperText: MDCTextFieldHelperTextFoundation
    
    var leadingIcon: MDCTextFieldIconFoundation
    
    var trailingIcon: MDCTextFieldIconFoundation
  }
  object MDCTextFieldFoundationMap {
    
    inline def apply(
      characterCounter: MDCTextFieldCharacterCounterFoundation,
      helperText: MDCTextFieldHelperTextFoundation,
      leadingIcon: MDCTextFieldIconFoundation,
      trailingIcon: MDCTextFieldIconFoundation
    ): MDCTextFieldFoundationMap = {
      val __obj = js.Dynamic.literal(characterCounter = characterCounter.asInstanceOf[js.Any], helperText = helperText.asInstanceOf[js.Any], leadingIcon = leadingIcon.asInstanceOf[js.Any], trailingIcon = trailingIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTextFieldFoundationMap]
    }
    
    extension [Self <: MDCTextFieldFoundationMap](x: Self) {
      
      inline def setCharacterCounter(value: MDCTextFieldCharacterCounterFoundation): Self = StObject.set(x, "characterCounter", value.asInstanceOf[js.Any])
      
      inline def setHelperText(value: MDCTextFieldHelperTextFoundation): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      inline def setLeadingIcon(value: MDCTextFieldIconFoundation): Self = StObject.set(x, "leadingIcon", value.asInstanceOf[js.Any])
      
      inline def setTrailingIcon(value: MDCTextFieldIconFoundation): Self = StObject.set(x, "trailingIcon", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<std.HTMLInputElement, 'disabled' | 'maxLength' | 'type' | 'value' | 'required'> & {  validity :std.Pick<std.ValidityState, 'badInput' | 'valid'>} */
  trait MDCTextFieldNativeInputElement extends StObject {
    
    var disabled: Boolean
    
    var maxLength: Double
    
    var required: Boolean
    
    var `type`: String
    
    var validity: PickValidityStatebadInput
    
    var value: String
  }
  object MDCTextFieldNativeInputElement {
    
    inline def apply(
      disabled: Boolean,
      maxLength: Double,
      required: Boolean,
      `type`: String,
      validity: PickValidityStatebadInput,
      value: String
    ): MDCTextFieldNativeInputElement = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTextFieldNativeInputElement]
    }
    
    extension [Self <: MDCTextFieldNativeInputElement](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidity(value: PickValidityStatebadInput): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

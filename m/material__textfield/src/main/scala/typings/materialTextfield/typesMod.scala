package typings.materialTextfield

import typings.materialTextfield.anon.PickValidityStatebadInput
import typings.materialTextfield.foundationMod.MDCTextFieldCharacterCounterFoundation
import typings.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation
import typings.materialTextfield.iconFoundationMod.MDCTextFieldIconFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCTextFieldFoundationMap extends StObject {
    
    var characterCounter: MDCTextFieldCharacterCounterFoundation = js.native
    
    var helperText: MDCTextFieldHelperTextFoundation = js.native
    
    var leadingIcon: MDCTextFieldIconFoundation = js.native
    
    var trailingIcon: MDCTextFieldIconFoundation = js.native
  }
  object MDCTextFieldFoundationMap {
    
    @scala.inline
    def apply(
      characterCounter: MDCTextFieldCharacterCounterFoundation,
      helperText: MDCTextFieldHelperTextFoundation,
      leadingIcon: MDCTextFieldIconFoundation,
      trailingIcon: MDCTextFieldIconFoundation
    ): MDCTextFieldFoundationMap = {
      val __obj = js.Dynamic.literal(characterCounter = characterCounter.asInstanceOf[js.Any], helperText = helperText.asInstanceOf[js.Any], leadingIcon = leadingIcon.asInstanceOf[js.Any], trailingIcon = trailingIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTextFieldFoundationMap]
    }
    
    @scala.inline
    implicit class MDCTextFieldFoundationMapMutableBuilder[Self <: MDCTextFieldFoundationMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacterCounter(value: MDCTextFieldCharacterCounterFoundation): Self = StObject.set(x, "characterCounter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperText(value: MDCTextFieldHelperTextFoundation): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIcon(value: MDCTextFieldIconFoundation): Self = StObject.set(x, "leadingIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingIcon(value: MDCTextFieldIconFoundation): Self = StObject.set(x, "trailingIcon", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<std.HTMLInputElement, 'disabled' | 'maxLength' | 'type' | 'value' | 'required'> & {  validity :std.Pick<std.ValidityState, 'badInput' | 'valid'>} */
  @js.native
  trait MDCTextFieldNativeInputElement extends StObject {
    
    var disabled: Boolean = js.native
    
    var maxLength: Double = js.native
    
    var required: Boolean = js.native
    
    var `type`: String = js.native
    
    var validity: PickValidityStatebadInput = js.native
    
    var value: String = js.native
  }
  object MDCTextFieldNativeInputElement {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class MDCTextFieldNativeInputElementMutableBuilder[Self <: MDCTextFieldNativeInputElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidity(value: PickValidityStatebadInput): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

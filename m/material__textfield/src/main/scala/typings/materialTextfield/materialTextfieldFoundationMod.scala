package typings.materialTextfield

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTextfield.adapterMod.MDCTextFieldAdapter
import typings.materialTextfield.anon.ARIACONTROLS
import typings.materialTextfield.anon.DISABLED
import typings.materialTextfield.anon.LABELSCALE
import typings.materialTextfield.anon.PartialMDCTextFieldAdapte
import typings.materialTextfield.anon.PartialMDCTextFieldFounda
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/textfield/foundation", JSImport.Namespace)
@js.native
object materialTextfieldFoundationMod extends js.Object {
  
  @js.native
  /**
    * @param adapter
    * @param foundationMap Map from subcomponent names to their subfoundations.
    */
  class MDCTextFieldFoundation () extends MDCFoundation[MDCTextFieldAdapter] {
    def this(adapter: PartialMDCTextFieldAdapte) = this()
    def this(adapter: js.UndefOr[scala.Nothing], foundationMap: PartialMDCTextFieldFounda) = this()
    def this(adapter: PartialMDCTextFieldAdapte, foundationMap: PartialMDCTextFieldFounda) = this()
    
    /**
      * Activates the text field focus state.
      */
    def activateFocus(): Unit = js.native
    
    /**
      * Activates the Text Field's focus state in cases when the input value
      * changes without user input (e.g. programmatically).
      */
    def autoCompleteFocus(): Unit = js.native
    
    /**
      * Deactivates the Text Field's focus state.
      */
    def deactivateFocus(): Unit = js.native
    
    /**
      * @return Whether or not validity should be updated on value change. `true`
      *     by default.
      */
    def getValidateOnValueChange(): Boolean = js.native
    
    def getValue(): String = js.native
    
    /**
      * Handles input change of text input and text area.
      */
    def handleInput(): Unit = js.native
    
    /**
      * Handles user interactions with the Text Field.
      */
    def handleTextFieldInteraction(): Unit = js.native
    
    /**
      * Handles validation attribute changes
      */
    def handleValidationAttributeChange(attributesList: js.Array[String]): Unit = js.native
    
    def isDisabled(): Boolean = js.native
    
    /**
      * @return The custom validity state, if set; otherwise, the result of a
      *     native validity check.
      */
    def isValid(): Boolean = js.native
    
    /**
      * Opens/closes the notched outline.
      */
    def notchOutline(openNotch: Boolean): Unit = js.native
    
    /**
      * @param disabled Sets the text-field disabled or enabled.
      */
    def setDisabled(disabled: Boolean): Unit = js.native
    
    /**
      * @param content Sets the content of the helper text.
      */
    def setHelperTextContent(content: String): Unit = js.native
    
    /**
      * Sets the aria label of the leading icon.
      */
    def setLeadingIconAriaLabel(label: String): Unit = js.native
    
    /**
      * Sets the text content of the leading icon.
      */
    def setLeadingIconContent(content: String): Unit = js.native
    
    /**
      * Sets the aria label of the trailing icon.
      */
    def setTrailingIconAriaLabel(label: String): Unit = js.native
    
    /**
      * Sets the text content of the trailing icon.
      */
    def setTrailingIconContent(content: String): Unit = js.native
    
    def setTransformOrigin(evt: MouseEvent): Unit = js.native
    /**
      * Sets the line ripple's transform origin, so that the line ripple activate
      * animation will animate out from the user's click location.
      */
    def setTransformOrigin(evt: TouchEvent): Unit = js.native
    
    /**
      * Enables or disables the use of native validation. Use this for custom
      * validation.
      * @param useNativeValidation Set this to false to ignore native input
      *     validation.
      */
    def setUseNativeValidation(useNativeValidation: Boolean): Unit = js.native
    
    /**
      * @param isValid Sets the custom validity state of the Text Field.
      */
    def setValid(isValid: Boolean): Unit = js.native
    
    /**
      * @param shouldValidate Whether or not validity should be updated on
      *     value change.
      */
    def setValidateOnValueChange(shouldValidate: Boolean): Unit = js.native
    
    /**
      * @param value The value to set on the input Element.
      */
    def setValue(value: String): Unit = js.native
    
    def shouldFloat: Boolean = js.native
    
    def shouldShake: Boolean = js.native
  }
  /* static members */
  @js.native
  object MDCTextFieldFoundation extends js.Object {
    
    def cssClasses: DISABLED = js.native
    
    /**
      * See {@link MDCTextFieldAdapter} for typing information on parameters and
      * return types.
      */
    def defaultAdapter: MDCTextFieldAdapter = js.native
    
    def numbers: LABELSCALE = js.native
    
    def strings: ARIACONTROLS = js.native
  }
  
  @js.native
  /**
    * @param adapter
    * @param foundationMap Map from subcomponent names to their subfoundations.
    */
  class default () extends MDCTextFieldFoundation {
    def this(adapter: PartialMDCTextFieldAdapte) = this()
    def this(adapter: js.UndefOr[scala.Nothing], foundationMap: PartialMDCTextFieldFounda) = this()
    def this(adapter: PartialMDCTextFieldAdapte, foundationMap: PartialMDCTextFieldFounda) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: DISABLED = js.native
    
    /**
      * See {@link MDCTextFieldAdapter} for typing information on parameters and
      * return types.
      */
    def defaultAdapter: MDCTextFieldAdapter = js.native
    
    def numbers: LABELSCALE = js.native
    
    def strings: ARIACONTROLS = js.native
  }
}

package typings.materialTextfield

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTextfield.anon.PartialMDCTextFieldHelper
import typings.materialTextfield.helperTextAdapterMod.MDCTextFieldHelperTextAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTextFoundationMod {
  
  @JSImport("@material/textfield/helper-text/foundation", JSImport.Default)
  @js.native
  class default () extends MDCTextFieldHelperTextFoundation {
    def this(adapter: PartialMDCTextFieldHelper) = this()
  }
  
  @JSImport("@material/textfield/helper-text/foundation", "MDCTextFieldHelperTextFoundation")
  @js.native
  class MDCTextFieldHelperTextFoundation () extends MDCFoundation[MDCTextFieldHelperTextAdapter] {
    def this(adapter: PartialMDCTextFieldHelper) = this()
    
    def getId(): String | Null = js.native
    
    def isPersistent(): Boolean = js.native
    
    /**
      * @return whether the helper text acts as an error validation message.
      */
    def isValidation(): Boolean = js.native
    
    def isVisible(): Boolean = js.native
    
    /**
      * Sets the content of the helper text field.
      */
    def setContent(content: String): Unit = js.native
    
    /**
      * @param isPersistent Sets the persistency of the helper text.
      */
    def setPersistent(isPersistent: Boolean): Unit = js.native
    
    /**
      * @param isValidation True to make the helper text act as an error validation message.
      */
    def setValidation(isValidation: Boolean): Unit = js.native
    
    /**
      * Sets the validity of the helper text based on the input validity.
      */
    def setValidity(inputIsValid: Boolean): Unit = js.native
    
    /**
      * Makes the helper text visible to the screen reader.
      */
    def showToScreenReader(): Unit = js.native
  }
}

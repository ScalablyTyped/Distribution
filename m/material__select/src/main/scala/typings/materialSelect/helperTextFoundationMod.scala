package typings.materialSelect

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialSelect.anon.PartialMDCSelectHelperTex
import typings.materialSelect.helperTextAdapterMod.MDCSelectHelperTextAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTextFoundationMod {
  
  @JSImport("@material/select/helper-text/foundation", JSImport.Default)
  @js.native
  class default () extends MDCSelectHelperTextFoundation {
    def this(adapter: PartialMDCSelectHelperTex) = this()
  }
  
  @JSImport("@material/select/helper-text/foundation", "MDCSelectHelperTextFoundation")
  @js.native
  class MDCSelectHelperTextFoundation () extends MDCFoundation[MDCSelectHelperTextAdapter] {
    def this(adapter: PartialMDCSelectHelperTex) = this()
    
    /**
      * @return The ID of the helper text, or null if none is set.
      */
    def getId(): String | Null = js.native
    
    /**
      * @return Whether the helper text is currently visible.
      */
    def isVisible(): Boolean = js.native
    
    /**
      * Sets the content of the helper text field.
      */
    def setContent(content: String): Unit = js.native
    
    /**
      * Sets the helper text to act as a validation message.
      * By default, validation messages are hidden when the select is valid and
      * visible when the select is invalid.
      *
      * @param isValidation True to make the helper text act as an error validation
      *     message.
      */
    def setValidation(isValidation: Boolean): Unit = js.native
    
    /**
      * Sets the persistency of the validation helper text.
      * This keeps the validation message visible even if the select is valid,
      * though it will be displayed in the normal (grey) color.
      */
    def setValidationMsgPersistent(isPersistent: Boolean): Unit = js.native
    
    /**
      * When acting as a validation message, shows/hides the helper text and
      * triggers alerts as necessary based on the select's validity.
      */
    def setValidity(selectIsValid: Boolean): Unit = js.native
  }
}

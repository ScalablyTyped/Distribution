package typings.atMaterialTextfield

import typings.atMaterialTextfield.helperDashTextAdapterMod.MDCTextFieldHelperTextAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/helper-text/foundation", JSImport.Namespace)
@js.native
object helperDashTextFoundationMod extends js.Object {
  @js.native
  trait MDCTextFieldHelperTextFoundation
    extends typings.atMaterialBase.foundationMod.default[MDCTextFieldHelperTextAdapter] {
    def setContent(content: String): Unit = js.native
    /** @param isPersistent Sets the persistency of the helper text. */
    def setPersistent(isPersistent: Boolean): Unit = js.native
    /**
      * @param isValidation True to make the helper text act as an
      *   error validation message.
      */
    def setValidation(isValidation: Boolean): Unit = js.native
    /**
      * Sets the validity of the helper text based on the input validity.
      */
    def setValidity(inputIsValid: Boolean): Unit = js.native
    /** Makes the helper text visible to the screen reader. */
    def showToScreenReader(): Unit = js.native
  }
  
  @js.native
  class default () extends MDCTextFieldHelperTextFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.atMaterialTextfield.helperDashTextConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTextFieldHelperTextAdapter = js.native
    val strings: typings.atMaterialTextfield.helperDashTextConstantsMod.strings = js.native
  }
  
}


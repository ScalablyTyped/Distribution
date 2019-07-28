package typings.atMaterialTextfield.helperDashTextFoundationMod

import typings.atMaterialTextfield.helperDashTextAdapterMod.MDCTextFieldHelperTextAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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


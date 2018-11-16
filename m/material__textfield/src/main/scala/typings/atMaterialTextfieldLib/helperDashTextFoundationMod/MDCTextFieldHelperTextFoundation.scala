package typings
package atMaterialTextfieldLib.helperDashTextFoundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTextFieldHelperTextFoundation
  extends atMaterialBaseLib.foundationMod.default[atMaterialTextfieldLib.helperDashTextAdapterMod.MDCTextFieldHelperTextAdapter] {
  def setContent(content: java.lang.String): scala.Unit = js.native
  /** @param isPersistent Sets the persistency of the helper text. */
  def setPersistent(isPersistent: scala.Boolean): scala.Unit = js.native
  /**
       * @param isValidation True to make the helper text act as an
       *   error validation message.
       */
  def setValidation(isValidation: scala.Boolean): scala.Unit = js.native
  /**
       * Sets the validity of the helper text based on the input validity.
       */
  def setValidity(inputIsValid: scala.Boolean): scala.Unit = js.native
  /** Makes the helper text visible to the screen reader. */
  def showToScreenReader(): scala.Unit = js.native
}


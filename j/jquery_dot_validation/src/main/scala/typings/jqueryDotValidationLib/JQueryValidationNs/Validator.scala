package typings
package jqueryDotValidationLib.JQueryValidationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator extends js.Object {
  var errorList: js.Array[ErrorListItem] = js.native
  var errorMap: ErrorDictionary = js.native
  var settings: ValidationOptions = js.native
  def checkForm(): scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def element(element: java.lang.String): scala.Boolean = js.native
  def element(element: jqueryDotValidationLib.JQuery): scala.Boolean = js.native
  def elementValue(element: stdLib.Element): js.Any = js.native
  def focusInvalid(): scala.Unit = js.native
  /**
    * Validates the form, returns true if it is valid, false otherwise.
    */
  def form(): scala.Boolean = js.native
  def hideErrors(): scala.Unit = js.native
  def invalidElements(): js.Array[stdLib.HTMLElement] = js.native
  /**
    * Returns the number of invalid fields.
    */
  def numberOfInvalids(): scala.Double = js.native
  /**
    * Resets the controlled form.
    */
  def resetForm(): scala.Unit = js.native
  /**
    * Show the specified messages.
    *
    * @param errors One or more key/value pairs of input names and messages.
    */
  def showErrors(errors: js.Any): scala.Unit = js.native
  def size(): scala.Double = js.native
  def valid(): scala.Boolean = js.native
  def validElements(): js.Array[stdLib.HTMLElement] = js.native
}


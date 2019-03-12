package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscribableFunctions[T] extends js.Object {
  @JSName("error")
  var error_Original: knockoutLib.KnockoutComputed[java.lang.String] = js.native
  @JSName("isModified")
  var isModified_Original: knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  @JSName("isValid")
  var isValid_Original: knockoutLib.KnockoutComputed[scala.Boolean] = js.native
  @JSName("isValidating")
  var isValidating_Original: knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  @JSName("rules")
  var rules_Original: knockoutLib.KnockoutObservableArray[KnockoutValidationRule] = js.native
  def clearError(): scala.Unit = js.native
  def error(): java.lang.String = js.native
  def error(value: java.lang.String): scala.Unit = js.native
  def isModified(): scala.Boolean = js.native
  def isModified(value: scala.Boolean): scala.Unit = js.native
  def isValid(): scala.Boolean = js.native
  def isValid(value: scala.Boolean): scala.Unit = js.native
  def isValidating(): scala.Boolean = js.native
  def isValidating(value: scala.Boolean): scala.Unit = js.native
  def rules(): js.Array[KnockoutValidationRule] = js.native
  def rules(value: js.Array[KnockoutValidationRule]): scala.Unit = js.native
  def setError(error: java.lang.String): scala.Unit = js.native
}


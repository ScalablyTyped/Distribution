package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscribableFunctions[T] extends js.Object {
  var error: knockoutLib.KnockoutComputed[java.lang.String] = js.native
  @JSName("isModified")
  var isModified_Original: knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  var isValid: knockoutLib.KnockoutComputed[scala.Boolean] = js.native
  @JSName("isValidating")
  var isValidating_Original: knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  var rules: knockoutLib.KnockoutObservableArray[KnockoutValidationRule] = js.native
  def clearError(): scala.Unit = js.native
  def isModified(): scala.Boolean = js.native
  def isModified(value: scala.Boolean): scala.Unit = js.native
  def isValidating(): scala.Boolean = js.native
  def isValidating(value: scala.Boolean): scala.Unit = js.native
  def setError(error: java.lang.String): scala.Unit = js.native
}


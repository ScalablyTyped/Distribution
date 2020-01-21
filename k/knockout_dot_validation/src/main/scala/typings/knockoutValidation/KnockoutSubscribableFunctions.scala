package typings.knockoutValidation

import typings.knockout.KnockoutComputed
import typings.knockout.KnockoutObservable
import typings.knockout.KnockoutObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscribableFunctions[T] extends js.Object {
  @JSName("error")
  var error_Original: KnockoutComputed[String] = js.native
  @JSName("isModified")
  var isModified_Original: KnockoutObservable[Boolean] = js.native
  @JSName("isValid")
  var isValid_Original: KnockoutComputed[Boolean] = js.native
  @JSName("isValidating")
  var isValidating_Original: KnockoutObservable[Boolean] = js.native
  @JSName("rules")
  var rules_Original: KnockoutObservableArray[KnockoutValidationRule] = js.native
  def clearError(): Unit = js.native
  def error(): String = js.native
  def error(value: String): Unit = js.native
  def isModified(): Boolean = js.native
  def isModified(value: Boolean): Unit = js.native
  def isValid(): Boolean = js.native
  def isValid(value: Boolean): Unit = js.native
  def isValidating(): Boolean = js.native
  def isValidating(value: Boolean): Unit = js.native
  def rules(): js.Array[KnockoutValidationRule] = js.native
  def rules(value: js.Array[KnockoutValidationRule]): Unit = js.native
  def setError(error: String): Unit = js.native
}


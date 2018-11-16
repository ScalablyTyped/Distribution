package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutStatic extends js.Object {
  var validation: KnockoutValidationStatic = js.native
  def applyBindingsWithValidation(viewModel: js.Any): scala.Unit = js.native
  def applyBindingsWithValidation(viewModel: js.Any, rootNode: js.Any): scala.Unit = js.native
  def applyBindingsWithValidation(viewModel: js.Any, rootNode: js.Any, options: KnockoutValidationConfiguration): scala.Unit = js.native
  def validatedObservable[T](): knockoutLib.KnockoutObservable[T] = js.native
  def validatedObservable[T](initialValue: T): knockoutLib.KnockoutObservable[T] = js.native
}


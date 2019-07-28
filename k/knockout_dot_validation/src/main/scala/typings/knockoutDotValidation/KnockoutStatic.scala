package typings.knockoutDotValidation

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutStatic extends js.Object {
  var validation: KnockoutValidationStatic = js.native
  def applyBindingsWithValidation(viewModel: js.Any): Unit = js.native
  def applyBindingsWithValidation(viewModel: js.Any, rootNode: js.Any): Unit = js.native
  def applyBindingsWithValidation(viewModel: js.Any, rootNode: js.Any, options: KnockoutValidationConfiguration): Unit = js.native
  def validatedObservable[T](): KnockoutObservable[T] = js.native
  def validatedObservable[T](initialValue: T): KnockoutObservable[T] = js.native
}


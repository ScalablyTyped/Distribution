package typings.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutStatic extends js.Object {
  var validation: KnockoutValidationStatic = js.native
  def applyBindingsWithValidation(viewModel: js.Any): Unit = js.native
  def applyBindingsWithValidation(viewModel: js.Any, rootNode: js.UndefOr[scala.Nothing], options: KnockoutValidationConfiguration): Unit = js.native
  def applyBindingsWithValidation(viewModel: js.Any, rootNode: js.Any): Unit = js.native
  def applyBindingsWithValidation(viewModel: js.Any, rootNode: js.Any, options: KnockoutValidationConfiguration): Unit = js.native
  def validatedObservable[T](): js.Any = js.native
  def validatedObservable[T](initialValue: T): js.Any = js.native
}


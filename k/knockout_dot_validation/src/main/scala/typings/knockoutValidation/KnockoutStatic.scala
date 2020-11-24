package typings.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutStatic extends js.Object {
  
  def applyBindingsWithValidation(viewModel: js.Any): Unit = js.native
  def applyBindingsWithValidation(viewModel: js.Any, rootNode: js.UndefOr[scala.Nothing], options: KnockoutValidationConfiguration): Unit = js.native
  def applyBindingsWithValidation(viewModel: js.Any, rootNode: js.Any): Unit = js.native
  def applyBindingsWithValidation(viewModel: js.Any, rootNode: js.Any, options: KnockoutValidationConfiguration): Unit = js.native
  
  def validatedObservable[T](): js.Any = js.native
  def validatedObservable[T](initialValue: T): js.Any = js.native
  
  var validation: KnockoutValidationStatic = js.native
}

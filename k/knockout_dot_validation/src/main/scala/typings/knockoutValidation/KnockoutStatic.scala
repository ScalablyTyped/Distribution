package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutStatic extends StObject {
  
  def applyBindingsWithValidation(viewModel: Any): Unit = js.native
  def applyBindingsWithValidation(viewModel: Any, rootNode: Any): Unit = js.native
  def applyBindingsWithValidation(viewModel: Any, rootNode: Any, options: KnockoutValidationConfiguration): Unit = js.native
  def applyBindingsWithValidation(viewModel: Any, rootNode: Unit, options: KnockoutValidationConfiguration): Unit = js.native
  
  def validatedObservable[T](): Any = js.native
  def validatedObservable[T](initialValue: T): Any = js.native
  
  var validation: KnockoutValidationStatic = js.native
}

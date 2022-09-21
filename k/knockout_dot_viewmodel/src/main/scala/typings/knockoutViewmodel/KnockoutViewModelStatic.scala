package typings.knockoutViewmodel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutViewModelStatic extends StObject {
  
  def fromModel(model: Any): Any = js.native
  def fromModel(model: Any, options: Any): Any = js.native
  
  // INTERNAL flag: enable logging of conversions
  // logs will be written to console
  var logging: Boolean = js.native
  
  def toModel(viewmodel: Any): Any = js.native
  
  def updateFromModel(viewmodel: Any, model: Any): Any = js.native
}

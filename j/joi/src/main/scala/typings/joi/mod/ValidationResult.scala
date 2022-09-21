package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.joi.anon.Error[TSchema]
  - typings.joi.anon.Value
*/
trait ValidationResult[TSchema] extends StObject
object ValidationResult {
  
  inline def Error[TSchema](error: Unit, value: TSchema): typings.joi.anon.Error[TSchema] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.joi.anon.Error[TSchema]]
  }
  
  inline def Value(error: ValidationError, value: Unit): typings.joi.anon.Value = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.joi.anon.Value]
  }
}

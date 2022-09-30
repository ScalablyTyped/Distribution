package typings.joi.anon

import typings.joi.mod.ValidationError
import typings.joi.mod.ValidationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error[TSchema]
  extends StObject
     with ValidationResult[TSchema] {
  
  var error: Unit
  
  var value: TSchema
  
  var warning: js.UndefOr[ValidationError] = js.undefined
}
object Error {
  
  inline def apply[TSchema](error: Unit, value: TSchema): Error[TSchema] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error[TSchema]]
  }
  
  extension [Self <: Error[?], TSchema](x: Self & Error[TSchema]) {
    
    inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TSchema): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: ValidationError): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}

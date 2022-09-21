package typings.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveResult extends StObject {
  
  var errors: js.UndefOr[SaveError | js.Array[SaveError]] = js.undefined
  
  var fullName: String
  
  var success: Boolean
}
object SaveResult {
  
  inline def apply(fullName: String, success: Boolean): SaveResult = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResult]
  }
  
  extension [Self <: SaveResult](x: Self) {
    
    inline def setErrors(value: SaveError | js.Array[SaveError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SaveError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}

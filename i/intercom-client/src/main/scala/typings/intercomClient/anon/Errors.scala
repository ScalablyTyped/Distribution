package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.errorDotlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  var errors: js.Array[Code]
  
  var request_id: String
  
  var `type`: errorDotlist
}
object Errors {
  
  inline def apply(errors: js.Array[Code], request_id: String): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error.list")
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setErrors(value: js.Array[Code]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Code*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    inline def setType(value: errorDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

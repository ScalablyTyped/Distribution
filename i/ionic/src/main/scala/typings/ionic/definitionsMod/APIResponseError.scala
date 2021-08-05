package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIResponseError
  extends StObject
     with APIResponse {
  
  var error: APIResponseErrorError
  
  var meta: APIResponseMeta
}
object APIResponseError {
  
  inline def apply(error: APIResponseErrorError, meta: APIResponseMeta): APIResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponseError]
  }
  
  extension [Self <: APIResponseError](x: Self) {
    
    inline def setError(value: APIResponseErrorError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: APIResponseMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}

package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOrig extends StObject {
  
  var params: js.Object
  
  var payload: js.Object
  
  var query: js.Object
}
object RequestOrig {
  
  inline def apply(params: js.Object, payload: js.Object, query: js.Object): RequestOrig = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOrig]
  }
  
  extension [Self <: RequestOrig](x: Self) {
    
    inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}

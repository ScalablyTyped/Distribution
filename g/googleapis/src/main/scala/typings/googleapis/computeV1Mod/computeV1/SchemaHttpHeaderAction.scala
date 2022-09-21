package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpHeaderAction extends StObject {
  
  /**
    * Headers to add to a matching request before forwarding the request to the backendService.
    */
  var requestHeadersToAdd: js.UndefOr[js.Array[SchemaHttpHeaderOption]] = js.undefined
  
  /**
    * A list of header names for headers that need to be removed from the request before forwarding the request to the backendService.
    */
  var requestHeadersToRemove: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Headers to add the response before sending the response back to the client.
    */
  var responseHeadersToAdd: js.UndefOr[js.Array[SchemaHttpHeaderOption]] = js.undefined
  
  /**
    * A list of header names for headers that need to be removed from the response before sending the response back to the client.
    */
  var responseHeadersToRemove: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaHttpHeaderAction {
  
  inline def apply(): SchemaHttpHeaderAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpHeaderAction]
  }
  
  extension [Self <: SchemaHttpHeaderAction](x: Self) {
    
    inline def setRequestHeadersToAdd(value: js.Array[SchemaHttpHeaderOption]): Self = StObject.set(x, "requestHeadersToAdd", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersToAddUndefined: Self = StObject.set(x, "requestHeadersToAdd", js.undefined)
    
    inline def setRequestHeadersToAddVarargs(value: SchemaHttpHeaderOption*): Self = StObject.set(x, "requestHeadersToAdd", js.Array(value*))
    
    inline def setRequestHeadersToRemove(value: js.Array[String]): Self = StObject.set(x, "requestHeadersToRemove", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersToRemoveNull: Self = StObject.set(x, "requestHeadersToRemove", null)
    
    inline def setRequestHeadersToRemoveUndefined: Self = StObject.set(x, "requestHeadersToRemove", js.undefined)
    
    inline def setRequestHeadersToRemoveVarargs(value: String*): Self = StObject.set(x, "requestHeadersToRemove", js.Array(value*))
    
    inline def setResponseHeadersToAdd(value: js.Array[SchemaHttpHeaderOption]): Self = StObject.set(x, "responseHeadersToAdd", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersToAddUndefined: Self = StObject.set(x, "responseHeadersToAdd", js.undefined)
    
    inline def setResponseHeadersToAddVarargs(value: SchemaHttpHeaderOption*): Self = StObject.set(x, "responseHeadersToAdd", js.Array(value*))
    
    inline def setResponseHeadersToRemove(value: js.Array[String]): Self = StObject.set(x, "responseHeadersToRemove", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersToRemoveNull: Self = StObject.set(x, "responseHeadersToRemove", null)
    
    inline def setResponseHeadersToRemoveUndefined: Self = StObject.set(x, "responseHeadersToRemove", js.undefined)
    
    inline def setResponseHeadersToRemoveVarargs(value: String*): Self = StObject.set(x, "responseHeadersToRemove", js.Array(value*))
  }
}

package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryResponse extends StObject {
  
  /**
    * Device states for the devices given in the request.
    */
  var payload: js.UndefOr[SchemaQueryResponsePayload] = js.undefined
  
  /**
    * Request ID used for debugging. Copied from the request.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
}
object SchemaQueryResponse {
  
  inline def apply(): SchemaQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryResponse]
  }
  
  extension [Self <: SchemaQueryResponse](x: Self) {
    
    inline def setPayload(value: SchemaQueryResponsePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}

package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSyncResponse extends StObject {
  
  /**
    * Devices associated with the third-party user.
    */
  var payload: js.UndefOr[SchemaSyncResponsePayload] = js.undefined
  
  /**
    * Request ID used for debugging. Copied from the request.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSyncResponse {
  
  inline def apply(): SchemaSyncResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSyncResponse]
  }
  
  extension [Self <: SchemaSyncResponse](x: Self) {
    
    inline def setPayload(value: SchemaSyncResponsePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}

package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSyncRequest extends StObject {
  
  /**
    * Required. Third-party user ID.
    */
  var agentUserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Request ID used for debugging.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSyncRequest {
  
  inline def apply(): SchemaSyncRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSyncRequest]
  }
  
  extension [Self <: SchemaSyncRequest](x: Self) {
    
    inline def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    inline def setAgentUserIdNull: Self = StObject.set(x, "agentUserId", null)
    
    inline def setAgentUserIdUndefined: Self = StObject.set(x, "agentUserId", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}

package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequestSyncDevicesRequest extends StObject {
  
  /**
    * Required. Third-party user ID.
    */
  var agentUserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. If set, the request will be added to a queue and a response will be returned immediately. This enables concurrent requests for the given `agent_user_id`, but the caller will not receive any error responses.
    */
  var async: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRequestSyncDevicesRequest {
  
  inline def apply(): SchemaRequestSyncDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestSyncDevicesRequest]
  }
  
  extension [Self <: SchemaRequestSyncDevicesRequest](x: Self) {
    
    inline def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    inline def setAgentUserIdNull: Self = StObject.set(x, "agentUserId", null)
    
    inline def setAgentUserIdUndefined: Self = StObject.set(x, "agentUserId", js.undefined)
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncNull: Self = StObject.set(x, "async", null)
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
  }
}

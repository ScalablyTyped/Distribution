package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAgentusersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Third-party user ID.
    */
  var agentUserId: js.UndefOr[String] = js.undefined
  
  /**
    * Request ID used for debugging.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAgentusersDelete {
  
  inline def apply(): ParamsResourceAgentusersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAgentusersDelete]
  }
  
  extension [Self <: ParamsResourceAgentusersDelete](x: Self) {
    
    inline def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    inline def setAgentUserIdUndefined: Self = StObject.set(x, "agentUserId", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}

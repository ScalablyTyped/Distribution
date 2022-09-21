package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryRequest extends StObject {
  
  /**
    * Required. Third-party user ID.
    */
  var agentUserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Inputs containing third-party device IDs for which to get the device states.
    */
  var inputs: js.UndefOr[js.Array[SchemaQueryRequestInput]] = js.undefined
  
  /**
    * Request ID used for debugging.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
}
object SchemaQueryRequest {
  
  inline def apply(): SchemaQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryRequest]
  }
  
  extension [Self <: SchemaQueryRequest](x: Self) {
    
    inline def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    inline def setAgentUserIdNull: Self = StObject.set(x, "agentUserId", null)
    
    inline def setAgentUserIdUndefined: Self = StObject.set(x, "agentUserId", js.undefined)
    
    inline def setInputs(value: js.Array[SchemaQueryRequestInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: SchemaQueryRequestInput*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}

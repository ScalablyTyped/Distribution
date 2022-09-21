package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckResponse extends StObject {
  
  /**
    * Indicate the decision of the check. If no check errors are present, the service should process the operation. Otherwise the service should use the list of errors to determine the appropriate action.
    */
  var checkErrors: js.UndefOr[js.Array[SchemaCheckError]] = js.undefined
  
  /**
    * Feedback data returned from the server during processing a Check request.
    */
  var checkInfo: js.UndefOr[SchemaCheckInfo] = js.undefined
  
  /**
    * The same operation_id value used in the CheckRequest. Used for logging and diagnostics purposes.
    */
  var operationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Quota information for the check request associated with this response.
    */
  var quotaInfo: js.UndefOr[SchemaQuotaInfo] = js.undefined
  
  /**
    * The actual config id used to process the request.
    */
  var serviceConfigId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current service rollout id used to process the request.
    */
  var serviceRolloutId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCheckResponse {
  
  inline def apply(): SchemaCheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckResponse]
  }
  
  extension [Self <: SchemaCheckResponse](x: Self) {
    
    inline def setCheckErrors(value: js.Array[SchemaCheckError]): Self = StObject.set(x, "checkErrors", value.asInstanceOf[js.Any])
    
    inline def setCheckErrorsUndefined: Self = StObject.set(x, "checkErrors", js.undefined)
    
    inline def setCheckErrorsVarargs(value: SchemaCheckError*): Self = StObject.set(x, "checkErrors", js.Array(value*))
    
    inline def setCheckInfo(value: SchemaCheckInfo): Self = StObject.set(x, "checkInfo", value.asInstanceOf[js.Any])
    
    inline def setCheckInfoUndefined: Self = StObject.set(x, "checkInfo", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdNull: Self = StObject.set(x, "operationId", null)
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setQuotaInfo(value: SchemaQuotaInfo): Self = StObject.set(x, "quotaInfo", value.asInstanceOf[js.Any])
    
    inline def setQuotaInfoUndefined: Self = StObject.set(x, "quotaInfo", js.undefined)
    
    inline def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigIdNull: Self = StObject.set(x, "serviceConfigId", null)
    
    inline def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
    
    inline def setServiceRolloutId(value: String): Self = StObject.set(x, "serviceRolloutId", value.asInstanceOf[js.Any])
    
    inline def setServiceRolloutIdNull: Self = StObject.set(x, "serviceRolloutId", null)
    
    inline def setServiceRolloutIdUndefined: Self = StObject.set(x, "serviceRolloutId", js.undefined)
  }
}

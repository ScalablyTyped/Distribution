package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportResponse extends StObject {
  
  /**
    * Partial failures, one for each `Operation` in the request that failed processing. There are three possible combinations of the RPC status: 1. The combination of a successful RPC status and an empty `report_errors` list indicates a complete success where all `Operations` in the request are processed successfully. 2. The combination of a successful RPC status and a non-empty `report_errors` list indicates a partial success where some `Operations` in the request succeeded. Each `Operation` that failed processing has a corresponding item in this list. 3. A failed RPC status indicates a general non-deterministic failure. When this happens, it's impossible to know which of the 'Operations' in the request succeeded or failed.
    */
  var reportErrors: js.UndefOr[js.Array[SchemaReportError]] = js.undefined
  
  /**
    * The actual config id used to process the request.
    */
  var serviceConfigId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current service rollout id used to process the request.
    */
  var serviceRolloutId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportResponse {
  
  inline def apply(): SchemaReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportResponse]
  }
  
  extension [Self <: SchemaReportResponse](x: Self) {
    
    inline def setReportErrors(value: js.Array[SchemaReportError]): Self = StObject.set(x, "reportErrors", value.asInstanceOf[js.Any])
    
    inline def setReportErrorsUndefined: Self = StObject.set(x, "reportErrors", js.undefined)
    
    inline def setReportErrorsVarargs(value: SchemaReportError*): Self = StObject.set(x, "reportErrors", js.Array(value*))
    
    inline def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigIdNull: Self = StObject.set(x, "serviceConfigId", null)
    
    inline def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
    
    inline def setServiceRolloutId(value: String): Self = StObject.set(x, "serviceRolloutId", value.asInstanceOf[js.Any])
    
    inline def setServiceRolloutIdNull: Self = StObject.set(x, "serviceRolloutId", null)
    
    inline def setServiceRolloutIdUndefined: Self = StObject.set(x, "serviceRolloutId", js.undefined)
  }
}

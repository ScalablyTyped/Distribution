package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the Report method.
  */
trait SchemaReportResponse extends StObject {
  
  /**
    * Partial failures, one for each `Operation` in the request that failed
    * processing. There are three possible combinations of the RPC status:  1.
    * The combination of a successful RPC status and an empty `report_errors`
    * list indicates a complete success where all `Operations` in the request
    * are processed successfully. 2. The combination of a successful RPC status
    * and a non-empty    `report_errors` list indicates a partial success where
    * some    `Operations` in the request succeeded. Each    `Operation` that
    * failed processing has a corresponding item    in this list. 3. A failed
    * RPC status indicates a general non-deterministic failure.    When this
    * happens, it&#39;s impossible to know which of the    &#39;Operations&#39;
    * in the request succeeded or failed.
    */
  var reportErrors: js.UndefOr[js.Array[SchemaReportError]] = js.undefined
  
  /**
    * Quota usage for each quota release `Operation` request.  Fully or
    * partially failed quota release request may or may not be present in
    * `report_quota_info`. For example, a failed quota release request will
    * have the current quota usage info when precise quota library returns the
    * info. A deadline exceeded quota request will not have quota usage info.
    * If there is no quota release request, report_quota_info will be empty.
    */
  var reportInfos: js.UndefOr[js.Array[SchemaReportInfo]] = js.undefined
  
  /**
    * The actual config id used to process the request.
    */
  var serviceConfigId: js.UndefOr[String] = js.undefined
}
object SchemaReportResponse {
  
  inline def apply(): SchemaReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportResponse]
  }
  
  extension [Self <: SchemaReportResponse](x: Self) {
    
    inline def setReportErrors(value: js.Array[SchemaReportError]): Self = StObject.set(x, "reportErrors", value.asInstanceOf[js.Any])
    
    inline def setReportErrorsUndefined: Self = StObject.set(x, "reportErrors", js.undefined)
    
    inline def setReportErrorsVarargs(value: SchemaReportError*): Self = StObject.set(x, "reportErrors", js.Array(value :_*))
    
    inline def setReportInfos(value: js.Array[SchemaReportInfo]): Self = StObject.set(x, "reportInfos", value.asInstanceOf[js.Any])
    
    inline def setReportInfosUndefined: Self = StObject.set(x, "reportInfos", js.undefined)
    
    inline def setReportInfosVarargs(value: SchemaReportInfo*): Self = StObject.set(x, "reportInfos", js.Array(value :_*))
    
    inline def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
  }
}

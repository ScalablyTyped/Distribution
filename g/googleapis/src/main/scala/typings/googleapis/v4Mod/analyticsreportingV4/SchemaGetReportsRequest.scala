package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetReportsRequest extends StObject {
  
  /**
    * Requests, each request will have a separate response. There can be a maximum of 5 requests. All requests should have the same `dateRanges`, `viewId`, `segments`, `samplingLevel`, and `cohortGroup`.
    */
  var reportRequests: js.UndefOr[js.Array[SchemaReportRequest]] = js.undefined
  
  /**
    * Enables [resource based quotas](/analytics/devguides/reporting/core/v4/limits-quotas#analytics_reporting_api_v4), (defaults to `False`). If this field is set to `True` the per view (profile) quotas are governed by the computational cost of the request. Note that using cost based quotas will higher enable sampling rates. (10 Million for `SMALL`, 100M for `LARGE`. See the [limits and quotas documentation](/analytics/devguides/reporting/core/v4/limits-quotas#analytics_reporting_api_v4) for details.
    */
  var useResourceQuotas: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGetReportsRequest {
  
  inline def apply(): SchemaGetReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetReportsRequest]
  }
  
  extension [Self <: SchemaGetReportsRequest](x: Self) {
    
    inline def setReportRequests(value: js.Array[SchemaReportRequest]): Self = StObject.set(x, "reportRequests", value.asInstanceOf[js.Any])
    
    inline def setReportRequestsUndefined: Self = StObject.set(x, "reportRequests", js.undefined)
    
    inline def setReportRequestsVarargs(value: SchemaReportRequest*): Self = StObject.set(x, "reportRequests", js.Array(value*))
    
    inline def setUseResourceQuotas(value: Boolean): Self = StObject.set(x, "useResourceQuotas", value.asInstanceOf[js.Any])
    
    inline def setUseResourceQuotasNull: Self = StObject.set(x, "useResourceQuotas", null)
    
    inline def setUseResourceQuotasUndefined: Self = StObject.set(x, "useResourceQuotas", js.undefined)
  }
}

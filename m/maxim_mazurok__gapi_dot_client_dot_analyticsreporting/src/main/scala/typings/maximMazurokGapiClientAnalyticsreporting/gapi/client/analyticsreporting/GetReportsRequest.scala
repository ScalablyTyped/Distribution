package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReportsRequest extends StObject {
  
  /**
    * Requests, each request will have a separate response. There can be a maximum of 5 requests. All requests should have the same `dateRanges`, `viewId`, `segments`, `samplingLevel`,
    * and `cohortGroup`.
    */
  var reportRequests: js.UndefOr[js.Array[ReportRequest]] = js.undefined
  
  /**
    * Enables [resource based quotas](/analytics/devguides/reporting/core/v4/limits-quotas#analytics_reporting_api_v4), (defaults to `False`). If this field is set to `True` the per view
    * (profile) quotas are governed by the computational cost of the request. Note that using cost based quotas will higher enable sampling rates. (10 Million for `SMALL`, 100M for
    * `LARGE`. See the [limits and quotas documentation](/analytics/devguides/reporting/core/v4/limits-quotas#analytics_reporting_api_v4) for details.
    */
  var useResourceQuotas: js.UndefOr[Boolean] = js.undefined
}
object GetReportsRequest {
  
  inline def apply(): GetReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReportsRequest]
  }
  
  extension [Self <: GetReportsRequest](x: Self) {
    
    inline def setReportRequests(value: js.Array[ReportRequest]): Self = StObject.set(x, "reportRequests", value.asInstanceOf[js.Any])
    
    inline def setReportRequestsUndefined: Self = StObject.set(x, "reportRequests", js.undefined)
    
    inline def setReportRequestsVarargs(value: ReportRequest*): Self = StObject.set(x, "reportRequests", js.Array(value :_*))
    
    inline def setUseResourceQuotas(value: Boolean): Self = StObject.set(x, "useResourceQuotas", value.asInstanceOf[js.Any])
    
    inline def setUseResourceQuotasUndefined: Self = StObject.set(x, "useResourceQuotas", js.undefined)
  }
}

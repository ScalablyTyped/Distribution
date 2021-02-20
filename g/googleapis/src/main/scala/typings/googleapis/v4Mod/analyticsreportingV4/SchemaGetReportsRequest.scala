package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The batch request containing multiple report request.
  */
@js.native
trait SchemaGetReportsRequest extends StObject {
  
  /**
    * Requests, each request will have a separate response. There can be a
    * maximum of 5 requests. All requests should have the same `dateRanges`,
    * `viewId`, `segments`, `samplingLevel`, and `cohortGroup`.
    */
  var reportRequests: js.UndefOr[js.Array[SchemaReportRequest]] = js.native
  
  /**
    * Enables [resource based
    * quotas](/analytics/devguides/reporting/core/v4/limits-quotas#analytics_reporting_api_v4),
    * (defaults to `False`). If this field is set to `True` the per view
    * (profile) quotas are governed by the computational cost of the request.
    * Note that using cost based quotas will higher enable sampling rates. (10
    * Million for `SMALL`, 100M for `LARGE`. See the [limits and quotas
    * documentation](/analytics/devguides/reporting/core/v4/limits-quotas#analytics_reporting_api_v4)
    * for details.
    */
  var useResourceQuotas: js.UndefOr[Boolean] = js.native
}
object SchemaGetReportsRequest {
  
  @scala.inline
  def apply(): SchemaGetReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetReportsRequest]
  }
  
  @scala.inline
  implicit class SchemaGetReportsRequestMutableBuilder[Self <: SchemaGetReportsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportRequests(value: js.Array[SchemaReportRequest]): Self = StObject.set(x, "reportRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportRequestsUndefined: Self = StObject.set(x, "reportRequests", js.undefined)
    
    @scala.inline
    def setReportRequestsVarargs(value: SchemaReportRequest*): Self = StObject.set(x, "reportRequests", js.Array(value :_*))
    
    @scala.inline
    def setUseResourceQuotas(value: Boolean): Self = StObject.set(x, "useResourceQuotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseResourceQuotasUndefined: Self = StObject.set(x, "useResourceQuotas", js.undefined)
  }
}

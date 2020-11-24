package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReportsRequest extends js.Object {
  
  /**
    * Requests, each request will have a separate response. There can be a maximum of 5 requests. All requests should have the same `dateRanges`, `viewId`, `segments`, `samplingLevel`,
    * and `cohortGroup`.
    */
  var reportRequests: js.UndefOr[js.Array[ReportRequest]] = js.native
  
  /**
    * Enables [resource based quotas](/analytics/devguides/reporting/core/v4/limits-quotas#analytics_reporting_api_v4), (defaults to `False`). If this field is set to `True` the per view
    * (profile) quotas are governed by the computational cost of the request. Note that using cost based quotas will higher enable sampling rates. (10 Million for `SMALL`, 100M for
    * `LARGE`. See the [limits and quotas documentation](/analytics/devguides/reporting/core/v4/limits-quotas#analytics_reporting_api_v4) for details.
    */
  var useResourceQuotas: js.UndefOr[Boolean] = js.native
}
object GetReportsRequest {
  
  @scala.inline
  def apply(): GetReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReportsRequest]
  }
  
  @scala.inline
  implicit class GetReportsRequestOps[Self <: GetReportsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReportRequestsVarargs(value: ReportRequest*): Self = this.set("reportRequests", js.Array(value :_*))
    
    @scala.inline
    def setReportRequests(value: js.Array[ReportRequest]): Self = this.set("reportRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportRequests: Self = this.set("reportRequests", js.undefined)
    
    @scala.inline
    def setUseResourceQuotas(value: Boolean): Self = this.set("useResourceQuotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseResourceQuotas: Self = this.set("useResourceQuotas", js.undefined)
  }
}

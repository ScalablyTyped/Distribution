package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchRunReportsResponse extends js.Object {
  
  /** Individual responses. Each response has a separate report request. */
  var reports: js.UndefOr[js.Array[RunReportResponse]] = js.native
}
object BatchRunReportsResponse {
  
  @scala.inline
  def apply(): BatchRunReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRunReportsResponse]
  }
  
  @scala.inline
  implicit class BatchRunReportsResponseOps[Self <: BatchRunReportsResponse] (val x: Self) extends AnyVal {
    
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
    def setReportsVarargs(value: RunReportResponse*): Self = this.set("reports", js.Array(value :_*))
    
    @scala.inline
    def setReports(value: js.Array[RunReportResponse]): Self = this.set("reports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReports: Self = this.set("reports", js.undefined)
  }
}

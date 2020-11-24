package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchRunPivotReportsResponse extends js.Object {
  
  /** Individual responses. Each response has a separate pivot report request. */
  var pivotReports: js.UndefOr[js.Array[RunPivotReportResponse]] = js.native
}
object BatchRunPivotReportsResponse {
  
  @scala.inline
  def apply(): BatchRunPivotReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRunPivotReportsResponse]
  }
  
  @scala.inline
  implicit class BatchRunPivotReportsResponseOps[Self <: BatchRunPivotReportsResponse] (val x: Self) extends AnyVal {
    
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
    def setPivotReportsVarargs(value: RunPivotReportResponse*): Self = this.set("pivotReports", js.Array(value :_*))
    
    @scala.inline
    def setPivotReports(value: js.Array[RunPivotReportResponse]): Self = this.set("pivotReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotReports: Self = this.set("pivotReports", js.undefined)
  }
}

package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchRunPivotReportsResponse extends StObject {
  
  /** Individual responses. Each response has a separate pivot report request. */
  var pivotReports: js.UndefOr[js.Array[RunPivotReportResponse]] = js.undefined
}
object BatchRunPivotReportsResponse {
  
  @scala.inline
  def apply(): BatchRunPivotReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRunPivotReportsResponse]
  }
  
  @scala.inline
  implicit class BatchRunPivotReportsResponseMutableBuilder[Self <: BatchRunPivotReportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPivotReports(value: js.Array[RunPivotReportResponse]): Self = StObject.set(x, "pivotReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotReportsUndefined: Self = StObject.set(x, "pivotReports", js.undefined)
    
    @scala.inline
    def setPivotReportsVarargs(value: RunPivotReportResponse*): Self = StObject.set(x, "pivotReports", js.Array(value :_*))
  }
}

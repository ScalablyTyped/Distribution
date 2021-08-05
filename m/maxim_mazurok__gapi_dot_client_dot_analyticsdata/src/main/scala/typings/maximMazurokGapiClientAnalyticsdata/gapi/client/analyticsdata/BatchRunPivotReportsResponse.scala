package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchRunPivotReportsResponse extends StObject {
  
  /** Individual responses. Each response has a separate pivot report request. */
  var pivotReports: js.UndefOr[js.Array[RunPivotReportResponse]] = js.undefined
}
object BatchRunPivotReportsResponse {
  
  inline def apply(): BatchRunPivotReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRunPivotReportsResponse]
  }
  
  extension [Self <: BatchRunPivotReportsResponse](x: Self) {
    
    inline def setPivotReports(value: js.Array[RunPivotReportResponse]): Self = StObject.set(x, "pivotReports", value.asInstanceOf[js.Any])
    
    inline def setPivotReportsUndefined: Self = StObject.set(x, "pivotReports", js.undefined)
    
    inline def setPivotReportsVarargs(value: RunPivotReportResponse*): Self = StObject.set(x, "pivotReports", js.Array(value :_*))
  }
}

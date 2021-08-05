package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchRunReportsResponse extends StObject {
  
  /** Individual responses. Each response has a separate report request. */
  var reports: js.UndefOr[js.Array[RunReportResponse]] = js.undefined
}
object BatchRunReportsResponse {
  
  inline def apply(): BatchRunReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRunReportsResponse]
  }
  
  extension [Self <: BatchRunReportsResponse](x: Self) {
    
    inline def setReports(value: js.Array[RunReportResponse]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    inline def setReportsVarargs(value: RunReportResponse*): Self = StObject.set(x, "reports", js.Array(value :_*))
  }
}

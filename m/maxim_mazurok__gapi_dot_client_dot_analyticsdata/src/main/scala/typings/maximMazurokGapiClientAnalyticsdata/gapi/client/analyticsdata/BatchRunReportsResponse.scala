package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchRunReportsResponse extends StObject {
  
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
  implicit class BatchRunReportsResponseMutableBuilder[Self <: BatchRunReportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReports(value: js.Array[RunReportResponse]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    @scala.inline
    def setReportsVarargs(value: RunReportResponse*): Self = StObject.set(x, "reports", js.Array(value :_*))
  }
}

package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchRunReportsRequest extends StObject {
  
  /** Individual requests. Each request has a separate report response. Each batch request is allowed up to 5 requests. */
  var requests: js.UndefOr[js.Array[RunReportRequest]] = js.undefined
}
object BatchRunReportsRequest {
  
  inline def apply(): BatchRunReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRunReportsRequest]
  }
  
  extension [Self <: BatchRunReportsRequest](x: Self) {
    
    inline def setRequests(value: js.Array[RunReportRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: RunReportRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}

package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchRunReportsResponse extends StObject {
  
  /** Identifies what kind of resource this message is. This `kind` is always the fixed string "analyticsData#batchRunReports". Useful to distinguish between response types in JSON. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Individual responses. Each response has a separate report request. */
  var reports: js.UndefOr[js.Array[RunReportResponse]] = js.undefined
}
object BatchRunReportsResponse {
  
  inline def apply(): BatchRunReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRunReportsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchRunReportsResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setReports(value: js.Array[RunReportResponse]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    inline def setReportsVarargs(value: RunReportResponse*): Self = StObject.set(x, "reports", js.Array(value*))
  }
}

package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchRunPivotReportsResponse extends StObject {
  
  /** Identifies what kind of resource this message is. This `kind` is always the fixed string "analyticsData#batchRunPivotReports". Useful to distinguish between response types in JSON. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Individual responses. Each response has a separate pivot report request. */
  var pivotReports: js.UndefOr[js.Array[RunPivotReportResponse]] = js.undefined
}
object BatchRunPivotReportsResponse {
  
  inline def apply(): BatchRunPivotReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRunPivotReportsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchRunPivotReportsResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPivotReports(value: js.Array[RunPivotReportResponse]): Self = StObject.set(x, "pivotReports", value.asInstanceOf[js.Any])
    
    inline def setPivotReportsUndefined: Self = StObject.set(x, "pivotReports", js.undefined)
    
    inline def setPivotReportsVarargs(value: RunPivotReportResponse*): Self = StObject.set(x, "pivotReports", js.Array(value*))
  }
}

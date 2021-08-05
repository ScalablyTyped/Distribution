package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceReportList extends StObject {
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** A list of performance reports relevant for the account. */
  var performanceReport: js.UndefOr[js.Array[PerformanceReport]] = js.undefined
}
object PerformanceReportList {
  
  inline def apply(): PerformanceReportList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceReportList]
  }
  
  extension [Self <: PerformanceReportList](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPerformanceReport(value: js.Array[PerformanceReport]): Self = StObject.set(x, "performanceReport", value.asInstanceOf[js.Any])
    
    inline def setPerformanceReportUndefined: Self = StObject.set(x, "performanceReport", js.undefined)
    
    inline def setPerformanceReportVarargs(value: PerformanceReport*): Self = StObject.set(x, "performanceReport", js.Array(value :_*))
  }
}

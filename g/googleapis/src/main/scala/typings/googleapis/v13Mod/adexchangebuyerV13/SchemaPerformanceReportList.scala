package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration data for an Ad Exchange performance report list.
  */
trait SchemaPerformanceReportList extends StObject {
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A list of performance reports relevant for the account.
    */
  var performanceReport: js.UndefOr[js.Array[SchemaPerformanceReport]] = js.undefined
}
object SchemaPerformanceReportList {
  
  inline def apply(): SchemaPerformanceReportList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerformanceReportList]
  }
  
  extension [Self <: SchemaPerformanceReportList](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPerformanceReport(value: js.Array[SchemaPerformanceReport]): Self = StObject.set(x, "performanceReport", value.asInstanceOf[js.Any])
    
    inline def setPerformanceReportUndefined: Self = StObject.set(x, "performanceReport", js.undefined)
    
    inline def setPerformanceReportVarargs(value: SchemaPerformanceReport*): Self = StObject.set(x, "performanceReport", js.Array(value :_*))
  }
}

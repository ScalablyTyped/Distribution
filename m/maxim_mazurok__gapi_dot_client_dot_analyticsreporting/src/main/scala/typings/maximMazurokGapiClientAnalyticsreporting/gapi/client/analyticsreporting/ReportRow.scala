package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportRow extends StObject {
  
  /** List of requested dimensions. */
  var dimensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** List of metrics for each requested DateRange. */
  var metrics: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
}
object ReportRow {
  
  inline def apply(): ReportRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRow]
  }
  
  extension [Self <: ReportRow](x: Self) {
    
    inline def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setMetrics(value: js.Array[DateRangeValues]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: DateRangeValues*): Self = StObject.set(x, "metrics", js.Array(value*))
  }
}

package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnHeader extends StObject {
  
  /** The dimension names in the response. */
  var dimensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Metric headers for the metrics in the response. */
  var metricHeader: js.UndefOr[MetricHeader] = js.undefined
}
object ColumnHeader {
  
  inline def apply(): ColumnHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeader]
  }
  
  extension [Self <: ColumnHeader](x: Self) {
    
    inline def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setMetricHeader(value: MetricHeader): Self = StObject.set(x, "metricHeader", value.asInstanceOf[js.Any])
    
    inline def setMetricHeaderUndefined: Self = StObject.set(x, "metricHeader", js.undefined)
  }
}

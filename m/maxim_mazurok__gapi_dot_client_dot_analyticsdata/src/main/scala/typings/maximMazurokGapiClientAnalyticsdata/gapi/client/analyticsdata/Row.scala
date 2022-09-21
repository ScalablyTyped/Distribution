package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  /** List of requested dimension values. In a PivotReport, dimension_values are only listed for dimensions included in a pivot. */
  var dimensionValues: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  
  /** List of requested visible metric values. */
  var metricValues: js.UndefOr[js.Array[MetricValue]] = js.undefined
}
object Row {
  
  inline def apply(): Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Row]
  }
  
  extension [Self <: Row](x: Self) {
    
    inline def setDimensionValues(value: js.Array[DimensionValue]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    inline def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    inline def setDimensionValuesVarargs(value: DimensionValue*): Self = StObject.set(x, "dimensionValues", js.Array(value*))
    
    inline def setMetricValues(value: js.Array[MetricValue]): Self = StObject.set(x, "metricValues", value.asInstanceOf[js.Any])
    
    inline def setMetricValuesUndefined: Self = StObject.set(x, "metricValues", js.undefined)
    
    inline def setMetricValuesVarargs(value: MetricValue*): Self = StObject.set(x, "metricValues", js.Array(value*))
  }
}

package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotHeaderEntry extends StObject {
  
  /** The name of the dimensions in the pivot response. */
  var dimensionNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The values for the dimensions in the pivot. */
  var dimensionValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The metric header for the metric in the pivot. */
  var metric: js.UndefOr[MetricHeaderEntry] = js.undefined
}
object PivotHeaderEntry {
  
  inline def apply(): PivotHeaderEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHeaderEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotHeaderEntry] (val x: Self) extends AnyVal {
    
    inline def setDimensionNames(value: js.Array[String]): Self = StObject.set(x, "dimensionNames", value.asInstanceOf[js.Any])
    
    inline def setDimensionNamesUndefined: Self = StObject.set(x, "dimensionNames", js.undefined)
    
    inline def setDimensionNamesVarargs(value: String*): Self = StObject.set(x, "dimensionNames", js.Array(value*))
    
    inline def setDimensionValues(value: js.Array[String]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    inline def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    inline def setDimensionValuesVarargs(value: String*): Self = StObject.set(x, "dimensionValues", js.Array(value*))
    
    inline def setMetric(value: MetricHeaderEntry): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}

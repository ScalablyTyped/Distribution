package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricRange extends StObject {
  
  /**
    * Range of values considered "good." For a one-sided range, set one bound to an infinite value.
    */
  var range: js.UndefOr[SchemaGoogleMonitoringV3Range] = js.undefined
  
  /**
    * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying the TimeSeries to use for evaluating window quality.
    */
  var timeSeries: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetricRange {
  
  inline def apply(): SchemaMetricRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricRange]
  }
  
  extension [Self <: SchemaMetricRange](x: Self) {
    
    inline def setRange(value: SchemaGoogleMonitoringV3Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setTimeSeries(value: String): Self = StObject.set(x, "timeSeries", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesNull: Self = StObject.set(x, "timeSeries", null)
    
    inline def setTimeSeriesUndefined: Self = StObject.set(x, "timeSeries", js.undefined)
  }
}

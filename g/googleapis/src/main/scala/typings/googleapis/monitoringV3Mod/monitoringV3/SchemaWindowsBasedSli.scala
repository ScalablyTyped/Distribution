package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWindowsBasedSli extends StObject {
  
  /**
    * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries with ValueType = BOOL. The window is good if any true values appear in the window.
    */
  var goodBadMetricFilter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A window is good if its performance is high enough.
    */
  var goodTotalRatioThreshold: js.UndefOr[SchemaPerformanceThreshold] = js.undefined
  
  /**
    * A window is good if the metric's value is in a good range, averaged across returned streams.
    */
  var metricMeanInRange: js.UndefOr[SchemaMetricRange] = js.undefined
  
  /**
    * A window is good if the metric's value is in a good range, summed across returned streams.
    */
  var metricSumInRange: js.UndefOr[SchemaMetricRange] = js.undefined
  
  /**
    * Duration over which window quality is evaluated. Must be an integer fraction of a day and at least 60s.
    */
  var windowPeriod: js.UndefOr[String | Null] = js.undefined
}
object SchemaWindowsBasedSli {
  
  inline def apply(): SchemaWindowsBasedSli = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWindowsBasedSli]
  }
  
  extension [Self <: SchemaWindowsBasedSli](x: Self) {
    
    inline def setGoodBadMetricFilter(value: String): Self = StObject.set(x, "goodBadMetricFilter", value.asInstanceOf[js.Any])
    
    inline def setGoodBadMetricFilterNull: Self = StObject.set(x, "goodBadMetricFilter", null)
    
    inline def setGoodBadMetricFilterUndefined: Self = StObject.set(x, "goodBadMetricFilter", js.undefined)
    
    inline def setGoodTotalRatioThreshold(value: SchemaPerformanceThreshold): Self = StObject.set(x, "goodTotalRatioThreshold", value.asInstanceOf[js.Any])
    
    inline def setGoodTotalRatioThresholdUndefined: Self = StObject.set(x, "goodTotalRatioThreshold", js.undefined)
    
    inline def setMetricMeanInRange(value: SchemaMetricRange): Self = StObject.set(x, "metricMeanInRange", value.asInstanceOf[js.Any])
    
    inline def setMetricMeanInRangeUndefined: Self = StObject.set(x, "metricMeanInRange", js.undefined)
    
    inline def setMetricSumInRange(value: SchemaMetricRange): Self = StObject.set(x, "metricSumInRange", value.asInstanceOf[js.Any])
    
    inline def setMetricSumInRangeUndefined: Self = StObject.set(x, "metricSumInRange", js.undefined)
    
    inline def setWindowPeriod(value: String): Self = StObject.set(x, "windowPeriod", value.asInstanceOf[js.Any])
    
    inline def setWindowPeriodNull: Self = StObject.set(x, "windowPeriod", null)
    
    inline def setWindowPeriodUndefined: Self = StObject.set(x, "windowPeriod", js.undefined)
  }
}

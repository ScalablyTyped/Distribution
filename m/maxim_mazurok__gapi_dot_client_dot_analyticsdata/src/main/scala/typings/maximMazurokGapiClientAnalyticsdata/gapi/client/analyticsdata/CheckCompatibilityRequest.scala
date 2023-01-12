package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckCompatibilityRequest extends StObject {
  
  /** Filters the dimensions and metrics in the response to just this compatibility. Commonly used as `”compatibilityFilter”: “COMPATIBLE”` to only return compatible dimensions & metrics. */
  var compatibilityFilter: js.UndefOr[String] = js.undefined
  
  /** The filter clause of dimensions. `dimensionFilter` should be the same value as in your `runReport` request. */
  var dimensionFilter: js.UndefOr[FilterExpression] = js.undefined
  
  /** The dimensions in this report. `dimensions` should be the same value as in your `runReport` request. */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  
  /** The filter clause of metrics. `metricFilter` should be the same value as in your `runReport` request */
  var metricFilter: js.UndefOr[FilterExpression] = js.undefined
  
  /** The metrics in this report. `metrics` should be the same value as in your `runReport` request. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
}
object CheckCompatibilityRequest {
  
  inline def apply(): CheckCompatibilityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckCompatibilityRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckCompatibilityRequest] (val x: Self) extends AnyVal {
    
    inline def setCompatibilityFilter(value: String): Self = StObject.set(x, "compatibilityFilter", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityFilterUndefined: Self = StObject.set(x, "compatibilityFilter", js.undefined)
    
    inline def setDimensionFilter(value: FilterExpression): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
    
    inline def setDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setMetricFilter(value: FilterExpression): Self = StObject.set(x, "metricFilter", value.asInstanceOf[js.Any])
    
    inline def setMetricFilterUndefined: Self = StObject.set(x, "metricFilter", js.undefined)
    
    inline def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value*))
  }
}

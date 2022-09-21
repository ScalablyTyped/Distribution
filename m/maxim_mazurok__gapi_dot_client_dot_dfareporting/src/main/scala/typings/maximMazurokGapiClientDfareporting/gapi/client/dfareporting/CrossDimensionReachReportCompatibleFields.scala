package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossDimensionReachReportCompatibleFields extends StObject {
  
  /** Dimensions which are compatible to be selected in the "breakdown" section of the report. */
  var breakdown: js.UndefOr[js.Array[Dimension]] = js.undefined
  
  /** Dimensions which are compatible to be selected in the "dimensionFilters" section of the report. */
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.undefined
  
  /** The kind of resource this is, in this case dfareporting#crossDimensionReachReportCompatibleFields. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  
  /** Metrics which are compatible to be selected in the "overlapMetricNames" section of the report. */
  var overlapMetrics: js.UndefOr[js.Array[Metric]] = js.undefined
}
object CrossDimensionReachReportCompatibleFields {
  
  inline def apply(): CrossDimensionReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossDimensionReachReportCompatibleFields]
  }
  
  extension [Self <: CrossDimensionReachReportCompatibleFields](x: Self) {
    
    inline def setBreakdown(value: js.Array[Dimension]): Self = StObject.set(x, "breakdown", value.asInstanceOf[js.Any])
    
    inline def setBreakdownUndefined: Self = StObject.set(x, "breakdown", js.undefined)
    
    inline def setBreakdownVarargs(value: Dimension*): Self = StObject.set(x, "breakdown", js.Array(value*))
    
    inline def setDimensionFilters(value: js.Array[Dimension]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    inline def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    inline def setDimensionFiltersVarargs(value: Dimension*): Self = StObject.set(x, "dimensionFilters", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setOverlapMetrics(value: js.Array[Metric]): Self = StObject.set(x, "overlapMetrics", value.asInstanceOf[js.Any])
    
    inline def setOverlapMetricsUndefined: Self = StObject.set(x, "overlapMetrics", js.undefined)
    
    inline def setOverlapMetricsVarargs(value: Metric*): Self = StObject.set(x, "overlapMetrics", js.Array(value*))
  }
}

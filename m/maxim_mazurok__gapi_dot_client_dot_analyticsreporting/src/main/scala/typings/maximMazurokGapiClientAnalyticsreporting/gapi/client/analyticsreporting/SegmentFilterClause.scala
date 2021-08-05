package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentFilterClause extends StObject {
  
  /** Dimension Filter for the segment definition. */
  var dimensionFilter: js.UndefOr[SegmentDimensionFilter] = js.undefined
  
  /** Metric Filter for the segment definition. */
  var metricFilter: js.UndefOr[SegmentMetricFilter] = js.undefined
  
  /** Matches the complement (`!`) of the filter. */
  var not: js.UndefOr[Boolean] = js.undefined
}
object SegmentFilterClause {
  
  inline def apply(): SegmentFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentFilterClause]
  }
  
  extension [Self <: SegmentFilterClause](x: Self) {
    
    inline def setDimensionFilter(value: SegmentDimensionFilter): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
    
    inline def setMetricFilter(value: SegmentMetricFilter): Self = StObject.set(x, "metricFilter", value.asInstanceOf[js.Any])
    
    inline def setMetricFilterUndefined: Self = StObject.set(x, "metricFilter", js.undefined)
    
    inline def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
  }
}

package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentFilterClause extends StObject {
  
  /** Dimension Filter for the segment definition. */
  var dimensionFilter: js.UndefOr[SegmentDimensionFilter] = js.native
  
  /** Metric Filter for the segment definition. */
  var metricFilter: js.UndefOr[SegmentMetricFilter] = js.native
  
  /** Matches the complement (`!`) of the filter. */
  var not: js.UndefOr[Boolean] = js.native
}
object SegmentFilterClause {
  
  @scala.inline
  def apply(): SegmentFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentFilterClause]
  }
  
  @scala.inline
  implicit class SegmentFilterClauseMutableBuilder[Self <: SegmentFilterClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionFilter(value: SegmentDimensionFilter): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
    
    @scala.inline
    def setMetricFilter(value: SegmentMetricFilter): Self = StObject.set(x, "metricFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricFilterUndefined: Self = StObject.set(x, "metricFilter", js.undefined)
    
    @scala.inline
    def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
  }
}

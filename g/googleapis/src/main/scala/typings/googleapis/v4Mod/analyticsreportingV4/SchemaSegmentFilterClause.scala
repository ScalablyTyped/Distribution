package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Filter Clause to be used in a segment definition, can be wither a metric or
  * a dimension filter.
  */
trait SchemaSegmentFilterClause extends StObject {
  
  /**
    * Dimension Filter for the segment definition.
    */
  var dimensionFilter: js.UndefOr[SchemaSegmentDimensionFilter] = js.undefined
  
  /**
    * Metric Filter for the segment definition.
    */
  var metricFilter: js.UndefOr[SchemaSegmentMetricFilter] = js.undefined
  
  /**
    * Matches the complement (`!`) of the filter.
    */
  var not: js.UndefOr[Boolean] = js.undefined
}
object SchemaSegmentFilterClause {
  
  @scala.inline
  def apply(): SchemaSegmentFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentFilterClause]
  }
  
  @scala.inline
  implicit class SchemaSegmentFilterClauseMutableBuilder[Self <: SchemaSegmentFilterClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionFilter(value: SchemaSegmentDimensionFilter): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
    
    @scala.inline
    def setMetricFilter(value: SchemaSegmentMetricFilter): Self = StObject.set(x, "metricFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricFilterUndefined: Self = StObject.set(x, "metricFilter", js.undefined)
    
    @scala.inline
    def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
  }
}

package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Filter Clause to be used in a segment definition, can be wither a metric or
  * a dimension filter.
  */
@js.native
trait SchemaSegmentFilterClause extends js.Object {
  
  /**
    * Dimension Filter for the segment definition.
    */
  var dimensionFilter: js.UndefOr[SchemaSegmentDimensionFilter] = js.native
  
  /**
    * Metric Filter for the segment definition.
    */
  var metricFilter: js.UndefOr[SchemaSegmentMetricFilter] = js.native
  
  /**
    * Matches the complement (`!`) of the filter.
    */
  var not: js.UndefOr[Boolean] = js.native
}
object SchemaSegmentFilterClause {
  
  @scala.inline
  def apply(): SchemaSegmentFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentFilterClause]
  }
  
  @scala.inline
  implicit class SchemaSegmentFilterClauseOps[Self <: SchemaSegmentFilterClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDimensionFilter(value: SchemaSegmentDimensionFilter): Self = this.set("dimensionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionFilter: Self = this.set("dimensionFilter", js.undefined)
    
    @scala.inline
    def setMetricFilter(value: SchemaSegmentMetricFilter): Self = this.set("metricFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricFilter: Self = this.set("metricFilter", js.undefined)
    
    @scala.inline
    def setNot(value: Boolean): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
  }
}

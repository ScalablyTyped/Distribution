package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentFilterClause extends js.Object {
  
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
  implicit class SegmentFilterClauseOps[Self <: SegmentFilterClause] (val x: Self) extends AnyVal {
    
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
    def setDimensionFilter(value: SegmentDimensionFilter): Self = this.set("dimensionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionFilter: Self = this.set("dimensionFilter", js.undefined)
    
    @scala.inline
    def setMetricFilter(value: SegmentMetricFilter): Self = this.set("metricFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricFilter: Self = this.set("metricFilter", js.undefined)
    
    @scala.inline
    def setNot(value: Boolean): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
  }
}

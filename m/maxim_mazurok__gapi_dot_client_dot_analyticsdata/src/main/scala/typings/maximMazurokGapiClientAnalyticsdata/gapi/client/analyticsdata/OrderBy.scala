package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderBy extends js.Object {
  
  /** If true, sorts by descending order. */
  var desc: js.UndefOr[Boolean] = js.native
  
  /** Sorts results by a dimension's values. */
  var dimension: js.UndefOr[DimensionOrderBy] = js.native
  
  /** Sorts results by a metric's values. */
  var metric: js.UndefOr[MetricOrderBy] = js.native
  
  /** Sorts results by a metric's values within a pivot column group. */
  var pivot: js.UndefOr[PivotOrderBy] = js.native
}
object OrderBy {
  
  @scala.inline
  def apply(): OrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderBy]
  }
  
  @scala.inline
  implicit class OrderByOps[Self <: OrderBy] (val x: Self) extends AnyVal {
    
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
    def setDesc(value: Boolean): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    
    @scala.inline
    def setDimension(value: DimensionOrderBy): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    
    @scala.inline
    def setMetric(value: MetricOrderBy): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    
    @scala.inline
    def setPivot(value: PivotOrderBy): Self = this.set("pivot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivot: Self = this.set("pivot", js.undefined)
  }
}

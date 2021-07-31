package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderBy extends StObject {
  
  /** If true, sorts by descending order. */
  var desc: js.UndefOr[Boolean] = js.undefined
  
  /** Sorts results by a dimension's values. */
  var dimension: js.UndefOr[DimensionOrderBy] = js.undefined
  
  /** Sorts results by a metric's values. */
  var metric: js.UndefOr[MetricOrderBy] = js.undefined
  
  /** Sorts results by a metric's values within a pivot column group. */
  var pivot: js.UndefOr[PivotOrderBy] = js.undefined
}
object OrderBy {
  
  @scala.inline
  def apply(): OrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderBy]
  }
  
  @scala.inline
  implicit class OrderByMutableBuilder[Self <: OrderBy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    @scala.inline
    def setDimension(value: DimensionOrderBy): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    @scala.inline
    def setMetric(value: MetricOrderBy): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setPivot(value: PivotOrderBy): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotUndefined: Self = StObject.set(x, "pivot", js.undefined)
  }
}

package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pivot extends js.Object {
  
  /**
    * Dimension names for visible columns in the report response. Including "dateRange" produces a date range column; for each row in the response, dimension values in the date range
    * column will indicate the corresponding date range from the request.
    */
  var fieldNames: js.UndefOr[js.Array[String]] = js.native
  
  /** The number of rows to return in this pivot. If unspecified, 10 rows are returned. If -1, all rows are returned. */
  var limit: js.UndefOr[String] = js.native
  
  /** Aggregate the metrics by dimensions in this pivot using the specified metric_aggregations. */
  var metricAggregations: js.UndefOr[js.Array[String]] = js.native
  
  /** The row count of the start row. The first row is counted as row 0. */
  var offset: js.UndefOr[String] = js.native
  
  /**
    * Specifies how dimensions are ordered in the pivot. In the first Pivot, the OrderBys determine Row and PivotDimensionHeader ordering; in subsequent Pivots, the OrderBys determine
    * only PivotDimensionHeader ordering. Dimensions specified in these OrderBys must be a subset of Pivot.field_names.
    */
  var orderBys: js.UndefOr[js.Array[OrderBy]] = js.native
}
object Pivot {
  
  @scala.inline
  def apply(): Pivot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pivot]
  }
  
  @scala.inline
  implicit class PivotOps[Self <: Pivot] (val x: Self) extends AnyVal {
    
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
    def setFieldNamesVarargs(value: String*): Self = this.set("fieldNames", js.Array(value :_*))
    
    @scala.inline
    def setFieldNames(value: js.Array[String]): Self = this.set("fieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldNames: Self = this.set("fieldNames", js.undefined)
    
    @scala.inline
    def setLimit(value: String): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMetricAggregationsVarargs(value: String*): Self = this.set("metricAggregations", js.Array(value :_*))
    
    @scala.inline
    def setMetricAggregations(value: js.Array[String]): Self = this.set("metricAggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricAggregations: Self = this.set("metricAggregations", js.undefined)
    
    @scala.inline
    def setOffset(value: String): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOrderBysVarargs(value: OrderBy*): Self = this.set("orderBys", js.Array(value :_*))
    
    @scala.inline
    def setOrderBys(value: js.Array[OrderBy]): Self = this.set("orderBys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBys: Self = this.set("orderBys", js.undefined)
  }
}

package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunRealtimeReportRequest extends js.Object {
  
  /** The filter clause of dimensions. Dimensions must be requested to be used in this filter. Metrics cannot be used in this filter. */
  var dimensionFilter: js.UndefOr[FilterExpression] = js.native
  
  /** The dimensions requested and displayed. */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** The number of rows to return. If unspecified, 10 rows are returned. If -1, all rows are returned. */
  var limit: js.UndefOr[String] = js.native
  
  /** Aggregation of metrics. Aggregated metric values will be shown in rows where the dimension_values are set to "RESERVED_(MetricAggregation)". */
  var metricAggregations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The filter clause of metrics. Applied at post aggregation phase, similar to SQL having-clause. Metrics must be requested to be used in this filter. Dimensions cannot be used in this
    * filter.
    */
  var metricFilter: js.UndefOr[FilterExpression] = js.native
  
  /** The metrics requested and displayed. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  
  /** Specifies how rows are ordered in the response. */
  var orderBys: js.UndefOr[js.Array[OrderBy]] = js.native
  
  /** Toggles whether to return the current state of this Analytics Property's Realtime quota. Quota is returned in [PropertyQuota](#PropertyQuota). */
  var returnPropertyQuota: js.UndefOr[Boolean] = js.native
}
object RunRealtimeReportRequest {
  
  @scala.inline
  def apply(): RunRealtimeReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunRealtimeReportRequest]
  }
  
  @scala.inline
  implicit class RunRealtimeReportRequestOps[Self <: RunRealtimeReportRequest] (val x: Self) extends AnyVal {
    
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
    def setDimensionFilter(value: FilterExpression): Self = this.set("dimensionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionFilter: Self = this.set("dimensionFilter", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[Dimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
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
    def setMetricFilter(value: FilterExpression): Self = this.set("metricFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricFilter: Self = this.set("metricFilter", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: Metric*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[Metric]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setOrderBysVarargs(value: OrderBy*): Self = this.set("orderBys", js.Array(value :_*))
    
    @scala.inline
    def setOrderBys(value: js.Array[OrderBy]): Self = this.set("orderBys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBys: Self = this.set("orderBys", js.undefined)
    
    @scala.inline
    def setReturnPropertyQuota(value: Boolean): Self = this.set("returnPropertyQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnPropertyQuota: Self = this.set("returnPropertyQuota", js.undefined)
  }
}

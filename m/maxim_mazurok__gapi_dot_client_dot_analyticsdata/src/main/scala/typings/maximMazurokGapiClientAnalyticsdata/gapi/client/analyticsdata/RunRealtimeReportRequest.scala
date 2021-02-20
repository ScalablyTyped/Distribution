package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunRealtimeReportRequest extends StObject {
  
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
  implicit class RunRealtimeReportRequestMutableBuilder[Self <: RunRealtimeReportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionFilter(value: FilterExpression): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
    
    @scala.inline
    def setDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMetricAggregations(value: js.Array[String]): Self = StObject.set(x, "metricAggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricAggregationsUndefined: Self = StObject.set(x, "metricAggregations", js.undefined)
    
    @scala.inline
    def setMetricAggregationsVarargs(value: String*): Self = StObject.set(x, "metricAggregations", js.Array(value :_*))
    
    @scala.inline
    def setMetricFilter(value: FilterExpression): Self = StObject.set(x, "metricFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricFilterUndefined: Self = StObject.set(x, "metricFilter", js.undefined)
    
    @scala.inline
    def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setOrderBys(value: js.Array[OrderBy]): Self = StObject.set(x, "orderBys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderBysUndefined: Self = StObject.set(x, "orderBys", js.undefined)
    
    @scala.inline
    def setOrderBysVarargs(value: OrderBy*): Self = StObject.set(x, "orderBys", js.Array(value :_*))
    
    @scala.inline
    def setReturnPropertyQuota(value: Boolean): Self = StObject.set(x, "returnPropertyQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPropertyQuotaUndefined: Self = StObject.set(x, "returnPropertyQuota", js.undefined)
  }
}

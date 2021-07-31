package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunReportRequest extends StObject {
  
  /** Cohort group associated with this request. If there is a cohort group in the request the 'cohort' dimension must be present. */
  var cohortSpec: js.UndefOr[CohortSpec] = js.undefined
  
  /** A currency code in ISO4217 format, such as "AED", "USD", "JPY". If the field is empty, the report uses the entity's default currency. */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * Date ranges of data to read. If multiple date ranges are requested, each response row will contain a zero based date range index. If two date ranges overlap, the event data for the
    * overlapping days is included in the response rows for both date ranges. In a cohort request, this `dateRanges` must be unspecified.
    */
  var dateRanges: js.UndefOr[js.Array[DateRange]] = js.undefined
  
  /** The filter clause of dimensions. Dimensions must be requested to be used in this filter. Metrics cannot be used in this filter. */
  var dimensionFilter: js.UndefOr[FilterExpression] = js.undefined
  
  /** The dimensions requested and displayed. */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  
  /** A property whose events are tracked. Within a batch request, this entity should either be unspecified or consistent with the batch-level entity. */
  var entity: js.UndefOr[Entity] = js.undefined
  
  /** If false or unspecified, each row with all metrics equal to 0 will not be returned. If true, these rows will be returned if they are not separately removed by a filter. */
  var keepEmptyRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of rows to return. If unspecified, 10 rows are returned. If -1, all rows are returned. To learn more about this pagination parameter, see
    * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
    */
  var limit: js.UndefOr[String] = js.undefined
  
  /** Aggregation of metrics. Aggregated metric values will be shown in rows where the dimension_values are set to "RESERVED_(MetricAggregation)". */
  var metricAggregations: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The filter clause of metrics. Applied at post aggregation phase, similar to SQL having-clause. Metrics must be requested to be used in this filter. Dimensions cannot be used in this
    * filter.
    */
  var metricFilter: js.UndefOr[FilterExpression] = js.undefined
  
  /** The metrics requested and displayed. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  
  /**
    * The row count of the start row. The first row is counted as row 0. To learn more about this pagination parameter, see
    * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
    */
  var offset: js.UndefOr[String] = js.undefined
  
  /** Specifies how rows are ordered in the response. */
  var orderBys: js.UndefOr[js.Array[OrderBy]] = js.undefined
  
  /** Toggles whether to return the current state of this Analytics Property's quota. Quota is returned in [PropertyQuota](#PropertyQuota). */
  var returnPropertyQuota: js.UndefOr[Boolean] = js.undefined
}
object RunReportRequest {
  
  @scala.inline
  def apply(): RunReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunReportRequest]
  }
  
  @scala.inline
  implicit class RunReportRequestMutableBuilder[Self <: RunReportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCohortSpec(value: CohortSpec): Self = StObject.set(x, "cohortSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCohortSpecUndefined: Self = StObject.set(x, "cohortSpec", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setDateRanges(value: js.Array[DateRange]): Self = StObject.set(x, "dateRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangesUndefined: Self = StObject.set(x, "dateRanges", js.undefined)
    
    @scala.inline
    def setDateRangesVarargs(value: DateRange*): Self = StObject.set(x, "dateRanges", js.Array(value :_*))
    
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
    def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    @scala.inline
    def setKeepEmptyRows(value: Boolean): Self = StObject.set(x, "keepEmptyRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepEmptyRowsUndefined: Self = StObject.set(x, "keepEmptyRows", js.undefined)
    
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
    def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
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

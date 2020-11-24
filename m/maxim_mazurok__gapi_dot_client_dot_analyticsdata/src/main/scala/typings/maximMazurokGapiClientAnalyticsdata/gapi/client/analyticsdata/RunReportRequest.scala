package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunReportRequest extends js.Object {
  
  /** Cohort group associated with this request. If there is a cohort group in the request the 'cohort' dimension must be present. */
  var cohortSpec: js.UndefOr[CohortSpec] = js.native
  
  /** A currency code in ISO4217 format, such as "AED", "USD", "JPY". If the field is empty, the report uses the entity's default currency. */
  var currencyCode: js.UndefOr[String] = js.native
  
  /**
    * Date ranges of data to read. If multiple date ranges are requested, each response row will contain a zero based date range index. If two date ranges overlap, the event data for the
    * overlapping days is included in the response rows for both date ranges. In a cohort request, this `dateRanges` must be unspecified.
    */
  var dateRanges: js.UndefOr[js.Array[DateRange]] = js.native
  
  /** The filter clause of dimensions. Dimensions must be requested to be used in this filter. Metrics cannot be used in this filter. */
  var dimensionFilter: js.UndefOr[FilterExpression] = js.native
  
  /** The dimensions requested and displayed. */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** A property whose events are tracked. Within a batch request, this entity should either be unspecified or consistent with the batch-level entity. */
  var entity: js.UndefOr[Entity] = js.native
  
  /** If false or unspecified, each row with all metrics equal to 0 will not be returned. If true, these rows will be returned if they are not separately removed by a filter. */
  var keepEmptyRows: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of rows to return. If unspecified, 10 rows are returned. If -1, all rows are returned. To learn more about this pagination parameter, see
    * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
    */
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
  
  /**
    * The row count of the start row. The first row is counted as row 0. To learn more about this pagination parameter, see
    * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
    */
  var offset: js.UndefOr[String] = js.native
  
  /** Specifies how rows are ordered in the response. */
  var orderBys: js.UndefOr[js.Array[OrderBy]] = js.native
  
  /** Toggles whether to return the current state of this Analytics Property's quota. Quota is returned in [PropertyQuota](#PropertyQuota). */
  var returnPropertyQuota: js.UndefOr[Boolean] = js.native
}
object RunReportRequest {
  
  @scala.inline
  def apply(): RunReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunReportRequest]
  }
  
  @scala.inline
  implicit class RunReportRequestOps[Self <: RunReportRequest] (val x: Self) extends AnyVal {
    
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
    def setCohortSpec(value: CohortSpec): Self = this.set("cohortSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCohortSpec: Self = this.set("cohortSpec", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setDateRangesVarargs(value: DateRange*): Self = this.set("dateRanges", js.Array(value :_*))
    
    @scala.inline
    def setDateRanges(value: js.Array[DateRange]): Self = this.set("dateRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRanges: Self = this.set("dateRanges", js.undefined)
    
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
    def setEntity(value: Entity): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setKeepEmptyRows(value: Boolean): Self = this.set("keepEmptyRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepEmptyRows: Self = this.set("keepEmptyRows", js.undefined)
    
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
    def setOffset(value: String): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
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

package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunPivotReportRequest extends js.Object {
  
  /** Cohort group associated with this request. If there is a cohort group in the request the 'cohort' dimension must be present. */
  var cohortSpec: js.UndefOr[CohortSpec] = js.native
  
  /** A currency code in ISO4217 format, such as "AED", "USD", "JPY". If the field is empty, the report uses the entity's default currency. */
  var currencyCode: js.UndefOr[String] = js.native
  
  /**
    * The date range to retrieve event data for the report. If multiple date ranges are specified, event data from each date range is used in the report. A special dimension with field
    * name "dateRange" can be included in a Pivot's field names; if included, the report compares between date ranges. In a cohort request, this `dateRanges` must be unspecified.
    */
  var dateRanges: js.UndefOr[js.Array[DateRange]] = js.native
  
  /** The filter clause of dimensions. Dimensions must be requested to be used in this filter. Metrics cannot be used in this filter. */
  var dimensionFilter: js.UndefOr[FilterExpression] = js.native
  
  /** The dimensions requested. All defined dimensions must be used by one of the following: dimension_expression, dimension_filter, pivots, order_bys. */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** A property whose events are tracked. Within a batch request, this entity should either be unspecified or consistent with the batch-level entity. */
  var entity: js.UndefOr[Entity] = js.native
  
  /** If false or unspecified, each row with all metrics equal to 0 will not be returned. If true, these rows will be returned if they are not separately removed by a filter. */
  var keepEmptyRows: js.UndefOr[Boolean] = js.native
  
  /**
    * The filter clause of metrics. Applied at post aggregation phase, similar to SQL having-clause. Metrics must be requested to be used in this filter. Dimensions cannot be used in this
    * filter.
    */
  var metricFilter: js.UndefOr[FilterExpression] = js.native
  
  /** The metrics requested, at least one metric needs to be specified. All defined metrics must be used by one of the following: metric_expression, metric_filter, order_bys. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  
  /**
    * Describes the visual format of the report's dimensions in columns or rows. The union of the fieldNames (dimension names) in all pivots must be a subset of dimension names defined in
    * Dimensions. No two pivots can share a dimension. A dimension is only visible if it appears in a pivot.
    */
  var pivots: js.UndefOr[js.Array[Pivot]] = js.native
  
  /** Toggles whether to return the current state of this Analytics Property's quota. Quota is returned in [PropertyQuota](#PropertyQuota). */
  var returnPropertyQuota: js.UndefOr[Boolean] = js.native
}
object RunPivotReportRequest {
  
  @scala.inline
  def apply(): RunPivotReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunPivotReportRequest]
  }
  
  @scala.inline
  implicit class RunPivotReportRequestOps[Self <: RunPivotReportRequest] (val x: Self) extends AnyVal {
    
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
    def setPivotsVarargs(value: Pivot*): Self = this.set("pivots", js.Array(value :_*))
    
    @scala.inline
    def setPivots(value: js.Array[Pivot]): Self = this.set("pivots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivots: Self = this.set("pivots", js.undefined)
    
    @scala.inline
    def setReturnPropertyQuota(value: Boolean): Self = this.set("returnPropertyQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnPropertyQuota: Self = this.set("returnPropertyQuota", js.undefined)
  }
}

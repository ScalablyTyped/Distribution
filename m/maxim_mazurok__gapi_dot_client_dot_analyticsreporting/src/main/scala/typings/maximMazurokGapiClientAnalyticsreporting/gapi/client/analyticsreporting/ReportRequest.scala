package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportRequest extends js.Object {
  
  /**
    * Cohort group associated with this request. If there is a cohort group in the request the `ga:cohort` dimension must be present. Every [ReportRequest](#ReportRequest) within a
    * `batchGet` method must contain the same `cohortGroup` definition.
    */
  var cohortGroup: js.UndefOr[CohortGroup] = js.native
  
  /**
    * Date ranges in the request. The request can have a maximum of 2 date ranges. The response will contain a set of metric values for each combination of the dimensions for each date
    * range in the request. So, if there are two date ranges, there will be two set of metric values, one for the original date range and one for the second date range. The
    * `reportRequest.dateRanges` field should not be specified for cohorts or Lifetime value requests. If a date range is not provided, the default date range is (startDate: current date
    * - 7 days, endDate: current date - 1 day). Every [ReportRequest](#ReportRequest) within a `batchGet` method must contain the same `dateRanges` definition.
    */
  var dateRanges: js.UndefOr[js.Array[DateRange]] = js.native
  
  /**
    * The dimension filter clauses for filtering Dimension Values. They are logically combined with the `AND` operator. Note that filtering occurs before any dimensions are aggregated, so
    * that the returned metrics represent the total for only the relevant dimensions.
    */
  var dimensionFilterClauses: js.UndefOr[js.Array[DimensionFilterClause]] = js.native
  
  /** The dimensions requested. Requests can have a total of 9 dimensions. */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  
  /**
    * Dimension or metric filters that restrict the data returned for your request. To use the `filtersExpression`, supply a dimension or metric on which to filter, followed by the filter
    * expression. For example, the following expression selects `ga:browser` dimension which starts with Firefox; `ga:browser=~^Firefox`. For more information on dimensions and metric
    * filters, see [Filters reference](https://developers.google.com/analytics/devguides/reporting/core/v3/reference#filters).
    */
  var filtersExpression: js.UndefOr[String] = js.native
  
  /** If set to true, hides the total of all metrics for all the matching rows, for every date range. The default false and will return the totals. */
  var hideTotals: js.UndefOr[Boolean] = js.native
  
  /** If set to true, hides the minimum and maximum across all matching rows. The default is false and the value ranges are returned. */
  var hideValueRanges: js.UndefOr[Boolean] = js.native
  
  /** If set to false, the response does not include rows if all the retrieved metrics are equal to zero. The default is false which will exclude these rows. */
  var includeEmptyRows: js.UndefOr[Boolean] = js.native
  
  /**
    * The metric filter clauses. They are logically combined with the `AND` operator. Metric filters look at only the first date range and not the comparing date range. Note that
    * filtering on metrics occurs after the metrics are aggregated.
    */
  var metricFilterClauses: js.UndefOr[js.Array[MetricFilterClause]] = js.native
  
  /** The metrics requested. Requests must specify at least one metric. Requests can have a total of 10 metrics. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  
  /** Sort order on output rows. To compare two rows, the elements of the following are applied in order until a difference is found. All date ranges in the output get the same row order. */
  var orderBys: js.UndefOr[js.Array[OrderBy]] = js.native
  
  /**
    * Page size is for paging and specifies the maximum number of returned rows. Page size should be >= 0. A query returns the default of 1,000 rows. The Analytics Core Reporting API
    * returns a maximum of 100,000 rows per request, no matter how many you ask for. It can also return fewer rows than requested, if there aren't as many dimension segments as you
    * expect. For instance, there are fewer than 300 possible values for `ga:country`, so when segmenting only by country, you can't get more than 300 rows, even if you set `pageSize` to
    * a higher value.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * A continuation token to get the next page of the results. Adding this to the request will return the rows after the pageToken. The pageToken should be the value returned in the
    * nextPageToken parameter in the response to the GetReports request.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /** The pivot definitions. Requests can have a maximum of 2 pivots. */
  var pivots: js.UndefOr[js.Array[Pivot]] = js.native
  
  /**
    * The desired report [sample](https://support.google.com/analytics/answer/2637192) size. If the the `samplingLevel` field is unspecified the `DEFAULT` sampling level is used. Every
    * [ReportRequest](#ReportRequest) within a `batchGet` method must contain the same `samplingLevel` definition. See [developer
    * guide](/analytics/devguides/reporting/core/v4/basics#sampling) for details.
    */
  var samplingLevel: js.UndefOr[String] = js.native
  
  /**
    * Segment the data returned for the request. A segment definition helps look at a subset of the segment request. A request can contain up to four segments. Every
    * [ReportRequest](#ReportRequest) within a `batchGet` method must contain the same `segments` definition. Requests with segments must have the `ga:segment` dimension.
    */
  var segments: js.UndefOr[js.Array[Segment]] = js.native
  
  /**
    * The Analytics [view ID](https://support.google.com/analytics/answer/1009618) from which to retrieve data. Every [ReportRequest](#ReportRequest) within a `batchGet` method must
    * contain the same `viewId`.
    */
  var viewId: js.UndefOr[String] = js.native
}
object ReportRequest {
  
  @scala.inline
  def apply(): ReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRequest]
  }
  
  @scala.inline
  implicit class ReportRequestOps[Self <: ReportRequest] (val x: Self) extends AnyVal {
    
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
    def setCohortGroup(value: CohortGroup): Self = this.set("cohortGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCohortGroup: Self = this.set("cohortGroup", js.undefined)
    
    @scala.inline
    def setDateRangesVarargs(value: DateRange*): Self = this.set("dateRanges", js.Array(value :_*))
    
    @scala.inline
    def setDateRanges(value: js.Array[DateRange]): Self = this.set("dateRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRanges: Self = this.set("dateRanges", js.undefined)
    
    @scala.inline
    def setDimensionFilterClausesVarargs(value: DimensionFilterClause*): Self = this.set("dimensionFilterClauses", js.Array(value :_*))
    
    @scala.inline
    def setDimensionFilterClauses(value: js.Array[DimensionFilterClause]): Self = this.set("dimensionFilterClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionFilterClauses: Self = this.set("dimensionFilterClauses", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[Dimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setFiltersExpression(value: String): Self = this.set("filtersExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiltersExpression: Self = this.set("filtersExpression", js.undefined)
    
    @scala.inline
    def setHideTotals(value: Boolean): Self = this.set("hideTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideTotals: Self = this.set("hideTotals", js.undefined)
    
    @scala.inline
    def setHideValueRanges(value: Boolean): Self = this.set("hideValueRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideValueRanges: Self = this.set("hideValueRanges", js.undefined)
    
    @scala.inline
    def setIncludeEmptyRows(value: Boolean): Self = this.set("includeEmptyRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeEmptyRows: Self = this.set("includeEmptyRows", js.undefined)
    
    @scala.inline
    def setMetricFilterClausesVarargs(value: MetricFilterClause*): Self = this.set("metricFilterClauses", js.Array(value :_*))
    
    @scala.inline
    def setMetricFilterClauses(value: js.Array[MetricFilterClause]): Self = this.set("metricFilterClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricFilterClauses: Self = this.set("metricFilterClauses", js.undefined)
    
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
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPivotsVarargs(value: Pivot*): Self = this.set("pivots", js.Array(value :_*))
    
    @scala.inline
    def setPivots(value: js.Array[Pivot]): Self = this.set("pivots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivots: Self = this.set("pivots", js.undefined)
    
    @scala.inline
    def setSamplingLevel(value: String): Self = this.set("samplingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingLevel: Self = this.set("samplingLevel", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: Segment*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[Segment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    
    @scala.inline
    def setViewId(value: String): Self = this.set("viewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewId: Self = this.set("viewId", js.undefined)
  }
}

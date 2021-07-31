package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportRequest extends StObject {
  
  /**
    * Cohort group associated with this request. If there is a cohort group in the request the `ga:cohort` dimension must be present. Every [ReportRequest](#ReportRequest) within a
    * `batchGet` method must contain the same `cohortGroup` definition.
    */
  var cohortGroup: js.UndefOr[CohortGroup] = js.undefined
  
  /**
    * Date ranges in the request. The request can have a maximum of 2 date ranges. The response will contain a set of metric values for each combination of the dimensions for each date
    * range in the request. So, if there are two date ranges, there will be two set of metric values, one for the original date range and one for the second date range. The
    * `reportRequest.dateRanges` field should not be specified for cohorts or Lifetime value requests. If a date range is not provided, the default date range is (startDate: current date
    * - 7 days, endDate: current date - 1 day). Every [ReportRequest](#ReportRequest) within a `batchGet` method must contain the same `dateRanges` definition.
    */
  var dateRanges: js.UndefOr[js.Array[DateRange]] = js.undefined
  
  /**
    * The dimension filter clauses for filtering Dimension Values. They are logically combined with the `AND` operator. Note that filtering occurs before any dimensions are aggregated, so
    * that the returned metrics represent the total for only the relevant dimensions.
    */
  var dimensionFilterClauses: js.UndefOr[js.Array[DimensionFilterClause]] = js.undefined
  
  /** The dimensions requested. Requests can have a total of 9 dimensions. */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  
  /**
    * Dimension or metric filters that restrict the data returned for your request. To use the `filtersExpression`, supply a dimension or metric on which to filter, followed by the filter
    * expression. For example, the following expression selects `ga:browser` dimension which starts with Firefox; `ga:browser=~^Firefox`. For more information on dimensions and metric
    * filters, see [Filters reference](https://developers.google.com/analytics/devguides/reporting/core/v3/reference#filters).
    */
  var filtersExpression: js.UndefOr[String] = js.undefined
  
  /** If set to true, hides the total of all metrics for all the matching rows, for every date range. The default false and will return the totals. */
  var hideTotals: js.UndefOr[Boolean] = js.undefined
  
  /** If set to true, hides the minimum and maximum across all matching rows. The default is false and the value ranges are returned. */
  var hideValueRanges: js.UndefOr[Boolean] = js.undefined
  
  /** If set to false, the response does not include rows if all the retrieved metrics are equal to zero. The default is false which will exclude these rows. */
  var includeEmptyRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The metric filter clauses. They are logically combined with the `AND` operator. Metric filters look at only the first date range and not the comparing date range. Note that
    * filtering on metrics occurs after the metrics are aggregated.
    */
  var metricFilterClauses: js.UndefOr[js.Array[MetricFilterClause]] = js.undefined
  
  /** The metrics requested. Requests must specify at least one metric. Requests can have a total of 10 metrics. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  
  /** Sort order on output rows. To compare two rows, the elements of the following are applied in order until a difference is found. All date ranges in the output get the same row order. */
  var orderBys: js.UndefOr[js.Array[OrderBy]] = js.undefined
  
  /**
    * Page size is for paging and specifies the maximum number of returned rows. Page size should be >= 0. A query returns the default of 1,000 rows. The Analytics Core Reporting API
    * returns a maximum of 100,000 rows per request, no matter how many you ask for. It can also return fewer rows than requested, if there aren't as many dimension segments as you
    * expect. For instance, there are fewer than 300 possible values for `ga:country`, so when segmenting only by country, you can't get more than 300 rows, even if you set `pageSize` to
    * a higher value.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A continuation token to get the next page of the results. Adding this to the request will return the rows after the pageToken. The pageToken should be the value returned in the
    * nextPageToken parameter in the response to the GetReports request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** The pivot definitions. Requests can have a maximum of 2 pivots. */
  var pivots: js.UndefOr[js.Array[Pivot]] = js.undefined
  
  /**
    * The desired report [sample](https://support.google.com/analytics/answer/2637192) size. If the the `samplingLevel` field is unspecified the `DEFAULT` sampling level is used. Every
    * [ReportRequest](#ReportRequest) within a `batchGet` method must contain the same `samplingLevel` definition. See [developer
    * guide](/analytics/devguides/reporting/core/v4/basics#sampling) for details.
    */
  var samplingLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Segment the data returned for the request. A segment definition helps look at a subset of the segment request. A request can contain up to four segments. Every
    * [ReportRequest](#ReportRequest) within a `batchGet` method must contain the same `segments` definition. Requests with segments must have the `ga:segment` dimension.
    */
  var segments: js.UndefOr[js.Array[Segment]] = js.undefined
  
  /**
    * The Analytics [view ID](https://support.google.com/analytics/answer/1009618) from which to retrieve data. Every [ReportRequest](#ReportRequest) within a `batchGet` method must
    * contain the same `viewId`.
    */
  var viewId: js.UndefOr[String] = js.undefined
}
object ReportRequest {
  
  @scala.inline
  def apply(): ReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRequest]
  }
  
  @scala.inline
  implicit class ReportRequestMutableBuilder[Self <: ReportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCohortGroup(value: CohortGroup): Self = StObject.set(x, "cohortGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCohortGroupUndefined: Self = StObject.set(x, "cohortGroup", js.undefined)
    
    @scala.inline
    def setDateRanges(value: js.Array[DateRange]): Self = StObject.set(x, "dateRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangesUndefined: Self = StObject.set(x, "dateRanges", js.undefined)
    
    @scala.inline
    def setDateRangesVarargs(value: DateRange*): Self = StObject.set(x, "dateRanges", js.Array(value :_*))
    
    @scala.inline
    def setDimensionFilterClauses(value: js.Array[DimensionFilterClause]): Self = StObject.set(x, "dimensionFilterClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFilterClausesUndefined: Self = StObject.set(x, "dimensionFilterClauses", js.undefined)
    
    @scala.inline
    def setDimensionFilterClausesVarargs(value: DimensionFilterClause*): Self = StObject.set(x, "dimensionFilterClauses", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setFiltersExpression(value: String): Self = StObject.set(x, "filtersExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersExpressionUndefined: Self = StObject.set(x, "filtersExpression", js.undefined)
    
    @scala.inline
    def setHideTotals(value: Boolean): Self = StObject.set(x, "hideTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideTotalsUndefined: Self = StObject.set(x, "hideTotals", js.undefined)
    
    @scala.inline
    def setHideValueRanges(value: Boolean): Self = StObject.set(x, "hideValueRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideValueRangesUndefined: Self = StObject.set(x, "hideValueRanges", js.undefined)
    
    @scala.inline
    def setIncludeEmptyRows(value: Boolean): Self = StObject.set(x, "includeEmptyRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeEmptyRowsUndefined: Self = StObject.set(x, "includeEmptyRows", js.undefined)
    
    @scala.inline
    def setMetricFilterClauses(value: js.Array[MetricFilterClause]): Self = StObject.set(x, "metricFilterClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricFilterClausesUndefined: Self = StObject.set(x, "metricFilterClauses", js.undefined)
    
    @scala.inline
    def setMetricFilterClausesVarargs(value: MetricFilterClause*): Self = StObject.set(x, "metricFilterClauses", js.Array(value :_*))
    
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
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPivots(value: js.Array[Pivot]): Self = StObject.set(x, "pivots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotsUndefined: Self = StObject.set(x, "pivots", js.undefined)
    
    @scala.inline
    def setPivotsVarargs(value: Pivot*): Self = StObject.set(x, "pivots", js.Array(value :_*))
    
    @scala.inline
    def setSamplingLevel(value: String): Self = StObject.set(x, "samplingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingLevelUndefined: Self = StObject.set(x, "samplingLevel", js.undefined)
    
    @scala.inline
    def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
  }
}

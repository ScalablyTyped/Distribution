package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The main request class which specifies the Reporting API request.
  */
@js.native
trait SchemaReportRequest extends js.Object {
  /**
    * Cohort group associated with this request. If there is a cohort group in
    * the request the `ga:cohort` dimension must be present. Every
    * [ReportRequest](#ReportRequest) within a `batchGet` method must contain
    * the same `cohortGroup` definition.
    */
  var cohortGroup: js.UndefOr[SchemaCohortGroup] = js.native
  /**
    * Date ranges in the request. The request can have a maximum of 2 date
    * ranges. The response will contain a set of metric values for each
    * combination of the dimensions for each date range in the request. So, if
    * there are two date ranges, there will be two set of metric values, one
    * for the original date range and one for the second date range. The
    * `reportRequest.dateRanges` field should not be specified for cohorts or
    * Lifetime value requests. If a date range is not provided, the default
    * date range is (startDate: current date - 7 days, endDate: current date -
    * 1 day). Every [ReportRequest](#ReportRequest) within a `batchGet` method
    * must contain the same `dateRanges` definition.
    */
  var dateRanges: js.UndefOr[js.Array[SchemaDateRange]] = js.native
  /**
    * The dimension filter clauses for filtering Dimension Values. They are
    * logically combined with the `AND` operator. Note that filtering occurs
    * before any dimensions are aggregated, so that the returned metrics
    * represent the total for only the relevant dimensions.
    */
  var dimensionFilterClauses: js.UndefOr[js.Array[SchemaDimensionFilterClause]] = js.native
  /**
    * The dimensions requested. Requests can have a total of 7 dimensions.
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimension]] = js.native
  /**
    * Dimension or metric filters that restrict the data returned for your
    * request. To use the `filtersExpression`, supply a dimension or metric on
    * which to filter, followed by the filter expression. For example, the
    * following expression selects `ga:browser` dimension which starts with
    * Firefox; `ga:browser=~^Firefox`. For more information on dimensions and
    * metric filters, see [Filters
    * reference](https://developers.google.com/analytics/devguides/reporting/core/v3/reference#filters).
    */
  var filtersExpression: js.UndefOr[String] = js.native
  /**
    * If set to true, hides the total of all metrics for all the matching rows,
    * for every date range. The default false and will return the totals.
    */
  var hideTotals: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, hides the minimum and maximum across all matching rows.
    * The default is false and the value ranges are returned.
    */
  var hideValueRanges: js.UndefOr[Boolean] = js.native
  /**
    * If set to false, the response does not include rows if all the retrieved
    * metrics are equal to zero. The default is false which will exclude these
    * rows.
    */
  var includeEmptyRows: js.UndefOr[Boolean] = js.native
  /**
    * The metric filter clauses. They are logically combined with the `AND`
    * operator.  Metric filters look at only the first date range and not the
    * comparing date range. Note that filtering on metrics occurs after the
    * metrics are aggregated.
    */
  var metricFilterClauses: js.UndefOr[js.Array[SchemaMetricFilterClause]] = js.native
  /**
    * The metrics requested. Requests must specify at least one metric.
    * Requests can have a total of 10 metrics.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.native
  /**
    * Sort order on output rows. To compare two rows, the elements of the
    * following are applied in order until a difference is found.  All date
    * ranges in the output get the same row order.
    */
  var orderBys: js.UndefOr[js.Array[SchemaOrderBy]] = js.native
  /**
    * Page size is for paging and specifies the maximum number of returned
    * rows. Page size should be &gt;= 0. A query returns the default of 1,000
    * rows. The Analytics Core Reporting API returns a maximum of 100,000 rows
    * per request, no matter how many you ask for. It can also return fewer
    * rows than requested, if there aren&#39;t as many dimension segments as
    * you expect. For instance, there are fewer than 300 possible values for
    * `ga:country`, so when segmenting only by country, you can&#39;t get more
    * than 300 rows, even if you set `pageSize` to a higher value.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A continuation token to get the next page of the results. Adding this to
    * the request will return the rows after the pageToken. The pageToken
    * should be the value returned in the nextPageToken parameter in the
    * response to the GetReports request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The pivot definitions. Requests can have a maximum of 2 pivots.
    */
  var pivots: js.UndefOr[js.Array[SchemaPivot]] = js.native
  /**
    * The desired report
    * [sample](https://support.google.com/analytics/answer/2637192) size. If
    * the the `samplingLevel` field is unspecified the `DEFAULT` sampling level
    * is used. Every [ReportRequest](#ReportRequest) within a `batchGet` method
    * must contain the same `samplingLevel` definition. See [developer
    * guide](/analytics/devguides/reporting/core/v4/basics#sampling)  for
    * details.
    */
  var samplingLevel: js.UndefOr[String] = js.native
  /**
    * Segment the data returned for the request. A segment definition helps
    * look at a subset of the segment request. A request can contain up to four
    * segments. Every [ReportRequest](#ReportRequest) within a `batchGet`
    * method must contain the same `segments` definition. Requests with
    * segments must have the `ga:segment` dimension.
    */
  var segments: js.UndefOr[js.Array[SchemaSegment]] = js.native
  /**
    * The Analytics [view
    * ID](https://support.google.com/analytics/answer/1009618) from which to
    * retrieve data. Every [ReportRequest](#ReportRequest) within a `batchGet`
    * method must contain the same `viewId`.
    */
  var viewId: js.UndefOr[String] = js.native
}

object SchemaReportRequest {
  @scala.inline
  def apply(
    cohortGroup: SchemaCohortGroup = null,
    dateRanges: js.Array[SchemaDateRange] = null,
    dimensionFilterClauses: js.Array[SchemaDimensionFilterClause] = null,
    dimensions: js.Array[SchemaDimension] = null,
    filtersExpression: String = null,
    hideTotals: js.UndefOr[Boolean] = js.undefined,
    hideValueRanges: js.UndefOr[Boolean] = js.undefined,
    includeEmptyRows: js.UndefOr[Boolean] = js.undefined,
    metricFilterClauses: js.Array[SchemaMetricFilterClause] = null,
    metrics: js.Array[SchemaMetric] = null,
    orderBys: js.Array[SchemaOrderBy] = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    pivots: js.Array[SchemaPivot] = null,
    samplingLevel: String = null,
    segments: js.Array[SchemaSegment] = null,
    viewId: String = null
  ): SchemaReportRequest = {
    val __obj = js.Dynamic.literal()
    if (cohortGroup != null) __obj.updateDynamic("cohortGroup")(cohortGroup.asInstanceOf[js.Any])
    if (dateRanges != null) __obj.updateDynamic("dateRanges")(dateRanges.asInstanceOf[js.Any])
    if (dimensionFilterClauses != null) __obj.updateDynamic("dimensionFilterClauses")(dimensionFilterClauses.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (filtersExpression != null) __obj.updateDynamic("filtersExpression")(filtersExpression.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTotals)) __obj.updateDynamic("hideTotals")(hideTotals.asInstanceOf[js.Any])
    if (!js.isUndefined(hideValueRanges)) __obj.updateDynamic("hideValueRanges")(hideValueRanges.asInstanceOf[js.Any])
    if (!js.isUndefined(includeEmptyRows)) __obj.updateDynamic("includeEmptyRows")(includeEmptyRows.asInstanceOf[js.Any])
    if (metricFilterClauses != null) __obj.updateDynamic("metricFilterClauses")(metricFilterClauses.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (orderBys != null) __obj.updateDynamic("orderBys")(orderBys.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (pivots != null) __obj.updateDynamic("pivots")(pivots.asInstanceOf[js.Any])
    if (samplingLevel != null) __obj.updateDynamic("samplingLevel")(samplingLevel.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (viewId != null) __obj.updateDynamic("viewId")(viewId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportRequest]
  }
}


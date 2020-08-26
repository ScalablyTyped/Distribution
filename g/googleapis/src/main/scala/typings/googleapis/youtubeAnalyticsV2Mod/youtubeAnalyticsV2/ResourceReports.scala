package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtubeAnalytics/v2", "youtubeAnalytics_v2.Resource$Reports")
@js.native
class ResourceReports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtubeAnalytics.reports.query
    * @desc Retrieve your YouTube Analytics reports.
    * @alias youtubeAnalytics.reports.query
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.currency The currency to which financial metrics should be converted. The default is US Dollar (USD). If the result contains no financial metrics, this flag will be ignored. Responds with an error if the specified currency is not recognized.", pattern: [A-Z]{3}
    * @param {string=} params.dimensions A comma-separated list of YouTube Analytics dimensions, such as `views` or `ageGroup,gender`. See the [Available Reports](/youtube/analytics/v2/available_reports) document for a list of the reports that you can retrieve and the dimensions used for those reports. Also see the [Dimensions](/youtube/analytics/v2/dimsmets/dims) document for definitions of those dimensions." pattern: [0-9a-zA-Z,]+
    * @param {string=} params.endDate The end date for fetching YouTube Analytics data. The value should be in `YYYY-MM-DD` format. required: true, pattern: [0-9]{4}-[0-9]{2}-[0-9]{2}
    * @param {string=} params.filters A list of filters that should be applied when retrieving YouTube Analytics data. The [Available Reports](/youtube/analytics/v2/available_reports) document identifies the dimensions that can be used to filter each report, and the [Dimensions](/youtube/analytics/v2/dimsmets/dims)  document defines those dimensions. If a request uses multiple filters, join them together with a semicolon (`;`), and the returned result table will satisfy both filters. For example, a filters parameter value of `video==dMH0bHeiRNg;country==IT` restricts the result set to include data for the given video in Italy.",
    * @param {string=} params.ids Identifies the YouTube channel or content owner for which you are retrieving YouTube Analytics data.  - To request data for a YouTube user, set the `ids` parameter value to   `channel==CHANNEL_ID`, where `CHANNEL_ID` specifies the unique YouTube   channel ID. - To request data for a YouTube CMS content owner, set the `ids` parameter   value to `contentOwner==OWNER_NAME`, where `OWNER_NAME` is the CMS name   of the content owner. required: true, pattern: [a-zA-Z]+==[a-zA-Z0-9_+-]+
    * @param {boolean=} params.includeHistoricalChannelData If set to true historical data (i.e. channel data from before the linking of the channel to the content owner) will be retrieved.",
    * @param {integer=} params.maxResults The maximum number of rows to include in the response.", minValue: 1
    * @param {string=} params.metrics A comma-separated list of YouTube Analytics metrics, such as `views` or `likes,dislikes`. See the [Available Reports](/youtube/analytics/v2/available_reports)  document for a list of the reports that you can retrieve and the metrics available in each report, and see the [Metrics](/youtube/analytics/v2/dimsmets/mets) document for definitions of those metrics. required: true, pattern: [0-9a-zA-Z,]+
    * @param {string=} params.sort A comma-separated list of dimensions or metrics that determine the sort order for YouTube Analytics data. By default the sort order is ascending. The '`-`' prefix causes descending sort order.", pattern: [-0-9a-zA-Z,]+
    * @param {string=} params.startDate The start date for fetching YouTube Analytics data. The value should be in `YYYY-MM-DD` format. required: true, pattern: "[0-9]{4}-[0-9]{2}-[0-9]{2}
    * @param {integer=} params.startIndex An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter (one-based, inclusive).", minValue: 1
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def query(): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(callback: BodyResponseCallback[SchemaQueryResponse]): Unit = js.native
  def query(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(params: ParamsResourceReportsQuery): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(params: ParamsResourceReportsQuery, callback: BodyResponseCallback[SchemaQueryResponse]): Unit = js.native
  def query(
    params: ParamsResourceReportsQuery,
    options: BodyResponseCallback[SchemaQueryResponse],
    callback: BodyResponseCallback[SchemaQueryResponse]
  ): Unit = js.native
  def query(params: ParamsResourceReportsQuery, options: MethodOptions): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(
    params: ParamsResourceReportsQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueryResponse]
  ): Unit = js.native
}


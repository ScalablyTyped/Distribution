package typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtubeAnalytics/v1beta1", "youtubeAnalytics_v1beta1.Resource$Reports")
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
    * @param {string=} params.currency The currency to which financial metrics should be converted. The default is US Dollar (USD). If the result contains no financial metrics, this flag will be ignored. Responds with an error if the specified currency is not recognized.
    * @param {string=} params.dimensions A comma-separated list of YouTube Analytics dimensions, such as views or ageGroup,gender. See the Available Reports document for a list of the reports that you can retrieve and the dimensions used for those reports. Also see the Dimensions document for definitions of those dimensions.
    * @param {string} params.end-date The end date for fetching YouTube Analytics data. The value should be in YYYY-MM-DD format.
    * @param {string=} params.filters A list of filters that should be applied when retrieving YouTube Analytics data. The Available Reports document identifies the dimensions that can be used to filter each report, and the Dimensions document defines those dimensions. If a request uses multiple filters, join them together with a semicolon (;), and the returned result table will satisfy both filters. For example, a filters parameter value of video==dMH0bHeiRNg;country==IT restricts the result set to include data for the given video in Italy.
    * @param {string} params.ids Identifies the YouTube channel or content owner for which you are retrieving YouTube Analytics data. - To request data for a YouTube user, set the ids parameter value to channel==CHANNEL_ID, where CHANNEL_ID specifies the unique YouTube channel ID. - To request data for a YouTube CMS content owner, set the ids parameter value to contentOwner==OWNER_NAME, where OWNER_NAME is the CMS name of the content owner.
    * @param {boolean=} params.include-historical-channel-data If set to true historical data (i.e. channel data from before the linking of the channel to the content owner) will be retrieved.
    * @param {integer=} params.max-results The maximum number of rows to include in the response.
    * @param {string} params.metrics A comma-separated list of YouTube Analytics metrics, such as views or likes,dislikes. See the Available Reports document for a list of the reports that you can retrieve and the metrics available in each report, and see the Metrics document for definitions of those metrics.
    * @param {string=} params.sort A comma-separated list of dimensions or metrics that determine the sort order for YouTube Analytics data. By default the sort order is ascending. The '-' prefix causes descending sort order.
    * @param {string} params.start-date The start date for fetching YouTube Analytics data. The value should be in YYYY-MM-DD format.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter (one-based, inclusive).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def query(): GaxiosPromise[SchemaResultTable] = js.native
  def query(callback: BodyResponseCallback[SchemaResultTable]): Unit = js.native
  def query(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaResultTable] = js.native
  def query(params: ParamsResourceReportsQuery): GaxiosPromise[SchemaResultTable] = js.native
  def query(params: ParamsResourceReportsQuery, callback: BodyResponseCallback[SchemaResultTable]): Unit = js.native
  def query(
    params: ParamsResourceReportsQuery,
    options: BodyResponseCallback[SchemaResultTable],
    callback: BodyResponseCallback[SchemaResultTable]
  ): Unit = js.native
  def query(params: ParamsResourceReportsQuery, options: MethodOptions): GaxiosPromise[SchemaResultTable] = js.native
  def query(
    params: ParamsResourceReportsQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResultTable]
  ): Unit = js.native
}


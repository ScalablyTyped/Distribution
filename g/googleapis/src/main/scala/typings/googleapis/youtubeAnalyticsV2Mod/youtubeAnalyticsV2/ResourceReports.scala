package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtubeAnalytics/v2", "youtubeAnalytics_v2.Resource$Reports")
@js.native
open class ResourceReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def query(): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(callback: BodyResponseCallback[SchemaQueryResponse]): Unit = js.native
  def query(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(params: ParamsResourceReportsQuery): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(params: ParamsResourceReportsQuery, callback: BodyResponseCallback[SchemaQueryResponse]): Unit = js.native
  def query(
    params: ParamsResourceReportsQuery,
    options: BodyResponseCallback[Readable | SchemaQueryResponse],
    callback: BodyResponseCallback[Readable | SchemaQueryResponse]
  ): Unit = js.native
  def query(params: ParamsResourceReportsQuery, options: MethodOptions): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(
    params: ParamsResourceReportsQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueryResponse]
  ): Unit = js.native
  /**
    * Retrieve your YouTube Analytics reports.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtubeAnalytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtubeAnalytics = google.youtubeAnalytics('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube',
    *       'https://www.googleapis.com/auth/youtube.readonly',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *       'https://www.googleapis.com/auth/yt-analytics-monetary.readonly',
    *       'https://www.googleapis.com/auth/yt-analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtubeAnalytics.reports.query({
    *     // The currency to which financial metrics should be converted. The default is US Dollar (USD). If the result contains no financial metrics, this flag will be ignored. Responds with an error if the specified currency is not recognized.", pattern: [A-Z]{3\}
    *     currency: 'placeholder-value',
    *     // A comma-separated list of YouTube Analytics dimensions, such as `views` or `ageGroup,gender`. See the [Available Reports](/youtube/analytics/v2/available_reports) document for a list of the reports that you can retrieve and the dimensions used for those reports. Also see the [Dimensions](/youtube/analytics/v2/dimsmets/dims) document for definitions of those dimensions." pattern: [0-9a-zA-Z,]+
    *     dimensions: 'placeholder-value',
    *     // The end date for fetching YouTube Analytics data. The value should be in `YYYY-MM-DD` format. required: true, pattern: [0-9]{4\}-[0-9]{2\}-[0-9]{2\}
    *     endDate: 'placeholder-value',
    *     // A list of filters that should be applied when retrieving YouTube Analytics data. The [Available Reports](/youtube/analytics/v2/available_reports) document identifies the dimensions that can be used to filter each report, and the [Dimensions](/youtube/analytics/v2/dimsmets/dims) document defines those dimensions. If a request uses multiple filters, join them together with a semicolon (`;`), and the returned result table will satisfy both filters. For example, a filters parameter value of `video==dMH0bHeiRNg;country==IT` restricts the result set to include data for the given video in Italy.",
    *     filters: 'placeholder-value',
    *     // Identifies the YouTube channel or content owner for which you are retrieving YouTube Analytics data. - To request data for a YouTube user, set the `ids` parameter value to `channel==CHANNEL_ID`, where `CHANNEL_ID` specifies the unique YouTube channel ID. - To request data for a YouTube CMS content owner, set the `ids` parameter value to `contentOwner==OWNER_NAME`, where `OWNER_NAME` is the CMS name of the content owner. required: true, pattern: [a-zA-Z]+==[a-zA-Z0-9_+-]+
    *     ids: 'placeholder-value',
    *     // If set to true historical data (i.e. channel data from before the linking of the channel to the content owner) will be retrieved.",
    *     includeHistoricalChannelData: 'placeholder-value',
    *     // The maximum number of rows to include in the response.", minValue: 1
    *     maxResults: 'placeholder-value',
    *     // A comma-separated list of YouTube Analytics metrics, such as `views` or `likes,dislikes`. See the [Available Reports](/youtube/analytics/v2/available_reports) document for a list of the reports that you can retrieve and the metrics available in each report, and see the [Metrics](/youtube/analytics/v2/dimsmets/mets) document for definitions of those metrics. required: true, pattern: [0-9a-zA-Z,]+
    *     metrics: 'placeholder-value',
    *     // A comma-separated list of dimensions or metrics that determine the sort order for YouTube Analytics data. By default the sort order is ascending. The '`-`' prefix causes descending sort order.", pattern: [-0-9a-zA-Z,]+
    *     sort: 'placeholder-value',
    *     // The start date for fetching YouTube Analytics data. The value should be in `YYYY-MM-DD` format. required: true, pattern: "[0-9]{4\}-[0-9]{2\}-[0-9]{2\}
    *     startDate: 'placeholder-value',
    *     // An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter (one-based, inclusive).", minValue: 1
    *     startIndex: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "columnHeaders": [],
    *   //   "errors": {},
    *   //   "kind": "my_kind",
    *   //   "rows": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def query(params: ParamsResourceReportsQuery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def query(
    params: ParamsResourceReportsQuery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

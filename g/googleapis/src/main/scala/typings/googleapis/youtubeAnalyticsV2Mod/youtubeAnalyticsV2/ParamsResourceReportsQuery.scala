package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceReportsQuery extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The currency to which financial metrics should be converted. The default
    * is US Dollar (USD). If the result contains no financial metrics, this
    * flag will be ignored. Responds with an error if the specified currency is
    * not recognized.", pattern: [A-Z]{3}
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of YouTube Analytics dimensions, such as `views`
    * or `ageGroup,gender`. See the [Available
    * Reports](/youtube/analytics/v2/available_reports) document for a list of
    * the reports that you can retrieve and the dimensions used for those
    * reports. Also see the [Dimensions](/youtube/analytics/v2/dimsmets/dims)
    * document for definitions of those dimensions." pattern: [0-9a-zA-Z,]+
    */
  var dimensions: js.UndefOr[String] = js.native
  /**
    * The end date for fetching YouTube Analytics data. The value should be in
    * `YYYY-MM-DD` format. required: true, pattern: [0-9]{4}-[0-9]{2}-[0-9]{2}
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * A list of filters that should be applied when retrieving YouTube
    * Analytics data. The [Available
    * Reports](/youtube/analytics/v2/available_reports) document identifies the
    * dimensions that can be used to filter each report, and the
    * [Dimensions](/youtube/analytics/v2/dimsmets/dims)  document defines those
    * dimensions. If a request uses multiple filters, join them together with a
    * semicolon (`;`), and the returned result table will satisfy both filters.
    * For example, a filters parameter value of
    * `video==dMH0bHeiRNg;country==IT` restricts the result set to include data
    * for the given video in Italy.",
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Identifies the YouTube channel or content owner for which you are
    * retrieving YouTube Analytics data.  - To request data for a YouTube user,
    * set the `ids` parameter value to   `channel==CHANNEL_ID`, where
    * `CHANNEL_ID` specifies the unique YouTube   channel ID. - To request data
    * for a YouTube CMS content owner, set the `ids` parameter   value to
    * `contentOwner==OWNER_NAME`, where `OWNER_NAME` is the CMS name   of the
    * content owner. required: true, pattern: [a-zA-Z]+==[a-zA-Z0-9_+-]+
    */
  var ids: js.UndefOr[String] = js.native
  /**
    * If set to true historical data (i.e. channel data from before the linking
    * of the channel to the content owner) will be retrieved.",
    */
  var includeHistoricalChannelData: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of rows to include in the response.", minValue: 1
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * A comma-separated list of YouTube Analytics metrics, such as `views` or
    * `likes,dislikes`. See the [Available
    * Reports](/youtube/analytics/v2/available_reports)  document for a list of
    * the reports that you can retrieve and the metrics available in each
    * report, and see the [Metrics](/youtube/analytics/v2/dimsmets/mets)
    * document for definitions of those metrics. required: true, pattern:
    * [0-9a-zA-Z,]+
    */
  var metrics: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of dimensions or metrics that determine the sort
    * order for YouTube Analytics data. By default the sort order is ascending.
    * The '`-`' prefix causes descending sort order.", pattern: [-0-9a-zA-Z,]+
    */
  var sort: js.UndefOr[String] = js.native
  /**
    * The start date for fetching YouTube Analytics data. The value should be
    * in `YYYY-MM-DD` format. required: true, pattern:
    * "[0-9]{4}-[0-9]{2}-[0-9]{2}
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * An index of the first entity to retrieve. Use this parameter as a
    * pagination mechanism along with the max-results parameter (one-based,
    * inclusive).", minValue: 1
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object ParamsResourceReportsQuery {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    currency: String = null,
    dimensions: String = null,
    endDate: String = null,
    fields: String = null,
    filters: String = null,
    ids: String = null,
    includeHistoricalChannelData: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    metrics: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    sort: String = null,
    startDate: String = null,
    startIndex: js.UndefOr[Double] = js.undefined,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceReportsQuery = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (!js.isUndefined(includeHistoricalChannelData)) __obj.updateDynamic("includeHistoricalChannelData")(includeHistoricalChannelData.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceReportsQuery]
  }
}


package typings.googleapis.youtubeAnalyticsV1Mod.youtubeAnalyticsV1

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
    * not recognized.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of YouTube Analytics dimensions, such as views or
    * ageGroup,gender. See the Available Reports document for a list of the
    * reports that you can retrieve and the dimensions used for those reports.
    * Also see the Dimensions document for definitions of those dimensions.
    */
  var dimensions: js.UndefOr[String] = js.native
  /**
    * The end date for fetching YouTube Analytics data. The value should be in
    * YYYY-MM-DD format.
    */
  var `end-date`: js.UndefOr[String] = js.native
  /**
    * A list of filters that should be applied when retrieving YouTube
    * Analytics data. The Available Reports document identifies the dimensions
    * that can be used to filter each report, and the Dimensions document
    * defines those dimensions. If a request uses multiple filters, join them
    * together with a semicolon (;), and the returned result table will satisfy
    * both filters. For example, a filters parameter value of
    * video==dMH0bHeiRNg;country==IT restricts the result set to include data
    * for the given video in Italy.
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Identifies the YouTube channel or content owner for which you are
    * retrieving YouTube Analytics data. - To request data for a YouTube user,
    * set the ids parameter value to channel==CHANNEL_ID, where CHANNEL_ID
    * specifies the unique YouTube channel ID. - To request data for a YouTube
    * CMS content owner, set the ids parameter value to
    * contentOwner==OWNER_NAME, where OWNER_NAME is the CMS name of the content
    * owner.
    */
  var ids: js.UndefOr[String] = js.native
  /**
    * If set to true historical data (i.e. channel data from before the linking
    * of the channel to the content owner) will be retrieved.
    */
  var `include-historical-channel-data`: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of rows to include in the response.
    */
  var `max-results`: js.UndefOr[Double] = js.native
  /**
    * A comma-separated list of YouTube Analytics metrics, such as views or
    * likes,dislikes. See the Available Reports document for a list of the
    * reports that you can retrieve and the metrics available in each report,
    * and see the Metrics document for definitions of those metrics.
    */
  var metrics: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of dimensions or metrics that determine the sort
    * order for YouTube Analytics data. By default the sort order is ascending.
    * The '-' prefix causes descending sort order.
    */
  var sort: js.UndefOr[String] = js.native
  /**
    * The start date for fetching YouTube Analytics data. The value should be
    * in YYYY-MM-DD format.
    */
  var `start-date`: js.UndefOr[String] = js.native
  /**
    * An index of the first entity to retrieve. Use this parameter as a
    * pagination mechanism along with the max-results parameter (one-based,
    * inclusive).
    */
  var `start-index`: js.UndefOr[Double] = js.native
}

object ParamsResourceReportsQuery {
  @scala.inline
  def apply(): ParamsResourceReportsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsQuery]
  }
  @scala.inline
  implicit class ParamsResourceReportsQueryOps[Self <: ParamsResourceReportsQuery] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setDimensions(value: String): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def `setEnd-date`(value: String): Self = this.set("end-date", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteEnd-date`: Self = this.set("end-date", js.undefined)
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setIds(value: String): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def `setInclude-historical-channel-data`(value: Boolean): Self = this.set("include-historical-channel-data", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInclude-historical-channel-data`: Self = this.set("include-historical-channel-data", js.undefined)
    @scala.inline
    def `setMax-results`(value: Double): Self = this.set("max-results", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-results`: Self = this.set("max-results", js.undefined)
    @scala.inline
    def setMetrics(value: String): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def `setStart-date`(value: String): Self = this.set("start-date", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStart-date`: Self = this.set("start-date", js.undefined)
    @scala.inline
    def `setStart-index`(value: Double): Self = this.set("start-index", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStart-index`: Self = this.set("start-index", js.undefined)
  }
  
}


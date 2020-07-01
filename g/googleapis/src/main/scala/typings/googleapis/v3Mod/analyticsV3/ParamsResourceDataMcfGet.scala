package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceDataMcfGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A comma-separated list of Multi-Channel Funnels dimensions. E.g.,
    * 'mcf:source,mcf:medium'.
    */
  var dimensions: js.UndefOr[String] = js.native
  /**
    * End date for fetching Analytics data. Requests can specify a start date
    * formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday,
    * or 7daysAgo). The default value is 7daysAgo.
    */
  var `end-date`: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of dimension or metric filters to be applied to
    * the Analytics data.
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Unique table ID for retrieving Analytics data. Table ID is of the form
    * ga:XXXX, where XXXX is the Analytics view (profile) ID.
    */
  var ids: js.UndefOr[String] = js.native
  /**
    * The maximum number of entries to include in this feed.
    */
  var `max-results`: js.UndefOr[Double] = js.native
  /**
    * A comma-separated list of Multi-Channel Funnels metrics. E.g.,
    * 'mcf:totalConversions,mcf:totalConversionValue'. At least one metric must
    * be specified.
    */
  var metrics: js.UndefOr[String] = js.native
  /**
    * The desired sampling level.
    */
  var samplingLevel: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of dimensions or metrics that determine the sort
    * order for the Analytics data.
    */
  var sort: js.UndefOr[String] = js.native
  /**
    * Start date for fetching Analytics data. Requests can specify a start date
    * formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday,
    * or 7daysAgo). The default value is 7daysAgo.
    */
  var `start-date`: js.UndefOr[String] = js.native
  /**
    * An index of the first entity to retrieve. Use this parameter as a
    * pagination mechanism along with the max-results parameter.
    */
  var `start-index`: js.UndefOr[Double] = js.native
}

object ParamsResourceDataMcfGet {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    dimensions: String = null,
    `end-date`: String = null,
    fields: String = null,
    filters: String = null,
    ids: String = null,
    key: String = null,
    `max-results`: js.UndefOr[Double] = js.undefined,
    metrics: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    samplingLevel: String = null,
    sort: String = null,
    `start-date`: String = null,
    `start-index`: js.UndefOr[Double] = js.undefined,
    userIp: String = null
  ): ParamsResourceDataMcfGet = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (`end-date` != null) __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(`max-results`)) __obj.updateDynamic("max-results")(`max-results`.get.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (samplingLevel != null) __obj.updateDynamic("samplingLevel")(samplingLevel.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`start-date` != null) __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
    if (!js.isUndefined(`start-index`)) __obj.updateDynamic("start-index")(`start-index`.get.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceDataMcfGet]
  }
}


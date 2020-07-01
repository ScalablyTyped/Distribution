package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEntityusagereportsGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Represents the customer for which the data is to be fetched.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Represents the date in yyyy-mm-dd format for which the data is to be
    * fetched.
    */
  var date: js.UndefOr[String] = js.native
  /**
    * Represents the key of object for which the data should be filtered.
    */
  var entityKey: js.UndefOr[String] = js.native
  /**
    * Type of object. Should be one of - gplus_communities.
    */
  var entityType: js.UndefOr[String] = js.native
  /**
    * Represents the set of filters including parameter operator value.
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return. Maximum allowed is 1000
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Token to specify next page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Represents the application name, parameter name pairs to fetch in csv as
    * app_name1:param_name1, app_name2:param_name2.
    */
  var parameters: js.UndefOr[String] = js.native
}

object ParamsResourceEntityusagereportsGet {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    customerId: String = null,
    date: String = null,
    entityKey: String = null,
    entityType: String = null,
    fields: String = null,
    filters: String = null,
    key: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    oauth_token: String = null,
    pageToken: String = null,
    parameters: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): ParamsResourceEntityusagereportsGet = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (entityKey != null) __obj.updateDynamic("entityKey")(entityKey.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceEntityusagereportsGet]
  }
}


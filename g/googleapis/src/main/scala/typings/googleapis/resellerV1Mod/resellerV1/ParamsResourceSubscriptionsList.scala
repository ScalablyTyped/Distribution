package typings.googleapis.resellerV1Mod.resellerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSubscriptionsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The customerAuthToken query string is required when creating a resold
    * account that transfers a direct customer's subscription or transfers
    * another reseller customer's subscription to your reseller management.
    * This is a hexadecimal authentication token needed to complete the
    * subscription transfer. For more information, see the administrator help
    * center.
    */
  var customerAuthToken: js.UndefOr[String] = js.native
  /**
    * Either the customer's primary domain name or the customer's unique
    * identifier. If using the domain name, we do not recommend using a
    * customerId as a key for persistent data. If the domain name for a
    * customerId is changed, the Google system automatically updates.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * When retrieving all of your subscriptions and filtering for specific
    * customers, you can enter a prefix for a customer name. Using an example
    * customer group that includes exam.com, example20.com and example.com:   -
    * exa -- Returns all customer names that start with 'exa' which could
    * include exam.com, example20.com, and example.com. A name prefix is
    * similar to using a regular expression's asterisk, exa*.  - example --
    * Returns example20.com and example.com.
    */
  var customerNamePrefix: js.UndefOr[String] = js.native
  /**
    * When retrieving a large list, the maxResults is the maximum number of
    * results per page. The nextPageToken value takes you to the next page. The
    * default is 20.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Token to specify next page in the list
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceSubscriptionsList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    customerAuthToken: String = null,
    customerId: String = null,
    customerNamePrefix: String = null,
    fields: String = null,
    key: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): ParamsResourceSubscriptionsList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (customerAuthToken != null) __obj.updateDynamic("customerAuthToken")(customerAuthToken.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (customerNamePrefix != null) __obj.updateDynamic("customerNamePrefix")(customerNamePrefix.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceSubscriptionsList]
  }
}


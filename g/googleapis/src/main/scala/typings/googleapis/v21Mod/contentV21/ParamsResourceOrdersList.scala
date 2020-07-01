package typings.googleapis.v21Mod.contentV21

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrdersList extends StandardParameters {
  /**
    * Obtains orders that match the acknowledgement status. When set to true,
    * obtains orders that have been acknowledged. When false, obtains orders
    * that have not been acknowledged. We recommend using this filter set to
    * false, in conjunction with the acknowledge call, such that only
    * un-acknowledged orders are returned.
    */
  var acknowledged: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of orders to return in the response, used for paging.
    * The default value is 25 orders per page, and the maximum allowed value is
    * 250 orders per page. Known issue: All List calls will return all Orders
    * without limit regardless of the value of this field.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The ID of the account that manages the order. This cannot be a
    * multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.native
  /**
    * The ordering of the returned list. The only supported value are
    * placedDate desc and placedDate asc for now, which returns orders sorted
    * by placement date. "placedDate desc" stands for listing orders by
    * placement date, from oldest to most recent. "placedDate asc" stands for
    * listing orders by placement date, from most recent to oldest. In future
    * releases we'll support other sorting criteria.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Obtains orders placed before this date (exclusively), in ISO 8601 format.
    */
  var placedDateEnd: js.UndefOr[String] = js.native
  /**
    * Obtains orders placed after this date (inclusively), in ISO 8601 format.
    */
  var placedDateStart: js.UndefOr[String] = js.native
  /**
    * Obtains orders that match any of the specified statuses. Multiple values
    * can be specified with comma separation. Additionally, please note that
    * active is a shortcut for pendingShipment and partiallyShipped, and
    * completed is a shortcut for shipped , partiallyDelivered, delivered,
    * partiallyReturned, returned, and canceled.
    */
  var statuses: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceOrdersList {
  @scala.inline
  def apply(
    acknowledged: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    key: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    merchantId: String = null,
    oauth_token: String = null,
    orderBy: String = null,
    pageToken: String = null,
    placedDateEnd: String = null,
    placedDateStart: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    statuses: js.Array[String] = null,
    userIp: String = null
  ): ParamsResourceOrdersList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acknowledged)) __obj.updateDynamic("acknowledged")(acknowledged.get.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (placedDateEnd != null) __obj.updateDynamic("placedDateEnd")(placedDateEnd.asInstanceOf[js.Any])
    if (placedDateStart != null) __obj.updateDynamic("placedDateStart")(placedDateStart.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceOrdersList]
  }
}


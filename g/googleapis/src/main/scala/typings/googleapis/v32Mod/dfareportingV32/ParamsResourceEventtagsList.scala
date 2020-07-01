package typings.googleapis.v32Mod.dfareportingV32

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEventtagsList extends StandardParameters {
  /**
    * Select only event tags that belong to this ad.
    */
  var adId: js.UndefOr[String] = js.native
  /**
    * Select only event tags that belong to this advertiser.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only event tags that belong to this campaign.
    */
  var campaignId: js.UndefOr[String] = js.native
  /**
    * Examine only the specified campaign or advertiser's event tags for
    * matching selector criteria. When set to false, the parent advertiser and
    * parent campaign of the specified ad or campaign is examined as well. In
    * addition, when set to false, the status field is examined as well, along
    * with the enabledByDefault field. This parameter can not be set to true
    * when adId is specified as ads do not define their own even tags.
    */
  var definitionsOnly: js.UndefOr[Boolean] = js.native
  /**
    * Select only enabled event tags. What is considered enabled or disabled
    * depends on the definitionsOnly parameter. When definitionsOnly is set to
    * true, only the specified advertiser or campaign's event tags'
    * enabledByDefault field is examined. When definitionsOnly is set to false,
    * the specified ad or specified campaign's parent advertiser's or parent
    * campaign's event tags' enabledByDefault and status fields are examined as
    * well.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Select only event tags with the specified event tag types. Event tag
    * types can be used to specify whether to use a third-party pixel, a
    * third-party JavaScript URL, or a third-party click-through URL for either
    * impression or click tracking.
    */
  var eventTagTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only event tags with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Allows searching for objects by name or ID. Wildcards (*) are allowed.
    * For example, "eventtag*2015" will return objects with names like
    * "eventtag June 2015", "eventtag April 2015", or simply "eventtag 2015".
    * Most of the searches also add wildcards implicitly at the start and the
    * end of the search string. For example, a search string of "eventtag" will
    * match objects with name "my eventtag", "eventtag 2015", or simply
    * "eventtag".
    */
  var searchString: js.UndefOr[String] = js.native
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.native
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.native
}

object ParamsResourceEventtagsList {
  @scala.inline
  def apply(
    adId: String = null,
    advertiserId: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    campaignId: String = null,
    definitionsOnly: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    eventTagTypes: js.Array[String] = null,
    fields: String = null,
    ids: js.Array[String] = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    profileId: String = null,
    quotaUser: String = null,
    searchString: String = null,
    sortField: String = null,
    sortOrder: String = null,
    userIp: String = null
  ): ParamsResourceEventtagsList = {
    val __obj = js.Dynamic.literal()
    if (adId != null) __obj.updateDynamic("adId")(adId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId.asInstanceOf[js.Any])
    if (!js.isUndefined(definitionsOnly)) __obj.updateDynamic("definitionsOnly")(definitionsOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (eventTagTypes != null) __obj.updateDynamic("eventTagTypes")(eventTagTypes.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceEventtagsList]
  }
}


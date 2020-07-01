package typings.googleapis.v33Mod.dfareportingV33

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceFloodlightactivitiesList extends StandardParameters {
  /**
    * Select only floodlight activities for the specified advertiser ID. Must
    * specify either ids, advertiserId, or floodlightConfigurationId for a
    * non-empty result.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only floodlight activities with the specified floodlight activity
    * group IDs.
    */
  var floodlightActivityGroupIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only floodlight activities with the specified floodlight activity
    * group name.
    */
  var floodlightActivityGroupName: js.UndefOr[String] = js.native
  /**
    * Select only floodlight activities with the specified floodlight activity
    * group tag string.
    */
  var floodlightActivityGroupTagString: js.UndefOr[String] = js.native
  /**
    * Select only floodlight activities with the specified floodlight activity
    * group type.
    */
  var floodlightActivityGroupType: js.UndefOr[String] = js.native
  /**
    * Select only floodlight activities for the specified floodlight
    * configuration ID. Must specify either ids, advertiserId, or
    * floodlightConfigurationId for a non-empty result.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  /**
    * Select only floodlight activities with the specified IDs. Must specify
    * either ids, advertiserId, or floodlightConfigurationId for a non-empty
    * result.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Allows searching for objects by name or ID. Wildcards (*) are allowed.
    * For example, "floodlightactivity*2015" will return objects with names
    * like "floodlightactivity June 2015", "floodlightactivity April 2015", or
    * simply "floodlightactivity 2015". Most of the searches also add wildcards
    * implicitly at the start and the end of the search string. For example, a
    * search string of "floodlightactivity" will match objects with name "my
    * floodlightactivity activity", "floodlightactivity 2015", or simply
    * "floodlightactivity".
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
  /**
    * Select only floodlight activities with the specified tag string.
    */
  var tagString: js.UndefOr[String] = js.native
}

object ParamsResourceFloodlightactivitiesList {
  @scala.inline
  def apply(
    advertiserId: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    floodlightActivityGroupIds: js.Array[String] = null,
    floodlightActivityGroupName: String = null,
    floodlightActivityGroupTagString: String = null,
    floodlightActivityGroupType: String = null,
    floodlightConfigurationId: String = null,
    ids: js.Array[String] = null,
    key: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    profileId: String = null,
    quotaUser: String = null,
    searchString: String = null,
    sortField: String = null,
    sortOrder: String = null,
    tagString: String = null,
    userIp: String = null
  ): ParamsResourceFloodlightactivitiesList = {
    val __obj = js.Dynamic.literal()
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (floodlightActivityGroupIds != null) __obj.updateDynamic("floodlightActivityGroupIds")(floodlightActivityGroupIds.asInstanceOf[js.Any])
    if (floodlightActivityGroupName != null) __obj.updateDynamic("floodlightActivityGroupName")(floodlightActivityGroupName.asInstanceOf[js.Any])
    if (floodlightActivityGroupTagString != null) __obj.updateDynamic("floodlightActivityGroupTagString")(floodlightActivityGroupTagString.asInstanceOf[js.Any])
    if (floodlightActivityGroupType != null) __obj.updateDynamic("floodlightActivityGroupType")(floodlightActivityGroupType.asInstanceOf[js.Any])
    if (floodlightConfigurationId != null) __obj.updateDynamic("floodlightConfigurationId")(floodlightConfigurationId.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (tagString != null) __obj.updateDynamic("tagString")(tagString.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceFloodlightactivitiesList]
  }
}


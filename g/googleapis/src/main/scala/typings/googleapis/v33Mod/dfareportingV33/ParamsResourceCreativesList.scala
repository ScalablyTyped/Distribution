package typings.googleapis.v33Mod.dfareportingV33

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCreativesList extends StandardParameters {
  /**
    * Select only active creatives. Leave blank to select active and inactive
    * creatives.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Select only creatives with this advertiser ID.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Select only archived creatives. Leave blank to select archived and
    * unarchived creatives.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only creatives with this campaign ID.
    */
  var campaignId: js.UndefOr[String] = js.native
  /**
    * Select only in-stream video creatives with these companion IDs.
    */
  var companionCreativeIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only creatives with these creative field IDs.
    */
  var creativeFieldIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only creatives with these IDs.
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
    * Select only creatives with these rendering IDs.
    */
  var renderingIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allows searching for objects by name or ID. Wildcards (*) are allowed.
    * For example, "creative*2015" will return objects with names like
    * "creative June 2015", "creative April 2015", or simply "creative 2015".
    * Most of the searches also add wildcards implicitly at the start and the
    * end of the search string. For example, a search string of "creative" will
    * match objects with name "my creative", "creative 2015", or simply
    * "creative".
    */
  var searchString: js.UndefOr[String] = js.native
  /**
    * Select only creatives with these size IDs.
    */
  var sizeIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.native
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.native
  /**
    * Select only creatives corresponding to this Studio creative ID.
    */
  var studioCreativeId: js.UndefOr[String] = js.native
  /**
    * Select only creatives with these creative types.
    */
  var types: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceCreativesList {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    advertiserId: String = null,
    alt: String = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    campaignId: String = null,
    companionCreativeIds: js.Array[String] = null,
    creativeFieldIds: js.Array[String] = null,
    fields: String = null,
    ids: js.Array[String] = null,
    key: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    profileId: String = null,
    quotaUser: String = null,
    renderingIds: js.Array[String] = null,
    searchString: String = null,
    sizeIds: js.Array[String] = null,
    sortField: String = null,
    sortOrder: String = null,
    studioCreativeId: String = null,
    types: js.Array[String] = null,
    userIp: String = null
  ): ParamsResourceCreativesList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.get.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId.asInstanceOf[js.Any])
    if (companionCreativeIds != null) __obj.updateDynamic("companionCreativeIds")(companionCreativeIds.asInstanceOf[js.Any])
    if (creativeFieldIds != null) __obj.updateDynamic("creativeFieldIds")(creativeFieldIds.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (renderingIds != null) __obj.updateDynamic("renderingIds")(renderingIds.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (sizeIds != null) __obj.updateDynamic("sizeIds")(sizeIds.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (studioCreativeId != null) __obj.updateDynamic("studioCreativeId")(studioCreativeId.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceCreativesList]
  }
}


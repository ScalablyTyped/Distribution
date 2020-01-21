package typings.googleapis.v33Mod.dfareportingV33

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceDirectorysitesList extends StandardParameters {
  /**
    * This search filter is no longer supported and will have no effect on the
    * results returned.
    */
  var acceptsInStreamVideoPlacements: js.UndefOr[Boolean] = js.native
  /**
    * This search filter is no longer supported and will have no effect on the
    * results returned.
    */
  var acceptsInterstitialPlacements: js.UndefOr[Boolean] = js.native
  /**
    * Select only directory sites that accept publisher paid placements. This
    * field can be left blank.
    */
  var acceptsPublisherPaidPlacements: js.UndefOr[Boolean] = js.native
  /**
    * Select only active directory sites. Leave blank to retrieve both active
    * and inactive directory sites.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only directory sites with this Ad Manager network code.
    */
  var dfpNetworkCode: js.UndefOr[String] = js.native
  /**
    * Select only directory sites with these IDs.
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
    * Allows searching for objects by name, ID or URL. Wildcards (*) are
    * allowed. For example, "directory site*2015" will return objects with
    * names like "directory site June 2015", "directory site April 2015", or
    * simply "directory site 2015". Most of the searches also add wildcards
    * implicitly at the start and the end of the search string. For example, a
    * search string of "directory site" will match objects with name "my
    * directory site", "directory site 2015" or simply, "directory site".
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

object ParamsResourceDirectorysitesList {
  @scala.inline
  def apply(
    acceptsInStreamVideoPlacements: js.UndefOr[Boolean] = js.undefined,
    acceptsInterstitialPlacements: js.UndefOr[Boolean] = js.undefined,
    acceptsPublisherPaidPlacements: js.UndefOr[Boolean] = js.undefined,
    active: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    dfpNetworkCode: String = null,
    fields: String = null,
    ids: js.Array[String] = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    profileId: String = null,
    quotaUser: String = null,
    searchString: String = null,
    sortField: String = null,
    sortOrder: String = null,
    userIp: String = null
  ): ParamsResourceDirectorysitesList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptsInStreamVideoPlacements)) __obj.updateDynamic("acceptsInStreamVideoPlacements")(acceptsInStreamVideoPlacements.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsInterstitialPlacements)) __obj.updateDynamic("acceptsInterstitialPlacements")(acceptsInterstitialPlacements.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsPublisherPaidPlacements)) __obj.updateDynamic("acceptsPublisherPaidPlacements")(acceptsPublisherPaidPlacements.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (dfpNetworkCode != null) __obj.updateDynamic("dfpNetworkCode")(dfpNetworkCode.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceDirectorysitesList]
  }
}


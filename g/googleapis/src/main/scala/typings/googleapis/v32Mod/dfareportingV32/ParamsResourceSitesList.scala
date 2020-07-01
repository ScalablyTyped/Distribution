package typings.googleapis.v32Mod.dfareportingV32

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSitesList extends StandardParameters {
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
    * Select only sites that accept publisher paid placements.
    */
  var acceptsPublisherPaidPlacements: js.UndefOr[Boolean] = js.native
  /**
    * Select only AdWords sites.
    */
  var adWordsSite: js.UndefOr[Boolean] = js.native
  /**
    * Select only approved sites.
    */
  var approved: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only sites with these campaign IDs.
    */
  var campaignIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only sites with these directory site IDs.
    */
  var directorySiteIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only sites with these IDs.
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
    * Allows searching for objects by name, ID or keyName. Wildcards (*) are
    * allowed. For example, "site*2015" will return objects with names like
    * "site June 2015", "site April 2015", or simply "site 2015". Most of the
    * searches also add wildcards implicitly at the start and the end of the
    * search string. For example, a search string of "site" will match objects
    * with name "my site", "site 2015", or simply "site".
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
    * Select only sites with this subaccount ID.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Select only sites that have not been mapped to a directory site.
    */
  var unmappedSite: js.UndefOr[Boolean] = js.native
}

object ParamsResourceSitesList {
  @scala.inline
  def apply(
    acceptsInStreamVideoPlacements: js.UndefOr[Boolean] = js.undefined,
    acceptsInterstitialPlacements: js.UndefOr[Boolean] = js.undefined,
    acceptsPublisherPaidPlacements: js.UndefOr[Boolean] = js.undefined,
    adWordsSite: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    approved: js.UndefOr[Boolean] = js.undefined,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    campaignIds: js.Array[String] = null,
    directorySiteIds: js.Array[String] = null,
    fields: String = null,
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
    subaccountId: String = null,
    unmappedSite: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): ParamsResourceSitesList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptsInStreamVideoPlacements)) __obj.updateDynamic("acceptsInStreamVideoPlacements")(acceptsInStreamVideoPlacements.get.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsInterstitialPlacements)) __obj.updateDynamic("acceptsInterstitialPlacements")(acceptsInterstitialPlacements.get.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsPublisherPaidPlacements)) __obj.updateDynamic("acceptsPublisherPaidPlacements")(acceptsPublisherPaidPlacements.get.asInstanceOf[js.Any])
    if (!js.isUndefined(adWordsSite)) __obj.updateDynamic("adWordsSite")(adWordsSite.get.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(approved)) __obj.updateDynamic("approved")(approved.get.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (campaignIds != null) __obj.updateDynamic("campaignIds")(campaignIds.asInstanceOf[js.Any])
    if (directorySiteIds != null) __obj.updateDynamic("directorySiteIds")(directorySiteIds.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
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
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (!js.isUndefined(unmappedSite)) __obj.updateDynamic("unmappedSite")(unmappedSite.get.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceSitesList]
  }
}


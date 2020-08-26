package typings.googleapis.v31Mod.dfareportingV31

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAdsList extends StandardParameters {
  /**
    * Select only active ads.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Select only ads with this advertiser ID.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Select only archived ads.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Select only ads with these audience segment IDs.
    */
  var audienceSegmentIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only ads with these campaign IDs.
    */
  var campaignIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select default ads with the specified compatibility. Applicable when type
    * is AD_SERVING_DEFAULT_AD. DISPLAY and DISPLAY_INTERSTITIAL refer to
    * rendering either on desktop or on mobile devices for regular or
    * interstitial ads, respectively. APP and APP_INTERSTITIAL are for
    * rendering in mobile apps. IN_STREAM_VIDEO refers to rendering an
    * in-stream video ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[String] = js.native
  /**
    * Select only ads with these creative IDs assigned.
    */
  var creativeIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only ads with these creative optimization configuration IDs.
    */
  var creativeOptimizationConfigurationIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only dynamic click trackers. Applicable when type is
    * AD_SERVING_CLICK_TRACKER. If true, select dynamic click trackers. If
    * false, select static click trackers. Leave unset to select both.
    */
  var dynamicClickTracker: js.UndefOr[Boolean] = js.native
  /**
    * Select only ads with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only ads with these landing page IDs.
    */
  var landingPageIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Select only ads with this event tag override ID.
    */
  var overriddenEventTagId: js.UndefOr[String] = js.native
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Select only ads with these placement IDs assigned.
    */
  var placementIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Select only ads whose list targeting expression use these remarketing
    * list IDs.
    */
  var remarketingListIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allows searching for objects by name or ID. Wildcards (*) are allowed.
    * For example, "ad*2015" will return objects with names like "ad June
    * 2015", "ad April 2015", or simply "ad 2015". Most of the searches also
    * add wildcards implicitly at the start and the end of the search string.
    * For example, a search string of "ad" will match objects with name "my
    * ad", "ad 2015", or simply "ad".
    */
  var searchString: js.UndefOr[String] = js.native
  /**
    * Select only ads with these size IDs.
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
    * Select only ads that are SSL-compliant.
    */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  /**
    * Select only ads that require SSL.
    */
  var sslRequired: js.UndefOr[Boolean] = js.native
  /**
    * Select only ads with these types.
    */
  var `type`: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceAdsList {
  @scala.inline
  def apply(): ParamsResourceAdsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdsList]
  }
  @scala.inline
  implicit class ParamsResourceAdsListOps[Self <: ParamsResourceAdsList] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    @scala.inline
    def setAudienceSegmentIdsVarargs(value: String*): Self = this.set("audienceSegmentIds", js.Array(value :_*))
    @scala.inline
    def setAudienceSegmentIds(value: js.Array[String]): Self = this.set("audienceSegmentIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudienceSegmentIds: Self = this.set("audienceSegmentIds", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCampaignIdsVarargs(value: String*): Self = this.set("campaignIds", js.Array(value :_*))
    @scala.inline
    def setCampaignIds(value: js.Array[String]): Self = this.set("campaignIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignIds: Self = this.set("campaignIds", js.undefined)
    @scala.inline
    def setCompatibility(value: String): Self = this.set("compatibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibility: Self = this.set("compatibility", js.undefined)
    @scala.inline
    def setCreativeIdsVarargs(value: String*): Self = this.set("creativeIds", js.Array(value :_*))
    @scala.inline
    def setCreativeIds(value: js.Array[String]): Self = this.set("creativeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeIds: Self = this.set("creativeIds", js.undefined)
    @scala.inline
    def setCreativeOptimizationConfigurationIdsVarargs(value: String*): Self = this.set("creativeOptimizationConfigurationIds", js.Array(value :_*))
    @scala.inline
    def setCreativeOptimizationConfigurationIds(value: js.Array[String]): Self = this.set("creativeOptimizationConfigurationIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeOptimizationConfigurationIds: Self = this.set("creativeOptimizationConfigurationIds", js.undefined)
    @scala.inline
    def setDynamicClickTracker(value: Boolean): Self = this.set("dynamicClickTracker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicClickTracker: Self = this.set("dynamicClickTracker", js.undefined)
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def setLandingPageIdsVarargs(value: String*): Self = this.set("landingPageIds", js.Array(value :_*))
    @scala.inline
    def setLandingPageIds(value: js.Array[String]): Self = this.set("landingPageIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandingPageIds: Self = this.set("landingPageIds", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOverriddenEventTagId(value: String): Self = this.set("overriddenEventTagId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverriddenEventTagId: Self = this.set("overriddenEventTagId", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPlacementIdsVarargs(value: String*): Self = this.set("placementIds", js.Array(value :_*))
    @scala.inline
    def setPlacementIds(value: js.Array[String]): Self = this.set("placementIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementIds: Self = this.set("placementIds", js.undefined)
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    @scala.inline
    def setRemarketingListIdsVarargs(value: String*): Self = this.set("remarketingListIds", js.Array(value :_*))
    @scala.inline
    def setRemarketingListIds(value: js.Array[String]): Self = this.set("remarketingListIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemarketingListIds: Self = this.set("remarketingListIds", js.undefined)
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchString: Self = this.set("searchString", js.undefined)
    @scala.inline
    def setSizeIdsVarargs(value: String*): Self = this.set("sizeIds", js.Array(value :_*))
    @scala.inline
    def setSizeIds(value: js.Array[String]): Self = this.set("sizeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeIds: Self = this.set("sizeIds", js.undefined)
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setSslCompliant(value: Boolean): Self = this.set("sslCompliant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslCompliant: Self = this.set("sslCompliant", js.undefined)
    @scala.inline
    def setSslRequired(value: Boolean): Self = this.set("sslRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslRequired: Self = this.set("sslRequired", js.undefined)
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


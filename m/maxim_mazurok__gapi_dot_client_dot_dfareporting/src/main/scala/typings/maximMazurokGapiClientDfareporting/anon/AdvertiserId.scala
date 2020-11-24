package typings.maximMazurokGapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserId extends js.Object {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /** Select only active ads. */
  var active: js.UndefOr[Boolean] = js.native
  
  /** Select only ads with this advertiser ID. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** Select only archived ads. */
  var archived: js.UndefOr[Boolean] = js.native
  
  /** Select only ads with these audience segment IDs. */
  var audienceSegmentIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** Select only ads with these campaign IDs. */
  var campaignIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Select default ads with the specified compatibility. Applicable when type is AD_SERVING_DEFAULT_AD. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on
    * mobile devices for regular or interstitial ads, respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering an in-stream video
    * ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[String] = js.native
  
  /** Select only ads with these creative IDs assigned. */
  var creativeIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Select only ads with these creative optimization configuration IDs. */
  var creativeOptimizationConfigurationIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Select only dynamic click trackers. Applicable when type is AD_SERVING_CLICK_TRACKER. If true, select dynamic click trackers. If false, select static click trackers. Leave unset
    * to select both.
    */
  var dynamicClickTracker: js.UndefOr[Boolean] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** Select only ads with these IDs. */
  var ids: js.UndefOr[String | js.Array[String]] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** Select only ads with these landing page IDs. */
  var landingPageIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Select only ads with this event tag override ID. */
  var overriddenEventTagId: js.UndefOr[String] = js.native
  
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.native
  
  /** Select only ads with these placement IDs assigned. */
  var placementIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** User profile ID associated with this request. */
  var profileId: String = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Select only ads whose list targeting expression use these remarketing list IDs. */
  var remarketingListIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "ad*2015" will return objects with names like "ad June 2015", "ad April 2015", or simply "ad
    * 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "ad" will match objects with name "my
    * ad", "ad 2015", or simply "ad".
    */
  var searchString: js.UndefOr[String] = js.native
  
  /** Select only ads with these size IDs. */
  var sizeIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.native
  
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.native
  
  /** Select only ads that are SSL-compliant. */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  
  /** Select only ads that require SSL. */
  var sslRequired: js.UndefOr[Boolean] = js.native
  
  /** Select only ads with these types. */
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}
object AdvertiserId {
  
  @scala.inline
  def apply(profileId: String): AdvertiserId = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertiserId]
  }
  
  @scala.inline
  implicit class AdvertiserIdOps[Self <: AdvertiserId] (val x: Self) extends AnyVal {
    
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
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    
    @scala.inline
    def setAudienceSegmentIdsVarargs(value: String*): Self = this.set("audienceSegmentIds", js.Array(value :_*))
    
    @scala.inline
    def setAudienceSegmentIds(value: String | js.Array[String]): Self = this.set("audienceSegmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudienceSegmentIds: Self = this.set("audienceSegmentIds", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCampaignIdsVarargs(value: String*): Self = this.set("campaignIds", js.Array(value :_*))
    
    @scala.inline
    def setCampaignIds(value: String | js.Array[String]): Self = this.set("campaignIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignIds: Self = this.set("campaignIds", js.undefined)
    
    @scala.inline
    def setCompatibility(value: String): Self = this.set("compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibility: Self = this.set("compatibility", js.undefined)
    
    @scala.inline
    def setCreativeIdsVarargs(value: String*): Self = this.set("creativeIds", js.Array(value :_*))
    
    @scala.inline
    def setCreativeIds(value: String | js.Array[String]): Self = this.set("creativeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeIds: Self = this.set("creativeIds", js.undefined)
    
    @scala.inline
    def setCreativeOptimizationConfigurationIdsVarargs(value: String*): Self = this.set("creativeOptimizationConfigurationIds", js.Array(value :_*))
    
    @scala.inline
    def setCreativeOptimizationConfigurationIds(value: String | js.Array[String]): Self = this.set("creativeOptimizationConfigurationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeOptimizationConfigurationIds: Self = this.set("creativeOptimizationConfigurationIds", js.undefined)
    
    @scala.inline
    def setDynamicClickTracker(value: Boolean): Self = this.set("dynamicClickTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicClickTracker: Self = this.set("dynamicClickTracker", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: String | js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLandingPageIdsVarargs(value: String*): Self = this.set("landingPageIds", js.Array(value :_*))
    
    @scala.inline
    def setLandingPageIds(value: String | js.Array[String]): Self = this.set("landingPageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandingPageIds: Self = this.set("landingPageIds", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
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
    def setPlacementIds(value: String | js.Array[String]): Self = this.set("placementIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementIds: Self = this.set("placementIds", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setRemarketingListIdsVarargs(value: String*): Self = this.set("remarketingListIds", js.Array(value :_*))
    
    @scala.inline
    def setRemarketingListIds(value: String | js.Array[String]): Self = this.set("remarketingListIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemarketingListIds: Self = this.set("remarketingListIds", js.undefined)
    
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchString: Self = this.set("searchString", js.undefined)
    
    @scala.inline
    def setSizeIdsVarargs(value: String*): Self = this.set("sizeIds", js.Array(value :_*))
    
    @scala.inline
    def setSizeIds(value: String | js.Array[String]): Self = this.set("sizeIds", value.asInstanceOf[js.Any])
    
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
    def setType(value: String | js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
  }
}

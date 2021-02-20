package typings.maximMazurokGapiClientDfareporting.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserId extends StObject {
  
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
  implicit class AdvertiserIdMutableBuilder[Self <: AdvertiserId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setAudienceSegmentIds(value: String | js.Array[String]): Self = StObject.set(x, "audienceSegmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceSegmentIdsUndefined: Self = StObject.set(x, "audienceSegmentIds", js.undefined)
    
    @scala.inline
    def setAudienceSegmentIdsVarargs(value: String*): Self = StObject.set(x, "audienceSegmentIds", js.Array(value :_*))
    
    @scala.inline
    def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setCampaignIds(value: String | js.Array[String]): Self = StObject.set(x, "campaignIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignIdsUndefined: Self = StObject.set(x, "campaignIds", js.undefined)
    
    @scala.inline
    def setCampaignIdsVarargs(value: String*): Self = StObject.set(x, "campaignIds", js.Array(value :_*))
    
    @scala.inline
    def setCompatibility(value: String): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
    
    @scala.inline
    def setCreativeIds(value: String | js.Array[String]): Self = StObject.set(x, "creativeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdsUndefined: Self = StObject.set(x, "creativeIds", js.undefined)
    
    @scala.inline
    def setCreativeIdsVarargs(value: String*): Self = StObject.set(x, "creativeIds", js.Array(value :_*))
    
    @scala.inline
    def setCreativeOptimizationConfigurationIds(value: String | js.Array[String]): Self = StObject.set(x, "creativeOptimizationConfigurationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeOptimizationConfigurationIdsUndefined: Self = StObject.set(x, "creativeOptimizationConfigurationIds", js.undefined)
    
    @scala.inline
    def setCreativeOptimizationConfigurationIdsVarargs(value: String*): Self = StObject.set(x, "creativeOptimizationConfigurationIds", js.Array(value :_*))
    
    @scala.inline
    def setDynamicClickTracker(value: Boolean): Self = StObject.set(x, "dynamicClickTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicClickTrackerUndefined: Self = StObject.set(x, "dynamicClickTracker", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setIds(value: String | js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLandingPageIds(value: String | js.Array[String]): Self = StObject.set(x, "landingPageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandingPageIdsUndefined: Self = StObject.set(x, "landingPageIds", js.undefined)
    
    @scala.inline
    def setLandingPageIdsVarargs(value: String*): Self = StObject.set(x, "landingPageIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setOverriddenEventTagId(value: String): Self = StObject.set(x, "overriddenEventTagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverriddenEventTagIdUndefined: Self = StObject.set(x, "overriddenEventTagId", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPlacementIds(value: String | js.Array[String]): Self = StObject.set(x, "placementIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementIdsUndefined: Self = StObject.set(x, "placementIds", js.undefined)
    
    @scala.inline
    def setPlacementIdsVarargs(value: String*): Self = StObject.set(x, "placementIds", js.Array(value :_*))
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setRemarketingListIds(value: String | js.Array[String]): Self = StObject.set(x, "remarketingListIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarketingListIdsUndefined: Self = StObject.set(x, "remarketingListIds", js.undefined)
    
    @scala.inline
    def setRemarketingListIdsVarargs(value: String*): Self = StObject.set(x, "remarketingListIds", js.Array(value :_*))
    
    @scala.inline
    def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
    
    @scala.inline
    def setSizeIds(value: String | js.Array[String]): Self = StObject.set(x, "sizeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeIdsUndefined: Self = StObject.set(x, "sizeIds", js.undefined)
    
    @scala.inline
    def setSizeIdsVarargs(value: String*): Self = StObject.set(x, "sizeIds", js.Array(value :_*))
    
    @scala.inline
    def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    @scala.inline
    def setSslCompliant(value: Boolean): Self = StObject.set(x, "sslCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCompliantUndefined: Self = StObject.set(x, "sslCompliant", js.undefined)
    
    @scala.inline
    def setSslRequired(value: Boolean): Self = StObject.set(x, "sslRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslRequiredUndefined: Self = StObject.set(x, "sslRequired", js.undefined)
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
  }
}

package typings.maximMazurokGapiClientDfareporting.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvertiserId extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  
  /** Select only active ads. */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** Select only ads with this advertiser ID. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** Select only archived ads. */
  var archived: js.UndefOr[Boolean] = js.undefined
  
  /** Select only ads with these audience segment IDs. */
  var audienceSegmentIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  
  /** Select only ads with these campaign IDs. */
  var campaignIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Select default ads with the specified compatibility. Applicable when type is AD_SERVING_DEFAULT_AD. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on
    * mobile devices for regular or interstitial ads, respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering an in-stream video
    * ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[String] = js.undefined
  
  /** Select only ads with these creative IDs assigned. */
  var creativeIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Select only ads with these creative optimization configuration IDs. */
  var creativeOptimizationConfigurationIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Select only dynamic click trackers. Applicable when type is AD_SERVING_CLICK_TRACKER. If true, select dynamic click trackers. If false, select static click trackers. Leave unset
    * to select both.
    */
  var dynamicClickTracker: js.UndefOr[Boolean] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** Select only ads with these IDs. */
  var ids: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Select only ads with these landing page IDs. */
  var landingPageIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Select only ads with this event tag override ID. */
  var overriddenEventTagId: js.UndefOr[String] = js.undefined
  
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** Select only ads with these placement IDs assigned. */
  var placementIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** User profile ID associated with this request. */
  var profileId: String
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Select only ads whose list targeting expression use these remarketing list IDs. */
  var remarketingListIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "ad*2015" will return objects with names like "ad June 2015", "ad April 2015", or simply "ad
    * 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "ad" will match objects with name "my
    * ad", "ad 2015", or simply "ad".
    */
  var searchString: js.UndefOr[String] = js.undefined
  
  /** Select only ads with these size IDs. */
  var sizeIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.undefined
  
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.undefined
  
  /** Select only ads that are SSL-compliant. */
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  
  /** Select only ads that require SSL. */
  var sslRequired: js.UndefOr[Boolean] = js.undefined
  
  /** Select only ads with these types. */
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}
object AdvertiserId {
  
  inline def apply(profileId: String): AdvertiserId = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertiserId]
  }
  
  extension [Self <: AdvertiserId](x: Self) {
    
    inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setAudienceSegmentIds(value: String | js.Array[String]): Self = StObject.set(x, "audienceSegmentIds", value.asInstanceOf[js.Any])
    
    inline def setAudienceSegmentIdsUndefined: Self = StObject.set(x, "audienceSegmentIds", js.undefined)
    
    inline def setAudienceSegmentIdsVarargs(value: String*): Self = StObject.set(x, "audienceSegmentIds", js.Array(value :_*))
    
    inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCampaignIds(value: String | js.Array[String]): Self = StObject.set(x, "campaignIds", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdsUndefined: Self = StObject.set(x, "campaignIds", js.undefined)
    
    inline def setCampaignIdsVarargs(value: String*): Self = StObject.set(x, "campaignIds", js.Array(value :_*))
    
    inline def setCompatibility(value: String): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
    
    inline def setCreativeIds(value: String | js.Array[String]): Self = StObject.set(x, "creativeIds", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdsUndefined: Self = StObject.set(x, "creativeIds", js.undefined)
    
    inline def setCreativeIdsVarargs(value: String*): Self = StObject.set(x, "creativeIds", js.Array(value :_*))
    
    inline def setCreativeOptimizationConfigurationIds(value: String | js.Array[String]): Self = StObject.set(x, "creativeOptimizationConfigurationIds", value.asInstanceOf[js.Any])
    
    inline def setCreativeOptimizationConfigurationIdsUndefined: Self = StObject.set(x, "creativeOptimizationConfigurationIds", js.undefined)
    
    inline def setCreativeOptimizationConfigurationIdsVarargs(value: String*): Self = StObject.set(x, "creativeOptimizationConfigurationIds", js.Array(value :_*))
    
    inline def setDynamicClickTracker(value: Boolean): Self = StObject.set(x, "dynamicClickTracker", value.asInstanceOf[js.Any])
    
    inline def setDynamicClickTrackerUndefined: Self = StObject.set(x, "dynamicClickTracker", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setIds(value: String | js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLandingPageIds(value: String | js.Array[String]): Self = StObject.set(x, "landingPageIds", value.asInstanceOf[js.Any])
    
    inline def setLandingPageIdsUndefined: Self = StObject.set(x, "landingPageIds", js.undefined)
    
    inline def setLandingPageIdsVarargs(value: String*): Self = StObject.set(x, "landingPageIds", js.Array(value :_*))
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    inline def setOverriddenEventTagId(value: String): Self = StObject.set(x, "overriddenEventTagId", value.asInstanceOf[js.Any])
    
    inline def setOverriddenEventTagIdUndefined: Self = StObject.set(x, "overriddenEventTagId", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPlacementIds(value: String | js.Array[String]): Self = StObject.set(x, "placementIds", value.asInstanceOf[js.Any])
    
    inline def setPlacementIdsUndefined: Self = StObject.set(x, "placementIds", js.undefined)
    
    inline def setPlacementIdsVarargs(value: String*): Self = StObject.set(x, "placementIds", js.Array(value :_*))
    
    inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setRemarketingListIds(value: String | js.Array[String]): Self = StObject.set(x, "remarketingListIds", value.asInstanceOf[js.Any])
    
    inline def setRemarketingListIdsUndefined: Self = StObject.set(x, "remarketingListIds", js.undefined)
    
    inline def setRemarketingListIdsVarargs(value: String*): Self = StObject.set(x, "remarketingListIds", js.Array(value :_*))
    
    inline def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    inline def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
    
    inline def setSizeIds(value: String | js.Array[String]): Self = StObject.set(x, "sizeIds", value.asInstanceOf[js.Any])
    
    inline def setSizeIdsUndefined: Self = StObject.set(x, "sizeIds", js.undefined)
    
    inline def setSizeIdsVarargs(value: String*): Self = StObject.set(x, "sizeIds", js.Array(value :_*))
    
    inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setSslCompliant(value: Boolean): Self = StObject.set(x, "sslCompliant", value.asInstanceOf[js.Any])
    
    inline def setSslCompliantUndefined: Self = StObject.set(x, "sslCompliant", js.undefined)
    
    inline def setSslRequired(value: Boolean): Self = StObject.set(x, "sslRequired", value.asInstanceOf[js.Any])
    
    inline def setSslRequiredUndefined: Self = StObject.set(x, "sslRequired", js.undefined)
    
    inline def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
  }
}

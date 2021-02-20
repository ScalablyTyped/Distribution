package typings.maximMazurokGapiClientDfareporting.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compatibilities extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /** Select only placements that belong to these advertisers. */
  var advertiserIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** Select only archived placements. Don't set this field to select both archived and non-archived placements. */
  var archived: js.UndefOr[Boolean] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** Select only placements that belong to these campaigns. */
  var campaignIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Select only placements that are associated with these compatibilities. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on mobile devices for regular or
    * interstitial ads respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with the VAST
    * standard.
    */
  var compatibilities: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Select only placements that are associated with these content categories. */
  var contentCategoryIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Select only placements that are associated with these directory sites. */
  var directorySiteIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** Select only placements that belong to these placement groups. */
  var groupIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Select only placements with these IDs. */
  var ids: js.UndefOr[String | js.Array[String]] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** Select only placements or placement groups whose end date is on or before the specified maxEndDate. The date should be formatted as "yyyy-MM-dd". */
  var maxEndDate: js.UndefOr[String] = js.native
  
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.native
  
  /** Select only placements or placement groups whose start date is on or before the specified maxStartDate. The date should be formatted as "yyyy-MM-dd". */
  var maxStartDate: js.UndefOr[String] = js.native
  
  /** Select only placements or placement groups whose end date is on or after the specified minEndDate. The date should be formatted as "yyyy-MM-dd". */
  var minEndDate: js.UndefOr[String] = js.native
  
  /** Select only placements or placement groups whose start date is on or after the specified minStartDate. The date should be formatted as "yyyy-MM-dd". */
  var minStartDate: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.native
  
  /** Select only placements with this payment source. */
  var paymentSource: js.UndefOr[String] = js.native
  
  /** Select only placements that are associated with these placement strategies. */
  var placementStrategyIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Select only placements with these pricing types. */
  var pricingTypes: js.UndefOr[String | js.Array[String]] = js.native
  
  /** User profile ID associated with this request. */
  var profileId: String = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /**
    * Allows searching for placements by name or ID. Wildcards (*) are allowed. For example, "placement*2015" will return placements with names like "placement June 2015", "placement
    * May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of
    * "placement" will match placements with name "my placement", "placement 2015", or simply "placement" .
    */
  var searchString: js.UndefOr[String] = js.native
  
  /** Select only placements that are associated with these sites. */
  var siteIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Select only placements that are associated with these sizes. */
  var sizeIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.native
  
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}
object Compatibilities {
  
  @scala.inline
  def apply(profileId: String): Compatibilities = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compatibilities]
  }
  
  @scala.inline
  implicit class CompatibilitiesMutableBuilder[Self <: Compatibilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setAdvertiserIds(value: String | js.Array[String]): Self = StObject.set(x, "advertiserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdsUndefined: Self = StObject.set(x, "advertiserIds", js.undefined)
    
    @scala.inline
    def setAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "advertiserIds", js.Array(value :_*))
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
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
    def setCompatibilities(value: String | js.Array[String]): Self = StObject.set(x, "compatibilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibilitiesUndefined: Self = StObject.set(x, "compatibilities", js.undefined)
    
    @scala.inline
    def setCompatibilitiesVarargs(value: String*): Self = StObject.set(x, "compatibilities", js.Array(value :_*))
    
    @scala.inline
    def setContentCategoryIds(value: String | js.Array[String]): Self = StObject.set(x, "contentCategoryIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentCategoryIdsUndefined: Self = StObject.set(x, "contentCategoryIds", js.undefined)
    
    @scala.inline
    def setContentCategoryIdsVarargs(value: String*): Self = StObject.set(x, "contentCategoryIds", js.Array(value :_*))
    
    @scala.inline
    def setDirectorySiteIds(value: String | js.Array[String]): Self = StObject.set(x, "directorySiteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectorySiteIdsUndefined: Self = StObject.set(x, "directorySiteIds", js.undefined)
    
    @scala.inline
    def setDirectorySiteIdsVarargs(value: String*): Self = StObject.set(x, "directorySiteIds", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setGroupIds(value: String | js.Array[String]): Self = StObject.set(x, "groupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdsUndefined: Self = StObject.set(x, "groupIds", js.undefined)
    
    @scala.inline
    def setGroupIdsVarargs(value: String*): Self = StObject.set(x, "groupIds", js.Array(value :_*))
    
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
    def setMaxEndDate(value: String): Self = StObject.set(x, "maxEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEndDateUndefined: Self = StObject.set(x, "maxEndDate", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMaxStartDate(value: String): Self = StObject.set(x, "maxStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxStartDateUndefined: Self = StObject.set(x, "maxStartDate", js.undefined)
    
    @scala.inline
    def setMinEndDate(value: String): Self = StObject.set(x, "minEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinEndDateUndefined: Self = StObject.set(x, "minEndDate", js.undefined)
    
    @scala.inline
    def setMinStartDate(value: String): Self = StObject.set(x, "minStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinStartDateUndefined: Self = StObject.set(x, "minStartDate", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPaymentSource(value: String): Self = StObject.set(x, "paymentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentSourceUndefined: Self = StObject.set(x, "paymentSource", js.undefined)
    
    @scala.inline
    def setPlacementStrategyIds(value: String | js.Array[String]): Self = StObject.set(x, "placementStrategyIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementStrategyIdsUndefined: Self = StObject.set(x, "placementStrategyIds", js.undefined)
    
    @scala.inline
    def setPlacementStrategyIdsVarargs(value: String*): Self = StObject.set(x, "placementStrategyIds", js.Array(value :_*))
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setPricingTypes(value: String | js.Array[String]): Self = StObject.set(x, "pricingTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingTypesUndefined: Self = StObject.set(x, "pricingTypes", js.undefined)
    
    @scala.inline
    def setPricingTypesVarargs(value: String*): Self = StObject.set(x, "pricingTypes", js.Array(value :_*))
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
    
    @scala.inline
    def setSiteIds(value: String | js.Array[String]): Self = StObject.set(x, "siteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdsUndefined: Self = StObject.set(x, "siteIds", js.undefined)
    
    @scala.inline
    def setSiteIdsVarargs(value: String*): Self = StObject.set(x, "siteIds", js.Array(value :_*))
    
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
    def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
  }
}

package typings.maximMazurokGapiClientDfareporting.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptsInStreamVideoPlacements extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  
  /** This search filter is no longer supported and will have no effect on the results returned. */
  var acceptsInStreamVideoPlacements: js.UndefOr[Boolean] = js.undefined
  
  /** This search filter is no longer supported and will have no effect on the results returned. */
  var acceptsInterstitialPlacements: js.UndefOr[Boolean] = js.undefined
  
  /** Select only directory sites that accept publisher paid placements. This field can be left blank. */
  var acceptsPublisherPaidPlacements: js.UndefOr[Boolean] = js.undefined
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  
  /** Select only active directory sites. Leave blank to retrieve both active and inactive directory sites. */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  
  /** Select only directory sites with this Ad Manager network code. */
  var dfpNetworkCode: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** Select only directory sites with these IDs. */
  var ids: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** User profile ID associated with this request. */
  var profileId: String
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /**
    * Allows searching for objects by name, ID or URL. Wildcards (*) are allowed. For example, "directory site*2015" will return objects with names like "directory site June 2015",
    * "directory site April 2015", or simply "directory site 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a
    * search string of "directory site" will match objects with name "my directory site", "directory site 2015" or simply, "directory site".
    */
  var searchString: js.UndefOr[String] = js.undefined
  
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.undefined
  
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.undefined
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}
object AcceptsInStreamVideoPlacements {
  
  @scala.inline
  def apply(profileId: String): AcceptsInStreamVideoPlacements = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptsInStreamVideoPlacements]
  }
  
  @scala.inline
  implicit class AcceptsInStreamVideoPlacementsMutableBuilder[Self <: AcceptsInStreamVideoPlacements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    @scala.inline
    def setAcceptsInStreamVideoPlacements(value: Boolean): Self = StObject.set(x, "acceptsInStreamVideoPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptsInStreamVideoPlacementsUndefined: Self = StObject.set(x, "acceptsInStreamVideoPlacements", js.undefined)
    
    @scala.inline
    def setAcceptsInterstitialPlacements(value: Boolean): Self = StObject.set(x, "acceptsInterstitialPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptsInterstitialPlacementsUndefined: Self = StObject.set(x, "acceptsInterstitialPlacements", js.undefined)
    
    @scala.inline
    def setAcceptsPublisherPaidPlacements(value: Boolean): Self = StObject.set(x, "acceptsPublisherPaidPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptsPublisherPaidPlacementsUndefined: Self = StObject.set(x, "acceptsPublisherPaidPlacements", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setDfpNetworkCode(value: String): Self = StObject.set(x, "dfpNetworkCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDfpNetworkCodeUndefined: Self = StObject.set(x, "dfpNetworkCode", js.undefined)
    
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
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
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
    def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
    
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

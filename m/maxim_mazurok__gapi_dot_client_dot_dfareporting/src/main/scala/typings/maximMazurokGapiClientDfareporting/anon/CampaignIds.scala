package typings.maximMazurokGapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignIds extends js.Object {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /** Select only placement groups that belong to these advertisers. */
  var advertiserIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** Select only archived placements. Don't set this field to select both archived and non-archived placements. */
  var archived: js.UndefOr[Boolean] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** Select only placement groups that belong to these campaigns. */
  var campaignIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Select only placement groups that are associated with these content categories. */
  var contentCategoryIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Select only placement groups that are associated with these directory sites. */
  var directorySiteIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** Select only placement groups with these IDs. */
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
  
  /**
    * Select only placement groups belonging with this group type. A package is a simple group of placements that acts as a single pricing point for a group of tags. A roadblock is a
    * group of placements that not only acts as a single pricing point but also assumes that all the tags in it will be served at the same time. A roadblock requires one of its
    * assigned placements to be marked as primary for reporting.
    */
  var placementGroupType: js.UndefOr[String] = js.native
  
  /** Select only placement groups that are associated with these placement strategies. */
  var placementStrategyIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Select only placement groups with these pricing types. */
  var pricingTypes: js.UndefOr[String | js.Array[String]] = js.native
  
  /** User profile ID associated with this request. */
  var profileId: String = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /**
    * Allows searching for placement groups by name or ID. Wildcards (*) are allowed. For example, "placement*2015" will return placement groups with names like "placement group June
    * 2015", "placement group May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a
    * search string of "placementgroup" will match placement groups with name "my placementgroup", "placementgroup 2015", or simply "placementgroup".
    */
  var searchString: js.UndefOr[String] = js.native
  
  /** Select only placement groups that are associated with these sites. */
  var siteIds: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.native
  
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}
object CampaignIds {
  
  @scala.inline
  def apply(profileId: String): CampaignIds = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignIds]
  }
  
  @scala.inline
  implicit class CampaignIdsOps[Self <: CampaignIds] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserIdsVarargs(value: String*): Self = this.set("advertiserIds", js.Array(value :_*))
    
    @scala.inline
    def setAdvertiserIds(value: String | js.Array[String]): Self = this.set("advertiserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserIds: Self = this.set("advertiserIds", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    
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
    def setContentCategoryIdsVarargs(value: String*): Self = this.set("contentCategoryIds", js.Array(value :_*))
    
    @scala.inline
    def setContentCategoryIds(value: String | js.Array[String]): Self = this.set("contentCategoryIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentCategoryIds: Self = this.set("contentCategoryIds", js.undefined)
    
    @scala.inline
    def setDirectorySiteIdsVarargs(value: String*): Self = this.set("directorySiteIds", js.Array(value :_*))
    
    @scala.inline
    def setDirectorySiteIds(value: String | js.Array[String]): Self = this.set("directorySiteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectorySiteIds: Self = this.set("directorySiteIds", js.undefined)
    
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
    def setMaxEndDate(value: String): Self = this.set("maxEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxEndDate: Self = this.set("maxEndDate", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setMaxStartDate(value: String): Self = this.set("maxStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxStartDate: Self = this.set("maxStartDate", js.undefined)
    
    @scala.inline
    def setMinEndDate(value: String): Self = this.set("minEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinEndDate: Self = this.set("minEndDate", js.undefined)
    
    @scala.inline
    def setMinStartDate(value: String): Self = this.set("minStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinStartDate: Self = this.set("minStartDate", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPlacementGroupType(value: String): Self = this.set("placementGroupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementGroupType: Self = this.set("placementGroupType", js.undefined)
    
    @scala.inline
    def setPlacementStrategyIdsVarargs(value: String*): Self = this.set("placementStrategyIds", js.Array(value :_*))
    
    @scala.inline
    def setPlacementStrategyIds(value: String | js.Array[String]): Self = this.set("placementStrategyIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementStrategyIds: Self = this.set("placementStrategyIds", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setPricingTypesVarargs(value: String*): Self = this.set("pricingTypes", js.Array(value :_*))
    
    @scala.inline
    def setPricingTypes(value: String | js.Array[String]): Self = this.set("pricingTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricingTypes: Self = this.set("pricingTypes", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchString: Self = this.set("searchString", js.undefined)
    
    @scala.inline
    def setSiteIdsVarargs(value: String*): Self = this.set("siteIds", js.Array(value :_*))
    
    @scala.inline
    def setSiteIds(value: String | js.Array[String]): Self = this.set("siteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteIds: Self = this.set("siteIds", js.undefined)
    
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
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

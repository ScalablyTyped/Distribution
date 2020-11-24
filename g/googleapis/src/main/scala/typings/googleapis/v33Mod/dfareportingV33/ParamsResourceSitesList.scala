package typings.googleapis.v33Mod.dfareportingV33

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ParamsResourceSitesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesList]
  }
  
  @scala.inline
  implicit class ParamsResourceSitesListOps[Self <: ParamsResourceSitesList] (val x: Self) extends AnyVal {
    
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
    def setAcceptsInStreamVideoPlacements(value: Boolean): Self = this.set("acceptsInStreamVideoPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptsInStreamVideoPlacements: Self = this.set("acceptsInStreamVideoPlacements", js.undefined)
    
    @scala.inline
    def setAcceptsInterstitialPlacements(value: Boolean): Self = this.set("acceptsInterstitialPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptsInterstitialPlacements: Self = this.set("acceptsInterstitialPlacements", js.undefined)
    
    @scala.inline
    def setAcceptsPublisherPaidPlacements(value: Boolean): Self = this.set("acceptsPublisherPaidPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptsPublisherPaidPlacements: Self = this.set("acceptsPublisherPaidPlacements", js.undefined)
    
    @scala.inline
    def setAdWordsSite(value: Boolean): Self = this.set("adWordsSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdWordsSite: Self = this.set("adWordsSite", js.undefined)
    
    @scala.inline
    def setApproved(value: Boolean): Self = this.set("approved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproved: Self = this.set("approved", js.undefined)
    
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
    def setDirectorySiteIdsVarargs(value: String*): Self = this.set("directorySiteIds", js.Array(value :_*))
    
    @scala.inline
    def setDirectorySiteIds(value: js.Array[String]): Self = this.set("directorySiteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectorySiteIds: Self = this.set("directorySiteIds", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchString: Self = this.set("searchString", js.undefined)
    
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setUnmappedSite(value: Boolean): Self = this.set("unmappedSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmappedSite: Self = this.set("unmappedSite", js.undefined)
  }
}

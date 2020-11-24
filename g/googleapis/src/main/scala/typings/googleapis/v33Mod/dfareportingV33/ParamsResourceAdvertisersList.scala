package typings.googleapis.v33Mod.dfareportingV33

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAdvertisersList extends StandardParameters {
  
  /**
    * Select only advertisers with these advertiser group IDs.
    */
  var advertiserGroupIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Select only advertisers with these floodlight configuration IDs.
    */
  var floodlightConfigurationIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only advertisers with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only advertisers which do not belong to any advertiser group.
    */
  var includeAdvertisersWithoutGroupsOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Select only advertisers which use another advertiser's floodlight
    * configuration.
    */
  var onlyParent: js.UndefOr[Boolean] = js.native
  
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  
  /**
    * Allows searching for objects by name or ID. Wildcards (*) are allowed.
    * For example, "advertiser*2015" will return objects with names like
    * "advertiser June 2015", "advertiser April 2015", or simply "advertiser
    * 2015". Most of the searches also add wildcards implicitly at the start
    * and the end of the search string. For example, a search string of
    * "advertiser" will match objects with name "my advertiser", "advertiser
    * 2015", or simply "advertiser".
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
    * Select only advertisers with the specified status.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Select only advertisers with these subaccount IDs.
    */
  var subaccountId: js.UndefOr[String] = js.native
}
object ParamsResourceAdvertisersList {
  
  @scala.inline
  def apply(): ParamsResourceAdvertisersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersList]
  }
  
  @scala.inline
  implicit class ParamsResourceAdvertisersListOps[Self <: ParamsResourceAdvertisersList] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserGroupIdsVarargs(value: String*): Self = this.set("advertiserGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setAdvertiserGroupIds(value: js.Array[String]): Self = this.set("advertiserGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserGroupIds: Self = this.set("advertiserGroupIds", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationIdsVarargs(value: String*): Self = this.set("floodlightConfigurationIds", js.Array(value :_*))
    
    @scala.inline
    def setFloodlightConfigurationIds(value: js.Array[String]): Self = this.set("floodlightConfigurationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightConfigurationIds: Self = this.set("floodlightConfigurationIds", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    
    @scala.inline
    def setIncludeAdvertisersWithoutGroupsOnly(value: Boolean): Self = this.set("includeAdvertisersWithoutGroupsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAdvertisersWithoutGroupsOnly: Self = this.set("includeAdvertisersWithoutGroupsOnly", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setOnlyParent(value: Boolean): Self = this.set("onlyParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyParent: Self = this.set("onlyParent", js.undefined)
    
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
  }
}

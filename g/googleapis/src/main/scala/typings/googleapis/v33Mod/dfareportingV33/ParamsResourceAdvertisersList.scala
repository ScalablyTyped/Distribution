package typings.googleapis.v33Mod.dfareportingV33

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersList
  extends StObject
     with StandardParameters {
  
  /**
    * Select only advertisers with these advertiser group IDs.
    */
  var advertiserGroupIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Select only advertisers with these floodlight configuration IDs.
    */
  var floodlightConfigurationIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only advertisers with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only advertisers which do not belong to any advertiser group.
    */
  var includeAdvertisersWithoutGroupsOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Select only advertisers which use another advertiser's floodlight
    * configuration.
    */
  var onlyParent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Allows searching for objects by name or ID. Wildcards (*) are allowed.
    * For example, "advertiser*2015" will return objects with names like
    * "advertiser June 2015", "advertiser April 2015", or simply "advertiser
    * 2015". Most of the searches also add wildcards implicitly at the start
    * and the end of the search string. For example, a search string of
    * "advertiser" will match objects with name "my advertiser", "advertiser
    * 2015", or simply "advertiser".
    */
  var searchString: js.UndefOr[String] = js.undefined
  
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.undefined
  
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.undefined
  
  /**
    * Select only advertisers with the specified status.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Select only advertisers with these subaccount IDs.
    */
  var subaccountId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersList {
  
  @scala.inline
  def apply(): ParamsResourceAdvertisersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersList]
  }
  
  @scala.inline
  implicit class ParamsResourceAdvertisersListMutableBuilder[Self <: ParamsResourceAdvertisersList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserGroupIds(value: js.Array[String]): Self = StObject.set(x, "advertiserGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserGroupIdsUndefined: Self = StObject.set(x, "advertiserGroupIds", js.undefined)
    
    @scala.inline
    def setAdvertiserGroupIdsVarargs(value: String*): Self = StObject.set(x, "advertiserGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationIds(value: js.Array[String]): Self = StObject.set(x, "floodlightConfigurationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightConfigurationIdsUndefined: Self = StObject.set(x, "floodlightConfigurationIds", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationIdsVarargs(value: String*): Self = StObject.set(x, "floodlightConfigurationIds", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setIncludeAdvertisersWithoutGroupsOnly(value: Boolean): Self = StObject.set(x, "includeAdvertisersWithoutGroupsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAdvertisersWithoutGroupsOnlyUndefined: Self = StObject.set(x, "includeAdvertisersWithoutGroupsOnly", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOnlyParent(value: Boolean): Self = StObject.set(x, "onlyParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyParentUndefined: Self = StObject.set(x, "onlyParent", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
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
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
  }
}

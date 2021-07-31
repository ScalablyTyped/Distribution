package typings.googleapis.v31Mod.dfareportingV31

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCampaignsList
  extends StObject
     with StandardParameters {
  
  /**
    * Select only campaigns whose advertisers belong to these advertiser
    * groups.
    */
  var advertiserGroupIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only campaigns that belong to these advertisers.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only archived campaigns. Don't set this field to select both
    * archived and non-archived campaigns.
    */
  var archived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Select only campaigns that have at least one optimization activity.
    */
  var atLeastOneOptimizationActivity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Exclude campaigns with these IDs.
    */
  var excludedIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only campaigns with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Select only campaigns that have overridden this event tag ID.
    */
  var overriddenEventTagId: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Allows searching for campaigns by name or ID. Wildcards (*) are allowed.
    * For example, "campaign*2015" will return campaigns with names like
    * "campaign June 2015", "campaign April 2015", or simply "campaign 2015".
    * Most of the searches also add wildcards implicitly at the start and the
    * end of the search string. For example, a search string of "campaign" will
    * match campaigns with name "my campaign", "campaign 2015", or simply
    * "campaign".
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
    * Select only campaigns that belong to this subaccount.
    */
  var subaccountId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCampaignsList {
  
  @scala.inline
  def apply(): ParamsResourceCampaignsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCampaignsList]
  }
  
  @scala.inline
  implicit class ParamsResourceCampaignsListMutableBuilder[Self <: ParamsResourceCampaignsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserGroupIds(value: js.Array[String]): Self = StObject.set(x, "advertiserGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserGroupIdsUndefined: Self = StObject.set(x, "advertiserGroupIds", js.undefined)
    
    @scala.inline
    def setAdvertiserGroupIdsVarargs(value: String*): Self = StObject.set(x, "advertiserGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "advertiserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdsUndefined: Self = StObject.set(x, "advertiserIds", js.undefined)
    
    @scala.inline
    def setAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "advertiserIds", js.Array(value :_*))
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setAtLeastOneOptimizationActivity(value: Boolean): Self = StObject.set(x, "atLeastOneOptimizationActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtLeastOneOptimizationActivityUndefined: Self = StObject.set(x, "atLeastOneOptimizationActivity", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setExcludedIds(value: js.Array[String]): Self = StObject.set(x, "excludedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedIdsUndefined: Self = StObject.set(x, "excludedIds", js.undefined)
    
    @scala.inline
    def setExcludedIdsVarargs(value: String*): Self = StObject.set(x, "excludedIds", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOverriddenEventTagId(value: String): Self = StObject.set(x, "overriddenEventTagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverriddenEventTagIdUndefined: Self = StObject.set(x, "overriddenEventTagId", js.undefined)
    
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
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
  }
}

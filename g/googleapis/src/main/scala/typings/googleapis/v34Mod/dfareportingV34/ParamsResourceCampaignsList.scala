package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCampaignsList
  extends StObject
     with StandardParameters {
  
  /**
    * Select only campaigns whose advertisers belong to these advertiser groups.
    */
  var advertiserGroupIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only campaigns that belong to these advertisers.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only archived campaigns. Don't set this field to select both archived and non-archived campaigns.
    */
  var archived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Select only campaigns that have at least one optimization activity.
    */
  var atLeastOneOptimizationActivity: js.UndefOr[Boolean] = js.undefined
  
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
    * Allows searching for campaigns by name or ID. Wildcards (*) are allowed. For example, "campaign*2015" will return campaigns with names like "campaign June 2015", "campaign April 2015", or simply "campaign 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "campaign" will match campaigns with name "my campaign", "campaign 2015", or simply "campaign".
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
  
  inline def apply(): ParamsResourceCampaignsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCampaignsList]
  }
  
  extension [Self <: ParamsResourceCampaignsList](x: Self) {
    
    inline def setAdvertiserGroupIds(value: js.Array[String]): Self = StObject.set(x, "advertiserGroupIds", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserGroupIdsUndefined: Self = StObject.set(x, "advertiserGroupIds", js.undefined)
    
    inline def setAdvertiserGroupIdsVarargs(value: String*): Self = StObject.set(x, "advertiserGroupIds", js.Array(value*))
    
    inline def setAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "advertiserIds", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdsUndefined: Self = StObject.set(x, "advertiserIds", js.undefined)
    
    inline def setAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "advertiserIds", js.Array(value*))
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setAtLeastOneOptimizationActivity(value: Boolean): Self = StObject.set(x, "atLeastOneOptimizationActivity", value.asInstanceOf[js.Any])
    
    inline def setAtLeastOneOptimizationActivityUndefined: Self = StObject.set(x, "atLeastOneOptimizationActivity", js.undefined)
    
    inline def setExcludedIds(value: js.Array[String]): Self = StObject.set(x, "excludedIds", value.asInstanceOf[js.Any])
    
    inline def setExcludedIdsUndefined: Self = StObject.set(x, "excludedIds", js.undefined)
    
    inline def setExcludedIdsVarargs(value: String*): Self = StObject.set(x, "excludedIds", js.Array(value*))
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setOverriddenEventTagId(value: String): Self = StObject.set(x, "overriddenEventTagId", value.asInstanceOf[js.Any])
    
    inline def setOverriddenEventTagIdUndefined: Self = StObject.set(x, "overriddenEventTagId", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    inline def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
    
    inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
  }
}

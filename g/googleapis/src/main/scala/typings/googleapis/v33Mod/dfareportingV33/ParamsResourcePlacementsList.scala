package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePlacementsList
  extends StObject
     with StandardParameters {
  
  /**
    * Select only placements that belong to these advertisers.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only archived placements. Don't set this field to select both archived and non-archived placements.
    */
  var archived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Select only placements that belong to these campaigns.
    */
  var campaignIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only placements that are associated with these compatibilities. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on mobile devices for regular or interstitial ads respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with the VAST standard.
    */
  var compatibilities: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only placements that are associated with these content categories.
    */
  var contentCategoryIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only placements that are associated with these directory sites.
    */
  var directorySiteIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only placements that belong to these placement groups.
    */
  var groupIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only placements with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only placements or placement groups whose end date is on or before the specified maxEndDate. The date should be formatted as "yyyy-MM-dd".
    */
  var maxEndDate: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Select only placements or placement groups whose start date is on or before the specified maxStartDate. The date should be formatted as "yyyy-MM-dd".
    */
  var maxStartDate: js.UndefOr[String] = js.undefined
  
  /**
    * Select only placements or placement groups whose end date is on or after the specified minEndDate. The date should be formatted as "yyyy-MM-dd".
    */
  var minEndDate: js.UndefOr[String] = js.undefined
  
  /**
    * Select only placements or placement groups whose start date is on or after the specified minStartDate. The date should be formatted as "yyyy-MM-dd".
    */
  var minStartDate: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Select only placements with this payment source.
    */
  var paymentSource: js.UndefOr[String] = js.undefined
  
  /**
    * Select only placements that are associated with these placement strategies.
    */
  var placementStrategyIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only placements with these pricing types.
    */
  var pricingTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Allows searching for placements by name or ID. Wildcards (*) are allowed. For example, "placement*2015" will return placements with names like "placement June 2015", "placement May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "placement" will match placements with name "my placement", "placement 2015", or simply "placement" .
    */
  var searchString: js.UndefOr[String] = js.undefined
  
  /**
    * Select only placements that are associated with these sites.
    */
  var siteIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only placements that are associated with these sizes.
    */
  var sizeIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.undefined
  
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.undefined
}
object ParamsResourcePlacementsList {
  
  inline def apply(): ParamsResourcePlacementsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePlacementsList]
  }
  
  extension [Self <: ParamsResourcePlacementsList](x: Self) {
    
    inline def setAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "advertiserIds", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdsUndefined: Self = StObject.set(x, "advertiserIds", js.undefined)
    
    inline def setAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "advertiserIds", js.Array(value*))
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setCampaignIds(value: js.Array[String]): Self = StObject.set(x, "campaignIds", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdsUndefined: Self = StObject.set(x, "campaignIds", js.undefined)
    
    inline def setCampaignIdsVarargs(value: String*): Self = StObject.set(x, "campaignIds", js.Array(value*))
    
    inline def setCompatibilities(value: js.Array[String]): Self = StObject.set(x, "compatibilities", value.asInstanceOf[js.Any])
    
    inline def setCompatibilitiesUndefined: Self = StObject.set(x, "compatibilities", js.undefined)
    
    inline def setCompatibilitiesVarargs(value: String*): Self = StObject.set(x, "compatibilities", js.Array(value*))
    
    inline def setContentCategoryIds(value: js.Array[String]): Self = StObject.set(x, "contentCategoryIds", value.asInstanceOf[js.Any])
    
    inline def setContentCategoryIdsUndefined: Self = StObject.set(x, "contentCategoryIds", js.undefined)
    
    inline def setContentCategoryIdsVarargs(value: String*): Self = StObject.set(x, "contentCategoryIds", js.Array(value*))
    
    inline def setDirectorySiteIds(value: js.Array[String]): Self = StObject.set(x, "directorySiteIds", value.asInstanceOf[js.Any])
    
    inline def setDirectorySiteIdsUndefined: Self = StObject.set(x, "directorySiteIds", js.undefined)
    
    inline def setDirectorySiteIdsVarargs(value: String*): Self = StObject.set(x, "directorySiteIds", js.Array(value*))
    
    inline def setGroupIds(value: js.Array[String]): Self = StObject.set(x, "groupIds", value.asInstanceOf[js.Any])
    
    inline def setGroupIdsUndefined: Self = StObject.set(x, "groupIds", js.undefined)
    
    inline def setGroupIdsVarargs(value: String*): Self = StObject.set(x, "groupIds", js.Array(value*))
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setMaxEndDate(value: String): Self = StObject.set(x, "maxEndDate", value.asInstanceOf[js.Any])
    
    inline def setMaxEndDateUndefined: Self = StObject.set(x, "maxEndDate", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMaxStartDate(value: String): Self = StObject.set(x, "maxStartDate", value.asInstanceOf[js.Any])
    
    inline def setMaxStartDateUndefined: Self = StObject.set(x, "maxStartDate", js.undefined)
    
    inline def setMinEndDate(value: String): Self = StObject.set(x, "minEndDate", value.asInstanceOf[js.Any])
    
    inline def setMinEndDateUndefined: Self = StObject.set(x, "minEndDate", js.undefined)
    
    inline def setMinStartDate(value: String): Self = StObject.set(x, "minStartDate", value.asInstanceOf[js.Any])
    
    inline def setMinStartDateUndefined: Self = StObject.set(x, "minStartDate", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPaymentSource(value: String): Self = StObject.set(x, "paymentSource", value.asInstanceOf[js.Any])
    
    inline def setPaymentSourceUndefined: Self = StObject.set(x, "paymentSource", js.undefined)
    
    inline def setPlacementStrategyIds(value: js.Array[String]): Self = StObject.set(x, "placementStrategyIds", value.asInstanceOf[js.Any])
    
    inline def setPlacementStrategyIdsUndefined: Self = StObject.set(x, "placementStrategyIds", js.undefined)
    
    inline def setPlacementStrategyIdsVarargs(value: String*): Self = StObject.set(x, "placementStrategyIds", js.Array(value*))
    
    inline def setPricingTypes(value: js.Array[String]): Self = StObject.set(x, "pricingTypes", value.asInstanceOf[js.Any])
    
    inline def setPricingTypesUndefined: Self = StObject.set(x, "pricingTypes", js.undefined)
    
    inline def setPricingTypesVarargs(value: String*): Self = StObject.set(x, "pricingTypes", js.Array(value*))
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    inline def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
    
    inline def setSiteIds(value: js.Array[String]): Self = StObject.set(x, "siteIds", value.asInstanceOf[js.Any])
    
    inline def setSiteIdsUndefined: Self = StObject.set(x, "siteIds", js.undefined)
    
    inline def setSiteIdsVarargs(value: String*): Self = StObject.set(x, "siteIds", js.Array(value*))
    
    inline def setSizeIds(value: js.Array[String]): Self = StObject.set(x, "sizeIds", value.asInstanceOf[js.Any])
    
    inline def setSizeIdsUndefined: Self = StObject.set(x, "sizeIds", js.undefined)
    
    inline def setSizeIdsVarargs(value: String*): Self = StObject.set(x, "sizeIds", js.Array(value*))
    
    inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}

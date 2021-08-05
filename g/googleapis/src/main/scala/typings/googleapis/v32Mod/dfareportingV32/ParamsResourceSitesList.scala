package typings.googleapis.v32Mod.dfareportingV32

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSitesList
  extends StObject
     with StandardParameters {
  
  /**
    * This search filter is no longer supported and will have no effect on the
    * results returned.
    */
  var acceptsInStreamVideoPlacements: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This search filter is no longer supported and will have no effect on the
    * results returned.
    */
  var acceptsInterstitialPlacements: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Select only sites that accept publisher paid placements.
    */
  var acceptsPublisherPaidPlacements: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Select only AdWords sites.
    */
  var adWordsSite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Select only approved sites.
    */
  var approved: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Select only sites with these campaign IDs.
    */
  var campaignIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only sites with these directory site IDs.
    */
  var directorySiteIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only sites with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Allows searching for objects by name, ID or keyName. Wildcards (*) are
    * allowed. For example, "site*2015" will return objects with names like
    * "site June 2015", "site April 2015", or simply "site 2015". Most of the
    * searches also add wildcards implicitly at the start and the end of the
    * search string. For example, a search string of "site" will match objects
    * with name "my site", "site 2015", or simply "site".
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
    * Select only sites with this subaccount ID.
    */
  var subaccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Select only sites that have not been mapped to a directory site.
    */
  var unmappedSite: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceSitesList {
  
  inline def apply(): ParamsResourceSitesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesList]
  }
  
  extension [Self <: ParamsResourceSitesList](x: Self) {
    
    inline def setAcceptsInStreamVideoPlacements(value: Boolean): Self = StObject.set(x, "acceptsInStreamVideoPlacements", value.asInstanceOf[js.Any])
    
    inline def setAcceptsInStreamVideoPlacementsUndefined: Self = StObject.set(x, "acceptsInStreamVideoPlacements", js.undefined)
    
    inline def setAcceptsInterstitialPlacements(value: Boolean): Self = StObject.set(x, "acceptsInterstitialPlacements", value.asInstanceOf[js.Any])
    
    inline def setAcceptsInterstitialPlacementsUndefined: Self = StObject.set(x, "acceptsInterstitialPlacements", js.undefined)
    
    inline def setAcceptsPublisherPaidPlacements(value: Boolean): Self = StObject.set(x, "acceptsPublisherPaidPlacements", value.asInstanceOf[js.Any])
    
    inline def setAcceptsPublisherPaidPlacementsUndefined: Self = StObject.set(x, "acceptsPublisherPaidPlacements", js.undefined)
    
    inline def setAdWordsSite(value: Boolean): Self = StObject.set(x, "adWordsSite", value.asInstanceOf[js.Any])
    
    inline def setAdWordsSiteUndefined: Self = StObject.set(x, "adWordsSite", js.undefined)
    
    inline def setApproved(value: Boolean): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
    
    inline def setApprovedUndefined: Self = StObject.set(x, "approved", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCampaignIds(value: js.Array[String]): Self = StObject.set(x, "campaignIds", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdsUndefined: Self = StObject.set(x, "campaignIds", js.undefined)
    
    inline def setCampaignIdsVarargs(value: String*): Self = StObject.set(x, "campaignIds", js.Array(value :_*))
    
    inline def setDirectorySiteIds(value: js.Array[String]): Self = StObject.set(x, "directorySiteIds", value.asInstanceOf[js.Any])
    
    inline def setDirectorySiteIdsUndefined: Self = StObject.set(x, "directorySiteIds", js.undefined)
    
    inline def setDirectorySiteIdsVarargs(value: String*): Self = StObject.set(x, "directorySiteIds", js.Array(value :_*))
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
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
    
    inline def setUnmappedSite(value: Boolean): Self = StObject.set(x, "unmappedSite", value.asInstanceOf[js.Any])
    
    inline def setUnmappedSiteUndefined: Self = StObject.set(x, "unmappedSite", js.undefined)
  }
}

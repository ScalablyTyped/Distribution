package typings.googleapis.v31Mod.dfareportingV31

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDirectorysitesList
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
    * Select only directory sites that accept publisher paid placements. This
    * field can be left blank.
    */
  var acceptsPublisherPaidPlacements: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Select only active directory sites. Leave blank to retrieve both active
    * and inactive directory sites.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Select only directory sites with this country ID.
    */
  var countryId: js.UndefOr[String] = js.undefined
  
  /**
    * Select only directory sites with this Ad Manager network code.
    */
  var dfpNetworkCode: js.UndefOr[String] = js.undefined
  
  /**
    * Select only directory sites with these IDs.
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
    * Select only directory sites with this parent ID.
    */
  var parentId: js.UndefOr[String] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Allows searching for objects by name, ID or URL. Wildcards (*) are
    * allowed. For example, "directory site*2015" will return objects with
    * names like "directory site June 2015", "directory site April 2015", or
    * simply "directory site 2015". Most of the searches also add wildcards
    * implicitly at the start and the end of the search string. For example, a
    * search string of "directory site" will match objects with name "my
    * directory site", "directory site 2015" or simply, "directory site".
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
}
object ParamsResourceDirectorysitesList {
  
  @scala.inline
  def apply(): ParamsResourceDirectorysitesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDirectorysitesList]
  }
  
  @scala.inline
  implicit class ParamsResourceDirectorysitesListMutableBuilder[Self <: ParamsResourceDirectorysitesList] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCountryId(value: String): Self = StObject.set(x, "countryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryIdUndefined: Self = StObject.set(x, "countryId", js.undefined)
    
    @scala.inline
    def setDfpNetworkCode(value: String): Self = StObject.set(x, "dfpNetworkCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDfpNetworkCodeUndefined: Self = StObject.set(x, "dfpNetworkCode", js.undefined)
    
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
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
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
  }
}

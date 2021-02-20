package typings.googleapis.v31Mod.dfareportingV31

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCreativesList extends StandardParameters {
  
  /**
    * Select only active creatives. Leave blank to select active and inactive
    * creatives.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Select only creatives with this advertiser ID.
    */
  var advertiserId: js.UndefOr[String] = js.native
  
  /**
    * Select only archived creatives. Leave blank to select archived and
    * unarchived creatives.
    */
  var archived: js.UndefOr[Boolean] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Select only creatives with this campaign ID.
    */
  var campaignId: js.UndefOr[String] = js.native
  
  /**
    * Select only in-stream video creatives with these companion IDs.
    */
  var companionCreativeIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only creatives with these creative field IDs.
    */
  var creativeFieldIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only creatives with these IDs.
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
    * Select only creatives with these rendering IDs.
    */
  var renderingIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Allows searching for objects by name or ID. Wildcards (*) are allowed.
    * For example, "creative*2015" will return objects with names like
    * "creative June 2015", "creative April 2015", or simply "creative 2015".
    * Most of the searches also add wildcards implicitly at the start and the
    * end of the search string. For example, a search string of "creative" will
    * match objects with name "my creative", "creative 2015", or simply
    * "creative".
    */
  var searchString: js.UndefOr[String] = js.native
  
  /**
    * Select only creatives with these size IDs.
    */
  var sizeIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.native
  
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.native
  
  /**
    * Select only creatives corresponding to this Studio creative ID.
    */
  var studioCreativeId: js.UndefOr[String] = js.native
  
  /**
    * Select only creatives with these creative types.
    */
  var types: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourceCreativesList {
  
  @scala.inline
  def apply(): ParamsResourceCreativesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCreativesList]
  }
  
  @scala.inline
  implicit class ParamsResourceCreativesListMutableBuilder[Self <: ParamsResourceCreativesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    @scala.inline
    def setCompanionCreativeIds(value: js.Array[String]): Self = StObject.set(x, "companionCreativeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionCreativeIdsUndefined: Self = StObject.set(x, "companionCreativeIds", js.undefined)
    
    @scala.inline
    def setCompanionCreativeIdsVarargs(value: String*): Self = StObject.set(x, "companionCreativeIds", js.Array(value :_*))
    
    @scala.inline
    def setCreativeFieldIds(value: js.Array[String]): Self = StObject.set(x, "creativeFieldIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeFieldIdsUndefined: Self = StObject.set(x, "creativeFieldIds", js.undefined)
    
    @scala.inline
    def setCreativeFieldIdsVarargs(value: String*): Self = StObject.set(x, "creativeFieldIds", js.Array(value :_*))
    
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
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    @scala.inline
    def setRenderingIds(value: js.Array[String]): Self = StObject.set(x, "renderingIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingIdsUndefined: Self = StObject.set(x, "renderingIds", js.undefined)
    
    @scala.inline
    def setRenderingIdsVarargs(value: String*): Self = StObject.set(x, "renderingIds", js.Array(value :_*))
    
    @scala.inline
    def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
    
    @scala.inline
    def setSizeIds(value: js.Array[String]): Self = StObject.set(x, "sizeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeIdsUndefined: Self = StObject.set(x, "sizeIds", js.undefined)
    
    @scala.inline
    def setSizeIdsVarargs(value: String*): Self = StObject.set(x, "sizeIds", js.Array(value :_*))
    
    @scala.inline
    def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    @scala.inline
    def setStudioCreativeId(value: String): Self = StObject.set(x, "studioCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudioCreativeIdUndefined: Self = StObject.set(x, "studioCreativeId", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}

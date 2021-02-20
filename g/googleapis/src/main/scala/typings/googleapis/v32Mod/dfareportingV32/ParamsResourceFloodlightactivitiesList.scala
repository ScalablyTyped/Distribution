package typings.googleapis.v32Mod.dfareportingV32

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceFloodlightactivitiesList extends StandardParameters {
  
  /**
    * Select only floodlight activities for the specified advertiser ID. Must
    * specify either ids, advertiserId, or floodlightConfigurationId for a
    * non-empty result.
    */
  var advertiserId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Select only floodlight activities with the specified floodlight activity
    * group IDs.
    */
  var floodlightActivityGroupIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only floodlight activities with the specified floodlight activity
    * group name.
    */
  var floodlightActivityGroupName: js.UndefOr[String] = js.native
  
  /**
    * Select only floodlight activities with the specified floodlight activity
    * group tag string.
    */
  var floodlightActivityGroupTagString: js.UndefOr[String] = js.native
  
  /**
    * Select only floodlight activities with the specified floodlight activity
    * group type.
    */
  var floodlightActivityGroupType: js.UndefOr[String] = js.native
  
  /**
    * Select only floodlight activities for the specified floodlight
    * configuration ID. Must specify either ids, advertiserId, or
    * floodlightConfigurationId for a non-empty result.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  
  /**
    * Select only floodlight activities with the specified IDs. Must specify
    * either ids, advertiserId, or floodlightConfigurationId for a non-empty
    * result.
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
    * Allows searching for objects by name or ID. Wildcards (*) are allowed.
    * For example, "floodlightactivity*2015" will return objects with names
    * like "floodlightactivity June 2015", "floodlightactivity April 2015", or
    * simply "floodlightactivity 2015". Most of the searches also add wildcards
    * implicitly at the start and the end of the search string. For example, a
    * search string of "floodlightactivity" will match objects with name "my
    * floodlightactivity activity", "floodlightactivity 2015", or simply
    * "floodlightactivity".
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
    * Select only floodlight activities with the specified tag string.
    */
  var tagString: js.UndefOr[String] = js.native
}
object ParamsResourceFloodlightactivitiesList {
  
  @scala.inline
  def apply(): ParamsResourceFloodlightactivitiesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFloodlightactivitiesList]
  }
  
  @scala.inline
  implicit class ParamsResourceFloodlightactivitiesListMutableBuilder[Self <: ParamsResourceFloodlightactivitiesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFloodlightActivityGroupIds(value: js.Array[String]): Self = StObject.set(x, "floodlightActivityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityGroupIdsUndefined: Self = StObject.set(x, "floodlightActivityGroupIds", js.undefined)
    
    @scala.inline
    def setFloodlightActivityGroupIdsVarargs(value: String*): Self = StObject.set(x, "floodlightActivityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setFloodlightActivityGroupName(value: String): Self = StObject.set(x, "floodlightActivityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityGroupNameUndefined: Self = StObject.set(x, "floodlightActivityGroupName", js.undefined)
    
    @scala.inline
    def setFloodlightActivityGroupTagString(value: String): Self = StObject.set(x, "floodlightActivityGroupTagString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityGroupTagStringUndefined: Self = StObject.set(x, "floodlightActivityGroupTagString", js.undefined)
    
    @scala.inline
    def setFloodlightActivityGroupType(value: String): Self = StObject.set(x, "floodlightActivityGroupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityGroupTypeUndefined: Self = StObject.set(x, "floodlightActivityGroupType", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationId(value: String): Self = StObject.set(x, "floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightConfigurationIdUndefined: Self = StObject.set(x, "floodlightConfigurationId", js.undefined)
    
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
    def setTagString(value: String): Self = StObject.set(x, "tagString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagStringUndefined: Self = StObject.set(x, "tagString", js.undefined)
  }
}

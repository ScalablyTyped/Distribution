package typings.googleapis.v33Mod.dfareportingV33

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
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
  implicit class ParamsResourceFloodlightactivitiesListOps[Self <: ParamsResourceFloodlightactivitiesList] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setFloodlightActivityGroupIdsVarargs(value: String*): Self = this.set("floodlightActivityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setFloodlightActivityGroupIds(value: js.Array[String]): Self = this.set("floodlightActivityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityGroupIds: Self = this.set("floodlightActivityGroupIds", js.undefined)
    
    @scala.inline
    def setFloodlightActivityGroupName(value: String): Self = this.set("floodlightActivityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityGroupName: Self = this.set("floodlightActivityGroupName", js.undefined)
    
    @scala.inline
    def setFloodlightActivityGroupTagString(value: String): Self = this.set("floodlightActivityGroupTagString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityGroupTagString: Self = this.set("floodlightActivityGroupTagString", js.undefined)
    
    @scala.inline
    def setFloodlightActivityGroupType(value: String): Self = this.set("floodlightActivityGroupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityGroupType: Self = this.set("floodlightActivityGroupType", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationId(value: String): Self = this.set("floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightConfigurationId: Self = this.set("floodlightConfigurationId", js.undefined)
    
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
    def setTagString(value: String): Self = this.set("tagString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagString: Self = this.set("tagString", js.undefined)
  }
}

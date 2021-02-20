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
trait ParamsResourceEventtagsList extends StandardParameters {
  
  /**
    * Select only event tags that belong to this ad.
    */
  var adId: js.UndefOr[String] = js.native
  
  /**
    * Select only event tags that belong to this advertiser.
    */
  var advertiserId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Select only event tags that belong to this campaign.
    */
  var campaignId: js.UndefOr[String] = js.native
  
  /**
    * Examine only the specified campaign or advertiser's event tags for
    * matching selector criteria. When set to false, the parent advertiser and
    * parent campaign of the specified ad or campaign is examined as well. In
    * addition, when set to false, the status field is examined as well, along
    * with the enabledByDefault field. This parameter can not be set to true
    * when adId is specified as ads do not define their own even tags.
    */
  var definitionsOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Select only enabled event tags. What is considered enabled or disabled
    * depends on the definitionsOnly parameter. When definitionsOnly is set to
    * true, only the specified advertiser or campaign's event tags'
    * enabledByDefault field is examined. When definitionsOnly is set to false,
    * the specified ad or specified campaign's parent advertiser's or parent
    * campaign's event tags' enabledByDefault and status fields are examined as
    * well.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Select only event tags with the specified event tag types. Event tag
    * types can be used to specify whether to use a third-party pixel, a
    * third-party JavaScript URL, or a third-party click-through URL for either
    * impression or click tracking.
    */
  var eventTagTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only event tags with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  
  /**
    * Allows searching for objects by name or ID. Wildcards (*) are allowed.
    * For example, "eventtag*2015" will return objects with names like
    * "eventtag June 2015", "eventtag April 2015", or simply "eventtag 2015".
    * Most of the searches also add wildcards implicitly at the start and the
    * end of the search string. For example, a search string of "eventtag" will
    * match objects with name "my eventtag", "eventtag 2015", or simply
    * "eventtag".
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
}
object ParamsResourceEventtagsList {
  
  @scala.inline
  def apply(): ParamsResourceEventtagsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventtagsList]
  }
  
  @scala.inline
  implicit class ParamsResourceEventtagsListMutableBuilder[Self <: ParamsResourceEventtagsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdId(value: String): Self = StObject.set(x, "adId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdIdUndefined: Self = StObject.set(x, "adId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    @scala.inline
    def setDefinitionsOnly(value: Boolean): Self = StObject.set(x, "definitionsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionsOnlyUndefined: Self = StObject.set(x, "definitionsOnly", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setEventTagTypes(value: js.Array[String]): Self = StObject.set(x, "eventTagTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTagTypesUndefined: Self = StObject.set(x, "eventTagTypes", js.undefined)
    
    @scala.inline
    def setEventTagTypesVarargs(value: String*): Self = StObject.set(x, "eventTagTypes", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
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

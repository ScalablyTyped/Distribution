package typings.googleapis.v33Mod.dfareportingV33

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertiserlandingpagesList
  extends StObject
     with StandardParameters {
  
  /**
    * Select only landing pages that belong to these advertisers.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only archived landing pages. Don't set this field to select both
    * archived and non-archived landing pages.
    */
  var archived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Select only landing pages that are associated with these campaigns.
    */
  var campaignIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only landing pages with these IDs.
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
    * Allows searching for landing pages by name or ID. Wildcards (*) are
    * allowed. For example, "landingpage*2017" will return landing pages with
    * names like "landingpage July 2017", "landingpage March 2017", or simply
    * "landingpage 2017". Most of the searches also add wildcards implicitly at
    * the start and the end of the search string. For example, a search string
    * of "landingpage" will match campaigns with name "my landingpage",
    * "landingpage 2015", or simply "landingpage".
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
    * Select only landing pages that belong to this subaccount.
    */
  var subaccountId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertiserlandingpagesList {
  
  @scala.inline
  def apply(): ParamsResourceAdvertiserlandingpagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertiserlandingpagesList]
  }
  
  @scala.inline
  implicit class ParamsResourceAdvertiserlandingpagesListMutableBuilder[Self <: ParamsResourceAdvertiserlandingpagesList] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCampaignIds(value: js.Array[String]): Self = StObject.set(x, "campaignIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignIdsUndefined: Self = StObject.set(x, "campaignIds", js.undefined)
    
    @scala.inline
    def setCampaignIdsVarargs(value: String*): Self = StObject.set(x, "campaignIds", js.Array(value :_*))
    
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
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
  }
}

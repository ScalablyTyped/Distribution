package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePeopleListbyactivity
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the activity to get the list of people for.
    */
  var activityId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The collection of people to list.
    */
  var collection: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of people to include in the response, which is used
    * for paging. For any response, the actual number returned might be less
    * than the specified maxResults.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * "nextPageToken" from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourcePeopleListbyactivity {
  
  @scala.inline
  def apply(): ParamsResourcePeopleListbyactivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleListbyactivity]
  }
  
  @scala.inline
  implicit class ParamsResourcePeopleListbyactivityMutableBuilder[Self <: ParamsResourcePeopleListbyactivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityIdUndefined: Self = StObject.set(x, "activityId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}

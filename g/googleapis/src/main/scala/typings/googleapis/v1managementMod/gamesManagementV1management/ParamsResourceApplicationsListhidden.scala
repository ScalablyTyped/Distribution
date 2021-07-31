package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceApplicationsListhidden
  extends StObject
     with StandardParameters {
  
  /**
    * The application ID from the Google Play developer console.
    */
  var applicationId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The maximum number of player resources to return in the response, used
    * for paging. For any response, the actual number of player resources
    * returned may be less than the specified maxResults.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceApplicationsListhidden {
  
  @scala.inline
  def apply(): ParamsResourceApplicationsListhidden = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceApplicationsListhidden]
  }
  
  @scala.inline
  implicit class ParamsResourceApplicationsListhiddenMutableBuilder[Self <: ParamsResourceApplicationsListhidden] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
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

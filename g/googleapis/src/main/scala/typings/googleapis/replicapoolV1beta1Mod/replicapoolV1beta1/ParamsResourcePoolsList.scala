package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePoolsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Maximum count of results to be returned. Acceptable values are 0 to 100,
    * inclusive. (Default: 50)
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Set this to the nextPageToken value returned by a previous list request
    * to obtain the next page of results from the previous list request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID for this request.
    */
  var projectName: js.UndefOr[String] = js.undefined
  
  /**
    * The zone for this replica pool.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourcePoolsList {
  
  @scala.inline
  def apply(): ParamsResourcePoolsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePoolsList]
  }
  
  @scala.inline
  implicit class ParamsResourcePoolsListMutableBuilder[Self <: ParamsResourcePoolsList] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}

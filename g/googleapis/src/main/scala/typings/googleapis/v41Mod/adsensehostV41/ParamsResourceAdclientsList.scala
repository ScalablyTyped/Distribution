package typings.googleapis.v41Mod.adsensehostV41

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdclientsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The maximum number of ad clients to include in the response, used for
    * paging.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * A continuation token, used to page through ad clients. To retrieve the
    * next page, set this parameter to the value of "nextPageToken" from the
    * previous response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdclientsList {
  
  @scala.inline
  def apply(): ParamsResourceAdclientsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdclientsList]
  }
  
  @scala.inline
  implicit class ParamsResourceAdclientsListMutableBuilder[Self <: ParamsResourceAdclientsList] (val x: Self) extends AnyVal {
    
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

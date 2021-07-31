package typings.googleapis.vaultV1Mod.vaultV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMattersHoldsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The matter ID.
    */
  var matterId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of holds to return in the response, between 0 and 100
    * inclusive. Leaving this empty, or as 0, is the same as page_size = 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The pagination token as returned in the response. An empty token means
    * start from the beginning.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which parts of the Hold to return.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceMattersHoldsList {
  
  @scala.inline
  def apply(): ParamsResourceMattersHoldsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersHoldsList]
  }
  
  @scala.inline
  implicit class ParamsResourceMattersHoldsListMutableBuilder[Self <: ParamsResourceMattersHoldsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

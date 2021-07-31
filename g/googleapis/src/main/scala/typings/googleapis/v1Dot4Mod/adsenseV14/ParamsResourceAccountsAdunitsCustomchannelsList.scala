package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdunitsCustomchannelsList
  extends StObject
     with StandardParameters {
  
  /**
    * Account to which the ad client belongs.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad client which contains the ad unit.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad unit for which to list custom channels.
    */
  var adUnitId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The maximum number of custom channels to include in the response, used
    * for paging.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * A continuation token, used to page through custom channels. To retrieve
    * the next page, set this parameter to the value of "nextPageToken" from
    * the previous response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAdunitsCustomchannelsList {
  
  @scala.inline
  def apply(): ParamsResourceAccountsAdunitsCustomchannelsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdunitsCustomchannelsList]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsAdunitsCustomchannelsListMutableBuilder[Self <: ParamsResourceAccountsAdunitsCustomchannelsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    @scala.inline
    def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdUnitIdUndefined: Self = StObject.set(x, "adUnitId", js.undefined)
    
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

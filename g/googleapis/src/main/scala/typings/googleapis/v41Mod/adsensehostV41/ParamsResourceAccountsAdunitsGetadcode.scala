package typings.googleapis.v41Mod.adsensehostV41

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdunitsGetadcode
  extends StObject
     with StandardParameters {
  
  /**
    * Account which contains the ad client.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad client with contains the ad unit.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad unit to get the code for.
    */
  var adUnitId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Host custom channel to attach to the ad code.
    */
  var hostCustomChannelId: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceAccountsAdunitsGetadcode {
  
  inline def apply(): ParamsResourceAccountsAdunitsGetadcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdunitsGetadcode]
  }
  
  extension [Self <: ParamsResourceAccountsAdunitsGetadcode](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    inline def setAdUnitIdUndefined: Self = StObject.set(x, "adUnitId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setHostCustomChannelId(value: js.Array[String]): Self = StObject.set(x, "hostCustomChannelId", value.asInstanceOf[js.Any])
    
    inline def setHostCustomChannelIdUndefined: Self = StObject.set(x, "hostCustomChannelId", js.undefined)
    
    inline def setHostCustomChannelIdVarargs(value: String*): Self = StObject.set(x, "hostCustomChannelId", js.Array(value :_*))
  }
}

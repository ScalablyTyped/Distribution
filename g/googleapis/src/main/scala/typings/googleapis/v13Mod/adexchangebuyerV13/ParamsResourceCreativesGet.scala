package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCreativesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The id for the account that will serve this creative.
    */
  var accountId: js.UndefOr[Double] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The buyer-specific id for this creative.
    */
  var buyerCreativeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCreativesGet {
  
  inline def apply(): ParamsResourceCreativesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCreativesGet]
  }
  
  extension [Self <: ParamsResourceCreativesGet](x: Self) {
    
    inline def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBuyerCreativeId(value: String): Self = StObject.set(x, "buyerCreativeId", value.asInstanceOf[js.Any])
    
    inline def setBuyerCreativeIdUndefined: Self = StObject.set(x, "buyerCreativeId", js.undefined)
  }
}

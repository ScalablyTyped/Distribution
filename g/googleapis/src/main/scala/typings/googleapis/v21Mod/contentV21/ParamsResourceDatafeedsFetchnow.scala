package typings.googleapis.v21Mod.contentV21

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDatafeedsFetchnow
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the datafeed to be fetched.
    */
  var datafeedId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the account that manages the datafeed. This account cannot be a
    * multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourceDatafeedsFetchnow {
  
  inline def apply(): ParamsResourceDatafeedsFetchnow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDatafeedsFetchnow]
  }
  
  extension [Self <: ParamsResourceDatafeedsFetchnow](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setDatafeedId(value: String): Self = StObject.set(x, "datafeedId", value.asInstanceOf[js.Any])
    
    inline def setDatafeedIdUndefined: Self = StObject.set(x, "datafeedId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}

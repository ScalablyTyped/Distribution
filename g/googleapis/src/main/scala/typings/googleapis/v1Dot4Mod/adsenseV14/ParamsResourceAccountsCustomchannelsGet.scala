package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCustomchannelsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account to which the ad client belongs.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad client which contains the custom channel.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * Custom channel to retrieve.
    */
  var customChannelId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsCustomchannelsGet {
  
  inline def apply(): ParamsResourceAccountsCustomchannelsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCustomchannelsGet]
  }
  
  extension [Self <: ParamsResourceAccountsCustomchannelsGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    inline def setCustomChannelId(value: String): Self = StObject.set(x, "customChannelId", value.asInstanceOf[js.Any])
    
    inline def setCustomChannelIdUndefined: Self = StObject.set(x, "customChannelId", js.undefined)
  }
}

package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdclientsGetadcode
  extends StObject
     with StandardParameters {
  
  /**
    * Account which contains the ad client.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad client to get the code for.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * Tag partner to include in the ad code snippet.
    */
  var tagPartner: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAdclientsGetadcode {
  
  inline def apply(): ParamsResourceAccountsAdclientsGetadcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdclientsGetadcode]
  }
  
  extension [Self <: ParamsResourceAccountsAdclientsGetadcode](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    inline def setTagPartner(value: String): Self = StObject.set(x, "tagPartner", value.asInstanceOf[js.Any])
    
    inline def setTagPartnerUndefined: Self = StObject.set(x, "tagPartner", js.undefined)
  }
}

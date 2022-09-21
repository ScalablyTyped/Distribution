package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdclientsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account which contains the ad client.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad client to get.
    */
  var adClientId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAdclientsGet {
  
  inline def apply(): ParamsResourceAccountsAdclientsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdclientsGet]
  }
  
  extension [Self <: ParamsResourceAccountsAdclientsGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
  }
}

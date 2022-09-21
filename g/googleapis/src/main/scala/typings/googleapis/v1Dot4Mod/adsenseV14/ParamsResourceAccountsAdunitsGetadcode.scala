package typings.googleapis.v1Dot4Mod.adsenseV14

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
  }
}

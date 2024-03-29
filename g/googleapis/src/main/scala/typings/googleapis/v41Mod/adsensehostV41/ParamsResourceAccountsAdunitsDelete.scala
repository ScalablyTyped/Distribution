package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdunitsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Account which contains the ad unit.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad client for which to get ad unit.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad unit to delete.
    */
  var adUnitId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAdunitsDelete {
  
  inline def apply(): ParamsResourceAccountsAdunitsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdunitsDelete]
  }
  
  extension [Self <: ParamsResourceAccountsAdunitsDelete](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    inline def setAdUnitIdUndefined: Self = StObject.set(x, "adUnitId", js.undefined)
  }
}

package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAlertsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Account which contains the ad unit.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Alert to delete.
    */
  var alertId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAlertsDelete {
  
  inline def apply(): ParamsResourceAccountsAlertsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAlertsDelete]
  }
  
  extension [Self <: ParamsResourceAccountsAlertsDelete](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAlertId(value: String): Self = StObject.set(x, "alertId", value.asInstanceOf[js.Any])
    
    inline def setAlertIdUndefined: Self = StObject.set(x, "alertId", js.undefined)
  }
}

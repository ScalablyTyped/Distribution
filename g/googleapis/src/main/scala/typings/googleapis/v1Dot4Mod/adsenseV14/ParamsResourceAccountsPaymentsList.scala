package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsPaymentsList
  extends StObject
     with StandardParameters {
  
  /**
    * Account for which to retrieve the payments.
    */
  var accountId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsPaymentsList {
  
  inline def apply(): ParamsResourceAccountsPaymentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsPaymentsList]
  }
  
  extension [Self <: ParamsResourceAccountsPaymentsList](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}

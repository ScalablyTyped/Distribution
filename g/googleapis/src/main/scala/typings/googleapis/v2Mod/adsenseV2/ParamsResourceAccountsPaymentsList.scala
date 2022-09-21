package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsPaymentsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The account which owns the collection of payments. Format: accounts/{account\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsPaymentsList {
  
  inline def apply(): ParamsResourceAccountsPaymentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsPaymentsList]
  }
  
  extension [Self <: ParamsResourceAccountsPaymentsList](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}

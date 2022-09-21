package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsReturncarrierList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Merchant Center Account Id under which the Return Carrier is to be linked.
    */
  var accountId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsReturncarrierList {
  
  inline def apply(): ParamsResourceAccountsReturncarrierList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsReturncarrierList]
  }
  
  extension [Self <: ParamsResourceAccountsReturncarrierList](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}

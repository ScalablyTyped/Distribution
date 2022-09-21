package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsReturncarrierDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Merchant Center Account Id under which the Return Carrier is to be linked.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Google-provided unique carrier ID, used to update the resource.
    */
  var carrierAccountId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsReturncarrierDelete {
  
  inline def apply(): ParamsResourceAccountsReturncarrierDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsReturncarrierDelete]
  }
  
  extension [Self <: ParamsResourceAccountsReturncarrierDelete](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCarrierAccountId(value: String): Self = StObject.set(x, "carrierAccountId", value.asInstanceOf[js.Any])
    
    inline def setCarrierAccountIdUndefined: Self = StObject.set(x, "carrierAccountId", js.undefined)
  }
}

package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsReturncarrierPatch
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
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAccountReturnCarrier] = js.undefined
}
object ParamsResourceAccountsReturncarrierPatch {
  
  inline def apply(): ParamsResourceAccountsReturncarrierPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsReturncarrierPatch]
  }
  
  extension [Self <: ParamsResourceAccountsReturncarrierPatch](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCarrierAccountId(value: String): Self = StObject.set(x, "carrierAccountId", value.asInstanceOf[js.Any])
    
    inline def setCarrierAccountIdUndefined: Self = StObject.set(x, "carrierAccountId", js.undefined)
    
    inline def setRequestBody(value: SchemaAccountReturnCarrier): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

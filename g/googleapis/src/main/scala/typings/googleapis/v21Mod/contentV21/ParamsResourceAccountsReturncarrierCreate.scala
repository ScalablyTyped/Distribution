package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsReturncarrierCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Merchant Center Account Id under which the Return Carrier is to be linked.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAccountReturnCarrier] = js.undefined
}
object ParamsResourceAccountsReturncarrierCreate {
  
  inline def apply(): ParamsResourceAccountsReturncarrierCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsReturncarrierCreate]
  }
  
  extension [Self <: ParamsResourceAccountsReturncarrierCreate](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setRequestBody(value: SchemaAccountReturnCarrier): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

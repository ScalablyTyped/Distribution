package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountReturnCarrierResponse extends StObject {
  
  /** List of all available account return carriers for the merchant. */
  var accountReturnCarriers: js.UndefOr[js.Array[AccountReturnCarrier]] = js.undefined
}
object ListAccountReturnCarrierResponse {
  
  inline def apply(): ListAccountReturnCarrierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountReturnCarrierResponse]
  }
  
  extension [Self <: ListAccountReturnCarrierResponse](x: Self) {
    
    inline def setAccountReturnCarriers(value: js.Array[AccountReturnCarrier]): Self = StObject.set(x, "accountReturnCarriers", value.asInstanceOf[js.Any])
    
    inline def setAccountReturnCarriersUndefined: Self = StObject.set(x, "accountReturnCarriers", js.undefined)
    
    inline def setAccountReturnCarriersVarargs(value: AccountReturnCarrier*): Self = StObject.set(x, "accountReturnCarriers", js.Array(value*))
  }
}

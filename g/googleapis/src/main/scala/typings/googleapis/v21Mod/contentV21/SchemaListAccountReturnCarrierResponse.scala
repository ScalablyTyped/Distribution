package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAccountReturnCarrierResponse extends StObject {
  
  /**
    * List of all available account return carriers for the merchant.
    */
  var accountReturnCarriers: js.UndefOr[js.Array[SchemaAccountReturnCarrier]] = js.undefined
}
object SchemaListAccountReturnCarrierResponse {
  
  inline def apply(): SchemaListAccountReturnCarrierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccountReturnCarrierResponse]
  }
  
  extension [Self <: SchemaListAccountReturnCarrierResponse](x: Self) {
    
    inline def setAccountReturnCarriers(value: js.Array[SchemaAccountReturnCarrier]): Self = StObject.set(x, "accountReturnCarriers", value.asInstanceOf[js.Any])
    
    inline def setAccountReturnCarriersUndefined: Self = StObject.set(x, "accountReturnCarriers", js.undefined)
    
    inline def setAccountReturnCarriersVarargs(value: SchemaAccountReturnCarrier*): Self = StObject.set(x, "accountReturnCarriers", js.Array(value*))
  }
}

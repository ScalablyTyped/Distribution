package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiaOnDisplayToOrderSettings extends StObject {
  
  /**
    * Shipping cost and policy URL.
    */
  var shippingCostPolicyUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the ?On display to order? feature.
    */
  var status: js.UndefOr[String] = js.undefined
}
object SchemaLiaOnDisplayToOrderSettings {
  
  inline def apply(): SchemaLiaOnDisplayToOrderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaOnDisplayToOrderSettings]
  }
  
  extension [Self <: SchemaLiaOnDisplayToOrderSettings](x: Self) {
    
    inline def setShippingCostPolicyUrl(value: String): Self = StObject.set(x, "shippingCostPolicyUrl", value.asInstanceOf[js.Any])
    
    inline def setShippingCostPolicyUrlUndefined: Self = StObject.set(x, "shippingCostPolicyUrl", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

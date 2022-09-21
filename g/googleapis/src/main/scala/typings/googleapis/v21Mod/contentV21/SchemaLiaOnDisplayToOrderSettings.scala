package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiaOnDisplayToOrderSettings extends StObject {
  
  /**
    * Shipping cost and policy URL.
    */
  var shippingCostPolicyUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of the ?On display to order? feature. Acceptable values are: - "`active`" - "`inactive`" - "`pending`"
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiaOnDisplayToOrderSettings {
  
  inline def apply(): SchemaLiaOnDisplayToOrderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaOnDisplayToOrderSettings]
  }
  
  extension [Self <: SchemaLiaOnDisplayToOrderSettings](x: Self) {
    
    inline def setShippingCostPolicyUrl(value: String): Self = StObject.set(x, "shippingCostPolicyUrl", value.asInstanceOf[js.Any])
    
    inline def setShippingCostPolicyUrlNull: Self = StObject.set(x, "shippingCostPolicyUrl", null)
    
    inline def setShippingCostPolicyUrlUndefined: Self = StObject.set(x, "shippingCostPolicyUrl", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

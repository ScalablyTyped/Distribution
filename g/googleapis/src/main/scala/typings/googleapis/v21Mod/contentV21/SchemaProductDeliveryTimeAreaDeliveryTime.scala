package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductDeliveryTimeAreaDeliveryTime extends StObject {
  
  /**
    * Required. The delivery area associated with `deliveryTime` for this product.
    */
  var deliveryArea: js.UndefOr[SchemaDeliveryArea] = js.undefined
  
  /**
    * Required. The delivery time associated with `deliveryArea` for this product.
    */
  var deliveryTime: js.UndefOr[SchemaProductDeliveryTimeAreaDeliveryTimeDeliveryTime] = js.undefined
}
object SchemaProductDeliveryTimeAreaDeliveryTime {
  
  inline def apply(): SchemaProductDeliveryTimeAreaDeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductDeliveryTimeAreaDeliveryTime]
  }
  
  extension [Self <: SchemaProductDeliveryTimeAreaDeliveryTime](x: Self) {
    
    inline def setDeliveryArea(value: SchemaDeliveryArea): Self = StObject.set(x, "deliveryArea", value.asInstanceOf[js.Any])
    
    inline def setDeliveryAreaUndefined: Self = StObject.set(x, "deliveryArea", js.undefined)
    
    inline def setDeliveryTime(value: SchemaProductDeliveryTimeAreaDeliveryTimeDeliveryTime): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTimeUndefined: Self = StObject.set(x, "deliveryTime", js.undefined)
  }
}

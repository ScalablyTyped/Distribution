package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductDeliveryTime extends StObject {
  
  /**
    * Required. A set of associations between `DeliveryArea` and `DeliveryTime` entries. The total number of `areaDeliveryTimes` can be at most 100.
    */
  var areaDeliveryTimes: js.UndefOr[js.Array[SchemaProductDeliveryTimeAreaDeliveryTime]] = js.undefined
  
  /**
    * Required. The `id` of the product.
    */
  var productId: js.UndefOr[SchemaProductId] = js.undefined
}
object SchemaProductDeliveryTime {
  
  inline def apply(): SchemaProductDeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductDeliveryTime]
  }
  
  extension [Self <: SchemaProductDeliveryTime](x: Self) {
    
    inline def setAreaDeliveryTimes(value: js.Array[SchemaProductDeliveryTimeAreaDeliveryTime]): Self = StObject.set(x, "areaDeliveryTimes", value.asInstanceOf[js.Any])
    
    inline def setAreaDeliveryTimesUndefined: Self = StObject.set(x, "areaDeliveryTimes", js.undefined)
    
    inline def setAreaDeliveryTimesVarargs(value: SchemaProductDeliveryTimeAreaDeliveryTime*): Self = StObject.set(x, "areaDeliveryTimes", js.Array(value*))
    
    inline def setProductId(value: SchemaProductId): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}

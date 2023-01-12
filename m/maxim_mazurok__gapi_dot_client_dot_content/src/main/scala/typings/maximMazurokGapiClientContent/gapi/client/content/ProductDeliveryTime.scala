package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductDeliveryTime extends StObject {
  
  /** Required. A set of associations between `DeliveryArea` and `DeliveryTime` entries. The total number of `areaDeliveryTimes` can be at most 100. */
  var areaDeliveryTimes: js.UndefOr[js.Array[ProductDeliveryTimeAreaDeliveryTime]] = js.undefined
  
  /** Required. The `id` of the product. */
  var productId: js.UndefOr[ProductId] = js.undefined
}
object ProductDeliveryTime {
  
  inline def apply(): ProductDeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductDeliveryTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductDeliveryTime] (val x: Self) extends AnyVal {
    
    inline def setAreaDeliveryTimes(value: js.Array[ProductDeliveryTimeAreaDeliveryTime]): Self = StObject.set(x, "areaDeliveryTimes", value.asInstanceOf[js.Any])
    
    inline def setAreaDeliveryTimesUndefined: Self = StObject.set(x, "areaDeliveryTimes", js.undefined)
    
    inline def setAreaDeliveryTimesVarargs(value: ProductDeliveryTimeAreaDeliveryTime*): Self = StObject.set(x, "areaDeliveryTimes", js.Array(value*))
    
    inline def setProductId(value: ProductId): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}

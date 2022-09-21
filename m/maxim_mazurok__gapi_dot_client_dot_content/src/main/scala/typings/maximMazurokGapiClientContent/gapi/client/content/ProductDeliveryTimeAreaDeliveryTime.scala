package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductDeliveryTimeAreaDeliveryTime extends StObject {
  
  /** Required. The delivery area associated with `deliveryTime` for this product. */
  var deliveryArea: js.UndefOr[DeliveryArea] = js.undefined
  
  /** Required. The delivery time associated with `deliveryArea` for this product. */
  var deliveryTime: js.UndefOr[ProductDeliveryTimeAreaDeliveryTimeDeliveryTime] = js.undefined
}
object ProductDeliveryTimeAreaDeliveryTime {
  
  inline def apply(): ProductDeliveryTimeAreaDeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductDeliveryTimeAreaDeliveryTime]
  }
  
  extension [Self <: ProductDeliveryTimeAreaDeliveryTime](x: Self) {
    
    inline def setDeliveryArea(value: DeliveryArea): Self = StObject.set(x, "deliveryArea", value.asInstanceOf[js.Any])
    
    inline def setDeliveryAreaUndefined: Self = StObject.set(x, "deliveryArea", js.undefined)
    
    inline def setDeliveryTime(value: ProductDeliveryTimeAreaDeliveryTimeDeliveryTime): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTimeUndefined: Self = StObject.set(x, "deliveryTime", js.undefined)
  }
}

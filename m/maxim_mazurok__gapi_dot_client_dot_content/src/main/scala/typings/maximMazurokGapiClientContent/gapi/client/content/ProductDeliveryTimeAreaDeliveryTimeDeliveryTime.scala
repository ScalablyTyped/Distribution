package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductDeliveryTimeAreaDeliveryTimeDeliveryTime extends StObject {
  
  /** Required. The maximum number of business days (inclusive) between when an order is placed and when the product ships. If a product ships in the same day, set this value to 0. */
  var maxHandlingTimeDays: js.UndefOr[Double] = js.undefined
  
  /** Required. The maximum number of business days (inclusive) between when the product ships and when the product is delivered. */
  var maxTransitTimeDays: js.UndefOr[Double] = js.undefined
  
  /** Required. The minimum number of business days (inclusive) between when an order is placed and when the product ships. If a product ships in the same day, set this value to 0. */
  var minHandlingTimeDays: js.UndefOr[Double] = js.undefined
  
  /** Required. The minimum number of business days (inclusive) between when the product ships and when the product is delivered. */
  var minTransitTimeDays: js.UndefOr[Double] = js.undefined
}
object ProductDeliveryTimeAreaDeliveryTimeDeliveryTime {
  
  inline def apply(): ProductDeliveryTimeAreaDeliveryTimeDeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductDeliveryTimeAreaDeliveryTimeDeliveryTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductDeliveryTimeAreaDeliveryTimeDeliveryTime] (val x: Self) extends AnyVal {
    
    inline def setMaxHandlingTimeDays(value: Double): Self = StObject.set(x, "maxHandlingTimeDays", value.asInstanceOf[js.Any])
    
    inline def setMaxHandlingTimeDaysUndefined: Self = StObject.set(x, "maxHandlingTimeDays", js.undefined)
    
    inline def setMaxTransitTimeDays(value: Double): Self = StObject.set(x, "maxTransitTimeDays", value.asInstanceOf[js.Any])
    
    inline def setMaxTransitTimeDaysUndefined: Self = StObject.set(x, "maxTransitTimeDays", js.undefined)
    
    inline def setMinHandlingTimeDays(value: Double): Self = StObject.set(x, "minHandlingTimeDays", value.asInstanceOf[js.Any])
    
    inline def setMinHandlingTimeDaysUndefined: Self = StObject.set(x, "minHandlingTimeDays", js.undefined)
    
    inline def setMinTransitTimeDays(value: Double): Self = StObject.set(x, "minTransitTimeDays", value.asInstanceOf[js.Any])
    
    inline def setMinTransitTimeDaysUndefined: Self = StObject.set(x, "minTransitTimeDays", js.undefined)
  }
}

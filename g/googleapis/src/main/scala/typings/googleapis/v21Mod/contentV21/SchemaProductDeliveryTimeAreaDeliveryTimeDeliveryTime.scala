package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductDeliveryTimeAreaDeliveryTimeDeliveryTime extends StObject {
  
  /**
    * Required. The maximum number of business days (inclusive) between when an order is placed and when the product ships. If a product ships in the same day, set this value to 0.
    */
  var maxHandlingTimeDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The maximum number of business days (inclusive) between when the product ships and when the product is delivered.
    */
  var maxTransitTimeDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The minimum number of business days (inclusive) between when an order is placed and when the product ships. If a product ships in the same day, set this value to 0.
    */
  var minHandlingTimeDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The minimum number of business days (inclusive) between when the product ships and when the product is delivered.
    */
  var minTransitTimeDays: js.UndefOr[Double | Null] = js.undefined
}
object SchemaProductDeliveryTimeAreaDeliveryTimeDeliveryTime {
  
  inline def apply(): SchemaProductDeliveryTimeAreaDeliveryTimeDeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductDeliveryTimeAreaDeliveryTimeDeliveryTime]
  }
  
  extension [Self <: SchemaProductDeliveryTimeAreaDeliveryTimeDeliveryTime](x: Self) {
    
    inline def setMaxHandlingTimeDays(value: Double): Self = StObject.set(x, "maxHandlingTimeDays", value.asInstanceOf[js.Any])
    
    inline def setMaxHandlingTimeDaysNull: Self = StObject.set(x, "maxHandlingTimeDays", null)
    
    inline def setMaxHandlingTimeDaysUndefined: Self = StObject.set(x, "maxHandlingTimeDays", js.undefined)
    
    inline def setMaxTransitTimeDays(value: Double): Self = StObject.set(x, "maxTransitTimeDays", value.asInstanceOf[js.Any])
    
    inline def setMaxTransitTimeDaysNull: Self = StObject.set(x, "maxTransitTimeDays", null)
    
    inline def setMaxTransitTimeDaysUndefined: Self = StObject.set(x, "maxTransitTimeDays", js.undefined)
    
    inline def setMinHandlingTimeDays(value: Double): Self = StObject.set(x, "minHandlingTimeDays", value.asInstanceOf[js.Any])
    
    inline def setMinHandlingTimeDaysNull: Self = StObject.set(x, "minHandlingTimeDays", null)
    
    inline def setMinHandlingTimeDaysUndefined: Self = StObject.set(x, "minHandlingTimeDays", js.undefined)
    
    inline def setMinTransitTimeDays(value: Double): Self = StObject.set(x, "minTransitTimeDays", value.asInstanceOf[js.Any])
    
    inline def setMinTransitTimeDaysNull: Self = StObject.set(x, "minTransitTimeDays", null)
    
    inline def setMinTransitTimeDaysUndefined: Self = StObject.set(x, "minTransitTimeDays", js.undefined)
  }
}

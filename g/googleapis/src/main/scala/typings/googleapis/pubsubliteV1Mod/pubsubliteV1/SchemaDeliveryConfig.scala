package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliveryConfig extends StObject {
  
  /**
    * The DeliveryRequirement for this subscription.
    */
  var deliveryRequirement: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeliveryConfig {
  
  inline def apply(): SchemaDeliveryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryConfig]
  }
  
  extension [Self <: SchemaDeliveryConfig](x: Self) {
    
    inline def setDeliveryRequirement(value: String): Self = StObject.set(x, "deliveryRequirement", value.asInstanceOf[js.Any])
    
    inline def setDeliveryRequirementNull: Self = StObject.set(x, "deliveryRequirement", null)
    
    inline def setDeliveryRequirementUndefined: Self = StObject.set(x, "deliveryRequirement", js.undefined)
  }
}

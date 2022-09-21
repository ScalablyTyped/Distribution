package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliveryControl extends StObject {
  
  var creativeBlockingLevel: js.UndefOr[String | Null] = js.undefined
  
  var deliveryRateType: js.UndefOr[String | Null] = js.undefined
  
  var frequencyCaps: js.UndefOr[js.Array[SchemaDeliveryControlFrequencyCap]] = js.undefined
}
object SchemaDeliveryControl {
  
  inline def apply(): SchemaDeliveryControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryControl]
  }
  
  extension [Self <: SchemaDeliveryControl](x: Self) {
    
    inline def setCreativeBlockingLevel(value: String): Self = StObject.set(x, "creativeBlockingLevel", value.asInstanceOf[js.Any])
    
    inline def setCreativeBlockingLevelNull: Self = StObject.set(x, "creativeBlockingLevel", null)
    
    inline def setCreativeBlockingLevelUndefined: Self = StObject.set(x, "creativeBlockingLevel", js.undefined)
    
    inline def setDeliveryRateType(value: String): Self = StObject.set(x, "deliveryRateType", value.asInstanceOf[js.Any])
    
    inline def setDeliveryRateTypeNull: Self = StObject.set(x, "deliveryRateType", null)
    
    inline def setDeliveryRateTypeUndefined: Self = StObject.set(x, "deliveryRateType", js.undefined)
    
    inline def setFrequencyCaps(value: js.Array[SchemaDeliveryControlFrequencyCap]): Self = StObject.set(x, "frequencyCaps", value.asInstanceOf[js.Any])
    
    inline def setFrequencyCapsUndefined: Self = StObject.set(x, "frequencyCaps", js.undefined)
    
    inline def setFrequencyCapsVarargs(value: SchemaDeliveryControlFrequencyCap*): Self = StObject.set(x, "frequencyCaps", js.Array(value*))
  }
}

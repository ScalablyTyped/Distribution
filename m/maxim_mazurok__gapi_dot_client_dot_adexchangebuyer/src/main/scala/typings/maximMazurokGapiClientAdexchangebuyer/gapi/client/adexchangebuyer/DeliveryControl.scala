package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryControl extends StObject {
  
  var creativeBlockingLevel: js.UndefOr[String] = js.undefined
  
  var deliveryRateType: js.UndefOr[String] = js.undefined
  
  var frequencyCaps: js.UndefOr[js.Array[DeliveryControlFrequencyCap]] = js.undefined
}
object DeliveryControl {
  
  inline def apply(): DeliveryControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryControl]
  }
  
  extension [Self <: DeliveryControl](x: Self) {
    
    inline def setCreativeBlockingLevel(value: String): Self = StObject.set(x, "creativeBlockingLevel", value.asInstanceOf[js.Any])
    
    inline def setCreativeBlockingLevelUndefined: Self = StObject.set(x, "creativeBlockingLevel", js.undefined)
    
    inline def setDeliveryRateType(value: String): Self = StObject.set(x, "deliveryRateType", value.asInstanceOf[js.Any])
    
    inline def setDeliveryRateTypeUndefined: Self = StObject.set(x, "deliveryRateType", js.undefined)
    
    inline def setFrequencyCaps(value: js.Array[DeliveryControlFrequencyCap]): Self = StObject.set(x, "frequencyCaps", value.asInstanceOf[js.Any])
    
    inline def setFrequencyCapsUndefined: Self = StObject.set(x, "frequencyCaps", js.undefined)
    
    inline def setFrequencyCapsVarargs(value: DeliveryControlFrequencyCap*): Self = StObject.set(x, "frequencyCaps", js.Array(value :_*))
  }
}

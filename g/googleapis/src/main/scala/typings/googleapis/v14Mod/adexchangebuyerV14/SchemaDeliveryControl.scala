package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliveryControl extends StObject {
  
  var creativeBlockingLevel: js.UndefOr[String] = js.undefined
  
  var deliveryRateType: js.UndefOr[String] = js.undefined
  
  var frequencyCaps: js.UndefOr[js.Array[SchemaDeliveryControlFrequencyCap]] = js.undefined
}
object SchemaDeliveryControl {
  
  @scala.inline
  def apply(): SchemaDeliveryControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryControl]
  }
  
  @scala.inline
  implicit class SchemaDeliveryControlMutableBuilder[Self <: SchemaDeliveryControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeBlockingLevel(value: String): Self = StObject.set(x, "creativeBlockingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeBlockingLevelUndefined: Self = StObject.set(x, "creativeBlockingLevel", js.undefined)
    
    @scala.inline
    def setDeliveryRateType(value: String): Self = StObject.set(x, "deliveryRateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryRateTypeUndefined: Self = StObject.set(x, "deliveryRateType", js.undefined)
    
    @scala.inline
    def setFrequencyCaps(value: js.Array[SchemaDeliveryControlFrequencyCap]): Self = StObject.set(x, "frequencyCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyCapsUndefined: Self = StObject.set(x, "frequencyCaps", js.undefined)
    
    @scala.inline
    def setFrequencyCapsVarargs(value: SchemaDeliveryControlFrequencyCap*): Self = StObject.set(x, "frequencyCaps", js.Array(value :_*))
  }
}

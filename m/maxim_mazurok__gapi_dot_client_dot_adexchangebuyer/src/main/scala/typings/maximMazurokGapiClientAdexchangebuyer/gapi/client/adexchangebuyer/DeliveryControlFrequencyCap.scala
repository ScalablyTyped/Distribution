package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryControlFrequencyCap extends StObject {
  
  var maxImpressions: js.UndefOr[Double] = js.undefined
  
  var numTimeUnits: js.UndefOr[Double] = js.undefined
  
  var timeUnitType: js.UndefOr[String] = js.undefined
}
object DeliveryControlFrequencyCap {
  
  @scala.inline
  def apply(): DeliveryControlFrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryControlFrequencyCap]
  }
  
  @scala.inline
  implicit class DeliveryControlFrequencyCapMutableBuilder[Self <: DeliveryControlFrequencyCap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxImpressions(value: Double): Self = StObject.set(x, "maxImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxImpressionsUndefined: Self = StObject.set(x, "maxImpressions", js.undefined)
    
    @scala.inline
    def setNumTimeUnits(value: Double): Self = StObject.set(x, "numTimeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTimeUnitsUndefined: Self = StObject.set(x, "numTimeUnits", js.undefined)
    
    @scala.inline
    def setTimeUnitType(value: String): Self = StObject.set(x, "timeUnitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnitTypeUndefined: Self = StObject.set(x, "timeUnitType", js.undefined)
  }
}

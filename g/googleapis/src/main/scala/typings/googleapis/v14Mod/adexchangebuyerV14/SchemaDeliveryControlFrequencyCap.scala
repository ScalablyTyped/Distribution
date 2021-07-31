package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliveryControlFrequencyCap extends StObject {
  
  var maxImpressions: js.UndefOr[Double] = js.undefined
  
  var numTimeUnits: js.UndefOr[Double] = js.undefined
  
  var timeUnitType: js.UndefOr[String] = js.undefined
}
object SchemaDeliveryControlFrequencyCap {
  
  @scala.inline
  def apply(): SchemaDeliveryControlFrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryControlFrequencyCap]
  }
  
  @scala.inline
  implicit class SchemaDeliveryControlFrequencyCapMutableBuilder[Self <: SchemaDeliveryControlFrequencyCap] (val x: Self) extends AnyVal {
    
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

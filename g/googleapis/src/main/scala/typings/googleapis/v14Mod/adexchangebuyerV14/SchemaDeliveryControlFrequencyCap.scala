package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliveryControlFrequencyCap extends StObject {
  
  var maxImpressions: js.UndefOr[Double | Null] = js.undefined
  
  var numTimeUnits: js.UndefOr[Double | Null] = js.undefined
  
  var timeUnitType: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeliveryControlFrequencyCap {
  
  inline def apply(): SchemaDeliveryControlFrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryControlFrequencyCap]
  }
  
  extension [Self <: SchemaDeliveryControlFrequencyCap](x: Self) {
    
    inline def setMaxImpressions(value: Double): Self = StObject.set(x, "maxImpressions", value.asInstanceOf[js.Any])
    
    inline def setMaxImpressionsNull: Self = StObject.set(x, "maxImpressions", null)
    
    inline def setMaxImpressionsUndefined: Self = StObject.set(x, "maxImpressions", js.undefined)
    
    inline def setNumTimeUnits(value: Double): Self = StObject.set(x, "numTimeUnits", value.asInstanceOf[js.Any])
    
    inline def setNumTimeUnitsNull: Self = StObject.set(x, "numTimeUnits", null)
    
    inline def setNumTimeUnitsUndefined: Self = StObject.set(x, "numTimeUnits", js.undefined)
    
    inline def setTimeUnitType(value: String): Self = StObject.set(x, "timeUnitType", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitTypeNull: Self = StObject.set(x, "timeUnitType", null)
    
    inline def setTimeUnitTypeUndefined: Self = StObject.set(x, "timeUnitType", js.undefined)
  }
}

package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFlight extends StObject {
  
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rate or cost of this flight.
    */
  var rateOrCost: js.UndefOr[String | Null] = js.undefined
  
  var startDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Units of this flight.
    */
  var units: js.UndefOr[String | Null] = js.undefined
}
object SchemaFlight {
  
  inline def apply(): SchemaFlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlight]
  }
  
  extension [Self <: SchemaFlight](x: Self) {
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setRateOrCost(value: String): Self = StObject.set(x, "rateOrCost", value.asInstanceOf[js.Any])
    
    inline def setRateOrCostNull: Self = StObject.set(x, "rateOrCost", null)
    
    inline def setRateOrCostUndefined: Self = StObject.set(x, "rateOrCost", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsNull: Self = StObject.set(x, "units", null)
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}

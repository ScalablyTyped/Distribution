package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Flight
  */
trait SchemaFlight extends StObject {
  
  /**
    * Inventory item flight end date.
    */
  var endDate: js.UndefOr[String] = js.undefined
  
  /**
    * Rate or cost of this flight.
    */
  var rateOrCost: js.UndefOr[String] = js.undefined
  
  /**
    * Inventory item flight start date.
    */
  var startDate: js.UndefOr[String] = js.undefined
  
  /**
    * Units of this flight.
    */
  var units: js.UndefOr[String] = js.undefined
}
object SchemaFlight {
  
  inline def apply(): SchemaFlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlight]
  }
  
  extension [Self <: SchemaFlight](x: Self) {
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setRateOrCost(value: String): Self = StObject.set(x, "rateOrCost", value.asInstanceOf[js.Any])
    
    inline def setRateOrCostUndefined: Self = StObject.set(x, "rateOrCost", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}

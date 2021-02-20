package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Flight
  */
@js.native
trait SchemaFlight extends StObject {
  
  /**
    * Inventory item flight end date.
    */
  var endDate: js.UndefOr[String] = js.native
  
  /**
    * Rate or cost of this flight.
    */
  var rateOrCost: js.UndefOr[String] = js.native
  
  /**
    * Inventory item flight start date.
    */
  var startDate: js.UndefOr[String] = js.native
  
  /**
    * Units of this flight.
    */
  var units: js.UndefOr[String] = js.native
}
object SchemaFlight {
  
  @scala.inline
  def apply(): SchemaFlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlight]
  }
  
  @scala.inline
  implicit class SchemaFlightMutableBuilder[Self <: SchemaFlight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setRateOrCost(value: String): Self = StObject.set(x, "rateOrCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateOrCostUndefined: Self = StObject.set(x, "rateOrCost", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}

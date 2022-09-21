package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPricing extends StObject {
  
  /**
    * Cap cost type of this inventory item.
    */
  var capCostType: js.UndefOr[String | Null] = js.undefined
  
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Flights of this inventory item. A flight (a.k.a. pricing period) represents the inventory item pricing information for a specific period of time.
    */
  var flights: js.UndefOr[js.Array[SchemaFlight]] = js.undefined
  
  /**
    * Group type of this inventory item if it represents a placement group. Is null otherwise. There are two type of placement groups: PLANNING_PLACEMENT_GROUP_TYPE_PACKAGE is a simple group of inventory items that acts as a single pricing point for a group of tags. PLANNING_PLACEMENT_GROUP_TYPE_ROADBLOCK is a group of inventory items that not only acts as a single pricing point, but also assumes that all the tags in it will be served at the same time. A roadblock requires one of its assigned inventory items to be marked as primary.
    */
  var groupType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pricing type of this inventory item.
    */
  var pricingType: js.UndefOr[String | Null] = js.undefined
  
  var startDate: js.UndefOr[String | Null] = js.undefined
}
object SchemaPricing {
  
  inline def apply(): SchemaPricing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricing]
  }
  
  extension [Self <: SchemaPricing](x: Self) {
    
    inline def setCapCostType(value: String): Self = StObject.set(x, "capCostType", value.asInstanceOf[js.Any])
    
    inline def setCapCostTypeNull: Self = StObject.set(x, "capCostType", null)
    
    inline def setCapCostTypeUndefined: Self = StObject.set(x, "capCostType", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setFlights(value: js.Array[SchemaFlight]): Self = StObject.set(x, "flights", value.asInstanceOf[js.Any])
    
    inline def setFlightsUndefined: Self = StObject.set(x, "flights", js.undefined)
    
    inline def setFlightsVarargs(value: SchemaFlight*): Self = StObject.set(x, "flights", js.Array(value*))
    
    inline def setGroupType(value: String): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
    
    inline def setGroupTypeNull: Self = StObject.set(x, "groupType", null)
    
    inline def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
    
    inline def setPricingType(value: String): Self = StObject.set(x, "pricingType", value.asInstanceOf[js.Any])
    
    inline def setPricingTypeNull: Self = StObject.set(x, "pricingType", null)
    
    inline def setPricingTypeUndefined: Self = StObject.set(x, "pricingType", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}

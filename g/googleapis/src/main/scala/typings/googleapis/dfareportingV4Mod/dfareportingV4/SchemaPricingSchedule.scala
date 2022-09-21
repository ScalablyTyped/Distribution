package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPricingSchedule extends StObject {
  
  /**
    * Placement cap cost option.
    */
  var capCostOption: js.UndefOr[String | Null] = js.undefined
  
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this placement is flighted. If true, pricing periods will be computed automatically.
    */
  var flighted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Floodlight activity ID associated with this placement. This field should be set when placement pricing type is set to PRICING_TYPE_CPA.
    */
  var floodlightActivityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pricing periods for this placement.
    */
  var pricingPeriods: js.UndefOr[js.Array[SchemaPricingSchedulePricingPeriod]] = js.undefined
  
  /**
    * Placement pricing type. This field is required on insertion.
    */
  var pricingType: js.UndefOr[String | Null] = js.undefined
  
  var startDate: js.UndefOr[String | Null] = js.undefined
  
  var testingStartDate: js.UndefOr[String | Null] = js.undefined
}
object SchemaPricingSchedule {
  
  inline def apply(): SchemaPricingSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricingSchedule]
  }
  
  extension [Self <: SchemaPricingSchedule](x: Self) {
    
    inline def setCapCostOption(value: String): Self = StObject.set(x, "capCostOption", value.asInstanceOf[js.Any])
    
    inline def setCapCostOptionNull: Self = StObject.set(x, "capCostOption", null)
    
    inline def setCapCostOptionUndefined: Self = StObject.set(x, "capCostOption", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setFlighted(value: Boolean): Self = StObject.set(x, "flighted", value.asInstanceOf[js.Any])
    
    inline def setFlightedNull: Self = StObject.set(x, "flighted", null)
    
    inline def setFlightedUndefined: Self = StObject.set(x, "flighted", js.undefined)
    
    inline def setFloodlightActivityId(value: String): Self = StObject.set(x, "floodlightActivityId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityIdNull: Self = StObject.set(x, "floodlightActivityId", null)
    
    inline def setFloodlightActivityIdUndefined: Self = StObject.set(x, "floodlightActivityId", js.undefined)
    
    inline def setPricingPeriods(value: js.Array[SchemaPricingSchedulePricingPeriod]): Self = StObject.set(x, "pricingPeriods", value.asInstanceOf[js.Any])
    
    inline def setPricingPeriodsUndefined: Self = StObject.set(x, "pricingPeriods", js.undefined)
    
    inline def setPricingPeriodsVarargs(value: SchemaPricingSchedulePricingPeriod*): Self = StObject.set(x, "pricingPeriods", js.Array(value*))
    
    inline def setPricingType(value: String): Self = StObject.set(x, "pricingType", value.asInstanceOf[js.Any])
    
    inline def setPricingTypeNull: Self = StObject.set(x, "pricingType", null)
    
    inline def setPricingTypeUndefined: Self = StObject.set(x, "pricingType", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setTestingStartDate(value: String): Self = StObject.set(x, "testingStartDate", value.asInstanceOf[js.Any])
    
    inline def setTestingStartDateNull: Self = StObject.set(x, "testingStartDate", null)
    
    inline def setTestingStartDateUndefined: Self = StObject.set(x, "testingStartDate", js.undefined)
  }
}

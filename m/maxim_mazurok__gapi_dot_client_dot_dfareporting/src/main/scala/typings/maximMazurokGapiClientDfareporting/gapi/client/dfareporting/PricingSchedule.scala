package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PricingSchedule extends StObject {
  
  /** Placement cap cost option. */
  var capCostOption: js.UndefOr[String] = js.undefined
  
  var endDate: js.UndefOr[String] = js.undefined
  
  /** Whether this placement is flighted. If true, pricing periods will be computed automatically. */
  var flighted: js.UndefOr[Boolean] = js.undefined
  
  /** Floodlight activity ID associated with this placement. This field should be set when placement pricing type is set to PRICING_TYPE_CPA. */
  var floodlightActivityId: js.UndefOr[String] = js.undefined
  
  /** Pricing periods for this placement. */
  var pricingPeriods: js.UndefOr[js.Array[PricingSchedulePricingPeriod]] = js.undefined
  
  /** Placement pricing type. This field is required on insertion. */
  var pricingType: js.UndefOr[String] = js.undefined
  
  var startDate: js.UndefOr[String] = js.undefined
  
  var testingStartDate: js.UndefOr[String] = js.undefined
}
object PricingSchedule {
  
  inline def apply(): PricingSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PricingSchedule] (val x: Self) extends AnyVal {
    
    inline def setCapCostOption(value: String): Self = StObject.set(x, "capCostOption", value.asInstanceOf[js.Any])
    
    inline def setCapCostOptionUndefined: Self = StObject.set(x, "capCostOption", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setFlighted(value: Boolean): Self = StObject.set(x, "flighted", value.asInstanceOf[js.Any])
    
    inline def setFlightedUndefined: Self = StObject.set(x, "flighted", js.undefined)
    
    inline def setFloodlightActivityId(value: String): Self = StObject.set(x, "floodlightActivityId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityIdUndefined: Self = StObject.set(x, "floodlightActivityId", js.undefined)
    
    inline def setPricingPeriods(value: js.Array[PricingSchedulePricingPeriod]): Self = StObject.set(x, "pricingPeriods", value.asInstanceOf[js.Any])
    
    inline def setPricingPeriodsUndefined: Self = StObject.set(x, "pricingPeriods", js.undefined)
    
    inline def setPricingPeriodsVarargs(value: PricingSchedulePricingPeriod*): Self = StObject.set(x, "pricingPeriods", js.Array(value*))
    
    inline def setPricingType(value: String): Self = StObject.set(x, "pricingType", value.asInstanceOf[js.Any])
    
    inline def setPricingTypeUndefined: Self = StObject.set(x, "pricingType", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setTestingStartDate(value: String): Self = StObject.set(x, "testingStartDate", value.asInstanceOf[js.Any])
    
    inline def setTestingStartDateUndefined: Self = StObject.set(x, "testingStartDate", js.undefined)
  }
}

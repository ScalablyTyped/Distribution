package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPricingSchedulePricingPeriod extends StObject {
  
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Comments for this pricing period.
    */
  var pricingComment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rate or cost of this pricing period in nanos (i.e., multipled by 1000000000). Acceptable values are 0 to 1000000000000000000, inclusive.
    */
  var rateOrCostNanos: js.UndefOr[String | Null] = js.undefined
  
  var startDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Units of this pricing period. Acceptable values are 0 to 10000000000, inclusive.
    */
  var units: js.UndefOr[String | Null] = js.undefined
}
object SchemaPricingSchedulePricingPeriod {
  
  inline def apply(): SchemaPricingSchedulePricingPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricingSchedulePricingPeriod]
  }
  
  extension [Self <: SchemaPricingSchedulePricingPeriod](x: Self) {
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setPricingComment(value: String): Self = StObject.set(x, "pricingComment", value.asInstanceOf[js.Any])
    
    inline def setPricingCommentNull: Self = StObject.set(x, "pricingComment", null)
    
    inline def setPricingCommentUndefined: Self = StObject.set(x, "pricingComment", js.undefined)
    
    inline def setRateOrCostNanos(value: String): Self = StObject.set(x, "rateOrCostNanos", value.asInstanceOf[js.Any])
    
    inline def setRateOrCostNanosNull: Self = StObject.set(x, "rateOrCostNanos", null)
    
    inline def setRateOrCostNanosUndefined: Self = StObject.set(x, "rateOrCostNanos", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsNull: Self = StObject.set(x, "units", null)
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}

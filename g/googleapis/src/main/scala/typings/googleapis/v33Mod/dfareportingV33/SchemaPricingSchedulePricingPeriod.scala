package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pricing Period
  */
trait SchemaPricingSchedulePricingPeriod extends StObject {
  
  /**
    * Pricing period end date. This date must be later than, or the same day
    * as, the pricing period start date, but not later than the placement end
    * date. The period end date can be the same date as the period start date.
    * If, for example, you set 6/25/2015 as both the start and end dates, the
    * effective pricing period date is just that day only, 6/25/2015. The
    * hours, minutes, and seconds of the end date should not be set, as doing
    * so will result in an error.
    */
  var endDate: js.UndefOr[String] = js.undefined
  
  /**
    * Comments for this pricing period.
    */
  var pricingComment: js.UndefOr[String] = js.undefined
  
  /**
    * Rate or cost of this pricing period in nanos (i.e., multipled by
    * 1000000000). Acceptable values are 0 to 1000000000000000000, inclusive.
    */
  var rateOrCostNanos: js.UndefOr[String] = js.undefined
  
  /**
    * Pricing period start date. This date must be later than, or the same day
    * as, the placement start date. The hours, minutes, and seconds of the
    * start date should not be set, as doing so will result in an error.
    */
  var startDate: js.UndefOr[String] = js.undefined
  
  /**
    * Units of this pricing period. Acceptable values are 0 to 10000000000,
    * inclusive.
    */
  var units: js.UndefOr[String] = js.undefined
}
object SchemaPricingSchedulePricingPeriod {
  
  @scala.inline
  def apply(): SchemaPricingSchedulePricingPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricingSchedulePricingPeriod]
  }
  
  @scala.inline
  implicit class SchemaPricingSchedulePricingPeriodMutableBuilder[Self <: SchemaPricingSchedulePricingPeriod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setPricingComment(value: String): Self = StObject.set(x, "pricingComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingCommentUndefined: Self = StObject.set(x, "pricingComment", js.undefined)
    
    @scala.inline
    def setRateOrCostNanos(value: String): Self = StObject.set(x, "rateOrCostNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateOrCostNanosUndefined: Self = StObject.set(x, "rateOrCostNanos", js.undefined)
    
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

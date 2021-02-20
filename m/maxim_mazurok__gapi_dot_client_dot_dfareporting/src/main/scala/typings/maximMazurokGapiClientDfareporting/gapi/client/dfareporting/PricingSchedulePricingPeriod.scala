package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PricingSchedulePricingPeriod extends StObject {
  
  var endDate: js.UndefOr[String] = js.native
  
  /** Comments for this pricing period. */
  var pricingComment: js.UndefOr[String] = js.native
  
  /** Rate or cost of this pricing period in nanos (i.e., multipled by 1000000000). Acceptable values are 0 to 1000000000000000000, inclusive. */
  var rateOrCostNanos: js.UndefOr[String] = js.native
  
  var startDate: js.UndefOr[String] = js.native
  
  /** Units of this pricing period. Acceptable values are 0 to 10000000000, inclusive. */
  var units: js.UndefOr[String] = js.native
}
object PricingSchedulePricingPeriod {
  
  @scala.inline
  def apply(): PricingSchedulePricingPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingSchedulePricingPeriod]
  }
  
  @scala.inline
  implicit class PricingSchedulePricingPeriodMutableBuilder[Self <: PricingSchedulePricingPeriod] (val x: Self) extends AnyVal {
    
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

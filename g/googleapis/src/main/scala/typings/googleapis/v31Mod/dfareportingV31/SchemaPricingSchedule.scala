package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pricing Schedule
  */
@js.native
trait SchemaPricingSchedule extends StObject {
  
  /**
    * Placement cap cost option.
    */
  var capCostOption: js.UndefOr[String] = js.native
  
  /**
    * Whether cap costs are ignored by ad serving.
    */
  var disregardOverdelivery: js.UndefOr[Boolean] = js.native
  
  /**
    * Placement end date. This date must be later than, or the same day as, the
    * placement start date, but not later than the campaign end date. If, for
    * example, you set 6/25/2015 as both the start and end dates, the effective
    * placement date is just that day only, 6/25/2015. The hours, minutes, and
    * seconds of the end date should not be set, as doing so will result in an
    * error. This field is required on insertion.
    */
  var endDate: js.UndefOr[String] = js.native
  
  /**
    * Whether this placement is flighted. If true, pricing periods will be
    * computed automatically.
    */
  var flighted: js.UndefOr[Boolean] = js.native
  
  /**
    * Floodlight activity ID associated with this placement. This field should
    * be set when placement pricing type is set to PRICING_TYPE_CPA.
    */
  var floodlightActivityId: js.UndefOr[String] = js.native
  
  /**
    * Pricing periods for this placement.
    */
  var pricingPeriods: js.UndefOr[js.Array[SchemaPricingSchedulePricingPeriod]] = js.native
  
  /**
    * Placement pricing type. This field is required on insertion.
    */
  var pricingType: js.UndefOr[String] = js.native
  
  /**
    * Placement start date. This date must be later than, or the same day as,
    * the campaign start date. The hours, minutes, and seconds of the start
    * date should not be set, as doing so will result in an error. This field
    * is required on insertion.
    */
  var startDate: js.UndefOr[String] = js.native
  
  /**
    * Testing start date of this placement. The hours, minutes, and seconds of
    * the start date should not be set, as doing so will result in an error.
    */
  var testingStartDate: js.UndefOr[String] = js.native
}
object SchemaPricingSchedule {
  
  @scala.inline
  def apply(): SchemaPricingSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricingSchedule]
  }
  
  @scala.inline
  implicit class SchemaPricingScheduleMutableBuilder[Self <: SchemaPricingSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapCostOption(value: String): Self = StObject.set(x, "capCostOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapCostOptionUndefined: Self = StObject.set(x, "capCostOption", js.undefined)
    
    @scala.inline
    def setDisregardOverdelivery(value: Boolean): Self = StObject.set(x, "disregardOverdelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisregardOverdeliveryUndefined: Self = StObject.set(x, "disregardOverdelivery", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setFlighted(value: Boolean): Self = StObject.set(x, "flighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlightedUndefined: Self = StObject.set(x, "flighted", js.undefined)
    
    @scala.inline
    def setFloodlightActivityId(value: String): Self = StObject.set(x, "floodlightActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityIdUndefined: Self = StObject.set(x, "floodlightActivityId", js.undefined)
    
    @scala.inline
    def setPricingPeriods(value: js.Array[SchemaPricingSchedulePricingPeriod]): Self = StObject.set(x, "pricingPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingPeriodsUndefined: Self = StObject.set(x, "pricingPeriods", js.undefined)
    
    @scala.inline
    def setPricingPeriodsVarargs(value: SchemaPricingSchedulePricingPeriod*): Self = StObject.set(x, "pricingPeriods", js.Array(value :_*))
    
    @scala.inline
    def setPricingType(value: String): Self = StObject.set(x, "pricingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingTypeUndefined: Self = StObject.set(x, "pricingType", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setTestingStartDate(value: String): Self = StObject.set(x, "testingStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestingStartDateUndefined: Self = StObject.set(x, "testingStartDate", js.undefined)
  }
}

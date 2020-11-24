package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PricingSchedule extends js.Object {
  
  /** Placement cap cost option. */
  var capCostOption: js.UndefOr[String] = js.native
  
  var endDate: js.UndefOr[String] = js.native
  
  /** Whether this placement is flighted. If true, pricing periods will be computed automatically. */
  var flighted: js.UndefOr[Boolean] = js.native
  
  /** Floodlight activity ID associated with this placement. This field should be set when placement pricing type is set to PRICING_TYPE_CPA. */
  var floodlightActivityId: js.UndefOr[String] = js.native
  
  /** Pricing periods for this placement. */
  var pricingPeriods: js.UndefOr[js.Array[PricingSchedulePricingPeriod]] = js.native
  
  /** Placement pricing type. This field is required on insertion. */
  var pricingType: js.UndefOr[String] = js.native
  
  var startDate: js.UndefOr[String] = js.native
  
  var testingStartDate: js.UndefOr[String] = js.native
}
object PricingSchedule {
  
  @scala.inline
  def apply(): PricingSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingSchedule]
  }
  
  @scala.inline
  implicit class PricingScheduleOps[Self <: PricingSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapCostOption(value: String): Self = this.set("capCostOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapCostOption: Self = this.set("capCostOption", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setFlighted(value: Boolean): Self = this.set("flighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlighted: Self = this.set("flighted", js.undefined)
    
    @scala.inline
    def setFloodlightActivityId(value: String): Self = this.set("floodlightActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityId: Self = this.set("floodlightActivityId", js.undefined)
    
    @scala.inline
    def setPricingPeriodsVarargs(value: PricingSchedulePricingPeriod*): Self = this.set("pricingPeriods", js.Array(value :_*))
    
    @scala.inline
    def setPricingPeriods(value: js.Array[PricingSchedulePricingPeriod]): Self = this.set("pricingPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricingPeriods: Self = this.set("pricingPeriods", js.undefined)
    
    @scala.inline
    def setPricingType(value: String): Self = this.set("pricingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricingType: Self = this.set("pricingType", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setTestingStartDate(value: String): Self = this.set("testingStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestingStartDate: Self = this.set("testingStartDate", js.undefined)
  }
}

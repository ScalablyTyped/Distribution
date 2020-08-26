package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pricing Schedule
  */
@js.native
trait SchemaPricingSchedule extends js.Object {
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
  implicit class SchemaPricingScheduleOps[Self <: SchemaPricingSchedule] (val x: Self) extends AnyVal {
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
    def setDisregardOverdelivery(value: Boolean): Self = this.set("disregardOverdelivery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisregardOverdelivery: Self = this.set("disregardOverdelivery", js.undefined)
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
    def setPricingPeriodsVarargs(value: SchemaPricingSchedulePricingPeriod*): Self = this.set("pricingPeriods", js.Array(value :_*))
    @scala.inline
    def setPricingPeriods(value: js.Array[SchemaPricingSchedulePricingPeriod]): Self = this.set("pricingPeriods", value.asInstanceOf[js.Any])
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


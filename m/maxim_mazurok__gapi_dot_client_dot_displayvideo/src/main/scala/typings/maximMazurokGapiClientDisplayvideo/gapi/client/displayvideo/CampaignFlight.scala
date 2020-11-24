package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignFlight extends js.Object {
  
  /**
    * Required. The dates that the campaign is expected to run. They are resolved relative to the parent advertiser's time zone. * The dates specified here will not affect serving. They
    * are used to generate alerts and warnings. For example, if the flight date of any child insertion order is outside the range of these dates, the user interface will show a warning. *
    * `start_date` is required and must be the current date or later. * `end_date` is optional. If specified, it must be the `start_date` or later. * Any specified date must be before the
    * year 2037.
    */
  var plannedDates: js.UndefOr[DateRange] = js.native
  
  /**
    * The amount the campaign is expected to spend for its given planned_dates. This will not limit serving, but will be used for tracking spend in the DV360 UI. The amount is in micros.
    * Must be greater than or equal to 0. For example, 500000000 represents 500 standard units of the currency.
    */
  var plannedSpendAmountMicros: js.UndefOr[String] = js.native
}
object CampaignFlight {
  
  @scala.inline
  def apply(): CampaignFlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignFlight]
  }
  
  @scala.inline
  implicit class CampaignFlightOps[Self <: CampaignFlight] (val x: Self) extends AnyVal {
    
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
    def setPlannedDates(value: DateRange): Self = this.set("plannedDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlannedDates: Self = this.set("plannedDates", js.undefined)
    
    @scala.inline
    def setPlannedSpendAmountMicros(value: String): Self = this.set("plannedSpendAmountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlannedSpendAmountMicros: Self = this.set("plannedSpendAmountMicros", js.undefined)
  }
}

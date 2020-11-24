package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HolidaysHoliday extends js.Object {
  
  /**
    * The CLDR territory code of the country in which the holiday is available. E.g. "US", "DE", "GB". A holiday cutoff can only be configured in a shipping settings service with matching
    * delivery country. Always present.
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /** Date of the holiday, in ISO 8601 format. E.g. "2016-12-25" for Christmas 2016. Always present. */
  var date: js.UndefOr[String] = js.native
  
  /** Date on which the order has to arrive at the customer's, in ISO 8601 format. E.g. "2016-12-24" for 24th December 2016. Always present. */
  var deliveryGuaranteeDate: js.UndefOr[String] = js.native
  
  /**
    * Hour of the day in the delivery location's timezone on the guaranteed delivery date by which the order has to arrive at the customer's. Possible values are: 0 (midnight), 1, ..., 12
    * (noon), 13, ..., 23. Always present.
    */
  var deliveryGuaranteeHour: js.UndefOr[String] = js.native
  
  /** Unique identifier for the holiday to be used when configuring holiday cutoffs. Always present. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The holiday type. Always present. Acceptable values are: - "`Christmas`" - "`Easter`" - "`Father's Day`" - "`Halloween`" - "`Independence Day (USA)`" - "`Mother's Day`" -
    * "`Thanksgiving`" - "`Valentine's Day`"
    */
  var `type`: js.UndefOr[String] = js.native
}
object HolidaysHoliday {
  
  @scala.inline
  def apply(): HolidaysHoliday = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HolidaysHoliday]
  }
  
  @scala.inline
  implicit class HolidaysHolidayOps[Self <: HolidaysHoliday] (val x: Self) extends AnyVal {
    
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
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDeliveryGuaranteeDate(value: String): Self = this.set("deliveryGuaranteeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryGuaranteeDate: Self = this.set("deliveryGuaranteeDate", js.undefined)
    
    @scala.inline
    def setDeliveryGuaranteeHour(value: String): Self = this.set("deliveryGuaranteeHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryGuaranteeHour: Self = this.set("deliveryGuaranteeHour", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

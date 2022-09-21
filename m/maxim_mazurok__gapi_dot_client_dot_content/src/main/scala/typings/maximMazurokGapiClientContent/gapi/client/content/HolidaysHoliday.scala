package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HolidaysHoliday extends StObject {
  
  /**
    * The CLDR territory code of the country in which the holiday is available. For example, "US", "DE", "GB". A holiday cutoff can only be configured in a shipping settings service with
    * matching delivery country. Always present.
    */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /** Date of the holiday, in ISO 8601 format. For example, "2016-12-25" for Christmas 2016. Always present. */
  var date: js.UndefOr[String] = js.undefined
  
  /** Date on which the order has to arrive at the customer's, in ISO 8601 format. For example, "2016-12-24" for 24th December 2016. Always present. */
  var deliveryGuaranteeDate: js.UndefOr[String] = js.undefined
  
  /**
    * Hour of the day in the delivery location's timezone on the guaranteed delivery date by which the order has to arrive at the customer's. Possible values are: 0 (midnight), 1, ..., 12
    * (noon), 13, ..., 23. Always present.
    */
  var deliveryGuaranteeHour: js.UndefOr[String] = js.undefined
  
  /** Unique identifier for the holiday to be used when configuring holiday cutoffs. Always present. */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The holiday type. Always present. Acceptable values are: - "`Christmas`" - "`Easter`" - "`Father's Day`" - "`Halloween`" - "`Independence Day (USA)`" - "`Mother's Day`" -
    * "`Thanksgiving`" - "`Valentine's Day`"
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object HolidaysHoliday {
  
  inline def apply(): HolidaysHoliday = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HolidaysHoliday]
  }
  
  extension [Self <: HolidaysHoliday](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDeliveryGuaranteeDate(value: String): Self = StObject.set(x, "deliveryGuaranteeDate", value.asInstanceOf[js.Any])
    
    inline def setDeliveryGuaranteeDateUndefined: Self = StObject.set(x, "deliveryGuaranteeDate", js.undefined)
    
    inline def setDeliveryGuaranteeHour(value: String): Self = StObject.set(x, "deliveryGuaranteeHour", value.asInstanceOf[js.Any])
    
    inline def setDeliveryGuaranteeHourUndefined: Self = StObject.set(x, "deliveryGuaranteeHour", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

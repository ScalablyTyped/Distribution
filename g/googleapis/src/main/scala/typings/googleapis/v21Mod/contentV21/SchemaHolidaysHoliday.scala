package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHolidaysHoliday extends StObject {
  
  /**
    * The CLDR territory code of the country in which the holiday is available. For example, "US", "DE", "GB". A holiday cutoff can only be configured in a shipping settings service with matching delivery country. Always present.
    */
  var countryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date of the holiday, in ISO 8601 format. For example, "2016-12-25" for Christmas 2016. Always present.
    */
  var date: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date on which the order has to arrive at the customer's, in ISO 8601 format. For example, "2016-12-24" for 24th December 2016. Always present.
    */
  var deliveryGuaranteeDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Hour of the day in the delivery location's timezone on the guaranteed delivery date by which the order has to arrive at the customer's. Possible values are: 0 (midnight), 1, ..., 12 (noon), 13, ..., 23. Always present.
    */
  var deliveryGuaranteeHour: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier for the holiday to be used when configuring holiday cutoffs. Always present.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The holiday type. Always present. Acceptable values are: - "`Christmas`" - "`Easter`" - "`Father's Day`" - "`Halloween`" - "`Independence Day (USA)`" - "`Mother's Day`" - "`Thanksgiving`" - "`Valentine's Day`"
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaHolidaysHoliday {
  
  inline def apply(): SchemaHolidaysHoliday = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHolidaysHoliday]
  }
  
  extension [Self <: SchemaHolidaysHoliday](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateNull: Self = StObject.set(x, "date", null)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDeliveryGuaranteeDate(value: String): Self = StObject.set(x, "deliveryGuaranteeDate", value.asInstanceOf[js.Any])
    
    inline def setDeliveryGuaranteeDateNull: Self = StObject.set(x, "deliveryGuaranteeDate", null)
    
    inline def setDeliveryGuaranteeDateUndefined: Self = StObject.set(x, "deliveryGuaranteeDate", js.undefined)
    
    inline def setDeliveryGuaranteeHour(value: String): Self = StObject.set(x, "deliveryGuaranteeHour", value.asInstanceOf[js.Any])
    
    inline def setDeliveryGuaranteeHourNull: Self = StObject.set(x, "deliveryGuaranteeHour", null)
    
    inline def setDeliveryGuaranteeHourUndefined: Self = StObject.set(x, "deliveryGuaranteeHour", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

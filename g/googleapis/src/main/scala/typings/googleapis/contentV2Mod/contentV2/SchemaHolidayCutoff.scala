package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHolidayCutoff extends StObject {
  
  /**
    * Date of the order deadline, in ISO 8601 format. E.g. "2016-11-29" for 29th November 2016. Required.
    */
  var deadlineDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Hour of the day on the deadline date until which the order has to be placed to qualify for the delivery guarantee. Possible values are: 0 (midnight), 1, ..., 12 (noon), 13, ..., 23. Required.
    */
  var deadlineHour: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Timezone identifier for the deadline hour. A list of identifiers can be found in the AdWords API documentation. E.g. "Europe/Zurich". Required.
    */
  var deadlineTimezone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier for the holiday. Required.
    */
  var holidayId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date on which the deadline will become visible to consumers in ISO 8601 format. E.g. "2016-10-31" for 31st October 2016. Required.
    */
  var visibleFromDate: js.UndefOr[String | Null] = js.undefined
}
object SchemaHolidayCutoff {
  
  inline def apply(): SchemaHolidayCutoff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHolidayCutoff]
  }
  
  extension [Self <: SchemaHolidayCutoff](x: Self) {
    
    inline def setDeadlineDate(value: String): Self = StObject.set(x, "deadlineDate", value.asInstanceOf[js.Any])
    
    inline def setDeadlineDateNull: Self = StObject.set(x, "deadlineDate", null)
    
    inline def setDeadlineDateUndefined: Self = StObject.set(x, "deadlineDate", js.undefined)
    
    inline def setDeadlineHour(value: Double): Self = StObject.set(x, "deadlineHour", value.asInstanceOf[js.Any])
    
    inline def setDeadlineHourNull: Self = StObject.set(x, "deadlineHour", null)
    
    inline def setDeadlineHourUndefined: Self = StObject.set(x, "deadlineHour", js.undefined)
    
    inline def setDeadlineTimezone(value: String): Self = StObject.set(x, "deadlineTimezone", value.asInstanceOf[js.Any])
    
    inline def setDeadlineTimezoneNull: Self = StObject.set(x, "deadlineTimezone", null)
    
    inline def setDeadlineTimezoneUndefined: Self = StObject.set(x, "deadlineTimezone", js.undefined)
    
    inline def setHolidayId(value: String): Self = StObject.set(x, "holidayId", value.asInstanceOf[js.Any])
    
    inline def setHolidayIdNull: Self = StObject.set(x, "holidayId", null)
    
    inline def setHolidayIdUndefined: Self = StObject.set(x, "holidayId", js.undefined)
    
    inline def setVisibleFromDate(value: String): Self = StObject.set(x, "visibleFromDate", value.asInstanceOf[js.Any])
    
    inline def setVisibleFromDateNull: Self = StObject.set(x, "visibleFromDate", null)
    
    inline def setVisibleFromDateUndefined: Self = StObject.set(x, "visibleFromDate", js.undefined)
  }
}

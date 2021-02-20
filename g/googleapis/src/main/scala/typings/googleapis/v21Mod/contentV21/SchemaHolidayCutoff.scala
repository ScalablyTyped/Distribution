package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaHolidayCutoff extends StObject {
  
  /**
    * Date of the order deadline, in ISO 8601 format. E.g.
    * &quot;2016-11-29&quot; for 29th November 2016. Required.
    */
  var deadlineDate: js.UndefOr[String] = js.native
  
  /**
    * Hour of the day on the deadline date until which the order has to be
    * placed to qualify for the delivery guarantee. Possible values are: 0
    * (midnight), 1, ..., 12 (noon), 13, ..., 23. Required.
    */
  var deadlineHour: js.UndefOr[Double] = js.native
  
  /**
    * Timezone identifier for the deadline hour. A list of identifiers can be
    * found in  the AdWords API documentation. E.g. &quot;Europe/Zurich&quot;.
    * Required.
    */
  var deadlineTimezone: js.UndefOr[String] = js.native
  
  /**
    * Unique identifier for the holiday. Required.
    */
  var holidayId: js.UndefOr[String] = js.native
  
  /**
    * Date on which the deadline will become visible to consumers in ISO 8601
    * format. E.g. &quot;2016-10-31&quot; for 31st October 2016. Required.
    */
  var visibleFromDate: js.UndefOr[String] = js.native
}
object SchemaHolidayCutoff {
  
  @scala.inline
  def apply(): SchemaHolidayCutoff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHolidayCutoff]
  }
  
  @scala.inline
  implicit class SchemaHolidayCutoffMutableBuilder[Self <: SchemaHolidayCutoff] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadlineDate(value: String): Self = StObject.set(x, "deadlineDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadlineDateUndefined: Self = StObject.set(x, "deadlineDate", js.undefined)
    
    @scala.inline
    def setDeadlineHour(value: Double): Self = StObject.set(x, "deadlineHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadlineHourUndefined: Self = StObject.set(x, "deadlineHour", js.undefined)
    
    @scala.inline
    def setDeadlineTimezone(value: String): Self = StObject.set(x, "deadlineTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadlineTimezoneUndefined: Self = StObject.set(x, "deadlineTimezone", js.undefined)
    
    @scala.inline
    def setHolidayId(value: String): Self = StObject.set(x, "holidayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolidayIdUndefined: Self = StObject.set(x, "holidayId", js.undefined)
    
    @scala.inline
    def setVisibleFromDate(value: String): Self = StObject.set(x, "visibleFromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleFromDateUndefined: Self = StObject.set(x, "visibleFromDate", js.undefined)
  }
}

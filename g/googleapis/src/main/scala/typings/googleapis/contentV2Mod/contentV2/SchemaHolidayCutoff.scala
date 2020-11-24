package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaHolidayCutoff extends js.Object {
  
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
  implicit class SchemaHolidayCutoffOps[Self <: SchemaHolidayCutoff] (val x: Self) extends AnyVal {
    
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
    def setDeadlineDate(value: String): Self = this.set("deadlineDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadlineDate: Self = this.set("deadlineDate", js.undefined)
    
    @scala.inline
    def setDeadlineHour(value: Double): Self = this.set("deadlineHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadlineHour: Self = this.set("deadlineHour", js.undefined)
    
    @scala.inline
    def setDeadlineTimezone(value: String): Self = this.set("deadlineTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadlineTimezone: Self = this.set("deadlineTimezone", js.undefined)
    
    @scala.inline
    def setHolidayId(value: String): Self = this.set("holidayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHolidayId: Self = this.set("holidayId", js.undefined)
    
    @scala.inline
    def setVisibleFromDate(value: String): Self = this.set("visibleFromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleFromDate: Self = this.set("visibleFromDate", js.undefined)
  }
}

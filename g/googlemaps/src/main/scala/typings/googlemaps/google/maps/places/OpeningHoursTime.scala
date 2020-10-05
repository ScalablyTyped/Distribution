package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO rename to PlaceOpeningHoursTime https://developers.google.com/maps/documentation/javascript/reference/places-service#PlaceOpeningHoursTime
@js.native
trait OpeningHoursTime extends js.Object {
  var day: Double = js.native
  var hours: Double = js.native
  var minutes: Double = js.native
  var nextDate: Double = js.native
  var time: String = js.native
}

object OpeningHoursTime {
  @scala.inline
  def apply(day: Double, hours: Double, minutes: Double, nextDate: Double, time: String): OpeningHoursTime = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], nextDate = nextDate.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningHoursTime]
  }
  @scala.inline
  implicit class OpeningHoursTimeOps[Self <: OpeningHoursTime] (val x: Self) extends AnyVal {
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
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextDate(value: Double): Self = this.set("nextDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}


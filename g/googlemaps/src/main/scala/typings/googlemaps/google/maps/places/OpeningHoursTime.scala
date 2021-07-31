package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO rename to PlaceOpeningHoursTime https://developers.google.com/maps/documentation/javascript/reference/places-service#PlaceOpeningHoursTime
trait OpeningHoursTime extends StObject {
  
  var day: Double
  
  var hours: Double
  
  var minutes: Double
  
  var nextDate: Double
  
  var time: String
}
object OpeningHoursTime {
  
  @scala.inline
  def apply(day: Double, hours: Double, minutes: Double, nextDate: Double, time: String): OpeningHoursTime = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], nextDate = nextDate.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningHoursTime]
  }
  
  @scala.inline
  implicit class OpeningHoursTimeMutableBuilder[Self <: OpeningHoursTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextDate(value: Double): Self = StObject.set(x, "nextDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}

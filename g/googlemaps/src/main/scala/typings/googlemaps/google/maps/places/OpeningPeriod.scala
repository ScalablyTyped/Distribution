package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO rename to PlaceOpeningHoursPeriod https://developers.google.com/maps/documentation/javascript/reference/places-service#PlaceOpeningHoursPeriod
trait OpeningPeriod extends StObject {
  
  var close: js.UndefOr[OpeningHoursTime] = js.undefined
  
  var open: OpeningHoursTime
}
object OpeningPeriod {
  
  @scala.inline
  def apply(open: OpeningHoursTime): OpeningPeriod = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningPeriod]
  }
  
  @scala.inline
  implicit class OpeningPeriodMutableBuilder[Self <: OpeningPeriod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: OpeningHoursTime): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: OpeningHoursTime): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}

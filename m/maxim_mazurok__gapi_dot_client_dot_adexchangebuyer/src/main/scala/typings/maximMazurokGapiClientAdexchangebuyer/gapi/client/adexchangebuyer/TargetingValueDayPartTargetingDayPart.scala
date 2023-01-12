package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingValueDayPartTargetingDayPart extends StObject {
  
  var dayOfWeek: js.UndefOr[String] = js.undefined
  
  var endHour: js.UndefOr[Double] = js.undefined
  
  var endMinute: js.UndefOr[Double] = js.undefined
  
  var startHour: js.UndefOr[Double] = js.undefined
  
  var startMinute: js.UndefOr[Double] = js.undefined
}
object TargetingValueDayPartTargetingDayPart {
  
  inline def apply(): TargetingValueDayPartTargetingDayPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueDayPartTargetingDayPart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetingValueDayPartTargetingDayPart] (val x: Self) extends AnyVal {
    
    inline def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setEndHour(value: Double): Self = StObject.set(x, "endHour", value.asInstanceOf[js.Any])
    
    inline def setEndHourUndefined: Self = StObject.set(x, "endHour", js.undefined)
    
    inline def setEndMinute(value: Double): Self = StObject.set(x, "endMinute", value.asInstanceOf[js.Any])
    
    inline def setEndMinuteUndefined: Self = StObject.set(x, "endMinute", js.undefined)
    
    inline def setStartHour(value: Double): Self = StObject.set(x, "startHour", value.asInstanceOf[js.Any])
    
    inline def setStartHourUndefined: Self = StObject.set(x, "startHour", js.undefined)
    
    inline def setStartMinute(value: Double): Self = StObject.set(x, "startMinute", value.asInstanceOf[js.Any])
    
    inline def setStartMinuteUndefined: Self = StObject.set(x, "startMinute", js.undefined)
  }
}

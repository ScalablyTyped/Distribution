package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetingValueDayPartTargetingDayPart extends StObject {
  
  var dayOfWeek: js.UndefOr[String | Null] = js.undefined
  
  var endHour: js.UndefOr[Double | Null] = js.undefined
  
  var endMinute: js.UndefOr[Double | Null] = js.undefined
  
  var startHour: js.UndefOr[Double | Null] = js.undefined
  
  var startMinute: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTargetingValueDayPartTargetingDayPart {
  
  inline def apply(): SchemaTargetingValueDayPartTargetingDayPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueDayPartTargetingDayPart]
  }
  
  extension [Self <: SchemaTargetingValueDayPartTargetingDayPart](x: Self) {
    
    inline def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekNull: Self = StObject.set(x, "dayOfWeek", null)
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setEndHour(value: Double): Self = StObject.set(x, "endHour", value.asInstanceOf[js.Any])
    
    inline def setEndHourNull: Self = StObject.set(x, "endHour", null)
    
    inline def setEndHourUndefined: Self = StObject.set(x, "endHour", js.undefined)
    
    inline def setEndMinute(value: Double): Self = StObject.set(x, "endMinute", value.asInstanceOf[js.Any])
    
    inline def setEndMinuteNull: Self = StObject.set(x, "endMinute", null)
    
    inline def setEndMinuteUndefined: Self = StObject.set(x, "endMinute", js.undefined)
    
    inline def setStartHour(value: Double): Self = StObject.set(x, "startHour", value.asInstanceOf[js.Any])
    
    inline def setStartHourNull: Self = StObject.set(x, "startHour", null)
    
    inline def setStartHourUndefined: Self = StObject.set(x, "startHour", js.undefined)
    
    inline def setStartMinute(value: Double): Self = StObject.set(x, "startMinute", value.asInstanceOf[js.Any])
    
    inline def setStartMinuteNull: Self = StObject.set(x, "startMinute", null)
    
    inline def setStartMinuteUndefined: Self = StObject.set(x, "startMinute", js.undefined)
  }
}

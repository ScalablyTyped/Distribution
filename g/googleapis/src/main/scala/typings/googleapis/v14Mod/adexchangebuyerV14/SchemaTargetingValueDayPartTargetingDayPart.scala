package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetingValueDayPartTargetingDayPart extends StObject {
  
  var dayOfWeek: js.UndefOr[String] = js.undefined
  
  var endHour: js.UndefOr[Double] = js.undefined
  
  var endMinute: js.UndefOr[Double] = js.undefined
  
  var startHour: js.UndefOr[Double] = js.undefined
  
  var startMinute: js.UndefOr[Double] = js.undefined
}
object SchemaTargetingValueDayPartTargetingDayPart {
  
  @scala.inline
  def apply(): SchemaTargetingValueDayPartTargetingDayPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueDayPartTargetingDayPart]
  }
  
  @scala.inline
  implicit class SchemaTargetingValueDayPartTargetingDayPartMutableBuilder[Self <: SchemaTargetingValueDayPartTargetingDayPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    @scala.inline
    def setEndHour(value: Double): Self = StObject.set(x, "endHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndHourUndefined: Self = StObject.set(x, "endHour", js.undefined)
    
    @scala.inline
    def setEndMinute(value: Double): Self = StObject.set(x, "endMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndMinuteUndefined: Self = StObject.set(x, "endMinute", js.undefined)
    
    @scala.inline
    def setStartHour(value: Double): Self = StObject.set(x, "startHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartHourUndefined: Self = StObject.set(x, "startHour", js.undefined)
    
    @scala.inline
    def setStartMinute(value: Double): Self = StObject.set(x, "startMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMinuteUndefined: Self = StObject.set(x, "startMinute", js.undefined)
  }
}

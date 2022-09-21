package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSchedulerDayViewSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets/Sets the number of days are visible at a time in the day view. 1 to 7 days are supported.
    *
    */
  var dayViewNumberOfDays: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the time slots duration. 5, 6, 10, 15, 30 and 60 minutes are supported.
    *
    */
  var timeSlotInterval: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets whether to display all hours or just working hours.
    *
    */
  var workingHoursDisplayMode: js.UndefOr[String] = js.undefined
}
object IgSchedulerDayViewSettings {
  
  inline def apply(): IgSchedulerDayViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSchedulerDayViewSettings]
  }
  
  extension [Self <: IgSchedulerDayViewSettings](x: Self) {
    
    inline def setDayViewNumberOfDays(value: Double): Self = StObject.set(x, "dayViewNumberOfDays", value.asInstanceOf[js.Any])
    
    inline def setDayViewNumberOfDaysUndefined: Self = StObject.set(x, "dayViewNumberOfDays", js.undefined)
    
    inline def setTimeSlotInterval(value: String): Self = StObject.set(x, "timeSlotInterval", value.asInstanceOf[js.Any])
    
    inline def setTimeSlotIntervalUndefined: Self = StObject.set(x, "timeSlotInterval", js.undefined)
    
    inline def setWorkingHoursDisplayMode(value: String): Self = StObject.set(x, "workingHoursDisplayMode", value.asInstanceOf[js.Any])
    
    inline def setWorkingHoursDisplayModeUndefined: Self = StObject.set(x, "workingHoursDisplayMode", js.undefined)
  }
}

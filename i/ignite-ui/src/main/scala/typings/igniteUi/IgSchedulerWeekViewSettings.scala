package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSchedulerWeekViewSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets the time slots duration. 5, 6, 10, 15, 30 and 60 minutes are supported.
    *
    */
  var timeSlotInterval: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the week view display mode (whether to show all days or just working days).
    *
    */
  var weekViewDisplayMode: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets whether to display all hours or just working hours.
    *
    */
  var workingHoursDisplayMode: js.UndefOr[String] = js.undefined
}
object IgSchedulerWeekViewSettings {
  
  @scala.inline
  def apply(): IgSchedulerWeekViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSchedulerWeekViewSettings]
  }
  
  @scala.inline
  implicit class IgSchedulerWeekViewSettingsMutableBuilder[Self <: IgSchedulerWeekViewSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeSlotInterval(value: String): Self = StObject.set(x, "timeSlotInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSlotIntervalUndefined: Self = StObject.set(x, "timeSlotInterval", js.undefined)
    
    @scala.inline
    def setWeekViewDisplayMode(value: String): Self = StObject.set(x, "weekViewDisplayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekViewDisplayModeUndefined: Self = StObject.set(x, "weekViewDisplayMode", js.undefined)
    
    @scala.inline
    def setWorkingHoursDisplayMode(value: String): Self = StObject.set(x, "workingHoursDisplayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingHoursDisplayModeUndefined: Self = StObject.set(x, "workingHoursDisplayMode", js.undefined)
  }
}

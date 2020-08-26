package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSchedulerWeekViewSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets the time slots duration. 5, 6, 10, 15, 30 and 60 minutes are supported.
    *
    */
  var timeSlotInterval: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the week view display mode (whether to show all days or just working days).
    *
    */
  var weekViewDisplayMode: js.UndefOr[String] = js.native
  /**
    * Gets/Sets whether to display all hours or just working hours.
    *
    */
  var workingHoursDisplayMode: js.UndefOr[String] = js.native
}

object IgSchedulerWeekViewSettings {
  @scala.inline
  def apply(): IgSchedulerWeekViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSchedulerWeekViewSettings]
  }
  @scala.inline
  implicit class IgSchedulerWeekViewSettingsOps[Self <: IgSchedulerWeekViewSettings] (val x: Self) extends AnyVal {
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
    def setTimeSlotInterval(value: String): Self = this.set("timeSlotInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeSlotInterval: Self = this.set("timeSlotInterval", js.undefined)
    @scala.inline
    def setWeekViewDisplayMode(value: String): Self = this.set("weekViewDisplayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekViewDisplayMode: Self = this.set("weekViewDisplayMode", js.undefined)
    @scala.inline
    def setWorkingHoursDisplayMode(value: String): Self = this.set("workingHoursDisplayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkingHoursDisplayMode: Self = this.set("workingHoursDisplayMode", js.undefined)
  }
  
}


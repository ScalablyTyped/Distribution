package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSchedulerWeekViewSettings
  extends /**
	 * Option for IgSchedulerWeekViewSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the time slots duration. 5, 6, 10, 15, 30 and 60 minutes are supported.
  	 *
  	 */
  var timeSlotInterval: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the week view display mode (whether to show all days or just working days).
  	 *
  	 */
  var weekViewDisplayMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets whether to display all hours or just working hours.
  	 *
  	 */
  var workingHoursDisplayMode: js.UndefOr[java.lang.String] = js.undefined
}

object IgSchedulerWeekViewSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgSchedulerWeekViewSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    timeSlotInterval: java.lang.String = null,
    weekViewDisplayMode: java.lang.String = null,
    workingHoursDisplayMode: java.lang.String = null
  ): IgSchedulerWeekViewSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (timeSlotInterval != null) __obj.updateDynamic("timeSlotInterval")(timeSlotInterval)
    if (weekViewDisplayMode != null) __obj.updateDynamic("weekViewDisplayMode")(weekViewDisplayMode)
    if (workingHoursDisplayMode != null) __obj.updateDynamic("workingHoursDisplayMode")(workingHoursDisplayMode)
    __obj.asInstanceOf[IgSchedulerWeekViewSettings]
  }
}


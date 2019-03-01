package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSchedulerAgendaViewSettings
  extends /**
	 * Option for IgSchedulerAgendaViewSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the number of days shown in AgendaView mode.
  	 *
  	 */
  var dateRangeInterval: js.UndefOr[scala.Double] = js.undefined
}

object IgSchedulerAgendaViewSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgSchedulerAgendaViewSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    dateRangeInterval: scala.Int | scala.Double = null
  ): IgSchedulerAgendaViewSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dateRangeInterval != null) __obj.updateDynamic("dateRangeInterval")(dateRangeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSchedulerAgendaViewSettings]
  }
}


package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSchedulerAgendaViewSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets the number of days shown in AgendaView mode.
    *
    */
  var dateRangeInterval: js.UndefOr[Double] = js.undefined
}

object IgSchedulerAgendaViewSettings {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    dateRangeInterval: js.UndefOr[Double] = js.undefined
  ): IgSchedulerAgendaViewSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(dateRangeInterval)) __obj.updateDynamic("dateRangeInterval")(dateRangeInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSchedulerAgendaViewSettings]
  }
}


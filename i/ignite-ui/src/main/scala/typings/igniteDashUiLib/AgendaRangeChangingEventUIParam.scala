package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgendaRangeChangingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the current AgendaView start date.
  	 */
  var currentAgendaRangeStartDate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the days to be shown in AgendaView mode.
  	 */
  var dateRangeInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets a reference to the newly AgendaView start date.
  	 */
  var newAgendaRangeStartDate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object AgendaRangeChangingEventUIParam {
  @scala.inline
  def apply(
    currentAgendaRangeStartDate: js.Any = null,
    dateRangeInterval: scala.Int | scala.Double = null,
    newAgendaRangeStartDate: js.Any = null,
    owner: js.Any = null
  ): AgendaRangeChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (currentAgendaRangeStartDate != null) __obj.updateDynamic("currentAgendaRangeStartDate")(currentAgendaRangeStartDate)
    if (dateRangeInterval != null) __obj.updateDynamic("dateRangeInterval")(dateRangeInterval.asInstanceOf[js.Any])
    if (newAgendaRangeStartDate != null) __obj.updateDynamic("newAgendaRangeStartDate")(newAgendaRangeStartDate)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[AgendaRangeChangingEventUIParam]
  }
}


package typings.igniteUi

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
  var dateRangeInterval: js.UndefOr[Double] = js.undefined
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
    dateRangeInterval: js.UndefOr[Double] = js.undefined,
    newAgendaRangeStartDate: js.Any = null,
    owner: js.Any = null
  ): AgendaRangeChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (currentAgendaRangeStartDate != null) __obj.updateDynamic("currentAgendaRangeStartDate")(currentAgendaRangeStartDate.asInstanceOf[js.Any])
    if (!js.isUndefined(dateRangeInterval)) __obj.updateDynamic("dateRangeInterval")(dateRangeInterval.get.asInstanceOf[js.Any])
    if (newAgendaRangeStartDate != null) __obj.updateDynamic("newAgendaRangeStartDate")(newAgendaRangeStartDate.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgendaRangeChangingEventUIParam]
  }
}


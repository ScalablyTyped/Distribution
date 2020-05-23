package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgendaRangeChangedEventUIParam extends js.Object {
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

object AgendaRangeChangedEventUIParam {
  @scala.inline
  def apply(
    dateRangeInterval: js.UndefOr[Double] = js.undefined,
    newAgendaRangeStartDate: js.Any = null,
    owner: js.Any = null
  ): AgendaRangeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dateRangeInterval)) __obj.updateDynamic("dateRangeInterval")(dateRangeInterval.get.asInstanceOf[js.Any])
    if (newAgendaRangeStartDate != null) __obj.updateDynamic("newAgendaRangeStartDate")(newAgendaRangeStartDate.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgendaRangeChangedEventUIParam]
  }
}


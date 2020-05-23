package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DaySelectedEventUIParam extends js.Object {
  /**
    * Gets a reference to currently selected date.
    */
  var date: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DaySelectedEventUIParam {
  @scala.inline
  def apply(date: js.Any = null, owner: js.Any = null): DaySelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaySelectedEventUIParam]
  }
}


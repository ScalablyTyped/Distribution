package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthChangedEventUIParam extends js.Object {
  /**
    * Gets a reference to newly selected date.
    */
  var newSelectedDate: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object MonthChangedEventUIParam {
  @scala.inline
  def apply(newSelectedDate: js.Any = null, owner: js.Any = null): MonthChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (newSelectedDate != null) __obj.updateDynamic("newSelectedDate")(newSelectedDate.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthChangedEventUIParam]
  }
}


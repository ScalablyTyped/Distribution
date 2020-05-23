package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemSelectedEventUIParam extends js.Object {
  /**
    * Gets a reference to jQuery UI date picker widget, used as a calendar from the igDatePicker.
    */
  var calendar: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the selected date object.
    */
  var dateFromPicker: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the selected html element from the calendar.
    */
  var item: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ItemSelectedEventUIParam {
  @scala.inline
  def apply(calendar: js.Any = null, dateFromPicker: js.Any = null, item: js.Any = null, owner: js.Any = null): ItemSelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (dateFromPicker != null) __obj.updateDynamic("dateFromPicker")(dateFromPicker.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemSelectedEventUIParam]
  }
}


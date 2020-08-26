package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemSelectedEventUIParam extends js.Object {
  /**
    * Gets a reference to jQuery UI date picker widget, used as a calendar from the igDatePicker.
    */
  var calendar: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the selected date object.
    */
  var dateFromPicker: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the selected html element from the calendar.
    */
  var item: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ItemSelectedEventUIParam {
  @scala.inline
  def apply(): ItemSelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemSelectedEventUIParam]
  }
  @scala.inline
  implicit class ItemSelectedEventUIParamOps[Self <: ItemSelectedEventUIParam] (val x: Self) extends AnyVal {
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
    def setCalendar(value: js.Any): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    @scala.inline
    def setDateFromPicker(value: js.Any): Self = this.set("dateFromPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFromPicker: Self = this.set("dateFromPicker", js.undefined)
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}


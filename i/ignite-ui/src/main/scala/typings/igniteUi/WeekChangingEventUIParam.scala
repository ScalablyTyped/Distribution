package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeekChangingEventUIParam extends js.Object {
  /**
    * Gets a reference to the currently selected date.
    */
  var currentSelectedDate: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to newly selected date.
    */
  var newSelectedDate: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object WeekChangingEventUIParam {
  @scala.inline
  def apply(): WeekChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeekChangingEventUIParam]
  }
  @scala.inline
  implicit class WeekChangingEventUIParamOps[Self <: WeekChangingEventUIParam] (val x: Self) extends AnyVal {
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
    def setCurrentSelectedDate(value: js.Any): Self = this.set("currentSelectedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentSelectedDate: Self = this.set("currentSelectedDate", js.undefined)
    @scala.inline
    def setNewSelectedDate(value: js.Any): Self = this.set("newSelectedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewSelectedDate: Self = this.set("newSelectedDate", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}


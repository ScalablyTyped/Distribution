package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Datepicker, 'gotoDate'> */
@js.native
trait PickDatepickergotoDate extends js.Object {
  var gotoDate: js.UndefOr[js.Any] = js.native
}

object PickDatepickergotoDate {
  @scala.inline
  def apply(): PickDatepickergotoDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickDatepickergotoDate]
  }
  @scala.inline
  implicit class PickDatepickergotoDateOps[Self <: PickDatepickergotoDate] (val x: Self) extends AnyVal {
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
    def setGotoDate(value: js.Any): Self = this.set("gotoDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGotoDate: Self = this.set("gotoDate", js.undefined)
  }
  
}


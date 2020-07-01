package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Datepicker, 'gotoDate'> */
trait PickDatepickergotoDate extends js.Object {
  var gotoDate: js.UndefOr[js.Any] = js.undefined
}

object PickDatepickergotoDate {
  @scala.inline
  def apply(gotoDate: js.Any = null): PickDatepickergotoDate = {
    val __obj = js.Dynamic.literal()
    if (gotoDate != null) __obj.updateDynamic("gotoDate")(gotoDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickDatepickergotoDate]
  }
}


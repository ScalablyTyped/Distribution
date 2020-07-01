package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Datepicker, 'setDate'> */
trait PickDatepickersetDate extends js.Object {
  var setDate: js.UndefOr[js.Any] = js.undefined
}

object PickDatepickersetDate {
  @scala.inline
  def apply(setDate: js.Any = null): PickDatepickersetDate = {
    val __obj = js.Dynamic.literal()
    if (setDate != null) __obj.updateDynamic("setDate")(setDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickDatepickersetDate]
  }
}


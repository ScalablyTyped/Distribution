package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Timepicker, 'open' | 'close' | 'destroy'> */
trait PickTimepickeropenclosede extends js.Object {
  var close: js.UndefOr[js.Any] = js.undefined
  var destroy: js.UndefOr[js.Any] = js.undefined
  var open: js.UndefOr[js.Any] = js.undefined
}

object PickTimepickeropenclosede {
  @scala.inline
  def apply(close: js.Any = null, destroy: js.Any = null, open: js.Any = null): PickTimepickeropenclosede = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTimepickeropenclosede]
  }
}


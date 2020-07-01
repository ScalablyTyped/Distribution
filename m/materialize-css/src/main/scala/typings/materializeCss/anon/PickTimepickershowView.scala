package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Timepicker, 'showView'> */
trait PickTimepickershowView extends js.Object {
  var showView: js.UndefOr[js.Any] = js.undefined
}

object PickTimepickershowView {
  @scala.inline
  def apply(showView: js.Any = null): PickTimepickershowView = {
    val __obj = js.Dynamic.literal()
    if (showView != null) __obj.updateDynamic("showView")(showView.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTimepickershowView]
  }
}


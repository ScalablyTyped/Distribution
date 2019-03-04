package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridSortEvent extends GridEvent {
  var sort: js.UndefOr[js.Any] = js.undefined
}

object GridSortEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Grid,
    sort: js.Any = null
  ): GridSortEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[GridSortEvent]
  }
}


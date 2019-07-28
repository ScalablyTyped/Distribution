package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnHideEvent extends TreeListEvent {
  var column: js.UndefOr[js.Any] = js.undefined
}

object TreeListColumnHideEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    column: js.Any = null
  ): TreeListColumnHideEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (column != null) __obj.updateDynamic("column")(column)
    __obj.asInstanceOf[TreeListColumnHideEvent]
  }
}


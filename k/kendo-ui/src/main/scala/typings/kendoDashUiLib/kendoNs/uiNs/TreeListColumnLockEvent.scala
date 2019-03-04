package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnLockEvent extends TreeListEvent {
  var column: js.UndefOr[js.Any] = js.undefined
}

object TreeListColumnLockEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: TreeList,
    column: js.Any = null
  ): TreeListColumnLockEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (column != null) __obj.updateDynamic("column")(column)
    __obj.asInstanceOf[TreeListColumnLockEvent]
  }
}


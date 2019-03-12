package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnMenuOpenEvent extends TreeListEvent {
  var container: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
}

object TreeListColumnMenuOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    container: kendoDashUiLib.JQuery = null,
    field: java.lang.String = null
  ): TreeListColumnMenuOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (container != null) __obj.updateDynamic("container")(container)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[TreeListColumnMenuOpenEvent]
  }
}


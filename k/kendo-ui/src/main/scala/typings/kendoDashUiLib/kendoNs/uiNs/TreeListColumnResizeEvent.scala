package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnResizeEvent extends TreeListEvent {
  var column: js.UndefOr[js.Any] = js.undefined
  var newWidth: js.UndefOr[scala.Double] = js.undefined
  var oldWidth: js.UndefOr[scala.Double] = js.undefined
}

object TreeListColumnResizeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    column: js.Any = null,
    newWidth: scala.Int | scala.Double = null,
    oldWidth: scala.Int | scala.Double = null
  ): TreeListColumnResizeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (column != null) __obj.updateDynamic("column")(column)
    if (newWidth != null) __obj.updateDynamic("newWidth")(newWidth.asInstanceOf[js.Any])
    if (oldWidth != null) __obj.updateDynamic("oldWidth")(oldWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumnResizeEvent]
  }
}


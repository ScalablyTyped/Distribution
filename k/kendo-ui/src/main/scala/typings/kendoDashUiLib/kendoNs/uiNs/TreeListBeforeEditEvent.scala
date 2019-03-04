package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListBeforeEditEvent extends TreeListEvent {
  var model: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.Model] = js.undefined
}

object TreeListBeforeEditEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: TreeList,
    model: kendoDashUiLib.kendoNs.dataNs.Model = null
  ): TreeListBeforeEditEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[TreeListBeforeEditEvent]
  }
}


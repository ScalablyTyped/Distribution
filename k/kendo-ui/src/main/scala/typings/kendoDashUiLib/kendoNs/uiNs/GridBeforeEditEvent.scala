package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridBeforeEditEvent extends GridEvent {
  var model: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.Model] = js.undefined
}

object GridBeforeEditEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Grid,
    model: kendoDashUiLib.kendoNs.dataNs.Model = null
  ): GridBeforeEditEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[GridBeforeEditEvent]
  }
}


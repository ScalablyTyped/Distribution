package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetOpenEvent extends ActionSheetEvent {
  var context: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var target: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object ActionSheetOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ActionSheet,
    context: kendoDashUiLib.JQuery = null,
    target: kendoDashUiLib.JQuery = null
  ): ActionSheetOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (context != null) __obj.updateDynamic("context")(context)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ActionSheetOpenEvent]
  }
}


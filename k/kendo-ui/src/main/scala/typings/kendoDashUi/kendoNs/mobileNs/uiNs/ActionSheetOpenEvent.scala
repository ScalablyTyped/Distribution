package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetOpenEvent extends ActionSheetEvent {
  var context: js.UndefOr[JQuery] = js.undefined
  var target: js.UndefOr[JQuery] = js.undefined
}

object ActionSheetOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ActionSheet,
    context: JQuery = null,
    target: JQuery = null
  ): ActionSheetOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (context != null) __obj.updateDynamic("context")(context)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ActionSheetOpenEvent]
  }
}


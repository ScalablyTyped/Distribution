package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarCloseEvent extends ToolBarEvent {
  var SplitButton: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object ToolBarCloseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: ToolBar,
    SplitButton: kendoDashUiLib.JQuery = null
  ): ToolBarCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (SplitButton != null) __obj.updateDynamic("SplitButton")(SplitButton)
    __obj.asInstanceOf[ToolBarCloseEvent]
  }
}


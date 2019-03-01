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
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ToolBar,
    SplitButton: kendoDashUiLib.JQuery = null
  ): ToolBarCloseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (SplitButton != null) __obj.updateDynamic("SplitButton")(SplitButton)
    __obj.asInstanceOf[ToolBarCloseEvent]
  }
}


package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarCloseEvent extends ToolBarEvent {
  var SplitButton: js.UndefOr[JQuery] = js.undefined
}

object ToolBarCloseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ToolBar,
    SplitButton: JQuery = null
  ): ToolBarCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (SplitButton != null) __obj.updateDynamic("SplitButton")(SplitButton)
    __obj.asInstanceOf[ToolBarCloseEvent]
  }
}


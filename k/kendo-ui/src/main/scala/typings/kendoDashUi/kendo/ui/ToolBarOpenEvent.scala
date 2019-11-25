package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarOpenEvent extends ToolBarEvent {
  var SplitButton: js.UndefOr[JQuery] = js.undefined
}

object ToolBarOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ToolBar,
    SplitButton: JQuery = null
  ): ToolBarOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (SplitButton != null) __obj.updateDynamic("SplitButton")(SplitButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarOpenEvent]
  }
}


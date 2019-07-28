package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarClickEvent extends ToolBarEvent {
  var id: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[JQuery] = js.undefined
}

object ToolBarClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ToolBar,
    id: String = null,
    target: JQuery = null
  ): ToolBarClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (id != null) __obj.updateDynamic("id")(id)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ToolBarClickEvent]
  }
}


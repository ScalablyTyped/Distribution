package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarToggleEvent extends ToolBarEvent {
  var checked: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[JQuery] = js.undefined
}

object ToolBarToggleEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ToolBar,
    checked: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    target: JQuery = null
  ): ToolBarToggleEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (id != null) __obj.updateDynamic("id")(id)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ToolBarToggleEvent]
  }
}


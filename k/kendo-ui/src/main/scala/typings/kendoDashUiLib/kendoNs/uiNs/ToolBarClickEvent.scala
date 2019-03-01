package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarClickEvent extends ToolBarEvent {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object ToolBarClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ToolBar,
    id: java.lang.String = null,
    target: kendoDashUiLib.JQuery = null
  ): ToolBarClickEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (id != null) __obj.updateDynamic("id")(id)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ToolBarClickEvent]
  }
}


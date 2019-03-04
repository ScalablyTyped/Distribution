package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopOverOpenEvent extends PopOverEvent {
  var target: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object PopOverOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: PopOver,
    target: kendoDashUiLib.JQuery = null
  ): PopOverOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[PopOverOpenEvent]
  }
}


package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailButtonClickEvent extends DetailButtonEvent {
  var button: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var target: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object DetailButtonClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: DetailButton,
    button: kendoDashUiLib.JQuery = null,
    target: kendoDashUiLib.JQuery = null
  ): DetailButtonClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (button != null) __obj.updateDynamic("button")(button)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DetailButtonClickEvent]
  }
}


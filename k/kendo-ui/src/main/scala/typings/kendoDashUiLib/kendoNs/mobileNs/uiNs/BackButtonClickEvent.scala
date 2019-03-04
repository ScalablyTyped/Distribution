package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackButtonClickEvent extends BackButtonEvent {
  var button: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var target: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object BackButtonClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: BackButton,
    button: kendoDashUiLib.JQuery = null,
    target: kendoDashUiLib.JQuery = null
  ): BackButtonClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (button != null) __obj.updateDynamic("button")(button)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[BackButtonClickEvent]
  }
}


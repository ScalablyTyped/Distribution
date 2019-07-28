package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackButtonClickEvent extends BackButtonEvent {
  var button: js.UndefOr[JQuery] = js.undefined
  var target: js.UndefOr[JQuery] = js.undefined
}

object BackButtonClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: BackButton,
    button: JQuery = null,
    target: JQuery = null
  ): BackButtonClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (button != null) __obj.updateDynamic("button")(button)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[BackButtonClickEvent]
  }
}


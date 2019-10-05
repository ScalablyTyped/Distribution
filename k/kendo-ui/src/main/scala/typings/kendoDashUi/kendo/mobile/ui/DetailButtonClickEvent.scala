package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailButtonClickEvent extends DetailButtonEvent {
  var button: js.UndefOr[JQuery] = js.undefined
  var target: js.UndefOr[JQuery] = js.undefined
}

object DetailButtonClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: DetailButton,
    button: JQuery = null,
    target: JQuery = null
  ): DetailButtonClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (button != null) __obj.updateDynamic("button")(button)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DetailButtonClickEvent]
  }
}


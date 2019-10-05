package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatActionClickEvent extends ChatEvent {
  var text: js.UndefOr[String] = js.undefined
}

object ChatActionClickEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Chat, text: String = null): ChatActionClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ChatActionClickEvent]
  }
}


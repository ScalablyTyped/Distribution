package typings.kendoDashUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatPostEvent extends ChatEvent {
  var from: js.UndefOr[js.Any] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[Date] = js.undefined
}

object ChatPostEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Chat,
    from: js.Any = null,
    text: String = null,
    timestamp: Date = null
  ): ChatPostEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (from != null) __obj.updateDynamic("from")(from)
    if (text != null) __obj.updateDynamic("text")(text)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[ChatPostEvent]
  }
}


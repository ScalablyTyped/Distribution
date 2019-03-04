package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatPostEvent extends ChatEvent {
  var from: js.UndefOr[js.Any] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var timestamp: js.UndefOr[stdLib.Date] = js.undefined
}

object ChatPostEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Chat,
    from: js.Any = null,
    text: java.lang.String = null,
    timestamp: stdLib.Date = null
  ): ChatPostEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (from != null) __obj.updateDynamic("from")(from)
    if (text != null) __obj.updateDynamic("text")(text)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[ChatPostEvent]
  }
}


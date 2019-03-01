package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatActionClickEvent extends ChatEvent {
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ChatActionClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Chat,
    text: java.lang.String = null
  ): ChatActionClickEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ChatActionClickEvent]
  }
}


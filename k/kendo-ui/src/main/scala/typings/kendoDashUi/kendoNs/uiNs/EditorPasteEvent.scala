package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorPasteEvent extends EditorEvent {
  var html: js.UndefOr[js.Any] = js.undefined
}

object EditorPasteEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Editor,
    html: js.Any = null
  ): EditorPasteEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (html != null) __obj.updateDynamic("html")(html)
    __obj.asInstanceOf[EditorPasteEvent]
  }
}


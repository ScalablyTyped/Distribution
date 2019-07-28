package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorExecuteEvent extends EditorEvent {
  var command: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object EditorExecuteEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Editor,
    command: js.Any = null,
    name: String = null
  ): EditorExecuteEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (command != null) __obj.updateDynamic("command")(command)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[EditorExecuteEvent]
  }
}


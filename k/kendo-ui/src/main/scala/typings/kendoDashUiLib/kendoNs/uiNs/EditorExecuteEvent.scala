package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorExecuteEvent extends EditorEvent {
  var command: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object EditorExecuteEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Editor,
    command: js.Any = null,
    name: java.lang.String = null
  ): EditorExecuteEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (command != null) __obj.updateDynamic("command")(command)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[EditorExecuteEvent]
  }
}


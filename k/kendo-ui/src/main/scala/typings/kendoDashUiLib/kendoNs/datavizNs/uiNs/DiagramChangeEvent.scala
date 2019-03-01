package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramChangeEvent extends DiagramEvent {
  var added: js.UndefOr[js.Any] = js.undefined
  var removed: js.UndefOr[js.Any] = js.undefined
}

object DiagramChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Diagram,
    added: js.Any = null,
    removed: js.Any = null
  ): DiagramChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (added != null) __obj.updateDynamic("added")(added)
    if (removed != null) __obj.updateDynamic("removed")(removed)
    __obj.asInstanceOf[DiagramChangeEvent]
  }
}


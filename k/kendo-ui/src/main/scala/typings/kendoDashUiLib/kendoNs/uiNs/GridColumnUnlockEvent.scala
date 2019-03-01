package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnUnlockEvent extends GridEvent {
  var column: js.UndefOr[js.Any] = js.undefined
}

object GridColumnUnlockEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Grid,
    column: js.Any = null
  ): GridColumnUnlockEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (column != null) __obj.updateDynamic("column")(column)
    __obj.asInstanceOf[GridColumnUnlockEvent]
  }
}


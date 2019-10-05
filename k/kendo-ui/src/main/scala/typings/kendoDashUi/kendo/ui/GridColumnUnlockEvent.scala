package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnUnlockEvent extends GridEvent {
  var column: js.UndefOr[js.Any] = js.undefined
}

object GridColumnUnlockEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Grid,
    column: js.Any = null
  ): GridColumnUnlockEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (column != null) __obj.updateDynamic("column")(column)
    __obj.asInstanceOf[GridColumnUnlockEvent]
  }
}


package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnShowEvent extends GridEvent {
  var column: js.UndefOr[js.Any] = js.undefined
}

object GridColumnShowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Grid,
    column: js.Any = null
  ): GridColumnShowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (column != null) __obj.updateDynamic("column")(column)
    __obj.asInstanceOf[GridColumnShowEvent]
  }
}


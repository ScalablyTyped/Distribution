package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterChangeEvent extends FilterEvent {
  var expression: js.UndefOr[js.Any] = js.undefined
}

object FilterChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Filter,
    expression: js.Any = null
  ): FilterChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    __obj.asInstanceOf[FilterChangeEvent]
  }
}


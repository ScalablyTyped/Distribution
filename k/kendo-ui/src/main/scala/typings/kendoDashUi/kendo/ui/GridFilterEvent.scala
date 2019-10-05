package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFilterEvent extends GridEvent {
  var field: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[js.Any] = js.undefined
}

object GridFilterEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Grid,
    field: String = null,
    filter: js.Any = null
  ): GridFilterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (field != null) __obj.updateDynamic("field")(field)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[GridFilterEvent]
  }
}


package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridDataBindingEvent extends GridEvent {
  var action: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var items: js.UndefOr[js.Any] = js.undefined
}

object GridDataBindingEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Grid,
    action: String = null,
    index: Int | Double = null,
    items: js.Any = null
  ): GridDataBindingEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (action != null) __obj.updateDynamic("action")(action)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[GridDataBindingEvent]
  }
}


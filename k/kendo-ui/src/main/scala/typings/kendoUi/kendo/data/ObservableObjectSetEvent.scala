package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableObjectSetEvent extends ObservableObjectEvent {
  var preventDefault: js.UndefOr[js.Function] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ObservableObjectSetEvent {
  @scala.inline
  def apply(
    field: String = null,
    preventDefault: js.Function = null,
    sender: ObservableObject = null,
    value: js.Any = null
  ): ObservableObjectSetEvent = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservableObjectSetEvent]
  }
}


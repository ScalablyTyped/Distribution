package typings.kendoUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateInputOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ DateInputChangeEvent, Unit]] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Date] = js.undefined
  var messages: js.UndefOr[DateInputMessages] = js.undefined
  var min: js.UndefOr[Date] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Date] = js.undefined
}

object DateInputOptions {
  @scala.inline
  def apply(
    change: /* e */ DateInputChangeEvent => Unit = null,
    format: String = null,
    max: Date = null,
    messages: DateInputMessages = null,
    min: Date = null,
    name: String = null,
    value: Date = null
  ): DateInputOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateInputOptions]
  }
}


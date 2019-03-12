package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateInputOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ DateInputChangeEvent, scala.Unit]] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[stdLib.Date] = js.undefined
  var messages: js.UndefOr[DateInputMessages] = js.undefined
  var min: js.UndefOr[stdLib.Date] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[stdLib.Date] = js.undefined
}

object DateInputOptions {
  @scala.inline
  def apply(
    change: /* e */ DateInputChangeEvent => scala.Unit = null,
    format: java.lang.String = null,
    max: stdLib.Date = null,
    messages: DateInputMessages = null,
    min: stdLib.Date = null,
    name: java.lang.String = null,
    value: stdLib.Date = null
  ): DateInputOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (format != null) __obj.updateDynamic("format")(format)
    if (max != null) __obj.updateDynamic("max")(max)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (min != null) __obj.updateDynamic("min")(min)
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DateInputOptions]
  }
}


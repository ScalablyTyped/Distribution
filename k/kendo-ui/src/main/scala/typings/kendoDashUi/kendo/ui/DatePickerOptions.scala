package typings.kendoDashUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerOptions extends js.Object {
  var ARIATemplate: js.UndefOr[String] = js.undefined
  var animation: js.UndefOr[Boolean | DatePickerAnimation] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ DatePickerChangeEvent, Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ DatePickerCloseEvent, Unit]] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var dateInput: js.UndefOr[Boolean] = js.undefined
  var dates: js.UndefOr[js.Any] = js.undefined
  var depth: js.UndefOr[String] = js.undefined
  var disableDates: js.UndefOr[js.Any | js.Function] = js.undefined
  var footer: js.UndefOr[Boolean | String | js.Function] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Date] = js.undefined
  var min: js.UndefOr[Date] = js.undefined
  var month: js.UndefOr[DatePickerMonth] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ DatePickerOpenEvent, Unit]] = js.undefined
  var parseFormats: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Date] = js.undefined
  var weekNumber: js.UndefOr[Boolean] = js.undefined
}

object DatePickerOptions {
  @scala.inline
  def apply(
    ARIATemplate: String = null,
    animation: Boolean | DatePickerAnimation = null,
    change: /* e */ DatePickerChangeEvent => Unit = null,
    close: /* e */ DatePickerCloseEvent => Unit = null,
    culture: String = null,
    dateInput: js.UndefOr[Boolean] = js.undefined,
    dates: js.Any = null,
    depth: String = null,
    disableDates: js.Any | js.Function = null,
    footer: Boolean | String | js.Function = null,
    format: String = null,
    max: Date = null,
    min: Date = null,
    month: DatePickerMonth = null,
    name: String = null,
    open: /* e */ DatePickerOpenEvent => Unit = null,
    parseFormats: js.Any = null,
    start: String = null,
    value: Date = null,
    weekNumber: js.UndefOr[Boolean] = js.undefined
  ): DatePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (ARIATemplate != null) __obj.updateDynamic("ARIATemplate")(ARIATemplate)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (!js.isUndefined(dateInput)) __obj.updateDynamic("dateInput")(dateInput)
    if (dates != null) __obj.updateDynamic("dates")(dates)
    if (depth != null) __obj.updateDynamic("depth")(depth)
    if (disableDates != null) __obj.updateDynamic("disableDates")(disableDates.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (month != null) __obj.updateDynamic("month")(month)
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (parseFormats != null) __obj.updateDynamic("parseFormats")(parseFormats)
    if (start != null) __obj.updateDynamic("start")(start)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(weekNumber)) __obj.updateDynamic("weekNumber")(weekNumber)
    __obj.asInstanceOf[DatePickerOptions]
  }
}


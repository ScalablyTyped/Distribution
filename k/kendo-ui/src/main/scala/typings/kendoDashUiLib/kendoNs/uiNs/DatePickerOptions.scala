package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerOptions extends js.Object {
  var ARIATemplate: js.UndefOr[java.lang.String] = js.undefined
  var animation: js.UndefOr[scala.Boolean | DatePickerAnimation] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ DatePickerChangeEvent, scala.Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ DatePickerCloseEvent, scala.Unit]] = js.undefined
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var dateInput: js.UndefOr[scala.Boolean] = js.undefined
  var dates: js.UndefOr[js.Any] = js.undefined
  var depth: js.UndefOr[java.lang.String] = js.undefined
  var disableDates: js.UndefOr[js.Any | js.Function] = js.undefined
  var footer: js.UndefOr[scala.Boolean | java.lang.String | js.Function] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[stdLib.Date] = js.undefined
  var min: js.UndefOr[stdLib.Date] = js.undefined
  var month: js.UndefOr[DatePickerMonth] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ DatePickerOpenEvent, scala.Unit]] = js.undefined
  var parseFormats: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[stdLib.Date] = js.undefined
  var weekNumber: js.UndefOr[scala.Boolean] = js.undefined
}

object DatePickerOptions {
  @scala.inline
  def apply(
    ARIATemplate: java.lang.String = null,
    animation: scala.Boolean | DatePickerAnimation = null,
    change: js.Function1[/* e */ DatePickerChangeEvent, scala.Unit] = null,
    close: js.Function1[/* e */ DatePickerCloseEvent, scala.Unit] = null,
    culture: java.lang.String = null,
    dateInput: js.UndefOr[scala.Boolean] = js.undefined,
    dates: js.Any = null,
    depth: java.lang.String = null,
    disableDates: js.Any | js.Function = null,
    footer: scala.Boolean | java.lang.String | js.Function = null,
    format: java.lang.String = null,
    max: stdLib.Date = null,
    min: stdLib.Date = null,
    month: DatePickerMonth = null,
    name: java.lang.String = null,
    open: js.Function1[/* e */ DatePickerOpenEvent, scala.Unit] = null,
    parseFormats: js.Any = null,
    start: java.lang.String = null,
    value: stdLib.Date = null,
    weekNumber: js.UndefOr[scala.Boolean] = js.undefined
  ): DatePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (ARIATemplate != null) __obj.updateDynamic("ARIATemplate")(ARIATemplate)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(change)
    if (close != null) __obj.updateDynamic("close")(close)
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
    if (open != null) __obj.updateDynamic("open")(open)
    if (parseFormats != null) __obj.updateDynamic("parseFormats")(parseFormats)
    if (start != null) __obj.updateDynamic("start")(start)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(weekNumber)) __obj.updateDynamic("weekNumber")(weekNumber)
    __obj.asInstanceOf[DatePickerOptions]
  }
}


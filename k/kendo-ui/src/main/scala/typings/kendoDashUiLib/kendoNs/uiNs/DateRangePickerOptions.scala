package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangePickerOptions extends js.Object {
  var ARIATemplate: js.UndefOr[java.lang.String] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ DateRangePickerChangeEvent, scala.Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ DateRangePickerCloseEvent, scala.Unit]] = js.undefined
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var dates: js.UndefOr[js.Any] = js.undefined
  var depth: js.UndefOr[java.lang.String] = js.undefined
  var disableDates: js.UndefOr[js.Any | js.Function] = js.undefined
  var footer: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var labels: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[stdLib.Date] = js.undefined
  var messages: js.UndefOr[DateRangePickerMessages] = js.undefined
  var min: js.UndefOr[stdLib.Date] = js.undefined
  var month: js.UndefOr[DateRangePickerMonth] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ DateRangePickerOpenEvent, scala.Unit]] = js.undefined
  var range: js.UndefOr[DateRangePickerRange] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
  var weekNumber: js.UndefOr[scala.Boolean] = js.undefined
}

object DateRangePickerOptions {
  @scala.inline
  def apply(
    ARIATemplate: java.lang.String = null,
    change: js.Function1[/* e */ DateRangePickerChangeEvent, scala.Unit] = null,
    close: js.Function1[/* e */ DateRangePickerCloseEvent, scala.Unit] = null,
    culture: java.lang.String = null,
    dates: js.Any = null,
    depth: java.lang.String = null,
    disableDates: js.Any | js.Function = null,
    footer: java.lang.String | js.Function = null,
    format: java.lang.String = null,
    labels: js.UndefOr[scala.Boolean] = js.undefined,
    max: stdLib.Date = null,
    messages: DateRangePickerMessages = null,
    min: stdLib.Date = null,
    month: DateRangePickerMonth = null,
    name: java.lang.String = null,
    open: js.Function1[/* e */ DateRangePickerOpenEvent, scala.Unit] = null,
    range: DateRangePickerRange = null,
    start: java.lang.String = null,
    weekNumber: js.UndefOr[scala.Boolean] = js.undefined
  ): DateRangePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (ARIATemplate != null) __obj.updateDynamic("ARIATemplate")(ARIATemplate)
    if (change != null) __obj.updateDynamic("change")(change)
    if (close != null) __obj.updateDynamic("close")(close)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (dates != null) __obj.updateDynamic("dates")(dates)
    if (depth != null) __obj.updateDynamic("depth")(depth)
    if (disableDates != null) __obj.updateDynamic("disableDates")(disableDates.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels)
    if (max != null) __obj.updateDynamic("max")(max)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (min != null) __obj.updateDynamic("min")(min)
    if (month != null) __obj.updateDynamic("month")(month)
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(open)
    if (range != null) __obj.updateDynamic("range")(range)
    if (start != null) __obj.updateDynamic("start")(start)
    if (!js.isUndefined(weekNumber)) __obj.updateDynamic("weekNumber")(weekNumber)
    __obj.asInstanceOf[DateRangePickerOptions]
  }
}


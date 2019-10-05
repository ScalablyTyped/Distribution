package typings.kendoDashUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerOptions extends js.Object {
  var animation: js.UndefOr[Boolean | TimePickerAnimation] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ TimePickerChangeEvent, Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ TimePickerCloseEvent, Unit]] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var dateInput: js.UndefOr[Boolean] = js.undefined
  var dates: js.UndefOr[js.Any] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Date] = js.undefined
  var min: js.UndefOr[Date] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ TimePickerOpenEvent, Unit]] = js.undefined
  var parseFormats: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[Date] = js.undefined
}

object TimePickerOptions {
  @scala.inline
  def apply(
    animation: Boolean | TimePickerAnimation = null,
    change: /* e */ TimePickerChangeEvent => Unit = null,
    close: /* e */ TimePickerCloseEvent => Unit = null,
    culture: String = null,
    dateInput: js.UndefOr[Boolean] = js.undefined,
    dates: js.Any = null,
    format: String = null,
    interval: Int | Double = null,
    max: Date = null,
    min: Date = null,
    name: String = null,
    open: /* e */ TimePickerOpenEvent => Unit = null,
    parseFormats: js.Any = null,
    value: Date = null
  ): TimePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (!js.isUndefined(dateInput)) __obj.updateDynamic("dateInput")(dateInput)
    if (dates != null) __obj.updateDynamic("dates")(dates)
    if (format != null) __obj.updateDynamic("format")(format)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (parseFormats != null) __obj.updateDynamic("parseFormats")(parseFormats)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TimePickerOptions]
  }
}


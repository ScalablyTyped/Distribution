package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerOptions extends js.Object {
  var animation: js.UndefOr[scala.Boolean | TimePickerAnimation] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ TimePickerChangeEvent, scala.Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ TimePickerCloseEvent, scala.Unit]] = js.undefined
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var dateInput: js.UndefOr[scala.Boolean] = js.undefined
  var dates: js.UndefOr[js.Any] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[stdLib.Date] = js.undefined
  var min: js.UndefOr[stdLib.Date] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ TimePickerOpenEvent, scala.Unit]] = js.undefined
  var parseFormats: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[stdLib.Date] = js.undefined
}

object TimePickerOptions {
  @scala.inline
  def apply(
    animation: scala.Boolean | TimePickerAnimation = null,
    change: js.Function1[/* e */ TimePickerChangeEvent, scala.Unit] = null,
    close: js.Function1[/* e */ TimePickerCloseEvent, scala.Unit] = null,
    culture: java.lang.String = null,
    dateInput: js.UndefOr[scala.Boolean] = js.undefined,
    dates: js.Any = null,
    format: java.lang.String = null,
    interval: scala.Int | scala.Double = null,
    max: stdLib.Date = null,
    min: stdLib.Date = null,
    name: java.lang.String = null,
    open: js.Function1[/* e */ TimePickerOpenEvent, scala.Unit] = null,
    parseFormats: js.Any = null,
    value: stdLib.Date = null
  ): TimePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(change)
    if (close != null) __obj.updateDynamic("close")(close)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (!js.isUndefined(dateInput)) __obj.updateDynamic("dateInput")(dateInput)
    if (dates != null) __obj.updateDynamic("dates")(dates)
    if (format != null) __obj.updateDynamic("format")(format)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(open)
    if (parseFormats != null) __obj.updateDynamic("parseFormats")(parseFormats)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TimePickerOptions]
  }
}


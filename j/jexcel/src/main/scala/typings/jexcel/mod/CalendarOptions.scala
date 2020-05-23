package typings.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Column options
// ----------------------------------------------------------------------
trait CalendarOptions extends js.Object {
  /** Date format */
  var format: js.UndefOr[String] = js.undefined
  /** Fullscreen (this is automatic set for screensize < 800) */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  /**
    * Translations can be done here
    * Default: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
    */
  var months: js.UndefOr[
    js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
  ] = js.undefined
  // tslint:disable-next-line ban-types
  var onchange: js.UndefOr[js.Function] = js.undefined
  /** Events */
  // tslint:disable-next-line ban-types
  var onclose: js.UndefOr[js.Function] = js.undefined
  /** Placeholder */
  var placeholder: js.UndefOr[CellValue] = js.undefined
  /** Allow keyboard date entry */
  var readonly: js.UndefOr[Boolean] = js.undefined
  /** Show the reset button */
  var resetButton: js.UndefOr[Boolean] = js.undefined
  /** Show timepicker */
  var time: js.UndefOr[Boolean] = js.undefined
  /** Today is default */
  var today: js.UndefOr[Boolean] = js.undefined
  /** Value */
  var value: js.UndefOr[CellValue] = js.undefined
  /**
    * Default: ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]
    */
  var weekdays: js.UndefOr[js.Tuple7[String, String, String, String, String, String, String]] = js.undefined
  /**
    * Default: ["S", "M", "T", "W", "T", "F", "S"]
    */
  var weekdays_short: js.UndefOr[js.Tuple7[String, String, String, String, String, String, String]] = js.undefined
}

object CalendarOptions {
  @scala.inline
  def apply(
    format: String = null,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    months: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = null,
    onchange: js.Function = null,
    onclose: js.Function = null,
    placeholder: CellValue = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    resetButton: js.UndefOr[Boolean] = js.undefined,
    time: js.UndefOr[Boolean] = js.undefined,
    today: js.UndefOr[Boolean] = js.undefined,
    value: CellValue = null,
    weekdays: js.Tuple7[String, String, String, String, String, String, String] = null,
    weekdays_short: js.Tuple7[String, String, String, String, String, String, String] = null
  ): CalendarOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.get.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (onchange != null) __obj.updateDynamic("onchange")(onchange.asInstanceOf[js.Any])
    if (onclose != null) __obj.updateDynamic("onclose")(onclose.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resetButton)) __obj.updateDynamic("resetButton")(resetButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    if (!js.isUndefined(today)) __obj.updateDynamic("today")(today.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays.asInstanceOf[js.Any])
    if (weekdays_short != null) __obj.updateDynamic("weekdays_short")(weekdays_short.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarOptions]
  }
}


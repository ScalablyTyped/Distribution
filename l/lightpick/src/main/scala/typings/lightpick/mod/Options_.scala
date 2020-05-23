package typings.lightpick.mod

import typings.lightpick.mod.Options.DayOfWeek
import typings.lightpick.mod.Options.Dropdowns
import typings.lightpick.mod.Options.Field
import typings.lightpick.mod.Options.Locale
import typings.lightpick.mod.Options.OnCloseFn
import typings.lightpick.mod.Options.OnErrorFn
import typings.lightpick.mod.Options.OnMonthsChangeFn
import typings.lightpick.mod.Options.OnOpenFn
import typings.lightpick.mod.Options.OnSelectFn
import typings.lightpick.mod.Options.OnSelectStartEndFn
import typings.lightpick.mod.Options.OnYearsChangeFn
import typings.lightpick.mod.Options.Orientation
import typings.lightpick.mod.Options.WeekdayStyle
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options_ extends js.Object {
  /**
    * Close calendar when picked date/range.
    */
  var autoclose: js.UndefOr[Boolean] = js.undefined
  var disableDates: js.UndefOr[js.Array[DisabledDate]] = js.undefined
  /**
    * Disable Saturday and Sunday.
    */
  var disableWeekends: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to `false` then will reset selected range when disabled dates exists in selected range.
    */
  var disabledDatesInRange: js.UndefOr[Boolean] = js.undefined
  /**
    * Dropdown selections for years, months. Can be false for disable both dropdowns.
    */
  var dropdowns: js.UndefOr[Boolean | Dropdowns] = js.undefined
  var endDate: js.UndefOr[InputDate] = js.undefined
  /**
    * Bind the datepicker to a form field.
    */
  var field: Field
  /**
    * ISO day of the week.
    */
  var firstDay: js.UndefOr[DayOfWeek] = js.undefined
  /**
    * Footer calendar, if set to `true` will use default footer (Reset/Apply buttons) or custom string (html).
    */
  var footer: js.UndefOr[Boolean | String] = js.undefined
  /**
    * The default output format.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * Close calendar when clicked outside the elements specified in field or parentEl. Recommended use when autoclose is set to false.
    */
  var hideOnBodyClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Show tooltip.
    */
  var hoveringTooltip: js.UndefOr[Boolean] = js.undefined
  /**
    * Show calendar inline. If true and parentEl is not provided then will use parentNode of field.
    */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /**
    * Language code for names of days, months by Date.prototype.toLocaleString(). 'auto' will try detect user browser language.
    */
  var lang: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  /**
    * The maximum/latest date that can be selected.
    */
  var maxDate: js.UndefOr[InputDate] = js.undefined
  /**
    * The maximum days of the selected range.
    */
  var maxDays: js.UndefOr[Double] = js.undefined
  /**
    * The minimum/earliest date that can be selected.
    */
  var minDate: js.UndefOr[InputDate] = js.undefined
  /**
    * The minimum days of the selected range.
    */
  var minDays: js.UndefOr[Double] = js.undefined
  /**
    * Number of columns months.
    */
  var numberOfColumns: js.UndefOr[Double] = js.undefined
  /**
    * Number of visible months.
    */
  var numberOfMonths: js.UndefOr[Double] = js.undefined
  /**
    * Triggered when calendar has been closed.
    */
  var onClose: js.UndefOr[OnCloseFn] = js.undefined
  var onError: js.UndefOr[OnErrorFn] = js.undefined
  /**
    * Triggered when the months select is changed.
    */
  var onMonthsChange: js.UndefOr[OnMonthsChangeFn] = js.undefined
  /**
    * Triggered when calendar has been opened.
    */
  var onOpen: js.UndefOr[OnOpenFn] = js.undefined
  /**
    * Triggered when either date / start date or end date has been changed.
    */
  var onSelect: js.UndefOr[OnSelectFn] = js.undefined
  /**
    * Triggered when end date has been changed.
    */
  var onSelectEnd: js.UndefOr[OnSelectStartEndFn] = js.undefined
  /**
    * Triggered when start date has been changed.
    */
  var onSelectStart: js.UndefOr[OnSelectStartEndFn] = js.undefined
  /**
    * Triggered when the years select is changed.
    */
  var onYearsChange: js.UndefOr[OnYearsChangeFn] = js.undefined
  var orientation: js.UndefOr[Orientation] = js.undefined
  /**
    * Selector of the parent element that the date range picker will be added to, if not provided this will be 'body'.
    */
  var parentEl: js.UndefOr[String | Node] = js.undefined
  /**
    * Repick start/end instead of new range. This option working only when exists `secondField`.
    */
  var repick: js.UndefOr[Boolean] = js.undefined
  /**
    * If exists then end of date range will set here.
    */
  var secondField: js.UndefOr[Field] = js.undefined
  /**
    * Select second date before the first selected date.
    */
  var selectBackward: js.UndefOr[Boolean] = js.undefined
  /**
    * Select second date after the first selected date.
    */
  var selectForward: js.UndefOr[Boolean] = js.undefined
  /**
    * Separator between dates when one field.
    */
  var separator: js.UndefOr[String] = js.undefined
  /**
    * Choose a single date instead of a date range.
    */
  var singleDate: js.UndefOr[Boolean] = js.undefined
  var startDate: js.UndefOr[InputDate] = js.undefined
  /**
    * Calc date range in nights. (For hotels when last date doesn't include to range.)
    */
  var tooltipNights: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines the weekday display style.
    * Two weekdays may have the same narrow style for some locales (e.g. Tuesday's narrow style is also T).
    */
  var weekdayStyle: js.UndefOr[WeekdayStyle] = js.undefined
}

object Options_ {
  @scala.inline
  def apply(
    field: Field,
    autoclose: js.UndefOr[Boolean] = js.undefined,
    disableDates: js.Array[DisabledDate] = null,
    disableWeekends: js.UndefOr[Boolean] = js.undefined,
    disabledDatesInRange: js.UndefOr[Boolean] = js.undefined,
    dropdowns: Boolean | Dropdowns = null,
    endDate: js.UndefOr[Null | InputDate] = js.undefined,
    firstDay: DayOfWeek = null,
    footer: Boolean | String = null,
    format: String = null,
    hideOnBodyClick: js.UndefOr[Boolean] = js.undefined,
    hoveringTooltip: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    lang: String = null,
    locale: Locale = null,
    maxDate: js.UndefOr[Null | InputDate] = js.undefined,
    maxDays: js.UndefOr[Double] = js.undefined,
    minDate: js.UndefOr[Null | InputDate] = js.undefined,
    minDays: js.UndefOr[Double] = js.undefined,
    numberOfColumns: js.UndefOr[Double] = js.undefined,
    numberOfMonths: js.UndefOr[Double] = js.undefined,
    onClose: OnCloseFn = null,
    onError: OnErrorFn = null,
    onMonthsChange: OnMonthsChangeFn = null,
    onOpen: OnOpenFn = null,
    onSelect: OnSelectFn = null,
    onSelectEnd: OnSelectStartEndFn = null,
    onSelectStart: OnSelectStartEndFn = null,
    onYearsChange: OnYearsChangeFn = null,
    orientation: Orientation = null,
    parentEl: String | Node = null,
    repick: js.UndefOr[Boolean] = js.undefined,
    secondField: Field = null,
    selectBackward: js.UndefOr[Boolean] = js.undefined,
    selectForward: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    singleDate: js.UndefOr[Boolean] = js.undefined,
    startDate: js.UndefOr[Null | InputDate] = js.undefined,
    tooltipNights: js.UndefOr[Boolean] = js.undefined,
    weekdayStyle: WeekdayStyle = null
  ): Options_ = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose.get.asInstanceOf[js.Any])
    if (disableDates != null) __obj.updateDynamic("disableDates")(disableDates.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWeekends)) __obj.updateDynamic("disableWeekends")(disableWeekends.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledDatesInRange)) __obj.updateDynamic("disabledDatesInRange")(disabledDatesInRange.get.asInstanceOf[js.Any])
    if (dropdowns != null) __obj.updateDynamic("dropdowns")(dropdowns.asInstanceOf[js.Any])
    if (!js.isUndefined(endDate)) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnBodyClick)) __obj.updateDynamic("hideOnBodyClick")(hideOnBodyClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoveringTooltip)) __obj.updateDynamic("hoveringTooltip")(hoveringTooltip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDate)) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDays)) __obj.updateDynamic("maxDays")(maxDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDate)) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (!js.isUndefined(minDays)) __obj.updateDynamic("minDays")(minDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfColumns)) __obj.updateDynamic("numberOfColumns")(numberOfColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfMonths)) __obj.updateDynamic("numberOfMonths")(numberOfMonths.get.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onMonthsChange != null) __obj.updateDynamic("onMonthsChange")(onMonthsChange.asInstanceOf[js.Any])
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (onSelectEnd != null) __obj.updateDynamic("onSelectEnd")(onSelectEnd.asInstanceOf[js.Any])
    if (onSelectStart != null) __obj.updateDynamic("onSelectStart")(onSelectStart.asInstanceOf[js.Any])
    if (onYearsChange != null) __obj.updateDynamic("onYearsChange")(onYearsChange.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl.asInstanceOf[js.Any])
    if (!js.isUndefined(repick)) __obj.updateDynamic("repick")(repick.get.asInstanceOf[js.Any])
    if (secondField != null) __obj.updateDynamic("secondField")(secondField.asInstanceOf[js.Any])
    if (!js.isUndefined(selectBackward)) __obj.updateDynamic("selectBackward")(selectBackward.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectForward)) __obj.updateDynamic("selectForward")(selectForward.get.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(singleDate)) __obj.updateDynamic("singleDate")(singleDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startDate)) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipNights)) __obj.updateDynamic("tooltipNights")(tooltipNights.get.asInstanceOf[js.Any])
    if (weekdayStyle != null) __obj.updateDynamic("weekdayStyle")(weekdayStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options_]
  }
}


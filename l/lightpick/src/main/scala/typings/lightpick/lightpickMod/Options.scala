package typings.lightpick.lightpickMod

import typings.lightpick.lightpickMod.OptionsNs.DayOfWeek
import typings.lightpick.lightpickMod.OptionsNs.Dropdowns
import typings.lightpick.lightpickMod.OptionsNs.Field
import typings.lightpick.lightpickMod.OptionsNs.Locale
import typings.lightpick.lightpickMod.OptionsNs.OnCloseFn
import typings.lightpick.lightpickMod.OptionsNs.OnErrorFn
import typings.lightpick.lightpickMod.OptionsNs.OnOpenFn
import typings.lightpick.lightpickMod.OptionsNs.OnSelectFn
import typings.lightpick.lightpickMod.OptionsNs.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
    * Triggered when calendar has been opened.
    */
  var onOpen: js.UndefOr[OnOpenFn] = js.undefined
  /**
    * Triggered when either date / start date or end date has been changed.
    */
  var onSelect: js.UndefOr[OnSelectFn] = js.undefined
  var orientation: js.UndefOr[Orientation] = js.undefined
  /**
    * Selector of the parent element that the date range picker will be added to, if not provided this will be 'body'.
    */
  var parentEl: js.UndefOr[String] = js.undefined
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
}

object Options {
  @scala.inline
  def apply(
    field: Field,
    autoclose: js.UndefOr[Boolean] = js.undefined,
    disableDates: js.Array[DisabledDate] = null,
    disableWeekends: js.UndefOr[Boolean] = js.undefined,
    disabledDatesInRange: js.UndefOr[Boolean] = js.undefined,
    dropdowns: Boolean | Dropdowns = null,
    endDate: InputDate = null,
    firstDay: DayOfWeek = null,
    footer: Boolean | String = null,
    format: String = null,
    hideOnBodyClick: js.UndefOr[Boolean] = js.undefined,
    hoveringTooltip: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    lang: String = null,
    locale: Locale = null,
    maxDate: InputDate = null,
    maxDays: Int | Double = null,
    minDate: InputDate = null,
    minDays: Int | Double = null,
    numberOfColumns: Int | Double = null,
    numberOfMonths: Int | Double = null,
    onClose: OnCloseFn = null,
    onError: OnErrorFn = null,
    onOpen: OnOpenFn = null,
    onSelect: OnSelectFn = null,
    orientation: Orientation = null,
    parentEl: String = null,
    repick: js.UndefOr[Boolean] = js.undefined,
    secondField: Field = null,
    selectBackward: js.UndefOr[Boolean] = js.undefined,
    selectForward: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    singleDate: js.UndefOr[Boolean] = js.undefined,
    startDate: InputDate = null,
    tooltipNights: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(field = field)
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose)
    if (disableDates != null) __obj.updateDynamic("disableDates")(disableDates)
    if (!js.isUndefined(disableWeekends)) __obj.updateDynamic("disableWeekends")(disableWeekends)
    if (!js.isUndefined(disabledDatesInRange)) __obj.updateDynamic("disabledDatesInRange")(disabledDatesInRange)
    if (dropdowns != null) __obj.updateDynamic("dropdowns")(dropdowns.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay)
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(hideOnBodyClick)) __obj.updateDynamic("hideOnBodyClick")(hideOnBodyClick)
    if (!js.isUndefined(hoveringTooltip)) __obj.updateDynamic("hoveringTooltip")(hoveringTooltip)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxDays != null) __obj.updateDynamic("maxDays")(maxDays.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minDays != null) __obj.updateDynamic("minDays")(minDays.asInstanceOf[js.Any])
    if (numberOfColumns != null) __obj.updateDynamic("numberOfColumns")(numberOfColumns.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl)
    if (!js.isUndefined(repick)) __obj.updateDynamic("repick")(repick)
    if (secondField != null) __obj.updateDynamic("secondField")(secondField)
    if (!js.isUndefined(selectBackward)) __obj.updateDynamic("selectBackward")(selectBackward)
    if (!js.isUndefined(selectForward)) __obj.updateDynamic("selectForward")(selectForward)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(singleDate)) __obj.updateDynamic("singleDate")(singleDate)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipNights)) __obj.updateDynamic("tooltipNights")(tooltipNights)
    __obj.asInstanceOf[Options]
  }
}


package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatepickerOptions extends js.Object {
  /**
    * Automatically close picker when date is selected
    * @default false
    */
  var autoClose: scala.Boolean
  /**
    * Specify a DOM element to render the calendar in, by default it will be placed before the input
    * @default null
    */
  var container: stdLib.Element
  /**
    * The initial date to view when first opened.
    */
  var defaultDate: stdLib.Date
  /**
    * Prevent selection of any date on the weekend.
    * @default false
    */
  var disableWeekends: scala.Boolean
  /**
    * An array of string returned by `Date.toDateString()`, indicating there are events in the specified days.
    * @default []
    */
  var events: js.Array[java.lang.String]
  /**
    * First day of week (0: Sunday, 1: Monday etc).
    * @default 0
    */
  var firstDay: scala.Double
  /**
    * The date output format for the input field value.
    * @default 'mmm dd, yyyy'
    */
  var format: java.lang.String
  /**
    * Internationalization options
    */
  var i18n: stdLib.Partial[InternationalizationOptions]
  /**
    * Changes Datepicker to RTL.
    * @default false
    */
  var isRTL: scala.Boolean
  /**
    * The latest date that can be selected.
    */
  var maxDate: stdLib.Date
  /**
    * The earliest date that can be selected.
    */
  var minDate: stdLib.Date
  /**
    * Make the `defaultDate` the initial selected value
    * @default false
    */
  var setDefaultDate: scala.Boolean
  /**
    * Show the clear button in the datepicker
    * @default false
    */
  var showClearBtn: scala.Boolean
  /**
    * Render days of the calendar grid that fall in the next or previous month.
    * @default false
    */
  var showDaysInNextAndPreviousMonths: scala.Boolean
  /**
    * Show month after year in Datepicker title.
    * @default false
    */
  var showMonthAfterYear: scala.Boolean
  /**
    * Number of years either side, or array of upper/lower range.
    * @default 10
    */
  var yearRange: scala.Double | js.Array[scala.Double]
  /**
    * Custom function to disable certain days.
    */
  def disableDayFn(day: stdLib.Date): scala.Boolean
  /**
    * Callback function when Datepicker is closed
    */
  def onClose(`this`: Datepicker): scala.Unit
  /**
    * Callback function when Datepicker HTML is refreshed
    */
  def onDraw(`this`: Datepicker): scala.Unit
  /**
    * Callback function when Datepicker is opened
    */
  def onOpen(`this`: Datepicker): scala.Unit
  /**
    * Callback function when date is selected, first parameter is the newly selected date.
    */
  def onSelect(`this`: Datepicker, selectedDate: stdLib.Date): scala.Unit
  /**
    * Used to create date object from current input string.
    */
  def parse(value: java.lang.String, format: java.lang.String): stdLib.Date
}

object DatepickerOptions {
  @scala.inline
  def apply(
    autoClose: scala.Boolean,
    container: stdLib.Element,
    defaultDate: stdLib.Date,
    disableDayFn: stdLib.Date => scala.Boolean,
    disableWeekends: scala.Boolean,
    events: js.Array[java.lang.String],
    firstDay: scala.Double,
    format: java.lang.String,
    i18n: stdLib.Partial[InternationalizationOptions],
    isRTL: scala.Boolean,
    maxDate: stdLib.Date,
    minDate: stdLib.Date,
    onClose: Datepicker => scala.Unit,
    onDraw: Datepicker => scala.Unit,
    onOpen: Datepicker => scala.Unit,
    onSelect: (Datepicker, stdLib.Date) => scala.Unit,
    parse: (java.lang.String, java.lang.String) => stdLib.Date,
    setDefaultDate: scala.Boolean,
    showClearBtn: scala.Boolean,
    showDaysInNextAndPreviousMonths: scala.Boolean,
    showMonthAfterYear: scala.Boolean,
    yearRange: scala.Double | js.Array[scala.Double]
  ): DatepickerOptions = {
    val __obj = js.Dynamic.literal(autoClose = autoClose, container = container, defaultDate = defaultDate, disableDayFn = js.Any.fromFunction1(disableDayFn), disableWeekends = disableWeekends, events = events, firstDay = firstDay, format = format, i18n = i18n, isRTL = isRTL, maxDate = maxDate, minDate = minDate, onClose = js.Any.fromFunction1(onClose), onDraw = js.Any.fromFunction1(onDraw), onOpen = js.Any.fromFunction1(onOpen), onSelect = js.Any.fromFunction2(onSelect), parse = js.Any.fromFunction2(parse), setDefaultDate = setDefaultDate, showClearBtn = showClearBtn, showDaysInNextAndPreviousMonths = showDaysInNextAndPreviousMonths, showMonthAfterYear = showMonthAfterYear, yearRange = yearRange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatepickerOptions]
  }
}


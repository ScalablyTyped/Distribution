package typings.materializeCss.M

import typings.std.Date
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatepickerOptions extends js.Object {
  /**
    * Automatically close picker when date is selected
    * @default false
    */
  var autoClose: Boolean
  /**
    * Specify a DOM element to render the calendar in, by default it will be placed before the input
    * @default null
    */
  var container: Element
  /**
    * The initial date to view when first opened.
    */
  var defaultDate: Date
  /**
    * Prevent selection of any date on the weekend.
    * @default false
    */
  var disableWeekends: Boolean
  /**
    * An array of string returned by `Date.toDateString()`, indicating there are events in the specified days.
    * @default []
    */
  var events: js.Array[String]
  /**
    * First day of week (0: Sunday, 1: Monday etc).
    * @default 0
    */
  var firstDay: Double
  /**
    * The date output format for the input field value.
    * @default 'mmm dd, yyyy'
    */
  var format: String
  /**
    * Internationalization options
    */
  var i18n: Partial[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
  ]
  /**
    * Changes Datepicker to RTL.
    * @default false
    */
  var isRTL: Boolean
  /**
    * The latest date that can be selected.
    */
  var maxDate: Date
  /**
    * The earliest date that can be selected.
    */
  var minDate: Date
  /**
    * Make the `defaultDate` the initial selected value
    * @default false
    */
  var setDefaultDate: Boolean
  /**
    * Show the clear button in the datepicker
    * @default false
    */
  var showClearBtn: Boolean
  /**
    * Render days of the calendar grid that fall in the next or previous month.
    * @default false
    */
  var showDaysInNextAndPreviousMonths: Boolean
  /**
    * Show month after year in Datepicker title.
    * @default false
    */
  var showMonthAfterYear: Boolean
  /**
    * Number of years either side, or array of upper/lower range.
    * @default 10
    */
  var yearRange: Double | js.Array[Double]
  /**
    * Custom function to disable certain days.
    */
  def disableDayFn(day: Date): Boolean
  /**
    * Callback function when Datepicker is closed
    */
  def onClose(): Unit
  /**
    * Callback function when Datepicker HTML is refreshed
    */
  def onDraw(): Unit
  /**
    * Callback function when Datepicker is opened
    */
  def onOpen(): Unit
  /**
    * Callback function when date is selected, first parameter is the newly selected date.
    */
  def onSelect(selectedDate: Date): Unit
  /**
    * Used to create date object from current input string.
    */
  def parse(value: String, format: String): Date
}

object DatepickerOptions {
  @scala.inline
  def apply(
    autoClose: Boolean,
    container: Element,
    defaultDate: Date,
    disableDayFn: Date => Boolean,
    disableWeekends: Boolean,
    events: js.Array[String],
    firstDay: Double,
    format: String,
    i18n: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
    ],
    isRTL: Boolean,
    maxDate: Date,
    minDate: Date,
    onClose: () => Unit,
    onDraw: () => Unit,
    onOpen: () => Unit,
    onSelect: Date => Unit,
    parse: (String, String) => Date,
    setDefaultDate: Boolean,
    showClearBtn: Boolean,
    showDaysInNextAndPreviousMonths: Boolean,
    showMonthAfterYear: Boolean,
    yearRange: Double | js.Array[Double]
  ): DatepickerOptions = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], defaultDate = defaultDate.asInstanceOf[js.Any], disableDayFn = js.Any.fromFunction1(disableDayFn), disableWeekends = disableWeekends.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onDraw = js.Any.fromFunction0(onDraw), onOpen = js.Any.fromFunction0(onOpen), onSelect = js.Any.fromFunction1(onSelect), parse = js.Any.fromFunction2(parse), setDefaultDate = setDefaultDate.asInstanceOf[js.Any], showClearBtn = showClearBtn.asInstanceOf[js.Any], showDaysInNextAndPreviousMonths = showDaysInNextAndPreviousMonths.asInstanceOf[js.Any], showMonthAfterYear = showMonthAfterYear.asInstanceOf[js.Any], yearRange = yearRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatepickerOptions]
  }
}


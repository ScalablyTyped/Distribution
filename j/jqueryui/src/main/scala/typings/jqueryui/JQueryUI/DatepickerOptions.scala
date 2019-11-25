package typings.jqueryui.JQueryUI

import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Datepicker //////////////////////////////////////////////////
trait DatepickerOptions extends js.Object {
  /**
    * An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of the date within this field. Leave as blank for no alternate field.
    */
  var altField: js.UndefOr[js.Any] = js.undefined
   // Selector, jQuery or Element
  /**
    * The dateFormat to be used for the altField option. This allows one date format to be shown to the user for selection purposes, while a different format is actually sent behind the scenes. For a full list of the possible formats see the formatDate function
    */
  var altFormat: js.UndefOr[String] = js.undefined
  /**
    * The text to display after each date field, e.g., to show the required format.
    */
  var appendText: js.UndefOr[String] = js.undefined
  /**
    * Set to true to automatically resize the input field to accommodate dates in the current dateFormat.
    */
  var autoSize: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to automatically hide the datepicker.
    */
  var autohide: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that takes an input field and current datepicker instance and returns an options object to update the datepicker with. It is called just before the datepicker is displayed.
    */
  var beforeShow: js.UndefOr[js.Function2[/* input */ Element, /* inst */ js.Any, DatepickerOptions]] = js.undefined
  /**
    * A function that takes a date as a parameter and must return an array with:
    * [0]: true/false indicating whether or not this date is selectable
    * [1]: a CSS class name to add to the date's cell or "" for the default presentation
    * [2]: an optional popup tooltip for this date
    * The function is called for each day in the datepicker before it is displayed.
    */
  var beforeShowDay: js.UndefOr[js.Function1[/* date */ Date, js.Array[_]]] = js.undefined
  /**
    * A URL of an image to use to display the datepicker when the showOn option is set to "button" or "both". If set, the buttonText option becomes the alt value and is not directly displayed.
    */
  var buttonImage: js.UndefOr[String] = js.undefined
  /**
    * Whether the button image should be rendered by itself instead of inside a button element. This option is only relevant if the buttonImage option has also been set.
    */
  var buttonImageOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The text to display on the trigger button. Use in conjunction with the showOn option set to "button" or "both".
    */
  var buttonText: js.UndefOr[String] = js.undefined
  /**
    * A function to calculate the week of the year for a given date. The default implementation uses the ISO 8601 definition: weeks start on a Monday; the first week of the year contains the first Thursday of the year.
    */
  var calculateWeek: js.UndefOr[js.Function1[/* date */ Date, String]] = js.undefined
  /**
    * Whether the month should be rendered as a dropdown instead of text.
    */
  var changeMonth: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the year should be rendered as a dropdown instead of text. Use the yearRange option to control which years are made available for selection.
    */
  var changeYear: js.UndefOr[Boolean] = js.undefined
  /**
    * The text to display for the close link. Use the showButtonPanel option to display this button.
    */
  var closeText: js.UndefOr[String] = js.undefined
  /**
    * When true, entry in the input field is constrained to those characters allowed by the current dateFormat option.
    */
  var constrainInput: js.UndefOr[Boolean] = js.undefined
  /**
    * The text to display for the current day link. Use the showButtonPanel option to display this button.
    */
  var currentText: js.UndefOr[String] = js.undefined
  /**
    * The format for parsed and displayed dates. For a full list of the possible formats see the formatDate function.
    */
  var dateFormat: js.UndefOr[String] = js.undefined
  /**
    * The list of long day names, starting from Sunday, for use as requested via the dateFormat option.
    */
  var dayNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The list of minimised day names, starting from Sunday, for use as column headers within the datepicker.
    */
  var dayNamesMin: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The list of abbreviated day names, starting from Sunday, for use as requested via the dateFormat option.
    */
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Set the date to highlight on first opening if the field is blank. Specify either an actual date via a Date object or as a string in the current dateFormat, or a number of days from today (e.g. +7) or a string of values and periods ('y' for years, 'm' for months, 'w' for weeks, 'd' for days, e.g. '+1m +7d'), or null for today.
    * Multiple types supported:
    * Date: A date object containing the default date.
    * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
    * String: A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
    */
  var defaultDate: js.UndefOr[js.Any] = js.undefined
   // Date, number or string
  /**
    * Control the speed at which the datepicker appears, it may be a time in milliseconds or a string representing one of the three predefined speeds ("slow", "normal", "fast").
    */
  var duration: js.UndefOr[String] = js.undefined
  /**
    	    * Set to date to automatically enddate the datepicker.
    	    */
  var endDate: js.UndefOr[Date] = js.undefined
  /**
    * Set the first day of the week: Sunday is 0, Monday is 1, etc.
    */
  var firstDay: js.UndefOr[Double] = js.undefined
  /**
    * When true, the current day link moves to the currently selected date instead of today.
    */
  var gotoCurrent: js.UndefOr[Boolean] = js.undefined
  /**
    * Normally the previous and next links are disabled when not applicable (see the minDate and maxDate options). You can hide them altogether by setting this attribute to true.
    */
  var hideIfNoPrevNext: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the current language is drawn from right to left.
    */
  var isRTL: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum selectable date. When set to null, there is no maximum.
    * Multiple types supported:
    * Date: A date object containing the maximum date.
    * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
    * String: A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
    */
  var maxDate: js.UndefOr[js.Any] = js.undefined
   // Date, number or string
  /**
    * The minimum selectable date. When set to null, there is no minimum.
    * Multiple types supported:
    * Date: A date object containing the minimum date.
    * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
    * String: A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
    */
  var minDate: js.UndefOr[js.Any] = js.undefined
   // Date, number or string
  /**
    * The list of full month names, for use as requested via the dateFormat option.
    */
  var monthNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The list of abbreviated month names, as used in the month header on each datepicker and as requested via the dateFormat option.
    */
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Whether the prevText and nextText options should be parsed as dates by the formatDate function, allowing them to display the target month names for example.
    */
  var navigationAsDateFormat: js.UndefOr[Boolean] = js.undefined
  /**
    * The text to display for the next month link. With the standard ThemeRoller styling, this value is replaced by an icon.
    */
  var nextText: js.UndefOr[String] = js.undefined
  /**
    * The number of months to show at once.
    * Multiple types supported:
    * Number: The number of months to display in a single row.
    * Array: An array defining the number of rows and columns to display.
    */
  var numberOfMonths: js.UndefOr[js.Any] = js.undefined
   // number or number[]
  /**
    * Called when the datepicker moves to a new month and/or year. The function receives the selected year, month (1-12), and the datepicker instance as parameters. this refers to the associated input field.
    */
  var onChangeMonthYear: js.UndefOr[js.Function3[/* year */ Double, /* month */ Double, /* inst */ js.Any, Unit]] = js.undefined
  /**
    * Called when the datepicker is closed, whether or not a date is selected. The function receives the selected date as text ("" if none) and the datepicker instance as parameters. this refers to the associated input field.
    */
  var onClose: js.UndefOr[js.Function2[/* dateText */ String, /* inst */ js.Any, Unit]] = js.undefined
  /**
    * Called when the datepicker is selected. The function receives the selected date as text and the datepicker instance as parameters. this refers to the associated input field.
    */
  var onSelect: js.UndefOr[js.Function2[/* dateText */ String, /* inst */ js.Any, Unit]] = js.undefined
  /**
    * The text to display for the previous month link. With the standard ThemeRoller styling, this value is replaced by an icon.
    */
  var prevText: js.UndefOr[String] = js.undefined
  /**
    * Whether days in other months shown before or after the current month are selectable. This only applies if the showOtherMonths option is set to true.
    */
  var selectOtherMonths: js.UndefOr[Boolean] = js.undefined
  /**
    * The cutoff year for determining the century for a date (used in conjunction with dateFormat 'y'). Any dates entered with a year value less than or equal to the cutoff year are considered to be in the current century, while those greater than it are deemed to be in the previous century.
    * Multiple types supported:
    * Number: A value between 0 and 99 indicating the cutoff year.
    * String: A relative number of years from the current year, e.g., "+3" or "-5".
    */
  var shortYearCutoff: js.UndefOr[js.Any] = js.undefined
   // number or string
  /**
    * The name of the animation used to show and hide the datepicker. Use "show" (the default), "slideDown", "fadeIn", any of the jQuery UI effects. Set to an empty string to disable animation.
    */
  var showAnim: js.UndefOr[String] = js.undefined
  /**
    * Whether to display a button pane underneath the calendar. The button pane contains two buttons, a Today button that links to the current day, and a Done button that closes the datepicker. The buttons' text can be customized using the currentText and closeText options respectively.
    */
  var showButtonPanel: js.UndefOr[Boolean] = js.undefined
  /**
    * When displaying multiple months via the numberOfMonths option, the showCurrentAtPos option defines which position to display the current month in.
    */
  var showCurrentAtPos: js.UndefOr[Double] = js.undefined
  /**
    * Whether to show the month after the year in the header.
    */
  var showMonthAfterYear: js.UndefOr[Boolean] = js.undefined
  /**
    * When the datepicker should appear. The datepicker can appear when the field receives focus ("focus"), when a button is clicked ("button"), or when either event occurs ("both").
    */
  var showOn: js.UndefOr[String] = js.undefined
  /**
    * If using one of the jQuery UI effects for the showAnim option, you can provide additional settings for that animation via this option.
    */
  var showOptions: js.UndefOr[js.Any] = js.undefined
   // TODO
  /**
    * Whether to display dates in other months (non-selectable) at the start or end of the current month. To make these days selectable use the selectOtherMonths option.
    */
  var showOtherMonths: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, a column is added to show the week of the year. The calculateWeek option determines how the week of the year is calculated. You may also want to change the firstDay option.
    */
  var showWeek: js.UndefOr[Boolean] = js.undefined
  /**
    * Set how many months to move when clicking the previous/next links.
    */
  var stepMonths: js.UndefOr[Double] = js.undefined
  /**
    * The text to display for the week of the year column heading. Use the showWeek option to display this column.
    */
  var weekHeader: js.UndefOr[String] = js.undefined
  /**
    * The range of years displayed in the year drop-down: either relative to today's year ("-nn:+nn"), relative to the currently selected year ("c-nn:c+nn"), absolute ("nnnn:nnnn"), or combinations of these formats ("nnnn:-nn"). Note that this option only affects what appears in the drop-down, to restrict which dates may be selected use the minDate and/or maxDate options.
    */
  var yearRange: js.UndefOr[String] = js.undefined
  /**
    * Additional text to display after the year in the month headers.
    */
  var yearSuffix: js.UndefOr[String] = js.undefined
}

object DatepickerOptions {
  @scala.inline
  def apply(
    altField: js.Any = null,
    altFormat: String = null,
    appendText: String = null,
    autoSize: js.UndefOr[Boolean] = js.undefined,
    autohide: js.UndefOr[Boolean] = js.undefined,
    beforeShow: (/* input */ Element, /* inst */ js.Any) => DatepickerOptions = null,
    beforeShowDay: /* date */ Date => js.Array[_] = null,
    buttonImage: String = null,
    buttonImageOnly: js.UndefOr[Boolean] = js.undefined,
    buttonText: String = null,
    calculateWeek: /* date */ Date => String = null,
    changeMonth: js.UndefOr[Boolean] = js.undefined,
    changeYear: js.UndefOr[Boolean] = js.undefined,
    closeText: String = null,
    constrainInput: js.UndefOr[Boolean] = js.undefined,
    currentText: String = null,
    dateFormat: String = null,
    dayNames: js.Array[String] = null,
    dayNamesMin: js.Array[String] = null,
    dayNamesShort: js.Array[String] = null,
    defaultDate: js.Any = null,
    duration: String = null,
    endDate: Date = null,
    firstDay: Int | Double = null,
    gotoCurrent: js.UndefOr[Boolean] = js.undefined,
    hideIfNoPrevNext: js.UndefOr[Boolean] = js.undefined,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    maxDate: js.Any = null,
    minDate: js.Any = null,
    monthNames: js.Array[String] = null,
    monthNamesShort: js.Array[String] = null,
    navigationAsDateFormat: js.UndefOr[Boolean] = js.undefined,
    nextText: String = null,
    numberOfMonths: js.Any = null,
    onChangeMonthYear: (/* year */ Double, /* month */ Double, /* inst */ js.Any) => Unit = null,
    onClose: (/* dateText */ String, /* inst */ js.Any) => Unit = null,
    onSelect: (/* dateText */ String, /* inst */ js.Any) => Unit = null,
    prevText: String = null,
    selectOtherMonths: js.UndefOr[Boolean] = js.undefined,
    shortYearCutoff: js.Any = null,
    showAnim: String = null,
    showButtonPanel: js.UndefOr[Boolean] = js.undefined,
    showCurrentAtPos: Int | Double = null,
    showMonthAfterYear: js.UndefOr[Boolean] = js.undefined,
    showOn: String = null,
    showOptions: js.Any = null,
    showOtherMonths: js.UndefOr[Boolean] = js.undefined,
    showWeek: js.UndefOr[Boolean] = js.undefined,
    stepMonths: Int | Double = null,
    weekHeader: String = null,
    yearRange: String = null,
    yearSuffix: String = null
  ): DatepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (altField != null) __obj.updateDynamic("altField")(altField.asInstanceOf[js.Any])
    if (altFormat != null) __obj.updateDynamic("altFormat")(altFormat.asInstanceOf[js.Any])
    if (appendText != null) __obj.updateDynamic("appendText")(appendText.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide.asInstanceOf[js.Any])
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(js.Any.fromFunction2(beforeShow))
    if (beforeShowDay != null) __obj.updateDynamic("beforeShowDay")(js.Any.fromFunction1(beforeShowDay))
    if (buttonImage != null) __obj.updateDynamic("buttonImage")(buttonImage.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonImageOnly)) __obj.updateDynamic("buttonImageOnly")(buttonImageOnly.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (calculateWeek != null) __obj.updateDynamic("calculateWeek")(js.Any.fromFunction1(calculateWeek))
    if (!js.isUndefined(changeMonth)) __obj.updateDynamic("changeMonth")(changeMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(changeYear)) __obj.updateDynamic("changeYear")(changeYear.asInstanceOf[js.Any])
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainInput)) __obj.updateDynamic("constrainInput")(constrainInput.asInstanceOf[js.Any])
    if (currentText != null) __obj.updateDynamic("currentText")(currentText.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames.asInstanceOf[js.Any])
    if (dayNamesMin != null) __obj.updateDynamic("dayNamesMin")(dayNamesMin.asInstanceOf[js.Any])
    if (dayNamesShort != null) __obj.updateDynamic("dayNamesShort")(dayNamesShort.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (!js.isUndefined(gotoCurrent)) __obj.updateDynamic("gotoCurrent")(gotoCurrent.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIfNoPrevNext)) __obj.updateDynamic("hideIfNoPrevNext")(hideIfNoPrevNext.asInstanceOf[js.Any])
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (monthNamesShort != null) __obj.updateDynamic("monthNamesShort")(monthNamesShort.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationAsDateFormat)) __obj.updateDynamic("navigationAsDateFormat")(navigationAsDateFormat.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onChangeMonthYear != null) __obj.updateDynamic("onChangeMonthYear")(js.Any.fromFunction3(onChangeMonthYear))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOtherMonths)) __obj.updateDynamic("selectOtherMonths")(selectOtherMonths.asInstanceOf[js.Any])
    if (shortYearCutoff != null) __obj.updateDynamic("shortYearCutoff")(shortYearCutoff.asInstanceOf[js.Any])
    if (showAnim != null) __obj.updateDynamic("showAnim")(showAnim.asInstanceOf[js.Any])
    if (!js.isUndefined(showButtonPanel)) __obj.updateDynamic("showButtonPanel")(showButtonPanel.asInstanceOf[js.Any])
    if (showCurrentAtPos != null) __obj.updateDynamic("showCurrentAtPos")(showCurrentAtPos.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthAfterYear)) __obj.updateDynamic("showMonthAfterYear")(showMonthAfterYear.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(showOn.asInstanceOf[js.Any])
    if (showOptions != null) __obj.updateDynamic("showOptions")(showOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showOtherMonths)) __obj.updateDynamic("showOtherMonths")(showOtherMonths.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeek)) __obj.updateDynamic("showWeek")(showWeek.asInstanceOf[js.Any])
    if (stepMonths != null) __obj.updateDynamic("stepMonths")(stepMonths.asInstanceOf[js.Any])
    if (weekHeader != null) __obj.updateDynamic("weekHeader")(weekHeader.asInstanceOf[js.Any])
    if (yearRange != null) __obj.updateDynamic("yearRange")(yearRange.asInstanceOf[js.Any])
    if (yearSuffix != null) __obj.updateDynamic("yearSuffix")(yearSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatepickerOptions]
  }
}


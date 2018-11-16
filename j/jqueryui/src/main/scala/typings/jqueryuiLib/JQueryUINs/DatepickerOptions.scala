package typings
package jqueryuiLib.JQueryUINs

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
  var altFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The text to display after each date field, e.g., to show the required format.
           */
  var appendText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Set to true to automatically resize the input field to accommodate dates in the current dateFormat.
           */
  var autoSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Set to true to automatically hide the datepicker.
           */
  var autohide: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * A function that takes an input field and current datepicker instance and returns an options object to update the datepicker with. It is called just before the datepicker is displayed.
           */
  var beforeShow: js.UndefOr[js.Function2[/* input */ stdLib.Element, /* inst */ js.Any, DatepickerOptions]] = js.undefined
  /**
           * A function that takes a date as a parameter and must return an array with:
           * [0]: true/false indicating whether or not this date is selectable
           * [1]: a CSS class name to add to the date's cell or "" for the default presentation
           * [2]: an optional popup tooltip for this date
           * The function is called for each day in the datepicker before it is displayed.
           */
  var beforeShowDay: js.UndefOr[js.Function1[/* date */ stdLib.Date, js.Array[_]]] = js.undefined
  /**
           * A URL of an image to use to display the datepicker when the showOn option is set to "button" or "both". If set, the buttonText option becomes the alt value and is not directly displayed.
           */
  var buttonImage: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Whether the button image should be rendered by itself instead of inside a button element. This option is only relevant if the buttonImage option has also been set.
           */
  var buttonImageOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The text to display on the trigger button. Use in conjunction with the showOn option set to "button" or "both".
           */
  var buttonText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A function to calculate the week of the year for a given date. The default implementation uses the ISO 8601 definition: weeks start on a Monday; the first week of the year contains the first Thursday of the year.
           */
  var calculateWeek: js.UndefOr[js.Function1[/* date */ stdLib.Date, java.lang.String]] = js.undefined
  /**
           * Whether the month should be rendered as a dropdown instead of text.
           */
  var changeMonth: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether the year should be rendered as a dropdown instead of text. Use the yearRange option to control which years are made available for selection.
           */
  var changeYear: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The text to display for the close link. Use the showButtonPanel option to display this button.
           */
  var closeText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * When true, entry in the input field is constrained to those characters allowed by the current dateFormat option.
           */
  var constrainInput: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The text to display for the current day link. Use the showButtonPanel option to display this button.
           */
  var currentText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The format for parsed and displayed dates. For a full list of the possible formats see the formatDate function.
           */
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The list of long day names, starting from Sunday, for use as requested via the dateFormat option.
           */
  var dayNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * The list of minimised day names, starting from Sunday, for use as column headers within the datepicker.
           */
  var dayNamesMin: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * The list of abbreviated day names, starting from Sunday, for use as requested via the dateFormat option.
           */
  var dayNamesShort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
  var duration: js.UndefOr[java.lang.String] = js.undefined
  /**
    	    * Set to date to automatically enddate the datepicker.
    	    */
  var endDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
           * Set the first day of the week: Sunday is 0, Monday is 1, etc.
           */
  var firstDay: js.UndefOr[scala.Double] = js.undefined
  /**
           * When true, the current day link moves to the currently selected date instead of today.
           */
  var gotoCurrent: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Normally the previous and next links are disabled when not applicable (see the minDate and maxDate options). You can hide them altogether by setting this attribute to true.
           */
  var hideIfNoPrevNext: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether the current language is drawn from right to left.
           */
  var isRTL: js.UndefOr[scala.Boolean] = js.undefined
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
  var monthNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * The list of abbreviated month names, as used in the month header on each datepicker and as requested via the dateFormat option.
           */
  var monthNamesShort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Whether the prevText and nextText options should be parsed as dates by the formatDate function, allowing them to display the target month names for example.
           */
  var navigationAsDateFormat: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The text to display for the next month link. With the standard ThemeRoller styling, this value is replaced by an icon.
           */
  var nextText: js.UndefOr[java.lang.String] = js.undefined
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
  var onChangeMonthYear: js.UndefOr[
    js.Function3[/* year */ scala.Double, /* month */ scala.Double, /* inst */ js.Any, scala.Unit]
  ] = js.undefined
  /**
           * Called when the datepicker is closed, whether or not a date is selected. The function receives the selected date as text ("" if none) and the datepicker instance as parameters. this refers to the associated input field.
           */
  var onClose: js.UndefOr[js.Function2[/* dateText */ java.lang.String, /* inst */ js.Any, scala.Unit]] = js.undefined
  /**
           * Called when the datepicker is selected. The function receives the selected date as text and the datepicker instance as parameters. this refers to the associated input field.
           */
  var onSelect: js.UndefOr[js.Function2[/* dateText */ java.lang.String, /* inst */ js.Any, scala.Unit]] = js.undefined
  /**
           * The text to display for the previous month link. With the standard ThemeRoller styling, this value is replaced by an icon.
           */
  var prevText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Whether days in other months shown before or after the current month are selectable. This only applies if the showOtherMonths option is set to true.
           */
  var selectOtherMonths: js.UndefOr[scala.Boolean] = js.undefined
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
  var showAnim: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Whether to display a button pane underneath the calendar. The button pane contains two buttons, a Today button that links to the current day, and a Done button that closes the datepicker. The buttons' text can be customized using the currentText and closeText options respectively.
           */
  var showButtonPanel: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When displaying multiple months via the numberOfMonths option, the showCurrentAtPos option defines which position to display the current month in.
           */
  var showCurrentAtPos: js.UndefOr[scala.Double] = js.undefined
  /**
           * Whether to show the month after the year in the header.
           */
  var showMonthAfterYear: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When the datepicker should appear. The datepicker can appear when the field receives focus ("focus"), when a button is clicked ("button"), or when either event occurs ("both").
           */
  var showOn: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If using one of the jQuery UI effects for the showAnim option, you can provide additional settings for that animation via this option.
           */
  var showOptions: js.UndefOr[js.Any] = js.undefined
   // TODO
  /**
           * Whether to display dates in other months (non-selectable) at the start or end of the current month. To make these days selectable use the selectOtherMonths option.
           */
  var showOtherMonths: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When true, a column is added to show the week of the year. The calculateWeek option determines how the week of the year is calculated. You may also want to change the firstDay option.
           */
  var showWeek: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Set how many months to move when clicking the previous/next links.
           */
  var stepMonths: js.UndefOr[scala.Double] = js.undefined
  /**
           * The text to display for the week of the year column heading. Use the showWeek option to display this column.
           */
  var weekHeader: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The range of years displayed in the year drop-down: either relative to today's year ("-nn:+nn"), relative to the currently selected year ("c-nn:c+nn"), absolute ("nnnn:nnnn"), or combinations of these formats ("nnnn:-nn"). Note that this option only affects what appears in the drop-down, to restrict which dates may be selected use the minDate and/or maxDate options.
           */
  var yearRange: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Additional text to display after the year in the month headers.
           */
  var yearSuffix: js.UndefOr[java.lang.String] = js.undefined
}


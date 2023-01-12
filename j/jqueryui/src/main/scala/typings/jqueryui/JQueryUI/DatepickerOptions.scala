package typings.jqueryui.JQueryUI

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Datepicker //////////////////////////////////////////////////
trait DatepickerOptions extends StObject {
  
  /**
    * An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of the date within this field. Leave as blank for no alternate field.
    */
  var altField: js.UndefOr[Any] = js.undefined
  
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
  var beforeShow: js.UndefOr[js.Function2[/* input */ Element, /* inst */ Any, this.type]] = js.undefined
  
  /**
    * A function that takes a date as a parameter and must return an array with:
    * [0]: true/false indicating whether or not this date is selectable
    * [1]: a CSS class name to add to the date's cell or "" for the default presentation
    * [2]: an optional popup tooltip for this date
    * The function is called for each day in the datepicker before it is displayed.
    */
  var beforeShowDay: js.UndefOr[js.Function1[/* date */ js.Date, js.Array[Any]]] = js.undefined
  
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
  var calculateWeek: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.undefined
  
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
  var defaultDate: js.UndefOr[Any] = js.undefined
  
  // Date, number or string
  /**
    * Control the speed at which the datepicker appears, it may be a time in milliseconds or a string representing one of the three predefined speeds ("slow", "normal", "fast").
    */
  var duration: js.UndefOr[String] = js.undefined
  
  /**
    * Set to date to automatically enddate the datepicker.
    */
  var endDate: js.UndefOr[js.Date] = js.undefined
  
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
  var maxDate: js.UndefOr[Any] = js.undefined
  
  // Date, number or string
  /**
    * The minimum selectable date. When set to null, there is no minimum.
    * Multiple types supported:
    * Date: A date object containing the minimum date.
    * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
    * String: A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
    */
  var minDate: js.UndefOr[Any] = js.undefined
  
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
  var numberOfMonths: js.UndefOr[Any] = js.undefined
  
  // number or number[]
  /**
    * Called when the datepicker moves to a new month and/or year. The function receives the selected year, month (1-12), and the datepicker instance as parameters. this refers to the associated input field.
    */
  var onChangeMonthYear: js.UndefOr[js.Function3[/* year */ Double, /* month */ Double, /* inst */ Any, Unit]] = js.undefined
  
  /**
    * Called when the datepicker is closed, whether or not a date is selected. The function receives the selected date as text ("" if none) and the datepicker instance as parameters. this refers to the associated input field.
    */
  var onClose: js.UndefOr[js.Function2[/* dateText */ String, /* inst */ Any, Unit]] = js.undefined
  
  /**
    * Called when the datepicker is selected. The function receives the selected date as text and the datepicker instance as parameters. this refers to the associated input field.
    */
  var onSelect: js.UndefOr[js.Function2[/* dateText */ String, /* inst */ Any, Unit]] = js.undefined
  
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
  var shortYearCutoff: js.UndefOr[Any] = js.undefined
  
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
  var showOptions: js.UndefOr[Any] = js.undefined
  
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
  
  inline def apply(): DatepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatepickerOptions] (val x: Self) extends AnyVal {
    
    inline def setAltField(value: Any): Self = StObject.set(x, "altField", value.asInstanceOf[js.Any])
    
    inline def setAltFieldUndefined: Self = StObject.set(x, "altField", js.undefined)
    
    inline def setAltFormat(value: String): Self = StObject.set(x, "altFormat", value.asInstanceOf[js.Any])
    
    inline def setAltFormatUndefined: Self = StObject.set(x, "altFormat", js.undefined)
    
    inline def setAppendText(value: String): Self = StObject.set(x, "appendText", value.asInstanceOf[js.Any])
    
    inline def setAppendTextUndefined: Self = StObject.set(x, "appendText", js.undefined)
    
    inline def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
    
    inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
    
    inline def setAutohide(value: Boolean): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
    
    inline def setAutohideUndefined: Self = StObject.set(x, "autohide", js.undefined)
    
    inline def setBeforeShow(value: (/* input */ Element, /* inst */ Any) => DatepickerOptions): Self = StObject.set(x, "beforeShow", js.Any.fromFunction2(value))
    
    inline def setBeforeShowDay(value: /* date */ js.Date => js.Array[Any]): Self = StObject.set(x, "beforeShowDay", js.Any.fromFunction1(value))
    
    inline def setBeforeShowDayUndefined: Self = StObject.set(x, "beforeShowDay", js.undefined)
    
    inline def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    inline def setButtonImage(value: String): Self = StObject.set(x, "buttonImage", value.asInstanceOf[js.Any])
    
    inline def setButtonImageOnly(value: Boolean): Self = StObject.set(x, "buttonImageOnly", value.asInstanceOf[js.Any])
    
    inline def setButtonImageOnlyUndefined: Self = StObject.set(x, "buttonImageOnly", js.undefined)
    
    inline def setButtonImageUndefined: Self = StObject.set(x, "buttonImage", js.undefined)
    
    inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    inline def setCalculateWeek(value: /* date */ js.Date => String): Self = StObject.set(x, "calculateWeek", js.Any.fromFunction1(value))
    
    inline def setCalculateWeekUndefined: Self = StObject.set(x, "calculateWeek", js.undefined)
    
    inline def setChangeMonth(value: Boolean): Self = StObject.set(x, "changeMonth", value.asInstanceOf[js.Any])
    
    inline def setChangeMonthUndefined: Self = StObject.set(x, "changeMonth", js.undefined)
    
    inline def setChangeYear(value: Boolean): Self = StObject.set(x, "changeYear", value.asInstanceOf[js.Any])
    
    inline def setChangeYearUndefined: Self = StObject.set(x, "changeYear", js.undefined)
    
    inline def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
    
    inline def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
    
    inline def setConstrainInput(value: Boolean): Self = StObject.set(x, "constrainInput", value.asInstanceOf[js.Any])
    
    inline def setConstrainInputUndefined: Self = StObject.set(x, "constrainInput", js.undefined)
    
    inline def setCurrentText(value: String): Self = StObject.set(x, "currentText", value.asInstanceOf[js.Any])
    
    inline def setCurrentTextUndefined: Self = StObject.set(x, "currentText", js.undefined)
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
    
    inline def setDayNamesMin(value: js.Array[String]): Self = StObject.set(x, "dayNamesMin", value.asInstanceOf[js.Any])
    
    inline def setDayNamesMinUndefined: Self = StObject.set(x, "dayNamesMin", js.undefined)
    
    inline def setDayNamesMinVarargs(value: String*): Self = StObject.set(x, "dayNamesMin", js.Array(value*))
    
    inline def setDayNamesShort(value: js.Array[String]): Self = StObject.set(x, "dayNamesShort", value.asInstanceOf[js.Any])
    
    inline def setDayNamesShortUndefined: Self = StObject.set(x, "dayNamesShort", js.undefined)
    
    inline def setDayNamesShortVarargs(value: String*): Self = StObject.set(x, "dayNamesShort", js.Array(value*))
    
    inline def setDayNamesUndefined: Self = StObject.set(x, "dayNames", js.undefined)
    
    inline def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value*))
    
    inline def setDefaultDate(value: Any): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    inline def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
    
    inline def setGotoCurrent(value: Boolean): Self = StObject.set(x, "gotoCurrent", value.asInstanceOf[js.Any])
    
    inline def setGotoCurrentUndefined: Self = StObject.set(x, "gotoCurrent", js.undefined)
    
    inline def setHideIfNoPrevNext(value: Boolean): Self = StObject.set(x, "hideIfNoPrevNext", value.asInstanceOf[js.Any])
    
    inline def setHideIfNoPrevNextUndefined: Self = StObject.set(x, "hideIfNoPrevNext", js.undefined)
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
    
    inline def setMaxDate(value: Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
    
    inline def setMonthNamesShort(value: js.Array[String]): Self = StObject.set(x, "monthNamesShort", value.asInstanceOf[js.Any])
    
    inline def setMonthNamesShortUndefined: Self = StObject.set(x, "monthNamesShort", js.undefined)
    
    inline def setMonthNamesShortVarargs(value: String*): Self = StObject.set(x, "monthNamesShort", js.Array(value*))
    
    inline def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
    
    inline def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value*))
    
    inline def setNavigationAsDateFormat(value: Boolean): Self = StObject.set(x, "navigationAsDateFormat", value.asInstanceOf[js.Any])
    
    inline def setNavigationAsDateFormatUndefined: Self = StObject.set(x, "navigationAsDateFormat", js.undefined)
    
    inline def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
    
    inline def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
    
    inline def setNumberOfMonths(value: Any): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
    
    inline def setOnChangeMonthYear(value: (/* year */ Double, /* month */ Double, /* inst */ Any) => Unit): Self = StObject.set(x, "onChangeMonthYear", js.Any.fromFunction3(value))
    
    inline def setOnChangeMonthYearUndefined: Self = StObject.set(x, "onChangeMonthYear", js.undefined)
    
    inline def setOnClose(value: (/* dateText */ String, /* inst */ Any) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnSelect(value: (/* dateText */ String, /* inst */ Any) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setPrevText(value: String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
    
    inline def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
    
    inline def setSelectOtherMonths(value: Boolean): Self = StObject.set(x, "selectOtherMonths", value.asInstanceOf[js.Any])
    
    inline def setSelectOtherMonthsUndefined: Self = StObject.set(x, "selectOtherMonths", js.undefined)
    
    inline def setShortYearCutoff(value: Any): Self = StObject.set(x, "shortYearCutoff", value.asInstanceOf[js.Any])
    
    inline def setShortYearCutoffUndefined: Self = StObject.set(x, "shortYearCutoff", js.undefined)
    
    inline def setShowAnim(value: String): Self = StObject.set(x, "showAnim", value.asInstanceOf[js.Any])
    
    inline def setShowAnimUndefined: Self = StObject.set(x, "showAnim", js.undefined)
    
    inline def setShowButtonPanel(value: Boolean): Self = StObject.set(x, "showButtonPanel", value.asInstanceOf[js.Any])
    
    inline def setShowButtonPanelUndefined: Self = StObject.set(x, "showButtonPanel", js.undefined)
    
    inline def setShowCurrentAtPos(value: Double): Self = StObject.set(x, "showCurrentAtPos", value.asInstanceOf[js.Any])
    
    inline def setShowCurrentAtPosUndefined: Self = StObject.set(x, "showCurrentAtPos", js.undefined)
    
    inline def setShowMonthAfterYear(value: Boolean): Self = StObject.set(x, "showMonthAfterYear", value.asInstanceOf[js.Any])
    
    inline def setShowMonthAfterYearUndefined: Self = StObject.set(x, "showMonthAfterYear", js.undefined)
    
    inline def setShowOn(value: String): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    inline def setShowOnUndefined: Self = StObject.set(x, "showOn", js.undefined)
    
    inline def setShowOptions(value: Any): Self = StObject.set(x, "showOptions", value.asInstanceOf[js.Any])
    
    inline def setShowOptionsUndefined: Self = StObject.set(x, "showOptions", js.undefined)
    
    inline def setShowOtherMonths(value: Boolean): Self = StObject.set(x, "showOtherMonths", value.asInstanceOf[js.Any])
    
    inline def setShowOtherMonthsUndefined: Self = StObject.set(x, "showOtherMonths", js.undefined)
    
    inline def setShowWeek(value: Boolean): Self = StObject.set(x, "showWeek", value.asInstanceOf[js.Any])
    
    inline def setShowWeekUndefined: Self = StObject.set(x, "showWeek", js.undefined)
    
    inline def setStepMonths(value: Double): Self = StObject.set(x, "stepMonths", value.asInstanceOf[js.Any])
    
    inline def setStepMonthsUndefined: Self = StObject.set(x, "stepMonths", js.undefined)
    
    inline def setWeekHeader(value: String): Self = StObject.set(x, "weekHeader", value.asInstanceOf[js.Any])
    
    inline def setWeekHeaderUndefined: Self = StObject.set(x, "weekHeader", js.undefined)
    
    inline def setYearRange(value: String): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
    
    inline def setYearRangeUndefined: Self = StObject.set(x, "yearRange", js.undefined)
    
    inline def setYearSuffix(value: String): Self = StObject.set(x, "yearSuffix", value.asInstanceOf[js.Any])
    
    inline def setYearSuffixUndefined: Self = StObject.set(x, "yearSuffix", js.undefined)
  }
}

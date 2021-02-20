package typings.jqueryui.JQueryUI

import typings.std.Date
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Datepicker //////////////////////////////////////////////////
@js.native
trait DatepickerOptions extends StObject {
  
  /**
    * An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of the date within this field. Leave as blank for no alternate field.
    */
  var altField: js.UndefOr[js.Any] = js.native
  
  // Selector, jQuery or Element
  /**
    * The dateFormat to be used for the altField option. This allows one date format to be shown to the user for selection purposes, while a different format is actually sent behind the scenes. For a full list of the possible formats see the formatDate function
    */
  var altFormat: js.UndefOr[String] = js.native
  
  /**
    * The text to display after each date field, e.g., to show the required format.
    */
  var appendText: js.UndefOr[String] = js.native
  
  /**
    * Set to true to automatically resize the input field to accommodate dates in the current dateFormat.
    */
  var autoSize: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true to automatically hide the datepicker.
    */
  var autohide: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that takes an input field and current datepicker instance and returns an options object to update the datepicker with. It is called just before the datepicker is displayed.
    */
  var beforeShow: js.UndefOr[js.Function2[/* input */ Element, /* inst */ js.Any, this.type]] = js.native
  
  /**
    * A function that takes a date as a parameter and must return an array with:
    * [0]: true/false indicating whether or not this date is selectable
    * [1]: a CSS class name to add to the date's cell or "" for the default presentation
    * [2]: an optional popup tooltip for this date
    * The function is called for each day in the datepicker before it is displayed.
    */
  var beforeShowDay: js.UndefOr[js.Function1[/* date */ Date, js.Array[_]]] = js.native
  
  /**
    * A URL of an image to use to display the datepicker when the showOn option is set to "button" or "both". If set, the buttonText option becomes the alt value and is not directly displayed.
    */
  var buttonImage: js.UndefOr[String] = js.native
  
  /**
    * Whether the button image should be rendered by itself instead of inside a button element. This option is only relevant if the buttonImage option has also been set.
    */
  var buttonImageOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The text to display on the trigger button. Use in conjunction with the showOn option set to "button" or "both".
    */
  var buttonText: js.UndefOr[String] = js.native
  
  /**
    * A function to calculate the week of the year for a given date. The default implementation uses the ISO 8601 definition: weeks start on a Monday; the first week of the year contains the first Thursday of the year.
    */
  var calculateWeek: js.UndefOr[js.Function1[/* date */ Date, String]] = js.native
  
  /**
    * Whether the month should be rendered as a dropdown instead of text.
    */
  var changeMonth: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the year should be rendered as a dropdown instead of text. Use the yearRange option to control which years are made available for selection.
    */
  var changeYear: js.UndefOr[Boolean] = js.native
  
  /**
    * The text to display for the close link. Use the showButtonPanel option to display this button.
    */
  var closeText: js.UndefOr[String] = js.native
  
  /**
    * When true, entry in the input field is constrained to those characters allowed by the current dateFormat option.
    */
  var constrainInput: js.UndefOr[Boolean] = js.native
  
  /**
    * The text to display for the current day link. Use the showButtonPanel option to display this button.
    */
  var currentText: js.UndefOr[String] = js.native
  
  /**
    * The format for parsed and displayed dates. For a full list of the possible formats see the formatDate function.
    */
  var dateFormat: js.UndefOr[String] = js.native
  
  /**
    * The list of long day names, starting from Sunday, for use as requested via the dateFormat option.
    */
  var dayNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The list of minimised day names, starting from Sunday, for use as column headers within the datepicker.
    */
  var dayNamesMin: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The list of abbreviated day names, starting from Sunday, for use as requested via the dateFormat option.
    */
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Set the date to highlight on first opening if the field is blank. Specify either an actual date via a Date object or as a string in the current dateFormat, or a number of days from today (e.g. +7) or a string of values and periods ('y' for years, 'm' for months, 'w' for weeks, 'd' for days, e.g. '+1m +7d'), or null for today.
    * Multiple types supported:
    * Date: A date object containing the default date.
    * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
    * String: A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
    */
  var defaultDate: js.UndefOr[js.Any] = js.native
  
  // Date, number or string
  /**
    * Control the speed at which the datepicker appears, it may be a time in milliseconds or a string representing one of the three predefined speeds ("slow", "normal", "fast").
    */
  var duration: js.UndefOr[String] = js.native
  
  /**
    * Set to date to automatically enddate the datepicker.
    */
  var endDate: js.UndefOr[Date] = js.native
  
  /**
    * Set the first day of the week: Sunday is 0, Monday is 1, etc.
    */
  var firstDay: js.UndefOr[Double] = js.native
  
  /**
    * When true, the current day link moves to the currently selected date instead of today.
    */
  var gotoCurrent: js.UndefOr[Boolean] = js.native
  
  /**
    * Normally the previous and next links are disabled when not applicable (see the minDate and maxDate options). You can hide them altogether by setting this attribute to true.
    */
  var hideIfNoPrevNext: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the current language is drawn from right to left.
    */
  var isRTL: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum selectable date. When set to null, there is no maximum.
    * Multiple types supported:
    * Date: A date object containing the maximum date.
    * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
    * String: A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
    */
  var maxDate: js.UndefOr[js.Any] = js.native
  
  // Date, number or string
  /**
    * The minimum selectable date. When set to null, there is no minimum.
    * Multiple types supported:
    * Date: A date object containing the minimum date.
    * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
    * String: A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
    */
  var minDate: js.UndefOr[js.Any] = js.native
  
  // Date, number or string
  /**
    * The list of full month names, for use as requested via the dateFormat option.
    */
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The list of abbreviated month names, as used in the month header on each datepicker and as requested via the dateFormat option.
    */
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether the prevText and nextText options should be parsed as dates by the formatDate function, allowing them to display the target month names for example.
    */
  var navigationAsDateFormat: js.UndefOr[Boolean] = js.native
  
  /**
    * The text to display for the next month link. With the standard ThemeRoller styling, this value is replaced by an icon.
    */
  var nextText: js.UndefOr[String] = js.native
  
  /**
    * The number of months to show at once.
    * Multiple types supported:
    * Number: The number of months to display in a single row.
    * Array: An array defining the number of rows and columns to display.
    */
  var numberOfMonths: js.UndefOr[js.Any] = js.native
  
  // number or number[]
  /**
    * Called when the datepicker moves to a new month and/or year. The function receives the selected year, month (1-12), and the datepicker instance as parameters. this refers to the associated input field.
    */
  var onChangeMonthYear: js.UndefOr[js.Function3[/* year */ Double, /* month */ Double, /* inst */ js.Any, Unit]] = js.native
  
  /**
    * Called when the datepicker is closed, whether or not a date is selected. The function receives the selected date as text ("" if none) and the datepicker instance as parameters. this refers to the associated input field.
    */
  var onClose: js.UndefOr[js.Function2[/* dateText */ String, /* inst */ js.Any, Unit]] = js.native
  
  /**
    * Called when the datepicker is selected. The function receives the selected date as text and the datepicker instance as parameters. this refers to the associated input field.
    */
  var onSelect: js.UndefOr[js.Function2[/* dateText */ String, /* inst */ js.Any, Unit]] = js.native
  
  /**
    * The text to display for the previous month link. With the standard ThemeRoller styling, this value is replaced by an icon.
    */
  var prevText: js.UndefOr[String] = js.native
  
  /**
    * Whether days in other months shown before or after the current month are selectable. This only applies if the showOtherMonths option is set to true.
    */
  var selectOtherMonths: js.UndefOr[Boolean] = js.native
  
  /**
    * The cutoff year for determining the century for a date (used in conjunction with dateFormat 'y'). Any dates entered with a year value less than or equal to the cutoff year are considered to be in the current century, while those greater than it are deemed to be in the previous century.
    * Multiple types supported:
    * Number: A value between 0 and 99 indicating the cutoff year.
    * String: A relative number of years from the current year, e.g., "+3" or "-5".
    */
  var shortYearCutoff: js.UndefOr[js.Any] = js.native
  
  // number or string
  /**
    * The name of the animation used to show and hide the datepicker. Use "show" (the default), "slideDown", "fadeIn", any of the jQuery UI effects. Set to an empty string to disable animation.
    */
  var showAnim: js.UndefOr[String] = js.native
  
  /**
    * Whether to display a button pane underneath the calendar. The button pane contains two buttons, a Today button that links to the current day, and a Done button that closes the datepicker. The buttons' text can be customized using the currentText and closeText options respectively.
    */
  var showButtonPanel: js.UndefOr[Boolean] = js.native
  
  /**
    * When displaying multiple months via the numberOfMonths option, the showCurrentAtPos option defines which position to display the current month in.
    */
  var showCurrentAtPos: js.UndefOr[Double] = js.native
  
  /**
    * Whether to show the month after the year in the header.
    */
  var showMonthAfterYear: js.UndefOr[Boolean] = js.native
  
  /**
    * When the datepicker should appear. The datepicker can appear when the field receives focus ("focus"), when a button is clicked ("button"), or when either event occurs ("both").
    */
  var showOn: js.UndefOr[String] = js.native
  
  /**
    * If using one of the jQuery UI effects for the showAnim option, you can provide additional settings for that animation via this option.
    */
  var showOptions: js.UndefOr[js.Any] = js.native
  
  // TODO
  /**
    * Whether to display dates in other months (non-selectable) at the start or end of the current month. To make these days selectable use the selectOtherMonths option.
    */
  var showOtherMonths: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, a column is added to show the week of the year. The calculateWeek option determines how the week of the year is calculated. You may also want to change the firstDay option.
    */
  var showWeek: js.UndefOr[Boolean] = js.native
  
  /**
    * Set how many months to move when clicking the previous/next links.
    */
  var stepMonths: js.UndefOr[Double] = js.native
  
  /**
    * The text to display for the week of the year column heading. Use the showWeek option to display this column.
    */
  var weekHeader: js.UndefOr[String] = js.native
  
  /**
    * The range of years displayed in the year drop-down: either relative to today's year ("-nn:+nn"), relative to the currently selected year ("c-nn:c+nn"), absolute ("nnnn:nnnn"), or combinations of these formats ("nnnn:-nn"). Note that this option only affects what appears in the drop-down, to restrict which dates may be selected use the minDate and/or maxDate options.
    */
  var yearRange: js.UndefOr[String] = js.native
  
  /**
    * Additional text to display after the year in the month headers.
    */
  var yearSuffix: js.UndefOr[String] = js.native
}
object DatepickerOptions {
  
  @scala.inline
  def apply(): DatepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerOptions]
  }
  
  @scala.inline
  implicit class DatepickerOptionsMutableBuilder[Self <: DatepickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltField(value: js.Any): Self = StObject.set(x, "altField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltFieldUndefined: Self = StObject.set(x, "altField", js.undefined)
    
    @scala.inline
    def setAltFormat(value: String): Self = StObject.set(x, "altFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltFormatUndefined: Self = StObject.set(x, "altFormat", js.undefined)
    
    @scala.inline
    def setAppendText(value: String): Self = StObject.set(x, "appendText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendTextUndefined: Self = StObject.set(x, "appendText", js.undefined)
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
    
    @scala.inline
    def setAutohide(value: Boolean): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutohideUndefined: Self = StObject.set(x, "autohide", js.undefined)
    
    @scala.inline
    def setBeforeShow(value: (/* input */ Element, /* inst */ js.Any) => DatepickerOptions): Self = StObject.set(x, "beforeShow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeShowDay(value: /* date */ Date => js.Array[_]): Self = StObject.set(x, "beforeShowDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeShowDayUndefined: Self = StObject.set(x, "beforeShowDay", js.undefined)
    
    @scala.inline
    def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    @scala.inline
    def setButtonImage(value: String): Self = StObject.set(x, "buttonImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonImageOnly(value: Boolean): Self = StObject.set(x, "buttonImageOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonImageOnlyUndefined: Self = StObject.set(x, "buttonImageOnly", js.undefined)
    
    @scala.inline
    def setButtonImageUndefined: Self = StObject.set(x, "buttonImage", js.undefined)
    
    @scala.inline
    def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    @scala.inline
    def setCalculateWeek(value: /* date */ Date => String): Self = StObject.set(x, "calculateWeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateWeekUndefined: Self = StObject.set(x, "calculateWeek", js.undefined)
    
    @scala.inline
    def setChangeMonth(value: Boolean): Self = StObject.set(x, "changeMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeMonthUndefined: Self = StObject.set(x, "changeMonth", js.undefined)
    
    @scala.inline
    def setChangeYear(value: Boolean): Self = StObject.set(x, "changeYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeYearUndefined: Self = StObject.set(x, "changeYear", js.undefined)
    
    @scala.inline
    def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
    
    @scala.inline
    def setConstrainInput(value: Boolean): Self = StObject.set(x, "constrainInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainInputUndefined: Self = StObject.set(x, "constrainInput", js.undefined)
    
    @scala.inline
    def setCurrentText(value: String): Self = StObject.set(x, "currentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTextUndefined: Self = StObject.set(x, "currentText", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayNamesMin(value: js.Array[String]): Self = StObject.set(x, "dayNamesMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayNamesMinUndefined: Self = StObject.set(x, "dayNamesMin", js.undefined)
    
    @scala.inline
    def setDayNamesMinVarargs(value: String*): Self = StObject.set(x, "dayNamesMin", js.Array(value :_*))
    
    @scala.inline
    def setDayNamesShort(value: js.Array[String]): Self = StObject.set(x, "dayNamesShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayNamesShortUndefined: Self = StObject.set(x, "dayNamesShort", js.undefined)
    
    @scala.inline
    def setDayNamesShortVarargs(value: String*): Self = StObject.set(x, "dayNamesShort", js.Array(value :_*))
    
    @scala.inline
    def setDayNamesUndefined: Self = StObject.set(x, "dayNames", js.undefined)
    
    @scala.inline
    def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value :_*))
    
    @scala.inline
    def setDefaultDate(value: js.Any): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
    
    @scala.inline
    def setGotoCurrent(value: Boolean): Self = StObject.set(x, "gotoCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGotoCurrentUndefined: Self = StObject.set(x, "gotoCurrent", js.undefined)
    
    @scala.inline
    def setHideIfNoPrevNext(value: Boolean): Self = StObject.set(x, "hideIfNoPrevNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideIfNoPrevNextUndefined: Self = StObject.set(x, "hideIfNoPrevNext", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
    
    @scala.inline
    def setMaxDate(value: js.Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: js.Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthNamesShort(value: js.Array[String]): Self = StObject.set(x, "monthNamesShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthNamesShortUndefined: Self = StObject.set(x, "monthNamesShort", js.undefined)
    
    @scala.inline
    def setMonthNamesShortVarargs(value: String*): Self = StObject.set(x, "monthNamesShort", js.Array(value :_*))
    
    @scala.inline
    def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
    
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value :_*))
    
    @scala.inline
    def setNavigationAsDateFormat(value: Boolean): Self = StObject.set(x, "navigationAsDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationAsDateFormatUndefined: Self = StObject.set(x, "navigationAsDateFormat", js.undefined)
    
    @scala.inline
    def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
    
    @scala.inline
    def setNumberOfMonths(value: js.Any): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
    
    @scala.inline
    def setOnChangeMonthYear(value: (/* year */ Double, /* month */ Double, /* inst */ js.Any) => Unit): Self = StObject.set(x, "onChangeMonthYear", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnChangeMonthYearUndefined: Self = StObject.set(x, "onChangeMonthYear", js.undefined)
    
    @scala.inline
    def setOnClose(value: (/* dateText */ String, /* inst */ js.Any) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnSelect(value: (/* dateText */ String, /* inst */ js.Any) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setPrevText(value: String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
    
    @scala.inline
    def setSelectOtherMonths(value: Boolean): Self = StObject.set(x, "selectOtherMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectOtherMonthsUndefined: Self = StObject.set(x, "selectOtherMonths", js.undefined)
    
    @scala.inline
    def setShortYearCutoff(value: js.Any): Self = StObject.set(x, "shortYearCutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortYearCutoffUndefined: Self = StObject.set(x, "shortYearCutoff", js.undefined)
    
    @scala.inline
    def setShowAnim(value: String): Self = StObject.set(x, "showAnim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAnimUndefined: Self = StObject.set(x, "showAnim", js.undefined)
    
    @scala.inline
    def setShowButtonPanel(value: Boolean): Self = StObject.set(x, "showButtonPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowButtonPanelUndefined: Self = StObject.set(x, "showButtonPanel", js.undefined)
    
    @scala.inline
    def setShowCurrentAtPos(value: Double): Self = StObject.set(x, "showCurrentAtPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCurrentAtPosUndefined: Self = StObject.set(x, "showCurrentAtPos", js.undefined)
    
    @scala.inline
    def setShowMonthAfterYear(value: Boolean): Self = StObject.set(x, "showMonthAfterYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMonthAfterYearUndefined: Self = StObject.set(x, "showMonthAfterYear", js.undefined)
    
    @scala.inline
    def setShowOn(value: String): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnUndefined: Self = StObject.set(x, "showOn", js.undefined)
    
    @scala.inline
    def setShowOptions(value: js.Any): Self = StObject.set(x, "showOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOptionsUndefined: Self = StObject.set(x, "showOptions", js.undefined)
    
    @scala.inline
    def setShowOtherMonths(value: Boolean): Self = StObject.set(x, "showOtherMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOtherMonthsUndefined: Self = StObject.set(x, "showOtherMonths", js.undefined)
    
    @scala.inline
    def setShowWeek(value: Boolean): Self = StObject.set(x, "showWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWeekUndefined: Self = StObject.set(x, "showWeek", js.undefined)
    
    @scala.inline
    def setStepMonths(value: Double): Self = StObject.set(x, "stepMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepMonthsUndefined: Self = StObject.set(x, "stepMonths", js.undefined)
    
    @scala.inline
    def setWeekHeader(value: String): Self = StObject.set(x, "weekHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekHeaderUndefined: Self = StObject.set(x, "weekHeader", js.undefined)
    
    @scala.inline
    def setYearRange(value: String): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearRangeUndefined: Self = StObject.set(x, "yearRange", js.undefined)
    
    @scala.inline
    def setYearSuffix(value: String): Self = StObject.set(x, "yearSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearSuffixUndefined: Self = StObject.set(x, "yearSuffix", js.undefined)
  }
}

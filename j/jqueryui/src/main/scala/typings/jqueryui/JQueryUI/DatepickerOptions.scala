package typings.jqueryui.JQueryUI

import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Datepicker //////////////////////////////////////////////////
@js.native
trait DatepickerOptions extends js.Object {
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
  implicit class DatepickerOptionsOps[Self <: DatepickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAltField(value: js.Any): Self = this.set("altField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltField: Self = this.set("altField", js.undefined)
    @scala.inline
    def setAltFormat(value: String): Self = this.set("altFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltFormat: Self = this.set("altFormat", js.undefined)
    @scala.inline
    def setAppendText(value: String): Self = this.set("appendText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendText: Self = this.set("appendText", js.undefined)
    @scala.inline
    def setAutoSize(value: Boolean): Self = this.set("autoSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSize: Self = this.set("autoSize", js.undefined)
    @scala.inline
    def setAutohide(value: Boolean): Self = this.set("autohide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutohide: Self = this.set("autohide", js.undefined)
    @scala.inline
    def setBeforeShow(value: (/* input */ Element, /* inst */ js.Any) => DatepickerOptions): Self = this.set("beforeShow", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeShow: Self = this.set("beforeShow", js.undefined)
    @scala.inline
    def setBeforeShowDay(value: /* date */ Date => js.Array[_]): Self = this.set("beforeShowDay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeShowDay: Self = this.set("beforeShowDay", js.undefined)
    @scala.inline
    def setButtonImage(value: String): Self = this.set("buttonImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonImage: Self = this.set("buttonImage", js.undefined)
    @scala.inline
    def setButtonImageOnly(value: Boolean): Self = this.set("buttonImageOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonImageOnly: Self = this.set("buttonImageOnly", js.undefined)
    @scala.inline
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    @scala.inline
    def setCalculateWeek(value: /* date */ Date => String): Self = this.set("calculateWeek", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCalculateWeek: Self = this.set("calculateWeek", js.undefined)
    @scala.inline
    def setChangeMonth(value: Boolean): Self = this.set("changeMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeMonth: Self = this.set("changeMonth", js.undefined)
    @scala.inline
    def setChangeYear(value: Boolean): Self = this.set("changeYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeYear: Self = this.set("changeYear", js.undefined)
    @scala.inline
    def setCloseText(value: String): Self = this.set("closeText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseText: Self = this.set("closeText", js.undefined)
    @scala.inline
    def setConstrainInput(value: Boolean): Self = this.set("constrainInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainInput: Self = this.set("constrainInput", js.undefined)
    @scala.inline
    def setCurrentText(value: String): Self = this.set("currentText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentText: Self = this.set("currentText", js.undefined)
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setDayNamesVarargs(value: String*): Self = this.set("dayNames", js.Array(value :_*))
    @scala.inline
    def setDayNames(value: js.Array[String]): Self = this.set("dayNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayNames: Self = this.set("dayNames", js.undefined)
    @scala.inline
    def setDayNamesMinVarargs(value: String*): Self = this.set("dayNamesMin", js.Array(value :_*))
    @scala.inline
    def setDayNamesMin(value: js.Array[String]): Self = this.set("dayNamesMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayNamesMin: Self = this.set("dayNamesMin", js.undefined)
    @scala.inline
    def setDayNamesShortVarargs(value: String*): Self = this.set("dayNamesShort", js.Array(value :_*))
    @scala.inline
    def setDayNamesShort(value: js.Array[String]): Self = this.set("dayNamesShort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayNamesShort: Self = this.set("dayNamesShort", js.undefined)
    @scala.inline
    def setDefaultDate(value: js.Any): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEndDate(value: Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setFirstDay(value: Double): Self = this.set("firstDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDay: Self = this.set("firstDay", js.undefined)
    @scala.inline
    def setGotoCurrent(value: Boolean): Self = this.set("gotoCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGotoCurrent: Self = this.set("gotoCurrent", js.undefined)
    @scala.inline
    def setHideIfNoPrevNext(value: Boolean): Self = this.set("hideIfNoPrevNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideIfNoPrevNext: Self = this.set("hideIfNoPrevNext", js.undefined)
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    @scala.inline
    def setMaxDate(value: js.Any): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: js.Any): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = this.set("monthNames", js.Array(value :_*))
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthNames: Self = this.set("monthNames", js.undefined)
    @scala.inline
    def setMonthNamesShortVarargs(value: String*): Self = this.set("monthNamesShort", js.Array(value :_*))
    @scala.inline
    def setMonthNamesShort(value: js.Array[String]): Self = this.set("monthNamesShort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthNamesShort: Self = this.set("monthNamesShort", js.undefined)
    @scala.inline
    def setNavigationAsDateFormat(value: Boolean): Self = this.set("navigationAsDateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationAsDateFormat: Self = this.set("navigationAsDateFormat", js.undefined)
    @scala.inline
    def setNextText(value: String): Self = this.set("nextText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextText: Self = this.set("nextText", js.undefined)
    @scala.inline
    def setNumberOfMonths(value: js.Any): Self = this.set("numberOfMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfMonths: Self = this.set("numberOfMonths", js.undefined)
    @scala.inline
    def setOnChangeMonthYear(value: (/* year */ Double, /* month */ Double, /* inst */ js.Any) => Unit): Self = this.set("onChangeMonthYear", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnChangeMonthYear: Self = this.set("onChangeMonthYear", js.undefined)
    @scala.inline
    def setOnClose(value: (/* dateText */ String, /* inst */ js.Any) => Unit): Self = this.set("onClose", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnSelect(value: (/* dateText */ String, /* inst */ js.Any) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setPrevText(value: String): Self = this.set("prevText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevText: Self = this.set("prevText", js.undefined)
    @scala.inline
    def setSelectOtherMonths(value: Boolean): Self = this.set("selectOtherMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectOtherMonths: Self = this.set("selectOtherMonths", js.undefined)
    @scala.inline
    def setShortYearCutoff(value: js.Any): Self = this.set("shortYearCutoff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortYearCutoff: Self = this.set("shortYearCutoff", js.undefined)
    @scala.inline
    def setShowAnim(value: String): Self = this.set("showAnim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAnim: Self = this.set("showAnim", js.undefined)
    @scala.inline
    def setShowButtonPanel(value: Boolean): Self = this.set("showButtonPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowButtonPanel: Self = this.set("showButtonPanel", js.undefined)
    @scala.inline
    def setShowCurrentAtPos(value: Double): Self = this.set("showCurrentAtPos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCurrentAtPos: Self = this.set("showCurrentAtPos", js.undefined)
    @scala.inline
    def setShowMonthAfterYear(value: Boolean): Self = this.set("showMonthAfterYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMonthAfterYear: Self = this.set("showMonthAfterYear", js.undefined)
    @scala.inline
    def setShowOn(value: String): Self = this.set("showOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOn: Self = this.set("showOn", js.undefined)
    @scala.inline
    def setShowOptions(value: js.Any): Self = this.set("showOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOptions: Self = this.set("showOptions", js.undefined)
    @scala.inline
    def setShowOtherMonths(value: Boolean): Self = this.set("showOtherMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOtherMonths: Self = this.set("showOtherMonths", js.undefined)
    @scala.inline
    def setShowWeek(value: Boolean): Self = this.set("showWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWeek: Self = this.set("showWeek", js.undefined)
    @scala.inline
    def setStepMonths(value: Double): Self = this.set("stepMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepMonths: Self = this.set("stepMonths", js.undefined)
    @scala.inline
    def setWeekHeader(value: String): Self = this.set("weekHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekHeader: Self = this.set("weekHeader", js.undefined)
    @scala.inline
    def setYearRange(value: String): Self = this.set("yearRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearRange: Self = this.set("yearRange", js.undefined)
    @scala.inline
    def setYearSuffix(value: String): Self = this.set("yearSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearSuffix: Self = this.set("yearSuffix", js.undefined)
  }
  
}


package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDatePicker
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets whether the editor value can become null.
    * If that option is false, and editor has no value, then value is set to an empty string.
    *
    */
  var allowNullValue: js.UndefOr[Boolean] = js.native
  /**
    * Gets visibility of the spin, clear and drop-down button. That option can be set only on initialization. Combinations like 'dropdown,spin' or 'spin,clear' are supported too.
    *
    *
    * Valid values:
    * "dropdown" A button to open/close the list is located on the right side of the editor.
    * "clear" A button to clear the value is located on the right side of the editor.
    * "spin" Spin buttons are located on the right side of the editor.
    */
  var buttonType: js.UndefOr[String] = js.native
  /**
    * Gets/Sets year for auto detection of 20th and 21st centuries.
    * That option is used to automatically fill century when the user entered only 1 or 2 digits into the year field or when the date pattern contains only 1 or 2 year positions, e.g. "yy" or "y".
    * If user entered value larger than value of this option, then 20th century is used, otherwise the 21st.
    *
    */
  var centuryThreshold: js.UndefOr[Double] = js.native
  /**
    * Gets the value type returned by the get of value() method and option. Also affects how the value is stored for form submit.
    * The [enableUTCDates](ui.%%WidgetNameLowered%%#options:enableUTCDates) option can be used to output an UTC ISO string instead.
    * For example 10:00 AM from a client with local offset of 5 hours ahead of GMT will be serialized as:
    * "2016-11-11T10:00:00+05:00"
    *
    *
    * Valid values:
    * "date" The value method returns a Date object. When this mode is set the value sent to the server on submit is serialized as ISO 8061 string with local time and zone values by default.
    * "displayModeText" The "text" in display mode (no focus) format (pattern) is used to be send to the server and is returned from the value() method (returns a string object).
    * "editModeText" The "text" in edit mode (focus) format (pattern) is used to be send to the server and is returned from the value() method (returns a string object).
    */
  var dataMode: js.UndefOr[String] = js.native
  /**
    * Gets/Sets format of date while editor has no focus.
    * Value of that option can be set to a specific date pattern or to a flag defined by regional settings.
    * If value is not set, then the dateInputFormat is used automatically.
    * If value is set to explicit date pattern and pattern besides date-flags has explicit characters which match with date-flags or mask-flags, then the "escape" character should be used in front of them.
    * List of predefined regional flags:
    * "date": the datePattern member of regional option is used
    * "dateLong": the dateLongPattern member of regional option is used
    * "time": the timePattern member of regional option is used
    * "timeLong": the timeLongPattern member of regional option is used
    * "dateTime": the dateTimePattern member of regional option is used
    * List of explicit characters, which should have escape \\ character in front of them:
    * C, &, a, A, ?, L, 9, 0, #, >, <, y, M, d, h, H, m, s, t, f.
    * List of date-flags when explicit date pattern is used:
    * "y": year field without century and without leading zero
    * "yy": year field without century and with leading zero
    * "yyyy": year field with leading zeros
    * "M": month field as digit without leading zero
    * "MM": month field as digit with leading zero
    * "MMM": month field as short month name
    * "MMMM": month field as long month name
    * "d": day of month field without leading zero
    * "dd": day of month field with leading zero
    * "ddd": day of the week as short name
    * "dddd": day of the week as long name
    * "t": first character of string which represents AM/PM field
    * "tt": 2 characters of string which represents AM/PM field
    * "h": hours field in 12-hours format without leading zero
    * "hh": hours field in 12-hours format with leading zero
    * "H": hours field in 24-hours format without leading zero
    * "HH": hours field in 24-hours format with leading zero
    * "m": minutes field without leading zero
    * "mm": minutes field with leading zero
    * "s": seconds field without leading zero
    * "ss": seconds field with leading zero
    * "f": milliseconds field in hundreds
    * "ff": milliseconds field in tenths
    * "fff": milliseconds field
    *
    */
  var dateDisplayFormat: js.UndefOr[String] = js.native
  /**
    * Gets format of date while editor has focus.
    * Value of that option can be set to explicit date pattern or to a flag defined by regional settings.
    * If value is set to explicit date pattern and pattern besides date-flags has explicit characters which match with date-flags or mask-flags, then the "escape" character should be used in front of them.
    * If option is not set, then the "date" is used automatically.
    * List of predefined regional flags:
    * "date": the datePattern member of regional option is used
    * "dateLong": the dateLongPattern member of regional option is used
    * "time": the timePattern member of regional option is used
    * "timeLong": the timeLongPattern member of regional option is used
    * "dateTime": the dateTimePattern member of regional option is used
    * List of explicit characters, which should have escape \\ character in front of them: C, &, a, A, ?, L, 9, 0, #, >, <, y, M, d, h, H, m, s, t, f.
    * List of date-flags when explicit date pattern is used:
    * "yy": year field without century and with leading zero
    * "yyyy": year field with leading zeros
    * "MM": month field as digit with leading zero
    * "dd": day of month field with leading zero
    * "t": first character of string which represents AM/PM field
    * "tt": 2 characters of string which represents AM/PM field
    * "hh": hours field in 12-hours format with leading zero
    * "HH": hours field in 24-hours format with leading zero
    * "mm": minutes field with leading zero
    * "ss": seconds field with leading zero
    * "f": milliseconds field in hundreds
    * "ff": milliseconds field in tenths
    * "fff": milliseconds field
    * Note! This option can not be set runtime.
    *
    */
  var dateInputFormat: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the options supported by the [jquery.ui.datepicker](http://api.jqueryui.com/datepicker/). Only options related to the drop-down calendar are supported.
    *
    */
  var datepickerOptions: js.UndefOr[js.Any] = js.native
  /**
    * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
    *
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets time zone offset from UTC, in minutes. The client date values are displayed with this offset instead of the local one.
    * Note: It is recommended that this option is used with an UTC value (e.g. "2016-11-03T14:08:08.504Z") so the outcome is consistent.
    * Values with ambiguous time zone could map to unpredictable times depending on the user agent local zone.
    *
    */
  var displayTimeOffset: js.UndefOr[js.Any] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for igDateEditor
    */
  var dropDownAnimationDuration: js.UndefOr[Double] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for igDatePicker
    */
  var dropDownAttachedToBody: js.UndefOr[Boolean] = js.native
  /**
    * This event is inherited from a parent widget and it's not triggered in igDatePicker
    */
  var dropDownItemSelected: js.UndefOr[DropDownItemSelectedEvent] = js.native
  /**
    * This event is inherited from a parent widget and it's not triggered in igDatePicker
    */
  var dropDownItemSelecting: js.UndefOr[DropDownItemSelectingEvent] = js.native
  /**
    * Fired after the drop down (calendar) is closed.
    */
  var dropDownListClosed: js.UndefOr[DropDownListClosedEvent] = js.native
  /**
    * This event is inherited from a parent widget and it's not triggered in igDatePicker
    */
  var dropDownListClosing: js.UndefOr[DropDownListClosingEvent] = js.native
  /**
    * Fired after the drop down is opened.
    */
  var dropDownListOpened: js.UndefOr[DropDownListOpenedEvent] = js.native
  /**
    * Fired when the drop down is opening.
    */
  var dropDownListOpening: js.UndefOr[DropDownListOpeningEvent] = js.native
  /**
    * Gets the ability to limit igDatePicker to be used only as s calendar. When set to true the editor input is not editable.
    * Note! This option can not be set runtime.
    *
    */
  var dropDownOnReadOnly: js.UndefOr[Boolean] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for igMaskEditor
    */
  var dropDownOrientation: js.UndefOr[String] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for igDateEditor
    */
  var emptyChar: js.UndefOr[String] = js.native
  /**
    * Enables/Disables serializing client date as UTC ISO 8061 string instead of using the local time and zone values.
    * The option is only applied in "date" [dataMode](ui.%%WidgetNameLowered%%#options:dataMode).
    *
    */
  var enableUTCDates: js.UndefOr[Boolean] = js.native
  /**
    * Gets ability to prevent entering specific characters from keyboard or on paste.
    * Notes:
    * If a character is specified in "includeKeys" option also, then "excludeKeys" has priority.
    * Note! This option can not be se runtime.
    *
    */
  var excludeKeys: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the height of the control.
    *
    *
    * Valid values:
    * "null" will fit the editor inside its parent container, if no other heights are defined.
    */
  var height: js.UndefOr[String | Double] = js.native
  /**
    * Gets ability to enter only specific characters in input-field from keyboard and on paste.
    * Notes:
    * If "excludeKeys" option contains same characters as this option, then "excludeKeys" has priority.
    * Note! This option can not be se runtime.
    *
    */
  var includeKeys: js.UndefOr[String] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for igDateEditor
    */
  var inputMask: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
    *
    */
  var inputName: js.UndefOr[String] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for igDatePicker
    */
  var isLimitedToListValues: js.UndefOr[Boolean] = js.native
  /**
    * Fired after a date selection in the calendar.
    */
  var itemSelected: js.UndefOr[ItemSelectedEvent] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Gets/Sets ability to modify only 1 date field on spin events.
    * Value false enables changes of other date fields when incremented or decremented date-field reaches its limits.
    * Value true modifies only value of one field.
    *
    */
  var limitSpinToCurrentField: js.UndefOr[Boolean] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for igDatePicker
    */
  var listItemHoverDuration: js.UndefOr[Double] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for igDatePicker
    */
  var listItems: js.UndefOr[js.Any] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for igDatePicker
    */
  var listWidth: js.UndefOr[Double] = js.native
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for igMaskEditor
    */
  var maxLength: js.UndefOr[js.Any] = js.native
  /**
    * Gets the maximum value which can be entered in editor by user. Date object can be set as value. String value can be passed and the editor will use the javascript Date object constructor to create date object and will use it for the comparison. MVC date format can be used too.
    * Note! This option doesn't use the dateInputFormat to extract the date.
    *
    */
  var maxValue: js.UndefOr[Date] = js.native
  /**
    * Gets the minimum value which can be entered in editor by user. Date object can be set as value. String value can be passed and the editor will use the javascript Date object constructor to create date object and will use it for the comparison. MVC date format can be used too.
    * Note! This option doesn't use the dateInputFormat to extract the date.
    *
    */
  var minValue: js.UndefOr[Date] = js.native
  /**
    * Gets/Sets the representation of null value. In case of default the value for the input is set to null, which makes the input to hold an empty string
    *
    */
  var nullValue: js.UndefOr[String | Double | Date] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for igDateEditor
    */
  var padChar: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the text which appears in the editor when it has no focus and the "value" is null or empty string.
    *
    */
  var placeHolder: js.UndefOr[String] = js.native
  /**
    * Gets/Sets if the editor should prevent form submit when enter key is pressed.
    *
    */
  var preventSubmitOnEnter: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets the readonly attribute for the input. If set to true the input is readonly, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is submitted.
    *
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Gets/Sets if the editor should revert it's value to the previously valid value in case the value on blur, or enter key is not valid. If the option is set to false, editor calls clear functionality.
    *
    */
  var revertIfNotValid: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets the action when the editor gets focused. The default value is selectAll.
    *
    *
    * Valid values:
    * "selectAll" Setting this option will select all the text into the editor when the edit mode gets entered.
    * "atStart" Setting this option will move the cursor at the beginning the text into the editor when the edit mode gets entered.
    * "atEnd" Setting this option will move the cursor at the end the text into the editor when the edit mode gets entered.
    * "browserDefault" Setting this option won't do any extra logic, but proceed with the browser default behavior.
    */
  var selectionOnFocus: js.UndefOr[String] = js.native
  /**
    * Gets/Sets delta-value which is used to increment or decrement the editor date on spin actions.When not editing (focused) the delta is applied on the day if available in the input mask or the lowest available period.
    * When in edit mode the time period, where the cursor is positioned, is incremented or decremented with the defined delta value.
    * Accepted values for deltas are positive integer numbers, and the fractional portion of floating point numbers is ignored.
    * spinDelta: {
    * year: 4,
    * month: 3,
    * day: 10,
    * hours: 12,
    * minutes: 15,
    * seconds: 10,
    * milliseconds: 100
    * }
    * Time periods that don't have values use 1 as default.
    *
    *
    * Valid values:
    * "number" Value this value it is applied to all time periods - years, days, minutes, etc.
    * "object" A configuration object, which defines specific values for each time period. The option can accept the following format:
    */
  var spinDelta: js.UndefOr[Double | js.Object] = js.native
  /**
    * Gets/Sets the ability of the editor to automatically change the hovered item into the opened dropdown list to its opposite side.
    */
  var spinWrapAround: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets whether the onscreen keyboard (if available on device) should be shown when the dropdown button is clicked/tapped. This option prevents initial focus or removes it when the drop button is clicked/tapped.
    * Note: The option does not perform device detection so its behavior is always active if enabled.
    *
    */
  var suppressKeyboard: js.UndefOr[Boolean] = js.native
  /**
    * Disables/Enables default notifications for basic validation scenarios built in the editors such as required list selection, value wrapping around or spin limits.
    *
    */
  var suppressNotifications: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets tabIndex attribute for the editor input.
    *
    */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the horizontal alignment of the text in the editor.
    *
    *
    * Valid values:
    * "left" The text into the input gets aligned to the left.
    * "right" The text into the input gets aligned to the right.
    * "center" The text into the input gets aligned to the center.
    */
  var textAlign: js.UndefOr[String] = js.native
  var textMode: js.UndefOr[js.Any] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for igDateEditor
    */
  var toLower: js.UndefOr[Boolean] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for igDateEditor
    */
  var toUpper: js.UndefOr[Boolean] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for igDateEditor
    */
  var unfilledCharsPrompt: js.UndefOr[String] = js.native
  /**
    * Gets/Sets options supported by the [igValidator](ui.igvalidator#options) widget.
    * Note: Validation rules of [igValidator](ui.igvalidator#options), such as min and max value/length are applied separately triggering errors,
    * while the corresponding options of the editor prevent values violating the defined rules from being entered.
    *
    */
  var validatorOptions: js.UndefOr[js.Any] = js.native
  /**
    * Gets/Sets the value of the editor. Date object can be set as value. String can be set and the editor will pass it to the Date object constructor and use the corresponding Date object as the value. MVC date format can be used too.
    * Note! This option doesn't use the dateInputFormat to extract the date.
    *
    */
  var value: js.UndefOr[Date] = js.native
  /**
    * Gets/Sets how many items should be shown at once.
    * Notes:
    * That option is overwritten if the number of list items is less than the value. In that case the height of the dropdown is adjusted to the number of items.
    * Note! This option can not be set runtime.
    */
  var visibleItemsCount: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the width of the control.
    *
    *
    * Valid values:
    * "null" will stretch to fit data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.native
  /**
    * Gets/Set value used to increase/decrease year part of the date, in order to set difference between year in Gregorian calendar and displayed year.
    *
    */
  var yearShift: js.UndefOr[Double] = js.native
}

object IgDatePicker {
  @scala.inline
  def apply(): IgDatePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDatePicker]
  }
  @scala.inline
  implicit class IgDatePickerOps[Self <: IgDatePicker] (val x: Self) extends AnyVal {
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
    def setAllowNullValue(value: Boolean): Self = this.set("allowNullValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNullValue: Self = this.set("allowNullValue", js.undefined)
    @scala.inline
    def setButtonType(value: String): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonType: Self = this.set("buttonType", js.undefined)
    @scala.inline
    def setCenturyThreshold(value: Double): Self = this.set("centuryThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenturyThreshold: Self = this.set("centuryThreshold", js.undefined)
    @scala.inline
    def setDataMode(value: String): Self = this.set("dataMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataMode: Self = this.set("dataMode", js.undefined)
    @scala.inline
    def setDateDisplayFormat(value: String): Self = this.set("dateDisplayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateDisplayFormat: Self = this.set("dateDisplayFormat", js.undefined)
    @scala.inline
    def setDateInputFormat(value: String): Self = this.set("dateInputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateInputFormat: Self = this.set("dateInputFormat", js.undefined)
    @scala.inline
    def setDatepickerOptions(value: js.Any): Self = this.set("datepickerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatepickerOptions: Self = this.set("datepickerOptions", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisplayTimeOffset(value: js.Any): Self = this.set("displayTimeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayTimeOffset: Self = this.set("displayTimeOffset", js.undefined)
    @scala.inline
    def setDropDownAnimationDuration(value: Double): Self = this.set("dropDownAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownAnimationDuration: Self = this.set("dropDownAnimationDuration", js.undefined)
    @scala.inline
    def setDropDownAttachedToBody(value: Boolean): Self = this.set("dropDownAttachedToBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownAttachedToBody: Self = this.set("dropDownAttachedToBody", js.undefined)
    @scala.inline
    def setDropDownItemSelected(value: (/* event */ Event, /* ui */ DropDownItemSelectedEventUIParam) => Unit): Self = this.set("dropDownItemSelected", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownItemSelected: Self = this.set("dropDownItemSelected", js.undefined)
    @scala.inline
    def setDropDownItemSelecting(value: (/* event */ Event, /* ui */ DropDownItemSelectingEventUIParam) => Unit): Self = this.set("dropDownItemSelecting", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownItemSelecting: Self = this.set("dropDownItemSelecting", js.undefined)
    @scala.inline
    def setDropDownListClosed(value: (/* event */ Event, /* ui */ DropDownListClosedEventUIParam) => Unit): Self = this.set("dropDownListClosed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownListClosed: Self = this.set("dropDownListClosed", js.undefined)
    @scala.inline
    def setDropDownListClosing(value: (/* event */ Event, /* ui */ DropDownListClosingEventUIParam) => Unit): Self = this.set("dropDownListClosing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownListClosing: Self = this.set("dropDownListClosing", js.undefined)
    @scala.inline
    def setDropDownListOpened(value: (/* event */ Event, /* ui */ DropDownListOpenedEventUIParam) => Unit): Self = this.set("dropDownListOpened", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownListOpened: Self = this.set("dropDownListOpened", js.undefined)
    @scala.inline
    def setDropDownListOpening(value: (/* event */ Event, /* ui */ DropDownListOpeningEventUIParam) => Unit): Self = this.set("dropDownListOpening", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownListOpening: Self = this.set("dropDownListOpening", js.undefined)
    @scala.inline
    def setDropDownOnReadOnly(value: Boolean): Self = this.set("dropDownOnReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownOnReadOnly: Self = this.set("dropDownOnReadOnly", js.undefined)
    @scala.inline
    def setDropDownOrientation(value: String): Self = this.set("dropDownOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownOrientation: Self = this.set("dropDownOrientation", js.undefined)
    @scala.inline
    def setEmptyChar(value: String): Self = this.set("emptyChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyChar: Self = this.set("emptyChar", js.undefined)
    @scala.inline
    def setEnableUTCDates(value: Boolean): Self = this.set("enableUTCDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableUTCDates: Self = this.set("enableUTCDates", js.undefined)
    @scala.inline
    def setExcludeKeys(value: String): Self = this.set("excludeKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeKeys: Self = this.set("excludeKeys", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIncludeKeys(value: String): Self = this.set("includeKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeKeys: Self = this.set("includeKeys", js.undefined)
    @scala.inline
    def setInputMask(value: String): Self = this.set("inputMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMask: Self = this.set("inputMask", js.undefined)
    @scala.inline
    def setInputName(value: String): Self = this.set("inputName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputName: Self = this.set("inputName", js.undefined)
    @scala.inline
    def setIsLimitedToListValues(value: Boolean): Self = this.set("isLimitedToListValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLimitedToListValues: Self = this.set("isLimitedToListValues", js.undefined)
    @scala.inline
    def setItemSelected(value: (/* event */ Event, /* ui */ ItemSelectedEventUIParam) => Unit): Self = this.set("itemSelected", js.Any.fromFunction2(value))
    @scala.inline
    def deleteItemSelected: Self = this.set("itemSelected", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLimitSpinToCurrentField(value: Boolean): Self = this.set("limitSpinToCurrentField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitSpinToCurrentField: Self = this.set("limitSpinToCurrentField", js.undefined)
    @scala.inline
    def setListItemHoverDuration(value: Double): Self = this.set("listItemHoverDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItemHoverDuration: Self = this.set("listItemHoverDuration", js.undefined)
    @scala.inline
    def setListItems(value: js.Any): Self = this.set("listItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItems: Self = this.set("listItems", js.undefined)
    @scala.inline
    def setListWidth(value: Double): Self = this.set("listWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListWidth: Self = this.set("listWidth", js.undefined)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxLength(value: js.Any): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMaxValue(value: Date): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Date): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setNullValue(value: String | Double | Date): Self = this.set("nullValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullValue: Self = this.set("nullValue", js.undefined)
    @scala.inline
    def setPadChar(value: String): Self = this.set("padChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadChar: Self = this.set("padChar", js.undefined)
    @scala.inline
    def setPlaceHolder(value: String): Self = this.set("placeHolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceHolder: Self = this.set("placeHolder", js.undefined)
    @scala.inline
    def setPreventSubmitOnEnter(value: Boolean): Self = this.set("preventSubmitOnEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventSubmitOnEnter: Self = this.set("preventSubmitOnEnter", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setRevertIfNotValid(value: Boolean): Self = this.set("revertIfNotValid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevertIfNotValid: Self = this.set("revertIfNotValid", js.undefined)
    @scala.inline
    def setSelectionOnFocus(value: String): Self = this.set("selectionOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionOnFocus: Self = this.set("selectionOnFocus", js.undefined)
    @scala.inline
    def setSpinDelta(value: Double | js.Object): Self = this.set("spinDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinDelta: Self = this.set("spinDelta", js.undefined)
    @scala.inline
    def setSpinWrapAround(value: Boolean): Self = this.set("spinWrapAround", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinWrapAround: Self = this.set("spinWrapAround", js.undefined)
    @scala.inline
    def setSuppressKeyboard(value: Boolean): Self = this.set("suppressKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressKeyboard: Self = this.set("suppressKeyboard", js.undefined)
    @scala.inline
    def setSuppressNotifications(value: Boolean): Self = this.set("suppressNotifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressNotifications: Self = this.set("suppressNotifications", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTextMode(value: js.Any): Self = this.set("textMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextMode: Self = this.set("textMode", js.undefined)
    @scala.inline
    def setToLower(value: Boolean): Self = this.set("toLower", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToLower: Self = this.set("toLower", js.undefined)
    @scala.inline
    def setToUpper(value: Boolean): Self = this.set("toUpper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToUpper: Self = this.set("toUpper", js.undefined)
    @scala.inline
    def setUnfilledCharsPrompt(value: String): Self = this.set("unfilledCharsPrompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnfilledCharsPrompt: Self = this.set("unfilledCharsPrompt", js.undefined)
    @scala.inline
    def setValidatorOptions(value: js.Any): Self = this.set("validatorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidatorOptions: Self = this.set("validatorOptions", js.undefined)
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVisibleItemsCount(value: Double): Self = this.set("visibleItemsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleItemsCount: Self = this.set("visibleItemsCount", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setYearShift(value: Double): Self = this.set("yearShift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearShift: Self = this.set("yearShift", js.undefined)
  }
  
}


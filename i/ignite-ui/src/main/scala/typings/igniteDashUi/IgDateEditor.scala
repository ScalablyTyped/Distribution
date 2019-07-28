package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDateEditor
  extends /**
	 * Option for igDateEditor
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets whether the editor value can become null.
  	 * If that option is false, and editor has no value, then value is set to an empty string.
  	 *
  	 */
  var allowNullValue: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets visibility of the spin and clear buttons. That option can be set only on initialization. Combinations like 'spin,clear' are supported too.
  	 *
  	 *
  	 * Valid values:
  	 * "clear" A button to clear the value is located on the right side of the editor.
  	 * "spin" Spin buttons are located on the right side of the editor
  	 */
  var buttonType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets year for auto detection of 20th and 21st centuries.
  	 * That option is used to automatically fill century when the user entered only 1 or 2 digits into the year field or when the date pattern contains only 1 or 2 year positions, e.g. "yy" or "y".
  	 * If user entered value larger than value of this option, then 20th century is used, otherwise the 21st.
  	 *
  	 */
  var centuryThreshold: js.UndefOr[Double] = js.undefined
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
  var dataMode: js.UndefOr[String] = js.undefined
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
  var dateDisplayFormat: js.UndefOr[String] = js.undefined
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
  var dateInputFormat: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
  	 *
  	 */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets time zone offset from UTC, in minutes. The client date values are displayed with this offset instead of the local one.
  	 * Note: It is recommended that this option is used with an UTC value (e.g. "2016-11-03T14:08:08.504Z") so the outcome is consistent.
  	 * Values with ambiguous time zone could map to unpredictable times depending on the user agent local zone.
  	 *
  	 */
  var displayTimeOffset: js.UndefOr[js.Any] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var dropDownAnimationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var dropDownAttachedToBody: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This event is inherited from a parent widget and it's not triggered in igDateEditor
  	 */
  var dropDownItemSelected: js.UndefOr[DropDownItemSelectedEvent] = js.undefined
  /**
  	 * This event is inherited from a parent widget and it's not triggered in igDateEditor
  	 */
  var dropDownItemSelecting: js.UndefOr[DropDownItemSelectingEvent] = js.undefined
  /**
  	 * This event is inherited from a parent widget and it's not triggered in igDateEditor
  	 */
  var dropDownListClosed: js.UndefOr[DropDownListClosedEvent] = js.undefined
  /**
  	 * This event is inherited from a parent widget and it's not triggered in igDateEditor
  	 */
  var dropDownListClosing: js.UndefOr[DropDownListClosingEvent] = js.undefined
  /**
  	 * This event is inherited from a parent widget and it's not triggered in igDateEditor
  	 */
  var dropDownListOpened: js.UndefOr[DropDownListOpenedEvent] = js.undefined
  /**
  	 * This event is inherited from a parent widget and it's not triggered in igDateEditor
  	 */
  var dropDownListOpening: js.UndefOr[DropDownListOpeningEvent] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var dropDownOnReadOnly: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igMaskEditor
  	 */
  var dropDownOrientation: js.UndefOr[String] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var emptyChar: js.UndefOr[String] = js.undefined
  /**
  	 * Enables/Disables serializing client date as UTC ISO 8061 string instead of using the local time and zone values.
  	 * The option is only applied in "date" [dataMode](ui.%%WidgetNameLowered%%#options:dataMode).
  	 *
  	 */
  var enableUTCDates: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets ability to prevent entering specific characters from keyboard or on paste.
  	 * Notes:
  	 * If a character is specified in "includeKeys" option also, then "excludeKeys" has priority.
  	 * Note! This option can not be se runtime.
  	 *
  	 */
  var excludeKeys: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the height of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will fit the editor inside its parent container, if no other heights are defined.
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Gets ability to enter only specific characters in input-field from keyboard and on paste.
  	 * Notes:
  	 * If "excludeKeys" option contains same characters as this option, then "excludeKeys" has priority.
  	 * Note! This option can not be se runtime.
  	 *
  	 */
  var includeKeys: js.UndefOr[String] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var inputMask: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
  	 *
  	 */
  var inputName: js.UndefOr[String] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var isLimitedToListValues: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets ability to modify only 1 date field on spin events.
  	 * Value false enables changes of other date fields when incremented or decremented date-field reaches its limits.
  	 * Value true modifies only value of one field.
  	 *
  	 */
  var limitSpinToCurrentField: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var listItemHoverDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var listItems: js.UndefOr[js.Any] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var listWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igMaskEditor
  	 */
  var maxLength: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the maximum value which can be entered in editor by user. Date object can be set as value. String value can be passed and the editor will use the javascript Date object constructor to create date object and will use it for the comparison. MVC date format can be used too.
  	 * Note! This option doesn't use the dateInputFormat to extract the date.
  	 *
  	 */
  var maxValue: js.UndefOr[Date] = js.undefined
  /**
  	 * Gets the minimum value which can be entered in editor by user. Date object can be set as value. String value can be passed and the editor will use the javascript Date object constructor to create date object and will use it for the comparison. MVC date format can be used too.
  	 * Note! This option doesn't use the dateInputFormat to extract the date.
  	 *
  	 */
  var minValue: js.UndefOr[Date] = js.undefined
  /**
  	 * Gets/Sets the representation of null value. In case of default the value for the input is set to null, which makes the input to hold an empty string
  	 *
  	 */
  var nullValue: js.UndefOr[String | Double | Date] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var padChar: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the text which appears in the editor when it has no focus and the "value" is null or empty string.
  	 *
  	 */
  var placeHolder: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets if the editor should prevent form submition when enter key is pressed.
  	 *
  	 */
  var preventSubmitOnEnter: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the readonly attribute for the input. If set to true the input is readonly, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is submitted.
  	 *
  	 */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Gets/Sets if the editor should revert it's value to the previously valid value in case the value on blur, or enter key is not valid. If the opiton is set to false, editor calls clear functionality.
  	 *
  	 */
  var revertIfNotValid: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the action when the editor gets focused. The default value is selectAll.
  	 *
  	 *
  	 * Valid values:
  	 * "selectAll" Setting this option will select all the text into the editor when the edit mode gets enetered.
  	 * "atStart" Setting this option will move the cursor at the begining the text into the editor when the edit mode gets enetered.
  	 * "atEnd" Setting this option will move the cursor at the end the text into the editor when the edit mode gets enetered.
  	 * "browserDefault" Setting this option won't do any extra logic, but proceed with the browser default behavior.
  	 */
  var selectionOnFocus: js.UndefOr[String] = js.undefined
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
  var spinDelta: js.UndefOr[Double | js.Object] = js.undefined
  /**
  	 * Gets/Sets the ability of the editor to automatically change the hoverd item into the opened dropdown list to its oposide side.
  	 */
  var spinWrapAround: js.UndefOr[Boolean] = js.undefined
  var suppressKeyboard: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Disables/Enables default notifications for basic validation scenarios built in the editors such as required list selection, value wrapping around or spin limits.
  	 *
  	 */
  var suppressNotifications: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets tabIndex attribute for the editor input.
  	 *
  	 */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets the horizontal alignment of the text in the editor.
  	 *
  	 *
  	 * Valid values:
  	 * "left" The text into the input gets aligned to the left.
  	 * "right" The text into the input gets aligned to the right.
  	 * "center" The text into the input gets aligned to the center.
  	 */
  var textAlign: js.UndefOr[String] = js.undefined
  var textMode: js.UndefOr[js.Any] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var toLower: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var toUpper: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var unfilledCharsPrompt: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets options supported by the [igValidator](ui.igvalidator#options) widget.
  	 * Note: Validation rules of [igValidator](ui.igvalidator#options), such as min and max value/length are applied separately triggering errors,
  	 * while the corresponding options of the editor prevent values violating the defined rules from being entered.
  	 *
  	 */
  var validatorOptions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets the value of the editor. Date object can be set as value. String can be set and the editor will pass it to the Date object constructor and use the corresponding Date object as the value. MVC date format can be used too.
  	 * Note! This option doesn't use the dateInputFormat to extract the date.
  	 *
  	 */
  var value: js.UndefOr[Date] = js.undefined
  /**
  	 * Gets/Sets how many items should be shown at once.
  	 * Notes:
  	 * That option is overwritten if the number of list items is less than the value. In that case the height of the dropdown is adjusted to the number of items.
  	 * Note! This option can not be set runtime.
  	 */
  var visibleItemsCount: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets the width of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will stretch to fit data, if no other widths are defined.
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Gets/Set value used to increase/decrease year part of the date, in order to set difference between year in Gregorian calendar and displayed year.
  	 *
  	 */
  var yearShift: js.UndefOr[Double] = js.undefined
}

object IgDateEditor {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igDateEditor
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowNullValue: js.UndefOr[Boolean] = js.undefined,
    buttonType: String = null,
    centuryThreshold: Int | Double = null,
    dataMode: String = null,
    dateDisplayFormat: String = null,
    dateInputFormat: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayTimeOffset: js.Any = null,
    dropDownAnimationDuration: Int | Double = null,
    dropDownAttachedToBody: js.UndefOr[Boolean] = js.undefined,
    dropDownItemSelected: DropDownItemSelectedEvent = null,
    dropDownItemSelecting: DropDownItemSelectingEvent = null,
    dropDownListClosed: DropDownListClosedEvent = null,
    dropDownListClosing: DropDownListClosingEvent = null,
    dropDownListOpened: DropDownListOpenedEvent = null,
    dropDownListOpening: DropDownListOpeningEvent = null,
    dropDownOnReadOnly: js.UndefOr[Boolean] = js.undefined,
    dropDownOrientation: String = null,
    emptyChar: String = null,
    enableUTCDates: js.UndefOr[Boolean] = js.undefined,
    excludeKeys: String = null,
    height: String | Double = null,
    includeKeys: String = null,
    inputMask: String = null,
    inputName: String = null,
    isLimitedToListValues: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    limitSpinToCurrentField: js.UndefOr[Boolean] = js.undefined,
    listItemHoverDuration: Int | Double = null,
    listItems: js.Any = null,
    listWidth: Int | Double = null,
    locale: js.Any = null,
    maxLength: js.Any = null,
    maxValue: Date = null,
    minValue: Date = null,
    nullValue: String | Double | Date = null,
    padChar: String = null,
    placeHolder: String = null,
    preventSubmitOnEnter: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    regional: String | js.Object = null,
    revertIfNotValid: js.UndefOr[Boolean] = js.undefined,
    selectionOnFocus: String = null,
    spinDelta: Double | js.Object = null,
    spinWrapAround: js.UndefOr[Boolean] = js.undefined,
    suppressKeyboard: js.UndefOr[Boolean] = js.undefined,
    suppressNotifications: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    textAlign: String = null,
    textMode: js.Any = null,
    toLower: js.UndefOr[Boolean] = js.undefined,
    toUpper: js.UndefOr[Boolean] = js.undefined,
    unfilledCharsPrompt: String = null,
    validatorOptions: js.Any = null,
    value: Date = null,
    visibleItemsCount: Int | Double = null,
    width: String | Double = null,
    yearShift: Int | Double = null
  ): IgDateEditor = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowNullValue)) __obj.updateDynamic("allowNullValue")(allowNullValue)
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType)
    if (centuryThreshold != null) __obj.updateDynamic("centuryThreshold")(centuryThreshold.asInstanceOf[js.Any])
    if (dataMode != null) __obj.updateDynamic("dataMode")(dataMode)
    if (dateDisplayFormat != null) __obj.updateDynamic("dateDisplayFormat")(dateDisplayFormat)
    if (dateInputFormat != null) __obj.updateDynamic("dateInputFormat")(dateInputFormat)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (displayTimeOffset != null) __obj.updateDynamic("displayTimeOffset")(displayTimeOffset)
    if (dropDownAnimationDuration != null) __obj.updateDynamic("dropDownAnimationDuration")(dropDownAnimationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(dropDownAttachedToBody)) __obj.updateDynamic("dropDownAttachedToBody")(dropDownAttachedToBody)
    if (dropDownItemSelected != null) __obj.updateDynamic("dropDownItemSelected")(dropDownItemSelected)
    if (dropDownItemSelecting != null) __obj.updateDynamic("dropDownItemSelecting")(dropDownItemSelecting)
    if (dropDownListClosed != null) __obj.updateDynamic("dropDownListClosed")(dropDownListClosed)
    if (dropDownListClosing != null) __obj.updateDynamic("dropDownListClosing")(dropDownListClosing)
    if (dropDownListOpened != null) __obj.updateDynamic("dropDownListOpened")(dropDownListOpened)
    if (dropDownListOpening != null) __obj.updateDynamic("dropDownListOpening")(dropDownListOpening)
    if (!js.isUndefined(dropDownOnReadOnly)) __obj.updateDynamic("dropDownOnReadOnly")(dropDownOnReadOnly)
    if (dropDownOrientation != null) __obj.updateDynamic("dropDownOrientation")(dropDownOrientation)
    if (emptyChar != null) __obj.updateDynamic("emptyChar")(emptyChar)
    if (!js.isUndefined(enableUTCDates)) __obj.updateDynamic("enableUTCDates")(enableUTCDates)
    if (excludeKeys != null) __obj.updateDynamic("excludeKeys")(excludeKeys)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (includeKeys != null) __obj.updateDynamic("includeKeys")(includeKeys)
    if (inputMask != null) __obj.updateDynamic("inputMask")(inputMask)
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (!js.isUndefined(isLimitedToListValues)) __obj.updateDynamic("isLimitedToListValues")(isLimitedToListValues)
    if (language != null) __obj.updateDynamic("language")(language)
    if (!js.isUndefined(limitSpinToCurrentField)) __obj.updateDynamic("limitSpinToCurrentField")(limitSpinToCurrentField)
    if (listItemHoverDuration != null) __obj.updateDynamic("listItemHoverDuration")(listItemHoverDuration.asInstanceOf[js.Any])
    if (listItems != null) __obj.updateDynamic("listItems")(listItems)
    if (listWidth != null) __obj.updateDynamic("listWidth")(listWidth.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (padChar != null) __obj.updateDynamic("padChar")(padChar)
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder)
    if (!js.isUndefined(preventSubmitOnEnter)) __obj.updateDynamic("preventSubmitOnEnter")(preventSubmitOnEnter)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (!js.isUndefined(revertIfNotValid)) __obj.updateDynamic("revertIfNotValid")(revertIfNotValid)
    if (selectionOnFocus != null) __obj.updateDynamic("selectionOnFocus")(selectionOnFocus)
    if (spinDelta != null) __obj.updateDynamic("spinDelta")(spinDelta.asInstanceOf[js.Any])
    if (!js.isUndefined(spinWrapAround)) __obj.updateDynamic("spinWrapAround")(spinWrapAround)
    if (!js.isUndefined(suppressKeyboard)) __obj.updateDynamic("suppressKeyboard")(suppressKeyboard)
    if (!js.isUndefined(suppressNotifications)) __obj.updateDynamic("suppressNotifications")(suppressNotifications)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textMode != null) __obj.updateDynamic("textMode")(textMode)
    if (!js.isUndefined(toLower)) __obj.updateDynamic("toLower")(toLower)
    if (!js.isUndefined(toUpper)) __obj.updateDynamic("toUpper")(toUpper)
    if (unfilledCharsPrompt != null) __obj.updateDynamic("unfilledCharsPrompt")(unfilledCharsPrompt)
    if (validatorOptions != null) __obj.updateDynamic("validatorOptions")(validatorOptions)
    if (value != null) __obj.updateDynamic("value")(value)
    if (visibleItemsCount != null) __obj.updateDynamic("visibleItemsCount")(visibleItemsCount.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (yearShift != null) __obj.updateDynamic("yearShift")(yearShift.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgDateEditor]
  }
}


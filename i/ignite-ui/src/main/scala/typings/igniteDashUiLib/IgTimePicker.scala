package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTimePicker
  extends /**
	 * Option for igTimePicker
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets/Sets whether the editor value can become null.
  	 * If that option is false, and editor has no value, then value is set to an empty string.
  	 *
  	 */
  var allowNullValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets visibility of the spin, clear and drop-down button. That option can be set only on initialization. Combinations like 'dropdown, clear' or 'spin, clear' are supported too.Note! This option can not be set runtime.
  	 * Note! A combination like 'dropdown, spin' is not allowed.
  	 *
  	 *
  	 * Valid values:
  	 * "dropdown" A button to open/close the list is located on the right side of the editor.
  	 * "clear" A button to clear the value is located on the right side of the editor.
  	 * "spin" Spin buttons are located on the right side of the editor.
  	 */
  var buttonType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets year for auto detection of 20th and 21st centuries.
  	 * That option is used to automatically fill century when the user entered only 1 or 2 digits into the year field or when the date pattern contains only 1 or 2 year positions, e.g. "yy" or "y".
  	 * If user entered value larger than value of this option, then 20th century is used, otherwise the 21st.
  	 *
  	 */
  var centuryThreshold: js.UndefOr[scala.Double] = js.undefined
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
  var dataMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Removed from timepicker options
  	 */
  var dateDisplayFormat: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Removed from timepicker options
  	 */
  var dateInputFormat: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
  	 *
  	 */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Removed from timepicker options
  	 */
  var displayTimeOffset: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets show/hide drop-down list animation duration in milliseconds.
  	 *
  	 */
  var dropDownAnimationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets wheather the drop-down list element is attached to the body of the document, or to the timepicker container element.
  	 * If the option is set to false the timepicker will attach the drop-down list element to the timepicker container
  	 * If the option is set to true the timepicker will attach its drop-down list to as a child of the body.
  	 * Note! This option can not be set runtime.
  	 *
  	 */
  var dropDownAttachedToBody: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Fired after an item in the drop down list is selected.
  	 */
  var dropDownItemSelected: js.UndefOr[DropDownItemSelectedEvent] = js.undefined
  /**
  	 * Fired when an item in the drop down list is being selected.
  	 */
  var dropDownItemSelecting: js.UndefOr[DropDownItemSelectingEvent] = js.undefined
  /**
  	 * Fired after the drop down is closed.
  	 */
  var dropDownListClosed: js.UndefOr[DropDownListClosedEvent] = js.undefined
  /**
  	 * Fired when the drop down is closing.
  	 */
  var dropDownListClosing: js.UndefOr[DropDownListClosingEvent] = js.undefined
  /**
  	 * Fired after the drop down is opened.
  	 */
  var dropDownListOpened: js.UndefOr[DropDownListOpenedEvent] = js.undefined
  /**
  	 * Fired when the drop down is opening.
  	 */
  var dropDownListOpening: js.UndefOr[DropDownListOpeningEvent] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var dropDownOnReadOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the drop-down list opening orientation when the list gets open. If the option is set to auto the timepicker has priority to open the drop-down list bottom. If the space is not enough it tries to open the list top. If the space is not enough in both directions then the list gets opened at the bottom of the editor.
  	 *
  	 *
  	 * Valid values:
  	 * "auto" If the option is set to auto the timepicker has priority to open the drop-down list bottom. If the space is not enough it tries to open the list top. If the space is not enough in both directions then the list gets opened at the bottom of the editor.
  	 * "bottom" The drop-down list is opened at the bottom of the timepicker.
  	 * "top" The drop-down list is opened at the top of the timepicker.
  	 */
  var dropDownOrientation: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var emptyChar: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Enables/Disables serializing client date as UTC ISO 8061 string instead of using the local time and zone values.
  	 * The option is only applied in "date" [dataMode](ui.%%WidgetNameLowered%%#options:dataMode).
  	 *
  	 */
  var enableUTCDates: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets ability to prevent entering specific characters from keyboard or on paste.
  	 * Notes:
  	 * If a character is specified in "includeKeys" option also, then "excludeKeys" has priority.
  	 * Note! This option can not be se runtime.
  	 *
  	 */
  var excludeKeys: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the height of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will fit the editor inside its parent container, if no other heights are defined.
  	 */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Gets ability to enter only specific characters in input-field from keyboard and on paste.
  	 * Notes:
  	 * If "excludeKeys" option contains same characters as this option, then "excludeKeys" has priority.
  	 * Note! This option can not be se runtime.
  	 *
  	 */
  var includeKeys: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var inputMask: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
  	 *
  	 */
  var inputName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets if the editor should only allow values from the list of items. Matching is case-insensitive.
  	 *
  	 */
  var isLimitedToListValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets delta-value which is used to generate the drop-down items for the time picker.
  	 * Accepted values for deltas are positive integer numbers, and the fractional portion of floating point numbers is ignored.
  	 *
  	 * object  A configuration object, which defines specific values for each time period. The option can accept the following format:
  	 * itemsDelta: {
  	 * hours: 0,
  	 * minutes: 30,
  	 * }
  	 * Time periods that don't have values use 0 as default for hours and 30 for minutes.
  	 */
  var itemsDelta: js.UndefOr[IgTimePickerItemsDelta] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets ability to modify only 1 date field on spin events.
  	 * Value false enables changes of other date fields when incremented or decremented date-field reaches its limits.
  	 * Value true modifies only value of one field.
  	 *
  	 */
  var limitSpinToCurrentField: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the hover/unhover animation duration of a drop-down list item.
  	 *
  	 */
  var listItemHoverDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var listItems: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets custom width of the drop-down list in pixels. If the value is equal to 0 or negative, then the width of timepicker is set as a drop-down width.
  	 *
  	 */
  var listWidth: js.UndefOr[scala.Double] = js.undefined
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
  var maxValue: js.UndefOr[stdLib.Date] = js.undefined
  /**
  	 * Gets the minimum value which can be entered in editor by user. Date object can be set as value. String value can be passed and the editor will use the javascript Date object constructor to create date object and will use it for the comparison. MVC date format can be used too.
  	 * Note! This option doesn't use the dateInputFormat to extract the date.
  	 *
  	 */
  var minValue: js.UndefOr[stdLib.Date] = js.undefined
  /**
  	 * Gets/Sets the representation of null value. In case of default the value for the input is set to null, which makes the input to hold an empty string
  	 *
  	 */
  var nullValue: js.UndefOr[java.lang.String | scala.Double | stdLib.Date] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var padChar: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the text which appears in the editor when it has no focus and the "value" is null or empty string.
  	 *
  	 */
  var placeHolder: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets if the editor should prevent form submition when enter key is pressed.
  	 *
  	 */
  var preventSubmitOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the readonly attribute for the input. If set to true the input is readonly, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is submitted.
  	 *
  	 */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Gets/Sets if the editor should revert it's value to the previously valid value in case the value on blur, or enter key is not valid. If the opiton is set to false, editor calls clear functionality.
  	 *
  	 */
  var revertIfNotValid: js.UndefOr[scala.Boolean] = js.undefined
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
  var selectionOnFocus: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets delta-value which is used to increment or decrement the editor time on spin actions.When not editing (focused) the delta is applied on the day if available in the input mask or the lowest available period.
  	 * When in edit mode the time period, where the cursor is positioned, is incremented or decremented with the defined delta value.
  	 * Accepted values for deltas are positive integer numbers, and the fractional portion of floating point numbers is ignored.
  	 * spinDelta: {
  	 * hours: 12,
  	 * minutes: 15
  	 * }
  	 * Default value is {hours: 1, minutes: 30}.
  	 *
  	 */
  var spinDelta: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Set the ability of the editor to automatically set value in the editor to the opposite side of the limit, when the spin action reaches minimum or maximum limit.
  	 * This applies to [minValue](ui.%%WidgetNameLowered%%#options:minValue) and [maxValue](ui.%%WidgetNameLowered%%#options:maxValue) or cycling through list items if [isLimitedToListValues](ui.%%WidgetNameLowered%%#options:isLimitedToListValues) is enabled.
  	 *
  	 */
  var spinWrapAround: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the onscreen keyboard (if available on device) should be shown when the dropdown button is clicked/tapped. This option prevents initial focus or removes it when the drop button is clicked/tapped.
  	 * Note: The option does not perform device detection so its behavior is always active if enabled.
  	 * Note: When drop down is opened the only way to close it will be using the drop down button.
  	 *
  	 */
  var suppressKeyboard: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Disables/Enables default notifications for basic validation scenarios built in the editors such as required list selection, value wrapping around or spin limits.
  	 *
  	 */
  var suppressNotifications: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets tabIndex attribute for the editor input.
  	 *
  	 */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the horizontal alignment of the text in the editor.
  	 *
  	 *
  	 * Valid values:
  	 * "left" The text into the input gets aligned to the left.
  	 * "right" The text into the input gets aligned to the right.
  	 * "center" The text into the input gets aligned to the center.
  	 */
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  var textMode: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets format of time while timepicker has no focus.
  	 * Value of that option can be set to a specific time pattern or to a flag defined by regional settings.
  	 * If value is not set, then the timeInputFormat is used automatically.
  	 * If value is set to explicit time pattern and pattern besides time-flags has explicit characters which match with time-flags or mask-flags, then the "escape" character should be used in front of them.
  	 * List of predefined regional flags:
  	 * "time": the timePattern member of regional option is used
  	 * List of explicit characters, which should have escape \\ character in front of them:
  	 * C, &, a, A, ?, L, 9, 0, #, >, <, y, M, d, h, H, m, s, t, f.
  	 * List of time-flags when explicit time pattern is used:
  	 * "t": first character of string which represents AM/PM field
  	 * "tt": 2 characters of string which represents AM/PM field
  	 * "h": hours field in 12-hours format without leading zero
  	 * "hh": hours field in 12-hours format with leading zero
  	 * "H": hours field in 24-hours format without leading zero
  	 * "HH": hours field in 24-hours format with leading zero
  	 * "m": minutes field without leading zero
  	 * "mm": minutes field with leading zero
  	 *
  	 */
  var timeDisplayFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets format of time while timepicker has focus.
  	 * Value of that option can be set to explicit time pattern or to a flag defined by regional settings.
  	 * If value is set to explicit time pattern and pattern besides date-flags has explicit characters which match with time-flags or mask-flags, then the "escape" character should be used in front of them.
  	 * If option is not set, then the "time" is used automatically.
  	 * List of predefined regional flags:
  	 * "time": the timePattern member of regional option is used
  	 * List of explicit characters, which should have escape \\ character in front of them: C, &, a, A, ?, L, 9, 0, #, >, <, y, M, d, h, H, m, s, t, f.
  	 * List of time-flags when explicit time pattern is used:
  	 * "t": first character of string which represents AM/PM field
  	 * "tt": 2 characters of string which represents AM/PM field
  	 * "hh": hours field in 12-hours format with leading zero
  	 * "HH": hours field in 24-hours format with leading zero
  	 * "mm": minutes field with leading zero
  	 * Note! This option can not be set runtime.
  	 *
  	 */
  var timeInputFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var toLower: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var toUpper: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var unfilledCharsPrompt: js.UndefOr[java.lang.String] = js.undefined
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
  var value: js.UndefOr[stdLib.Date] = js.undefined
  /**
  	 * Gets the number of the items to be shown at once when the drop-down list get opened.
  	 * Notes:
  	 * This option is overwritten if the number of list items is less than the set value. In that case the drop-down list displays all the items.
  	 * This option can not be set runtime.
  	 *
  	 */
  var visibleItemsCount: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the width of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will stretch to fit data, if no other widths are defined.
  	 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Removed from timepicker options
  	 */
  var yearShift: js.UndefOr[js.Any] = js.undefined
}

object IgTimePicker {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTimePicker
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    allowNullValue: js.UndefOr[scala.Boolean] = js.undefined,
    buttonType: java.lang.String = null,
    centuryThreshold: scala.Int | scala.Double = null,
    dataMode: java.lang.String = null,
    dateDisplayFormat: js.Any = null,
    dateInputFormat: js.Any = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    displayTimeOffset: js.Any = null,
    dropDownAnimationDuration: scala.Int | scala.Double = null,
    dropDownAttachedToBody: js.UndefOr[scala.Boolean] = js.undefined,
    dropDownItemSelected: DropDownItemSelectedEvent = null,
    dropDownItemSelecting: DropDownItemSelectingEvent = null,
    dropDownListClosed: DropDownListClosedEvent = null,
    dropDownListClosing: DropDownListClosingEvent = null,
    dropDownListOpened: DropDownListOpenedEvent = null,
    dropDownListOpening: DropDownListOpeningEvent = null,
    dropDownOnReadOnly: js.UndefOr[scala.Boolean] = js.undefined,
    dropDownOrientation: java.lang.String = null,
    emptyChar: java.lang.String = null,
    enableUTCDates: js.UndefOr[scala.Boolean] = js.undefined,
    excludeKeys: java.lang.String = null,
    height: java.lang.String | scala.Double = null,
    includeKeys: java.lang.String = null,
    inputMask: java.lang.String = null,
    inputName: java.lang.String = null,
    isLimitedToListValues: js.UndefOr[scala.Boolean] = js.undefined,
    itemsDelta: IgTimePickerItemsDelta = null,
    language: java.lang.String = null,
    limitSpinToCurrentField: js.UndefOr[scala.Boolean] = js.undefined,
    listItemHoverDuration: scala.Int | scala.Double = null,
    listItems: js.Any = null,
    listWidth: scala.Int | scala.Double = null,
    locale: js.Any = null,
    maxLength: js.Any = null,
    maxValue: stdLib.Date = null,
    minValue: stdLib.Date = null,
    nullValue: java.lang.String | scala.Double | stdLib.Date = null,
    padChar: java.lang.String = null,
    placeHolder: java.lang.String = null,
    preventSubmitOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    regional: java.lang.String | js.Object = null,
    revertIfNotValid: js.UndefOr[scala.Boolean] = js.undefined,
    selectionOnFocus: java.lang.String = null,
    spinDelta: js.Any = null,
    spinWrapAround: js.UndefOr[scala.Boolean] = js.undefined,
    suppressKeyboard: js.UndefOr[scala.Boolean] = js.undefined,
    suppressNotifications: js.UndefOr[scala.Boolean] = js.undefined,
    tabIndex: scala.Int | scala.Double = null,
    textAlign: java.lang.String = null,
    textMode: js.Any = null,
    timeDisplayFormat: java.lang.String = null,
    timeInputFormat: java.lang.String = null,
    toLower: js.UndefOr[scala.Boolean] = js.undefined,
    toUpper: js.UndefOr[scala.Boolean] = js.undefined,
    unfilledCharsPrompt: java.lang.String = null,
    validatorOptions: js.Any = null,
    value: stdLib.Date = null,
    visibleItemsCount: scala.Int | scala.Double = null,
    width: java.lang.String | scala.Double = null,
    yearShift: js.Any = null
  ): IgTimePicker = {
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
    if (itemsDelta != null) __obj.updateDynamic("itemsDelta")(itemsDelta)
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
    if (spinDelta != null) __obj.updateDynamic("spinDelta")(spinDelta)
    if (!js.isUndefined(spinWrapAround)) __obj.updateDynamic("spinWrapAround")(spinWrapAround)
    if (!js.isUndefined(suppressKeyboard)) __obj.updateDynamic("suppressKeyboard")(suppressKeyboard)
    if (!js.isUndefined(suppressNotifications)) __obj.updateDynamic("suppressNotifications")(suppressNotifications)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textMode != null) __obj.updateDynamic("textMode")(textMode)
    if (timeDisplayFormat != null) __obj.updateDynamic("timeDisplayFormat")(timeDisplayFormat)
    if (timeInputFormat != null) __obj.updateDynamic("timeInputFormat")(timeInputFormat)
    if (!js.isUndefined(toLower)) __obj.updateDynamic("toLower")(toLower)
    if (!js.isUndefined(toUpper)) __obj.updateDynamic("toUpper")(toUpper)
    if (unfilledCharsPrompt != null) __obj.updateDynamic("unfilledCharsPrompt")(unfilledCharsPrompt)
    if (validatorOptions != null) __obj.updateDynamic("validatorOptions")(validatorOptions)
    if (value != null) __obj.updateDynamic("value")(value)
    if (visibleItemsCount != null) __obj.updateDynamic("visibleItemsCount")(visibleItemsCount.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (yearShift != null) __obj.updateDynamic("yearShift")(yearShift)
    __obj.asInstanceOf[IgTimePicker]
  }
}


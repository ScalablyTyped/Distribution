package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTimePicker
  extends /**
	 * Option for igTimePicker
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets whether the editor value can become null.
  	 * If that option is false, and editor has no value, then value is set to an empty string.
  	 *
  	 */
  var allowNullValue: js.UndefOr[Boolean] = js.undefined
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
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Removed from timepicker options
  	 */
  var displayTimeOffset: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets show/hide drop-down list animation duration in milliseconds.
  	 *
  	 */
  var dropDownAnimationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets wheather the drop-down list element is attached to the body of the document, or to the timepicker container element.
  	 * If the option is set to false the timepicker will attach the drop-down list element to the timepicker container
  	 * If the option is set to true the timepicker will attach its drop-down list to as a child of the body.
  	 * Note! This option can not be set runtime.
  	 *
  	 */
  var dropDownAttachedToBody: js.UndefOr[Boolean] = js.undefined
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
  var dropDownOnReadOnly: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the drop-down list opening orientation when the list gets open. If the option is set to auto the timepicker has priority to open the drop-down list bottom. If the space is not enough it tries to open the list top. If the space is not enough in both directions then the list gets opened at the bottom of the editor.
  	 *
  	 *
  	 * Valid values:
  	 * "auto" If the option is set to auto the timepicker has priority to open the drop-down list bottom. If the space is not enough it tries to open the list top. If the space is not enough in both directions then the list gets opened at the bottom of the editor.
  	 * "bottom" The drop-down list is opened at the bottom of the timepicker.
  	 * "top" The drop-down list is opened at the top of the timepicker.
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
  	 * Gets/Sets if the editor should only allow values from the list of items. Matching is case-insensitive.
  	 *
  	 */
  var isLimitedToListValues: js.UndefOr[Boolean] = js.undefined
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
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets ability to modify only 1 date field on spin events.
  	 * Value false enables changes of other date fields when incremented or decremented date-field reaches its limits.
  	 * Value true modifies only value of one field.
  	 *
  	 */
  var limitSpinToCurrentField: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the hover/unhover animation duration of a drop-down list item.
  	 *
  	 */
  var listItemHoverDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var listItems: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets custom width of the drop-down list in pixels. If the value is equal to 0 or negative, then the width of timepicker is set as a drop-down width.
  	 *
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
  var spinWrapAround: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the onscreen keyboard (if available on device) should be shown when the dropdown button is clicked/tapped. This option prevents initial focus or removes it when the drop button is clicked/tapped.
  	 * Note: The option does not perform device detection so its behavior is always active if enabled.
  	 * Note: When drop down is opened the only way to close it will be using the drop down button.
  	 *
  	 */
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
  var timeDisplayFormat: js.UndefOr[String] = js.undefined
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
  var timeInputFormat: js.UndefOr[String] = js.undefined
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
  	 * Gets the number of the items to be shown at once when the drop-down list get opened.
  	 * Notes:
  	 * This option is overwritten if the number of list items is less than the set value. In that case the drop-down list displays all the items.
  	 * This option can not be set runtime.
  	 *
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
  /* optionName */ StringDictionary[js.Any] = null,
    allowNullValue: js.UndefOr[Boolean] = js.undefined,
    buttonType: String = null,
    centuryThreshold: Int | Double = null,
    dataMode: String = null,
    dateDisplayFormat: js.Any = null,
    dateInputFormat: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayTimeOffset: js.Any = null,
    dropDownAnimationDuration: Int | Double = null,
    dropDownAttachedToBody: js.UndefOr[Boolean] = js.undefined,
    dropDownItemSelected: (/* event */ Event, /* ui */ DropDownItemSelectedEventUIParam) => Unit = null,
    dropDownItemSelecting: (/* event */ Event, /* ui */ DropDownItemSelectingEventUIParam) => Unit = null,
    dropDownListClosed: (/* event */ Event, /* ui */ DropDownListClosedEventUIParam) => Unit = null,
    dropDownListClosing: (/* event */ Event, /* ui */ DropDownListClosingEventUIParam) => Unit = null,
    dropDownListOpened: (/* event */ Event, /* ui */ DropDownListOpenedEventUIParam) => Unit = null,
    dropDownListOpening: (/* event */ Event, /* ui */ DropDownListOpeningEventUIParam) => Unit = null,
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
    itemsDelta: IgTimePickerItemsDelta = null,
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
    spinDelta: js.Any = null,
    spinWrapAround: js.UndefOr[Boolean] = js.undefined,
    suppressKeyboard: js.UndefOr[Boolean] = js.undefined,
    suppressNotifications: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    textAlign: String = null,
    textMode: js.Any = null,
    timeDisplayFormat: String = null,
    timeInputFormat: String = null,
    toLower: js.UndefOr[Boolean] = js.undefined,
    toUpper: js.UndefOr[Boolean] = js.undefined,
    unfilledCharsPrompt: String = null,
    validatorOptions: js.Any = null,
    value: Date = null,
    visibleItemsCount: Int | Double = null,
    width: String | Double = null,
    yearShift: js.Any = null
  ): IgTimePicker = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowNullValue)) __obj.updateDynamic("allowNullValue")(allowNullValue.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (centuryThreshold != null) __obj.updateDynamic("centuryThreshold")(centuryThreshold.asInstanceOf[js.Any])
    if (dataMode != null) __obj.updateDynamic("dataMode")(dataMode.asInstanceOf[js.Any])
    if (dateDisplayFormat != null) __obj.updateDynamic("dateDisplayFormat")(dateDisplayFormat.asInstanceOf[js.Any])
    if (dateInputFormat != null) __obj.updateDynamic("dateInputFormat")(dateInputFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayTimeOffset != null) __obj.updateDynamic("displayTimeOffset")(displayTimeOffset.asInstanceOf[js.Any])
    if (dropDownAnimationDuration != null) __obj.updateDynamic("dropDownAnimationDuration")(dropDownAnimationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(dropDownAttachedToBody)) __obj.updateDynamic("dropDownAttachedToBody")(dropDownAttachedToBody.asInstanceOf[js.Any])
    if (dropDownItemSelected != null) __obj.updateDynamic("dropDownItemSelected")(js.Any.fromFunction2(dropDownItemSelected))
    if (dropDownItemSelecting != null) __obj.updateDynamic("dropDownItemSelecting")(js.Any.fromFunction2(dropDownItemSelecting))
    if (dropDownListClosed != null) __obj.updateDynamic("dropDownListClosed")(js.Any.fromFunction2(dropDownListClosed))
    if (dropDownListClosing != null) __obj.updateDynamic("dropDownListClosing")(js.Any.fromFunction2(dropDownListClosing))
    if (dropDownListOpened != null) __obj.updateDynamic("dropDownListOpened")(js.Any.fromFunction2(dropDownListOpened))
    if (dropDownListOpening != null) __obj.updateDynamic("dropDownListOpening")(js.Any.fromFunction2(dropDownListOpening))
    if (!js.isUndefined(dropDownOnReadOnly)) __obj.updateDynamic("dropDownOnReadOnly")(dropDownOnReadOnly.asInstanceOf[js.Any])
    if (dropDownOrientation != null) __obj.updateDynamic("dropDownOrientation")(dropDownOrientation.asInstanceOf[js.Any])
    if (emptyChar != null) __obj.updateDynamic("emptyChar")(emptyChar.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUTCDates)) __obj.updateDynamic("enableUTCDates")(enableUTCDates.asInstanceOf[js.Any])
    if (excludeKeys != null) __obj.updateDynamic("excludeKeys")(excludeKeys.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (includeKeys != null) __obj.updateDynamic("includeKeys")(includeKeys.asInstanceOf[js.Any])
    if (inputMask != null) __obj.updateDynamic("inputMask")(inputMask.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName.asInstanceOf[js.Any])
    if (!js.isUndefined(isLimitedToListValues)) __obj.updateDynamic("isLimitedToListValues")(isLimitedToListValues.asInstanceOf[js.Any])
    if (itemsDelta != null) __obj.updateDynamic("itemsDelta")(itemsDelta.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(limitSpinToCurrentField)) __obj.updateDynamic("limitSpinToCurrentField")(limitSpinToCurrentField.asInstanceOf[js.Any])
    if (listItemHoverDuration != null) __obj.updateDynamic("listItemHoverDuration")(listItemHoverDuration.asInstanceOf[js.Any])
    if (listItems != null) __obj.updateDynamic("listItems")(listItems.asInstanceOf[js.Any])
    if (listWidth != null) __obj.updateDynamic("listWidth")(listWidth.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (padChar != null) __obj.updateDynamic("padChar")(padChar.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    if (!js.isUndefined(preventSubmitOnEnter)) __obj.updateDynamic("preventSubmitOnEnter")(preventSubmitOnEnter.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (!js.isUndefined(revertIfNotValid)) __obj.updateDynamic("revertIfNotValid")(revertIfNotValid.asInstanceOf[js.Any])
    if (selectionOnFocus != null) __obj.updateDynamic("selectionOnFocus")(selectionOnFocus.asInstanceOf[js.Any])
    if (spinDelta != null) __obj.updateDynamic("spinDelta")(spinDelta.asInstanceOf[js.Any])
    if (!js.isUndefined(spinWrapAround)) __obj.updateDynamic("spinWrapAround")(spinWrapAround.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressKeyboard)) __obj.updateDynamic("suppressKeyboard")(suppressKeyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressNotifications)) __obj.updateDynamic("suppressNotifications")(suppressNotifications.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textMode != null) __obj.updateDynamic("textMode")(textMode.asInstanceOf[js.Any])
    if (timeDisplayFormat != null) __obj.updateDynamic("timeDisplayFormat")(timeDisplayFormat.asInstanceOf[js.Any])
    if (timeInputFormat != null) __obj.updateDynamic("timeInputFormat")(timeInputFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(toLower)) __obj.updateDynamic("toLower")(toLower.asInstanceOf[js.Any])
    if (!js.isUndefined(toUpper)) __obj.updateDynamic("toUpper")(toUpper.asInstanceOf[js.Any])
    if (unfilledCharsPrompt != null) __obj.updateDynamic("unfilledCharsPrompt")(unfilledCharsPrompt.asInstanceOf[js.Any])
    if (validatorOptions != null) __obj.updateDynamic("validatorOptions")(validatorOptions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (visibleItemsCount != null) __obj.updateDynamic("visibleItemsCount")(visibleItemsCount.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (yearShift != null) __obj.updateDynamic("yearShift")(yearShift.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTimePicker]
  }
}


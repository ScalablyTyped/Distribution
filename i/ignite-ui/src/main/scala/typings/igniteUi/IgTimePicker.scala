package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTimePicker
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
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
    * Gets whether the drop-down list element is attached to the body of the document, or to the timepicker container element.
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
    * Gets/Sets if the editor should prevent form submit when enter key is pressed.
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
    * Gets/Sets if the editor should revert it's value to the previously valid value in case the value on blur, or enter key is not valid. If the option is set to false, editor calls clear functionality.
    *
    */
  var revertIfNotValid: js.UndefOr[Boolean] = js.undefined
  
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
  
  inline def apply(): IgTimePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTimePicker]
  }
  
  extension [Self <: IgTimePicker](x: Self) {
    
    inline def setAllowNullValue(value: Boolean): Self = StObject.set(x, "allowNullValue", value.asInstanceOf[js.Any])
    
    inline def setAllowNullValueUndefined: Self = StObject.set(x, "allowNullValue", js.undefined)
    
    inline def setButtonType(value: String): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
    
    inline def setCenturyThreshold(value: Double): Self = StObject.set(x, "centuryThreshold", value.asInstanceOf[js.Any])
    
    inline def setCenturyThresholdUndefined: Self = StObject.set(x, "centuryThreshold", js.undefined)
    
    inline def setDataMode(value: String): Self = StObject.set(x, "dataMode", value.asInstanceOf[js.Any])
    
    inline def setDataModeUndefined: Self = StObject.set(x, "dataMode", js.undefined)
    
    inline def setDateDisplayFormat(value: js.Any): Self = StObject.set(x, "dateDisplayFormat", value.asInstanceOf[js.Any])
    
    inline def setDateDisplayFormatUndefined: Self = StObject.set(x, "dateDisplayFormat", js.undefined)
    
    inline def setDateInputFormat(value: js.Any): Self = StObject.set(x, "dateInputFormat", value.asInstanceOf[js.Any])
    
    inline def setDateInputFormatUndefined: Self = StObject.set(x, "dateInputFormat", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayTimeOffset(value: js.Any): Self = StObject.set(x, "displayTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setDisplayTimeOffsetUndefined: Self = StObject.set(x, "displayTimeOffset", js.undefined)
    
    inline def setDropDownAnimationDuration(value: Double): Self = StObject.set(x, "dropDownAnimationDuration", value.asInstanceOf[js.Any])
    
    inline def setDropDownAnimationDurationUndefined: Self = StObject.set(x, "dropDownAnimationDuration", js.undefined)
    
    inline def setDropDownAttachedToBody(value: Boolean): Self = StObject.set(x, "dropDownAttachedToBody", value.asInstanceOf[js.Any])
    
    inline def setDropDownAttachedToBodyUndefined: Self = StObject.set(x, "dropDownAttachedToBody", js.undefined)
    
    inline def setDropDownItemSelected(value: (/* event */ Event, /* ui */ DropDownItemSelectedEventUIParam) => Unit): Self = StObject.set(x, "dropDownItemSelected", js.Any.fromFunction2(value))
    
    inline def setDropDownItemSelectedUndefined: Self = StObject.set(x, "dropDownItemSelected", js.undefined)
    
    inline def setDropDownItemSelecting(value: (/* event */ Event, /* ui */ DropDownItemSelectingEventUIParam) => Unit): Self = StObject.set(x, "dropDownItemSelecting", js.Any.fromFunction2(value))
    
    inline def setDropDownItemSelectingUndefined: Self = StObject.set(x, "dropDownItemSelecting", js.undefined)
    
    inline def setDropDownListClosed(value: (/* event */ Event, /* ui */ DropDownListClosedEventUIParam) => Unit): Self = StObject.set(x, "dropDownListClosed", js.Any.fromFunction2(value))
    
    inline def setDropDownListClosedUndefined: Self = StObject.set(x, "dropDownListClosed", js.undefined)
    
    inline def setDropDownListClosing(value: (/* event */ Event, /* ui */ DropDownListClosingEventUIParam) => Unit): Self = StObject.set(x, "dropDownListClosing", js.Any.fromFunction2(value))
    
    inline def setDropDownListClosingUndefined: Self = StObject.set(x, "dropDownListClosing", js.undefined)
    
    inline def setDropDownListOpened(value: (/* event */ Event, /* ui */ DropDownListOpenedEventUIParam) => Unit): Self = StObject.set(x, "dropDownListOpened", js.Any.fromFunction2(value))
    
    inline def setDropDownListOpenedUndefined: Self = StObject.set(x, "dropDownListOpened", js.undefined)
    
    inline def setDropDownListOpening(value: (/* event */ Event, /* ui */ DropDownListOpeningEventUIParam) => Unit): Self = StObject.set(x, "dropDownListOpening", js.Any.fromFunction2(value))
    
    inline def setDropDownListOpeningUndefined: Self = StObject.set(x, "dropDownListOpening", js.undefined)
    
    inline def setDropDownOnReadOnly(value: Boolean): Self = StObject.set(x, "dropDownOnReadOnly", value.asInstanceOf[js.Any])
    
    inline def setDropDownOnReadOnlyUndefined: Self = StObject.set(x, "dropDownOnReadOnly", js.undefined)
    
    inline def setDropDownOrientation(value: String): Self = StObject.set(x, "dropDownOrientation", value.asInstanceOf[js.Any])
    
    inline def setDropDownOrientationUndefined: Self = StObject.set(x, "dropDownOrientation", js.undefined)
    
    inline def setEmptyChar(value: String): Self = StObject.set(x, "emptyChar", value.asInstanceOf[js.Any])
    
    inline def setEmptyCharUndefined: Self = StObject.set(x, "emptyChar", js.undefined)
    
    inline def setEnableUTCDates(value: Boolean): Self = StObject.set(x, "enableUTCDates", value.asInstanceOf[js.Any])
    
    inline def setEnableUTCDatesUndefined: Self = StObject.set(x, "enableUTCDates", js.undefined)
    
    inline def setExcludeKeys(value: String): Self = StObject.set(x, "excludeKeys", value.asInstanceOf[js.Any])
    
    inline def setExcludeKeysUndefined: Self = StObject.set(x, "excludeKeys", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIncludeKeys(value: String): Self = StObject.set(x, "includeKeys", value.asInstanceOf[js.Any])
    
    inline def setIncludeKeysUndefined: Self = StObject.set(x, "includeKeys", js.undefined)
    
    inline def setInputMask(value: String): Self = StObject.set(x, "inputMask", value.asInstanceOf[js.Any])
    
    inline def setInputMaskUndefined: Self = StObject.set(x, "inputMask", js.undefined)
    
    inline def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    inline def setIsLimitedToListValues(value: Boolean): Self = StObject.set(x, "isLimitedToListValues", value.asInstanceOf[js.Any])
    
    inline def setIsLimitedToListValuesUndefined: Self = StObject.set(x, "isLimitedToListValues", js.undefined)
    
    inline def setItemsDelta(value: IgTimePickerItemsDelta): Self = StObject.set(x, "itemsDelta", value.asInstanceOf[js.Any])
    
    inline def setItemsDeltaUndefined: Self = StObject.set(x, "itemsDelta", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLimitSpinToCurrentField(value: Boolean): Self = StObject.set(x, "limitSpinToCurrentField", value.asInstanceOf[js.Any])
    
    inline def setLimitSpinToCurrentFieldUndefined: Self = StObject.set(x, "limitSpinToCurrentField", js.undefined)
    
    inline def setListItemHoverDuration(value: Double): Self = StObject.set(x, "listItemHoverDuration", value.asInstanceOf[js.Any])
    
    inline def setListItemHoverDurationUndefined: Self = StObject.set(x, "listItemHoverDuration", js.undefined)
    
    inline def setListItems(value: js.Any): Self = StObject.set(x, "listItems", value.asInstanceOf[js.Any])
    
    inline def setListItemsUndefined: Self = StObject.set(x, "listItems", js.undefined)
    
    inline def setListWidth(value: Double): Self = StObject.set(x, "listWidth", value.asInstanceOf[js.Any])
    
    inline def setListWidthUndefined: Self = StObject.set(x, "listWidth", js.undefined)
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxLength(value: js.Any): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaxValue(value: Date): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Date): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setNullValue(value: String | Double | Date): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    inline def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    inline def setPadChar(value: String): Self = StObject.set(x, "padChar", value.asInstanceOf[js.Any])
    
    inline def setPadCharUndefined: Self = StObject.set(x, "padChar", js.undefined)
    
    inline def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    inline def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
    
    inline def setPreventSubmitOnEnter(value: Boolean): Self = StObject.set(x, "preventSubmitOnEnter", value.asInstanceOf[js.Any])
    
    inline def setPreventSubmitOnEnterUndefined: Self = StObject.set(x, "preventSubmitOnEnter", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setRevertIfNotValid(value: Boolean): Self = StObject.set(x, "revertIfNotValid", value.asInstanceOf[js.Any])
    
    inline def setRevertIfNotValidUndefined: Self = StObject.set(x, "revertIfNotValid", js.undefined)
    
    inline def setSelectionOnFocus(value: String): Self = StObject.set(x, "selectionOnFocus", value.asInstanceOf[js.Any])
    
    inline def setSelectionOnFocusUndefined: Self = StObject.set(x, "selectionOnFocus", js.undefined)
    
    inline def setSpinDelta(value: js.Any): Self = StObject.set(x, "spinDelta", value.asInstanceOf[js.Any])
    
    inline def setSpinDeltaUndefined: Self = StObject.set(x, "spinDelta", js.undefined)
    
    inline def setSpinWrapAround(value: Boolean): Self = StObject.set(x, "spinWrapAround", value.asInstanceOf[js.Any])
    
    inline def setSpinWrapAroundUndefined: Self = StObject.set(x, "spinWrapAround", js.undefined)
    
    inline def setSuppressKeyboard(value: Boolean): Self = StObject.set(x, "suppressKeyboard", value.asInstanceOf[js.Any])
    
    inline def setSuppressKeyboardUndefined: Self = StObject.set(x, "suppressKeyboard", js.undefined)
    
    inline def setSuppressNotifications(value: Boolean): Self = StObject.set(x, "suppressNotifications", value.asInstanceOf[js.Any])
    
    inline def setSuppressNotificationsUndefined: Self = StObject.set(x, "suppressNotifications", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextMode(value: js.Any): Self = StObject.set(x, "textMode", value.asInstanceOf[js.Any])
    
    inline def setTextModeUndefined: Self = StObject.set(x, "textMode", js.undefined)
    
    inline def setTimeDisplayFormat(value: String): Self = StObject.set(x, "timeDisplayFormat", value.asInstanceOf[js.Any])
    
    inline def setTimeDisplayFormatUndefined: Self = StObject.set(x, "timeDisplayFormat", js.undefined)
    
    inline def setTimeInputFormat(value: String): Self = StObject.set(x, "timeInputFormat", value.asInstanceOf[js.Any])
    
    inline def setTimeInputFormatUndefined: Self = StObject.set(x, "timeInputFormat", js.undefined)
    
    inline def setToLower(value: Boolean): Self = StObject.set(x, "toLower", value.asInstanceOf[js.Any])
    
    inline def setToLowerUndefined: Self = StObject.set(x, "toLower", js.undefined)
    
    inline def setToUpper(value: Boolean): Self = StObject.set(x, "toUpper", value.asInstanceOf[js.Any])
    
    inline def setToUpperUndefined: Self = StObject.set(x, "toUpper", js.undefined)
    
    inline def setUnfilledCharsPrompt(value: String): Self = StObject.set(x, "unfilledCharsPrompt", value.asInstanceOf[js.Any])
    
    inline def setUnfilledCharsPromptUndefined: Self = StObject.set(x, "unfilledCharsPrompt", js.undefined)
    
    inline def setValidatorOptions(value: js.Any): Self = StObject.set(x, "validatorOptions", value.asInstanceOf[js.Any])
    
    inline def setValidatorOptionsUndefined: Self = StObject.set(x, "validatorOptions", js.undefined)
    
    inline def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisibleItemsCount(value: Double): Self = StObject.set(x, "visibleItemsCount", value.asInstanceOf[js.Any])
    
    inline def setVisibleItemsCountUndefined: Self = StObject.set(x, "visibleItemsCount", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setYearShift(value: js.Any): Self = StObject.set(x, "yearShift", value.asInstanceOf[js.Any])
    
    inline def setYearShiftUndefined: Self = StObject.set(x, "yearShift", js.undefined)
  }
}

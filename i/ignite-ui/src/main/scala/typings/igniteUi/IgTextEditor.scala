package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTextEditor
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
    * Fired when the input field of the editor loses focus.
    */
  var blur: js.UndefOr[BlurEvent] = js.undefined
  
  /**
    * Gets visibility of the spin, clear and drop-down button. That option can be set only on initialization. Combinations like 'dropdown,spin' or 'spin,clear' are supported too.Note! This option can not be set runtime.
    *
    *
    * Valid values:
    * "dropdown" A button to open/close the list is located on the right side of the editor.
    * "clear" A button to clear the value is located on the right side of the editor.
    * "spin" Spin buttons are located on the right side of the editor.
    */
  var buttonType: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
    *
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets show/hide drop-down list animation duration in milliseconds.
    *
    */
  var dropDownAnimationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets whether the drop-down list element is attached to the body of the document, or to the editor container element.
    * If the option is set to false the editor will attach the drop-down list element to the editor container
    * If the option is set to true the editor will attach its drop-down list to as a child of the body.
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
    * Gets the ability to limit the editor to be used only as a dropdown list. When set to true the editor input is not editable.
    * Note! In case there are no list items - the editor will remain readonly
    * Note! This option can not be set runtime.
    *
    */
  var dropDownOnReadOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets the drop-down list opening orientation when the list gets open. If the option is set to auto the editor has priority to open the drop-down list bottom. If the space is not enough it tries to open the list top. If the space is not enough in both directions then the list gets opened at the bottom of the editor.
    *
    *
    * Valid values:
    * "auto" If the option is set to auto the editor has priority to open the drop-down list bottom. If the space is not enough it tries to open the list top. If the space is not enough in both directions then the list gets opened at the bottom of the editor.
    * "bottom" The drop-down list is opened at the bottom of the editor.
    * "top" The drop-down list is opened at the top of the editor.
    */
  var dropDownOrientation: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the ability of the editor to prevent entering specific characters from the keyboard or on paste.
    * Notes:
    * If both "excludeKeys" and "includeKeys" options are used, then "excludeKeys" has priority and includeKeys options is not respected.
    * The option is case sensitive! If the option is set runtime it's not applied on the current value.
    *
    */
  var excludeKeys: js.UndefOr[String] = js.undefined
  
  /**
    * Fired when the input field of the editor gets focus.
    */
  var focus: js.UndefOr[IgFocusEvent] = js.undefined
  
  /**
    * Gets/Sets the height of the control.
    *
    *
    * Valid values:
    * "null" will fit the editor inside its parent container, if no other heights are defined.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Gets/Sets the ability of the editor to allow entering only specific characters in the input-field from the keyboard and on paste.
    * Notes:
    * If both "excludeKeys" and "includeKeys" options are used, then "excludeKeys" has priority and includeKeys options is not respected.
    * The option is case sensitive! If the option is set runtime it's not applied on the current value.
    *
    */
  var includeKeys: js.UndefOr[String] = js.undefined
  
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
    * Fired on keydown event.
    * Return false in order to cancel key action.
    */
  var keydown: js.UndefOr[KeydownEvent] = js.undefined
  
  /**
    * Fired on keypress event.
    * Return false in order to cancel key action.
    */
  var keypress: js.UndefOr[KeypressEvent] = js.undefined
  
  /**
    * Fired on keyup event.
    */
  var keyup: js.UndefOr[KeyupEvent] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the hover/unhover animation duration of a drop-down list item.
    *
    */
  var listItemHoverDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets list of items which are used as a source for the drop-down list.
    * Items in the list can be of type string.
    *
    */
  var listItems: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets/Sets custom width of the drop-down list in pixels. If the value is equal to 0 or negative, then the width of editor is set as a drop-down width.
    *
    */
  var listWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets/Sets the maximum length of a text which can be entered by the user.
    * Negative values or 0 disables that behavior. If set at runtime the editor doesn't apply the option to the current value.
    *
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Fired on mousedown event.
    */
  var mousedown: js.UndefOr[MousedownEvent] = js.undefined
  
  /**
    * Fired on mousemove at any part of editor including the drop-down list.
    */
  var mousemove: js.UndefOr[MousemoveEvent] = js.undefined
  
  /**
    * Fired on mouseleave at any part of editor including the drop-down list.
    */
  var mouseout: js.UndefOr[MouseoutEvent] = js.undefined
  
  /**
    * Fired on mouseover at any part of editor including the drop-down list.
    */
  var mouseover: js.UndefOr[MouseoverEvent] = js.undefined
  
  /**
    * Fired on mouseup event.
    */
  var mouseup: js.UndefOr[MouseupEvent] = js.undefined
  
  /**
    * Gets/Sets the representation of null value. In case of default the value for the input is set to null, which makes the input to hold an empty string
    *
    */
  var nullValue: js.UndefOr[String | Double] = js.undefined
  
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
    * Fired after rendering of the editor has finished.
    */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  
  /**
    * Fired before rendering of the editor has finished.
    */
  var rendering: js.UndefOr[RenderingEvent] = js.undefined
  
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
    * Gets/Sets the ability of the editor to automatically move the dropdown list selection item from one end to the opposite side. When the last item is reached and spin down is performed, the first item gets selected and vice versa. This option has no effect there is no drop-down list.
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
  
  /**
    * Fired after the editor's text has been changed. It can be raised when keyUp event occurs,
    * when the clear button is clicked or when an item from a list is selected.
    */
  var textChanged: js.UndefOr[TextChangedEvent] = js.undefined
  
  /**
    * Gets the text mode of the editor such as: single-line text editor, password editor or multiline editor. That option has effect only on initialization. If based element (selector) is TEXTAREA, then it is used as input-field.
    *
    *
    * Valid values:
    * "text" Single line text editor based on INPUT element is created.
    * "password" Editor based on INPUT element with type password is created.
    * "multiline" Multiline editor based on TEXTAREA element is created.
    */
  var textMode: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the ability to convert the input characters to lower case (true) or keeps the characters as they are (false). The option has effect only while keyboard entries and paste.
    * Note! When the option is set at runtime the editor is not changing the current value.
    *
    */
  var toLower: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets the ability to convert the input characters to upper case (true) or keeps the characters as they are (false). The option has effect only while keyboard entries and paste.
    * Note! When the option is set at runtime the editor is not changing the current value.
    *
    */
  var toUpper: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets options supported by the [igValidator](ui.igvalidator#options) widget.
    * Note: Validation rules of [igValidator](ui.igvalidator#options), such as min and max value/length are applied separately triggering errors,
    * while the corresponding options of the editor prevent values violating the defined rules from being entered.
    *
    */
  var validatorOptions: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets/Sets value in editor. The effect of setting/getting that option depends on type of editor and on dataMode options for every type of editor.
    *
    */
  var value: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Fired after the editor value is changed. It can be raised after loosing focus or on spin events.
    */
  var valueChanged: js.UndefOr[ValueChangedEvent] = js.undefined
  
  /**
    * Fired before changing the editor's value.
    * Return false in order to cancel change.
    * It can be raised after loosing focus or on spin events.
    */
  var valueChanging: js.UndefOr[ValueChangingEvent] = js.undefined
  
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
}
object IgTextEditor {
  
  inline def apply(): IgTextEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTextEditor]
  }
  
  extension [Self <: IgTextEditor](x: Self) {
    
    inline def setAllowNullValue(value: Boolean): Self = StObject.set(x, "allowNullValue", value.asInstanceOf[js.Any])
    
    inline def setAllowNullValueUndefined: Self = StObject.set(x, "allowNullValue", js.undefined)
    
    inline def setBlur(value: (/* event */ Event, /* ui */ BlurEventUIParam) => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
    
    inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    inline def setButtonType(value: String): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
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
    
    inline def setExcludeKeys(value: String): Self = StObject.set(x, "excludeKeys", value.asInstanceOf[js.Any])
    
    inline def setExcludeKeysUndefined: Self = StObject.set(x, "excludeKeys", js.undefined)
    
    inline def setFocus(value: (/* event */ Event, /* ui */ IgFocusEventUIParam) => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIncludeKeys(value: String): Self = StObject.set(x, "includeKeys", value.asInstanceOf[js.Any])
    
    inline def setIncludeKeysUndefined: Self = StObject.set(x, "includeKeys", js.undefined)
    
    inline def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    inline def setIsLimitedToListValues(value: Boolean): Self = StObject.set(x, "isLimitedToListValues", value.asInstanceOf[js.Any])
    
    inline def setIsLimitedToListValuesUndefined: Self = StObject.set(x, "isLimitedToListValues", js.undefined)
    
    inline def setKeydown(value: (/* event */ Event, /* ui */ KeydownEventUIParam) => Unit): Self = StObject.set(x, "keydown", js.Any.fromFunction2(value))
    
    inline def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
    
    inline def setKeypress(value: (/* event */ Event, /* ui */ KeypressEventUIParam) => Unit): Self = StObject.set(x, "keypress", js.Any.fromFunction2(value))
    
    inline def setKeypressUndefined: Self = StObject.set(x, "keypress", js.undefined)
    
    inline def setKeyup(value: (/* event */ Event, /* ui */ KeyupEventUIParam) => Unit): Self = StObject.set(x, "keyup", js.Any.fromFunction2(value))
    
    inline def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setListItemHoverDuration(value: Double): Self = StObject.set(x, "listItemHoverDuration", value.asInstanceOf[js.Any])
    
    inline def setListItemHoverDurationUndefined: Self = StObject.set(x, "listItemHoverDuration", js.undefined)
    
    inline def setListItems(value: js.Array[js.Any]): Self = StObject.set(x, "listItems", value.asInstanceOf[js.Any])
    
    inline def setListItemsUndefined: Self = StObject.set(x, "listItems", js.undefined)
    
    inline def setListItemsVarargs(value: js.Any*): Self = StObject.set(x, "listItems", js.Array(value :_*))
    
    inline def setListWidth(value: Double): Self = StObject.set(x, "listWidth", value.asInstanceOf[js.Any])
    
    inline def setListWidthUndefined: Self = StObject.set(x, "listWidth", js.undefined)
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMousedown(value: (/* event */ Event, /* ui */ MousedownEventUIParam) => Unit): Self = StObject.set(x, "mousedown", js.Any.fromFunction2(value))
    
    inline def setMousedownUndefined: Self = StObject.set(x, "mousedown", js.undefined)
    
    inline def setMousemove(value: (/* event */ Event, /* ui */ MousemoveEventUIParam) => Unit): Self = StObject.set(x, "mousemove", js.Any.fromFunction2(value))
    
    inline def setMousemoveUndefined: Self = StObject.set(x, "mousemove", js.undefined)
    
    inline def setMouseout(value: (/* event */ Event, /* ui */ MouseoutEventUIParam) => Unit): Self = StObject.set(x, "mouseout", js.Any.fromFunction2(value))
    
    inline def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
    
    inline def setMouseover(value: (/* event */ Event, /* ui */ MouseoverEventUIParam) => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction2(value))
    
    inline def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
    
    inline def setMouseup(value: (/* event */ Event, /* ui */ MouseupEventUIParam) => Unit): Self = StObject.set(x, "mouseup", js.Any.fromFunction2(value))
    
    inline def setMouseupUndefined: Self = StObject.set(x, "mouseup", js.undefined)
    
    inline def setNullValue(value: String | Double): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    inline def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    inline def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    inline def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
    
    inline def setPreventSubmitOnEnter(value: Boolean): Self = StObject.set(x, "preventSubmitOnEnter", value.asInstanceOf[js.Any])
    
    inline def setPreventSubmitOnEnterUndefined: Self = StObject.set(x, "preventSubmitOnEnter", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = StObject.set(x, "rendered", js.Any.fromFunction2(value))
    
    inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    inline def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = StObject.set(x, "rendering", js.Any.fromFunction2(value))
    
    inline def setRenderingUndefined: Self = StObject.set(x, "rendering", js.undefined)
    
    inline def setRevertIfNotValid(value: Boolean): Self = StObject.set(x, "revertIfNotValid", value.asInstanceOf[js.Any])
    
    inline def setRevertIfNotValidUndefined: Self = StObject.set(x, "revertIfNotValid", js.undefined)
    
    inline def setSelectionOnFocus(value: String): Self = StObject.set(x, "selectionOnFocus", value.asInstanceOf[js.Any])
    
    inline def setSelectionOnFocusUndefined: Self = StObject.set(x, "selectionOnFocus", js.undefined)
    
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
    
    inline def setTextChanged(value: (/* event */ Event, /* ui */ TextChangedEventUIParam) => Unit): Self = StObject.set(x, "textChanged", js.Any.fromFunction2(value))
    
    inline def setTextChangedUndefined: Self = StObject.set(x, "textChanged", js.undefined)
    
    inline def setTextMode(value: String): Self = StObject.set(x, "textMode", value.asInstanceOf[js.Any])
    
    inline def setTextModeUndefined: Self = StObject.set(x, "textMode", js.undefined)
    
    inline def setToLower(value: Boolean): Self = StObject.set(x, "toLower", value.asInstanceOf[js.Any])
    
    inline def setToLowerUndefined: Self = StObject.set(x, "toLower", js.undefined)
    
    inline def setToUpper(value: Boolean): Self = StObject.set(x, "toUpper", value.asInstanceOf[js.Any])
    
    inline def setToUpperUndefined: Self = StObject.set(x, "toUpper", js.undefined)
    
    inline def setValidatorOptions(value: js.Any): Self = StObject.set(x, "validatorOptions", value.asInstanceOf[js.Any])
    
    inline def setValidatorOptionsUndefined: Self = StObject.set(x, "validatorOptions", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueChanged(value: (/* event */ Event, /* ui */ ValueChangedEventUIParam) => Unit): Self = StObject.set(x, "valueChanged", js.Any.fromFunction2(value))
    
    inline def setValueChangedUndefined: Self = StObject.set(x, "valueChanged", js.undefined)
    
    inline def setValueChanging(value: (/* event */ Event, /* ui */ ValueChangingEventUIParam) => Unit): Self = StObject.set(x, "valueChanging", js.Any.fromFunction2(value))
    
    inline def setValueChangingUndefined: Self = StObject.set(x, "valueChanging", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisibleItemsCount(value: Double): Self = StObject.set(x, "visibleItemsCount", value.asInstanceOf[js.Any])
    
    inline def setVisibleItemsCountUndefined: Self = StObject.set(x, "visibleItemsCount", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

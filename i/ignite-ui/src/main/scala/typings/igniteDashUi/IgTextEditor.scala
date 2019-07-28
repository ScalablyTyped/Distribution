package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTextEditor
  extends /**
	 * Option for igTextEditor
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
  	 * Gets wheather the drop-down list element is attached to the body of the document, or to the editor container element.
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
  	 * Note! In case there are no list items - the editor will reamin readonly
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
  var listItems: js.UndefOr[js.Array[_]] = js.undefined
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
  	 * Negative values or 0 disables that behavior. If set at runtime the editor doesn't apply the option to the cuurent value.
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
  	 * Fired after rendering of the editor has finished.
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  /**
  	 * Fired before rendering of the editor has finished.
  	 */
  var rendering: js.UndefOr[RenderingEvent] = js.undefined
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
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTextEditor
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowNullValue: js.UndefOr[Boolean] = js.undefined,
    blur: BlurEvent = null,
    buttonType: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
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
    excludeKeys: String = null,
    focus: IgFocusEvent = null,
    height: String | Double = null,
    includeKeys: String = null,
    inputName: String = null,
    isLimitedToListValues: js.UndefOr[Boolean] = js.undefined,
    keydown: KeydownEvent = null,
    keypress: KeypressEvent = null,
    keyup: KeyupEvent = null,
    language: String = null,
    listItemHoverDuration: Int | Double = null,
    listItems: js.Array[_] = null,
    listWidth: Int | Double = null,
    locale: js.Any = null,
    maxLength: Int | Double = null,
    mousedown: MousedownEvent = null,
    mousemove: MousemoveEvent = null,
    mouseout: MouseoutEvent = null,
    mouseover: MouseoverEvent = null,
    mouseup: MouseupEvent = null,
    nullValue: String | Double = null,
    placeHolder: String = null,
    preventSubmitOnEnter: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    regional: String | js.Object = null,
    rendered: RenderedEvent = null,
    rendering: RenderingEvent = null,
    revertIfNotValid: js.UndefOr[Boolean] = js.undefined,
    selectionOnFocus: String = null,
    spinWrapAround: js.UndefOr[Boolean] = js.undefined,
    suppressKeyboard: js.UndefOr[Boolean] = js.undefined,
    suppressNotifications: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    textAlign: String = null,
    textChanged: TextChangedEvent = null,
    textMode: String = null,
    toLower: js.UndefOr[Boolean] = js.undefined,
    toUpper: js.UndefOr[Boolean] = js.undefined,
    validatorOptions: js.Any = null,
    value: js.Any = null,
    valueChanged: ValueChangedEvent = null,
    valueChanging: ValueChangingEvent = null,
    visibleItemsCount: Int | Double = null,
    width: String | Double = null
  ): IgTextEditor = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowNullValue)) __obj.updateDynamic("allowNullValue")(allowNullValue)
    if (blur != null) __obj.updateDynamic("blur")(blur)
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
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
    if (excludeKeys != null) __obj.updateDynamic("excludeKeys")(excludeKeys)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (includeKeys != null) __obj.updateDynamic("includeKeys")(includeKeys)
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (!js.isUndefined(isLimitedToListValues)) __obj.updateDynamic("isLimitedToListValues")(isLimitedToListValues)
    if (keydown != null) __obj.updateDynamic("keydown")(keydown)
    if (keypress != null) __obj.updateDynamic("keypress")(keypress)
    if (keyup != null) __obj.updateDynamic("keyup")(keyup)
    if (language != null) __obj.updateDynamic("language")(language)
    if (listItemHoverDuration != null) __obj.updateDynamic("listItemHoverDuration")(listItemHoverDuration.asInstanceOf[js.Any])
    if (listItems != null) __obj.updateDynamic("listItems")(listItems)
    if (listWidth != null) __obj.updateDynamic("listWidth")(listWidth.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (mousedown != null) __obj.updateDynamic("mousedown")(mousedown)
    if (mousemove != null) __obj.updateDynamic("mousemove")(mousemove)
    if (mouseout != null) __obj.updateDynamic("mouseout")(mouseout)
    if (mouseover != null) __obj.updateDynamic("mouseover")(mouseover)
    if (mouseup != null) __obj.updateDynamic("mouseup")(mouseup)
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder)
    if (!js.isUndefined(preventSubmitOnEnter)) __obj.updateDynamic("preventSubmitOnEnter")(preventSubmitOnEnter)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(rendered)
    if (rendering != null) __obj.updateDynamic("rendering")(rendering)
    if (!js.isUndefined(revertIfNotValid)) __obj.updateDynamic("revertIfNotValid")(revertIfNotValid)
    if (selectionOnFocus != null) __obj.updateDynamic("selectionOnFocus")(selectionOnFocus)
    if (!js.isUndefined(spinWrapAround)) __obj.updateDynamic("spinWrapAround")(spinWrapAround)
    if (!js.isUndefined(suppressKeyboard)) __obj.updateDynamic("suppressKeyboard")(suppressKeyboard)
    if (!js.isUndefined(suppressNotifications)) __obj.updateDynamic("suppressNotifications")(suppressNotifications)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textChanged != null) __obj.updateDynamic("textChanged")(textChanged)
    if (textMode != null) __obj.updateDynamic("textMode")(textMode)
    if (!js.isUndefined(toLower)) __obj.updateDynamic("toLower")(toLower)
    if (!js.isUndefined(toUpper)) __obj.updateDynamic("toUpper")(toUpper)
    if (validatorOptions != null) __obj.updateDynamic("validatorOptions")(validatorOptions)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueChanged != null) __obj.updateDynamic("valueChanged")(valueChanged)
    if (valueChanging != null) __obj.updateDynamic("valueChanging")(valueChanging)
    if (visibleItemsCount != null) __obj.updateDynamic("visibleItemsCount")(visibleItemsCount.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTextEditor]
  }
}


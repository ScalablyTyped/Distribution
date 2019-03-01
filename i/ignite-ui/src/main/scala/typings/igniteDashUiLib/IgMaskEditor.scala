package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgMaskEditor
  extends /**
	 * Option for igMaskEditor
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets/Sets whether the editor value can become null.
  	 * If that option is false, and editor has no value, then value is set to an empty string.
  	 *
  	 */
  var allowNullValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets visibility of the clear button. That option can be set only on initialization.
  	 *
  	 *
  	 * Valid values:
  	 * "clear" A button to clear the value is located on the right side of the editor.
  	 */
  var buttonType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * It affects the value of the control (value method/option and submitted in forms). It defines what the value should contain from text, unfilled prompts and literals. The default is allText and when used value method/option returns the text entered, all prompts (positions) and literals.
  	 *
  	 *
  	 * Valid values:
  	 * "rawText" only entered text. All unfilled prompts (positions) and literals are ignored (removed).
  	 * "rawTextWithRequiredPrompts" only entered text and required prompts (positions). All optional unfilled prompts and literals are ignored (removed)
  	 * "rawTextWithAllPrompts" only entered text and prompts (positions). All literals are ignored (removed).
  	 * "rawTextWithLiterals" only entered text and literals. All unfilled prompts are ignored (removed).
  	 * "rawTextWithRequiredPromptsAndLiterals" only entered text, required prompts (positions) and literals. All optional unfilled prompts are ignored (removed).
  	 * "allText" entered text, all prompts (positions) and literals. Note: that is used as default.
  	 */
  var dataMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
  	 *
  	 */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igMaskEditor
  	 */
  var dropDownAnimationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igMaskEditor
  	 */
  var dropDownAttachedToBody: js.UndefOr[scala.Boolean] = js.undefined
  var dropDownItemSelected: js.UndefOr[DropDownItemSelectedEvent] = js.undefined
  var dropDownItemSelecting: js.UndefOr[DropDownItemSelectingEvent] = js.undefined
  var dropDownListClosed: js.UndefOr[DropDownListClosedEvent] = js.undefined
  var dropDownListClosing: js.UndefOr[DropDownListClosingEvent] = js.undefined
  var dropDownListOpened: js.UndefOr[DropDownListOpenedEvent] = js.undefined
  var dropDownListOpening: js.UndefOr[DropDownListOpeningEvent] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igMaskEditor
  	 */
  var dropDownOnReadOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igMaskEditor
  	 */
  var dropDownOrientation: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets character which is used as replacement of not-filled required position in mask when application calls get for the [value](ui.igmaskeditor#methods:value) methods.
  	 *
  	 */
  var emptyChar: js.UndefOr[java.lang.String] = js.undefined
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
  	 * Gets input mask. Mask may include filter-flags and literal characters.
  	 * Literal characters are part of mask which cannot be modified by end user. In order to use a filter-flag as a literal character, the escape "\\" character should be used.
  	 * Default is "CCCCCCCCCC"
  	 * Note: optional flags/entries affect the value returned by get of the [value](ui.igmaskeditor#methods:value) methods.
  	 * List of filter-flags:
  	 * C: any keyboard character. Entry is optional.
  	 * &: any keyboard character. Entry is required.
  	 * a: letter or digit character. Entry is optional.
  	 * A: letter or digit character. Entry is required.
  	 * ?: letter character. Entry is optional.
  	 * L: letter character. Entry is required.
  	 * 9: digit character. Entry is optional.
  	 * 0: digit character. Entry is required.
  	 * #: digit character or "+" or "_". Entry is optional with replacement by [emptyChar](ui.igmaskeditor#options:emptyChar) or by [padChar](ui.igmaskeditor#options:padChar).
  	 * >: all letters to the right are converted to the upper case. In order to disable conversion, the ">" flag should be used again.
  	 * <: all letters to the right are converted to the lower case. In order to disable conversion, the "<" flag should be used again.
  	 * Note! This option can not be set runtime.
  	 *
  	 */
  var inputMask: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
  	 *
  	 */
  var inputName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets the ability to allow values only set into the list items. This validation is done only when the editor is blured, or enter key is pressed
  	 */
  var isLimitedToListValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets the hover/unhover animation duration.
  	 */
  var listItemHoverDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets list of items which are used for drop-down list.
  	 * Items in list can be strings, numbers or objects. The items are directly rendered without casting, or manipulating them.
  	 */
  var listItems: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Sets gets custom width of drop-down list in pixels. If value is equal to 0 or negative, then the width of editor is used.
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
  	 * Gets/Sets the representation of null value. In case of default the value for the input is set to null, which makes the input to hold an empty string
  	 *
  	 */
  var nullValue: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Gets/Sets character which is used as replacement of not-filled required position in mask when editor is in display mode (not focused).
  	 *
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
  	 * Gets/Sets the ability of the editor to automatically change the hoverd item into the opened dropdown list to its oposide side.
  	 */
  var spinWrapAround: js.UndefOr[scala.Boolean] = js.undefined
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
  /**
  	 * Fired after the editor's text has been changed. It can be raised when keyUp event occurs,
  	 * when the clear button is clicked or when an item from a list is selected.
  	 */
  var textChanged: js.UndefOr[TextChangedEvent] = js.undefined
  var textMode: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets the ability to convert the input characters to lower case (true) or keeps the characters as they are (false). The option has effect only while keyboard entries and paste.
  	 * Note! When the option is set at runtime the editor is not changing the current value.
  	 *
  	 */
  var toLower: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the ability to convert the input characters to upper case (true) or keeps the characters as they are (false). The option has effect only while keyboard entries and paste.
  	 * Note! When the option is set at runtime the editor is not changing the current value.
  	 *
  	 */
  var toUpper: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets character which is used as prompt in edit mode for available entry position.
  	 *
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
  	 * Gets/Sets value in editor. The effect of setting/getting that option depends on type of editor and on dataMode options for every type of editor.
  	 *
  	 */
  var value: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets how many items should be shown at once.
  	 * Notes:
  	 * That option is overwritten if the number of list items is less than the value. In that case the height of the dropdown is adjusted to the number of items.
  	 * Note! This option can not be set runtime.
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
}

object IgMaskEditor {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igMaskEditor
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    allowNullValue: js.UndefOr[scala.Boolean] = js.undefined,
    buttonType: java.lang.String = null,
    dataMode: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
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
    excludeKeys: java.lang.String = null,
    height: java.lang.String | scala.Double = null,
    includeKeys: java.lang.String = null,
    inputMask: java.lang.String = null,
    inputName: java.lang.String = null,
    isLimitedToListValues: js.UndefOr[scala.Boolean] = js.undefined,
    language: java.lang.String = null,
    listItemHoverDuration: scala.Int | scala.Double = null,
    listItems: js.Array[_] = null,
    listWidth: scala.Int | scala.Double = null,
    locale: js.Any = null,
    maxLength: js.Any = null,
    nullValue: java.lang.String | scala.Double = null,
    padChar: java.lang.String = null,
    placeHolder: java.lang.String = null,
    preventSubmitOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    regional: java.lang.String | js.Object = null,
    revertIfNotValid: js.UndefOr[scala.Boolean] = js.undefined,
    selectionOnFocus: java.lang.String = null,
    spinWrapAround: js.UndefOr[scala.Boolean] = js.undefined,
    suppressKeyboard: js.UndefOr[scala.Boolean] = js.undefined,
    suppressNotifications: js.UndefOr[scala.Boolean] = js.undefined,
    tabIndex: scala.Int | scala.Double = null,
    textAlign: java.lang.String = null,
    textChanged: TextChangedEvent = null,
    textMode: js.Any = null,
    toLower: js.UndefOr[scala.Boolean] = js.undefined,
    toUpper: js.UndefOr[scala.Boolean] = js.undefined,
    unfilledCharsPrompt: java.lang.String = null,
    validatorOptions: js.Any = null,
    value: js.Any = null,
    visibleItemsCount: scala.Int | scala.Double = null,
    width: java.lang.String | scala.Double = null
  ): IgMaskEditor = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowNullValue)) __obj.updateDynamic("allowNullValue")(allowNullValue)
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType)
    if (dataMode != null) __obj.updateDynamic("dataMode")(dataMode)
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
    if (emptyChar != null) __obj.updateDynamic("emptyChar")(emptyChar)
    if (excludeKeys != null) __obj.updateDynamic("excludeKeys")(excludeKeys)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (includeKeys != null) __obj.updateDynamic("includeKeys")(includeKeys)
    if (inputMask != null) __obj.updateDynamic("inputMask")(inputMask)
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (!js.isUndefined(isLimitedToListValues)) __obj.updateDynamic("isLimitedToListValues")(isLimitedToListValues)
    if (language != null) __obj.updateDynamic("language")(language)
    if (listItemHoverDuration != null) __obj.updateDynamic("listItemHoverDuration")(listItemHoverDuration.asInstanceOf[js.Any])
    if (listItems != null) __obj.updateDynamic("listItems")(listItems)
    if (listWidth != null) __obj.updateDynamic("listWidth")(listWidth.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength)
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (padChar != null) __obj.updateDynamic("padChar")(padChar)
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder)
    if (!js.isUndefined(preventSubmitOnEnter)) __obj.updateDynamic("preventSubmitOnEnter")(preventSubmitOnEnter)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
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
    if (unfilledCharsPrompt != null) __obj.updateDynamic("unfilledCharsPrompt")(unfilledCharsPrompt)
    if (validatorOptions != null) __obj.updateDynamic("validatorOptions")(validatorOptions)
    if (value != null) __obj.updateDynamic("value")(value)
    if (visibleItemsCount != null) __obj.updateDynamic("visibleItemsCount")(visibleItemsCount.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgMaskEditor]
  }
}


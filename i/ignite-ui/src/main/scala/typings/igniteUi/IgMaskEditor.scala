package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgMaskEditor
  extends /**
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
    * Gets visibility of the clear button. That option can be set only on initialization.
    *
    *
    * Valid values:
    * "clear" A button to clear the value is located on the right side of the editor.
    */
  var buttonType: js.UndefOr[String] = js.undefined
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
  var dataMode: js.UndefOr[String] = js.undefined
  /**
    * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
    *
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * This option is inherited from a parent widget and it's not applicable for igMaskEditor
    */
  var dropDownAnimationDuration: js.UndefOr[Double] = js.undefined
  /**
    * This option is inherited from a parent widget and it's not applicable for igMaskEditor
    */
  var dropDownAttachedToBody: js.UndefOr[Boolean] = js.undefined
  var dropDownItemSelected: js.UndefOr[DropDownItemSelectedEvent] = js.undefined
  var dropDownItemSelecting: js.UndefOr[DropDownItemSelectingEvent] = js.undefined
  var dropDownListClosed: js.UndefOr[DropDownListClosedEvent] = js.undefined
  var dropDownListClosing: js.UndefOr[DropDownListClosingEvent] = js.undefined
  var dropDownListOpened: js.UndefOr[DropDownListOpenedEvent] = js.undefined
  var dropDownListOpening: js.UndefOr[DropDownListOpeningEvent] = js.undefined
  /**
    * This option is inherited from a parent widget and it's not applicable for igMaskEditor
    */
  var dropDownOnReadOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * This option is inherited from a parent widget and it's not applicable for igMaskEditor
    */
  var dropDownOrientation: js.UndefOr[String] = js.undefined
  /**
    * Gets/Sets character which is used as replacement of not-filled required position in mask when application calls get for the [value](ui.igmaskeditor#methods:value) methods.
    *
    */
  var emptyChar: js.UndefOr[String] = js.undefined
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
  var inputMask: js.UndefOr[String] = js.undefined
  /**
    * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
    *
    */
  var inputName: js.UndefOr[String] = js.undefined
  /**
    * Sets the ability to allow values only set into the list items. This validation is done only when the editor is blurred, or enter key is pressed
    */
  var isLimitedToListValues: js.UndefOr[Boolean] = js.undefined
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * Sets the hover/unhover animation duration.
    */
  var listItemHoverDuration: js.UndefOr[Double] = js.undefined
  /**
    * Sets gets list of items which are used for drop-down list.
    * Items in list can be strings, numbers or objects. The items are directly rendered without casting, or manipulating them.
    */
  var listItems: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Sets gets custom width of drop-down list in pixels. If value is equal to 0 or negative, then the width of editor is used.
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
    * Gets/Sets the representation of null value. In case of default the value for the input is set to null, which makes the input to hold an empty string
    *
    */
  var nullValue: js.UndefOr[String | Double] = js.undefined
  /**
    * Gets/Sets character which is used as replacement of not-filled required position in mask when editor is in display mode (not focused).
    *
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
    * Gets/Sets the ability of the editor to automatically change the hovered item into the opened dropdown list to its opposite side.
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
  var toLower: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets/Sets the ability to convert the input characters to upper case (true) or keeps the characters as they are (false). The option has effect only while keyboard entries and paste.
    * Note! When the option is set at runtime the editor is not changing the current value.
    *
    */
  var toUpper: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets character which is used as prompt in edit mode for available entry position.
    *
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

object IgMaskEditor {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    allowNullValue: js.UndefOr[Boolean] = js.undefined,
    buttonType: String = null,
    dataMode: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropDownAnimationDuration: js.UndefOr[Double] = js.undefined,
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
    excludeKeys: String = null,
    height: String | Double = null,
    includeKeys: String = null,
    inputMask: String = null,
    inputName: String = null,
    isLimitedToListValues: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    listItemHoverDuration: js.UndefOr[Double] = js.undefined,
    listItems: js.Array[_] = null,
    listWidth: js.UndefOr[Double] = js.undefined,
    locale: js.Any = null,
    maxLength: js.Any = null,
    nullValue: String | Double = null,
    padChar: String = null,
    placeHolder: String = null,
    preventSubmitOnEnter: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    regional: String | js.Object = null,
    revertIfNotValid: js.UndefOr[Boolean] = js.undefined,
    selectionOnFocus: String = null,
    spinWrapAround: js.UndefOr[Boolean] = js.undefined,
    suppressKeyboard: js.UndefOr[Boolean] = js.undefined,
    suppressNotifications: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    textAlign: String = null,
    textChanged: (/* event */ Event, /* ui */ TextChangedEventUIParam) => Unit = null,
    textMode: js.Any = null,
    toLower: js.UndefOr[Boolean] = js.undefined,
    toUpper: js.UndefOr[Boolean] = js.undefined,
    unfilledCharsPrompt: String = null,
    validatorOptions: js.Any = null,
    value: js.Any = null,
    visibleItemsCount: js.UndefOr[Double] = js.undefined,
    width: String | Double = null
  ): IgMaskEditor = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowNullValue)) __obj.updateDynamic("allowNullValue")(allowNullValue.get.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (dataMode != null) __obj.updateDynamic("dataMode")(dataMode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropDownAnimationDuration)) __obj.updateDynamic("dropDownAnimationDuration")(dropDownAnimationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropDownAttachedToBody)) __obj.updateDynamic("dropDownAttachedToBody")(dropDownAttachedToBody.get.asInstanceOf[js.Any])
    if (dropDownItemSelected != null) __obj.updateDynamic("dropDownItemSelected")(js.Any.fromFunction2(dropDownItemSelected))
    if (dropDownItemSelecting != null) __obj.updateDynamic("dropDownItemSelecting")(js.Any.fromFunction2(dropDownItemSelecting))
    if (dropDownListClosed != null) __obj.updateDynamic("dropDownListClosed")(js.Any.fromFunction2(dropDownListClosed))
    if (dropDownListClosing != null) __obj.updateDynamic("dropDownListClosing")(js.Any.fromFunction2(dropDownListClosing))
    if (dropDownListOpened != null) __obj.updateDynamic("dropDownListOpened")(js.Any.fromFunction2(dropDownListOpened))
    if (dropDownListOpening != null) __obj.updateDynamic("dropDownListOpening")(js.Any.fromFunction2(dropDownListOpening))
    if (!js.isUndefined(dropDownOnReadOnly)) __obj.updateDynamic("dropDownOnReadOnly")(dropDownOnReadOnly.get.asInstanceOf[js.Any])
    if (dropDownOrientation != null) __obj.updateDynamic("dropDownOrientation")(dropDownOrientation.asInstanceOf[js.Any])
    if (emptyChar != null) __obj.updateDynamic("emptyChar")(emptyChar.asInstanceOf[js.Any])
    if (excludeKeys != null) __obj.updateDynamic("excludeKeys")(excludeKeys.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (includeKeys != null) __obj.updateDynamic("includeKeys")(includeKeys.asInstanceOf[js.Any])
    if (inputMask != null) __obj.updateDynamic("inputMask")(inputMask.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName.asInstanceOf[js.Any])
    if (!js.isUndefined(isLimitedToListValues)) __obj.updateDynamic("isLimitedToListValues")(isLimitedToListValues.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(listItemHoverDuration)) __obj.updateDynamic("listItemHoverDuration")(listItemHoverDuration.get.asInstanceOf[js.Any])
    if (listItems != null) __obj.updateDynamic("listItems")(listItems.asInstanceOf[js.Any])
    if (!js.isUndefined(listWidth)) __obj.updateDynamic("listWidth")(listWidth.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (padChar != null) __obj.updateDynamic("padChar")(padChar.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    if (!js.isUndefined(preventSubmitOnEnter)) __obj.updateDynamic("preventSubmitOnEnter")(preventSubmitOnEnter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (!js.isUndefined(revertIfNotValid)) __obj.updateDynamic("revertIfNotValid")(revertIfNotValid.get.asInstanceOf[js.Any])
    if (selectionOnFocus != null) __obj.updateDynamic("selectionOnFocus")(selectionOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(spinWrapAround)) __obj.updateDynamic("spinWrapAround")(spinWrapAround.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressKeyboard)) __obj.updateDynamic("suppressKeyboard")(suppressKeyboard.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressNotifications)) __obj.updateDynamic("suppressNotifications")(suppressNotifications.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textChanged != null) __obj.updateDynamic("textChanged")(js.Any.fromFunction2(textChanged))
    if (textMode != null) __obj.updateDynamic("textMode")(textMode.asInstanceOf[js.Any])
    if (!js.isUndefined(toLower)) __obj.updateDynamic("toLower")(toLower.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toUpper)) __obj.updateDynamic("toUpper")(toUpper.get.asInstanceOf[js.Any])
    if (unfilledCharsPrompt != null) __obj.updateDynamic("unfilledCharsPrompt")(unfilledCharsPrompt.asInstanceOf[js.Any])
    if (validatorOptions != null) __obj.updateDynamic("validatorOptions")(validatorOptions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleItemsCount)) __obj.updateDynamic("visibleItemsCount")(visibleItemsCount.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgMaskEditor]
  }
}


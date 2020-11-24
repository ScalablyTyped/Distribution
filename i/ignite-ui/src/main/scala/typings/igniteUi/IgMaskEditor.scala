package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var allowNullValue: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets visibility of the clear button. That option can be set only on initialization.
    *
    *
    * Valid values:
    * "clear" A button to clear the value is located on the right side of the editor.
    */
  var buttonType: js.UndefOr[String] = js.native
  
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
  var dataMode: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
    *
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igMaskEditor
    */
  var dropDownAnimationDuration: js.UndefOr[Double] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igMaskEditor
    */
  var dropDownAttachedToBody: js.UndefOr[Boolean] = js.native
  
  var dropDownItemSelected: js.UndefOr[DropDownItemSelectedEvent] = js.native
  
  var dropDownItemSelecting: js.UndefOr[DropDownItemSelectingEvent] = js.native
  
  var dropDownListClosed: js.UndefOr[DropDownListClosedEvent] = js.native
  
  var dropDownListClosing: js.UndefOr[DropDownListClosingEvent] = js.native
  
  var dropDownListOpened: js.UndefOr[DropDownListOpenedEvent] = js.native
  
  var dropDownListOpening: js.UndefOr[DropDownListOpeningEvent] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igMaskEditor
    */
  var dropDownOnReadOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igMaskEditor
    */
  var dropDownOrientation: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets character which is used as replacement of not-filled required position in mask when application calls get for the [value](ui.igmaskeditor#methods:value) methods.
    *
    */
  var emptyChar: js.UndefOr[String] = js.native
  
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
  var inputMask: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
    *
    */
  var inputName: js.UndefOr[String] = js.native
  
  /**
    * Sets the ability to allow values only set into the list items. This validation is done only when the editor is blurred, or enter key is pressed
    */
  var isLimitedToListValues: js.UndefOr[Boolean] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Sets the hover/unhover animation duration.
    */
  var listItemHoverDuration: js.UndefOr[Double] = js.native
  
  /**
    * Sets gets list of items which are used for drop-down list.
    * Items in list can be strings, numbers or objects. The items are directly rendered without casting, or manipulating them.
    */
  var listItems: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Sets gets custom width of drop-down list in pixels. If value is equal to 0 or negative, then the width of editor is used.
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
    * Gets/Sets the representation of null value. In case of default the value for the input is set to null, which makes the input to hold an empty string
    *
    */
  var nullValue: js.UndefOr[String | Double] = js.native
  
  /**
    * Gets/Sets character which is used as replacement of not-filled required position in mask when editor is in display mode (not focused).
    *
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
    * Gets/Sets the ability of the editor to automatically change the hovered item into the opened dropdown list to its opposite side.
    */
  var spinWrapAround: js.UndefOr[Boolean] = js.native
  
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
  
  /**
    * Fired after the editor's text has been changed. It can be raised when keyUp event occurs,
    * when the clear button is clicked or when an item from a list is selected.
    */
  var textChanged: js.UndefOr[TextChangedEvent] = js.native
  
  var textMode: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets/Sets the ability to convert the input characters to lower case (true) or keeps the characters as they are (false). The option has effect only while keyboard entries and paste.
    * Note! When the option is set at runtime the editor is not changing the current value.
    *
    */
  var toLower: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets the ability to convert the input characters to upper case (true) or keeps the characters as they are (false). The option has effect only while keyboard entries and paste.
    * Note! When the option is set at runtime the editor is not changing the current value.
    *
    */
  var toUpper: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets character which is used as prompt in edit mode for available entry position.
    *
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
    * Gets/Sets value in editor. The effect of setting/getting that option depends on type of editor and on dataMode options for every type of editor.
    *
    */
  var value: js.UndefOr[js.Any] = js.native
  
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
}
object IgMaskEditor {
  
  @scala.inline
  def apply(): IgMaskEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgMaskEditor]
  }
  
  @scala.inline
  implicit class IgMaskEditorOps[Self <: IgMaskEditor] (val x: Self) extends AnyVal {
    
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
    def setDataMode(value: String): Self = this.set("dataMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMode: Self = this.set("dataMode", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setListItemHoverDuration(value: Double): Self = this.set("listItemHoverDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemHoverDuration: Self = this.set("listItemHoverDuration", js.undefined)
    
    @scala.inline
    def setListItemsVarargs(value: js.Any*): Self = this.set("listItems", js.Array(value :_*))
    
    @scala.inline
    def setListItems(value: js.Array[_]): Self = this.set("listItems", value.asInstanceOf[js.Any])
    
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
    def setNullValue(value: String | Double): Self = this.set("nullValue", value.asInstanceOf[js.Any])
    
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
    def setTextChanged(value: (/* event */ Event, /* ui */ TextChangedEventUIParam) => Unit): Self = this.set("textChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTextChanged: Self = this.set("textChanged", js.undefined)
    
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
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
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
  }
}

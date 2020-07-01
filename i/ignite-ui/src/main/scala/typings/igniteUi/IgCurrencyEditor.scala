package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgCurrencyEditor
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets whether the editor value can become null.
    * If that option is disabled, and editor has no value, then value is set to 0 (or minValue/maxValue).
    *
    */
  var allowNullValue: js.UndefOr[Boolean] = js.undefined
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
    * Gets/Sets a string that is used as the currency symbol that is shown in display mode.
    *
    */
  var currencySymbol: js.UndefOr[String] = js.undefined
  /**
    * Defines the range that editor's value can accept.This is achieved by setting the [minValue](ui.igNumericEditor#options:minValue) and [maxValue](ui.igNumericEditor#options:maxValue) editor's options, accordingly to the lowest and highest accepted values for the defined numeric mode.
    * The range for the specific type follows the numeric type standards, e.g. in .NET Framework  [floating-point](https://msdn.microsoft.com/en-us/library/9ahet949.aspx) types and [integral types](https://msdn.microsoft.com/en-us/library/exx3b86w.aspx).
    * In addition, the maximum value that can be set to [minDecimals](ui.igNumericEditor#options:minDecimals) and [maxDecimals](ui.igNumericEditor#options:maxDecimals) options can be 15, when editor is in 'double' mode and 7, when in 'float' mode.
    *
    *
    * Valid values:
    * "double" the Number object is used with the limits of a double and if the value is not set, then the null or Number.NaN is used depending on the option [allowNullValue](ui.igNumericEditor#options:allowNullValue). Note: that is used as default.
    * "float" the Number object is used with the limits of a float and if the value is not set, then the null or Number.NaN is used depending on the option [allowNullValue](ui.igNumericEditor#options:allowNullValue).
    * "long" the Number object is used with the limits of a signed long and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igNumericEditor#options:allowNullValue).
    * "ulong" the Number object is used with the limits of an unsigned long and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igNumericEditor#options:allowNullValue).
    * "int" the Number object is used with the limits of a signed int and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igNumericEditor#options:allowNullValue).
    * "uint" the Number object is used with the limits of an unsigned int and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igNumericEditor#options:allowNullValue).
    * "short" the Number object is used with the limits of a signed short and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igNumericEditor#options:allowNullValue).
    * "ushort" the Number object is used with the limits of an unsigned short and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igNumericEditor#options:allowNullValue).
    * "sbyte" the Number object is used with the limits of a signed byte and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igNumericEditor#options:allowNullValue).
    * "byte" the Number object is used with the limits of an unsigned byte and if the value is not set, then the null or 0 is used depending on the option [allowNullValue](ui.igNumericEditor#options:allowNullValue).
    */
  var dataMode: js.UndefOr[String] = js.undefined
  /**
    * Gets/Sets the character, which is used as decimal separator.
    * Note: this option has priority over possible regional settings.
    * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are implicitly set.
    * Note: This option's value should not be equal to the value of [groupSeparator](ui.igNumericEditor#options:groupSeparator) or [negativeSign](ui.igNumericEditor#options:negativeSign) options.
    *
    */
  var decimalSeparator: js.UndefOr[String] = js.undefined
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
    * Removed from numeric editor options
    */
  var excludeKeys: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets/Sets the character, which is used as separator for groups (like thousands).
    * That option has effect only in display mode(no focus).
    * Note: This option has priority over possible regional settings.
    * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are implicitly set.
    * Note: This option's value should not be equal to the value of [decimalSeparator](ui.igNumericEditor#options:decimalSeparator) or [negativeSign](ui.igNumericEditor#options:negativeSign) options.
    *
    */
  var groupSeparator: js.UndefOr[String] = js.undefined
  /**
    * (array of number objects) Gets/Sets the number of digits in the integer part of a number, which are divided into groups.
    * The "groupSeparator" is inserted between groups.
    * If the sum of all values in array is smaller than the length of integer part, then the last item in array is used for all following groups.
    * Count of groups starts from the decimal point (from right to left).
    * That option has effect only in display mode(no focus).
    * Note: The numbers in the array must be positive integers.
    * Note: This option has priority over possible regional settings.
    * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are implicitly set.
    *
    */
  var groups: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Gets/Sets the height of the control.
    *
    *
    * Valid values:
    * "null" will fit the editor inside its parent container, if no other heights are defined.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
    * Removed from numeric editor options
    */
  var includeKeys: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
    *
    */
  var inputName: js.UndefOr[String] = js.undefined
  /**
    * Gets/Sets if the editor should only allow values from the list of items. Enabling this also causes spin actions to cycle through list items instead.
    *
    */
  var isLimitedToListValues: js.UndefOr[Boolean] = js.undefined
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
    * Items in the list can be of type number.
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
    * Gets/Sets the maximum number of decimal places supported by the editor.
    * Note: this option has priority over possible regional settings.
    * Note: In case of min decimals value higher than max decimals - max decimals are equaled to min decimals property.
    * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are implicitly set.
    * Note: This option supports values between 0 and 15, when dataMode is 'double' (default) and values between 0 and 7 in 'float' mode.
    *
    */
  var maxDecimals: js.UndefOr[Double] = js.undefined
  /**
    * Removed from numeric editor options
    */
  var maxLength: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets/Sets the maximum value which can be entered in the editor by the end user.
    *
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * Gets/Sets the minimum number of decimal places supported by the editor.
    * If number of digits in fractional part of number is less than the value of this option, then the "0" characters are used to fill missing digits.
    * Note: This option has priority over possible regional settings.
    * Note: In case of min decimals value higher than max decimals - max decimals are equaled to min decimals property.
    * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are implicitly set.
    * Note: This option supports values between 0 and 15, when dataMode is 'double' (default) and values between 0 and 7 in 'float' mode.
    *
    */
  var minDecimals: js.UndefOr[Double] = js.undefined
  /**
    * Gets/Sets the minimum value which can be entered in the editor by the end user.
    *
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /**
    * Gets/Sets the string, which is used as negative pattern. The "n" flag represents the value of number. The "-" and "()" flags are static part of pattern.
    * Note: This option has priority over possible regional settings.
    * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are implicitly set.
    *
    */
  var negativePattern: js.UndefOr[String] = js.undefined
  /**
    * Gets/Sets the character, which is used as negative sign.
    * Note: This option has priority over possible regional settings.
    * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are implicitly set.
    * Note: This option's value should not be equal to the value of [groupSeparator](ui.igNumericEditor#options:groupSeparator) or [decimalSeparator](ui.igNumericEditor#options:decimalSeparator) options.
    *
    */
  var negativeSign: js.UndefOr[String] = js.undefined
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
    * Gets/Sets the string, which is used as positive pattern. The "n" flag represents the value of number.
    * Note: This option has priority over possible regional settings.
    * Note: Even if the default value is null - if internationalization file is provided and it contains default values for those properties the values are implicitly set.
    *
    */
  var positivePattern: js.UndefOr[String] = js.undefined
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
    * Gets/Sets whether the last decimal place will be rounded, when the maxDecimal option is defined and applied.
    * For example if the initial editor value is set to 123.4567, maxDecimals option is set to 3 and roundDecimals is enabled,
    * then editor will round the value and will display it as 123.457. If roundDecimals is disabled then editor value will be truncated to 123.456.
    *
    */
  var roundDecimals: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets/Sets support for scientific format.
    * If that option is set, then numeric value appears as a string with possible E-power flag. In edit mode the "E" or "e" character can be entered as well.
    * Notes: The "+" character is not supported in edit mode.
    *
    *
    * Valid values:
    * "null" scientific format is disabled.
    * "E" scientific format is enabled and the "E" character is used.
    * "e" scientific format is enabled and the "e" character is used.
    * "E+" scientific format is enabled and the "E" character is used. The "E+" is used for positive values in display mode.
    * "e+" scientific format is enabled and the "e" character is used. The "e+" is used for positive values in display mode.
    */
  var scientificFormat: js.UndefOr[String] = js.undefined
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
    * Gets/Sets the default delta-value which is used with "spin" [buttonType](ui.igNumericEditor#options:buttonType) or [spinUp](ui.igNumericEditor#methods:spinUp) and [spinDown](ui.igNumericEditor#methods:spinDown) methods to increment or decrement value in the editor. The value can not be negative. Non integer value is supported only for dataMode double and float.
    *
    */
  var spinDelta: js.UndefOr[Double] = js.undefined
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
    * Removed from numeric editor options
    */
  var toLower: js.UndefOr[js.Any] = js.undefined
  /**
    * Removed from numeric editor options
    */
  var toUpper: js.UndefOr[js.Any] = js.undefined
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
    *
    */
  var value: js.UndefOr[js.Any] = js.undefined
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

object IgCurrencyEditor {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    allowNullValue: js.UndefOr[Boolean] = js.undefined,
    buttonType: String = null,
    currencySymbol: String = null,
    dataMode: String = null,
    decimalSeparator: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropDownAnimationDuration: js.UndefOr[Double] = js.undefined,
    dropDownAttachedToBody: js.UndefOr[Boolean] = js.undefined,
    dropDownOnReadOnly: js.UndefOr[Boolean] = js.undefined,
    dropDownOrientation: String = null,
    excludeKeys: js.Any = null,
    groupSeparator: String = null,
    groups: js.Array[_] = null,
    height: String | Double = null,
    includeKeys: js.Any = null,
    inputName: String = null,
    isLimitedToListValues: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    listItemHoverDuration: js.UndefOr[Double] = js.undefined,
    listItems: js.Array[_] = null,
    listWidth: js.UndefOr[Double] = js.undefined,
    locale: js.Any = null,
    maxDecimals: js.UndefOr[Double] = js.undefined,
    maxLength: js.Any = null,
    maxValue: js.UndefOr[Double] = js.undefined,
    minDecimals: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    negativePattern: String = null,
    negativeSign: String = null,
    nullValue: String | Double = null,
    placeHolder: String = null,
    positivePattern: String = null,
    preventSubmitOnEnter: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    regional: String | js.Object = null,
    revertIfNotValid: js.UndefOr[Boolean] = js.undefined,
    roundDecimals: js.UndefOr[Boolean] = js.undefined,
    scientificFormat: String = null,
    selectionOnFocus: String = null,
    spinDelta: js.UndefOr[Double] = js.undefined,
    spinWrapAround: js.UndefOr[Boolean] = js.undefined,
    suppressKeyboard: js.UndefOr[Boolean] = js.undefined,
    suppressNotifications: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    textAlign: String = null,
    textMode: js.Any = null,
    toLower: js.Any = null,
    toUpper: js.Any = null,
    validatorOptions: js.Any = null,
    value: js.Any = null,
    visibleItemsCount: js.UndefOr[Double] = js.undefined,
    width: String | Double = null
  ): IgCurrencyEditor = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowNullValue)) __obj.updateDynamic("allowNullValue")(allowNullValue.get.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (currencySymbol != null) __obj.updateDynamic("currencySymbol")(currencySymbol.asInstanceOf[js.Any])
    if (dataMode != null) __obj.updateDynamic("dataMode")(dataMode.asInstanceOf[js.Any])
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropDownAnimationDuration)) __obj.updateDynamic("dropDownAnimationDuration")(dropDownAnimationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropDownAttachedToBody)) __obj.updateDynamic("dropDownAttachedToBody")(dropDownAttachedToBody.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropDownOnReadOnly)) __obj.updateDynamic("dropDownOnReadOnly")(dropDownOnReadOnly.get.asInstanceOf[js.Any])
    if (dropDownOrientation != null) __obj.updateDynamic("dropDownOrientation")(dropDownOrientation.asInstanceOf[js.Any])
    if (excludeKeys != null) __obj.updateDynamic("excludeKeys")(excludeKeys.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (includeKeys != null) __obj.updateDynamic("includeKeys")(includeKeys.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName.asInstanceOf[js.Any])
    if (!js.isUndefined(isLimitedToListValues)) __obj.updateDynamic("isLimitedToListValues")(isLimitedToListValues.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(listItemHoverDuration)) __obj.updateDynamic("listItemHoverDuration")(listItemHoverDuration.get.asInstanceOf[js.Any])
    if (listItems != null) __obj.updateDynamic("listItems")(listItems.asInstanceOf[js.Any])
    if (!js.isUndefined(listWidth)) __obj.updateDynamic("listWidth")(listWidth.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDecimals)) __obj.updateDynamic("maxDecimals")(maxDecimals.get.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDecimals)) __obj.updateDynamic("minDecimals")(minDecimals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (negativePattern != null) __obj.updateDynamic("negativePattern")(negativePattern.asInstanceOf[js.Any])
    if (negativeSign != null) __obj.updateDynamic("negativeSign")(negativeSign.asInstanceOf[js.Any])
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    if (positivePattern != null) __obj.updateDynamic("positivePattern")(positivePattern.asInstanceOf[js.Any])
    if (!js.isUndefined(preventSubmitOnEnter)) __obj.updateDynamic("preventSubmitOnEnter")(preventSubmitOnEnter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (!js.isUndefined(revertIfNotValid)) __obj.updateDynamic("revertIfNotValid")(revertIfNotValid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(roundDecimals)) __obj.updateDynamic("roundDecimals")(roundDecimals.get.asInstanceOf[js.Any])
    if (scientificFormat != null) __obj.updateDynamic("scientificFormat")(scientificFormat.asInstanceOf[js.Any])
    if (selectionOnFocus != null) __obj.updateDynamic("selectionOnFocus")(selectionOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(spinDelta)) __obj.updateDynamic("spinDelta")(spinDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spinWrapAround)) __obj.updateDynamic("spinWrapAround")(spinWrapAround.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressKeyboard)) __obj.updateDynamic("suppressKeyboard")(suppressKeyboard.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressNotifications)) __obj.updateDynamic("suppressNotifications")(suppressNotifications.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textMode != null) __obj.updateDynamic("textMode")(textMode.asInstanceOf[js.Any])
    if (toLower != null) __obj.updateDynamic("toLower")(toLower.asInstanceOf[js.Any])
    if (toUpper != null) __obj.updateDynamic("toUpper")(toUpper.asInstanceOf[js.Any])
    if (validatorOptions != null) __obj.updateDynamic("validatorOptions")(validatorOptions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleItemsCount)) __obj.updateDynamic("visibleItemsCount")(visibleItemsCount.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgCurrencyEditor]
  }
}


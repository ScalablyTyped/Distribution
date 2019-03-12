package typings
package inputmaskLib.inputmaskMod.InputmaskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The alias to use.
    *
    * @default null
    */
  var alias: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allow to enter -.
    *
    * @default true
    */
  var allowMinus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Definition of the symbols used to indicate an alternator part in the mask.
    *
    * @default "|"
    */
  var alternatormarker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable grouping of the integer part.
    *
    * @default false
    */
  var autoGroup: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Automatically unmask the value when retrieved.
    *
    * When setting this option to true the plugin also expects the initial value from the server to be unmasked.
    *
    * @default false
    */
  var autoUnmask: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Apply casing at the mask-level.
    *
    * @default undefined
    */
  var casing: js.UndefOr[Casing] = js.undefined
  /**
    * Clear the incomplete input on blur.
    *
    * @default false
    */
  var clearIncomplete: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Remove the empty mask on blur or when not empty removes the optional trailing part.
    *
    * @default true
    */
  var clearMaskOnLostFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Create a css styleable mask.
    *
    * You need to include the inputmask.css in your page to use this option.
    *
    * See the inputmask.css for more info about the used styling. You can override the
    * Inputmask.prototype.positionColorMask`if you need some custom positioning.
    *
    * @default false
    */
  var colorMask: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Do not allow assumption of decimals input without entering the radixpoint.
    *
    * @default true
    */
  var decimalProtect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Number of fractionalDigits.
    *
    * Possible values:
    *
    * * A number describing the number of fractional digits.
    * * `*`
    * * Quantifier syntax like `2,4`. When the quantifier syntax is used, the `digitsOptional` option is ignored
    *
    * @default "*"
    */
  var digits: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify wheter the digits are optional.
    *
    * @default true
    */
  var digitsOptional: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disables predictive text on mobile devices.
    *
    * What it does:
    *
    * * changes the input type to password => disables predictive text
    * * enables the colorMask option which creates a div, which surrounds the input. So we type in the hidden
    *   password input and render the mask in the a created div.
    *
    * To use the colorMask, you need to include the inputmask.css. You might need to add some css-tweaks to make
    * it all visually correct in your page.
    *
    * @default false
    */
  var disablePredictiveText: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enforces the decimal part when leaving the input field.
    *
    * @default false
    */
  var enforceDigitsOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Definition of the symbols used to escape a part in the mask.
    *
    * @default "\\"
    */
  var escapeChar: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Toggle to allocate as much possible or the opposite. Non-greedy repeat function. With the non-greedy option
    * set to `false`, you can specify `*` as repeat. This makes an endless repeat.
    *
    * @default false
    */
  var greedy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Define the groupseparator.
    *
    * @default ""
    */
  var groupSeparator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Define the grouping of the integer part.
    *
    * @default 3
    */
  var groupSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Definition of the symbols used to indicate a group in the mask.
    *
    * @default { start: "(", end: ")" }
    */
  var groupmarker: js.UndefOr[Range] = js.undefined
  /**
    * Specify keyCodes which should not be considered in the keypress event, otherwise the `preventDefault` will
    * stop their default behavior especially in FF.
    */
  var ignorables: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Specify to use the `data-inputmask` attributes or to ignore them.
    *
    * If you don't use data attributes you can disable the import by specifying `importDataAttributes: false`.
    *
    * @default true
    */
  var importDataAttributes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Format used to input a date. This option is only effective for the datetime alias.
    *
    * Supported symbols
    *
    * * `d` - Day of the month as digits; no leading zero for single-digit days.
    * * `dd` - Day of the month as digits; leading zero for single-digit days.
    * * `ddd` - Day of the week as a three-letter abbreviation.
    * * `dddd` - Day of the week as its full name.
    * * `m` - Month as digits; no leading zero for single-digit months.
    * * `mm` - Month as digits; leading zero for single-digit months.
    * * `mmm` - Month as a three-letter abbreviation.
    * * `mmmm` - Month as its full name.
    * * `yy` - Year as last two digits; leading zero for years less than 10.
    * * `yyyy` - Year as 4 digits.
    * * `h` - Hours; no leading zero for single-digit hours (12-hour clock).
    * * `hh` - Hours; leading zero for single-digit hours (12-hour clock).
    * * `hhh` - Hours; no limit
    * * `H` - Hours; no leading zero for single-digit hours (24-hour clock).
    * * `HH` - Hours; leading zero for single-digit hours (24-hour clock).
    * * `HHH` - Hours; no limit
    * * `M` - Minutes; no leading zero for single-digit minutes. Uppercase M unlike CF timeFormat's m to avoid
    *         conflict with months.
    * * `MM` - Minutes; leading zero for single-digit minutes. Uppercase MM unlike CF timeFormat's mm to avoid
    *          conflict with months.
    * * `s` - Seconds; no leading zero for single-digit seconds.
    * * `ss` - Seconds; leading zero for single-digit seconds.
    * * `l` - Milliseconds. 3 digits.
    * * `L` - Milliseconds. 2 digits.
    * * `t` - Lowercase, single-character time marker string: a or p.
    * * `tt` - Two-character time marker string: am or pm.
    * * `T` - Single-character time marker string: A or P.
    * * `TT` - Two-character time marker string: AM or PM.
    * * `Z` - US timezone abbreviation, e.g. EST or MDT. With non-US timezones or in the Opera browser, the
    *         GMT/UTC offset is returned, e.g. GMT-0500
    * * `o` - GMT/UTC timezone offset, e.g. -0500 or +0230.
    * * `S` - The date's ordinal suffix (st, nd, rd, or th). Works well with d.
    *
    * @default "isoDateTime"
    */
  var inputFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether the value passed for initialization is text or a number
    *
    * @default "text"
    */
  var inputType: js.UndefOr[inputmaskLib.inputmaskLibStrings.text | inputmaskLib.inputmaskLibStrings.number] = js.undefined
  /**
    * Specify the inputmode - already in place for when browsers start to support them
    * https://html.spec.whatwg.org/#input-modalities:-the-inputmode-attribute
    *
    * @default "verbatim"
    */
  var inputmode: js.UndefOr[InputMode] = js.undefined
  /**
    * Toggle to insert or overwrite input. This option can be altered by pressing the Insert key.
    *
    * @default true
    */
  var insertMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Number of integerDigits
    *
    * @default "+"
    */
  var integerDigits: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify wheter the integerdigits are optional.
    *
    * @default true
    */
  var integerOptional: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * With this call-in (hook) you can override the default implementation of the isComplete function.
    */
  var isComplete: js.UndefOr[
    js.Function2[/* buffer */ js.Array[java.lang.String], /* opts */ Options, scala.Boolean]
  ] = js.undefined
  /**
    * Just in time masking. With the `jitMasking` option you can enable jit masking. The mask will only be
    * visible for the user entered characters.
    *
    * @default false
    */
  var jitMasking: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use in combination with the alternator syntax Try to keep the mask static while typing. Decisions to alter the
    * mask will be postponed if possible.
    *
    * ex. $(selector).inputmask({ mask: ["+55-99-9999-9999", "+55-99-99999-9999", ], keepStatic: true });
    *
    * typing 1212345123 => should result in +55-12-1234-5123 type extra 4 => switch to +55-12-12345-1234
    *
    * When passing multiple masks (an array of masks) keepStatic is automatically set to true unless explicitly set
    * through the options.
    *
    * @default null
    */
  var keepStatic: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * The mask to use.
    */
  var mask: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | (js.Function1[/* opts */ this.type, java.lang.String | js.Array[java.lang.String]])
  ] = js.undefined
  /**
    * Maximum value. This needs to be in the same format as the `inputFormat` when used with the datetime alias.
    */
  var max: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Minimum value. This needs to be in the same format as the `inputFormat` when used with the datetime alias.
    */
  var min: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Define your negationSymbol.
    *
    * @default { front: "-", back: "" }
    */
  var negationSymbol: js.UndefOr[inputmaskLib.Anon_Back] = js.undefined
  /**
    * Disable value property patching
    *
    * @default false
    */
  var noValuePatching: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Return nothing from the input `value` property when the user hasn't entered anything. If this is false,
    * the mask might be returned.
    *
    * @default true
    */
  var nullable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Numeric input direction. Keeps the caret at the end.
    *
    * @default false
    */
  var numericInput: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Executes before masking the initial value to allow preprocessing of the initial value.
    */
  var onBeforeMask: js.UndefOr[
    js.Function2[/* initialValue */ java.lang.String, /* opts */ Options, java.lang.String]
  ] = js.undefined
  /**
    * This callback allows for preprocessing the pasted value before actually handling the value for masking.
    * This can be useful for stripping away some characters before processing. You can also disable pasting
    * a value by returning false in the `onBeforePaste` call.
    */
  var onBeforePaste: js.UndefOr[
    js.Function2[/* pastedValue */ java.lang.String, /* opts */ Options, java.lang.String]
  ] = js.undefined
  /**
    * Executes before writing to the masked element Use this to do some extra processing of the input. This can
    * be useful when implementing an alias, ex. decimal alias, autofill the digits when leaving the inputfield.
    */
  var onBeforeWrite: js.UndefOr[
    js.Function4[
      /* event */ stdLib.KeyboardEvent, 
      /* buffer */ js.Array[java.lang.String], 
      /* caretPos */ scala.Double, 
      /* opts */ Options, 
      CommandObject
    ]
  ] = js.undefined
  /**
    * Callback to implement autocomplete on certain keys for example.
    */
  var onKeyDown: js.UndefOr[
    js.Function4[
      /* event */ stdLib.KeyboardEvent, 
      /* buffer */ js.Array[java.lang.String], 
      /* caretPos */ scala.Double, 
      /* opts */ Options, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback function is executed on every keyvalidation with the key & result as parameter.
    */
  var onKeyValidation: js.UndefOr[js.Function2[/* key */ scala.Double, /* result */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * Executes after unmasking to allow post-processing of the unmaskedvalue.
    *
    * @returns New unmasked value
    */
  var onUnMask: js.UndefOr[
    js.Function2[
      /* maskedValue */ java.lang.String, 
      /* unmaskedValue */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  /**
    * Execute a function when the mask is cleared.
    */
  var oncleared: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Execute a function when the mask is completed.
    */
  var oncomplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Execute a function when the mask is cleared.
    */
  var onincomplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Definition of the symbols used to indicate an optional part in the mask.
    *
    * @default { start: "[", end: "]" }
    */
  var optionalmarker: js.UndefOr[Range] = js.undefined
  /**
    * Format of the unmasked value. This is only effective when used with the datetime alias.
    */
  var outputFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Change the mask placeholder. Instead of "_", you can change the unfilled characters mask as you like, simply
    * by adding the placeholder option. For example, placeholder: " " will change the default autofill with empty
    * values.
    *
    * @default "_"
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Positioning of the caret on click.
    *
    * Options:
    *
    * * `none`
    * * `lvp` - based on the last valid position (default)
    * * `radixFocus` - position caret to radixpoint on initial click
    * * `select` - select the whole input
    * * `ignore` - ignore the click and continue the mask
    *
    * @default "lvp"
    */
  var positionCaretOnClick: js.UndefOr[PositionCaretOnClick] = js.undefined
  /**
    * When enabled the caret position is set after the latest valid position on TAB.
    *
    * @default true
    */
  var positionCaretOnTab: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Hook to postValidate the result from isValid. Useful for validating the entry as a whole.
    */
  var postValidation: js.UndefOr[
    js.Function4[
      /* buffer */ js.Array[java.lang.String], 
      /* pos */ scala.Double, 
      /* currentResult */ CommandObject, 
      /* opts */ Options, 
      scala.Boolean | CommandObject
    ]
  ] = js.undefined
  /**
    * Hook to preValidate the input. Useful for validating regardless the definition. When return true, the normal
    * validation kicks in, otherwise it is skipped.
    */
  var preValidation: js.UndefOr[
    js.Function5[
      /* buffer */ js.Array[java.lang.String], 
      /* pos */ scala.Double, 
      /* char */ java.lang.String, 
      /* isSelection */ scala.Boolean, 
      /* opts */ Options, 
      scala.Boolean | CommandObject
    ]
  ] = js.undefined
  /**
    * Define a prefix.
    *
    * @default ""
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Definition of the symbols used to indicate a quantifier in the mask.
    *
    * @default { start: "{", end: "}" }
    */
  var quantifiermarker: js.UndefOr[Range] = js.undefined
  /**
    * Define the radixpoint (decimal separator)
    *
    * @default ""
    */
  var radixPoint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use a regular expression as a mask. When using shorthands be aware that you need to double escape or use
    * String.raw with a string literal.
    */
  var regex: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Remove the mask before submitting the form.
    *
    * @default false
    */
  var removeMaskOnSubmit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Mask repeat function. Repeat the mask definition x-times.
    * `*` ~ forever, otherwise specify an integer
    *
    * @default 0
    */
  var repeat: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Align the input to the right
    *
    * By setting the rightAlign you can specify to right align an inputmask. This is only applied in combination of
    * the `numericInput` option or the `dir-attribute`.
    *
    * @default true
    */
  var rightAlign: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shift position of the mask entries on entry and deletion. In some cases shift the mask enties isn't desired.
    *
    * Ex. date masks. Shifting month to day makes no sense
    *
    * @default true
    */
  var shiftPositions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shows the mask when the input gets focus.
    *
    * @default true
    */
  var showMaskOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shows the mask when the input is hevered by the mouse cursor.
    *
    * @default true
    */
  var showMaskOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A character which can be used to skip an optional part of a mask.
    *
    * @default " "
    */
  var skipOptionalPartCharacter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The `staticDefinitionSymbol` option is used to indicate that the static entries in the mask can match a
    * certain definition. Especially useful with alternators so that static element in the mask can match
    * another alternation.
    *
    * @default undefined
    */
  var staticDefinitionSymbol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Define the step the ctrl-up & ctrl-down must take.
    *
    * @default 1
    */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
    * Define a suffix.
    *
    * @default ""
    */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List with the supported input types
    *
    * @default ["text", "tel", "url", "password", "search"]
    */
  var supportsInputType: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Allows for tabbing through the different parts of the masked field.
    *
    * @default false
    */
  var tabThrough: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Make escape behave like undo. (ctrl-Z) Pressing escape reverts the value to the value before focus.
    *
    * @default true
    */
  var undoOnEscape: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Make unmasking returning a number instead of a string.
    *
    * Be warned that using the unmaskAsNumber option together with jQuery.serialize will fail as serialize expects a string. (See issue #1288)
    *
    * @default false
    */
  var unmaskAsNumber: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alias: java.lang.String = null,
    allowMinus: js.UndefOr[scala.Boolean] = js.undefined,
    alternatormarker: java.lang.String = null,
    autoGroup: js.UndefOr[scala.Boolean] = js.undefined,
    autoUnmask: js.UndefOr[scala.Boolean] = js.undefined,
    casing: Casing = null,
    clearIncomplete: js.UndefOr[scala.Boolean] = js.undefined,
    clearMaskOnLostFocus: js.UndefOr[scala.Boolean] = js.undefined,
    colorMask: js.UndefOr[scala.Boolean] = js.undefined,
    decimalProtect: js.UndefOr[scala.Boolean] = js.undefined,
    digits: java.lang.String = null,
    digitsOptional: js.UndefOr[scala.Boolean] = js.undefined,
    disablePredictiveText: js.UndefOr[scala.Boolean] = js.undefined,
    enforceDigitsOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    escapeChar: java.lang.String = null,
    greedy: js.UndefOr[scala.Boolean] = js.undefined,
    groupSeparator: java.lang.String = null,
    groupSize: scala.Int | scala.Double = null,
    groupmarker: Range = null,
    ignorables: js.Array[scala.Double] = null,
    importDataAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    inputFormat: java.lang.String = null,
    inputType: inputmaskLib.inputmaskLibStrings.text | inputmaskLib.inputmaskLibStrings.number = null,
    inputmode: InputMode = null,
    insertMode: js.UndefOr[scala.Boolean] = js.undefined,
    integerDigits: java.lang.String = null,
    integerOptional: js.UndefOr[scala.Boolean] = js.undefined,
    isComplete: (/* buffer */ js.Array[java.lang.String], /* opts */ Options) => scala.Boolean = null,
    jitMasking: js.UndefOr[scala.Boolean] = js.undefined,
    keepStatic: js.UndefOr[scala.Boolean] = js.undefined,
    mask: java.lang.String | js.Array[java.lang.String] | (js.Function1[Options, java.lang.String | js.Array[java.lang.String]]) = null,
    max: java.lang.String = null,
    min: java.lang.String = null,
    negationSymbol: inputmaskLib.Anon_Back = null,
    noValuePatching: js.UndefOr[scala.Boolean] = js.undefined,
    nullable: js.UndefOr[scala.Boolean] = js.undefined,
    numericInput: js.UndefOr[scala.Boolean] = js.undefined,
    onBeforeMask: (/* initialValue */ java.lang.String, /* opts */ Options) => java.lang.String = null,
    onBeforePaste: (/* pastedValue */ java.lang.String, /* opts */ Options) => java.lang.String = null,
    onBeforeWrite: (/* event */ stdLib.KeyboardEvent, /* buffer */ js.Array[java.lang.String], /* caretPos */ scala.Double, /* opts */ Options) => CommandObject = null,
    onKeyDown: (/* event */ stdLib.KeyboardEvent, /* buffer */ js.Array[java.lang.String], /* caretPos */ scala.Double, /* opts */ Options) => scala.Unit = null,
    onKeyValidation: (/* key */ scala.Double, /* result */ scala.Boolean) => scala.Unit = null,
    onUnMask: (/* maskedValue */ java.lang.String, /* unmaskedValue */ java.lang.String) => java.lang.String = null,
    oncleared: () => scala.Unit = null,
    oncomplete: () => scala.Unit = null,
    onincomplete: () => scala.Unit = null,
    optionalmarker: Range = null,
    outputFormat: java.lang.String = null,
    placeholder: java.lang.String = null,
    positionCaretOnClick: PositionCaretOnClick = null,
    positionCaretOnTab: js.UndefOr[scala.Boolean] = js.undefined,
    postValidation: (/* buffer */ js.Array[java.lang.String], /* pos */ scala.Double, /* currentResult */ CommandObject, /* opts */ Options) => scala.Boolean | CommandObject = null,
    preValidation: (/* buffer */ js.Array[java.lang.String], /* pos */ scala.Double, /* char */ java.lang.String, /* isSelection */ scala.Boolean, /* opts */ Options) => scala.Boolean | CommandObject = null,
    prefix: java.lang.String = null,
    quantifiermarker: Range = null,
    radixPoint: java.lang.String = null,
    regex: java.lang.String = null,
    removeMaskOnSubmit: js.UndefOr[scala.Boolean] = js.undefined,
    repeat: scala.Double | java.lang.String = null,
    rightAlign: js.UndefOr[scala.Boolean] = js.undefined,
    shiftPositions: js.UndefOr[scala.Boolean] = js.undefined,
    showMaskOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    showMaskOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    skipOptionalPartCharacter: java.lang.String = null,
    staticDefinitionSymbol: java.lang.String = null,
    step: scala.Int | scala.Double = null,
    suffix: java.lang.String = null,
    supportsInputType: js.Array[java.lang.String] = null,
    tabThrough: js.UndefOr[scala.Boolean] = js.undefined,
    undoOnEscape: js.UndefOr[scala.Boolean] = js.undefined,
    unmaskAsNumber: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowMinus)) __obj.updateDynamic("allowMinus")(allowMinus)
    if (alternatormarker != null) __obj.updateDynamic("alternatormarker")(alternatormarker)
    if (!js.isUndefined(autoGroup)) __obj.updateDynamic("autoGroup")(autoGroup)
    if (!js.isUndefined(autoUnmask)) __obj.updateDynamic("autoUnmask")(autoUnmask)
    if (casing != null) __obj.updateDynamic("casing")(casing)
    if (!js.isUndefined(clearIncomplete)) __obj.updateDynamic("clearIncomplete")(clearIncomplete)
    if (!js.isUndefined(clearMaskOnLostFocus)) __obj.updateDynamic("clearMaskOnLostFocus")(clearMaskOnLostFocus)
    if (!js.isUndefined(colorMask)) __obj.updateDynamic("colorMask")(colorMask)
    if (!js.isUndefined(decimalProtect)) __obj.updateDynamic("decimalProtect")(decimalProtect)
    if (digits != null) __obj.updateDynamic("digits")(digits)
    if (!js.isUndefined(digitsOptional)) __obj.updateDynamic("digitsOptional")(digitsOptional)
    if (!js.isUndefined(disablePredictiveText)) __obj.updateDynamic("disablePredictiveText")(disablePredictiveText)
    if (!js.isUndefined(enforceDigitsOnBlur)) __obj.updateDynamic("enforceDigitsOnBlur")(enforceDigitsOnBlur)
    if (escapeChar != null) __obj.updateDynamic("escapeChar")(escapeChar)
    if (!js.isUndefined(greedy)) __obj.updateDynamic("greedy")(greedy)
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator)
    if (groupSize != null) __obj.updateDynamic("groupSize")(groupSize.asInstanceOf[js.Any])
    if (groupmarker != null) __obj.updateDynamic("groupmarker")(groupmarker.asInstanceOf[js.Any])
    if (ignorables != null) __obj.updateDynamic("ignorables")(ignorables)
    if (!js.isUndefined(importDataAttributes)) __obj.updateDynamic("importDataAttributes")(importDataAttributes)
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat)
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (inputmode != null) __obj.updateDynamic("inputmode")(inputmode)
    if (!js.isUndefined(insertMode)) __obj.updateDynamic("insertMode")(insertMode)
    if (integerDigits != null) __obj.updateDynamic("integerDigits")(integerDigits)
    if (!js.isUndefined(integerOptional)) __obj.updateDynamic("integerOptional")(integerOptional)
    if (isComplete != null) __obj.updateDynamic("isComplete")(js.Any.fromFunction2(isComplete))
    if (!js.isUndefined(jitMasking)) __obj.updateDynamic("jitMasking")(jitMasking)
    if (!js.isUndefined(keepStatic)) __obj.updateDynamic("keepStatic")(keepStatic)
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (negationSymbol != null) __obj.updateDynamic("negationSymbol")(negationSymbol)
    if (!js.isUndefined(noValuePatching)) __obj.updateDynamic("noValuePatching")(noValuePatching)
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable)
    if (!js.isUndefined(numericInput)) __obj.updateDynamic("numericInput")(numericInput)
    if (onBeforeMask != null) __obj.updateDynamic("onBeforeMask")(js.Any.fromFunction2(onBeforeMask))
    if (onBeforePaste != null) __obj.updateDynamic("onBeforePaste")(js.Any.fromFunction2(onBeforePaste))
    if (onBeforeWrite != null) __obj.updateDynamic("onBeforeWrite")(js.Any.fromFunction4(onBeforeWrite))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction4(onKeyDown))
    if (onKeyValidation != null) __obj.updateDynamic("onKeyValidation")(js.Any.fromFunction2(onKeyValidation))
    if (onUnMask != null) __obj.updateDynamic("onUnMask")(js.Any.fromFunction2(onUnMask))
    if (oncleared != null) __obj.updateDynamic("oncleared")(js.Any.fromFunction0(oncleared))
    if (oncomplete != null) __obj.updateDynamic("oncomplete")(js.Any.fromFunction0(oncomplete))
    if (onincomplete != null) __obj.updateDynamic("onincomplete")(js.Any.fromFunction0(onincomplete))
    if (optionalmarker != null) __obj.updateDynamic("optionalmarker")(optionalmarker.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (positionCaretOnClick != null) __obj.updateDynamic("positionCaretOnClick")(positionCaretOnClick)
    if (!js.isUndefined(positionCaretOnTab)) __obj.updateDynamic("positionCaretOnTab")(positionCaretOnTab)
    if (postValidation != null) __obj.updateDynamic("postValidation")(js.Any.fromFunction4(postValidation))
    if (preValidation != null) __obj.updateDynamic("preValidation")(js.Any.fromFunction5(preValidation))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (quantifiermarker != null) __obj.updateDynamic("quantifiermarker")(quantifiermarker.asInstanceOf[js.Any])
    if (radixPoint != null) __obj.updateDynamic("radixPoint")(radixPoint)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (!js.isUndefined(removeMaskOnSubmit)) __obj.updateDynamic("removeMaskOnSubmit")(removeMaskOnSubmit)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (!js.isUndefined(rightAlign)) __obj.updateDynamic("rightAlign")(rightAlign)
    if (!js.isUndefined(shiftPositions)) __obj.updateDynamic("shiftPositions")(shiftPositions)
    if (!js.isUndefined(showMaskOnFocus)) __obj.updateDynamic("showMaskOnFocus")(showMaskOnFocus)
    if (!js.isUndefined(showMaskOnHover)) __obj.updateDynamic("showMaskOnHover")(showMaskOnHover)
    if (skipOptionalPartCharacter != null) __obj.updateDynamic("skipOptionalPartCharacter")(skipOptionalPartCharacter)
    if (staticDefinitionSymbol != null) __obj.updateDynamic("staticDefinitionSymbol")(staticDefinitionSymbol)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (supportsInputType != null) __obj.updateDynamic("supportsInputType")(supportsInputType)
    if (!js.isUndefined(tabThrough)) __obj.updateDynamic("tabThrough")(tabThrough)
    if (!js.isUndefined(undoOnEscape)) __obj.updateDynamic("undoOnEscape")(undoOnEscape)
    if (!js.isUndefined(unmaskAsNumber)) __obj.updateDynamic("unmaskAsNumber")(unmaskAsNumber)
    __obj.asInstanceOf[Options]
  }
}


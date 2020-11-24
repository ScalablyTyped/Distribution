package typings.inputmask.mod

import org.scalablytyped.runtime.StringDictionary
import typings.inputmask.anon.Back
import typings.inputmask.inputmaskStrings.number
import typings.inputmask.inputmaskStrings.text
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The alias to use.
    *
    * @default null
    */
  var alias: js.UndefOr[String] = js.native
  
  /**
    * Allow to enter -.
    *
    * @default true
    */
  var allowMinus: js.UndefOr[Boolean] = js.native
  
  /**
    * Definition of the symbols used to indicate an alternator part in the mask.
    *
    * @default "|"
    */
  var alternatormarker: js.UndefOr[String] = js.native
  
  /**
    * Enable grouping of the integer part.
    *
    * @default false
    */
  var autoGroup: js.UndefOr[Boolean] = js.native
  
  /**
    * Automatically unmask the value when retrieved.
    *
    * When setting this option to true the plugin also expects the initial value from the server to be unmasked.
    *
    * @default false
    */
  var autoUnmask: js.UndefOr[Boolean] = js.native
  
  /**
    * Apply casing at the mask-level.
    *
    * @default undefined
    */
  var casing: js.UndefOr[Casing] = js.native
  
  /**
    * Clear the incomplete input on blur.
    *
    * @default false
    */
  var clearIncomplete: js.UndefOr[Boolean] = js.native
  
  /**
    * Remove the empty mask on blur or when not empty removes the optional trailing part.
    *
    * @default true
    */
  var clearMaskOnLostFocus: js.UndefOr[Boolean] = js.native
  
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
  var colorMask: js.UndefOr[Boolean] = js.native
  
  /**
    * Do not allow assumption of decimals input without entering the radixpoint.
    *
    * @default true
    */
  var decimalProtect: js.UndefOr[Boolean] = js.native
  
  /**
    * Add new definitions to this inputmask.
    */
  var definitions: js.UndefOr[StringDictionary[Definition]] = js.native
  
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
  var digits: js.UndefOr[String] = js.native
  
  /**
    * Specify wheter the digits are optional.
    *
    * @default true
    */
  var digitsOptional: js.UndefOr[Boolean] = js.native
  
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
  var disablePredictiveText: js.UndefOr[Boolean] = js.native
  
  /**
    * Enforces the decimal part when leaving the input field.
    *
    * @default false
    */
  var enforceDigitsOnBlur: js.UndefOr[Boolean] = js.native
  
  /**
    * Definition of the symbols used to escape a part in the mask.
    *
    * @default "\\"
    */
  var escapeChar: js.UndefOr[String] = js.native
  
  /**
    * Toggle to allocate as much possible or the opposite. Non-greedy repeat function. With the non-greedy option
    * set to `false`, you can specify `*` as repeat. This makes an endless repeat.
    *
    * @default false
    */
  var greedy: js.UndefOr[Boolean] = js.native
  
  /**
    * Define the groupseparator.
    *
    * @default ""
    */
  var groupSeparator: js.UndefOr[String] = js.native
  
  /**
    * Define the grouping of the integer part.
    *
    * @default 3
    */
  var groupSize: js.UndefOr[Double] = js.native
  
  /**
    * Definition of the symbols used to indicate a group in the mask.
    *
    * @default { start: "(", end: ")" }
    */
  var groupmarker: js.UndefOr[Range] = js.native
  
  /**
    * Specify keyCodes which should not be considered in the keypress event, otherwise the `preventDefault` will
    * stop their default behavior especially in FF.
    */
  var ignorables: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Specify to use the `data-inputmask` attributes or to ignore them.
    *
    * If you don't use data attributes you can disable the import by specifying `importDataAttributes: false`.
    *
    * @default true
    */
  var importDataAttributes: js.UndefOr[Boolean] = js.native
  
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
  var inputFormat: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the value passed for initialization is text or a number
    *
    * @default "text"
    */
  var inputType: js.UndefOr[text | number] = js.native
  
  /**
    * Specify the inputmode - already in place for when browsers start to support them
    * https://html.spec.whatwg.org/#input-modalities:-the-inputmode-attribute
    *
    * @default "verbatim"
    */
  var inputmode: js.UndefOr[InputMode] = js.native
  
  /**
    * Toggle to insert or overwrite input. This option can be altered by pressing the Insert key.
    *
    * @default true
    */
  var insertMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of integerDigits
    *
    * @default "+"
    */
  var integerDigits: js.UndefOr[String] = js.native
  
  /**
    * Specify wheter the integerdigits are optional.
    *
    * @default true
    */
  var integerOptional: js.UndefOr[Boolean] = js.native
  
  /**
    * With this call-in (hook) you can override the default implementation of the isComplete function.
    */
  var isComplete: js.UndefOr[js.Function2[/* buffer */ js.Array[String], /* opts */ this.type, Boolean]] = js.native
  
  /**
    * Just in time masking. With the `jitMasking` option you can enable jit masking. The mask will only be
    * visible for the user entered characters.
    *
    * @default false
    */
  var jitMasking: js.UndefOr[Boolean] = js.native
  
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
  var keepStatic: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * The mask to use.
    */
  var mask: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* opts */ this.type, String | js.Array[String]])
  ] = js.native
  
  /**
    * Maximum value. This needs to be in the same format as the `inputFormat` when used with the datetime alias.
    */
  var max: js.UndefOr[String] = js.native
  
  /**
    * Minimum value. This needs to be in the same format as the `inputFormat` when used with the datetime alias.
    */
  var min: js.UndefOr[String] = js.native
  
  /**
    * Define your negationSymbol.
    *
    * @default { front: "-", back: "" }
    */
  var negationSymbol: js.UndefOr[Back] = js.native
  
  /**
    * Disable value property patching
    *
    * @default false
    */
  var noValuePatching: js.UndefOr[Boolean] = js.native
  
  /**
    * Return nothing from the input `value` property when the user hasn't entered anything. If this is false,
    * the mask might be returned.
    *
    * @default true
    */
  var nullable: js.UndefOr[Boolean] = js.native
  
  /**
    * Numeric input direction. Keeps the caret at the end.
    *
    * @default false
    */
  var numericInput: js.UndefOr[Boolean] = js.native
  
  /**
    * Executes before masking the initial value to allow preprocessing of the initial value.
    */
  var onBeforeMask: js.UndefOr[js.Function2[/* initialValue */ String, /* opts */ this.type, String]] = js.native
  
  /**
    * This callback allows for preprocessing the pasted value before actually handling the value for masking.
    * This can be useful for stripping away some characters before processing. You can also disable pasting
    * a value by returning false in the `onBeforePaste` call.
    */
  var onBeforePaste: js.UndefOr[js.Function2[/* pastedValue */ String, /* opts */ this.type, String]] = js.native
  
  /**
    * Executes before writing to the masked element Use this to do some extra processing of the input. This can
    * be useful when implementing an alias, ex. decimal alias, autofill the digits when leaving the inputfield.
    */
  var onBeforeWrite: js.UndefOr[
    js.Function4[
      /* event */ KeyboardEvent, 
      /* buffer */ js.Array[String], 
      /* caretPos */ Double, 
      /* opts */ this.type, 
      CommandObject
    ]
  ] = js.native
  
  /**
    * Callback to implement autocomplete on certain keys for example.
    */
  var onKeyDown: js.UndefOr[
    js.Function4[
      /* event */ KeyboardEvent, 
      /* buffer */ js.Array[String], 
      /* caretPos */ Double, 
      /* opts */ this.type, 
      Unit
    ]
  ] = js.native
  
  /**
    * Callback function is executed on every keyvalidation with the key & result as parameter.
    */
  var onKeyValidation: js.UndefOr[js.Function2[/* key */ Double, /* result */ Boolean, Unit]] = js.native
  
  /**
    * Executes after unmasking to allow post-processing of the unmaskedvalue.
    *
    * @returns New unmasked value
    */
  var onUnMask: js.UndefOr[js.Function2[/* maskedValue */ String, /* unmaskedValue */ String, String]] = js.native
  
  /**
    * Execute a function when the mask is cleared.
    */
  var oncleared: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Execute a function when the mask is completed.
    */
  var oncomplete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Execute a function when the mask is cleared.
    */
  var onincomplete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Definition of the symbols used to indicate an optional part in the mask.
    *
    * @default { start: "[", end: "]" }
    */
  var optionalmarker: js.UndefOr[Range] = js.native
  
  /**
    * Format of the unmasked value. This is only effective when used with the datetime alias.
    */
  var outputFormat: js.UndefOr[String] = js.native
  
  /**
    * Change the mask placeholder. Instead of "_", you can change the unfilled characters mask as you like, simply
    * by adding the placeholder option. For example, placeholder: " " will change the default autofill with empty
    * values.
    *
    * @default "_"
    */
  var placeholder: js.UndefOr[String] = js.native
  
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
  var positionCaretOnClick: js.UndefOr[PositionCaretOnClick] = js.native
  
  /**
    * When enabled the caret position is set after the latest valid position on TAB.
    *
    * @default true
    */
  var positionCaretOnTab: js.UndefOr[Boolean] = js.native
  
  /**
    * Hook to postValidate the result from isValid. Useful for validating the entry as a whole.
    */
  var postValidation: js.UndefOr[
    js.Function4[
      /* buffer */ js.Array[String], 
      /* pos */ Double, 
      /* currentResult */ CommandObject, 
      /* opts */ this.type, 
      Boolean | CommandObject
    ]
  ] = js.native
  
  /**
    * Hook to preValidate the input. Useful for validating regardless the definition. When return true, the normal
    * validation kicks in, otherwise it is skipped.
    */
  var preValidation: js.UndefOr[
    js.Function5[
      /* buffer */ js.Array[String], 
      /* pos */ Double, 
      /* char */ String, 
      /* isSelection */ Boolean, 
      /* opts */ this.type, 
      Boolean | CommandObject
    ]
  ] = js.native
  
  /**
    * Define a prefix.
    *
    * @default ""
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * Definition of the symbols used to indicate a quantifier in the mask.
    *
    * @default { start: "{", end: "}" }
    */
  var quantifiermarker: js.UndefOr[Range] = js.native
  
  /**
    * Define the radixpoint (decimal separator)
    *
    * @default ""
    */
  var radixPoint: js.UndefOr[String] = js.native
  
  /**
    * Use a regular expression as a mask. When using shorthands be aware that you need to double escape or use
    * String.raw with a string literal.
    */
  var regex: js.UndefOr[String] = js.native
  
  /**
    * Remove the mask before submitting the form.
    *
    * @default false
    */
  var removeMaskOnSubmit: js.UndefOr[Boolean] = js.native
  
  /**
    * Mask repeat function. Repeat the mask definition x-times.
    * `*` ~ forever, otherwise specify an integer
    *
    * @default 0
    */
  var repeat: js.UndefOr[Double | String] = js.native
  
  /**
    * Align the input to the right
    *
    * By setting the rightAlign you can specify to right align an inputmask. This is only applied in combination of
    * the `numericInput` option or the `dir-attribute`.
    *
    * @default true
    */
  var rightAlign: js.UndefOr[Boolean] = js.native
  
  /**
    * Shift position of the mask entries on entry and deletion. In some cases shift the mask enties isn't desired.
    *
    * Ex. date masks. Shifting month to day makes no sense
    *
    * @default true
    */
  var shiftPositions: js.UndefOr[Boolean] = js.native
  
  /**
    * Shows the mask when the input gets focus.
    *
    * @default true
    */
  var showMaskOnFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Shows the mask when the input is hevered by the mouse cursor.
    *
    * @default true
    */
  var showMaskOnHover: js.UndefOr[Boolean] = js.native
  
  /**
    * A character which can be used to skip an optional part of a mask.
    *
    * @default " "
    */
  var skipOptionalPartCharacter: js.UndefOr[String] = js.native
  
  /**
    * The `staticDefinitionSymbol` option is used to indicate that the static entries in the mask can match a
    * certain definition. Especially useful with alternators so that static element in the mask can match
    * another alternation.
    *
    * @default undefined
    */
  var staticDefinitionSymbol: js.UndefOr[String] = js.native
  
  /**
    * Define the step the ctrl-up & ctrl-down must take.
    *
    * @default 1
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * Define a suffix.
    *
    * @default ""
    */
  var suffix: js.UndefOr[String] = js.native
  
  /**
    * List with the supported input types
    *
    * @default ["text", "tel", "url", "password", "search"]
    */
  var supportsInputType: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Allows for tabbing through the different parts of the masked field.
    *
    * @default false
    */
  var tabThrough: js.UndefOr[Boolean] = js.native
  
  /**
    * Make escape behave like undo. (ctrl-Z) Pressing escape reverts the value to the value before focus.
    *
    * @default true
    */
  var undoOnEscape: js.UndefOr[Boolean] = js.native
  
  /**
    * Make unmasking returning a number instead of a string.
    *
    * Be warned that using the unmaskAsNumber option together with jQuery.serialize will fail as serialize expects a string. (See issue #1288)
    *
    * @default false
    */
  var unmaskAsNumber: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setAllowMinus(value: Boolean): Self = this.set("allowMinus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMinus: Self = this.set("allowMinus", js.undefined)
    
    @scala.inline
    def setAlternatormarker(value: String): Self = this.set("alternatormarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternatormarker: Self = this.set("alternatormarker", js.undefined)
    
    @scala.inline
    def setAutoGroup(value: Boolean): Self = this.set("autoGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoGroup: Self = this.set("autoGroup", js.undefined)
    
    @scala.inline
    def setAutoUnmask(value: Boolean): Self = this.set("autoUnmask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUnmask: Self = this.set("autoUnmask", js.undefined)
    
    @scala.inline
    def setCasing(value: Casing): Self = this.set("casing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCasing: Self = this.set("casing", js.undefined)
    
    @scala.inline
    def setClearIncomplete(value: Boolean): Self = this.set("clearIncomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearIncomplete: Self = this.set("clearIncomplete", js.undefined)
    
    @scala.inline
    def setClearMaskOnLostFocus(value: Boolean): Self = this.set("clearMaskOnLostFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearMaskOnLostFocus: Self = this.set("clearMaskOnLostFocus", js.undefined)
    
    @scala.inline
    def setColorMask(value: Boolean): Self = this.set("colorMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorMask: Self = this.set("colorMask", js.undefined)
    
    @scala.inline
    def setDecimalProtect(value: Boolean): Self = this.set("decimalProtect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalProtect: Self = this.set("decimalProtect", js.undefined)
    
    @scala.inline
    def setDefinitions(value: StringDictionary[Definition]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
    
    @scala.inline
    def setDigits(value: String): Self = this.set("digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigits: Self = this.set("digits", js.undefined)
    
    @scala.inline
    def setDigitsOptional(value: Boolean): Self = this.set("digitsOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigitsOptional: Self = this.set("digitsOptional", js.undefined)
    
    @scala.inline
    def setDisablePredictiveText(value: Boolean): Self = this.set("disablePredictiveText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePredictiveText: Self = this.set("disablePredictiveText", js.undefined)
    
    @scala.inline
    def setEnforceDigitsOnBlur(value: Boolean): Self = this.set("enforceDigitsOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceDigitsOnBlur: Self = this.set("enforceDigitsOnBlur", js.undefined)
    
    @scala.inline
    def setEscapeChar(value: String): Self = this.set("escapeChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeChar: Self = this.set("escapeChar", js.undefined)
    
    @scala.inline
    def setGreedy(value: Boolean): Self = this.set("greedy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreedy: Self = this.set("greedy", js.undefined)
    
    @scala.inline
    def setGroupSeparator(value: String): Self = this.set("groupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupSeparator: Self = this.set("groupSeparator", js.undefined)
    
    @scala.inline
    def setGroupSize(value: Double): Self = this.set("groupSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupSize: Self = this.set("groupSize", js.undefined)
    
    @scala.inline
    def setGroupmarker(value: Range): Self = this.set("groupmarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupmarker: Self = this.set("groupmarker", js.undefined)
    
    @scala.inline
    def setIgnorablesVarargs(value: Double*): Self = this.set("ignorables", js.Array(value :_*))
    
    @scala.inline
    def setIgnorables(value: js.Array[Double]): Self = this.set("ignorables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorables: Self = this.set("ignorables", js.undefined)
    
    @scala.inline
    def setImportDataAttributes(value: Boolean): Self = this.set("importDataAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportDataAttributes: Self = this.set("importDataAttributes", js.undefined)
    
    @scala.inline
    def setInputFormat(value: String): Self = this.set("inputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputFormat: Self = this.set("inputFormat", js.undefined)
    
    @scala.inline
    def setInputType(value: text | number): Self = this.set("inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputType: Self = this.set("inputType", js.undefined)
    
    @scala.inline
    def setInputmode(value: InputMode): Self = this.set("inputmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputmode: Self = this.set("inputmode", js.undefined)
    
    @scala.inline
    def setInsertMode(value: Boolean): Self = this.set("insertMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertMode: Self = this.set("insertMode", js.undefined)
    
    @scala.inline
    def setIntegerDigits(value: String): Self = this.set("integerDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerDigits: Self = this.set("integerDigits", js.undefined)
    
    @scala.inline
    def setIntegerOptional(value: Boolean): Self = this.set("integerOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerOptional: Self = this.set("integerOptional", js.undefined)
    
    @scala.inline
    def setIsComplete(value: (/* buffer */ js.Array[String], Options) => Boolean): Self = this.set("isComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsComplete: Self = this.set("isComplete", js.undefined)
    
    @scala.inline
    def setJitMasking(value: Boolean): Self = this.set("jitMasking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJitMasking: Self = this.set("jitMasking", js.undefined)
    
    @scala.inline
    def setKeepStatic(value: Boolean): Self = this.set("keepStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepStatic: Self = this.set("keepStatic", js.undefined)
    
    @scala.inline
    def setKeepStaticNull: Self = this.set("keepStatic", null)
    
    @scala.inline
    def setMaskVarargs(value: String*): Self = this.set("mask", js.Array(value :_*))
    
    @scala.inline
    def setMaskFunction1(value: Options => String | js.Array[String]): Self = this.set("mask", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMask(value: String | js.Array[String] | (js.Function1[Options, String | js.Array[String]])): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setNegationSymbol(value: Back): Self = this.set("negationSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegationSymbol: Self = this.set("negationSymbol", js.undefined)
    
    @scala.inline
    def setNoValuePatching(value: Boolean): Self = this.set("noValuePatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoValuePatching: Self = this.set("noValuePatching", js.undefined)
    
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullable: Self = this.set("nullable", js.undefined)
    
    @scala.inline
    def setNumericInput(value: Boolean): Self = this.set("numericInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumericInput: Self = this.set("numericInput", js.undefined)
    
    @scala.inline
    def setOnBeforeMask(value: (/* initialValue */ String, Options) => String): Self = this.set("onBeforeMask", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBeforeMask: Self = this.set("onBeforeMask", js.undefined)
    
    @scala.inline
    def setOnBeforePaste(value: (/* pastedValue */ String, Options) => String): Self = this.set("onBeforePaste", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBeforePaste: Self = this.set("onBeforePaste", js.undefined)
    
    @scala.inline
    def setOnBeforeWrite(
      value: (/* event */ KeyboardEvent, /* buffer */ js.Array[String], /* caretPos */ Double, Options) => CommandObject
    ): Self = this.set("onBeforeWrite", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnBeforeWrite: Self = this.set("onBeforeWrite", js.undefined)
    
    @scala.inline
    def setOnKeyDown(
      value: (/* event */ KeyboardEvent, /* buffer */ js.Array[String], /* caretPos */ Double, Options) => Unit
    ): Self = this.set("onKeyDown", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyValidation(value: (/* key */ Double, /* result */ Boolean) => Unit): Self = this.set("onKeyValidation", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnKeyValidation: Self = this.set("onKeyValidation", js.undefined)
    
    @scala.inline
    def setOnUnMask(value: (/* maskedValue */ String, /* unmaskedValue */ String) => String): Self = this.set("onUnMask", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnUnMask: Self = this.set("onUnMask", js.undefined)
    
    @scala.inline
    def setOncleared(value: () => Unit): Self = this.set("oncleared", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOncleared: Self = this.set("oncleared", js.undefined)
    
    @scala.inline
    def setOncomplete(value: () => Unit): Self = this.set("oncomplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOncomplete: Self = this.set("oncomplete", js.undefined)
    
    @scala.inline
    def setOnincomplete(value: () => Unit): Self = this.set("onincomplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnincomplete: Self = this.set("onincomplete", js.undefined)
    
    @scala.inline
    def setOptionalmarker(value: Range): Self = this.set("optionalmarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalmarker: Self = this.set("optionalmarker", js.undefined)
    
    @scala.inline
    def setOutputFormat(value: String): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFormat: Self = this.set("outputFormat", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPositionCaretOnClick(value: PositionCaretOnClick): Self = this.set("positionCaretOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionCaretOnClick: Self = this.set("positionCaretOnClick", js.undefined)
    
    @scala.inline
    def setPositionCaretOnTab(value: Boolean): Self = this.set("positionCaretOnTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionCaretOnTab: Self = this.set("positionCaretOnTab", js.undefined)
    
    @scala.inline
    def setPostValidation(
      value: (/* buffer */ js.Array[String], /* pos */ Double, /* currentResult */ CommandObject, Options) => Boolean | CommandObject
    ): Self = this.set("postValidation", js.Any.fromFunction4(value))
    
    @scala.inline
    def deletePostValidation: Self = this.set("postValidation", js.undefined)
    
    @scala.inline
    def setPreValidation(
      value: (/* buffer */ js.Array[String], /* pos */ Double, /* char */ String, /* isSelection */ Boolean, Options) => Boolean | CommandObject
    ): Self = this.set("preValidation", js.Any.fromFunction5(value))
    
    @scala.inline
    def deletePreValidation: Self = this.set("preValidation", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setQuantifiermarker(value: Range): Self = this.set("quantifiermarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantifiermarker: Self = this.set("quantifiermarker", js.undefined)
    
    @scala.inline
    def setRadixPoint(value: String): Self = this.set("radixPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadixPoint: Self = this.set("radixPoint", js.undefined)
    
    @scala.inline
    def setRegex(value: String): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    
    @scala.inline
    def setRemoveMaskOnSubmit(value: Boolean): Self = this.set("removeMaskOnSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveMaskOnSubmit: Self = this.set("removeMaskOnSubmit", js.undefined)
    
    @scala.inline
    def setRepeat(value: Double | String): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    
    @scala.inline
    def setRightAlign(value: Boolean): Self = this.set("rightAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightAlign: Self = this.set("rightAlign", js.undefined)
    
    @scala.inline
    def setShiftPositions(value: Boolean): Self = this.set("shiftPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShiftPositions: Self = this.set("shiftPositions", js.undefined)
    
    @scala.inline
    def setShowMaskOnFocus(value: Boolean): Self = this.set("showMaskOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMaskOnFocus: Self = this.set("showMaskOnFocus", js.undefined)
    
    @scala.inline
    def setShowMaskOnHover(value: Boolean): Self = this.set("showMaskOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMaskOnHover: Self = this.set("showMaskOnHover", js.undefined)
    
    @scala.inline
    def setSkipOptionalPartCharacter(value: String): Self = this.set("skipOptionalPartCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipOptionalPartCharacter: Self = this.set("skipOptionalPartCharacter", js.undefined)
    
    @scala.inline
    def setStaticDefinitionSymbol(value: String): Self = this.set("staticDefinitionSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticDefinitionSymbol: Self = this.set("staticDefinitionSymbol", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setSupportsInputTypeVarargs(value: String*): Self = this.set("supportsInputType", js.Array(value :_*))
    
    @scala.inline
    def setSupportsInputType(value: js.Array[String]): Self = this.set("supportsInputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsInputType: Self = this.set("supportsInputType", js.undefined)
    
    @scala.inline
    def setTabThrough(value: Boolean): Self = this.set("tabThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabThrough: Self = this.set("tabThrough", js.undefined)
    
    @scala.inline
    def setUndoOnEscape(value: Boolean): Self = this.set("undoOnEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndoOnEscape: Self = this.set("undoOnEscape", js.undefined)
    
    @scala.inline
    def setUnmaskAsNumber(value: Boolean): Self = this.set("unmaskAsNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmaskAsNumber: Self = this.set("unmaskAsNumber", js.undefined)
  }
}

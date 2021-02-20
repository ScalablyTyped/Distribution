package typings.inputmask

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.inputmask.anon.Back
import typings.inputmask.anon.C
import typings.inputmask.anon.End
import typings.inputmask.anon.Start
import typings.inputmask.inputmaskBooleans.`true`
import typings.inputmask.inputmaskStrings.getemptymask
import typings.inputmask.inputmaskStrings.getmetadata
import typings.inputmask.inputmaskStrings.hasMaskedValue
import typings.inputmask.inputmaskStrings.isComplete
import typings.inputmask.inputmaskStrings.isValid
import typings.inputmask.inputmaskStrings.number
import typings.inputmask.inputmaskStrings.option
import typings.inputmask.inputmaskStrings.remove
import typings.inputmask.inputmaskStrings.setValue
import typings.inputmask.inputmaskStrings.text
import typings.inputmask.inputmaskStrings.unmaskedvalue
import typings.inputmask.mod.global.HTMLElement
import typings.std.ArrayLike
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("inputmask", JSImport.Namespace)
  @js.native
  /**
    * Creates a new Inputmask instance.
    *
    * @param opts Mask options.
    */
  class ^ () extends Instance {
    /**
      * Creates a new Inputmask instance.
      *
      * @param maskOrAlias A mask pattern or a reference to a predefined alias.
      * @param opts Mask options.
      */
    def this(maskOrAlias: String) = this()
    def this(opts: Options) = this()
    def this(maskOrAlias: String, opts: Options) = this()
  }
  @JSImport("inputmask", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.inputmask.inputmaskStrings.upper
    - typings.inputmask.inputmaskStrings.lower
    - typings.inputmask.inputmaskStrings.title
  */
  trait Casing extends StObject
  object Casing {
    
    @scala.inline
    def lower: typings.inputmask.inputmaskStrings.lower = "lower".asInstanceOf[typings.inputmask.inputmaskStrings.lower]
    
    @scala.inline
    def title: typings.inputmask.inputmaskStrings.title = "title".asInstanceOf[typings.inputmask.inputmaskStrings.title]
    
    @scala.inline
    def upper: typings.inputmask.inputmaskStrings.upper = "upper".asInstanceOf[typings.inputmask.inputmaskStrings.upper]
  }
  
  @js.native
  trait CommandObject extends StObject {
    
    /**
      * Character to insert.
      */
    var c: js.UndefOr[String] = js.native
    
    /**
      * Position of the caret.
      */
    var caret: js.UndefOr[Double] = js.native
    
    /**
      * Position(s) to add.
      */
    var insert: js.UndefOr[InsertPosition | js.Array[InsertPosition]] = js.native
    
    /**
      * Position to insert.
      */
    var pos: js.UndefOr[Double] = js.native
    
    /**
      * * `true` => refresh validPositions from the complete buffer .
      * * `{ start: , end: }` => refresh from start to end.
      */
    var refreshFromBuffer: js.UndefOr[`true` | Start] = js.native
    
    /**
      * Position(s) to remove.
      */
    var remove: js.UndefOr[Double | js.Array[Double]] = js.native
  }
  object CommandObject {
    
    @scala.inline
    def apply(): CommandObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandObject]
    }
    
    @scala.inline
    implicit class CommandObjectMutableBuilder[Self <: CommandObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      @scala.inline
      def setCaret(value: Double): Self = StObject.set(x, "caret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaretUndefined: Self = StObject.set(x, "caret", js.undefined)
      
      @scala.inline
      def setInsert(value: InsertPosition | js.Array[InsertPosition]): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      @scala.inline
      def setInsertVarargs(value: InsertPosition*): Self = StObject.set(x, "insert", js.Array(value :_*))
      
      @scala.inline
      def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
      
      @scala.inline
      def setRefreshFromBuffer(value: `true` | Start): Self = StObject.set(x, "refreshFromBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshFromBufferUndefined: Self = StObject.set(x, "refreshFromBuffer", js.undefined)
      
      @scala.inline
      def setRemove(value: Double | js.Array[Double]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setRemoveVarargs(value: Double*): Self = StObject.set(x, "remove", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Definition extends StObject {
    
    var cardinality: js.UndefOr[Double] = js.native
    
    var casing: js.UndefOr[Casing] = js.native
    
    var definitionSymbol: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var validator: String | DefinitionValidator = js.native
  }
  object Definition {
    
    @scala.inline
    def apply(validator: String | DefinitionValidator): Definition = {
      val __obj = js.Dynamic.literal(validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Definition]
    }
    
    @scala.inline
    implicit class DefinitionMutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCardinality(value: Double): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardinalityUndefined: Self = StObject.set(x, "cardinality", js.undefined)
      
      @scala.inline
      def setCasing(value: Casing): Self = StObject.set(x, "casing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCasingUndefined: Self = StObject.set(x, "casing", js.undefined)
      
      @scala.inline
      def setDefinitionSymbol(value: String): Self = StObject.set(x, "definitionSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionSymbolUndefined: Self = StObject.set(x, "definitionSymbol", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setValidator(value: String | DefinitionValidator): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorFunction5(
        value: (/* chrs */ String, /* buffer */ js.Array[String], /* pos */ Double, /* strict */ Boolean, /* opts */ Options) => Boolean | C
      ): Self = StObject.set(x, "validator", js.Any.fromFunction5(value))
    }
  }
  
  type DefinitionValidator = js.Function5[
    /* chrs */ String, 
    /* buffer */ js.Array[String], 
    /* pos */ Double, 
    /* strict */ Boolean, 
    /* opts */ Options, 
    Boolean | C
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.inputmask.inputmaskStrings.verbatim
    - typings.inputmask.inputmaskStrings.none
    - typings.inputmask.inputmaskStrings.text
    - typings.inputmask.inputmaskStrings.decimal
    - typings.inputmask.inputmaskStrings.numeric
    - typings.inputmask.inputmaskStrings.tel
    - typings.inputmask.inputmaskStrings.search
    - typings.inputmask.inputmaskStrings.email
    - typings.inputmask.inputmaskStrings.url
  */
  trait InputMode extends StObject
  object InputMode {
    
    @scala.inline
    def decimal: typings.inputmask.inputmaskStrings.decimal = "decimal".asInstanceOf[typings.inputmask.inputmaskStrings.decimal]
    
    @scala.inline
    def email: typings.inputmask.inputmaskStrings.email = "email".asInstanceOf[typings.inputmask.inputmaskStrings.email]
    
    @scala.inline
    def none: typings.inputmask.inputmaskStrings.none = "none".asInstanceOf[typings.inputmask.inputmaskStrings.none]
    
    @scala.inline
    def numeric: typings.inputmask.inputmaskStrings.numeric = "numeric".asInstanceOf[typings.inputmask.inputmaskStrings.numeric]
    
    @scala.inline
    def search: typings.inputmask.inputmaskStrings.search = "search".asInstanceOf[typings.inputmask.inputmaskStrings.search]
    
    @scala.inline
    def tel: typings.inputmask.inputmaskStrings.tel = "tel".asInstanceOf[typings.inputmask.inputmaskStrings.tel]
    
    @scala.inline
    def text: typings.inputmask.inputmaskStrings.text = "text".asInstanceOf[typings.inputmask.inputmaskStrings.text]
    
    @scala.inline
    def url: typings.inputmask.inputmaskStrings.url = "url".asInstanceOf[typings.inputmask.inputmaskStrings.url]
    
    @scala.inline
    def verbatim: typings.inputmask.inputmaskStrings.verbatim = "verbatim".asInstanceOf[typings.inputmask.inputmaskStrings.verbatim]
  }
  
  @js.native
  trait InsertPosition extends StObject {
    
    /**
      * Character to insert.
      */
    var c: String = js.native
    
    /**
      * Position to insert.
      */
    var pos: Double = js.native
  }
  object InsertPosition {
    
    @scala.inline
    def apply(c: String, pos: Double): InsertPosition = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsertPosition]
    }
    
    @scala.inline
    implicit class InsertPositionMutableBuilder[Self <: InsertPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instance extends StObject {
    
    /**
      * Return the default (empty) mask value.
      */
    def getemptymask(): String = js.native
    
    /**
      * The metadata of the actual mask provided in the mask definitions can be obtained by calling getmetadata. If
      * only a mask is provided the mask definition will be returned by the getmetadata.
      */
    def getmetadata(): js.Any = js.native
    
    /**
      * Check whether the returned value is masked or not; currently only works reliably when using `jquery.val` fn
      * to retrieve the value
      */
    def hasMaskedValue(): Boolean = js.native
    
    /**
      * Verify whether the current value is complete or not.
      */
    def isComplete(): Boolean = js.native
    
    /**
      * Validate a given value against the mask.
      */
    def isValid(): Boolean = js.native
    
    /**
      * Create a mask for the input.
      *
      * @param el Element selector, a single element or an array of elements.
      */
    def mask(selectorOrElement: String): Instance = js.native
    def mask(selectorOrElement: HTMLElement): Instance = js.native
    def mask(selectorOrElement: ArrayLike[HTMLElement]): Instance = js.native
    
    /**
      * Get an option on an existing inputmask.
      *
      * @param key Name of option to retrieve.
      */
    def option(key: String): js.Any = js.native
    /**
      * Set an option on an existing inputmask. The option method is intented for adding extra options like
      * callbacks, etc at a later time to the mask.
      *
      * When extra options are set the mask is automatically reapplied, unless you pas true for the `noremask`
      * argument.
      */
    def option(opts: Options): Instance = js.native
    def option(opts: Options, noremask: Boolean): Instance = js.native
    
    /**
      * Remove the inputmask.
      */
    def remove(): Unit = js.native
    
    /**
      * The `setvalue` functionality is to set a value to the inputmask like you would do with `jQuery.val`, BUT it
      * will trigger the internal event used by the inputmask always, whatever the case. This is particular useful
      * when cloning an inputmask with jQuery.clone. Cloning an inputmask is not a fully functional clone. On the
      * first event (`mouseenter`, `focus`, ...) the inputmask can detect if it where cloned and can reactivate the
      * masking. However when setting the value with jQuery.val there is none of the events triggered in that case.
      * The `setvalue` functionality does this for you.
      */
    def setValue(value: String): Unit = js.native
    
    /**
      * Gets the unmasked value.
      */
    def unmaskedvalue(): String = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setAllowMinus(value: Boolean): Self = StObject.set(x, "allowMinus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMinusUndefined: Self = StObject.set(x, "allowMinus", js.undefined)
      
      @scala.inline
      def setAlternatormarker(value: String): Self = StObject.set(x, "alternatormarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternatormarkerUndefined: Self = StObject.set(x, "alternatormarker", js.undefined)
      
      @scala.inline
      def setAutoGroup(value: Boolean): Self = StObject.set(x, "autoGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoGroupUndefined: Self = StObject.set(x, "autoGroup", js.undefined)
      
      @scala.inline
      def setAutoUnmask(value: Boolean): Self = StObject.set(x, "autoUnmask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUnmaskUndefined: Self = StObject.set(x, "autoUnmask", js.undefined)
      
      @scala.inline
      def setCasing(value: Casing): Self = StObject.set(x, "casing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCasingUndefined: Self = StObject.set(x, "casing", js.undefined)
      
      @scala.inline
      def setClearIncomplete(value: Boolean): Self = StObject.set(x, "clearIncomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIncompleteUndefined: Self = StObject.set(x, "clearIncomplete", js.undefined)
      
      @scala.inline
      def setClearMaskOnLostFocus(value: Boolean): Self = StObject.set(x, "clearMaskOnLostFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearMaskOnLostFocusUndefined: Self = StObject.set(x, "clearMaskOnLostFocus", js.undefined)
      
      @scala.inline
      def setColorMask(value: Boolean): Self = StObject.set(x, "colorMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMaskUndefined: Self = StObject.set(x, "colorMask", js.undefined)
      
      @scala.inline
      def setDecimalProtect(value: Boolean): Self = StObject.set(x, "decimalProtect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalProtectUndefined: Self = StObject.set(x, "decimalProtect", js.undefined)
      
      @scala.inline
      def setDefinitions(value: StringDictionary[Definition]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      @scala.inline
      def setDigits(value: String): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigitsOptional(value: Boolean): Self = StObject.set(x, "digitsOptional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigitsOptionalUndefined: Self = StObject.set(x, "digitsOptional", js.undefined)
      
      @scala.inline
      def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
      
      @scala.inline
      def setDisablePredictiveText(value: Boolean): Self = StObject.set(x, "disablePredictiveText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePredictiveTextUndefined: Self = StObject.set(x, "disablePredictiveText", js.undefined)
      
      @scala.inline
      def setEnforceDigitsOnBlur(value: Boolean): Self = StObject.set(x, "enforceDigitsOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceDigitsOnBlurUndefined: Self = StObject.set(x, "enforceDigitsOnBlur", js.undefined)
      
      @scala.inline
      def setEscapeChar(value: String): Self = StObject.set(x, "escapeChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeCharUndefined: Self = StObject.set(x, "escapeChar", js.undefined)
      
      @scala.inline
      def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
      
      @scala.inline
      def setGroupSeparator(value: String): Self = StObject.set(x, "groupSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSeparatorUndefined: Self = StObject.set(x, "groupSeparator", js.undefined)
      
      @scala.inline
      def setGroupSize(value: Double): Self = StObject.set(x, "groupSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSizeUndefined: Self = StObject.set(x, "groupSize", js.undefined)
      
      @scala.inline
      def setGroupmarker(value: Range): Self = StObject.set(x, "groupmarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupmarkerUndefined: Self = StObject.set(x, "groupmarker", js.undefined)
      
      @scala.inline
      def setIgnorables(value: js.Array[Double]): Self = StObject.set(x, "ignorables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorablesUndefined: Self = StObject.set(x, "ignorables", js.undefined)
      
      @scala.inline
      def setIgnorablesVarargs(value: Double*): Self = StObject.set(x, "ignorables", js.Array(value :_*))
      
      @scala.inline
      def setImportDataAttributes(value: Boolean): Self = StObject.set(x, "importDataAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportDataAttributesUndefined: Self = StObject.set(x, "importDataAttributes", js.undefined)
      
      @scala.inline
      def setInputFormat(value: String): Self = StObject.set(x, "inputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFormatUndefined: Self = StObject.set(x, "inputFormat", js.undefined)
      
      @scala.inline
      def setInputType(value: text | number): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
      
      @scala.inline
      def setInputmode(value: InputMode): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
      
      @scala.inline
      def setInsertMode(value: Boolean): Self = StObject.set(x, "insertMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertModeUndefined: Self = StObject.set(x, "insertMode", js.undefined)
      
      @scala.inline
      def setIntegerDigits(value: String): Self = StObject.set(x, "integerDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegerDigitsUndefined: Self = StObject.set(x, "integerDigits", js.undefined)
      
      @scala.inline
      def setIntegerOptional(value: Boolean): Self = StObject.set(x, "integerOptional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegerOptionalUndefined: Self = StObject.set(x, "integerOptional", js.undefined)
      
      @scala.inline
      def setIsComplete(value: (/* buffer */ js.Array[String], Options) => Boolean): Self = StObject.set(x, "isComplete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsCompleteUndefined: Self = StObject.set(x, "isComplete", js.undefined)
      
      @scala.inline
      def setJitMasking(value: Boolean): Self = StObject.set(x, "jitMasking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJitMaskingUndefined: Self = StObject.set(x, "jitMasking", js.undefined)
      
      @scala.inline
      def setKeepStatic(value: Boolean): Self = StObject.set(x, "keepStatic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepStaticNull: Self = StObject.set(x, "keepStatic", null)
      
      @scala.inline
      def setKeepStaticUndefined: Self = StObject.set(x, "keepStatic", js.undefined)
      
      @scala.inline
      def setMask(value: String | js.Array[String] | (js.Function1[Options, String | js.Array[String]])): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskFunction1(value: Options => String | js.Array[String]): Self = StObject.set(x, "mask", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMaskVarargs(value: String*): Self = StObject.set(x, "mask", js.Array(value :_*))
      
      @scala.inline
      def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setNegationSymbol(value: Back): Self = StObject.set(x, "negationSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegationSymbolUndefined: Self = StObject.set(x, "negationSymbol", js.undefined)
      
      @scala.inline
      def setNoValuePatching(value: Boolean): Self = StObject.set(x, "noValuePatching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoValuePatchingUndefined: Self = StObject.set(x, "noValuePatching", js.undefined)
      
      @scala.inline
      def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
      @scala.inline
      def setNumericInput(value: Boolean): Self = StObject.set(x, "numericInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumericInputUndefined: Self = StObject.set(x, "numericInput", js.undefined)
      
      @scala.inline
      def setOnBeforeMask(value: (/* initialValue */ String, Options) => String): Self = StObject.set(x, "onBeforeMask", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforeMaskUndefined: Self = StObject.set(x, "onBeforeMask", js.undefined)
      
      @scala.inline
      def setOnBeforePaste(value: (/* pastedValue */ String, Options) => String): Self = StObject.set(x, "onBeforePaste", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforePasteUndefined: Self = StObject.set(x, "onBeforePaste", js.undefined)
      
      @scala.inline
      def setOnBeforeWrite(
        value: (/* event */ KeyboardEvent, /* buffer */ js.Array[String], /* caretPos */ Double, Options) => CommandObject
      ): Self = StObject.set(x, "onBeforeWrite", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnBeforeWriteUndefined: Self = StObject.set(x, "onBeforeWrite", js.undefined)
      
      @scala.inline
      def setOnKeyDown(
        value: (/* event */ KeyboardEvent, /* buffer */ js.Array[String], /* caretPos */ Double, Options) => Unit
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyValidation(value: (/* key */ Double, /* result */ Boolean) => Unit): Self = StObject.set(x, "onKeyValidation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyValidationUndefined: Self = StObject.set(x, "onKeyValidation", js.undefined)
      
      @scala.inline
      def setOnUnMask(value: (/* maskedValue */ String, /* unmaskedValue */ String) => String): Self = StObject.set(x, "onUnMask", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUnMaskUndefined: Self = StObject.set(x, "onUnMask", js.undefined)
      
      @scala.inline
      def setOncleared(value: () => Unit): Self = StObject.set(x, "oncleared", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnclearedUndefined: Self = StObject.set(x, "oncleared", js.undefined)
      
      @scala.inline
      def setOncomplete(value: () => Unit): Self = StObject.set(x, "oncomplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOncompleteUndefined: Self = StObject.set(x, "oncomplete", js.undefined)
      
      @scala.inline
      def setOnincomplete(value: () => Unit): Self = StObject.set(x, "onincomplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnincompleteUndefined: Self = StObject.set(x, "onincomplete", js.undefined)
      
      @scala.inline
      def setOptionalmarker(value: Range): Self = StObject.set(x, "optionalmarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalmarkerUndefined: Self = StObject.set(x, "optionalmarker", js.undefined)
      
      @scala.inline
      def setOutputFormat(value: String): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPositionCaretOnClick(value: PositionCaretOnClick): Self = StObject.set(x, "positionCaretOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionCaretOnClickUndefined: Self = StObject.set(x, "positionCaretOnClick", js.undefined)
      
      @scala.inline
      def setPositionCaretOnTab(value: Boolean): Self = StObject.set(x, "positionCaretOnTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionCaretOnTabUndefined: Self = StObject.set(x, "positionCaretOnTab", js.undefined)
      
      @scala.inline
      def setPostValidation(
        value: (/* buffer */ js.Array[String], /* pos */ Double, /* currentResult */ CommandObject, Options) => Boolean | CommandObject
      ): Self = StObject.set(x, "postValidation", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPostValidationUndefined: Self = StObject.set(x, "postValidation", js.undefined)
      
      @scala.inline
      def setPreValidation(
        value: (/* buffer */ js.Array[String], /* pos */ Double, /* char */ String, /* isSelection */ Boolean, Options) => Boolean | CommandObject
      ): Self = StObject.set(x, "preValidation", js.Any.fromFunction5(value))
      
      @scala.inline
      def setPreValidationUndefined: Self = StObject.set(x, "preValidation", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setQuantifiermarker(value: Range): Self = StObject.set(x, "quantifiermarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantifiermarkerUndefined: Self = StObject.set(x, "quantifiermarker", js.undefined)
      
      @scala.inline
      def setRadixPoint(value: String): Self = StObject.set(x, "radixPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadixPointUndefined: Self = StObject.set(x, "radixPoint", js.undefined)
      
      @scala.inline
      def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      @scala.inline
      def setRemoveMaskOnSubmit(value: Boolean): Self = StObject.set(x, "removeMaskOnSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveMaskOnSubmitUndefined: Self = StObject.set(x, "removeMaskOnSubmit", js.undefined)
      
      @scala.inline
      def setRepeat(value: Double | String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setRightAlign(value: Boolean): Self = StObject.set(x, "rightAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightAlignUndefined: Self = StObject.set(x, "rightAlign", js.undefined)
      
      @scala.inline
      def setShiftPositions(value: Boolean): Self = StObject.set(x, "shiftPositions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftPositionsUndefined: Self = StObject.set(x, "shiftPositions", js.undefined)
      
      @scala.inline
      def setShowMaskOnFocus(value: Boolean): Self = StObject.set(x, "showMaskOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMaskOnFocusUndefined: Self = StObject.set(x, "showMaskOnFocus", js.undefined)
      
      @scala.inline
      def setShowMaskOnHover(value: Boolean): Self = StObject.set(x, "showMaskOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMaskOnHoverUndefined: Self = StObject.set(x, "showMaskOnHover", js.undefined)
      
      @scala.inline
      def setSkipOptionalPartCharacter(value: String): Self = StObject.set(x, "skipOptionalPartCharacter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipOptionalPartCharacterUndefined: Self = StObject.set(x, "skipOptionalPartCharacter", js.undefined)
      
      @scala.inline
      def setStaticDefinitionSymbol(value: String): Self = StObject.set(x, "staticDefinitionSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticDefinitionSymbolUndefined: Self = StObject.set(x, "staticDefinitionSymbol", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setSupportsInputType(value: js.Array[String]): Self = StObject.set(x, "supportsInputType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsInputTypeUndefined: Self = StObject.set(x, "supportsInputType", js.undefined)
      
      @scala.inline
      def setSupportsInputTypeVarargs(value: String*): Self = StObject.set(x, "supportsInputType", js.Array(value :_*))
      
      @scala.inline
      def setTabThrough(value: Boolean): Self = StObject.set(x, "tabThrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabThroughUndefined: Self = StObject.set(x, "tabThrough", js.undefined)
      
      @scala.inline
      def setUndoOnEscape(value: Boolean): Self = StObject.set(x, "undoOnEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndoOnEscapeUndefined: Self = StObject.set(x, "undoOnEscape", js.undefined)
      
      @scala.inline
      def setUnmaskAsNumber(value: Boolean): Self = StObject.set(x, "unmaskAsNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmaskAsNumberUndefined: Self = StObject.set(x, "unmaskAsNumber", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.inputmask.inputmaskStrings.none
    - typings.inputmask.inputmaskStrings.lvp
    - typings.inputmask.inputmaskStrings.radixFocus
    - typings.inputmask.inputmaskStrings.select
    - typings.inputmask.inputmaskStrings.ignore
  */
  trait PositionCaretOnClick extends StObject
  object PositionCaretOnClick {
    
    @scala.inline
    def ignore: typings.inputmask.inputmaskStrings.ignore = "ignore".asInstanceOf[typings.inputmask.inputmaskStrings.ignore]
    
    @scala.inline
    def lvp: typings.inputmask.inputmaskStrings.lvp = "lvp".asInstanceOf[typings.inputmask.inputmaskStrings.lvp]
    
    @scala.inline
    def none: typings.inputmask.inputmaskStrings.none = "none".asInstanceOf[typings.inputmask.inputmaskStrings.none]
    
    @scala.inline
    def radixFocus: typings.inputmask.inputmaskStrings.radixFocus = "radixFocus".asInstanceOf[typings.inputmask.inputmaskStrings.radixFocus]
    
    @scala.inline
    def select: typings.inputmask.inputmaskStrings.select = "select".asInstanceOf[typings.inputmask.inputmaskStrings.select]
  }
  
  type Range = End | (js.Tuple2[String, String])
  
  @js.native
  trait Static
    extends /**
    * Creates a new Inputmask instance.
    *
    * @param maskOrAlias A mask pattern or a reference to a predefined alias.
    * @param opts Mask options.
    */
  Instantiable1[(/* opts */ Options) | (/* maskOrAlias */ String), Instance]
       with /**
    * Creates a new Inputmask instance.
    *
    * @param opts Mask options.
    */
  Instantiable0[Instance]
       with Instantiable2[/* maskOrAlias */ String, /* opts */ Options, Instance] {
    
    /**
      * Creates a new Inputmask instance.
      *
      * @param opts Mask options.
      */
    def apply(): Instance = js.native
    /**
      * Creates a new Inputmask instance.
      *
      * @param maskOrAlias A mask pattern or a reference to a predefined alias.
      * @param opts Mask options.
      */
    def apply(maskOrAlias: String): Instance = js.native
    def apply(maskOrAlias: String, opts: Options): Instance = js.native
    def apply(opts: Options): Instance = js.native
    
    /**
      * Extends the set of available mask aliases.
      */
    def extendAliases(aliases: StringDictionary[Options]): Unit = js.native
    
    /**
      * Extends the default inputmask options.
      */
    def extendDefaults(opts: Options): Unit = js.native
    
    /**
      * Extends the set of available definitions.
      */
    def extendDefinitions(definitions: StringDictionary[Definition]): Unit = js.native
    
    /**
      * Instead of masking an input element it is also possible to use the inputmask for formatting given values.
      * Think of formatting values to show in jqGrid or on other elements then inputs.
      *
      * @param value Value to format.
      * @param opts Mask options.
      */
    def format(value: String, opts: Options): String = js.native
    
    /**
      * Validate a given value against the mask.
      *
      * @param value Value to validate.
      * @param opts Mask options.
      */
    def isValid(value: String, opts: Options): Boolean = js.native
    
    /**
      * Remove the inputmask.
      */
    def remove(selectorOrElement: String): Unit = js.native
    def remove(selectorOrElement: HTMLElement): Unit = js.native
    def remove(selectorOrElement: ArrayLike[HTMLElement]): Unit = js.native
    
    /**
      * The setvalue functionality is to set a value to the inputmask like you would do with jQuery.val, BUT it will
      * trigger the internal event used by the inputmask always, whatever the case. This is particular usefull when
      * cloning an inputmask with jQuery.clone. Cloning an inputmask is not a fully functional clone. On the first
      * event (mouseenter, focus, ...) the inputmask can detect if it where cloned and can reactivate the masking.
      * However when setting the value with jQuery.val there is none of the events triggered in that case. The
      * setvalue functionality does this for you.
      */
    def setValue(selectorOrElement: String, value: String): Unit = js.native
    def setValue(selectorOrElement: HTMLElement, value: String): Unit = js.native
    def setValue(selectorOrElement: ArrayLike[HTMLElement], value: String): Unit = js.native
    
    /**
      * Unmask a given value against the mask.
      *
      * @param value Value to be unmasked.
      * @param opts Mask options.
      */
    def unmask(value: String, opts: Options): String = js.native
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
  
  object global {
    
    @js.native
    trait HTMLElement extends StObject {
      
      var inputmask: js.UndefOr[Instance] = js.native
    }
    object HTMLElement {
      
      @scala.inline
      def apply(): HTMLElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLElement]
      }
      
      @scala.inline
      implicit class HTMLElementMutableBuilder[Self <: HTMLElement] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInputmask(value: Instance): Self = StObject.set(x, "inputmask", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInputmaskUndefined: Self = StObject.set(x, "inputmask", js.undefined)
      }
    }
    
    @js.native
    trait JQuery extends StObject {
      
      /**
        * Creates a new Inputmask instance.
        *
        * @param opts Mask options.
        */
      def inputmask(): Instance = js.native
      // tslint:disable-line:unified-signatures
      /**
        * Creates a new Inputmask instance.
        *
        * @param maskOrAlias A mask pattern or a reference to a predefined alias.
        * @param opts Mask options.
        */
      def inputmask(maskOrAlias: String): Instance = js.native
      def inputmask(maskOrAlias: String, opts: Options): Instance = js.native
      def inputmask(opts: Options): Instance = js.native
      /**
        * Return the default (empty) mask value.
        */
      @JSName("inputmask")
      def inputmask_getemptymask(method: getemptymask): String = js.native
      /**
        * The metadata of the actual mask provided in the mask definitions can be obtained by calling getmetadata. If
        * only a mask is provided the mask definition will be returned by the getmetadata.
        */
      @JSName("inputmask")
      def inputmask_getmetadata(method: getmetadata): js.Any = js.native
      /**
        * Check whether the returned value is masked or not; currently only works reliably when using `jquery.val` fn
        * to retrieve the value
        */
      @JSName("inputmask")
      def inputmask_hasMaskedValue(method: hasMaskedValue): Boolean = js.native
      /**
        * Verify whether the current value is complete or not.
        */
      @JSName("inputmask")
      def inputmask_isComplete(method: isComplete): Boolean = js.native
      // tslint:disable-line:unified-signatures
      /**
        * Validate a given value against the mask.
        */
      @JSName("inputmask")
      def inputmask_isValid(method: isValid): Boolean = js.native
      // tslint:disable-line:unified-signatures
      /**
        * Get an option on an existing inputmask.
        *
        * @param key Name of option to retrieve.
        */
      @JSName("inputmask")
      def inputmask_option(method: option, key: String): js.Any = js.native
      /**
        * Set an option on an existing inputmask. The option method is intented for adding extra options like
        * callbacks, etc at a later time to the mask.
        *
        * When extra options are set the mask is automatically reapplied, unless you pas true for the `noremask`
        * argument.
        */
      @JSName("inputmask")
      def inputmask_option(method: option, opts: Options): Instance = js.native
      @JSName("inputmask")
      def inputmask_option(method: option, opts: Options, noremask: Boolean): Instance = js.native
      /**
        * Remove the inputmask.
        */
      @JSName("inputmask")
      def inputmask_remove(method: remove): Unit = js.native
      /**
        * The `setvalue` functionality is to set a value to the inputmask like you would do with `jQuery.val`, BUT it
        * will trigger the internal event used by the inputmask always, whatever the case. This is particular useful
        * when cloning an inputmask with jQuery.clone. Cloning an inputmask is not a fully functional clone. On the
        * first event (`mouseenter`, `focus`, ...) the inputmask can detect if it where cloned and can reactivate the
        * masking. However when setting the value with jQuery.val there is none of the events triggered in that case.
        * The `setvalue` functionality does this for you.
        */
      @JSName("inputmask")
      def inputmask_setValue(method: setValue, value: String): Unit = js.native
      /**
        * Gets the unmasked value.
        */
      @JSName("inputmask")
      def inputmask_unmaskedvalue(method: unmaskedvalue): String = js.native
    }
  }
}

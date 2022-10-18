package typings.hyperformula

import typings.hyperformula.anon.PartialConfigParams
import typings.hyperformula.hyperformulaStrings.Comma
import typings.hyperformula.hyperformulaStrings.Dot
import typings.hyperformula.hyperformulaStrings.Semicolon
import typings.hyperformula.hyperformulaStrings.Space
import typings.hyperformula.hyperformulaStrings.Verticalline
import typings.hyperformula.hyperformulaStrings._empty
import typings.hyperformula.hyperformulaStrings.`false`
import typings.hyperformula.hyperformulaStrings.any
import typings.hyperformula.hyperformulaStrings.lower
import typings.hyperformula.hyperformulaStrings.standard
import typings.hyperformula.hyperformulaStrings.upper
import typings.hyperformula.typingsCellMod.TranslatableErrorType
import typings.hyperformula.typingsDateTimeHelperMod.DateTime
import typings.hyperformula.typingsDateTimeHelperMod.SimpleDate
import typings.hyperformula.typingsDateTimeHelperMod.SimpleDateTime
import typings.hyperformula.typingsDateTimeHelperMod.SimpleTime
import typings.hyperformula.typingsDependencyGraphAddressMappingChooseAddressMappingPolicyMod.ChooseAddressMapping
import typings.hyperformula.typingsHelpersLicenseKeyValidatorMod.LicenseKeyValidityState
import typings.hyperformula.typingsI18nMod.TranslationPackage
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPluginDefinition
import typings.hyperformula.typingsMaybeMod.Maybe
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsConfigMod {
  
  @JSImport("hyperformula/typings/Config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.hyperformula.typingsParserParserConfigMod.ParserConfig because var conflicts: arrayColumnSeparator, arrayRowSeparator, decimalSeparator, functionArgSeparator, ignoreWhiteSpace, maxColumns, maxRows. Inlined translationPackage, errorMapping */ @JSImport("hyperformula/typings/Config", "Config")
  @js.native
  open class Config ()
    extends StObject
       with ConfigParams {
    def this(options: PartialConfigParams) = this()
    def this(options: Unit, showDeprecatedWarns: Boolean) = this()
    def this(options: PartialConfigParams, showDeprecatedWarns: Boolean) = this()
    
    /**
      * Built automatically based on translation package.
      *
      * @internal
      */
    val errorMapping: Record[String, TranslatableErrorType] = js.native
    
    /** @inheritDoc */
    @JSName("functionPlugins")
    val functionPlugins_Config: js.Array[FunctionPluginDefinition] = js.native
    
    def getConfig(): ConfigParams = js.native
    
    /**
      * Proxied property to its private counterpart. This makes the property
      * as accessible as the other Config options but without ability to change the value.
      *
      * @internal
      */
    def licenseKeyValidityState: LicenseKeyValidityState = js.native
    
    def mergeConfig(init: PartialConfigParams): Config = js.native
    
    /* private */ var setupCurrencySymbol: Any = js.native
    
    /**
      * Built automatically based on language.
      *
      * @internal
      */
    val translationPackage: TranslationPackage = js.native
  }
  /* static members */
  object Config {
    
    @JSImport("hyperformula/typings/Config", "Config")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/Config", "Config.defaultConfig")
    @js.native
    def defaultConfig: ConfigParams = js.native
    inline def defaultConfig_=(x: ConfigParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula/typings/Config", "Config.warnDeprecatedIfUsed")
    @js.native
    def warnDeprecatedIfUsed: Any = js.native
    inline def warnDeprecatedIfUsed_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warnDeprecatedIfUsed")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula/typings/Config", "Config.warnDeprecatedOptions")
    @js.native
    def warnDeprecatedOptions: Any = js.native
    inline def warnDeprecatedOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warnDeprecatedOptions")(x.asInstanceOf[js.Any])
  }
  
  inline def getDefaultConfig(): ConfigParams = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultConfig")().asInstanceOf[ConfigParams]
  
  @js.native
  trait ConfigParams extends StObject {
    
    /**
      * When set to `true`, makes string comparison accent-sensitive.
      *
      * Applies only to comparison operators.
      *
      * @default false
      *
      * @category String
      */
    var accentSensitive: Boolean = js.native
    
    /**
      * Sets a column separator symbol for array notation.
      *
      * @default ','
      * @category Formula Syntax
      */
    var arrayColumnSeparator: Comma | Semicolon = js.native
    
    /**
      * Sets a row separator symbol for array notation.
      *
      * @default ';'
      * @category Formula Syntax
      */
    var arrayRowSeparator: Semicolon | Verticalline = js.native
    
    /**
      * Sets a minimum number of elements that a range must have to use binary search.
      *
      * @deprecated Every search of sorted data always uses binary search.
      *
      * @default 20
      *
      * @category Engine
      */
    var binarySearchThreshold: Double = js.native
    
    /**
      * When set to `upper`, upper case sorts first.
      *
      * When set to `lower`, lower case sorts first.
      *
      * When set to `false`, uses the locale's default.
      *
      * @default 'lower'
      *
      * @category String
      */
    var caseFirst: upper | lower | `false` = js.native
    
    /**
      * When set to `true`, makes string comparison case-sensitive.
      *
      * Applies to comparison operators only.
      *
      * @default false
      *
      * @category String
      */
    var caseSensitive: Boolean = js.native
    
    /**
      * Sets the address mapping policy to be used.
      *
      * Built-in implementations:
      * - `DenseSparseChooseBasedOnThreshold`: sets the address mapping policy separately for each sheet, based on fill ratio.
      * - `AlwaysDense`: uses `DenseStrategy` for all sheets.
      * - `AlwaysSparse`: uses `SparseStrategy` for all sheets.
      *
      * @default AlwaysDense
      *
      * @category Engine
      */
    var chooseAddressMappingPolicy: ChooseAddressMapping = js.native
    
    /**
      * Sets symbols that denote currency numbers.
      *
      * @default ['$']
      *
      * @category Number
      */
    var currencySymbol: js.Array[String] = js.native
    
    /**
      * Sets the date formats accepted by the date-parsing function.
      *
      * A format must be specified as a string consisting of tokens and separators.
      *
      * Supported tokes:
      * - `DD` (day of month)
      * - `MM` (month as a number)
      * - `YYYY` (year as a 4-digit number)
      * - `YY` (year as a 2-digit number)
      *
      * Supported separators:
      * - `/` (slash)
      * - `-` (dash)
      * - `.` (dot)
      * - ` ` (empty space)
      *
      * Regardless of the separator specified in the format string, all of the above are accepted by the date-parsing function.
      *
      * @default ['DD/MM/YYYY', 'DD/MM/YY']
      *
      * @category Date and Time
      */
    var dateFormats: js.Array[String] = js.native
    
    /**
      * Sets a decimal separator used for parsing numerical literals.
      *
      * Can be one of the following:
      * - `.` (period)
      * - `,` (comma)
      *
      * Must be different from [[thousandSeparator]] and [[functionArgSeparator]].
      *
      * @default '.'
      *
      * @category Number
      */
    var decimalSeparator: Dot | Comma = js.native
    
    /**
      * When set to `true`, formulas evaluating to `null` evaluate to `0` instead.
      *
      * @default false
      *
      * @category Engine
      */
    var evaluateNullToZero: Boolean = js.native
    
    /**
      * Sets a separator character that separates procedure arguments in formulas.
      *
      * Must be different from [[decimalSeparator]] and [[thousandSeparator]].
      *
      * @default ','
      *
      * @category Formula Syntax
      */
    var functionArgSeparator: String = js.native
    
    /**
      * Lists additional function plugins to be used by the formula interpreter.
      *
      * @default []
      *
      * @category Formula Syntax
      */
    var functionPlugins: js.Array[Any] = js.native
    
    /**
      * When set to `true`, string comparison ignores punctuation.
      *
      * @default false
      *
      * @category String
      */
    var ignorePunctuation: Boolean = js.native
    
    /**
      * Controls the set of whitespace characters that are allowed inside a formula.
      *
      * When set to `'standard'`, allows only SPACE (U+0020), CHARACTER TABULATION (U+0009), LINE FEED (U+000A), and CARRIAGE RETURN (U+000D) (compliant with OpenFormula Standard 1.3)
      *
      * When set to `'any'`, allows all whitespace characters that would be captured by the `\s` character class of the JavaScript regular expressions.
      *
      * @default 'standard'
      *
      * @category Formula Syntax
      */
    var ignoreWhiteSpace: standard | any = js.native
    
    /**
      * Sets a translation package for function and error names.
      *
      * @default 'enGB'
      *
      * @category Formula Syntax
      */
    var language: String = js.native
    
    /**
      * Sets year 1900 as a leap year.
      *
      * For compatibility with Lotus 1-2-3 and Microsoft Excel, set this option to `true`.
      *
      * For more information, see [[nullDate]].
      *
      * @default false
      *
      * @category Date and Time
      */
    var leapYear1900: Boolean = js.native
    
    /**
      * Sets your HyperFormula license key.
      *
      * To use HyperFormula on the GPLv3 license terms, set this option to `gpl-v3`.
      *
      * To use HyperFormula with your commercial license, set this option to your valid license key string.
      *
      * For more information, go [here](/guide/license-key.html).
      *
      * @default undefined
      *
      * @category License
      */
    var licenseKey: String = js.native
    
    /**
      * Sets the locale for language-sensitive string comparison.
      *
      * Accepts **IETF BCP 47** language tags.
      *
      * @default 'en'
      *
      * @category String
      */
    var localeLang: String = js.native
    
    /**
      * When set to `true`, function criteria require whole cells to match the pattern.
      *
      * When set to `false`, function criteria require just a sub-word to match the pattern.
      *
      * @default true
      * @category String
      */
    var matchWholeCell: Boolean = js.native
    
    /**
      * Sets the maximum number of columns.
      *
      * @default 18,278
      *
      * @category Engine
      * */
    var maxColumns: Double = js.native
    
    /**
      * Sets the maximum number of rows.
      *
      * @default 40,000
      *
      * @category Engine
      * */
    var maxRows: Double = js.native
    
    /**
      * Internally, each date is represented as a number of days that passed since `nullDate`.
      *
      * This option sets a specific date from which that number of days is counted.
      *
      * @default {year: 1899, month: 12, day: 30}
      *
      * @category Date and Time
      */
    var nullDate: SimpleDate = js.native
    
    /**
      * Sets the interpretation of two-digit year values.
      *
      * Two-digit year values (`xx`) can either become `19xx` or `20xx`.
      *
      * If `xx` is less or equal to `nullYear`, two-digit year values become `20xx`.
      *
      * If `xx` is more than `nullYear`, two-digit year values become `19xx`.
      *
      * @default 30
      *
      * @category Date and Time
      */
    var nullYear: Double = js.native
    
    /**
      * Sets a function that parses strings representing date-time into actual date-time values.
      *
      * The function should return a [DateTime](../globals.md#datetime) object or undefined.
      *
      * For more information, see the [Date and time handling guide](/guide/date-and-time-handling.md).
      *
      * @default defaultParseToDateTime
      *
      * @category Date and Time
      */
    def parseDateTime(dateTimeString: String): Maybe[DateTime] = js.native
    def parseDateTime(dateTimeString: String, dateFormat: String): Maybe[DateTime] = js.native
    def parseDateTime(dateTimeString: String, dateFormat: String, timeFormat: String): Maybe[DateTime] = js.native
    def parseDateTime(dateTimeString: String, dateFormat: Unit, timeFormat: String): Maybe[DateTime] = js.native
    
    /**
      * Sets how far two numerical values need to be from each other to be treated as non-equal.
      *
      * `a` and `b` are equal if all three of the following conditions are met:
      * - Both `a` and `b` are of the same sign
      * - `abs(a)` <= `(1+precisionEpsilon) * abs(b)`
      * - `abs(b)` <= `(1+precisionEpsilon) * abs(a)`
      *
      * Additionally, this option controls the snap-to-zero behavior for additions and subtractions:
      * - For `c=a+b`, if `abs(c)` <= `precisionEpsilon * abs(a)`, then `c` is set to `0`
      * - For `c=a-b`, if `abs(c)` <= `precisionEpsilon * abs(a)`, then `c` is set to `0`
      *
      * @default 1e-13
      *
      * @category Number
      */
    var precisionEpsilon: Double = js.native
    
    /**
      * Sets the precision level of calculations' output.
      *
      * Internally, all arithmetic operations are performed using JavaScript's built-in numbers.
      * But when HyperFormula exports a cell's value, it rounds the output
      * to the `precisionRounding` number of significant digits.
      *
      * Setting `precisionRounding` too low can cause large numbers' imprecision
      * (for example, with `precisionRounding` set to `4`, 100005 becomes 100010).
      *
      * We recommend setting `precisionRounding` to a value between `10` and `14`.
      *
      * @default 14
      *
      * @category Number
      */
    var precisionRounding: Double = js.native
    
    /**
      * When set to `false`, no rounding happens, and numbers are equal if and only if they are of truly identical value.
      *
      * For more information, see [[precisionEpsilon]].
      *
      * @default true
      *
      * @category Number
      */
    var smartRounding: Boolean = js.native
    
    /**
      * Sets a function that converts date-time values into strings.
      *
      * The function should return a string or undefined.
      *
      * For more information, see the [Date and time handling guide](/guide/date-and-time-handling.md).
      *
      * @default defaultStringifyDateTime
      *
      * @category Date and Time
      */
    def stringifyDateTime(dateTime: SimpleDateTime, dateTimeFormat: String): Maybe[String] = js.native
    
    /**
      * Sets a function that converts time duration values into strings.
      *
      * The function should return a string or undefined.
      *
      * For more information, see the [Date and time handling guide](/guide/date-and-time-handling.md).
      *
      * @default defaultStringifyDuration
      *
      * @category Date and Time
      */
    def stringifyDuration(time: SimpleTime, timeFormat: String): Maybe[String] = js.native
    
    /**
      * Sets the thousands' separator symbol for parsing numerical literals.
      *
      * Can be one of the following:
      * - empty
      * - `,` (comma)
      * - ` ` (empty space)
      *
      * Must be different from [[decimalSeparator]] and [[functionArgSeparator]].
      *
      * @default ''
      *
      * @category Number
      */
    var thousandSeparator: _empty | Comma | Space | Dot = js.native
    
    /**
      * Sets the time formats accepted by the time-parsing function.
      *
      * A format must be specified as a string consisting of at least two tokens separated by `:` (a colon).
      *
      * Supported tokes:
      * - `hh` (hours)
      * - `mm` (minutes)
      * - `ss`, `ss.s`, `ss.ss`, `ss.sss`, `ss.ssss`, etc. (seconds)
      *
      * The number of decimal places in the seconds token does not matter. All versions of the seconds token are equivalent in the context of parsing time values.
      *
      * @default ['hh:mm', 'hh:mm:ss.sss']
      *
      * @category Date and Time
      */
    var timeFormats: js.Array[String] = js.native
    
    /**
      * Sets the number of elements kept in the undo history.
      *
      * @default 20
      *
      * @category Undo and Redo
      */
    var undoLimit: Double = js.native
    
    /**
      * When set to `true`, array arithmetic is enabled globally.
      *
      * When set to `false`, array arithmetic is enabled only inside array functions (`ARRAYFORMULA`, `FILTER`, and `ARRAY_CONSTRAIN`).
      *
      * For more information, see the [Arrays guide](/guide/arrays.html).
      *
      * @default false
      *
      * @category Engine
      */
    var useArrayArithmetic: Boolean = js.native
    
    /**
      * When set to `true`, switches column search strategy from binary search to column index.
      *
      * Using column index improves efficiency of the `VLOOKUP` and `MATCH` functions, but increases memory usage.
      *
      * When searching with wildcards or regular expressions, column search strategy falls back to binary search (even with `useColumnIndex` set to `true`).
      *
      * @default false
      *
      * @category Engine
      */
    var useColumnIndex: Boolean = js.native
    
    /**
      * When set to `true`, criteria in functions (SUMIF, COUNTIF, ...) are allowed to use regular expressions.
      *
      * @default false
      * @category String
      */
    var useRegularExpressions: Boolean = js.native
    
    /**
      * When set to `true`, enables gathering engine statistics and timings.
      *
      * Useful for testing and benchmarking.
      *
      * @default false
      *
      * @category Engine
      */
    var useStats: Boolean = js.native
    
    /**
      * When set to `true`, criteria in functions (SUMIF, COUNTIF, ...) can use the `*` and `?` wildcards.
      *
      * @default true
      * @category String
      */
    var useWildcards: Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hyperformula.hyperformulaStrings.accentSensitive
    - typings.hyperformula.hyperformulaStrings.binarySearchThreshold
    - typings.hyperformula.hyperformulaStrings.caseSensitive
    - typings.hyperformula.hyperformulaStrings.caseFirst
    - typings.hyperformula.hyperformulaStrings.chooseAddressMappingPolicy
    - typings.hyperformula.hyperformulaStrings.currencySymbol
    - typings.hyperformula.hyperformulaStrings.dateFormats
    - typings.hyperformula.hyperformulaStrings.functionArgSeparator
    - typings.hyperformula.hyperformulaStrings.decimalSeparator
    - typings.hyperformula.hyperformulaStrings.evaluateNullToZero
    - typings.hyperformula.hyperformulaStrings.functionPlugins
    - typings.hyperformula.hyperformulaStrings.ignorePunctuation
    - typings.hyperformula.hyperformulaStrings.language
    - typings.hyperformula.hyperformulaStrings.ignoreWhiteSpace
    - typings.hyperformula.hyperformulaStrings.leapYear1900
    - typings.hyperformula.hyperformulaStrings.licenseKey
    - typings.hyperformula.hyperformulaStrings.localeLang
    - typings.hyperformula.hyperformulaStrings.matchWholeCell
    - typings.hyperformula.hyperformulaStrings.arrayColumnSeparator
    - typings.hyperformula.hyperformulaStrings.arrayRowSeparator
    - typings.hyperformula.hyperformulaStrings.maxRows
    - typings.hyperformula.hyperformulaStrings.maxColumns
    - typings.hyperformula.hyperformulaStrings.nullDate
    - typings.hyperformula.hyperformulaStrings.nullYear
    - typings.hyperformula.hyperformulaStrings.precisionEpsilon
    - typings.hyperformula.hyperformulaStrings.precisionRounding
    - typings.hyperformula.hyperformulaStrings.smartRounding
    - typings.hyperformula.hyperformulaStrings.thousandSeparator
    - typings.hyperformula.hyperformulaStrings.timeFormats
    - typings.hyperformula.hyperformulaStrings.useArrayArithmetic
    - typings.hyperformula.hyperformulaStrings.useColumnIndex
    - typings.hyperformula.hyperformulaStrings.useStats
    - typings.hyperformula.hyperformulaStrings.undoLimit
    - typings.hyperformula.hyperformulaStrings.useRegularExpressions
    - typings.hyperformula.hyperformulaStrings.useWildcards
  */
  trait ConfigParamsList extends StObject
}

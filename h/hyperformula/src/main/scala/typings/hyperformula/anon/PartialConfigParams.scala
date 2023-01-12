package typings.hyperformula.anon

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
import typings.hyperformula.typingsDateTimeHelperMod.DateTime
import typings.hyperformula.typingsDateTimeHelperMod.SimpleDate
import typings.hyperformula.typingsDateTimeHelperMod.SimpleDateTime
import typings.hyperformula.typingsDateTimeHelperMod.SimpleTime
import typings.hyperformula.typingsDependencyGraphAddressMappingChooseAddressMappingPolicyMod.ChooseAddressMapping
import typings.hyperformula.typingsMaybeMod.Maybe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<hyperformula.hyperformula/typings/Config.ConfigParams> */
trait PartialConfigParams extends StObject {
  
  var accentSensitive: js.UndefOr[Boolean] = js.undefined
  
  var arrayColumnSeparator: js.UndefOr[Comma | Semicolon] = js.undefined
  
  var arrayRowSeparator: js.UndefOr[Semicolon | Verticalline] = js.undefined
  
  var binarySearchThreshold: js.UndefOr[Double] = js.undefined
  
  var caseFirst: js.UndefOr[upper | lower | `false`] = js.undefined
  
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var chooseAddressMappingPolicy: js.UndefOr[ChooseAddressMapping] = js.undefined
  
  var currencySymbol: js.UndefOr[js.Array[String]] = js.undefined
  
  var dateFormats: js.UndefOr[js.Array[String]] = js.undefined
  
  var decimalSeparator: js.UndefOr[Dot | Comma] = js.undefined
  
  var evaluateNullToZero: js.UndefOr[Boolean] = js.undefined
  
  var functionArgSeparator: js.UndefOr[String] = js.undefined
  
  var functionPlugins: js.UndefOr[js.Array[Any]] = js.undefined
  
  var ignorePunctuation: js.UndefOr[Boolean] = js.undefined
  
  var ignoreWhiteSpace: js.UndefOr[standard | any] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var leapYear1900: js.UndefOr[Boolean] = js.undefined
  
  var licenseKey: js.UndefOr[String] = js.undefined
  
  var localeLang: js.UndefOr[String] = js.undefined
  
  var matchWholeCell: js.UndefOr[Boolean] = js.undefined
  
  var maxColumns: js.UndefOr[Double] = js.undefined
  
  var maxRows: js.UndefOr[Double] = js.undefined
  
  var nullDate: js.UndefOr[SimpleDate] = js.undefined
  
  var nullYear: js.UndefOr[Double] = js.undefined
  
  var parseDateTime: js.UndefOr[
    js.Function3[
      /* dateTimeString */ String, 
      /* dateFormat */ js.UndefOr[String], 
      /* timeFormat */ js.UndefOr[String], 
      Maybe[DateTime]
    ]
  ] = js.undefined
  
  var precisionEpsilon: js.UndefOr[Double] = js.undefined
  
  var precisionRounding: js.UndefOr[Double] = js.undefined
  
  var smartRounding: js.UndefOr[Boolean] = js.undefined
  
  var stringifyDateTime: js.UndefOr[
    js.Function2[/* dateTime */ SimpleDateTime, /* dateTimeFormat */ String, Maybe[String]]
  ] = js.undefined
  
  var stringifyDuration: js.UndefOr[js.Function2[/* time */ SimpleTime, /* timeFormat */ String, Maybe[String]]] = js.undefined
  
  var thousandSeparator: js.UndefOr[_empty | Comma | Space | Dot] = js.undefined
  
  var timeFormats: js.UndefOr[js.Array[String]] = js.undefined
  
  var undoLimit: js.UndefOr[Double] = js.undefined
  
  var useArrayArithmetic: js.UndefOr[Boolean] = js.undefined
  
  var useColumnIndex: js.UndefOr[Boolean] = js.undefined
  
  var useRegularExpressions: js.UndefOr[Boolean] = js.undefined
  
  var useStats: js.UndefOr[Boolean] = js.undefined
  
  var useWildcards: js.UndefOr[Boolean] = js.undefined
}
object PartialConfigParams {
  
  inline def apply(): PartialConfigParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfigParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialConfigParams] (val x: Self) extends AnyVal {
    
    inline def setAccentSensitive(value: Boolean): Self = StObject.set(x, "accentSensitive", value.asInstanceOf[js.Any])
    
    inline def setAccentSensitiveUndefined: Self = StObject.set(x, "accentSensitive", js.undefined)
    
    inline def setArrayColumnSeparator(value: Comma | Semicolon): Self = StObject.set(x, "arrayColumnSeparator", value.asInstanceOf[js.Any])
    
    inline def setArrayColumnSeparatorUndefined: Self = StObject.set(x, "arrayColumnSeparator", js.undefined)
    
    inline def setArrayRowSeparator(value: Semicolon | Verticalline): Self = StObject.set(x, "arrayRowSeparator", value.asInstanceOf[js.Any])
    
    inline def setArrayRowSeparatorUndefined: Self = StObject.set(x, "arrayRowSeparator", js.undefined)
    
    inline def setBinarySearchThreshold(value: Double): Self = StObject.set(x, "binarySearchThreshold", value.asInstanceOf[js.Any])
    
    inline def setBinarySearchThresholdUndefined: Self = StObject.set(x, "binarySearchThreshold", js.undefined)
    
    inline def setCaseFirst(value: upper | lower | `false`): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
    
    inline def setCaseFirstUndefined: Self = StObject.set(x, "caseFirst", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setChooseAddressMappingPolicy(value: ChooseAddressMapping): Self = StObject.set(x, "chooseAddressMappingPolicy", value.asInstanceOf[js.Any])
    
    inline def setChooseAddressMappingPolicyUndefined: Self = StObject.set(x, "chooseAddressMappingPolicy", js.undefined)
    
    inline def setCurrencySymbol(value: js.Array[String]): Self = StObject.set(x, "currencySymbol", value.asInstanceOf[js.Any])
    
    inline def setCurrencySymbolUndefined: Self = StObject.set(x, "currencySymbol", js.undefined)
    
    inline def setCurrencySymbolVarargs(value: String*): Self = StObject.set(x, "currencySymbol", js.Array(value*))
    
    inline def setDateFormats(value: js.Array[String]): Self = StObject.set(x, "dateFormats", value.asInstanceOf[js.Any])
    
    inline def setDateFormatsUndefined: Self = StObject.set(x, "dateFormats", js.undefined)
    
    inline def setDateFormatsVarargs(value: String*): Self = StObject.set(x, "dateFormats", js.Array(value*))
    
    inline def setDecimalSeparator(value: Dot | Comma): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
    
    inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
    
    inline def setEvaluateNullToZero(value: Boolean): Self = StObject.set(x, "evaluateNullToZero", value.asInstanceOf[js.Any])
    
    inline def setEvaluateNullToZeroUndefined: Self = StObject.set(x, "evaluateNullToZero", js.undefined)
    
    inline def setFunctionArgSeparator(value: String): Self = StObject.set(x, "functionArgSeparator", value.asInstanceOf[js.Any])
    
    inline def setFunctionArgSeparatorUndefined: Self = StObject.set(x, "functionArgSeparator", js.undefined)
    
    inline def setFunctionPlugins(value: js.Array[Any]): Self = StObject.set(x, "functionPlugins", value.asInstanceOf[js.Any])
    
    inline def setFunctionPluginsUndefined: Self = StObject.set(x, "functionPlugins", js.undefined)
    
    inline def setFunctionPluginsVarargs(value: Any*): Self = StObject.set(x, "functionPlugins", js.Array(value*))
    
    inline def setIgnorePunctuation(value: Boolean): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
    
    inline def setIgnorePunctuationUndefined: Self = StObject.set(x, "ignorePunctuation", js.undefined)
    
    inline def setIgnoreWhiteSpace(value: standard | any): Self = StObject.set(x, "ignoreWhiteSpace", value.asInstanceOf[js.Any])
    
    inline def setIgnoreWhiteSpaceUndefined: Self = StObject.set(x, "ignoreWhiteSpace", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLeapYear1900(value: Boolean): Self = StObject.set(x, "leapYear1900", value.asInstanceOf[js.Any])
    
    inline def setLeapYear1900Undefined: Self = StObject.set(x, "leapYear1900", js.undefined)
    
    inline def setLicenseKey(value: String): Self = StObject.set(x, "licenseKey", value.asInstanceOf[js.Any])
    
    inline def setLicenseKeyUndefined: Self = StObject.set(x, "licenseKey", js.undefined)
    
    inline def setLocaleLang(value: String): Self = StObject.set(x, "localeLang", value.asInstanceOf[js.Any])
    
    inline def setLocaleLangUndefined: Self = StObject.set(x, "localeLang", js.undefined)
    
    inline def setMatchWholeCell(value: Boolean): Self = StObject.set(x, "matchWholeCell", value.asInstanceOf[js.Any])
    
    inline def setMatchWholeCellUndefined: Self = StObject.set(x, "matchWholeCell", js.undefined)
    
    inline def setMaxColumns(value: Double): Self = StObject.set(x, "maxColumns", value.asInstanceOf[js.Any])
    
    inline def setMaxColumnsUndefined: Self = StObject.set(x, "maxColumns", js.undefined)
    
    inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
    
    inline def setNullDate(value: SimpleDate): Self = StObject.set(x, "nullDate", value.asInstanceOf[js.Any])
    
    inline def setNullDateUndefined: Self = StObject.set(x, "nullDate", js.undefined)
    
    inline def setNullYear(value: Double): Self = StObject.set(x, "nullYear", value.asInstanceOf[js.Any])
    
    inline def setNullYearUndefined: Self = StObject.set(x, "nullYear", js.undefined)
    
    inline def setParseDateTime(
      value: (/* dateTimeString */ String, /* dateFormat */ js.UndefOr[String], /* timeFormat */ js.UndefOr[String]) => Maybe[DateTime]
    ): Self = StObject.set(x, "parseDateTime", js.Any.fromFunction3(value))
    
    inline def setParseDateTimeUndefined: Self = StObject.set(x, "parseDateTime", js.undefined)
    
    inline def setPrecisionEpsilon(value: Double): Self = StObject.set(x, "precisionEpsilon", value.asInstanceOf[js.Any])
    
    inline def setPrecisionEpsilonUndefined: Self = StObject.set(x, "precisionEpsilon", js.undefined)
    
    inline def setPrecisionRounding(value: Double): Self = StObject.set(x, "precisionRounding", value.asInstanceOf[js.Any])
    
    inline def setPrecisionRoundingUndefined: Self = StObject.set(x, "precisionRounding", js.undefined)
    
    inline def setSmartRounding(value: Boolean): Self = StObject.set(x, "smartRounding", value.asInstanceOf[js.Any])
    
    inline def setSmartRoundingUndefined: Self = StObject.set(x, "smartRounding", js.undefined)
    
    inline def setStringifyDateTime(value: (/* dateTime */ SimpleDateTime, /* dateTimeFormat */ String) => Maybe[String]): Self = StObject.set(x, "stringifyDateTime", js.Any.fromFunction2(value))
    
    inline def setStringifyDateTimeUndefined: Self = StObject.set(x, "stringifyDateTime", js.undefined)
    
    inline def setStringifyDuration(value: (/* time */ SimpleTime, /* timeFormat */ String) => Maybe[String]): Self = StObject.set(x, "stringifyDuration", js.Any.fromFunction2(value))
    
    inline def setStringifyDurationUndefined: Self = StObject.set(x, "stringifyDuration", js.undefined)
    
    inline def setThousandSeparator(value: _empty | Comma | Space | Dot): Self = StObject.set(x, "thousandSeparator", value.asInstanceOf[js.Any])
    
    inline def setThousandSeparatorUndefined: Self = StObject.set(x, "thousandSeparator", js.undefined)
    
    inline def setTimeFormats(value: js.Array[String]): Self = StObject.set(x, "timeFormats", value.asInstanceOf[js.Any])
    
    inline def setTimeFormatsUndefined: Self = StObject.set(x, "timeFormats", js.undefined)
    
    inline def setTimeFormatsVarargs(value: String*): Self = StObject.set(x, "timeFormats", js.Array(value*))
    
    inline def setUndoLimit(value: Double): Self = StObject.set(x, "undoLimit", value.asInstanceOf[js.Any])
    
    inline def setUndoLimitUndefined: Self = StObject.set(x, "undoLimit", js.undefined)
    
    inline def setUseArrayArithmetic(value: Boolean): Self = StObject.set(x, "useArrayArithmetic", value.asInstanceOf[js.Any])
    
    inline def setUseArrayArithmeticUndefined: Self = StObject.set(x, "useArrayArithmetic", js.undefined)
    
    inline def setUseColumnIndex(value: Boolean): Self = StObject.set(x, "useColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setUseColumnIndexUndefined: Self = StObject.set(x, "useColumnIndex", js.undefined)
    
    inline def setUseRegularExpressions(value: Boolean): Self = StObject.set(x, "useRegularExpressions", value.asInstanceOf[js.Any])
    
    inline def setUseRegularExpressionsUndefined: Self = StObject.set(x, "useRegularExpressions", js.undefined)
    
    inline def setUseStats(value: Boolean): Self = StObject.set(x, "useStats", value.asInstanceOf[js.Any])
    
    inline def setUseStatsUndefined: Self = StObject.set(x, "useStats", js.undefined)
    
    inline def setUseWildcards(value: Boolean): Self = StObject.set(x, "useWildcards", value.asInstanceOf[js.Any])
    
    inline def setUseWildcardsUndefined: Self = StObject.set(x, "useWildcards", js.undefined)
  }
}

package typings.i18next.mod

import org.scalablytyped.runtime.StringDictionary
import typings.i18next.anon.InterpolationOptionskeyst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolationOptions extends StObject {
  
  /**
    * Always format interpolated values.
    * @default false
    */
  var alwaysFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Global variables to use in interpolation replacements
    * @default undefined
    */
  var defaultVariables: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Escape function
    * @default str => str
    */
  var escape: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  
  /**
    * Escape passed in values to avoid xss injection
    * @default true
    */
  var escapeValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Format function see formatting for details
    * @default noop
    */
  var format: js.UndefOr[FormatFunction] = js.undefined
  
  /**
    * Used to separate format from interpolation value
    * @default ','
    */
  var formatSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * After how many interpolation runs to break out before throwing a stack overflow
    * @default 1000
    */
  var maxReplaces: js.UndefOr[Double] = js.undefined
  
  /**
    * Separates options from key
    * @default ','
    */
  var nestingOptionsSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * Prefix for nesting
    * @default '$t('
    */
  var nestingPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Escaped prefix for nesting (regexSafe)
    * @default undefined
    */
  var nestingPrefixEscaped: js.UndefOr[String] = js.undefined
  
  /**
    * Suffix for nesting
    * @default ')'
    */
  var nestingSuffix: js.UndefOr[String] = js.undefined
  
  /**
    * Escaped suffix for nesting (regexSafe)
    * @default undefined
    */
  var nestingSuffixEscaped: js.UndefOr[String] = js.undefined
  
  /**
    * Prefix for interpolation
    * @default '{{'
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * Escaped prefix for interpolation (regexSafe)
    * @default undefined
    */
  var prefixEscaped: js.UndefOr[String] = js.undefined
  
  /**
    * If true, it will skip to interpolate the variables
    * @default true
    */
  var skipOnVariables: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Suffix for interpolation
    * @default '}}'
    */
  var suffix: js.UndefOr[String] = js.undefined
  
  /**
    * Escaped suffix for interpolation (regexSafe)
    * @default undefined
    */
  var suffixEscaped: js.UndefOr[String] = js.undefined
  
  /**
    * Prefix to unescaped mode
    * @default '-'
    */
  var unescapePrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Suffix to unescaped mode
    * @default undefined
    */
  var unescapeSuffix: js.UndefOr[String] = js.undefined
  
  /**
    * If true, then value passed into escape function is not casted to string, use with custom escape function that does its own type check
    * @default false
    */
  var useRawValueToEscape: js.UndefOr[Boolean] = js.undefined
}
object InterpolationOptions {
  
  inline def apply(): InterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolationOptions]
  }
  
  extension [Self <: InterpolationOptions](x: Self) {
    
    inline def setAlwaysFormat(value: Boolean): Self = StObject.set(x, "alwaysFormat", value.asInstanceOf[js.Any])
    
    inline def setAlwaysFormatUndefined: Self = StObject.set(x, "alwaysFormat", js.undefined)
    
    inline def setDefaultVariables(value: StringDictionary[Any]): Self = StObject.set(x, "defaultVariables", value.asInstanceOf[js.Any])
    
    inline def setDefaultVariablesUndefined: Self = StObject.set(x, "defaultVariables", js.undefined)
    
    inline def setEscape(value: /* str */ String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setEscapeValue(value: Boolean): Self = StObject.set(x, "escapeValue", value.asInstanceOf[js.Any])
    
    inline def setEscapeValueUndefined: Self = StObject.set(x, "escapeValue", js.undefined)
    
    inline def setFormat(
      value: (/* value */ Any, /* format */ js.UndefOr[String], /* lng */ js.UndefOr[String], /* options */ js.UndefOr[InterpolationOptionskeyst]) => String
    ): Self = StObject.set(x, "format", js.Any.fromFunction4(value))
    
    inline def setFormatSeparator(value: String): Self = StObject.set(x, "formatSeparator", value.asInstanceOf[js.Any])
    
    inline def setFormatSeparatorUndefined: Self = StObject.set(x, "formatSeparator", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMaxReplaces(value: Double): Self = StObject.set(x, "maxReplaces", value.asInstanceOf[js.Any])
    
    inline def setMaxReplacesUndefined: Self = StObject.set(x, "maxReplaces", js.undefined)
    
    inline def setNestingOptionsSeparator(value: String): Self = StObject.set(x, "nestingOptionsSeparator", value.asInstanceOf[js.Any])
    
    inline def setNestingOptionsSeparatorUndefined: Self = StObject.set(x, "nestingOptionsSeparator", js.undefined)
    
    inline def setNestingPrefix(value: String): Self = StObject.set(x, "nestingPrefix", value.asInstanceOf[js.Any])
    
    inline def setNestingPrefixEscaped(value: String): Self = StObject.set(x, "nestingPrefixEscaped", value.asInstanceOf[js.Any])
    
    inline def setNestingPrefixEscapedUndefined: Self = StObject.set(x, "nestingPrefixEscaped", js.undefined)
    
    inline def setNestingPrefixUndefined: Self = StObject.set(x, "nestingPrefix", js.undefined)
    
    inline def setNestingSuffix(value: String): Self = StObject.set(x, "nestingSuffix", value.asInstanceOf[js.Any])
    
    inline def setNestingSuffixEscaped(value: String): Self = StObject.set(x, "nestingSuffixEscaped", value.asInstanceOf[js.Any])
    
    inline def setNestingSuffixEscapedUndefined: Self = StObject.set(x, "nestingSuffixEscaped", js.undefined)
    
    inline def setNestingSuffixUndefined: Self = StObject.set(x, "nestingSuffix", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixEscaped(value: String): Self = StObject.set(x, "prefixEscaped", value.asInstanceOf[js.Any])
    
    inline def setPrefixEscapedUndefined: Self = StObject.set(x, "prefixEscaped", js.undefined)
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSkipOnVariables(value: Boolean): Self = StObject.set(x, "skipOnVariables", value.asInstanceOf[js.Any])
    
    inline def setSkipOnVariablesUndefined: Self = StObject.set(x, "skipOnVariables", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixEscaped(value: String): Self = StObject.set(x, "suffixEscaped", value.asInstanceOf[js.Any])
    
    inline def setSuffixEscapedUndefined: Self = StObject.set(x, "suffixEscaped", js.undefined)
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setUnescapePrefix(value: String): Self = StObject.set(x, "unescapePrefix", value.asInstanceOf[js.Any])
    
    inline def setUnescapePrefixUndefined: Self = StObject.set(x, "unescapePrefix", js.undefined)
    
    inline def setUnescapeSuffix(value: String): Self = StObject.set(x, "unescapeSuffix", value.asInstanceOf[js.Any])
    
    inline def setUnescapeSuffixUndefined: Self = StObject.set(x, "unescapeSuffix", js.undefined)
    
    inline def setUseRawValueToEscape(value: Boolean): Self = StObject.set(x, "useRawValueToEscape", value.asInstanceOf[js.Any])
    
    inline def setUseRawValueToEscapeUndefined: Self = StObject.set(x, "useRawValueToEscape", js.undefined)
  }
}

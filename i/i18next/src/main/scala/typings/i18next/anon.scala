package typings.i18next

import org.scalablytyped.runtime.StringDictionary
import typings.i18next.i18nextBooleans.`false`
import typings.i18next.i18nextBooleans.`true`
import typings.i18next.mod.FallbackLng
import typings.i18next.mod.FallbackLngObjList
import typings.i18next.mod.FormatFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var returnDetails: `true`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(returnDetails = true)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setReturnDetails(value: `true`): Self = StObject.set(x, "returnDetails", value.asInstanceOf[js.Any])
    }
  }
  
  trait AllowedHosts extends StObject {
    
    /**
      * Hostnames that are allowed to send last used data.
      * Please keep those to your local system, staging, test servers (not production)
      * @default ['localhost']
      */
    var allowedHosts: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An api key if you want to send missing keys
      */
    var apiKey: js.UndefOr[String] = js.undefined
    
    /**
      * Debounce interval to send data in milliseconds
      * @default 90000
      */
    var debounceSubmit: js.UndefOr[Double] = js.undefined
    
    /**
      * The id of your locize project
      */
    var projectId: String
    
    /**
      * The reference language of your project
      * @default 'en'
      */
    var referenceLng: js.UndefOr[String] = js.undefined
    
    /**
      * Version
      * @default 'latest'
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object AllowedHosts {
    
    inline def apply(projectId: String): AllowedHosts = {
      val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowedHosts]
    }
    
    extension [Self <: AllowedHosts](x: Self) {
      
      inline def setAllowedHosts(value: js.Array[String]): Self = StObject.set(x, "allowedHosts", value.asInstanceOf[js.Any])
      
      inline def setAllowedHostsUndefined: Self = StObject.set(x, "allowedHosts", js.undefined)
      
      inline def setAllowedHostsVarargs(value: String*): Self = StObject.set(x, "allowedHosts", js.Array(value*))
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setDebounceSubmit(value: Double): Self = StObject.set(x, "debounceSubmit", value.asInstanceOf[js.Any])
      
      inline def setDebounceSubmitUndefined: Self = StObject.set(x, "debounceSubmit", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setReferenceLng(value: String): Self = StObject.set(x, "referenceLng", value.asInstanceOf[js.Any])
      
      inline def setReferenceLngUndefined: Self = StObject.set(x, "referenceLng", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined i18next.i18next.InterpolationOptions & {[key: string] : any} */
  trait InterpolationOptionskeyst
    extends StObject
       with /* key */ StringDictionary[Any] {
    
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
  object InterpolationOptionskeyst {
    
    inline def apply(): InterpolationOptionskeyst = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterpolationOptionskeyst]
    }
    
    extension [Self <: InterpolationOptionskeyst](x: Self) {
      
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
  
  trait KeySeparator extends StObject {
    
    var keySeparator: js.UndefOr[String] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object KeySeparator {
    
    inline def apply(): KeySeparator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeySeparator]
    }
    
    extension [Self <: KeySeparator](x: Self) {
      
      inline def setKeySeparator(value: String): Self = StObject.set(x, "keySeparator", value.asInstanceOf[js.Any])
      
      inline def setKeySeparatorUndefined: Self = StObject.set(x, "keySeparator", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  /* Inlined std.Pick<i18next.i18next.InitOptions, 'fallbackLng'> */
  trait PickInitOptionsfallbackLn extends StObject {
    
    var fallbackLng: js.UndefOr[`false` | FallbackLng] = js.undefined
  }
  object PickInitOptionsfallbackLn {
    
    inline def apply(): PickInitOptionsfallbackLn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickInitOptionsfallbackLn]
    }
    
    extension [Self <: PickInitOptionsfallbackLn](x: Self) {
      
      inline def setFallbackLng(value: `false` | FallbackLng): Self = StObject.set(x, "fallbackLng", value.asInstanceOf[js.Any])
      
      inline def setFallbackLngFunction1(value: /* code */ String => String | js.Array[String] | FallbackLngObjList): Self = StObject.set(x, "fallbackLng", js.Any.fromFunction1(value))
      
      inline def setFallbackLngUndefined: Self = StObject.set(x, "fallbackLng", js.undefined)
      
      inline def setFallbackLngVarargs(value: String*): Self = StObject.set(x, "fallbackLng", js.Array(value*))
    }
  }
  
  /* Inlined std.Pick<i18next.i18next.InitOptions, 'keySeparator' | 'ignoreJSONStructure'> */
  trait PickInitOptionskeySeparat extends StObject {
    
    var ignoreJSONStructure: js.UndefOr[Boolean] = js.undefined
    
    var keySeparator: js.UndefOr[`false` | String] = js.undefined
  }
  object PickInitOptionskeySeparat {
    
    inline def apply(): PickInitOptionskeySeparat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickInitOptionskeySeparat]
    }
    
    extension [Self <: PickInitOptionskeySeparat](x: Self) {
      
      inline def setIgnoreJSONStructure(value: Boolean): Self = StObject.set(x, "ignoreJSONStructure", value.asInstanceOf[js.Any])
      
      inline def setIgnoreJSONStructureUndefined: Self = StObject.set(x, "ignoreJSONStructure", js.undefined)
      
      inline def setKeySeparator(value: `false` | String): Self = StObject.set(x, "keySeparator", value.asInstanceOf[js.Any])
      
      inline def setKeySeparatorUndefined: Self = StObject.set(x, "keySeparator", js.undefined)
    }
  }
  
  trait ReturnDetails extends StObject {
    
    var returnDetails: `true`
    
    var returnObjects: `true`
  }
  object ReturnDetails {
    
    inline def apply(): ReturnDetails = {
      val __obj = js.Dynamic.literal(returnDetails = true, returnObjects = true)
      __obj.asInstanceOf[ReturnDetails]
    }
    
    extension [Self <: ReturnDetails](x: Self) {
      
      inline def setReturnDetails(value: `true`): Self = StObject.set(x, "returnDetails", value.asInstanceOf[js.Any])
      
      inline def setReturnObjects(value: `true`): Self = StObject.set(x, "returnObjects", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReturnObjects extends StObject {
    
    var returnObjects: `true`
  }
  object ReturnObjects {
    
    inline def apply(): ReturnObjects = {
      val __obj = js.Dynamic.literal(returnObjects = true)
      __obj.asInstanceOf[ReturnObjects]
    }
    
    extension [Self <: ReturnObjects](x: Self) {
      
      inline def setReturnObjects(value: `true`): Self = StObject.set(x, "returnObjects", value.asInstanceOf[js.Any])
    }
  }
}

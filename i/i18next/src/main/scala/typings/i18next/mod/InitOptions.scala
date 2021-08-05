package typings.i18next.mod

import typings.i18next.anon.AllowedHosts
import typings.i18next.anon.AutoOpen
import typings.i18next.i18nextBooleans.`false`
import typings.i18next.i18nextStrings.all
import typings.i18next.i18nextStrings.current
import typings.i18next.i18nextStrings.currentOnly
import typings.i18next.i18nextStrings.fallback
import typings.i18next.i18nextStrings.languageOnly
import typings.i18next.i18nextStrings.v1
import typings.i18next.i18nextStrings.v2
import typings.i18next.i18nextStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitOptions extends StObject {
  
  /**
    * Prefixes the namespace to the returned key when using `cimode`
    * @default false
    */
  var appendNamespaceToCIMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Appends namespace to missing key
    * @default false
    */
  var appendNamespaceToMissingKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Options for backend - check documentation of plugin
    * @default undefined
    */
  var backend: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Options for cache layer - check documentation of plugin
    * @default undefined
    */
  var cache: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Language will be lowercased EN --> en while leaving full locales like en-US
    * @default false
    */
  var cleanCode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Compatibility JSON version
    * @default 'v3'
    */
  var compatibilityJSON: js.UndefOr[v1 | v2 | v3] = js.undefined
  
  /**
    * Char to split context from key
    * @default '_'
    */
  var contextSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * Logs info level to console output. Helps finding issues with loading not working.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default namespace used if not passed to translation function
    * @default 'translation'
    */
  var defaultNS: js.UndefOr[String] = js.undefined
  
  /**
    * Options for language detection - check documentation of plugin
    * @default undefined
    */
  var detection: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Options for https://github.com/locize/locize-editor
    * @default undefined
    */
  var editor: js.UndefOr[AutoOpen] = js.undefined
  
  /**
    * Language to use if translations in user language are not available.
    * @default 'dev'
    */
  var fallbackLng: js.UndefOr[`false` | FallbackLng] = js.undefined
  
  /**
    * String or array of namespaces to lookup key if not found in given namespace.
    * @default false
    */
  var fallbackNS: js.UndefOr[`false` | String | js.Array[String]] = js.undefined
  
  /**
    * Options for i18n message format - check documentation of plugin
    * @default undefined
    */
  var i18nFormat: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Triggers resource loading in init function inside a setTimeout (default async behaviour).
    * Set it to false if your backend loads resources sync - that way calling i18next.t after
    * init is possible without relaying on the init callback.
    * @default true
    */
  var initImmediate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @see https://www.i18next.com/interpolation.html
    */
  var interpolation: js.UndefOr[InterpolationOptions] = js.undefined
  
  /**
    * Char, eg. '\n' that arrays will be joined by
    * @default false
    */
  var joinArrays: js.UndefOr[`false` | String] = js.undefined
  
  /**
    * Char to separate keys
    * @default '.'
    */
  var keySeparator: js.UndefOr[`false` | String] = js.undefined
  
  /**
    * Language to use (overrides language detection)
    * @default undefined
    */
  var lng: js.UndefOr[String] = js.undefined
  
  /**
    * Language codes to lookup, given set language is
    * 'en-US': 'all' --> ['en-US', 'en', 'dev'],
    * 'currentOnly' --> 'en-US',
    * 'languageOnly' --> 'en'
    * @default 'all'
    */
  var load: js.UndefOr[all | currentOnly | languageOnly] = js.undefined
  
  /**
    * Options for https://github.com/locize/locize-lastused
    * @default undefined
    */
  var locizeLastUsed: js.UndefOr[AllowedHosts] = js.undefined
  
  /**
    * Language will be lowercased eg. en-US --> en-us
    * @default false
    */
  var lowerCaseLng: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets called in case a interpolation value is undefined. This method will not be called if the value is empty string or null
    * @default noop
    */
  var missingInterpolationHandler: js.UndefOr[
    js.Function3[/* text */ String, /* value */ js.Any, /* options */ this.type, js.Any]
  ] = js.undefined
  
  /**
    * Used for custom missing key handling (needs saveMissing set to true!)
    * @default false
    */
  var missingKeyHandler: js.UndefOr[
    `false` | (js.Function4[
      /* lngs */ js.Array[String], 
      /* ns */ String, 
      /* key */ String, 
      /* fallbackValue */ String, 
      Unit
    ])
  ] = js.undefined
  
  /**
    * If true will pass eg. en-US if finding en in supportedLngs
    * @default false
    */
  var nonExplicitSupportedLngs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * DEPRECTADED use nonExplicitSupportedLngs
    * @default false
    */
  var nonExplicitWhitelist: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String or array of namespaces to load
    * @default 'translation'
    */
  var ns: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Char to split namespace from key
    * @default ':'
    */
  var nsSeparator: js.UndefOr[`false` | String] = js.undefined
  
  /**
    * Sets defaultValue
    * @default args => ({ defaultValue: args[1] })
    */
  var overloadTranslationOptionHandler: js.UndefOr[js.Function1[/* args */ js.Array[String], TOptions[StringMap]]] = js.undefined
  
  /**
    * Receives a key that was not found in `t()` and returns a value, that will be returned by `t()`
    * @default noop
    */
  var parseMissingKeyHandler: js.UndefOr[js.Function1[/* key */ String, js.Any]] = js.undefined
  
  /**
    * Allow initializing with bundled resources while using a backend to load non bundled ones.
    * @default false
    */
  var partialBundledLanguages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Char to split plural from key
    * @default '_'
    */
  var pluralSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * String or array of postProcessors to apply per default
    * @default false
    */
  var postProcess: js.UndefOr[`false` | String | js.Array[String]] = js.undefined
  
  /**
    * passthrough the resolved object including 'usedNS', 'usedLang' etc into options object of postprocessors as 'i18nResolved' property
    * @default false
    */
  var postProcessPassResolved: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of languages to preload. Important on server-side to assert translations are loaded before rendering views.
    * @default false
    */
  var preload: js.UndefOr[`false` | js.Array[String]] = js.undefined
  
  /**
    * Options for react - check documentation of plugin
    * @default undefined
    */
  var react: js.UndefOr[ReactOptions] = js.undefined
  
  /**
    * Resources to initialize with (if not using loading or not appending using addResourceBundle)
    * @default undefined
    */
  var resources: js.UndefOr[Resource] = js.undefined
  
  /**
    * Allows empty string as valid translation
    * @default true
    */
  var returnEmptyString: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows null values as valid translation
    * @default true
    */
  var returnNull: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows objects as valid translation result
    * @default false
    */
  var returnObjects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets called if object was passed in as key but returnObjects was set to false
    * @default noop
    */
  var returnedObjectHandler: js.UndefOr[js.Function3[/* key */ String, /* value */ String, /* options */ js.Any, Unit]] = js.undefined
  
  /**
    * Calls save missing key function on backend if key not found
    * @default false
    */
  var saveMissing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default 'fallback'
    */
  var saveMissingTo: js.UndefOr[current | all | fallback] = js.undefined
  
  /**
    * Will use 'plural' as suffix for languages only having 1 plural form, setting it to false will suffix all with numbers
    * @default true
    */
  var simplifyPluralSuffix: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of allowed languages
    * @default false
    */
  var supportedLngs: js.UndefOr[`false` | js.Array[String]] = js.undefined
  
  /**
    * Experimental: enable to update default values using the saveMissing
    * (Works only if defaultValue different from translated value.
    * Only useful on initial development or when keeping code as source of truth not changing values outside of code.
    * Only supported if backend supports it already)
    * @default false
    */
  var updateMissing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * DEPRECATED use supportedLngs
    * @default false
    */
  var whitelist: js.UndefOr[`false` | js.Array[String]] = js.undefined
}
object InitOptions {
  
  inline def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  
  extension [Self <: InitOptions](x: Self) {
    
    inline def setAppendNamespaceToCIMode(value: Boolean): Self = StObject.set(x, "appendNamespaceToCIMode", value.asInstanceOf[js.Any])
    
    inline def setAppendNamespaceToCIModeUndefined: Self = StObject.set(x, "appendNamespaceToCIMode", js.undefined)
    
    inline def setAppendNamespaceToMissingKey(value: Boolean): Self = StObject.set(x, "appendNamespaceToMissingKey", value.asInstanceOf[js.Any])
    
    inline def setAppendNamespaceToMissingKeyUndefined: Self = StObject.set(x, "appendNamespaceToMissingKey", js.undefined)
    
    inline def setBackend(value: js.Object): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
    
    inline def setCache(value: js.Object): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCleanCode(value: Boolean): Self = StObject.set(x, "cleanCode", value.asInstanceOf[js.Any])
    
    inline def setCleanCodeUndefined: Self = StObject.set(x, "cleanCode", js.undefined)
    
    inline def setCompatibilityJSON(value: v1 | v2 | v3): Self = StObject.set(x, "compatibilityJSON", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityJSONUndefined: Self = StObject.set(x, "compatibilityJSON", js.undefined)
    
    inline def setContextSeparator(value: String): Self = StObject.set(x, "contextSeparator", value.asInstanceOf[js.Any])
    
    inline def setContextSeparatorUndefined: Self = StObject.set(x, "contextSeparator", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDefaultNS(value: String): Self = StObject.set(x, "defaultNS", value.asInstanceOf[js.Any])
    
    inline def setDefaultNSUndefined: Self = StObject.set(x, "defaultNS", js.undefined)
    
    inline def setDetection(value: js.Object): Self = StObject.set(x, "detection", value.asInstanceOf[js.Any])
    
    inline def setDetectionUndefined: Self = StObject.set(x, "detection", js.undefined)
    
    inline def setEditor(value: AutoOpen): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setFallbackLng(value: `false` | FallbackLng): Self = StObject.set(x, "fallbackLng", value.asInstanceOf[js.Any])
    
    inline def setFallbackLngFunction1(value: /* code */ String => String | js.Array[String] | FallbackLngObjList): Self = StObject.set(x, "fallbackLng", js.Any.fromFunction1(value))
    
    inline def setFallbackLngUndefined: Self = StObject.set(x, "fallbackLng", js.undefined)
    
    inline def setFallbackLngVarargs(value: String*): Self = StObject.set(x, "fallbackLng", js.Array(value :_*))
    
    inline def setFallbackNS(value: `false` | String | js.Array[String]): Self = StObject.set(x, "fallbackNS", value.asInstanceOf[js.Any])
    
    inline def setFallbackNSUndefined: Self = StObject.set(x, "fallbackNS", js.undefined)
    
    inline def setFallbackNSVarargs(value: String*): Self = StObject.set(x, "fallbackNS", js.Array(value :_*))
    
    inline def setI18nFormat(value: js.Object): Self = StObject.set(x, "i18nFormat", value.asInstanceOf[js.Any])
    
    inline def setI18nFormatUndefined: Self = StObject.set(x, "i18nFormat", js.undefined)
    
    inline def setInitImmediate(value: Boolean): Self = StObject.set(x, "initImmediate", value.asInstanceOf[js.Any])
    
    inline def setInitImmediateUndefined: Self = StObject.set(x, "initImmediate", js.undefined)
    
    inline def setInterpolation(value: InterpolationOptions): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setJoinArrays(value: `false` | String): Self = StObject.set(x, "joinArrays", value.asInstanceOf[js.Any])
    
    inline def setJoinArraysUndefined: Self = StObject.set(x, "joinArrays", js.undefined)
    
    inline def setKeySeparator(value: `false` | String): Self = StObject.set(x, "keySeparator", value.asInstanceOf[js.Any])
    
    inline def setKeySeparatorUndefined: Self = StObject.set(x, "keySeparator", js.undefined)
    
    inline def setLng(value: String): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    inline def setLngUndefined: Self = StObject.set(x, "lng", js.undefined)
    
    inline def setLoad(value: all | currentOnly | languageOnly): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setLocizeLastUsed(value: AllowedHosts): Self = StObject.set(x, "locizeLastUsed", value.asInstanceOf[js.Any])
    
    inline def setLocizeLastUsedUndefined: Self = StObject.set(x, "locizeLastUsed", js.undefined)
    
    inline def setLowerCaseLng(value: Boolean): Self = StObject.set(x, "lowerCaseLng", value.asInstanceOf[js.Any])
    
    inline def setLowerCaseLngUndefined: Self = StObject.set(x, "lowerCaseLng", js.undefined)
    
    inline def setMissingInterpolationHandler(value: (/* text */ String, /* value */ js.Any, InitOptions) => js.Any): Self = StObject.set(x, "missingInterpolationHandler", js.Any.fromFunction3(value))
    
    inline def setMissingInterpolationHandlerUndefined: Self = StObject.set(x, "missingInterpolationHandler", js.undefined)
    
    inline def setMissingKeyHandler(
      value: `false` | (js.Function4[
          /* lngs */ js.Array[String], 
          /* ns */ String, 
          /* key */ String, 
          /* fallbackValue */ String, 
          Unit
        ])
    ): Self = StObject.set(x, "missingKeyHandler", value.asInstanceOf[js.Any])
    
    inline def setMissingKeyHandlerFunction4(
      value: (/* lngs */ js.Array[String], /* ns */ String, /* key */ String, /* fallbackValue */ String) => Unit
    ): Self = StObject.set(x, "missingKeyHandler", js.Any.fromFunction4(value))
    
    inline def setMissingKeyHandlerUndefined: Self = StObject.set(x, "missingKeyHandler", js.undefined)
    
    inline def setNonExplicitSupportedLngs(value: Boolean): Self = StObject.set(x, "nonExplicitSupportedLngs", value.asInstanceOf[js.Any])
    
    inline def setNonExplicitSupportedLngsUndefined: Self = StObject.set(x, "nonExplicitSupportedLngs", js.undefined)
    
    inline def setNonExplicitWhitelist(value: Boolean): Self = StObject.set(x, "nonExplicitWhitelist", value.asInstanceOf[js.Any])
    
    inline def setNonExplicitWhitelistUndefined: Self = StObject.set(x, "nonExplicitWhitelist", js.undefined)
    
    inline def setNs(value: String | js.Array[String]): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setNsSeparator(value: `false` | String): Self = StObject.set(x, "nsSeparator", value.asInstanceOf[js.Any])
    
    inline def setNsSeparatorUndefined: Self = StObject.set(x, "nsSeparator", js.undefined)
    
    inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
    
    inline def setNsVarargs(value: String*): Self = StObject.set(x, "ns", js.Array(value :_*))
    
    inline def setOverloadTranslationOptionHandler(value: /* args */ js.Array[String] => TOptions[StringMap]): Self = StObject.set(x, "overloadTranslationOptionHandler", js.Any.fromFunction1(value))
    
    inline def setOverloadTranslationOptionHandlerUndefined: Self = StObject.set(x, "overloadTranslationOptionHandler", js.undefined)
    
    inline def setParseMissingKeyHandler(value: /* key */ String => js.Any): Self = StObject.set(x, "parseMissingKeyHandler", js.Any.fromFunction1(value))
    
    inline def setParseMissingKeyHandlerUndefined: Self = StObject.set(x, "parseMissingKeyHandler", js.undefined)
    
    inline def setPartialBundledLanguages(value: Boolean): Self = StObject.set(x, "partialBundledLanguages", value.asInstanceOf[js.Any])
    
    inline def setPartialBundledLanguagesUndefined: Self = StObject.set(x, "partialBundledLanguages", js.undefined)
    
    inline def setPluralSeparator(value: String): Self = StObject.set(x, "pluralSeparator", value.asInstanceOf[js.Any])
    
    inline def setPluralSeparatorUndefined: Self = StObject.set(x, "pluralSeparator", js.undefined)
    
    inline def setPostProcess(value: `false` | String | js.Array[String]): Self = StObject.set(x, "postProcess", value.asInstanceOf[js.Any])
    
    inline def setPostProcessPassResolved(value: Boolean): Self = StObject.set(x, "postProcessPassResolved", value.asInstanceOf[js.Any])
    
    inline def setPostProcessPassResolvedUndefined: Self = StObject.set(x, "postProcessPassResolved", js.undefined)
    
    inline def setPostProcessUndefined: Self = StObject.set(x, "postProcess", js.undefined)
    
    inline def setPostProcessVarargs(value: String*): Self = StObject.set(x, "postProcess", js.Array(value :_*))
    
    inline def setPreload(value: `false` | js.Array[String]): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setPreloadVarargs(value: String*): Self = StObject.set(x, "preload", js.Array(value :_*))
    
    inline def setReact(value: ReactOptions): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
    
    inline def setReactUndefined: Self = StObject.set(x, "react", js.undefined)
    
    inline def setResources(value: Resource): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setReturnEmptyString(value: Boolean): Self = StObject.set(x, "returnEmptyString", value.asInstanceOf[js.Any])
    
    inline def setReturnEmptyStringUndefined: Self = StObject.set(x, "returnEmptyString", js.undefined)
    
    inline def setReturnNull(value: Boolean): Self = StObject.set(x, "returnNull", value.asInstanceOf[js.Any])
    
    inline def setReturnNullUndefined: Self = StObject.set(x, "returnNull", js.undefined)
    
    inline def setReturnObjects(value: Boolean): Self = StObject.set(x, "returnObjects", value.asInstanceOf[js.Any])
    
    inline def setReturnObjectsUndefined: Self = StObject.set(x, "returnObjects", js.undefined)
    
    inline def setReturnedObjectHandler(value: (/* key */ String, /* value */ String, /* options */ js.Any) => Unit): Self = StObject.set(x, "returnedObjectHandler", js.Any.fromFunction3(value))
    
    inline def setReturnedObjectHandlerUndefined: Self = StObject.set(x, "returnedObjectHandler", js.undefined)
    
    inline def setSaveMissing(value: Boolean): Self = StObject.set(x, "saveMissing", value.asInstanceOf[js.Any])
    
    inline def setSaveMissingTo(value: current | all | fallback): Self = StObject.set(x, "saveMissingTo", value.asInstanceOf[js.Any])
    
    inline def setSaveMissingToUndefined: Self = StObject.set(x, "saveMissingTo", js.undefined)
    
    inline def setSaveMissingUndefined: Self = StObject.set(x, "saveMissing", js.undefined)
    
    inline def setSimplifyPluralSuffix(value: Boolean): Self = StObject.set(x, "simplifyPluralSuffix", value.asInstanceOf[js.Any])
    
    inline def setSimplifyPluralSuffixUndefined: Self = StObject.set(x, "simplifyPluralSuffix", js.undefined)
    
    inline def setSupportedLngs(value: `false` | js.Array[String]): Self = StObject.set(x, "supportedLngs", value.asInstanceOf[js.Any])
    
    inline def setSupportedLngsUndefined: Self = StObject.set(x, "supportedLngs", js.undefined)
    
    inline def setSupportedLngsVarargs(value: String*): Self = StObject.set(x, "supportedLngs", js.Array(value :_*))
    
    inline def setUpdateMissing(value: Boolean): Self = StObject.set(x, "updateMissing", value.asInstanceOf[js.Any])
    
    inline def setUpdateMissingUndefined: Self = StObject.set(x, "updateMissing", js.undefined)
    
    inline def setWhitelist(value: `false` | js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
  }
}

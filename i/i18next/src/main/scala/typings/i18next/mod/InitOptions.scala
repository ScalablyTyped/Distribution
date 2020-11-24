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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitOptions extends js.Object {
  
  /**
    * Prefixes the namespace to the returned key when using `cimode`
    * @default false
    */
  var appendNamespaceToCIMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Appends namespace to missing key
    * @default false
    */
  var appendNamespaceToMissingKey: js.UndefOr[Boolean] = js.native
  
  /**
    * Options for backend - check documentation of plugin
    * @default undefined
    */
  var backend: js.UndefOr[js.Object] = js.native
  
  /**
    * Options for cache layer - check documentation of plugin
    * @default undefined
    */
  var cache: js.UndefOr[js.Object] = js.native
  
  /**
    * Language will be lowercased EN --> en while leaving full locales like en-US
    * @default false
    */
  var cleanCode: js.UndefOr[Boolean] = js.native
  
  /**
    * Compatibility JSON version
    * @default 'v3'
    */
  var compatibilityJSON: js.UndefOr[v1 | v2 | v3] = js.native
  
  /**
    * Char to split context from key
    * @default '_'
    */
  var contextSeparator: js.UndefOr[String] = js.native
  
  /**
    * Logs info level to console output. Helps finding issues with loading not working.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * Default namespace used if not passed to translation function
    * @default 'translation'
    */
  var defaultNS: js.UndefOr[String] = js.native
  
  /**
    * Options for language detection - check documentation of plugin
    * @default undefined
    */
  var detection: js.UndefOr[js.Object] = js.native
  
  /**
    * Options for https://github.com/locize/locize-editor
    * @default undefined
    */
  var editor: js.UndefOr[AutoOpen] = js.native
  
  /**
    * Language to use if translations in user language are not available.
    * @default 'dev'
    */
  var fallbackLng: js.UndefOr[`false` | FallbackLng] = js.native
  
  /**
    * String or array of namespaces to lookup key if not found in given namespace.
    * @default false
    */
  var fallbackNS: js.UndefOr[`false` | String | js.Array[String]] = js.native
  
  /**
    * Options for i18n message format - check documentation of plugin
    * @default undefined
    */
  var i18nFormat: js.UndefOr[js.Object] = js.native
  
  /**
    * Triggers resource loading in init function inside a setTimeout (default async behaviour).
    * Set it to false if your backend loads resources sync - that way calling i18next.t after
    * init is possible without relaying on the init callback.
    * @default true
    */
  var initImmediate: js.UndefOr[Boolean] = js.native
  
  /**
    * @see https://www.i18next.com/interpolation.html
    */
  var interpolation: js.UndefOr[InterpolationOptions] = js.native
  
  /**
    * Char, eg. '\n' that arrays will be joined by
    * @default false
    */
  var joinArrays: js.UndefOr[`false` | String] = js.native
  
  /**
    * Char to separate keys
    * @default '.'
    */
  var keySeparator: js.UndefOr[`false` | String] = js.native
  
  /**
    * Language to use (overrides language detection)
    * @default undefined
    */
  var lng: js.UndefOr[String] = js.native
  
  /**
    * Language codes to lookup, given set language is
    * 'en-US': 'all' --> ['en-US', 'en', 'dev'],
    * 'currentOnly' --> 'en-US',
    * 'languageOnly' --> 'en'
    * @default 'all'
    */
  var load: js.UndefOr[all | currentOnly | languageOnly] = js.native
  
  /**
    * Options for https://github.com/locize/locize-lastused
    * @default undefined
    */
  var locizeLastUsed: js.UndefOr[AllowedHosts] = js.native
  
  /**
    * Language will be lowercased eg. en-US --> en-us
    * @default false
    */
  var lowerCaseLng: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets called in case a interpolation value is undefined. This method will not be called if the value is empty string or null
    * @default noop
    */
  var missingInterpolationHandler: js.UndefOr[js.Function3[/* text */ String, /* value */ js.Any, /* options */ this.type, _]] = js.native
  
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
  ] = js.native
  
  /**
    * If true will pass eg. en-US if finding en in supportedLngs
    * @default false
    */
  var nonExplicitSupportedLngs: js.UndefOr[Boolean] = js.native
  
  /**
    * DEPRECTADED use nonExplicitSupportedLngs
    * @default false
    */
  var nonExplicitWhitelist: js.UndefOr[Boolean] = js.native
  
  /**
    * String or array of namespaces to load
    * @default 'translation'
    */
  var ns: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Char to split namespace from key
    * @default ':'
    */
  var nsSeparator: js.UndefOr[`false` | String] = js.native
  
  /**
    * Sets defaultValue
    * @default args => ({ defaultValue: args[1] })
    */
  var overloadTranslationOptionHandler: js.UndefOr[js.Function1[/* args */ js.Array[String], TOptions[StringMap]]] = js.native
  
  /**
    * Receives a key that was not found in `t()` and returns a value, that will be returned by `t()`
    * @default noop
    */
  var parseMissingKeyHandler: js.UndefOr[js.Function1[/* key */ String, _]] = js.native
  
  /**
    * Allow initializing with bundled resources while using a backend to load non bundled ones.
    * @default false
    */
  var partialBundledLanguages: js.UndefOr[Boolean] = js.native
  
  /**
    * Char to split plural from key
    * @default '_'
    */
  var pluralSeparator: js.UndefOr[String] = js.native
  
  /**
    * String or array of postProcessors to apply per default
    * @default false
    */
  var postProcess: js.UndefOr[`false` | String | js.Array[String]] = js.native
  
  /**
    * passthrough the resolved object including 'usedNS', 'usedLang' etc into options object of postprocessors as 'i18nResolved' property
    * @default false
    */
  var postProcessPassResolved: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of languages to preload. Important on server-side to assert translations are loaded before rendering views.
    * @default false
    */
  var preload: js.UndefOr[`false` | js.Array[String]] = js.native
  
  /**
    * Options for react - check documentation of plugin
    * @default undefined
    */
  var react: js.UndefOr[ReactOptions] = js.native
  
  /**
    * Resources to initialize with (if not using loading or not appending using addResourceBundle)
    * @default undefined
    */
  var resources: js.UndefOr[Resource] = js.native
  
  /**
    * Allows empty string as valid translation
    * @default true
    */
  var returnEmptyString: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows null values as valid translation
    * @default true
    */
  var returnNull: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows objects as valid translation result
    * @default false
    */
  var returnObjects: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets called if object was passed in as key but returnObjects was set to false
    * @default noop
    */
  var returnedObjectHandler: js.UndefOr[js.Function3[/* key */ String, /* value */ String, /* options */ js.Any, Unit]] = js.native
  
  /**
    * Calls save missing key function on backend if key not found
    * @default false
    */
  var saveMissing: js.UndefOr[Boolean] = js.native
  
  /**
    * @default 'fallback'
    */
  var saveMissingTo: js.UndefOr[current | all | fallback] = js.native
  
  /**
    * Will use 'plural' as suffix for languages only having 1 plural form, setting it to false will suffix all with numbers
    * @default true
    */
  var simplifyPluralSuffix: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of allowed languages
    * @default false
    */
  var supportedLngs: js.UndefOr[`false` | js.Array[String]] = js.native
  
  /**
    * Experimental: enable to update default values using the saveMissing
    * (Works only if defaultValue different from translated value.
    * Only useful on initial development or when keeping code as source of truth not changing values outside of code.
    * Only supported if backend supports it already)
    * @default false
    */
  var updateMissing: js.UndefOr[Boolean] = js.native
  
  /**
    * DEPRECATED use supportedLngs
    * @default false
    */
  var whitelist: js.UndefOr[`false` | js.Array[String]] = js.native
}
object InitOptions {
  
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    
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
    def setAppendNamespaceToCIMode(value: Boolean): Self = this.set("appendNamespaceToCIMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendNamespaceToCIMode: Self = this.set("appendNamespaceToCIMode", js.undefined)
    
    @scala.inline
    def setAppendNamespaceToMissingKey(value: Boolean): Self = this.set("appendNamespaceToMissingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendNamespaceToMissingKey: Self = this.set("appendNamespaceToMissingKey", js.undefined)
    
    @scala.inline
    def setBackend(value: js.Object): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackend: Self = this.set("backend", js.undefined)
    
    @scala.inline
    def setCache(value: js.Object): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCleanCode(value: Boolean): Self = this.set("cleanCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanCode: Self = this.set("cleanCode", js.undefined)
    
    @scala.inline
    def setCompatibilityJSON(value: v1 | v2 | v3): Self = this.set("compatibilityJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibilityJSON: Self = this.set("compatibilityJSON", js.undefined)
    
    @scala.inline
    def setContextSeparator(value: String): Self = this.set("contextSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextSeparator: Self = this.set("contextSeparator", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDefaultNS(value: String): Self = this.set("defaultNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultNS: Self = this.set("defaultNS", js.undefined)
    
    @scala.inline
    def setDetection(value: js.Object): Self = this.set("detection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetection: Self = this.set("detection", js.undefined)
    
    @scala.inline
    def setEditor(value: AutoOpen): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    
    @scala.inline
    def setFallbackLngVarargs(value: String*): Self = this.set("fallbackLng", js.Array(value :_*))
    
    @scala.inline
    def setFallbackLngFunction1(value: /* code */ String => String | js.Array[String] | FallbackLngObjList): Self = this.set("fallbackLng", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallbackLng(value: `false` | FallbackLng): Self = this.set("fallbackLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackLng: Self = this.set("fallbackLng", js.undefined)
    
    @scala.inline
    def setFallbackNSVarargs(value: String*): Self = this.set("fallbackNS", js.Array(value :_*))
    
    @scala.inline
    def setFallbackNS(value: `false` | String | js.Array[String]): Self = this.set("fallbackNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackNS: Self = this.set("fallbackNS", js.undefined)
    
    @scala.inline
    def setI18nFormat(value: js.Object): Self = this.set("i18nFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18nFormat: Self = this.set("i18nFormat", js.undefined)
    
    @scala.inline
    def setInitImmediate(value: Boolean): Self = this.set("initImmediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitImmediate: Self = this.set("initImmediate", js.undefined)
    
    @scala.inline
    def setInterpolation(value: InterpolationOptions): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    
    @scala.inline
    def setJoinArrays(value: `false` | String): Self = this.set("joinArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinArrays: Self = this.set("joinArrays", js.undefined)
    
    @scala.inline
    def setKeySeparator(value: `false` | String): Self = this.set("keySeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySeparator: Self = this.set("keySeparator", js.undefined)
    
    @scala.inline
    def setLng(value: String): Self = this.set("lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLng: Self = this.set("lng", js.undefined)
    
    @scala.inline
    def setLoad(value: all | currentOnly | languageOnly): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLocizeLastUsed(value: AllowedHosts): Self = this.set("locizeLastUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocizeLastUsed: Self = this.set("locizeLastUsed", js.undefined)
    
    @scala.inline
    def setLowerCaseLng(value: Boolean): Self = this.set("lowerCaseLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerCaseLng: Self = this.set("lowerCaseLng", js.undefined)
    
    @scala.inline
    def setMissingInterpolationHandler(value: (/* text */ String, /* value */ js.Any, InitOptions) => _): Self = this.set("missingInterpolationHandler", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMissingInterpolationHandler: Self = this.set("missingInterpolationHandler", js.undefined)
    
    @scala.inline
    def setMissingKeyHandlerFunction4(
      value: (/* lngs */ js.Array[String], /* ns */ String, /* key */ String, /* fallbackValue */ String) => Unit
    ): Self = this.set("missingKeyHandler", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMissingKeyHandler(
      value: `false` | (js.Function4[
          /* lngs */ js.Array[String], 
          /* ns */ String, 
          /* key */ String, 
          /* fallbackValue */ String, 
          Unit
        ])
    ): Self = this.set("missingKeyHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingKeyHandler: Self = this.set("missingKeyHandler", js.undefined)
    
    @scala.inline
    def setNonExplicitSupportedLngs(value: Boolean): Self = this.set("nonExplicitSupportedLngs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonExplicitSupportedLngs: Self = this.set("nonExplicitSupportedLngs", js.undefined)
    
    @scala.inline
    def setNonExplicitWhitelist(value: Boolean): Self = this.set("nonExplicitWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonExplicitWhitelist: Self = this.set("nonExplicitWhitelist", js.undefined)
    
    @scala.inline
    def setNsVarargs(value: String*): Self = this.set("ns", js.Array(value :_*))
    
    @scala.inline
    def setNs(value: String | js.Array[String]): Self = this.set("ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNs: Self = this.set("ns", js.undefined)
    
    @scala.inline
    def setNsSeparator(value: `false` | String): Self = this.set("nsSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNsSeparator: Self = this.set("nsSeparator", js.undefined)
    
    @scala.inline
    def setOverloadTranslationOptionHandler(value: /* args */ js.Array[String] => TOptions[StringMap]): Self = this.set("overloadTranslationOptionHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOverloadTranslationOptionHandler: Self = this.set("overloadTranslationOptionHandler", js.undefined)
    
    @scala.inline
    def setParseMissingKeyHandler(value: /* key */ String => _): Self = this.set("parseMissingKeyHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParseMissingKeyHandler: Self = this.set("parseMissingKeyHandler", js.undefined)
    
    @scala.inline
    def setPartialBundledLanguages(value: Boolean): Self = this.set("partialBundledLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialBundledLanguages: Self = this.set("partialBundledLanguages", js.undefined)
    
    @scala.inline
    def setPluralSeparator(value: String): Self = this.set("pluralSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluralSeparator: Self = this.set("pluralSeparator", js.undefined)
    
    @scala.inline
    def setPostProcessVarargs(value: String*): Self = this.set("postProcess", js.Array(value :_*))
    
    @scala.inline
    def setPostProcess(value: `false` | String | js.Array[String]): Self = this.set("postProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostProcess: Self = this.set("postProcess", js.undefined)
    
    @scala.inline
    def setPostProcessPassResolved(value: Boolean): Self = this.set("postProcessPassResolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostProcessPassResolved: Self = this.set("postProcessPassResolved", js.undefined)
    
    @scala.inline
    def setPreloadVarargs(value: String*): Self = this.set("preload", js.Array(value :_*))
    
    @scala.inline
    def setPreload(value: `false` | js.Array[String]): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setReact(value: ReactOptions): Self = this.set("react", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReact: Self = this.set("react", js.undefined)
    
    @scala.inline
    def setResources(value: Resource): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setReturnEmptyString(value: Boolean): Self = this.set("returnEmptyString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnEmptyString: Self = this.set("returnEmptyString", js.undefined)
    
    @scala.inline
    def setReturnNull(value: Boolean): Self = this.set("returnNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnNull: Self = this.set("returnNull", js.undefined)
    
    @scala.inline
    def setReturnObjects(value: Boolean): Self = this.set("returnObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnObjects: Self = this.set("returnObjects", js.undefined)
    
    @scala.inline
    def setReturnedObjectHandler(value: (/* key */ String, /* value */ String, /* options */ js.Any) => Unit): Self = this.set("returnedObjectHandler", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteReturnedObjectHandler: Self = this.set("returnedObjectHandler", js.undefined)
    
    @scala.inline
    def setSaveMissing(value: Boolean): Self = this.set("saveMissing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveMissing: Self = this.set("saveMissing", js.undefined)
    
    @scala.inline
    def setSaveMissingTo(value: current | all | fallback): Self = this.set("saveMissingTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveMissingTo: Self = this.set("saveMissingTo", js.undefined)
    
    @scala.inline
    def setSimplifyPluralSuffix(value: Boolean): Self = this.set("simplifyPluralSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimplifyPluralSuffix: Self = this.set("simplifyPluralSuffix", js.undefined)
    
    @scala.inline
    def setSupportedLngsVarargs(value: String*): Self = this.set("supportedLngs", js.Array(value :_*))
    
    @scala.inline
    def setSupportedLngs(value: `false` | js.Array[String]): Self = this.set("supportedLngs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedLngs: Self = this.set("supportedLngs", js.undefined)
    
    @scala.inline
    def setUpdateMissing(value: Boolean): Self = this.set("updateMissing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMissing: Self = this.set("updateMissing", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelist(value: `false` | js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
}

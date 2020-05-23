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
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
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
    js.Function3[/* text */ String, /* value */ js.Any, /* options */ InitOptions, _]
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
    * If true will pass eg. en-US if finding en in whitelist
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
  var parseMissingKeyHandler: js.UndefOr[js.Function1[/* key */ String, _]] = js.undefined
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
    * Experimental: enable to update default values using the saveMissing
    * (Works only if defaultValue different from translated value.
    * Only useful on initial development or when keeping code as source of truth not changing values outside of code.
    * Only supported if backend supports it already)
    * @default false
    */
  var updateMissing: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of allowed languages
    * @default false
    */
  var whitelist: js.UndefOr[`false` | js.Array[String]] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    appendNamespaceToCIMode: js.UndefOr[Boolean] = js.undefined,
    appendNamespaceToMissingKey: js.UndefOr[Boolean] = js.undefined,
    backend: js.Object = null,
    cache: js.Object = null,
    cleanCode: js.UndefOr[Boolean] = js.undefined,
    compatibilityJSON: v1 | v2 | v3 = null,
    contextSeparator: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    defaultNS: String = null,
    detection: js.Object = null,
    editor: AutoOpen = null,
    fallbackLng: `false` | FallbackLng = null,
    fallbackNS: `false` | String | js.Array[String] = null,
    i18nFormat: js.Object = null,
    initImmediate: js.UndefOr[Boolean] = js.undefined,
    interpolation: InterpolationOptions = null,
    joinArrays: `false` | String = null,
    keySeparator: `false` | String = null,
    lng: String = null,
    load: all | currentOnly | languageOnly = null,
    locizeLastUsed: AllowedHosts = null,
    lowerCaseLng: js.UndefOr[Boolean] = js.undefined,
    missingInterpolationHandler: (/* text */ String, /* value */ js.Any, /* options */ InitOptions) => _ = null,
    missingKeyHandler: `false` | (js.Function4[
      /* lngs */ js.Array[String], 
      /* ns */ String, 
      /* key */ String, 
      /* fallbackValue */ String, 
      Unit
    ]) = null,
    nonExplicitWhitelist: js.UndefOr[Boolean] = js.undefined,
    ns: String | js.Array[String] = null,
    nsSeparator: `false` | String = null,
    overloadTranslationOptionHandler: /* args */ js.Array[String] => TOptions[StringMap] = null,
    parseMissingKeyHandler: /* key */ String => _ = null,
    partialBundledLanguages: js.UndefOr[Boolean] = js.undefined,
    pluralSeparator: String = null,
    postProcess: `false` | String | js.Array[String] = null,
    postProcessPassResolved: js.UndefOr[Boolean] = js.undefined,
    preload: `false` | js.Array[String] = null,
    react: ReactOptions = null,
    resources: Resource = null,
    returnEmptyString: js.UndefOr[Boolean] = js.undefined,
    returnNull: js.UndefOr[Boolean] = js.undefined,
    returnObjects: js.UndefOr[Boolean] = js.undefined,
    returnedObjectHandler: (/* key */ String, /* value */ String, /* options */ js.Any) => Unit = null,
    saveMissing: js.UndefOr[Boolean] = js.undefined,
    saveMissingTo: current | all | fallback = null,
    simplifyPluralSuffix: js.UndefOr[Boolean] = js.undefined,
    updateMissing: js.UndefOr[Boolean] = js.undefined,
    whitelist: `false` | js.Array[String] = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appendNamespaceToCIMode)) __obj.updateDynamic("appendNamespaceToCIMode")(appendNamespaceToCIMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appendNamespaceToMissingKey)) __obj.updateDynamic("appendNamespaceToMissingKey")(appendNamespaceToMissingKey.get.asInstanceOf[js.Any])
    if (backend != null) __obj.updateDynamic("backend")(backend.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(cleanCode)) __obj.updateDynamic("cleanCode")(cleanCode.get.asInstanceOf[js.Any])
    if (compatibilityJSON != null) __obj.updateDynamic("compatibilityJSON")(compatibilityJSON.asInstanceOf[js.Any])
    if (contextSeparator != null) __obj.updateDynamic("contextSeparator")(contextSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (defaultNS != null) __obj.updateDynamic("defaultNS")(defaultNS.asInstanceOf[js.Any])
    if (detection != null) __obj.updateDynamic("detection")(detection.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (fallbackLng != null) __obj.updateDynamic("fallbackLng")(fallbackLng.asInstanceOf[js.Any])
    if (fallbackNS != null) __obj.updateDynamic("fallbackNS")(fallbackNS.asInstanceOf[js.Any])
    if (i18nFormat != null) __obj.updateDynamic("i18nFormat")(i18nFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(initImmediate)) __obj.updateDynamic("initImmediate")(initImmediate.get.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    if (joinArrays != null) __obj.updateDynamic("joinArrays")(joinArrays.asInstanceOf[js.Any])
    if (keySeparator != null) __obj.updateDynamic("keySeparator")(keySeparator.asInstanceOf[js.Any])
    if (lng != null) __obj.updateDynamic("lng")(lng.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (locizeLastUsed != null) __obj.updateDynamic("locizeLastUsed")(locizeLastUsed.asInstanceOf[js.Any])
    if (!js.isUndefined(lowerCaseLng)) __obj.updateDynamic("lowerCaseLng")(lowerCaseLng.get.asInstanceOf[js.Any])
    if (missingInterpolationHandler != null) __obj.updateDynamic("missingInterpolationHandler")(js.Any.fromFunction3(missingInterpolationHandler))
    if (missingKeyHandler != null) __obj.updateDynamic("missingKeyHandler")(missingKeyHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(nonExplicitWhitelist)) __obj.updateDynamic("nonExplicitWhitelist")(nonExplicitWhitelist.get.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (nsSeparator != null) __obj.updateDynamic("nsSeparator")(nsSeparator.asInstanceOf[js.Any])
    if (overloadTranslationOptionHandler != null) __obj.updateDynamic("overloadTranslationOptionHandler")(js.Any.fromFunction1(overloadTranslationOptionHandler))
    if (parseMissingKeyHandler != null) __obj.updateDynamic("parseMissingKeyHandler")(js.Any.fromFunction1(parseMissingKeyHandler))
    if (!js.isUndefined(partialBundledLanguages)) __obj.updateDynamic("partialBundledLanguages")(partialBundledLanguages.get.asInstanceOf[js.Any])
    if (pluralSeparator != null) __obj.updateDynamic("pluralSeparator")(pluralSeparator.asInstanceOf[js.Any])
    if (postProcess != null) __obj.updateDynamic("postProcess")(postProcess.asInstanceOf[js.Any])
    if (!js.isUndefined(postProcessPassResolved)) __obj.updateDynamic("postProcessPassResolved")(postProcessPassResolved.get.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (react != null) __obj.updateDynamic("react")(react.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (!js.isUndefined(returnEmptyString)) __obj.updateDynamic("returnEmptyString")(returnEmptyString.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnNull)) __obj.updateDynamic("returnNull")(returnNull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnObjects)) __obj.updateDynamic("returnObjects")(returnObjects.get.asInstanceOf[js.Any])
    if (returnedObjectHandler != null) __obj.updateDynamic("returnedObjectHandler")(js.Any.fromFunction3(returnedObjectHandler))
    if (!js.isUndefined(saveMissing)) __obj.updateDynamic("saveMissing")(saveMissing.get.asInstanceOf[js.Any])
    if (saveMissingTo != null) __obj.updateDynamic("saveMissingTo")(saveMissingTo.asInstanceOf[js.Any])
    if (!js.isUndefined(simplifyPluralSuffix)) __obj.updateDynamic("simplifyPluralSuffix")(simplifyPluralSuffix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateMissing)) __obj.updateDynamic("updateMissing")(updateMissing.get.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}


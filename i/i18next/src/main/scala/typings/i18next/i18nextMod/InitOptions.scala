package typings.i18next.i18nextMod

import typings.i18next.i18nextNumbers.`false`
import typings.i18next.i18nextStrings.all
import typings.i18next.i18nextStrings.current
import typings.i18next.i18nextStrings.currentOnly
import typings.i18next.i18nextStrings.fallback
import typings.i18next.i18nextStrings.languageOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  /**
    * prefixes the namespace to the returned key when using cimode
    * @default false
    */
  var appendNamespaceToCIMode: js.UndefOr[Boolean] = js.undefined
  /**
    * appends namespace to missing key
    * @default false
    */
  var appendNamespaceToMissingKey: js.UndefOr[Boolean] = js.undefined
  /**
    * options for backend - check documentation of plugin
    * @default undefined
    */
  var backend: js.UndefOr[BackendPluginOptions] = js.undefined
  /**
    * options for cache layer - check documentation of plugin
    * @default undefined
    */
  var cache: js.UndefOr[CachePluginOptions] = js.undefined
  /**
    * Compatibility JSON version
    */
  var compatibilityJSON: js.UndefOr[String] = js.undefined
  /**
    * char to split context from key
    * @default '_'
    */
  var contextSeparator: js.UndefOr[String] = js.undefined
  /**
    * logs info level to console output. Helps finding issues with loading not working.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * default namespace used if not passed to translation function
    * @default 'translation'
    */
  var defaultNS: js.UndefOr[String] = js.undefined
  /**
    * options for language detection - check documentation of plugin
    * @default undefined
    */
  var detection: js.UndefOr[DetectionPluginOptions] = js.undefined
  /**
    * language to use if translations in user language are not available.
    * @default 'dev'
    */
  var fallbackLng: js.UndefOr[`false` | FallbackLng] = js.undefined
  /**
    * string or array of namespaces to lookup key if not found in given namespace.
    * @default false
    */
  var fallbackNS: js.UndefOr[`false` | String | js.Array[String]] = js.undefined
  /**
    * options for i18n nessage format - check documentation of plugin
    * @default undefined
    */
  var i18nFormat: js.UndefOr[js.Object] = js.undefined
  /**
    * triggers resource loading in init function inside a setTimeout (default async behaviour).
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
    * char, eg. '\n' that arrays will be joined by
    * @default false
    */
  var joinArrays: js.UndefOr[`false` | String] = js.undefined
  /**
    * char to separate keys
    * @default '.'
    */
  var keySeparator: js.UndefOr[`false` | String] = js.undefined
  /**
    * language to use (overrides language detection)
    * @default undefined
    */
  var lng: js.UndefOr[String] = js.undefined
  /**
    * language codes to lookup, given set language is
    * 'en-US': 'all' --> ['en-US', 'en', 'dev'],
    * 'currentOnly' --> 'en-US',
    * 'languageOnly' --> 'en'
    * @default 'all'
    */
  var load: js.UndefOr[all | currentOnly | languageOnly] = js.undefined
  /**
    * language will be lowercased eg. en-US --> en-us
    * @default false
    */
  var lowerCaseLng: js.UndefOr[Boolean] = js.undefined
  /**
    * gets called in case a interpolation value is undefined. This method will not be called if the value is empty string or null
    * @default noop
    */
  var missingInterpolationHandler: js.UndefOr[js.Function2[/* text */ String, /* value */ js.Any, _]] = js.undefined
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
    * if true will pass eg. en-US if finding en in whitelist
    * @default false
    */
  var nonExplicitWhitelist: js.UndefOr[Boolean] = js.undefined
  /**
    * string or array of namespaces to load
    * @default 'translation'
    */
  var ns: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * char to split namespace from key
    * @default ':'
    */
  var nsSeparator: js.UndefOr[`false` | String] = js.undefined
  /**
    * default: sets defaultValue
    * @default args => ({ defaultValue: args[1] })
    */
  var overloadTranslationOptionHandler: js.UndefOr[js.Function1[/* args */ js.Array[String], TranslationOptions[js.Object]]] = js.undefined
  /**
    * receives a key that was not found in `t()` and returns a value, that will be returned by `t()`
    * @default noop
    */
  var parseMissingKeyHandler: js.UndefOr[js.Function1[/* key */ String, _]] = js.undefined
  /**
    * Allow initializing with bundled resources while using a backend to load non bundled ones.
    * @default false
    */
  var partialBundledLanguages: js.UndefOr[Boolean] = js.undefined
  /**
    * char to split plural from key
    * @default '_'
    */
  var pluralSeparator: js.UndefOr[String] = js.undefined
  /**
    * string or array of postProcessors to apply per default
    * @default false
    */
  var postProcess: js.UndefOr[`false` | String | js.Array[String]] = js.undefined
  /**
    * array of languages to preload. Important on serverside to assert translations are loaded before rendering views.
    * @default false
    */
  var preload: js.UndefOr[`false` | js.Array[String]] = js.undefined
  /**
    * options for react - check documentation of plugin
    * @default undefined
    */
  var react: js.UndefOr[ReactOptions] = js.undefined
  /**
    * resources to initialize with (if not using loading or not appending using addResourceBundle)
    * @default undefined
    */
  var resources: js.UndefOr[Resource] = js.undefined
  /**
    * allows empty string as valid translation
    * @default true
    */
  var returnEmptyString: js.UndefOr[Boolean] = js.undefined
  /**
    * allows null values as valid translation
    * @default true
    */
  var returnNull: js.UndefOr[Boolean] = js.undefined
  /**
    * allows objects as valid translation result
    * @default false
    */
  var returnObjects: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets called if object was passed in as key but returnObjects was set to false
    * @default noop
    */
  var returnedObjectHandler: js.UndefOr[js.Function3[/* key */ String, /* value */ String, /* options */ js.Any, Unit]] = js.undefined
  /**
    * calls save missing key function on backend if key not found
    * @default false
    */
  var saveMissing: js.UndefOr[Boolean] = js.undefined
  /**
    * @default 'fallback'
    */
  var saveMissingTo: js.UndefOr[current | all | fallback] = js.undefined
  /**
    * will use 'plural' as suffix for languages only having 1 plural form, setting it to false will suffix all with numbers
    * @default true
    */
  var simplifyPluralSuffix: js.UndefOr[Boolean] = js.undefined
  /**
    * experimental: enable to update default values using the saveMissing
    * (Works only if defaultValue different from translated value.
    * Only useful on initial development or when keeping code as source of truth not changing values outside of code.
    * Only supported if backend supports it already)
    * @default false
    */
  var updateMissing: js.UndefOr[Boolean] = js.undefined
  /**
    * 	array of allowed languages
    * @default false
    */
  var whitelist: js.UndefOr[`false` | js.Array[String]] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    appendNamespaceToCIMode: js.UndefOr[Boolean] = js.undefined,
    appendNamespaceToMissingKey: js.UndefOr[Boolean] = js.undefined,
    backend: BackendPluginOptions = null,
    cache: CachePluginOptions = null,
    compatibilityJSON: String = null,
    contextSeparator: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    defaultNS: String = null,
    detection: DetectionPluginOptions = null,
    fallbackLng: `false` | FallbackLng = null,
    fallbackNS: `false` | String | js.Array[String] = null,
    i18nFormat: js.Object = null,
    initImmediate: js.UndefOr[Boolean] = js.undefined,
    interpolation: InterpolationOptions = null,
    joinArrays: `false` | String = null,
    keySeparator: `false` | String = null,
    lng: String = null,
    load: all | currentOnly | languageOnly = null,
    lowerCaseLng: js.UndefOr[Boolean] = js.undefined,
    missingInterpolationHandler: (/* text */ String, /* value */ js.Any) => _ = null,
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
    overloadTranslationOptionHandler: /* args */ js.Array[String] => TranslationOptions[js.Object] = null,
    parseMissingKeyHandler: /* key */ String => _ = null,
    partialBundledLanguages: js.UndefOr[Boolean] = js.undefined,
    pluralSeparator: String = null,
    postProcess: `false` | String | js.Array[String] = null,
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
    if (!js.isUndefined(appendNamespaceToCIMode)) __obj.updateDynamic("appendNamespaceToCIMode")(appendNamespaceToCIMode)
    if (!js.isUndefined(appendNamespaceToMissingKey)) __obj.updateDynamic("appendNamespaceToMissingKey")(appendNamespaceToMissingKey)
    if (backend != null) __obj.updateDynamic("backend")(backend)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (compatibilityJSON != null) __obj.updateDynamic("compatibilityJSON")(compatibilityJSON)
    if (contextSeparator != null) __obj.updateDynamic("contextSeparator")(contextSeparator)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (defaultNS != null) __obj.updateDynamic("defaultNS")(defaultNS)
    if (detection != null) __obj.updateDynamic("detection")(detection)
    if (fallbackLng != null) __obj.updateDynamic("fallbackLng")(fallbackLng.asInstanceOf[js.Any])
    if (fallbackNS != null) __obj.updateDynamic("fallbackNS")(fallbackNS.asInstanceOf[js.Any])
    if (i18nFormat != null) __obj.updateDynamic("i18nFormat")(i18nFormat)
    if (!js.isUndefined(initImmediate)) __obj.updateDynamic("initImmediate")(initImmediate)
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    if (joinArrays != null) __obj.updateDynamic("joinArrays")(joinArrays.asInstanceOf[js.Any])
    if (keySeparator != null) __obj.updateDynamic("keySeparator")(keySeparator.asInstanceOf[js.Any])
    if (lng != null) __obj.updateDynamic("lng")(lng)
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (!js.isUndefined(lowerCaseLng)) __obj.updateDynamic("lowerCaseLng")(lowerCaseLng)
    if (missingInterpolationHandler != null) __obj.updateDynamic("missingInterpolationHandler")(js.Any.fromFunction2(missingInterpolationHandler))
    if (missingKeyHandler != null) __obj.updateDynamic("missingKeyHandler")(missingKeyHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(nonExplicitWhitelist)) __obj.updateDynamic("nonExplicitWhitelist")(nonExplicitWhitelist)
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (nsSeparator != null) __obj.updateDynamic("nsSeparator")(nsSeparator.asInstanceOf[js.Any])
    if (overloadTranslationOptionHandler != null) __obj.updateDynamic("overloadTranslationOptionHandler")(js.Any.fromFunction1(overloadTranslationOptionHandler))
    if (parseMissingKeyHandler != null) __obj.updateDynamic("parseMissingKeyHandler")(js.Any.fromFunction1(parseMissingKeyHandler))
    if (!js.isUndefined(partialBundledLanguages)) __obj.updateDynamic("partialBundledLanguages")(partialBundledLanguages)
    if (pluralSeparator != null) __obj.updateDynamic("pluralSeparator")(pluralSeparator)
    if (postProcess != null) __obj.updateDynamic("postProcess")(postProcess.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (react != null) __obj.updateDynamic("react")(react)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (!js.isUndefined(returnEmptyString)) __obj.updateDynamic("returnEmptyString")(returnEmptyString)
    if (!js.isUndefined(returnNull)) __obj.updateDynamic("returnNull")(returnNull)
    if (!js.isUndefined(returnObjects)) __obj.updateDynamic("returnObjects")(returnObjects)
    if (returnedObjectHandler != null) __obj.updateDynamic("returnedObjectHandler")(js.Any.fromFunction3(returnedObjectHandler))
    if (!js.isUndefined(saveMissing)) __obj.updateDynamic("saveMissing")(saveMissing)
    if (saveMissingTo != null) __obj.updateDynamic("saveMissingTo")(saveMissingTo.asInstanceOf[js.Any])
    if (!js.isUndefined(simplifyPluralSuffix)) __obj.updateDynamic("simplifyPluralSuffix")(simplifyPluralSuffix)
    if (!js.isUndefined(updateMissing)) __obj.updateDynamic("updateMissing")(updateMissing)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}


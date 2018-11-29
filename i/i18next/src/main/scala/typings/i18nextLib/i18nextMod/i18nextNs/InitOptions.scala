package typings
package i18nextLib.i18nextMod.i18nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InitOptions extends js.Object {
  /**
           * prefixes the namespace to the returned key when using cimode
           * @default false
           */
  var appendNamespaceToCIMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * appends namespace to missing key
           * @default false
           */
  var appendNamespaceToMissingKey: js.UndefOr[scala.Boolean] = js.undefined
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
  var compatibilityJSON: js.UndefOr[java.lang.String] = js.undefined
  /**
           * char to split context from key
           * @default '_'
           */
  var contextSeparator: js.UndefOr[java.lang.String] = js.undefined
  /**
           * logs info level to console output. Helps finding issues with loading not working.
           * @default false
           */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * default namespace used if not passed to translation function
           * @default 'translation'
           */
  var defaultNS: js.UndefOr[java.lang.String] = js.undefined
  /**
           * options for language detection - check documentation of plugin
           * @default undefined
           */
  var detection: js.UndefOr[DetectionPluginOptions] = js.undefined
  /**
           * language to use if translations in user language are not available.
           * @default 'dev'
           */
  var fallbackLng: js.UndefOr[i18nextLib.i18nextLibNumbers.`false` | FallbackLng] = js.undefined
  /**
           * string or array of namespaces to lookup key if not found in given namespace.
           * @default false
           */
  var fallbackNS: js.UndefOr[
    i18nextLib.i18nextLibNumbers.`false` | java.lang.String | js.Array[java.lang.String]
  ] = js.undefined
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
  var initImmediate: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * @see https://www.i18next.com/interpolation.html
           */
  var interpolation: js.UndefOr[InterpolationOptions] = js.undefined
  /**
           * char, eg. '\n' that arrays will be joined by
           * @default false
           */
  var joinArrays: js.UndefOr[i18nextLib.i18nextLibNumbers.`false` | java.lang.String] = js.undefined
  /**
           * char to separate keys
           * @default '.'
           */
  var keySeparator: js.UndefOr[i18nextLib.i18nextLibNumbers.`false` | java.lang.String] = js.undefined
  /**
           * language to use (overrides language detection)
           * @default undefined
           */
  var lng: js.UndefOr[java.lang.String] = js.undefined
  /**
           * language codes to lookup, given set language is
           * 'en-US': 'all' --> ['en-US', 'en', 'dev'],
           * 'currentOnly' --> 'en-US',
           * 'languageOnly' --> 'en'
           * @default 'all'
           */
  var load: js.UndefOr[
    i18nextLib.i18nextLibStrings.all | i18nextLib.i18nextLibStrings.currentOnly | i18nextLib.i18nextLibStrings.languageOnly
  ] = js.undefined
  /**
           * language will be lowercased eg. en-US --> en-us
           * @default false
           */
  var lowerCaseLng: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * gets called in case a interpolation value is undefined. This method will not be called if the value is empty string or null
           * @default noop
           */
  var missingInterpolationHandler: js.UndefOr[js.Function2[/* text */ java.lang.String, /* value */ js.Any, _]] = js.undefined
  /**
           * Used for custom missing key handling (needs saveMissing set to true!)
           * @default false
           */
  var missingKeyHandler: js.UndefOr[
    i18nextLib.i18nextLibNumbers.`false` | (js.Function4[
      /* lngs */ js.Array[java.lang.String], 
      /* ns */ java.lang.String, 
      /* key */ java.lang.String, 
      /* fallbackValue */ java.lang.String, 
      scala.Unit
    ])
  ] = js.undefined
  /**
           * if true will pass eg. en-US if finding en in whitelist
           * @default false
           */
  var nonExplicitWhitelist: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * string or array of namespaces to load
           * @default 'translation'
           */
  var ns: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
           * char to split namespace from key
           * @default ':'
           */
  var nsSeparator: js.UndefOr[i18nextLib.i18nextLibNumbers.`false` | java.lang.String] = js.undefined
  /**
           * default: sets defaultValue
           * @default args => ({ defaultValue: args[1] })
           */
  var overloadTranslationOptionHandler: js.UndefOr[
    js.Function1[/* args */ js.Array[java.lang.String], TranslationOptions[js.Object]]
  ] = js.undefined
  /**
           * receives a key that was not found in `t()` and returns a value, that will be returned by `t()`
           * @default noop
           */
  var parseMissingKeyHandler: js.UndefOr[js.Function1[/* key */ java.lang.String, _]] = js.undefined
  /**
           * Allow initializing with bundled resources while using a backend to load non bundled ones.
           * @default false
           */
  var partialBundledLanguages: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * char to split plural from key
           * @default '_'
           */
  var pluralSeparator: js.UndefOr[java.lang.String] = js.undefined
  /**
           * string or array of postProcessors to apply per default
           * @default false
           */
  var postProcess: js.UndefOr[
    i18nextLib.i18nextLibNumbers.`false` | java.lang.String | js.Array[java.lang.String]
  ] = js.undefined
  /**
           * array of languages to preload. Important on serverside to assert translations are loaded before rendering views.
           * @default false
           */
  var preload: js.UndefOr[i18nextLib.i18nextLibNumbers.`false` | js.Array[java.lang.String]] = js.undefined
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
  var returnEmptyString: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * allows null values as valid translation
           * @default true
           */
  var returnNull: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * allows objects as valid translation result
           * @default false
           */
  var returnObjects: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Gets called if object was passed in as key but returnObjects was set to false
           * @default noop
           */
  var returnedObjectHandler: js.UndefOr[
    js.Function3[
      /* key */ java.lang.String, 
      /* value */ java.lang.String, 
      /* options */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  /**
           * calls save missing key function on backend if key not found
           * @default false
           */
  var saveMissing: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * @default 'fallback'
           */
  var saveMissingTo: js.UndefOr[
    i18nextLib.i18nextLibStrings.current | i18nextLib.i18nextLibStrings.all | i18nextLib.i18nextLibStrings.fallback
  ] = js.undefined
  /**
           * will use 'plural' as suffix for languages only having 1 plural form, setting it to false will suffix all with numbers
           * @default true
           */
  var simplifyPluralSuffix: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * experimental: enable to update default values using the saveMissing
           * (Works only if defaultValue different from translated value.
           * Only useful on initial development or when keeping code as source of truth not changing values outside of code.
           * Only supported if backend supports it already)
           * @default false
           */
  var updateMissing: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * 	array of allowed languages
           * @default false
           */
  var whitelist: js.UndefOr[i18nextLib.i18nextLibNumbers.`false` | js.Array[java.lang.String]] = js.undefined
}


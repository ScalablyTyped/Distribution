package typings
package i18nLib.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationOptions extends js.Object {
  /**
    * Hash to specify different aliases for i18n's internal methods to apply on the request/response objects (method -> alias).
    * Note that this will *not* overwrite existing properties with the same name.
    * @default undefined
    */
  var api: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Watch for changes in json files to reload locale on updates
    * @default false
    */
  var autoReload: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets a custom cookie name to parse locale settings from
    * @default null
    */
  var cookie: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Alter a site wide default locale
    * @default "en"
    */
  var defaultLocale: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Where to store json files, relative to modules directory
    * @default "./locales"
    */
  var directory: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Control mode on directory creation. Setting has no effect on win.
    * @default null
    */
  var directoryPermissions: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Setting extension of json files (you might want to set this to '.js' according to webtranslateit)
    * @default ".json"
    */
  var extension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Language fallback map
    * @default {}
    */
  var fallbacks: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * What to use as the indentation unit
    * @default "\t"
    */
  var indent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Setup some locales - other locales default to en silently
    * @default []
    */
  var locales: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Setting of log level DEBUG
    * @default require("debug")("i18n:debug")
    */
  var logDebugFn: js.UndefOr[js.Function1[/* msg */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Setting of log level ERROR
    * @default require("debug")("i18n:error")
    */
  var logErrorFn: js.UndefOr[js.Function1[/* msg */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Setting of log level WARN
    * @default require("debug")("i18n:warn")
    */
  var logWarnFn: js.UndefOr[js.Function1[/* msg */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Enable object notation
    * @default false
    */
  var objectNotation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Setting prefix of json files name (in case you use different locale files naming scheme (webapp-en.json), rather then just en.json)
    * @default ""
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Downcase locale when passed on queryParam; e.g. lang=en-US becomes en-us.
    * When set to false, the queryParam value will be used as passed; e.g. lang=en-US remains en-US.
    * @default true
    */
  var preserveLegacyCase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Query parameter to switch locale (ie. /home?lang=ch)
    * @default null
    */
  var queryParameter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * object or [obj1, obj2] to bind the i18n api and current locale to
    * @default null
    */
  var register: js.UndefOr[js.Any] = js.undefined
  /**
    * Sync locale information across all files
    * @default false
    */
  var syncFiles: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to write new locale information to disk
    * @default true
    */
  var updateFiles: js.UndefOr[scala.Boolean] = js.undefined
}

object ConfigurationOptions {
  @scala.inline
  def apply(
    api: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    autoReload: js.UndefOr[scala.Boolean] = js.undefined,
    cookie: java.lang.String = null,
    defaultLocale: java.lang.String = null,
    directory: java.lang.String = null,
    directoryPermissions: java.lang.String = null,
    extension: java.lang.String = null,
    fallbacks: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    indent: java.lang.String = null,
    locales: js.Array[java.lang.String] = null,
    logDebugFn: js.Function1[/* msg */ java.lang.String, scala.Unit] = null,
    logErrorFn: js.Function1[/* msg */ java.lang.String, scala.Unit] = null,
    logWarnFn: js.Function1[/* msg */ java.lang.String, scala.Unit] = null,
    objectNotation: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: java.lang.String = null,
    preserveLegacyCase: js.UndefOr[scala.Boolean] = js.undefined,
    queryParameter: java.lang.String = null,
    register: js.Any = null,
    syncFiles: js.UndefOr[scala.Boolean] = js.undefined,
    updateFiles: js.UndefOr[scala.Boolean] = js.undefined
  ): ConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    if (api != null) __obj.updateDynamic("api")(api)
    if (!js.isUndefined(autoReload)) __obj.updateDynamic("autoReload")(autoReload)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale)
    if (directory != null) __obj.updateDynamic("directory")(directory)
    if (directoryPermissions != null) __obj.updateDynamic("directoryPermissions")(directoryPermissions)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fallbacks != null) __obj.updateDynamic("fallbacks")(fallbacks)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (locales != null) __obj.updateDynamic("locales")(locales)
    if (logDebugFn != null) __obj.updateDynamic("logDebugFn")(logDebugFn)
    if (logErrorFn != null) __obj.updateDynamic("logErrorFn")(logErrorFn)
    if (logWarnFn != null) __obj.updateDynamic("logWarnFn")(logWarnFn)
    if (!js.isUndefined(objectNotation)) __obj.updateDynamic("objectNotation")(objectNotation)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(preserveLegacyCase)) __obj.updateDynamic("preserveLegacyCase")(preserveLegacyCase)
    if (queryParameter != null) __obj.updateDynamic("queryParameter")(queryParameter)
    if (register != null) __obj.updateDynamic("register")(register)
    if (!js.isUndefined(syncFiles)) __obj.updateDynamic("syncFiles")(syncFiles)
    if (!js.isUndefined(updateFiles)) __obj.updateDynamic("updateFiles")(updateFiles)
    __obj.asInstanceOf[ConfigurationOptions]
  }
}


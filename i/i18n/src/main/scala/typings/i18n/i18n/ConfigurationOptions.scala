package typings.i18n.i18n

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationOptions extends js.Object {
  /**
    * Hash to specify different aliases for i18n's internal methods to apply on the request/response objects (method -> alias).
    * Note that this will *not* overwrite existing properties with the same name.
    * @default undefined
    */
  var api: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Watch for changes in json files to reload locale on updates
    * @default false
    */
  var autoReload: js.UndefOr[Boolean] = js.native
  /**
    * Sets a custom cookie name to parse locale settings from
    * @default null
    */
  var cookie: js.UndefOr[String] = js.native
  /**
    * Alter a site wide default locale
    * @default "en"
    */
  var defaultLocale: js.UndefOr[String] = js.native
  /**
    * Where to store json files, relative to modules directory
    * @default "./locales"
    */
  var directory: js.UndefOr[String] = js.native
  /**
    * Control mode on directory creation. Setting has no effect on win.
    * @default null
    */
  var directoryPermissions: js.UndefOr[String] = js.native
  /**
    * Setting extension of json files (you might want to set this to '.js' according to webtranslateit)
    * @default ".json"
    */
  var extension: js.UndefOr[String] = js.native
  /**
    * Language fallback map
    * @default {}
    */
  var fallbacks: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * What to use as the indentation unit
    * @default "\t"
    */
  var indent: js.UndefOr[String] = js.native
  /**
    * Setup some locales - other locales default to en silently
    * @default []
    */
  var locales: js.UndefOr[js.Array[String]] = js.native
  /**
    * Setting of log level DEBUG
    * @default require("debug")("i18n:debug")
    */
  var logDebugFn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  /**
    * Setting of log level ERROR
    * @default require("debug")("i18n:error")
    */
  var logErrorFn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  /**
    * Setting of log level WARN
    * @default require("debug")("i18n:warn")
    */
  var logWarnFn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  /**
    * Enable object notation
    * @default false
    */
  var objectNotation: js.UndefOr[Boolean] = js.native
  /**
    * Setting prefix of json files name (in case you use different locale files naming scheme (webapp-en.json), rather then just en.json)
    * @default ""
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Downcase locale when passed on queryParam; e.g. lang=en-US becomes en-us.
    * When set to false, the queryParam value will be used as passed; e.g. lang=en-US remains en-US.
    * @default true
    */
  var preserveLegacyCase: js.UndefOr[Boolean] = js.native
  /**
    * Query parameter to switch locale (ie. /home?lang=ch)
    * @default null
    */
  var queryParameter: js.UndefOr[String] = js.native
  /**
    * object or [obj1, obj2] to bind the i18n api and current locale to
    * @default null
    */
  var register: js.UndefOr[js.Any] = js.native
  /**
    * Sync locale information across all files
    * @default false
    */
  var syncFiles: js.UndefOr[Boolean] = js.native
  /**
    * Whether to write new locale information to disk
    * @default true
    */
  var updateFiles: js.UndefOr[Boolean] = js.native
}

object ConfigurationOptions {
  @scala.inline
  def apply(): ConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptions]
  }
  @scala.inline
  implicit class ConfigurationOptionsOps[Self <: ConfigurationOptions] (val x: Self) extends AnyVal {
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
    def setApi(value: StringDictionary[String]): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    @scala.inline
    def setAutoReload(value: Boolean): Self = this.set("autoReload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoReload: Self = this.set("autoReload", js.undefined)
    @scala.inline
    def setCookie(value: String): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    @scala.inline
    def setDefaultLocale(value: String): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLocale: Self = this.set("defaultLocale", js.undefined)
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    @scala.inline
    def setDirectoryPermissions(value: String): Self = this.set("directoryPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryPermissions: Self = this.set("directoryPermissions", js.undefined)
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setFallbacks(value: StringDictionary[String]): Self = this.set("fallbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallbacks: Self = this.set("fallbacks", js.undefined)
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setLocalesVarargs(value: String*): Self = this.set("locales", js.Array(value :_*))
    @scala.inline
    def setLocales(value: js.Array[String]): Self = this.set("locales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    @scala.inline
    def setLogDebugFn(value: /* msg */ String => Unit): Self = this.set("logDebugFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLogDebugFn: Self = this.set("logDebugFn", js.undefined)
    @scala.inline
    def setLogErrorFn(value: /* msg */ String => Unit): Self = this.set("logErrorFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLogErrorFn: Self = this.set("logErrorFn", js.undefined)
    @scala.inline
    def setLogWarnFn(value: /* msg */ String => Unit): Self = this.set("logWarnFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLogWarnFn: Self = this.set("logWarnFn", js.undefined)
    @scala.inline
    def setObjectNotation(value: Boolean): Self = this.set("objectNotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectNotation: Self = this.set("objectNotation", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPreserveLegacyCase(value: Boolean): Self = this.set("preserveLegacyCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveLegacyCase: Self = this.set("preserveLegacyCase", js.undefined)
    @scala.inline
    def setQueryParameter(value: String): Self = this.set("queryParameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParameter: Self = this.set("queryParameter", js.undefined)
    @scala.inline
    def setRegister(value: js.Any): Self = this.set("register", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegister: Self = this.set("register", js.undefined)
    @scala.inline
    def setSyncFiles(value: Boolean): Self = this.set("syncFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncFiles: Self = this.set("syncFiles", js.undefined)
    @scala.inline
    def setUpdateFiles(value: Boolean): Self = this.set("updateFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateFiles: Self = this.set("updateFiles", js.undefined)
  }
  
}


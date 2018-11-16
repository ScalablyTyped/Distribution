package typings
package i18nextLib.i18nextMod.i18nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait i18n extends js.Object {
  /**
           * Uses the same resolve functionality as the t function and returns true if a key exists.
           */
  @JSName("exists")
  var exists_Original: TranslationFunction[scala.Boolean, js.Object, java.lang.String] = js.native
  /**
           * Exposes interpolation.format function added on init.
           */
  @JSName("format")
  var format_Original: FormatFunction = js.native
  /**
           * Is initialized
           */
  var isInitialized: scala.Boolean = js.native
  /**
           * Is set to the current detected or set language.
           * If you need the primary used language depending on your configuration (whilelist, load) you will prefer using i18next.languages[0].
           */
  var language: java.lang.String = js.native
  /**
           * Is set to an array of language-codes that will be used it order to lookup the translation value.
           */
  var languages: js.Array[java.lang.String] = js.native
  /**
           * Current options
           */
  var options: InitOptions = js.native
  /**
           * Internal container for all used plugins and implmentation details like languageUtils, pluralResolvers, etc.
           */
  var services: Services = js.native
  /**
           * Please have a look at the translation functions like interpolation, formatting and plurals for more details on using it.
           */
  @JSName("t")
  var t_Original: TranslationFunction[_, js.Object, java.lang.String] = js.native
  /**
           * Adds one key/value.
           */
  def addResource(lng: java.lang.String, ns: java.lang.String, key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
           * Adds one key/value.
           */
  def addResource(
    lng: java.lang.String,
    ns: java.lang.String,
    key: java.lang.String,
    value: java.lang.String,
    options: i18nextLib.Anon_Silent
  ): scala.Unit = js.native
  /**
           * Adds a complete bundle.
           * Setting deep param to true will extend existing translations in that file.
           * Setting overwrite to true it will overwrite existing translations in that file.
           */
  def addResourceBundle(lng: java.lang.String, ns: java.lang.String, resources: js.Any): scala.Unit = js.native
  /**
           * Adds a complete bundle.
           * Setting deep param to true will extend existing translations in that file.
           * Setting overwrite to true it will overwrite existing translations in that file.
           */
  def addResourceBundle(lng: java.lang.String, ns: java.lang.String, resources: js.Any, deep: scala.Boolean): scala.Unit = js.native
  /**
           * Adds a complete bundle.
           * Setting deep param to true will extend existing translations in that file.
           * Setting overwrite to true it will overwrite existing translations in that file.
           */
  def addResourceBundle(
    lng: java.lang.String,
    ns: java.lang.String,
    resources: js.Any,
    deep: scala.Boolean,
    overwrite: scala.Boolean
  ): scala.Unit = js.native
  /**
           * Adds multiple key/values.
           */
  def addResources(lng: java.lang.String, ns: java.lang.String, resources: js.Any): scala.Unit = js.native
  /**
           * Changes the language. The callback will be called as soon translations were loaded or an error occurs while loading.
           * HINT: For easy testing - setting lng to 'cimode' will set t function to always return the key.
           */
  def changeLanguage(lng: java.lang.String): scala.Unit = js.native
  /**
           * Changes the language. The callback will be called as soon translations were loaded or an error occurs while loading.
           * HINT: For easy testing - setting lng to 'cimode' will set t function to always return the key.
           */
  def changeLanguage(lng: java.lang.String, callback: Callback): scala.Unit = js.native
  /**
           * Creates a clone of the current instance. Shares store, plugins and initial configuration.
           * Can be used to create an instance sharing storage but being independent on set language or namespaces.
           */
  def cloneInstance(): i18n = js.native
  /**
           * Creates a clone of the current instance. Shares store, plugins and initial configuration.
           * Can be used to create an instance sharing storage but being independent on set language or namespaces.
           */
  def cloneInstance(options: InitOptions): i18n = js.native
  /**
           * Creates a clone of the current instance. Shares store, plugins and initial configuration.
           * Can be used to create an instance sharing storage but being independent on set language or namespaces.
           */
  def cloneInstance(options: InitOptions, callback: Callback): i18n = js.native
  /**
           * Will return a new i18next instance.
           * Please read the options page for details on configuration options.
           * Providing a callback will automatically call init.
           * The callback will be called after all translations were loaded or with an error when failed (in case of using a backend).
           */
  def createInstance(): i18n = js.native
  /**
           * Will return a new i18next instance.
           * Please read the options page for details on configuration options.
           * Providing a callback will automatically call init.
           * The callback will be called after all translations were loaded or with an error when failed (in case of using a backend).
           */
  def createInstance(options: InitOptions): i18n = js.native
  /**
           * Will return a new i18next instance.
           * Please read the options page for details on configuration options.
           * Providing a callback will automatically call init.
           * The callback will be called after all translations were loaded or with an error when failed (in case of using a backend).
           */
  def createInstance(options: InitOptions, callback: Callback): i18n = js.native
  /**
           * Returns rtl or ltr depending on languages read direction.
           */
  def dir(): i18nextLib.i18nextLibStrings.ltr | i18nextLib.i18nextLibStrings.rtl = js.native
  /**
           * Returns rtl or ltr depending on languages read direction.
           */
  def dir(lng: java.lang.String): i18nextLib.i18nextLibStrings.ltr | i18nextLib.i18nextLibStrings.rtl = js.native
  /**
           * Uses the same resolve functionality as the t function and returns true if a key exists.
           */
  def exists(key: java.lang.String): scala.Boolean = js.native
  /**
           * Uses the same resolve functionality as the t function and returns true if a key exists.
           */
  def exists(key: java.lang.String, options: TranslationOptions[js.Object]): scala.Boolean = js.native
  /**
           * Uses the same resolve functionality as the t function and returns true if a key exists.
           */
  def exists(key: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
           * Uses the same resolve functionality as the t function and returns true if a key exists.
           */
  def exists(key: js.Array[java.lang.String], options: TranslationOptions[js.Object]): scala.Boolean = js.native
  /**
           * Exposes interpolation.format function added on init.
           */
  def format(value: js.Any): java.lang.String = js.native
  /**
           * Exposes interpolation.format function added on init.
           */
  def format(value: js.Any, format: java.lang.String): java.lang.String = js.native
  /**
           * Exposes interpolation.format function added on init.
           */
  def format(value: js.Any, format: java.lang.String, lng: java.lang.String): java.lang.String = js.native
  /**
           * Returns a t function that defaults to given language or namespace.
           * Both params could be arrays of languages or namespaces and will be treated as fallbacks in that case.
           * On the returned function you can like in the t function override the languages or namespaces by passing them in options or by prepending namespace.
           */
  def getFixedT(lng: java.lang.String): TranslationFunction[_, js.Object, java.lang.String] = js.native
  /**
           * Returns a t function that defaults to given language or namespace.
           * Both params could be arrays of languages or namespaces and will be treated as fallbacks in that case.
           * On the returned function you can like in the t function override the languages or namespaces by passing them in options or by prepending namespace.
           */
  def getFixedT(lng: java.lang.String, ns: java.lang.String): TranslationFunction[_, js.Object, java.lang.String] = js.native
  /**
           * Returns a t function that defaults to given language or namespace.
           * Both params could be arrays of languages or namespaces and will be treated as fallbacks in that case.
           * On the returned function you can like in the t function override the languages or namespaces by passing them in options or by prepending namespace.
           */
  def getFixedT(lng: java.lang.String, ns: js.Array[java.lang.String]): TranslationFunction[_, js.Object, java.lang.String] = js.native
  /**
           * Returns a t function that defaults to given language or namespace.
           * Both params could be arrays of languages or namespaces and will be treated as fallbacks in that case.
           * On the returned function you can like in the t function override the languages or namespaces by passing them in options or by prepending namespace.
           */
  def getFixedT(lng: js.Array[java.lang.String]): TranslationFunction[_, js.Object, java.lang.String] = js.native
  /**
           * Returns a t function that defaults to given language or namespace.
           * Both params could be arrays of languages or namespaces and will be treated as fallbacks in that case.
           * On the returned function you can like in the t function override the languages or namespaces by passing them in options or by prepending namespace.
           */
  def getFixedT(lng: js.Array[java.lang.String], ns: java.lang.String): TranslationFunction[_, js.Object, java.lang.String] = js.native
  /**
           * Returns a t function that defaults to given language or namespace.
           * Both params could be arrays of languages or namespaces and will be treated as fallbacks in that case.
           * On the returned function you can like in the t function override the languages or namespaces by passing them in options or by prepending namespace.
           */
  def getFixedT(lng: js.Array[java.lang.String], ns: js.Array[java.lang.String]): TranslationFunction[_, js.Object, java.lang.String] = js.native
  def getFixedT(lng: scala.Null, ns: java.lang.String): TranslationFunction[_, js.Object, java.lang.String] = js.native
  def getFixedT(lng: scala.Null, ns: js.Array[java.lang.String]): TranslationFunction[_, js.Object, java.lang.String] = js.native
  /**
           * Gets one value by given key.
           */
  def getResource(lng: java.lang.String, ns: java.lang.String, key: java.lang.String): js.Any = js.native
  /**
           * Gets one value by given key.
           */
  def getResource(
    lng: java.lang.String,
    ns: java.lang.String,
    key: java.lang.String,
    options: i18nextLib.Anon_KeySeparator
  ): js.Any = js.native
  /**
           * Returns a resource bundle.
           */
  def getResourceBundle(lng: java.lang.String, ns: java.lang.String): js.Any = js.native
  /**
           * Checks if a resource bundle exists.
           */
  def hasResourceBundle(lng: java.lang.String, ns: java.lang.String): scala.Boolean = js.native
  def init(): i18n = js.native
  def init(callback: Callback): i18n = js.native
  /**
           * The default export of the i18next module is an i18next instance ready to be initialized by calling init.
           * You can create additional instances using the createInstance function.
           *
           * @param options - Initial options.
           * @param callback - will be called after all translations were loaded or with an error when failed (in case of using a backend).
           */
  def init(options: InitOptions): i18n = js.native
  /**
           * The default export of the i18next module is an i18next instance ready to be initialized by calling init.
           * You can create additional instances using the createInstance function.
           *
           * @param options - Initial options.
           * @param callback - will be called after all translations were loaded or with an error when failed (in case of using a backend).
           */
  def init(options: InitOptions, callback: Callback): i18n = js.native
  /**
           * Loads additional languages not defined in init options (preload).
           */
  def loadLanguages(lngs: java.lang.String, callback: Callback): scala.Unit = js.native
  /**
           * Loads additional languages not defined in init options (preload).
           */
  def loadLanguages(lngs: js.Array[java.lang.String], callback: Callback): scala.Unit = js.native
  /**
           * Loads additional namespaces not defined in init options.
           */
  def loadNamespaces(ns: java.lang.String, callback: Callback): scala.Unit = js.native
  /**
           * Loads additional namespaces not defined in init options.
           */
  def loadNamespaces(ns: js.Array[java.lang.String], callback: Callback): scala.Unit = js.native
  def loadResources(): scala.Unit = js.native
  def loadResources(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
           * Remove event listener
           */
  def off(event: java.lang.String, listener: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  /**
           * Event listener
           */
  def on(event: java.lang.String, listener: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  /**
           * Gets fired when resources got added or removed.
           */
  @JSName("on")
  def on_added(
    event: i18nextLib.i18nextLibStrings.added,
    callback: js.Function2[/* lng */ java.lang.String, /* ns */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Gets fired if loading resources failed.
           */
  @JSName("on")
  def on_failedLoading(
    event: i18nextLib.i18nextLibStrings.failedLoading,
    callback: js.Function3[
      /* lng */ java.lang.String, 
      /* ns */ java.lang.String, 
      /* msg */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
           * Gets fired after initialization.
           */
  @JSName("on")
  def on_initialized(
    event: i18nextLib.i18nextLibStrings.initialized,
    callback: js.Function1[/* options */ InitOptions, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Gets fired when changeLanguage got called.
           */
  @JSName("on")
  def on_languageChanged(
    event: i18nextLib.i18nextLibStrings.languageChanged,
    callback: js.Function1[/* lng */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Gets fired on loaded resources.
           */
  @JSName("on")
  def on_loaded(
    event: i18nextLib.i18nextLibStrings.loaded,
    callback: js.Function1[/* loaded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Gets fired on accessing a key not existing.
           */
  @JSName("on")
  def on_missingKey(
    event: i18nextLib.i18nextLibStrings.missingKey,
    callback: js.Function4[
      /* lngs */ js.Array[java.lang.String], 
      /* namespace */ java.lang.String, 
      /* key */ java.lang.String, 
      /* res */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
           * Gets fired when resources got added or removed.
           */
  @JSName("on")
  def on_removed(
    event: i18nextLib.i18nextLibStrings.removed,
    callback: js.Function2[/* lng */ java.lang.String, /* ns */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Reloads resources on given state. Optionally you can pass an array of languages and namespaces as params if you don't want to reload all.
           */
  def reloadResources(): scala.Unit = js.native
  /**
           * Reloads resources on given state. Optionally you can pass an array of languages and namespaces as params if you don't want to reload all.
           */
  def reloadResources(lngs: js.Array[java.lang.String]): scala.Unit = js.native
  /**
           * Reloads resources on given state. Optionally you can pass an array of languages and namespaces as params if you don't want to reload all.
           */
  def reloadResources(lngs: js.Array[java.lang.String], ns: js.Array[java.lang.String]): scala.Unit = js.native
  def reloadResources(lngs: scala.Null, ns: js.Array[java.lang.String]): scala.Unit = js.native
  /**
           * Removes an existing bundle.
           */
  def removeResourceBundle(lng: java.lang.String, ns: java.lang.String): scala.Unit = js.native
  /**
           * Changes the default namespace.
           */
  def setDefaultNamespace(ns: java.lang.String): scala.Unit = js.native
  /**
           * Please have a look at the translation functions like interpolation, formatting and plurals for more details on using it.
           */
  def t(key: java.lang.String): js.Any = js.native
  /**
           * Please have a look at the translation functions like interpolation, formatting and plurals for more details on using it.
           */
  def t(key: java.lang.String, options: TranslationOptions[js.Object]): js.Any = js.native
  /**
           * Please have a look at the translation functions like interpolation, formatting and plurals for more details on using it.
           */
  def t(key: js.Array[java.lang.String]): js.Any = js.native
  /**
           * Please have a look at the translation functions like interpolation, formatting and plurals for more details on using it.
           */
  def t(key: js.Array[java.lang.String], options: TranslationOptions[js.Object]): js.Any = js.native
  /**
           * The use function is there to load additional plugins to i18next.
           * For available module see the plugins page and don't forget to read the documentation of the plugin.
           */
  def use(module: js.Any): i18n = js.native
}


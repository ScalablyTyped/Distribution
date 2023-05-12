package typings.i18next.mod

import org.scalablytyped.runtime.StringDictionary
import typings.i18next.anon.DefaultValue
import typings.i18next.anon.KeySeparator
import typings.i18next.anon.Ns
import typings.i18next.anon.NsPassedNS
import typings.i18next.anon.PickInitOptionsobjectfall
import typings.i18next.anon.PickInitOptionsobjectkeyS
import typings.i18next.anon.ReturnDetails
import typings.i18next.anon.ReturnObjects
import typings.i18next.anon.`0`
import typings.i18next.anon.`1`
import typings.i18next.i18nextStrings.added
import typings.i18next.i18nextStrings.failedLoading
import typings.i18next.i18nextStrings.initialized
import typings.i18next.i18nextStrings.languageChanged
import typings.i18next.i18nextStrings.loaded
import typings.i18next.i18nextStrings.ltr
import typings.i18next.i18nextStrings.missingKey
import typings.i18next.i18nextStrings.removed
import typings.i18next.i18nextStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait i18n extends StObject {
  
  /**
    * Adds one key/value.
    */
  def addResource(lng: String, ns: String, key: String, value: String): i18n = js.native
  def addResource(lng: String, ns: String, key: String, value: String, options: KeySeparator): i18n = js.native
  
  /**
    * Adds a complete bundle.
    * Setting deep param to true will extend existing translations in that file.
    * Setting overwrite to true it will overwrite existing translations in that file.
    */
  def addResourceBundle(lng: String, ns: String, resources: Any): i18n = js.native
  def addResourceBundle(lng: String, ns: String, resources: Any, deep: Boolean): i18n = js.native
  def addResourceBundle(lng: String, ns: String, resources: Any, deep: Boolean, overwrite: Boolean): i18n = js.native
  def addResourceBundle(lng: String, ns: String, resources: Any, deep: Unit, overwrite: Boolean): i18n = js.native
  
  /**
    * Adds multiple key/values.
    */
  def addResources(lng: String, ns: String, resources: Any): i18n = js.native
  
  /**
    * Changes the language. The callback will be called as soon translations were loaded or an error occurs while loading.
    * HINT: For easy testing - setting lng to 'cimode' will set t function to always return the key.
    */
  def changeLanguage(): js.Promise[
    TFunction[
      DefaultNamespace, 
      Unit, 
      /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
    ]
  ] = js.native
  def changeLanguage(lng: String): js.Promise[
    TFunction[
      DefaultNamespace, 
      Unit, 
      /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
    ]
  ] = js.native
  def changeLanguage(lng: String, callback: Callback): js.Promise[
    TFunction[
      DefaultNamespace, 
      Unit, 
      /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
    ]
  ] = js.native
  def changeLanguage(lng: Unit, callback: Callback): js.Promise[
    TFunction[
      DefaultNamespace, 
      Unit, 
      /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
    ]
  ] = js.native
  
  /**
    * Creates a clone of the current instance. Shares store, plugins and initial configuration.
    * Can be used to create an instance sharing storage but being independent on set language or namespaces.
    */
  def cloneInstance(): i18n = js.native
  def cloneInstance(options: Unit, callback: Callback): i18n = js.native
  def cloneInstance(options: InitOptions[js.Object]): i18n = js.native
  def cloneInstance(options: InitOptions[js.Object], callback: Callback): i18n = js.native
  
  /**
    * Will return a new i18next instance.
    * Please read the options page for details on configuration options.
    * Providing a callback will automatically call init.
    * The callback will be called after all translations were loaded or with an error when failed (in case of using a backend).
    */
  def createInstance(): i18n = js.native
  def createInstance(options: Unit, callback: Callback): i18n = js.native
  def createInstance(options: InitOptions[js.Object]): i18n = js.native
  def createInstance(options: InitOptions[js.Object], callback: Callback): i18n = js.native
  
  /**
    * Returns rtl or ltr depending on languages read direction.
    */
  def dir(): ltr | rtl = js.native
  def dir(lng: String): ltr | rtl = js.native
  
  /**
    * Emit event
    */
  def emit(eventName: String): Unit = js.native
  
  /**
    * Uses similar args as the t function and returns true if a key exists.
    */
  def exists(key: String): Boolean = js.native
  def exists(key: String, options: TOptions[StringMap]): Boolean = js.native
  def exists(key: js.Array[String]): Boolean = js.native
  def exists(key: js.Array[String], options: TOptions[StringMap]): Boolean = js.native
  /**
    * Uses similar args as the t function and returns true if a key exists.
    */
  @JSName("exists")
  var exists_Original: ExistsFunction[String, StringMap] = js.native
  
  /**
    * Exposes interpolation.format function added on init.
    */
  def format(value: Any): String = js.native
  def format(value: Any, format: String): String = js.native
  def format(value: Any, format: String, lng: String): String = js.native
  def format(value: Any, format: String, lng: String, options: InterpolationOptions & StringMap): String = js.native
  def format(value: Any, format: String, lng: Unit, options: InterpolationOptions & StringMap): String = js.native
  def format(value: Any, format: Unit, lng: String): String = js.native
  def format(value: Any, format: Unit, lng: String, options: InterpolationOptions & StringMap): String = js.native
  def format(value: Any, format: Unit, lng: Unit, options: InterpolationOptions & StringMap): String = js.native
  /**
    * Exposes interpolation.format function added on init.
    */
  @JSName("format")
  var format_Original: FormatFunction = js.native
  
  /**
    * Returns a resource data by language.
    */
  def getDataByLanguage(lng: String): js.UndefOr[StringDictionary[StringDictionary[String]]] = js.native
  
  /**
    * Returns a t function that defaults to given language or namespace.
    * Both params could be arrays of languages or namespaces and will be treated as fallbacks in that case.
    * On the returned function you can like in the t function override the languages or namespaces by passing them in options or by prepending namespace.
    *
    * Accepts optional keyPrefix that will be automatically applied to returned t function.
    */
  def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: String): TFunction[
    ActualNS, 
    TKPrefix, 
    /* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any
  ] = js.native
  def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: String, ns: N): TFunction[
    ActualNS, 
    TKPrefix, 
    /* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any
  ] = js.native
  def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: String, ns: N, keyPrefix: TKPrefix): TFunction[
    ActualNS, 
    TKPrefix, 
    /* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any
  ] = js.native
  def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: String, ns: Unit, keyPrefix: TKPrefix): TFunction[
    ActualNS, 
    TKPrefix, 
    /* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any
  ] = js.native
  def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: js.Array[String]): TFunction[
    ActualNS, 
    TKPrefix, 
    /* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any
  ] = js.native
  def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: js.Array[String], ns: N): TFunction[
    ActualNS, 
    TKPrefix, 
    /* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any
  ] = js.native
  def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: js.Array[String], ns: N, keyPrefix: TKPrefix): TFunction[
    ActualNS, 
    TKPrefix, 
    /* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any
  ] = js.native
  def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: js.Array[String], ns: Unit, keyPrefix: TKPrefix): TFunction[
    ActualNS, 
    TKPrefix, 
    /* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any
  ] = js.native
  def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: Null, ns: N): TFunction[
    ActualNS, 
    TKPrefix, 
    /* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any
  ] = js.native
  def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: Null, ns: N, keyPrefix: TKPrefix): TFunction[
    ActualNS, 
    TKPrefix, 
    /* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any
  ] = js.native
  
  /**
    * Gets one value by given key.
    */
  def getResource(lng: String, ns: String, key: String): Any = js.native
  def getResource(lng: String, ns: String, key: String, options: PickInitOptionsobjectkeyS): Any = js.native
  
  /**
    * Returns a resource bundle.
    */
  def getResourceBundle(lng: String, ns: String): Any = js.native
  
  /**
    * Checks if a namespace has been loaded.
    */
  def hasLoadedNamespace(ns: String): Boolean = js.native
  def hasLoadedNamespace(ns: String, options: PickInitOptionsobjectfall): Boolean = js.native
  
  /**
    * Checks if a resource bundle exists.
    */
  def hasResourceBundle(lng: String, ns: String): Boolean = js.native
  
  /**
    * The default of the i18next module is an i18next instance ready to be initialized by calling init.
    * You can create additional instances using the createInstance function.
    *
    * @param options - Initial options.
    * @param callback - will be called after all translations were loaded or with an error when failed (in case of using a backend).
    */
  def init(): js.Promise[
    TFunction[
      DefaultNamespace, 
      Unit, 
      /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
    ]
  ] = js.native
  def init(callback: Callback): js.Promise[
    TFunction[
      DefaultNamespace, 
      Unit, 
      /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
    ]
  ] = js.native
  def init[T](options: InitOptions[T]): js.Promise[
    TFunction[
      DefaultNamespace, 
      Unit, 
      /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
    ]
  ] = js.native
  def init[T](options: InitOptions[T], callback: Callback): js.Promise[
    TFunction[
      DefaultNamespace, 
      Unit, 
      /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
    ]
  ] = js.native
  
  /**
    * Is initialized
    */
  var isInitialized: Boolean = js.native
  
  /**
    * Is set to the current detected or set language.
    * If you need the primary used language depending on your configuration (supportedLngs, load) you will prefer using i18next.languages[0].
    */
  var language: String = js.native
  
  /**
    * Is set to an array of language-codes that will be used it order to lookup the translation value.
    */
  var languages: js.Array[String] = js.native
  
  /**
    * Loads additional languages not defined in init options (preload).
    */
  def loadLanguages(lngs: String): js.Promise[Unit] = js.native
  def loadLanguages(lngs: String, callback: Callback): js.Promise[Unit] = js.native
  def loadLanguages(lngs: js.Array[String]): js.Promise[Unit] = js.native
  def loadLanguages(lngs: js.Array[String], callback: Callback): js.Promise[Unit] = js.native
  
  /**
    * Loads additional namespaces not defined in init options.
    */
  def loadNamespaces(ns: String): js.Promise[Unit] = js.native
  def loadNamespaces(ns: String, callback: Callback): js.Promise[Unit] = js.native
  def loadNamespaces(ns: js.Array[String]): js.Promise[Unit] = js.native
  def loadNamespaces(ns: js.Array[String], callback: Callback): js.Promise[Unit] = js.native
  
  def loadResources(): Unit = js.native
  def loadResources(callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
  
  /**
    * List of modules used
    */
  var modules: Modules = js.native
  
  /**
    * Remove event listener
    * removes all callback when callback not specified
    */
  def off(event: String): Unit = js.native
  def off(event: String, listener: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
  
  /**
    * Gets fired when resources got added or removed.
    */
  def on(event: added | removed, callback: js.Function2[/* lng */ String, /* ns */ String, Unit]): Unit = js.native
  /**
    * Event listener
    */
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
  /**
    * Gets fired if loading resources failed.
    */
  @JSName("on")
  def on_failedLoading(
    event: failedLoading,
    callback: js.Function3[/* lng */ String, /* ns */ String, /* msg */ String, Unit]
  ): Unit = js.native
  /**
    * Gets fired after initialization.
    */
  @JSName("on")
  def on_initialized(event: initialized, callback: js.Function1[/* options */ InitOptions[js.Object], Unit]): Unit = js.native
  /**
    * Gets fired when changeLanguage got called.
    */
  @JSName("on")
  def on_languageChanged(event: languageChanged, callback: js.Function1[/* lng */ String, Unit]): Unit = js.native
  /**
    * Gets fired on loaded resources.
    */
  @JSName("on")
  def on_loaded(
    event: loaded,
    callback: js.Function1[/* loaded */ StringDictionary[StringDictionary[Boolean]], Unit]
  ): Unit = js.native
  /**
    * Gets fired on accessing a key not existing.
    */
  @JSName("on")
  def on_missingKey(
    event: missingKey,
    callback: js.Function4[
      /* lngs */ js.Array[String], 
      /* namespace */ String, 
      /* key */ String, 
      /* res */ String, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Current options
    */
  var options: InitOptions[js.Object] = js.native
  
  /**
    * Reloads resources on given state. Optionally you can pass an array of languages and namespaces as params if you don't want to reload all.
    */
  def reloadResources(): js.Promise[Unit] = js.native
  def reloadResources(lngs: String): js.Promise[Unit] = js.native
  def reloadResources(lngs: String, ns: String): js.Promise[Unit] = js.native
  def reloadResources(lngs: String, ns: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def reloadResources(lngs: String, ns: js.Array[String]): js.Promise[Unit] = js.native
  def reloadResources(lngs: String, ns: js.Array[String], callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def reloadResources(lngs: String, ns: Unit, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def reloadResources(lngs: js.Array[String]): js.Promise[Unit] = js.native
  def reloadResources(lngs: js.Array[String], ns: String): js.Promise[Unit] = js.native
  def reloadResources(lngs: js.Array[String], ns: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def reloadResources(lngs: js.Array[String], ns: js.Array[String]): js.Promise[Unit] = js.native
  def reloadResources(lngs: js.Array[String], ns: js.Array[String], callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def reloadResources(lngs: js.Array[String], ns: Unit, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def reloadResources(lngs: Null, ns: String): js.Promise[Unit] = js.native
  def reloadResources(lngs: Null, ns: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def reloadResources(lngs: Null, ns: js.Array[String]): js.Promise[Unit] = js.native
  def reloadResources(lngs: Null, ns: js.Array[String], callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def reloadResources(lngs: Unit, ns: String): js.Promise[Unit] = js.native
  def reloadResources(lngs: Unit, ns: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def reloadResources(lngs: Unit, ns: js.Array[String]): js.Promise[Unit] = js.native
  def reloadResources(lngs: Unit, ns: js.Array[String], callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def reloadResources(lngs: Unit, ns: Unit, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  /**
    * Removes an existing bundle.
    */
  def removeResourceBundle(lng: String, ns: String): i18n = js.native
  
  /**
    * Is set to the current resolved language.
    * It can be used as primary used language, for example in a language switcher.
    */
  var resolvedLanguage: String = js.native
  
  /**
    * Internal container for all used plugins and implementation details like languageUtils, pluralResolvers, etc.
    */
  var services: Services = js.native
  
  /**
    * Changes the default namespace.
    */
  def setDefaultNamespace(ns: String): Unit = js.native
  
  /**
    * Internal container for translation resources
    */
  var store: ResourceStore = js.native
  
  // Expose parameterized t in the i18next interface hierarchy
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: String, defaultValue: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: String, defaultValue: String, options: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: String, defaultValue: String, options: TOptions[TInterpolationMap]): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  // defaultValue via options
  // Expose parameterized t in the i18next interface hierarchy
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: String, options: TOptions[TInterpolationMap] & DefaultValue): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[String], defaultValue: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[String], defaultValue: String, options: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[String], defaultValue: String, options: TOptions[TInterpolationMap]): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[String], options: TOptions[TInterpolationMap] & DefaultValue): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  // just key without options etc...
  // Expose parameterized t in the i18next interface hierarchy
  def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>>, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys): TFuncReturn[
    js.Array[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  // <
  //   TKeys extends TFuncKey<N, TKPrefix> | TemplateStringsArray extends infer A ? A : never,
  //   TDefaultResult extends DefaultTFuncReturn = string,
  //   TInterpolationMap extends object = StringMap,
  // >(
  //   key: TKeys | TKeys[],
  //   options: TOptions<TInterpolationMap>,
  // ): TFuncReturn<N, TKeys, TDefaultResult, TKPrefix>;
  // defaultValue
  // Expose parameterized t in the i18next interface hierarchy
  def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>>, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>>, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>>, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: TOptions[TInterpolationMap]): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  // with returnDetails: true, returnObjects: true
  // Expose parameterized t in the i18next interface hierarchy
  // with returnDetails: true
  def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>>, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](key: TKeys, options: TOptions[TInterpolationMap] & ReturnDetails & `0`): TFunctionDetailedResult[
    TFuncReturn[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
      TKeys, 
      TDefaultResult, 
      Unit, 
      Resources
    ]
  ] = js.native
  def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>>, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys]): TFuncReturn[
    js.Array[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  // Expose parameterized t in the i18next interface hierarchy
  @JSName("t")
  var t_Original: TFunction[
    js.Array[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], 
    Unit, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any
  ] = js.native
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMap[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>>, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMap[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>>, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMap[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>>, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: TOptions[TInterpolationMap]): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMap[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>>, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: TOptions[TInterpolationMap] & `1`): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  // Expose parameterized t in the i18next interface hierarchy
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNS[TKeys /* <: TFuncKey[PassedNS, Unit, Resources] */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](key: TKeys): TFuncReturn[PassedNS, TKeys, TDefaultResult, Unit, Resources] = js.native
  // with returnDetails: true, returnObjects: true and ns prop in options
  // Expose parameterized t in the i18next interface hierarchy
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNS[TKeys /* <: TFuncKey[
    Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], 
    Unit, 
    Resources
  ] */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](key: TKeys, options: TOptions[TInterpolationMap] & Ns[PassedNS]): TFunctionDetailedResult[
    TFuncReturn[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
      TKeys, 
      TDefaultResult, 
      Unit, 
      Resources
    ]
  ] = js.native
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNS[TKeys /* <: TFuncKey[PassedNS, Unit, Resources] */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](key: js.Array[TKeys]): TFuncReturn[PassedNS, TKeys, TDefaultResult, Unit, Resources] = js.native
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNS[TKeys /* <: TFuncKey[
    Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], 
    Unit, 
    Resources
  ] */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](
    key: js.Array[TKeys],
    options: TOptions[TInterpolationMap] & ReturnObjects[PassedNS] & NsPassedNS[PassedNS]
  ): TFuncReturn[PassedNS, TKeys, TDefaultResult, Unit, Resources] = js.native
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNSPassedOptUsedNS[TKeys /* <: TFuncKey[UsedNS, Unit, Resources] */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, PassedOpt /* <: TOptions[TInterpolationMap] */, UsedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](key: js.Array[TKeys], options: PassedOpt): TFuncReturn[UsedNS, TKeys, TDefaultResult, Unit, Resources] = js.native
  // with options
  // Expose parameterized t in the i18next interface hierarchy
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNSPassedOptUsedNS_TFuncReturn[TKeys /* <: TFuncKey[UsedNS, Unit, Resources] */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, PassedOpt /* <: TOptions[TInterpolationMap] */, UsedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](key: TKeys, options: PassedOpt): TFuncReturn[UsedNS, TKeys, TDefaultResult, Unit, Resources] = js.native
  // with returnObjects: true and ns prop in options
  // Expose parameterized t in the i18next interface hierarchy
  // with passed ns prop in options
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNS_TFuncReturn[TKeys /* <: TFuncKey[
    Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], 
    Unit, 
    Resources
  ] */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](key: TKeys, options: TOptions[TInterpolationMap] & ReturnObjects[PassedNS] & NsPassedNS[PassedNS]): TFuncReturn[PassedNS, TKeys, TDefaultResult, Unit, Resources] = js.native
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNS_TFunctionDetailedResult[TKeys /* <: TFuncKey[
    Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], 
    Unit, 
    Resources
  ] */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](key: js.Array[TKeys], options: TOptions[TInterpolationMap] & Ns[PassedNS]): TFunctionDetailedResult[
    TFuncReturn[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
      TKeys, 
      TDefaultResult, 
      Unit, 
      Resources
    ]
  ] = js.native
  // with returnObjects: true
  // Expose parameterized t in the i18next interface hierarchy
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMap_TFuncReturn[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>>, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](key: TKeys, options: TOptions[TInterpolationMap] & `1`): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ] = js.native
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMap_TFunctionDetailedResult[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>>, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: TOptions[TInterpolationMap] & ReturnDetails & `0`): TFunctionDetailedResult[
    TFuncReturn[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any, 
      TKeys, 
      TDefaultResult, 
      Unit, 
      Resources
    ]
  ] = js.native
  
  /**
    * The use function is there to load additional plugins to i18next.
    * For available module see the plugins page and don't forget to read the documentation of the plugin.
    *
    * @param module Accepts a class or object
    */
  def use[T /* <: Module */](module: T): this.type = js.native
  def use[T /* <: Module */](module: Newable[T]): this.type = js.native
  def use[T /* <: Module */](module: NewableModule[T]): this.type = js.native
}

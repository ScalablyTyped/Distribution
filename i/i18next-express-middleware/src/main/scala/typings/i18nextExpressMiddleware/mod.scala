package typings.i18nextExpressMiddleware

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.express.mod.Handler
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.express.mod.Router
import typings.expressServeStaticCore.mod.Request
import typings.i18next.anon.ReturnDetails
import typings.i18next.anon.ReturnObjects
import typings.i18next.anon.`0`
import typings.i18next.mod.DefaultNamespace
import typings.i18next.mod.DefaultTFuncReturn
import typings.i18next.mod.DefaultTFuncReturnWithObject
import typings.i18next.mod.Module
import typings.i18next.mod.ModuleType
import typings.i18next.mod.Resources
import typings.i18next.mod.TFuncReturn
import typings.i18next.mod.TFunction
import typings.i18next.mod.TFunctionDetailedResult
import typings.i18next.mod.TOptions
import typings.i18next.mod.i18n
import typings.i18nextExpressMiddleware.i18nextExpressMiddlewareStrings.languageDetector
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18next-express-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("i18next-express-middleware", "LanguageDetector")
  @js.native
  open class LanguageDetector ()
    extends StObject
       with Module {
    def this(options: LanguageDetectorOptions) = this()
    def this(services: LanguageDetectorServices) = this()
    def this(options: Unit, allOptions: LanguageDetectorAllOptions) = this()
    def this(options: LanguageDetectorOptions, allOptions: LanguageDetectorAllOptions) = this()
    def this(services: LanguageDetectorServices, options: LanguageDetectorOptions) = this()
    def this(services: LanguageDetectorServices, options: Unit, allOptions: LanguageDetectorAllOptions) = this()
    def this(
      services: LanguageDetectorServices,
      options: LanguageDetectorOptions,
      allOptions: LanguageDetectorAllOptions
    ) = this()
    
    def addDetector(detector: LanguageDetectorInterface): Unit = js.native
    
    def cacheUserLanguage(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      lng: String,
      caches: LanguageDetectorCaches
    ): Unit = js.native
    
    def detect(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      detectionOrder: LanguageDetectorOrder
    ): Unit = js.native
    
    def init(): Unit = js.native
    def init(options: Unit, allOptions: LanguageDetectorAllOptions): Unit = js.native
    def init(options: LanguageDetectorOptions): Unit = js.native
    def init(options: LanguageDetectorOptions, allOptions: LanguageDetectorAllOptions): Unit = js.native
    def init(services: LanguageDetectorServices): Unit = js.native
    def init(services: LanguageDetectorServices, options: Unit, allOptions: LanguageDetectorAllOptions): Unit = js.native
    def init(services: LanguageDetectorServices, options: LanguageDetectorOptions): Unit = js.native
    def init(
      services: LanguageDetectorServices,
      options: LanguageDetectorOptions,
      allOptions: LanguageDetectorAllOptions
    ): Unit = js.native
    
    /* CompleteClass */
    var `type`: ModuleType = js.native
    @JSName("type")
    var type_LanguageDetector: languageDetector = js.native
  }
  
  inline def addRoute(
    i18next: I18next,
    route: String,
    lngs: js.Array[String],
    app: App,
    fc: RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")(i18next.asInstanceOf[js.Any], route.asInstanceOf[js.Any], lngs.asInstanceOf[js.Any], app.asInstanceOf[js.Any], fc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addRoute(
    i18next: I18next,
    route: String,
    lngs: js.Array[String],
    app: App,
    verb: String,
    fc: RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")(i18next.asInstanceOf[js.Any], route.asInstanceOf[js.Any], lngs.asInstanceOf[js.Any], app.asInstanceOf[js.Any], verb.asInstanceOf[js.Any], fc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getResourcesHandler(i18next: I18next): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourcesHandler")(i18next.asInstanceOf[js.Any]).asInstanceOf[Handler]
  inline def getResourcesHandler(i18next: I18next, options: GetResourcesHandlerOptions): Handler = (^.asInstanceOf[js.Dynamic].applyDynamic("getResourcesHandler")(i18next.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  inline def handle(i18next: I18next): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("handle")(i18next.asInstanceOf[js.Any]).asInstanceOf[Handler]
  inline def handle(i18next: I18next, options: HandleOptions): Handler = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(i18next.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  inline def missingKeyHandler(i18next: I18next): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("missingKeyHandler")(i18next.asInstanceOf[js.Any]).asInstanceOf[Handler]
  inline def missingKeyHandler(i18next: I18next, options: MissingKeyHandlerOptions): Handler = (^.asInstanceOf[js.Dynamic].applyDynamic("missingKeyHandler")(i18next.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  type App = Application_ | Router
  
  trait GetResourcesHandlerOptions extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var lngParam: js.UndefOr[String] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var nsParam: js.UndefOr[String] = js.undefined
  }
  object GetResourcesHandlerOptions {
    
    inline def apply(): GetResourcesHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetResourcesHandlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetResourcesHandlerOptions] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setLngParam(value: String): Self = StObject.set(x, "lngParam", value.asInstanceOf[js.Any])
      
      inline def setLngParamUndefined: Self = StObject.set(x, "lngParam", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setNsParam(value: String): Self = StObject.set(x, "nsParam", value.asInstanceOf[js.Any])
      
      inline def setNsParamUndefined: Self = StObject.set(x, "nsParam", js.undefined)
    }
  }
  
  trait HandleOptions extends StObject {
    
    var ignoreRoutes: js.UndefOr[js.Array[String] | IgnoreRoutesFunction] = js.undefined
    
    var removeLngFromUrl: js.UndefOr[Boolean] = js.undefined
  }
  object HandleOptions {
    
    inline def apply(): HandleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandleOptions] (val x: Self) extends AnyVal {
      
      inline def setIgnoreRoutes(value: js.Array[String] | IgnoreRoutesFunction): Self = StObject.set(x, "ignoreRoutes", value.asInstanceOf[js.Any])
      
      inline def setIgnoreRoutesFunction4(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]], /* options */ HandleOptions, /* i18next */ I18next) => Boolean
      ): Self = StObject.set(x, "ignoreRoutes", js.Any.fromFunction4(value))
      
      inline def setIgnoreRoutesUndefined: Self = StObject.set(x, "ignoreRoutes", js.undefined)
      
      inline def setIgnoreRoutesVarargs(value: String*): Self = StObject.set(x, "ignoreRoutes", js.Array(value*))
      
      inline def setRemoveLngFromUrl(value: Boolean): Self = StObject.set(x, "removeLngFromUrl", value.asInstanceOf[js.Any])
      
      inline def setRemoveLngFromUrlUndefined: Self = StObject.set(x, "removeLngFromUrl", js.undefined)
    }
  }
  
  @js.native
  trait I18NextRequest
    extends StObject
       with Request {
    
    var i18n: typings.i18next.mod.i18n = js.native
    
    var language: String = js.native
    
    var languages: js.Array[String] = js.native
    
    def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](key: TKeys): TFunctionDetailedResult[TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources]] = js.native
    def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String): TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources] = js.native
    def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: String): TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources] = js.native
    def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: TOptions[TInterpolationMap]): TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources] = js.native
    def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: Unit, options: String): TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources] = js.native
    def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: Unit, options: TOptions[TInterpolationMap]): TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources] = js.native
    def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](key: TKeys, options: TOptions[TInterpolationMap] & ReturnDetails & `0`): TFunctionDetailedResult[TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources]] = js.native
    def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys]): TFunctionDetailedResult[TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources]] = js.native
    def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String): TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources] = js.native
    def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: String): TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources] = js.native
    def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: TOptions[TInterpolationMap]): TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources] = js.native
    def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: Unit, options: String): TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources] = js.native
    def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: Unit, options: TOptions[TInterpolationMap]): TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources] = js.native
    def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: TOptions[TInterpolationMap] & ReturnDetails & `0`): TFunctionDetailedResult[TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources]] = js.native
    @JSName("t")
    var t_Original: TFunction[DefaultNamespace, Unit] = js.native
    @JSName("t")
    def t_TKeysTDefaultResultTInterpolationMap_TFuncReturn[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys): TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources] = js.native
    @JSName("t")
    def t_TKeysTDefaultResultTInterpolationMap_TFuncReturn[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](key: TKeys, options: (TOptions[TInterpolationMap] & ReturnObjects) | TOptions[TInterpolationMap]): TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources] = js.native
    @JSName("t")
    def t_TKeysTDefaultResultTInterpolationMap_TFuncReturn[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys]): TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources] = js.native
    @JSName("t")
    def t_TKeysTDefaultResultTInterpolationMap_TFuncReturn[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<i18next.i18next.DefaultNamespace, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](
      key: js.Array[TKeys],
      options: (TOptions[TInterpolationMap] & ReturnObjects) | TOptions[TInterpolationMap]
    ): TFuncReturn[DefaultNamespace, TKeys, TDefaultResult, Unit, Resources] = js.native
  }
  
  type I18next = i18n
  
  type IgnoreRoutesFunction = js.Function4[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* options */ HandleOptions, 
    /* i18next */ I18next, 
    Boolean
  ]
  
  trait LanguageDetectorAllOptions extends StObject {
    
    var fallbackLng: Boolean | String | js.Array[String]
  }
  object LanguageDetectorAllOptions {
    
    inline def apply(fallbackLng: Boolean | String | js.Array[String]): LanguageDetectorAllOptions = {
      val __obj = js.Dynamic.literal(fallbackLng = fallbackLng.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageDetectorAllOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LanguageDetectorAllOptions] (val x: Self) extends AnyVal {
      
      inline def setFallbackLng(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "fallbackLng", value.asInstanceOf[js.Any])
      
      inline def setFallbackLngVarargs(value: String*): Self = StObject.set(x, "fallbackLng", js.Array(value*))
    }
  }
  
  type LanguageDetectorCaches = Boolean | js.Array[String]
  
  @js.native
  trait LanguageDetectorInterface extends StObject {
    
    var cacheUserLanguage: js.UndefOr[
        js.Function4[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* res */ Response_[Any, Record[String, Any]], 
          /* lng */ String, 
          /* options */ js.UndefOr[js.Object], 
          Unit
        ]
      ] = js.native
    
    def lookup(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]]
    ): String | js.Array[String] = js.native
    def lookup(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      options: LanguageDetectorInterfaceOptions
    ): String | js.Array[String] = js.native
    
    var name: String = js.native
  }
  
  type LanguageDetectorInterfaceOptions = StringDictionary[Any]
  
  trait LanguageDetectorOptions extends StObject {
    
    var caches: js.UndefOr[LanguageDetectorCaches] = js.undefined
    
    var cookieDomain: js.UndefOr[String] = js.undefined
    
    var cookieExpirationDate: js.UndefOr[js.Date] = js.undefined
    
    var lookupCookie: js.UndefOr[String] = js.undefined
    
    var lookupFromPathIndex: js.UndefOr[Double] = js.undefined
    
    var lookupQuerystring: js.UndefOr[String] = js.undefined
    
    var lookupSession: js.UndefOr[String] = js.undefined
    
    var order: js.UndefOr[LanguageDetectorOrder] = js.undefined
  }
  object LanguageDetectorOptions {
    
    inline def apply(): LanguageDetectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LanguageDetectorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LanguageDetectorOptions] (val x: Self) extends AnyVal {
      
      inline def setCaches(value: LanguageDetectorCaches): Self = StObject.set(x, "caches", value.asInstanceOf[js.Any])
      
      inline def setCachesUndefined: Self = StObject.set(x, "caches", js.undefined)
      
      inline def setCachesVarargs(value: String*): Self = StObject.set(x, "caches", js.Array(value*))
      
      inline def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      inline def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      inline def setCookieExpirationDate(value: js.Date): Self = StObject.set(x, "cookieExpirationDate", value.asInstanceOf[js.Any])
      
      inline def setCookieExpirationDateUndefined: Self = StObject.set(x, "cookieExpirationDate", js.undefined)
      
      inline def setLookupCookie(value: String): Self = StObject.set(x, "lookupCookie", value.asInstanceOf[js.Any])
      
      inline def setLookupCookieUndefined: Self = StObject.set(x, "lookupCookie", js.undefined)
      
      inline def setLookupFromPathIndex(value: Double): Self = StObject.set(x, "lookupFromPathIndex", value.asInstanceOf[js.Any])
      
      inline def setLookupFromPathIndexUndefined: Self = StObject.set(x, "lookupFromPathIndex", js.undefined)
      
      inline def setLookupQuerystring(value: String): Self = StObject.set(x, "lookupQuerystring", value.asInstanceOf[js.Any])
      
      inline def setLookupQuerystringUndefined: Self = StObject.set(x, "lookupQuerystring", js.undefined)
      
      inline def setLookupSession(value: String): Self = StObject.set(x, "lookupSession", value.asInstanceOf[js.Any])
      
      inline def setLookupSessionUndefined: Self = StObject.set(x, "lookupSession", js.undefined)
      
      inline def setOrder(value: LanguageDetectorOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value*))
    }
  }
  
  type LanguageDetectorOrder = js.Array[String]
  
  // LanguageDetector
  type LanguageDetectorServices = Any
  
  trait MissingKeyHandlerOptions extends StObject {
    
    var lngParam: js.UndefOr[String] = js.undefined
    
    var nsParam: js.UndefOr[String] = js.undefined
  }
  object MissingKeyHandlerOptions {
    
    inline def apply(): MissingKeyHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MissingKeyHandlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MissingKeyHandlerOptions] (val x: Self) extends AnyVal {
      
      inline def setLngParam(value: String): Self = StObject.set(x, "lngParam", value.asInstanceOf[js.Any])
      
      inline def setLngParamUndefined: Self = StObject.set(x, "lngParam", js.undefined)
      
      inline def setNsParam(value: String): Self = StObject.set(x, "nsParam", value.asInstanceOf[js.Any])
      
      inline def setNsParamUndefined: Self = StObject.set(x, "nsParam", js.undefined)
    }
  }
}

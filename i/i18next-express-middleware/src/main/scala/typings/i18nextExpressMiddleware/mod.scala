package typings.i18nextExpressMiddleware

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.express.mod.Handler
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.express.mod.Router
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.i18next.i18nextStrings.`3rdParty`
import typings.i18next.i18nextStrings.backend
import typings.i18next.i18nextStrings.i18nFormat
import typings.i18next.i18nextStrings.languageDetector
import typings.i18next.i18nextStrings.logger
import typings.i18next.i18nextStrings.postProcessor
import typings.i18next.mod.Module
import typings.i18next.mod.TFunction
import typings.i18next.mod.TFunctionKeys
import typings.i18next.mod.TFunctionResult
import typings.i18next.mod.TOptions
import typings.i18next.mod.i18n
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18next-express-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("i18next-express-middleware", "LanguageDetector")
  @js.native
  class LanguageDetector ()
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
      req: Request_[ParamsDictionary, js.Any, js.Any, Query],
      res: Response_[js.Any],
      lng: String,
      caches: LanguageDetectorCaches
    ): Unit = js.native
    
    def detect(
      req: Request_[ParamsDictionary, js.Any, js.Any, Query],
      res: Response_[js.Any],
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
    var `type`: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty` = js.native
    @JSName("type")
    var type_LanguageDetector: typings.i18nextExpressMiddleware.i18nextExpressMiddlewareStrings.languageDetector = js.native
  }
  
  @scala.inline
  def addRoute(
    i18next: I18next,
    route: String,
    lngs: js.Array[String],
    app: App,
    fc: RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")(i18next.asInstanceOf[js.Any], route.asInstanceOf[js.Any], lngs.asInstanceOf[js.Any], app.asInstanceOf[js.Any], fc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addRoute(
    i18next: I18next,
    route: String,
    lngs: js.Array[String],
    app: App,
    verb: String,
    fc: RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")(i18next.asInstanceOf[js.Any], route.asInstanceOf[js.Any], lngs.asInstanceOf[js.Any], app.asInstanceOf[js.Any], verb.asInstanceOf[js.Any], fc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getResourcesHandler(i18next: I18next): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourcesHandler")(i18next.asInstanceOf[js.Any]).asInstanceOf[Handler]
  @scala.inline
  def getResourcesHandler(i18next: I18next, options: GetResourcesHandlerOptions): Handler = (^.asInstanceOf[js.Dynamic].applyDynamic("getResourcesHandler")(i18next.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  @scala.inline
  def handle(i18next: I18next): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("handle")(i18next.asInstanceOf[js.Any]).asInstanceOf[Handler]
  @scala.inline
  def handle(i18next: I18next, options: HandleOptions): Handler = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(i18next.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  @scala.inline
  def missingKeyHandler(i18next: I18next): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("missingKeyHandler")(i18next.asInstanceOf[js.Any]).asInstanceOf[Handler]
  @scala.inline
  def missingKeyHandler(i18next: I18next, options: MissingKeyHandlerOptions): Handler = (^.asInstanceOf[js.Dynamic].applyDynamic("missingKeyHandler")(i18next.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  type App = Application_ | Router
  
  trait GetResourcesHandlerOptions extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var lngParam: js.UndefOr[String] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var nsParam: js.UndefOr[String] = js.undefined
  }
  object GetResourcesHandlerOptions {
    
    @scala.inline
    def apply(): GetResourcesHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetResourcesHandlerOptions]
    }
    
    @scala.inline
    implicit class GetResourcesHandlerOptionsMutableBuilder[Self <: GetResourcesHandlerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setLngParam(value: String): Self = StObject.set(x, "lngParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLngParamUndefined: Self = StObject.set(x, "lngParam", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setNsParam(value: String): Self = StObject.set(x, "nsParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNsParamUndefined: Self = StObject.set(x, "nsParam", js.undefined)
    }
  }
  
  trait HandleOptions extends StObject {
    
    var ignoreRoutes: js.UndefOr[js.Array[String] | IgnoreRoutesFunction] = js.undefined
    
    var removeLngFromUrl: js.UndefOr[Boolean] = js.undefined
  }
  object HandleOptions {
    
    @scala.inline
    def apply(): HandleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleOptions]
    }
    
    @scala.inline
    implicit class HandleOptionsMutableBuilder[Self <: HandleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreRoutes(value: js.Array[String] | IgnoreRoutesFunction): Self = StObject.set(x, "ignoreRoutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreRoutesFunction4(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* options */ HandleOptions, /* i18next */ I18next) => Boolean
      ): Self = StObject.set(x, "ignoreRoutes", js.Any.fromFunction4(value))
      
      @scala.inline
      def setIgnoreRoutesUndefined: Self = StObject.set(x, "ignoreRoutes", js.undefined)
      
      @scala.inline
      def setIgnoreRoutesVarargs(value: String*): Self = StObject.set(x, "ignoreRoutes", js.Array(value :_*))
      
      @scala.inline
      def setRemoveLngFromUrl(value: Boolean): Self = StObject.set(x, "removeLngFromUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveLngFromUrlUndefined: Self = StObject.set(x, "removeLngFromUrl", js.undefined)
    }
  }
  
  @js.native
  trait I18NextRequest
    extends Request[ParamsDictionary, js.Any, js.Any, Query] {
    
    var i18n: typings.i18next.mod.i18n = js.native
    
    var language: String = js.native
    
    var languages: js.Array[String] = js.native
    
    // basic usage
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: TOptions[TInterpolationMap]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: Unit, options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: Unit, options: TOptions[TInterpolationMap]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, options: TOptions[TInterpolationMap]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: TOptions[TInterpolationMap]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: Unit, options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: Unit, options: TOptions[TInterpolationMap]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: TOptions[TInterpolationMap]): TResult = js.native
    @JSName("t")
    var t_Original: TFunction = js.native
  }
  
  type I18next = i18n
  
  type IgnoreRoutesFunction = js.Function4[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* options */ HandleOptions, 
    /* i18next */ I18next, 
    Boolean
  ]
  
  trait LanguageDetectorAllOptions extends StObject {
    
    var fallbackLng: Boolean | String | js.Array[String]
  }
  object LanguageDetectorAllOptions {
    
    @scala.inline
    def apply(fallbackLng: Boolean | String | js.Array[String]): LanguageDetectorAllOptions = {
      val __obj = js.Dynamic.literal(fallbackLng = fallbackLng.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageDetectorAllOptions]
    }
    
    @scala.inline
    implicit class LanguageDetectorAllOptionsMutableBuilder[Self <: LanguageDetectorAllOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallbackLng(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "fallbackLng", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackLngVarargs(value: String*): Self = StObject.set(x, "fallbackLng", js.Array(value :_*))
    }
  }
  
  type LanguageDetectorCaches = Boolean | js.Array[String]
  
  @js.native
  trait LanguageDetectorInterface extends StObject {
    
    var cacheUserLanguage: js.UndefOr[
        js.Function4[
          /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
          /* res */ Response_[js.Any], 
          /* lng */ String, 
          /* options */ js.UndefOr[js.Object], 
          Unit
        ]
      ] = js.native
    
    def lookup(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any]): String | js.Array[String] = js.native
    def lookup(
      req: Request_[ParamsDictionary, js.Any, js.Any, Query],
      res: Response_[js.Any],
      options: LanguageDetectorInterfaceOptions
    ): String | js.Array[String] = js.native
    
    var name: String = js.native
  }
  
  type LanguageDetectorInterfaceOptions = StringDictionary[js.Any]
  
  trait LanguageDetectorOptions extends StObject {
    
    var caches: js.UndefOr[LanguageDetectorCaches] = js.undefined
    
    var cookieDomain: js.UndefOr[String] = js.undefined
    
    var cookieExpirationDate: js.UndefOr[Date] = js.undefined
    
    var lookupCookie: js.UndefOr[String] = js.undefined
    
    var lookupFromPathIndex: js.UndefOr[Double] = js.undefined
    
    var lookupQuerystring: js.UndefOr[String] = js.undefined
    
    var lookupSession: js.UndefOr[String] = js.undefined
    
    var order: js.UndefOr[LanguageDetectorOrder] = js.undefined
  }
  object LanguageDetectorOptions {
    
    @scala.inline
    def apply(): LanguageDetectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LanguageDetectorOptions]
    }
    
    @scala.inline
    implicit class LanguageDetectorOptionsMutableBuilder[Self <: LanguageDetectorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaches(value: LanguageDetectorCaches): Self = StObject.set(x, "caches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachesUndefined: Self = StObject.set(x, "caches", js.undefined)
      
      @scala.inline
      def setCachesVarargs(value: String*): Self = StObject.set(x, "caches", js.Array(value :_*))
      
      @scala.inline
      def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      @scala.inline
      def setCookieExpirationDate(value: Date): Self = StObject.set(x, "cookieExpirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieExpirationDateUndefined: Self = StObject.set(x, "cookieExpirationDate", js.undefined)
      
      @scala.inline
      def setLookupCookie(value: String): Self = StObject.set(x, "lookupCookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupCookieUndefined: Self = StObject.set(x, "lookupCookie", js.undefined)
      
      @scala.inline
      def setLookupFromPathIndex(value: Double): Self = StObject.set(x, "lookupFromPathIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupFromPathIndexUndefined: Self = StObject.set(x, "lookupFromPathIndex", js.undefined)
      
      @scala.inline
      def setLookupQuerystring(value: String): Self = StObject.set(x, "lookupQuerystring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupQuerystringUndefined: Self = StObject.set(x, "lookupQuerystring", js.undefined)
      
      @scala.inline
      def setLookupSession(value: String): Self = StObject.set(x, "lookupSession", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupSessionUndefined: Self = StObject.set(x, "lookupSession", js.undefined)
      
      @scala.inline
      def setOrder(value: LanguageDetectorOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value :_*))
    }
  }
  
  type LanguageDetectorOrder = js.Array[String]
  
  // LanguageDetector
  type LanguageDetectorServices = js.Any
  
  trait MissingKeyHandlerOptions extends StObject {
    
    var lngParam: js.UndefOr[String] = js.undefined
    
    var nsParam: js.UndefOr[String] = js.undefined
  }
  object MissingKeyHandlerOptions {
    
    @scala.inline
    def apply(): MissingKeyHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MissingKeyHandlerOptions]
    }
    
    @scala.inline
    implicit class MissingKeyHandlerOptionsMutableBuilder[Self <: MissingKeyHandlerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLngParam(value: String): Self = StObject.set(x, "lngParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLngParamUndefined: Self = StObject.set(x, "lngParam", js.undefined)
      
      @scala.inline
      def setNsParam(value: String): Self = StObject.set(x, "nsParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNsParamUndefined: Self = StObject.set(x, "nsParam", js.undefined)
    }
  }
}

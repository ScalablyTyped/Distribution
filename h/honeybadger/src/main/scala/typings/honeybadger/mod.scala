package typings.honeybadger

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.ErrorRequestHandler
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.eventsMod.EventEmitter
import typings.std.Console
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("honeybadger", JSImport.Namespace)
  @js.native
  val ^ : HoneyBadgerInstance = js.native
  
  type CallbackFunction = js.Function2[/* err */ Error | Null, /* notice */ js.Object | Null, Unit]
  
  @js.native
  trait ConfigureOptions extends StObject {
    
    var apiKey: String = js.native
    
    var developmentEnvironments: js.UndefOr[js.Array[String]] = js.native
    
    var endpoint: js.UndefOr[String] = js.native
    
    var environment: js.UndefOr[String] = js.native
    
    var filters: js.UndefOr[js.Array[String]] = js.native
    
    var hostname: js.UndefOr[String] = js.native
    
    var logger: js.UndefOr[Console] = js.native
    
    var projectRoot: js.UndefOr[String] = js.native
  }
  object ConfigureOptions {
    
    @scala.inline
    def apply(apiKey: String): ConfigureOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigureOptions]
    }
    
    @scala.inline
    implicit class ConfigureOptionsMutableBuilder[Self <: ConfigureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevelopmentEnvironments(value: js.Array[String]): Self = StObject.set(x, "developmentEnvironments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevelopmentEnvironmentsUndefined: Self = StObject.set(x, "developmentEnvironments", js.undefined)
      
      @scala.inline
      def setDevelopmentEnvironmentsVarargs(value: String*): Self = StObject.set(x, "developmentEnvironments", js.Array(value :_*))
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setLogger(value: Console): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
    }
  }
  
  @js.native
  trait HoneyBadgerInstance extends EventEmitter {
    
    def configure(options: ConfigureOptions): Unit = js.native
    
    def errorHandler(
      err: js.Any,
      req: Request[ParamsDictionary, _, _, Query],
      res: Response[_, Double],
      next: NextFunction
    ): js.Any = js.native
    @JSName("errorHandler")
    var errorHandler_Original: ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def factory(): HoneyBadgerInstance = js.native
    def factory(options: ConfigureOptions): HoneyBadgerInstance = js.native
    
    def lambdaHandler(handler: LambdaHandler): LambdaHandler = js.native
    
    def notify(
      err: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      extra: js.UndefOr[scala.Nothing],
      callback: CallbackFunction
    ): Unit = js.native
    def notify(err: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], extra: CallbackFunction): Unit = js.native
    def notify(
      err: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      extra: CallbackFunction,
      callback: CallbackFunction
    ): Unit = js.native
    def notify(err: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], extra: metadata): Unit = js.native
    def notify(
      err: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      extra: metadata,
      callback: CallbackFunction
    ): Unit = js.native
    def notify(err: js.UndefOr[scala.Nothing], name: js.Any): Unit = js.native
    def notify(
      err: js.UndefOr[scala.Nothing],
      name: js.Any,
      extra: js.UndefOr[scala.Nothing],
      callback: CallbackFunction
    ): Unit = js.native
    def notify(err: js.UndefOr[scala.Nothing], name: js.Any, extra: CallbackFunction): Unit = js.native
    def notify(err: js.UndefOr[scala.Nothing], name: js.Any, extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def notify(err: js.UndefOr[scala.Nothing], name: js.Any, extra: metadata): Unit = js.native
    def notify(err: js.UndefOr[scala.Nothing], name: js.Any, extra: metadata, callback: CallbackFunction): Unit = js.native
    def notify(err: js.Any): Unit = js.native
    def notify(
      err: js.Any,
      name: js.UndefOr[scala.Nothing],
      extra: js.UndefOr[scala.Nothing],
      callback: CallbackFunction
    ): Unit = js.native
    def notify(err: js.Any, name: js.UndefOr[scala.Nothing], extra: CallbackFunction): Unit = js.native
    def notify(err: js.Any, name: js.UndefOr[scala.Nothing], extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def notify(err: js.Any, name: js.UndefOr[scala.Nothing], extra: metadata): Unit = js.native
    def notify(err: js.Any, name: js.UndefOr[scala.Nothing], extra: metadata, callback: CallbackFunction): Unit = js.native
    def notify(err: js.Any, name: js.Any): Unit = js.native
    def notify(err: js.Any, name: js.Any, extra: js.UndefOr[scala.Nothing], callback: CallbackFunction): Unit = js.native
    def notify(err: js.Any, name: js.Any, extra: CallbackFunction): Unit = js.native
    def notify(err: js.Any, name: js.Any, extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def notify(err: js.Any, name: js.Any, extra: metadata): Unit = js.native
    def notify(err: js.Any, name: js.Any, extra: metadata, callback: CallbackFunction): Unit = js.native
    
    def onUncaughtException(func: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    def requestHandler(req: Request[ParamsDictionary, _, _, Query], res: Response[_, Double], next: NextFunction): js.Any = js.native
    @JSName("requestHandler")
    var requestHandler_Original: RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def resetContext(): Unit = js.native
    def resetContext(context: js.Object): Unit = js.native
    
    def setContext(context: js.Object): Unit = js.native
  }
  
  type LambdaHandler = js.Function2[/* event */ js.Object, /* context */ js.Object, Unit]
  
  type _To = HoneyBadgerInstance
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: HoneyBadgerInstance = ^
  
  @js.native
  trait metadata extends StObject {
    
    var action: js.UndefOr[String] = js.native
    
    var cgiData: js.UndefOr[js.Object] = js.native
    
    var component: js.UndefOr[String] = js.native
    
    var context: js.UndefOr[js.Object] = js.native
    
    var fingerprint: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[js.Object] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var params: js.UndefOr[js.Object] = js.native
    
    var session: js.UndefOr[js.Object] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object metadata {
    
    @scala.inline
    def apply(): metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[metadata]
    }
    
    @scala.inline
    implicit class metadataMutableBuilder[Self <: metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCgiData(value: js.Object): Self = StObject.set(x, "cgiData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCgiDataUndefined: Self = StObject.set(x, "cgiData", js.undefined)
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setSession(value: js.Object): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}

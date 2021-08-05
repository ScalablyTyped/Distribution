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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("honeybadger", JSImport.Namespace)
  @js.native
  val ^ : HoneyBadgerInstance = js.native
  
  type CallbackFunction = js.Function2[/* err */ Error | Null, /* notice */ js.Object | Null, Unit]
  
  trait ConfigureOptions extends StObject {
    
    var apiKey: String
    
    var developmentEnvironments: js.UndefOr[js.Array[String]] = js.undefined
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
    
    var filters: js.UndefOr[js.Array[String]] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var logger: js.UndefOr[Console] = js.undefined
    
    var projectRoot: js.UndefOr[String] = js.undefined
  }
  object ConfigureOptions {
    
    inline def apply(apiKey: String): ConfigureOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigureOptions]
    }
    
    extension [Self <: ConfigureOptions](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setDevelopmentEnvironments(value: js.Array[String]): Self = StObject.set(x, "developmentEnvironments", value.asInstanceOf[js.Any])
      
      inline def setDevelopmentEnvironmentsUndefined: Self = StObject.set(x, "developmentEnvironments", js.undefined)
      
      inline def setDevelopmentEnvironmentsVarargs(value: String*): Self = StObject.set(x, "developmentEnvironments", js.Array(value :_*))
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setLogger(value: Console): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
    }
  }
  
  @js.native
  trait HoneyBadgerInstance extends EventEmitter {
    
    def configure(options: ConfigureOptions): Unit = js.native
    
    def errorHandler(
      err: js.Any,
      req: Request[ParamsDictionary, js.Any, js.Any, Query],
      res: Response[js.Any, Double],
      next: NextFunction
    ): js.Any = js.native
    @JSName("errorHandler")
    var errorHandler_Original: ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    
    def factory(): HoneyBadgerInstance = js.native
    def factory(options: ConfigureOptions): HoneyBadgerInstance = js.native
    
    def lambdaHandler(handler: LambdaHandler): LambdaHandler = js.native
    
    def notify(err: js.Any): Unit = js.native
    def notify(err: js.Any, name: js.Any): Unit = js.native
    def notify(err: js.Any, name: js.Any, extra: Unit, callback: CallbackFunction): Unit = js.native
    def notify(err: js.Any, name: js.Any, extra: CallbackFunction): Unit = js.native
    def notify(err: js.Any, name: js.Any, extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def notify(err: js.Any, name: js.Any, extra: metadata): Unit = js.native
    def notify(err: js.Any, name: js.Any, extra: metadata, callback: CallbackFunction): Unit = js.native
    def notify(err: js.Any, name: Unit, extra: Unit, callback: CallbackFunction): Unit = js.native
    def notify(err: js.Any, name: Unit, extra: CallbackFunction): Unit = js.native
    def notify(err: js.Any, name: Unit, extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def notify(err: js.Any, name: Unit, extra: metadata): Unit = js.native
    def notify(err: js.Any, name: Unit, extra: metadata, callback: CallbackFunction): Unit = js.native
    def notify(err: Unit, name: js.Any): Unit = js.native
    def notify(err: Unit, name: js.Any, extra: Unit, callback: CallbackFunction): Unit = js.native
    def notify(err: Unit, name: js.Any, extra: CallbackFunction): Unit = js.native
    def notify(err: Unit, name: js.Any, extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def notify(err: Unit, name: js.Any, extra: metadata): Unit = js.native
    def notify(err: Unit, name: js.Any, extra: metadata, callback: CallbackFunction): Unit = js.native
    def notify(err: Unit, name: Unit, extra: Unit, callback: CallbackFunction): Unit = js.native
    def notify(err: Unit, name: Unit, extra: CallbackFunction): Unit = js.native
    def notify(err: Unit, name: Unit, extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def notify(err: Unit, name: Unit, extra: metadata): Unit = js.native
    def notify(err: Unit, name: Unit, extra: metadata, callback: CallbackFunction): Unit = js.native
    
    def onUncaughtException(func: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    def requestHandler(
      req: Request[ParamsDictionary, js.Any, js.Any, Query],
      res: Response[js.Any, Double],
      next: NextFunction
    ): js.Any = js.native
    @JSName("requestHandler")
    var requestHandler_Original: RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    
    def resetContext(): Unit = js.native
    def resetContext(context: js.Object): Unit = js.native
    
    def setContext(context: js.Object): Unit = js.native
  }
  
  type LambdaHandler = js.Function2[/* event */ js.Object, /* context */ js.Object, Unit]
  
  type _To = HoneyBadgerInstance
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: HoneyBadgerInstance = ^
  
  trait metadata extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
    
    var cgiData: js.UndefOr[js.Object] = js.undefined
    
    var component: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[js.Object] = js.undefined
    
    var fingerprint: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var session: js.UndefOr[js.Object] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object metadata {
    
    inline def apply(): metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[metadata]
    }
    
    extension [Self <: metadata](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCgiData(value: js.Object): Self = StObject.set(x, "cgiData", value.asInstanceOf[js.Any])
      
      inline def setCgiDataUndefined: Self = StObject.set(x, "cgiData", js.undefined)
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setSession(value: js.Object): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}

package typings.httpProxyMiddleware

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.httpProxy.mod.ProxyTarget
import typings.httpProxy.mod.ServerOptions
import typings.httpProxyMiddleware.anon.PartialUrl
import typings.httpProxyMiddleware.httpProxyMiddlewareStrings.debug
import typings.httpProxyMiddleware.httpProxyMiddlewareStrings.error
import typings.httpProxyMiddleware.httpProxyMiddlewareStrings.info
import typings.httpProxyMiddleware.httpProxyMiddlewareStrings.silent
import typings.httpProxyMiddleware.httpProxyMiddlewareStrings.warn
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.netMod.Socket
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type Filter = String | js.Array[String] | (js.Function2[/* pathname */ String, /* req */ Request, Boolean])
  
  trait LogProvider extends StObject {
    
    var debug: js.UndefOr[Logger] = js.undefined
    
    var error: js.UndefOr[Logger] = js.undefined
    
    var info: js.UndefOr[Logger] = js.undefined
    
    def log(args: Any*): Unit
    @JSName("log")
    var log_Original: Logger
    
    var warn: js.UndefOr[Logger] = js.undefined
  }
  object LogProvider {
    
    inline def apply(log: Logger): LogProvider = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogProvider] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Logger): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setError(value: Logger): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInfo(value: Logger): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: Logger): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  type LogProviderCallback = js.Function1[/* provider */ LogProvider, LogProvider]
  
  @js.native
  trait Logger extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  type OnCloseCallback = js.Function3[/* proxyRes */ Response, /* proxySocket */ Socket, /* proxyHead */ Any, Unit]
  
  type OnErrorCallback = js.Function4[
    /* err */ js.Error, 
    /* req */ Request, 
    /* res */ Response, 
    /* target */ js.UndefOr[String | PartialUrl], 
    Unit
  ]
  
  type OnOpenCallback = js.Function1[/* proxySocket */ Socket, Unit]
  
  type OnProxyReqCallback = js.Function4[
    /* proxyReq */ ClientRequest, 
    /* req */ Request, 
    /* res */ Response, 
    /* options */ ServerOptions, 
    Unit
  ]
  
  type OnProxyReqWsCallback = js.Function5[
    /* proxyReq */ ClientRequest, 
    /* req */ Request, 
    /* socket */ Socket, 
    /* options */ ServerOptions, 
    /* head */ Any, 
    Unit
  ]
  
  type OnProxyResCallback = js.Function3[/* proxyRes */ IncomingMessage, /* req */ Request, /* res */ Response, Unit]
  
  trait Options
    extends StObject
       with ServerOptions {
    
    var logLevel: js.UndefOr[debug | info | warn | error | silent] = js.undefined
    
    var logProvider: js.UndefOr[LogProviderCallback] = js.undefined
    
    var onClose: js.UndefOr[OnCloseCallback] = js.undefined
    
    var onError: js.UndefOr[OnErrorCallback] = js.undefined
    
    var onOpen: js.UndefOr[OnOpenCallback] = js.undefined
    
    var onProxyReq: js.UndefOr[OnProxyReqCallback] = js.undefined
    
    var onProxyReqWs: js.UndefOr[OnProxyReqWsCallback] = js.undefined
    
    var onProxyRes: js.UndefOr[OnProxyResCallback] = js.undefined
    
    var pathRewrite: js.UndefOr[
        StringDictionary[String] | (js.Function2[/* path */ String, /* req */ Request, js.Promise[String] | String])
      ] = js.undefined
    
    var router: js.UndefOr[
        StringDictionary[js.UndefOr[ProxyTarget]] | (js.Function1[/* req */ Request, js.UndefOr[js.Promise[js.UndefOr[ProxyTarget]] | ProxyTarget]])
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLogLevel(value: debug | info | warn | error | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogProvider(value: /* provider */ LogProvider => LogProvider): Self = StObject.set(x, "logProvider", js.Any.fromFunction1(value))
      
      inline def setLogProviderUndefined: Self = StObject.set(x, "logProvider", js.undefined)
      
      inline def setOnClose(value: (/* proxyRes */ Response, /* proxySocket */ Socket, /* proxyHead */ Any) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction3(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnError(
        value: (/* err */ js.Error, /* req */ Request, /* res */ Response, /* target */ js.UndefOr[String | PartialUrl]) => Unit
      ): Self = StObject.set(x, "onError", js.Any.fromFunction4(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnOpen(value: /* proxySocket */ Socket => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnProxyReq(
        value: (/* proxyReq */ ClientRequest, /* req */ Request, /* res */ Response, /* options */ ServerOptions) => Unit
      ): Self = StObject.set(x, "onProxyReq", js.Any.fromFunction4(value))
      
      inline def setOnProxyReqUndefined: Self = StObject.set(x, "onProxyReq", js.undefined)
      
      inline def setOnProxyReqWs(
        value: (/* proxyReq */ ClientRequest, /* req */ Request, /* socket */ Socket, /* options */ ServerOptions, /* head */ Any) => Unit
      ): Self = StObject.set(x, "onProxyReqWs", js.Any.fromFunction5(value))
      
      inline def setOnProxyReqWsUndefined: Self = StObject.set(x, "onProxyReqWs", js.undefined)
      
      inline def setOnProxyRes(value: (/* proxyRes */ IncomingMessage, /* req */ Request, /* res */ Response) => Unit): Self = StObject.set(x, "onProxyRes", js.Any.fromFunction3(value))
      
      inline def setOnProxyResUndefined: Self = StObject.set(x, "onProxyRes", js.undefined)
      
      inline def setPathRewrite(
        value: StringDictionary[String] | (js.Function2[/* path */ String, /* req */ Request, js.Promise[String] | String])
      ): Self = StObject.set(x, "pathRewrite", value.asInstanceOf[js.Any])
      
      inline def setPathRewriteFunction2(value: (/* path */ String, /* req */ Request) => js.Promise[String] | String): Self = StObject.set(x, "pathRewrite", js.Any.fromFunction2(value))
      
      inline def setPathRewriteUndefined: Self = StObject.set(x, "pathRewrite", js.undefined)
      
      inline def setRouter(
        value: StringDictionary[js.UndefOr[ProxyTarget]] | (js.Function1[/* req */ Request, js.UndefOr[js.Promise[js.UndefOr[ProxyTarget]] | ProxyTarget]])
      ): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setRouterFunction1(value: /* req */ Request => js.UndefOr[js.Promise[js.UndefOr[ProxyTarget]] | ProxyTarget]): Self = StObject.set(x, "router", js.Any.fromFunction1(value))
      
      inline def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
    }
  }
  
  type Request = Request_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]
  
  @js.native
  trait RequestHandler
    extends typings.expressServeStaticCore.mod.RequestHandler {
    
    var upgrade: js.UndefOr[js.Function3[/* req */ Request, /* socket */ Socket, /* head */ Any, Unit]] = js.native
  }
  
  type Response = Response_[Any, Record[String, Any]]
}

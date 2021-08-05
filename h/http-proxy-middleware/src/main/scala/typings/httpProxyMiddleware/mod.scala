package typings.httpProxyMiddleware

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.NextHandleFunction
import typings.httpProxy.mod.ServerOptions
import typings.httpProxyMiddleware.httpProxyMiddlewareBooleans.`false`
import typings.httpProxyMiddleware.httpProxyMiddlewareStrings.debug
import typings.httpProxyMiddleware.httpProxyMiddlewareStrings.error
import typings.httpProxyMiddleware.httpProxyMiddlewareStrings.info
import typings.httpProxyMiddleware.httpProxyMiddlewareStrings.silent
import typings.httpProxyMiddleware.httpProxyMiddlewareStrings.warn
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.node.streamMod.Readable
import typings.node.tlsMod.TlsOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(config: Config): Proxy = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Proxy]
  inline def apply(contextOrUri: String): Proxy = ^.asInstanceOf[js.Dynamic].apply(contextOrUri.asInstanceOf[js.Any]).asInstanceOf[Proxy]
  inline def apply(contextOrUri: String, config: Config): Proxy = (^.asInstanceOf[js.Dynamic].apply(contextOrUri.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Proxy]
  inline def apply(contextOrUri: js.Array[String]): Proxy = ^.asInstanceOf[js.Dynamic].apply(contextOrUri.asInstanceOf[js.Any]).asInstanceOf[Proxy]
  inline def apply(contextOrUri: js.Array[String], config: Config): Proxy = (^.asInstanceOf[js.Dynamic].apply(contextOrUri.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Proxy]
  inline def apply(contextOrUri: Filter): Proxy = ^.asInstanceOf[js.Dynamic].apply(contextOrUri.asInstanceOf[js.Any]).asInstanceOf[Proxy]
  inline def apply(contextOrUri: Filter, config: Config): Proxy = (^.asInstanceOf[js.Dynamic].apply(contextOrUri.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Proxy]
  
  @JSImport("http-proxy-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Config extends StObject {
    
    var agent: js.UndefOr[Agent] = js.undefined
    
    var auth: js.UndefOr[String] = js.undefined
    
    var autoRewrite: js.UndefOr[Boolean] = js.undefined
    
    var buffer: js.UndefOr[Readable] = js.undefined
    
    var changeOrigin: js.UndefOr[Boolean] = js.undefined
    
    var cookieDomainRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.undefined
    
    var cookiePathRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.undefined
    
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    var forward: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var hostRewrite: js.UndefOr[String] = js.undefined
    
    var ignorePath: js.UndefOr[Boolean] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[debug | info | warn | error | silent] = js.undefined
    
    var logProvider: js.UndefOr[js.Function1[/* provider */ LogProvider, LogProvider]] = js.undefined
    
    var onClose: js.UndefOr[
        js.Function3[/* res */ IncomingMessage, /* socket */ Socket, /* head */ js.Any, Unit]
      ] = js.undefined
    
    var onError: js.UndefOr[
        js.Function3[/* err */ Error, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]
      ] = js.undefined
    
    var onOpen: js.UndefOr[js.Function1[/* proxySocket */ Socket, Unit]] = js.undefined
    
    var onProxyReq: js.UndefOr[
        js.Function3[
          /* proxyReq */ ClientRequest, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse, 
          Unit
        ]
      ] = js.undefined
    
    var onProxyReqWs: js.UndefOr[
        js.Function5[
          /* proxyReq */ ClientRequest, 
          /* req */ IncomingMessage, 
          /* socket */ Socket, 
          /* options */ ServerOptions, 
          /* head */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var onProxyRes: js.UndefOr[
        js.Function3[
          /* proxyRes */ IncomingMessage, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse, 
          Unit
        ]
      ] = js.undefined
    
    var pathRewrite: js.UndefOr[
        StringDictionary[String] | (js.Function2[/* path */ String, /* req */ IncomingMessage, String])
      ] = js.undefined
    
    var prependPath: js.UndefOr[Boolean] = js.undefined
    
    var preserveHeaderKeyCase: js.UndefOr[Boolean] = js.undefined
    
    var protocolRewrite: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated
      */
    var proxyHost: js.UndefOr[js.Any] = js.undefined
    
    /**
      * @deprecated
      */
    var proxyTable: js.UndefOr[js.Any] = js.undefined
    
    var proxyTimeout: js.UndefOr[Double] = js.undefined
    
    var router: js.UndefOr[StringDictionary[String] | (js.Function1[/* req */ IncomingMessage, String])] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var selfHandleResponse: js.UndefOr[Boolean] = js.undefined
    
    var ssl: js.UndefOr[TlsOptions] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var toProxy: js.UndefOr[Boolean] = js.undefined
    
    var ws: js.UndefOr[Boolean] = js.undefined
    
    var xfwd: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setAutoRewrite(value: Boolean): Self = StObject.set(x, "autoRewrite", value.asInstanceOf[js.Any])
      
      inline def setAutoRewriteUndefined: Self = StObject.set(x, "autoRewrite", js.undefined)
      
      inline def setBuffer(value: Readable): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setChangeOrigin(value: Boolean): Self = StObject.set(x, "changeOrigin", value.asInstanceOf[js.Any])
      
      inline def setChangeOriginUndefined: Self = StObject.set(x, "changeOrigin", js.undefined)
      
      inline def setCookieDomainRewrite(value: `false` | String | StringDictionary[String]): Self = StObject.set(x, "cookieDomainRewrite", value.asInstanceOf[js.Any])
      
      inline def setCookieDomainRewriteUndefined: Self = StObject.set(x, "cookieDomainRewrite", js.undefined)
      
      inline def setCookiePathRewrite(value: `false` | String | StringDictionary[String]): Self = StObject.set(x, "cookiePathRewrite", value.asInstanceOf[js.Any])
      
      inline def setCookiePathRewriteUndefined: Self = StObject.set(x, "cookiePathRewrite", js.undefined)
      
      inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      inline def setForward(value: String): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
      
      inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHostRewrite(value: String): Self = StObject.set(x, "hostRewrite", value.asInstanceOf[js.Any])
      
      inline def setHostRewriteUndefined: Self = StObject.set(x, "hostRewrite", js.undefined)
      
      inline def setIgnorePath(value: Boolean): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLogLevel(value: debug | info | warn | error | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogProvider(value: /* provider */ LogProvider => LogProvider): Self = StObject.set(x, "logProvider", js.Any.fromFunction1(value))
      
      inline def setLogProviderUndefined: Self = StObject.set(x, "logProvider", js.undefined)
      
      inline def setOnClose(value: (/* res */ IncomingMessage, /* socket */ Socket, /* head */ js.Any) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction3(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnError(value: (/* err */ Error, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnOpen(value: /* proxySocket */ Socket => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnProxyReq(value: (/* proxyReq */ ClientRequest, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "onProxyReq", js.Any.fromFunction3(value))
      
      inline def setOnProxyReqUndefined: Self = StObject.set(x, "onProxyReq", js.undefined)
      
      inline def setOnProxyReqWs(
        value: (/* proxyReq */ ClientRequest, /* req */ IncomingMessage, /* socket */ Socket, /* options */ ServerOptions, /* head */ js.Any) => Unit
      ): Self = StObject.set(x, "onProxyReqWs", js.Any.fromFunction5(value))
      
      inline def setOnProxyReqWsUndefined: Self = StObject.set(x, "onProxyReqWs", js.undefined)
      
      inline def setOnProxyRes(
        value: (/* proxyRes */ IncomingMessage, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit
      ): Self = StObject.set(x, "onProxyRes", js.Any.fromFunction3(value))
      
      inline def setOnProxyResUndefined: Self = StObject.set(x, "onProxyRes", js.undefined)
      
      inline def setPathRewrite(
        value: StringDictionary[String] | (js.Function2[/* path */ String, /* req */ IncomingMessage, String])
      ): Self = StObject.set(x, "pathRewrite", value.asInstanceOf[js.Any])
      
      inline def setPathRewriteFunction2(value: (/* path */ String, /* req */ IncomingMessage) => String): Self = StObject.set(x, "pathRewrite", js.Any.fromFunction2(value))
      
      inline def setPathRewriteUndefined: Self = StObject.set(x, "pathRewrite", js.undefined)
      
      inline def setPrependPath(value: Boolean): Self = StObject.set(x, "prependPath", value.asInstanceOf[js.Any])
      
      inline def setPrependPathUndefined: Self = StObject.set(x, "prependPath", js.undefined)
      
      inline def setPreserveHeaderKeyCase(value: Boolean): Self = StObject.set(x, "preserveHeaderKeyCase", value.asInstanceOf[js.Any])
      
      inline def setPreserveHeaderKeyCaseUndefined: Self = StObject.set(x, "preserveHeaderKeyCase", js.undefined)
      
      inline def setProtocolRewrite(value: String): Self = StObject.set(x, "protocolRewrite", value.asInstanceOf[js.Any])
      
      inline def setProtocolRewriteUndefined: Self = StObject.set(x, "protocolRewrite", js.undefined)
      
      inline def setProxyHost(value: js.Any): Self = StObject.set(x, "proxyHost", value.asInstanceOf[js.Any])
      
      inline def setProxyHostUndefined: Self = StObject.set(x, "proxyHost", js.undefined)
      
      inline def setProxyTable(value: js.Any): Self = StObject.set(x, "proxyTable", value.asInstanceOf[js.Any])
      
      inline def setProxyTableUndefined: Self = StObject.set(x, "proxyTable", js.undefined)
      
      inline def setProxyTimeout(value: Double): Self = StObject.set(x, "proxyTimeout", value.asInstanceOf[js.Any])
      
      inline def setProxyTimeoutUndefined: Self = StObject.set(x, "proxyTimeout", js.undefined)
      
      inline def setRouter(value: StringDictionary[String] | (js.Function1[/* req */ IncomingMessage, String])): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setRouterFunction1(value: /* req */ IncomingMessage => String): Self = StObject.set(x, "router", js.Any.fromFunction1(value))
      
      inline def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSelfHandleResponse(value: Boolean): Self = StObject.set(x, "selfHandleResponse", value.asInstanceOf[js.Any])
      
      inline def setSelfHandleResponseUndefined: Self = StObject.set(x, "selfHandleResponse", js.undefined)
      
      inline def setSsl(value: TlsOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setToProxy(value: Boolean): Self = StObject.set(x, "toProxy", value.asInstanceOf[js.Any])
      
      inline def setToProxyUndefined: Self = StObject.set(x, "toProxy", js.undefined)
      
      inline def setWs(value: Boolean): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
      
      inline def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
      
      inline def setXfwd(value: Boolean): Self = StObject.set(x, "xfwd", value.asInstanceOf[js.Any])
      
      inline def setXfwdUndefined: Self = StObject.set(x, "xfwd", js.undefined)
    }
  }
  
  type Filter = js.Function2[/* pathname */ String, /* req */ IncomingMessage, Boolean]
  
  trait LogProvider extends StObject {
    
    var debug: js.UndefOr[Logger] = js.undefined
    
    var error: js.UndefOr[Logger] = js.undefined
    
    var info: js.UndefOr[Logger] = js.undefined
    
    def log(args: js.Any*): Unit
    @JSName("log")
    var log_Original: Logger
    
    var warn: js.UndefOr[Logger] = js.undefined
  }
  object LogProvider {
    
    inline def apply(log: Logger): LogProvider = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogProvider]
    }
    
    extension [Self <: LogProvider](x: Self) {
      
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
  
  @js.native
  trait Logger extends StObject {
    
    def apply(args: js.Any*): Unit = js.native
  }
  
  type Proxy = NextHandleFunction
}

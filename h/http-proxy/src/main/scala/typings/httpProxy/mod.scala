package typings.httpProxy

import org.scalablytyped.runtime.StringDictionary
import typings.httpProxy.anon.PartialUrl
import typings.httpProxy.httpProxyBooleans.`false`
import typings.httpProxy.httpProxyStrings.close
import typings.httpProxy.httpProxyStrings.econnreset
import typings.httpProxy.httpProxyStrings.end
import typings.httpProxy.httpProxyStrings.error
import typings.httpProxy.httpProxyStrings.proxyReq
import typings.httpProxy.httpProxyStrings.proxyReqWs
import typings.httpProxy.httpProxyStrings.proxyRes
import typings.httpProxy.httpProxyStrings.start
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.node.streamMod.Stream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http-proxy", JSImport.Namespace)
  @js.native
  /**
    * Creates the proxy server with specified options.
    * @param options - Config object passed to the proxy
    */
  class ^ () extends Server {
    def this(options: ServerOptions) = this()
  }
  
  /**
    * Creates the proxy server with specified options.
    * @param options Config object passed to the proxy
    * @returns Proxy object with handlers for `ws` and `web` requests
    */
  /* static member */
  @JSImport("http-proxy", "createProxy")
  @js.native
  def createProxy(): Server = js.native
  @JSImport("http-proxy", "createProxy")
  @js.native
  def createProxy(options: ServerOptions): Server = js.native
  
  /**
    * Creates the proxy server with specified options.
    * @param options Config object passed to the proxy
    * @returns Proxy object with handlers for `ws` and `web` requests
    */
  /* static member */
  @JSImport("http-proxy", "createProxyServer")
  @js.native
  def createProxyServer(): Server = js.native
  @JSImport("http-proxy", "createProxyServer")
  @js.native
  def createProxyServer(options: ServerOptions): Server = js.native
  
  /**
    * Creates the proxy server with specified options.
    * @param options Config object passed to the proxy
    * @returns Proxy object with handlers for `ws` and `web` requests
    */
  /* static member */
  @JSImport("http-proxy", "createServer")
  @js.native
  def createServer(): Server = js.native
  @JSImport("http-proxy", "createServer")
  @js.native
  def createServer(options: ServerOptions): Server = js.native
  
  type ErrorCallback = js.Function4[
    /* err */ Error, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* target */ js.UndefOr[ProxyTargetUrl], 
    Unit
  ]
  
  type ProxyTarget = ProxyTargetUrl | ProxyTargetDetailed
  
  @js.native
  trait ProxyTargetDetailed extends StObject {
    
    var ca: js.UndefOr[String] = js.native
    
    var cert: js.UndefOr[String] = js.native
    
    var ciphers: js.UndefOr[String] = js.native
    
    var host: String = js.native
    
    var hostname: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var passphrase: js.UndefOr[String] = js.native
    
    var pfx: js.UndefOr[Buffer | String] = js.native
    
    var port: Double = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var secureProtocol: js.UndefOr[String] = js.native
    
    var socketPath: js.UndefOr[String] = js.native
  }
  object ProxyTargetDetailed {
    
    @scala.inline
    def apply(host: String, port: Double): ProxyTargetDetailed = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyTargetDetailed]
    }
    
    @scala.inline
    implicit class ProxyTargetDetailedMutableBuilder[Self <: ProxyTargetDetailed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPfx(value: Buffer | String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    }
  }
  
  type ProxyTargetUrl = String | PartialUrl
  
  @js.native
  trait Server extends EventEmitter {
    
    def addListener(event: String, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * A function that closes the inner webserver and stops listening on given port
      */
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * A function that wraps the object in a webserver, for your convenience
      * @param port - Port to listen on
      */
    def listen(port: Double): Server = js.native
    
    def on(event: String, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_close(
      event: close,
      listener: js.Function3[/* proxyRes */ IncomingMessage, /* proxySocket */ Socket, /* proxyHead */ js.Any, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_econnreset(
      event: econnreset,
      listener: js.Function4[
          /* err */ Error, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse, 
          /* target */ ProxyTargetUrl, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_end(
      event: end,
      listener: js.Function3[
          /* req */ IncomingMessage, 
          /* res */ ServerResponse, 
          /* proxyRes */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: ErrorCallback): this.type = js.native
    @JSName("on")
    def on_proxyReq(
      event: proxyReq,
      listener: js.Function4[
          /* proxyReq */ ClientRequest, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse, 
          /* options */ ServerOptions, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_proxyReqWs(
      event: proxyReqWs,
      listener: js.Function5[
          /* proxyReq */ ClientRequest, 
          /* req */ IncomingMessage, 
          /* socket */ Socket, 
          /* options */ ServerOptions, 
          /* head */ js.Any, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_proxyRes(
      event: proxyRes,
      listener: js.Function3[
          /* proxyRes */ IncomingMessage, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_start(
      event: start,
      listener: js.Function3[/* req */ IncomingMessage, /* res */ ServerResponse, /* target */ ProxyTargetUrl, Unit]
    ): this.type = js.native
    
    def once(event: String, listener: js.Function0[Unit]): this.type = js.native
    
    def removeListener(event: String, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Used for proxying regular HTTP(S) requests
      * @param req - Client request.
      * @param res - Client response.
      * @param options - Additionnal options.
      */
    def web(req: IncomingMessage, res: ServerResponse): Unit = js.native
    def web(
      req: IncomingMessage,
      res: ServerResponse,
      options: js.UndefOr[scala.Nothing],
      callback: ErrorCallback
    ): Unit = js.native
    def web(req: IncomingMessage, res: ServerResponse, options: ServerOptions): Unit = js.native
    def web(req: IncomingMessage, res: ServerResponse, options: ServerOptions, callback: ErrorCallback): Unit = js.native
    
    /**
      * Used for proxying regular HTTP(S) requests
      * @param req - Client request.
      * @param socket - Client socket.
      * @param head - Client head.
      * @param options - Additionnal options.
      */
    def ws(req: IncomingMessage, socket: js.Any, head: js.Any): Unit = js.native
    def ws(
      req: IncomingMessage,
      socket: js.Any,
      head: js.Any,
      options: js.UndefOr[scala.Nothing],
      callback: ErrorCallback
    ): Unit = js.native
    def ws(req: IncomingMessage, socket: js.Any, head: js.Any, options: ServerOptions): Unit = js.native
    def ws(
      req: IncomingMessage,
      socket: js.Any,
      head: js.Any,
      options: ServerOptions,
      callback: ErrorCallback
    ): Unit = js.native
  }
  
  @js.native
  trait ServerOptions extends StObject {
    
    /** Object to be passed to http(s).request. */
    var agent: js.UndefOr[js.Any] = js.native
    
    /** Basic authentication i.e. 'user:password' to compute an Authorization header. */
    var auth: js.UndefOr[String] = js.native
    
    /** Rewrites the location host/ port on (301 / 302 / 307 / 308) redirects based on requested host/ port.Default: false. */
    var autoRewrite: js.UndefOr[Boolean] = js.native
    
    /** Buffer */
    var buffer: js.UndefOr[Stream] = js.native
    
    /** Changes the origin of the host header to the target URL. */
    var changeOrigin: js.UndefOr[Boolean] = js.native
    
    /** rewrites domain of set-cookie headers. */
    var cookieDomainRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.native
    
    /** rewrites path of set-cookie headers. Default: false */
    var cookiePathRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.native
    
    /** Specify whether you want to follow redirects. Default: false */
    var followRedirects: js.UndefOr[Boolean] = js.native
    
    /** URL string to be parsed with the url module. */
    var forward: js.UndefOr[ProxyTargetUrl] = js.native
    
    /** object with extra headers to be added to target requests. */
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    /** Rewrites the location hostname on (301 / 302 / 307 / 308) redirects, Default: null. */
    var hostRewrite: js.UndefOr[String] = js.native
    
    /** Specify whether you want to ignore the proxy path of the incoming request. */
    var ignorePath: js.UndefOr[Boolean] = js.native
    
    /** Local interface string to bind for outgoing connections. */
    var localAddress: js.UndefOr[String] = js.native
    
    /** Specify whether you want to prepend the target's path to the proxy path. */
    var prependPath: js.UndefOr[Boolean] = js.native
    
    /** specify whether you want to keep letter case of response header key */
    var preserveHeaderKeyCase: js.UndefOr[Boolean] = js.native
    
    /** Rewrites the location protocol on (301 / 302 / 307 / 308) redirects to 'http' or 'https'.Default: null. */
    var protocolRewrite: js.UndefOr[String] = js.native
    
    /** Timeout (in milliseconds) when proxy receives no response from target. Default: 120000 (2 minutes) */
    var proxyTimeout: js.UndefOr[Double] = js.native
    
    /** Verify SSL certificate. */
    var secure: js.UndefOr[Boolean] = js.native
    
    /** If set to true, none of the webOutgoing passes are called and it's your responsibility to appropriately return the response by listening and acting on the proxyRes event */
    var selfHandleResponse: js.UndefOr[Boolean] = js.native
    
    /** Object to be passed to https.createServer(). */
    var ssl: js.UndefOr[js.Any] = js.native
    
    /** URL string to be parsed with the url module. */
    var target: js.UndefOr[ProxyTarget] = js.native
    
    /** Timeout (in milliseconds) for incoming requests */
    var timeout: js.UndefOr[Double] = js.native
    
    /** Explicitly specify if we are proxying to another proxy. */
    var toProxy: js.UndefOr[Boolean] = js.native
    
    /** If you want to proxy websockets. */
    var ws: js.UndefOr[Boolean] = js.native
    
    /** Adds x- forward headers. */
    var xfwd: js.UndefOr[Boolean] = js.native
  }
  object ServerOptions {
    
    @scala.inline
    def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    @scala.inline
    implicit class ServerOptionsMutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: js.Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setAutoRewrite(value: Boolean): Self = StObject.set(x, "autoRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRewriteUndefined: Self = StObject.set(x, "autoRewrite", js.undefined)
      
      @scala.inline
      def setBuffer(value: Stream): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setChangeOrigin(value: Boolean): Self = StObject.set(x, "changeOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeOriginUndefined: Self = StObject.set(x, "changeOrigin", js.undefined)
      
      @scala.inline
      def setCookieDomainRewrite(value: `false` | String | StringDictionary[String]): Self = StObject.set(x, "cookieDomainRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieDomainRewriteUndefined: Self = StObject.set(x, "cookieDomainRewrite", js.undefined)
      
      @scala.inline
      def setCookiePathRewrite(value: `false` | String | StringDictionary[String]): Self = StObject.set(x, "cookiePathRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiePathRewriteUndefined: Self = StObject.set(x, "cookiePathRewrite", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setForward(value: ProxyTargetUrl): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHostRewrite(value: String): Self = StObject.set(x, "hostRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostRewriteUndefined: Self = StObject.set(x, "hostRewrite", js.undefined)
      
      @scala.inline
      def setIgnorePath(value: Boolean): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setPrependPath(value: Boolean): Self = StObject.set(x, "prependPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependPathUndefined: Self = StObject.set(x, "prependPath", js.undefined)
      
      @scala.inline
      def setPreserveHeaderKeyCase(value: Boolean): Self = StObject.set(x, "preserveHeaderKeyCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveHeaderKeyCaseUndefined: Self = StObject.set(x, "preserveHeaderKeyCase", js.undefined)
      
      @scala.inline
      def setProtocolRewrite(value: String): Self = StObject.set(x, "protocolRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolRewriteUndefined: Self = StObject.set(x, "protocolRewrite", js.undefined)
      
      @scala.inline
      def setProxyTimeout(value: Double): Self = StObject.set(x, "proxyTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyTimeoutUndefined: Self = StObject.set(x, "proxyTimeout", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSelfHandleResponse(value: Boolean): Self = StObject.set(x, "selfHandleResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfHandleResponseUndefined: Self = StObject.set(x, "selfHandleResponse", js.undefined)
      
      @scala.inline
      def setSsl(value: js.Any): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setTarget(value: ProxyTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setToProxy(value: Boolean): Self = StObject.set(x, "toProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToProxyUndefined: Self = StObject.set(x, "toProxy", js.undefined)
      
      @scala.inline
      def setWs(value: Boolean): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
      
      @scala.inline
      def setXfwd(value: Boolean): Self = StObject.set(x, "xfwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXfwdUndefined: Self = StObject.set(x, "xfwd", js.undefined)
    }
  }
}

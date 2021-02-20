package typings.hoxy

import typings.cheerio.cheerio.CheerioAPI
import typings.hoxy.anon.PartialSlow
import typings.node.Buffer
import typings.node.streamMod.Writable
import typings.std.Error
import typings.std.Record
import typings.std.RegExp
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hoxy", "Cycle")
  @js.native
  class Cycle protected () extends StObject {
    
    /**
      * Stores and retrieves data on a cycle instance. This is useful since the same
      * instance is shared across all interceptors for a given request/response cycle,
      * allowing you to share related data across disparate scopes. With two params this
      * method behaves as a setter, with one param as a getter.
      */
    def data(name: String): js.Any = js.native
    def data(name: String, value: js.Any): js.Any = js.native
    
    /**
      * Provisions responses from the local filesystem. Generally, the reason you'd do
      * this is to be able to edit those files locally and test them as if they were
      * live on the remote server. This action populates the response object; see
      * response population for more info. The completion of this action is asynchronous,
      * so serve() returns a promise.
      *
      * The returned promise resolves after the response has been populated. There are at
      * least three use cases worth mentioning.
      */
    def serve(): js.Promise[Unit] = js.native
    def serve(opts: String): js.Promise[Unit] = js.native
    def serve(opts: ServeOptions): js.Promise[Unit] = js.native
  }
  
  @JSImport("hoxy", "Proxy")
  @js.native
  class Proxy protected () extends StObject {
    protected def this(opts: CreateServerOptions) = this()
    
    /**
      * Stops proxy receiving requests. Finalizes and/or cleans up any
      * resources the proxy uses internally.
      */
    def close(): Unit = js.native
    def close(cb: PossibleErrorCallback): Unit = js.native
    
    /**
      * This is the entry point for intercepting and operating on requests and responses.
      * This first example intercepts all requests:
      * ```javascript
      * proxy.intercept('request', req => console.log(req.url));
      * ```
      * This is more verbose, but identical to the above:
      * ```javascript
      * proxy.intercept({
      *     phase: 'request'
      * }, function(req, resp, cycle) {
      *     console.log(req.url);
      * });
      * ```
      */
    def intercept(opts: String, handler: InterceptionHandler): Unit = js.native
    def intercept(opts: InterceptOptions, handler: InterceptionHandler): Unit = js.native
    
    /**
      * Starts proxy listening on port. Returns itself.
      * A callback may be provided, to run when the proxy has started listening.
      * This method simply passes its arguments to Node's server.listen() method.
      */
    def listen(port: Double): this.type = js.native
    def listen(port: Double, callback: js.Function0[Unit]): this.type = js.native
    def listen(port: Double, host: String): this.type = js.native
    def listen(port: Double, host: String, backlog: Double): this.type = js.native
    def listen(port: Double, host: String, backlog: Double, callback: js.Function0[Unit]): this.type = js.native
    def listen(port: Double, host: String, callback: js.Function0[Unit]): this.type = js.native
    
    /**
      * Deals with various logging events.
      *
      * This first example listens for error,
      * warn, and debug logging events, and prints them to stderr:
      * ```javascript
      * proxy.log('error warn debug');
      * ```
      * Or, print logging events to various writable streams:
      * ```javascript
      * proxy.log('error warn debug', process.stderr);
      * proxy.log('info', process.stdout);
      * ```
      *
      * Or, explicitly handle logging event:
      * ```javascript
      * proxy.log('error warn', function(event) {
      *     console.error(event.level + ': ' + event.message);
      *     if (event.error) console.error(event.error.stack);
      * });
      * ```
      */
    def log(levels: String): this.type = js.native
    def log(levels: String, cb: LoggerCallbackFunction): this.type = js.native
    def log(levels: String, cb: Writable): this.type = js.native
    
    /**
      * Get/set proxy-level slow options. If options is provided, it's a setter.
      * If options is not provided, it's a getter.
      * @param opts
      */
    def slow(opts: Slow): this.type = js.native
  }
  
  @JSImport("hoxy", "Request")
  @js.native
  class Request protected () extends StObject {
    
    /**
      * Request body binary buffer. This is only present if you intercept the
      * request as:'buffer'. Changes made to this object will be seen by the server.
      */
    var buffer: js.UndefOr[Buffer] = js.native
    
    /**
      * If url is provided, sets the request's absolute protocol, hostname, port and
      * url. Otherwise it returns the absolute URL of this request. This is mainly a
      * convenience method.
      */
    def fullUrl(): String = js.native
    def fullUrl(url: String): String = js.native
    
    /**
      * HTTP request header name/value JS object. These are all-lowercase, e.g. accept-encoding
      */
    var headers: Record[String, String] = js.native
    
    /**
      * Destination server hostname, sans port
      */
    var hostname: String = js.native
    
    /**
      * Request body parsed as JSON. This is only present if you intercept the
      * request as:'json'. Changes made to this object will be seen by the server.
      */
    var json: js.UndefOr[Record[String, _]] = js.native
    
    /**
      * All-caps HTTP method used. Lowercase values are converted to uppercase
      */
    var method: HttpMethod = js.native
    
    /**
      * Request body parsed as form-url-encoded params. This will be a key/value
      * object. This object will only present if you intercept the request
      * as:'params'. Changes made to this object will be seen by the server.
      *
      * Note: parameters from the URL querystring are not included in this object.
      */
    var params: js.UndefOr[Record[String, String]] = js.native
    
    /**
      * Destination server port
      */
    var port: Double = js.native
    
    /**
      * Protocol of the request
      */
    var protocol: String = js.native
    
    /**
      * An object representing querystring params in the URL.
      * For example if the URL is /foo/bar?baz=qux, then this
      * object will look like { baz: 'qux' }.
      */
    var query: Record[String, String] = js.native
    
    /**
      * Simulates slowness during request phase. With this method you can set a minimum
      * latency and/or maximum transfer rate. Since these are minimum/maximum, if your
      * native connection is already slower than these values, this method will have no
      * effect.
      */
    def slow(opts: PartialSlow): Unit = js.native
    
    /**
      * Request body string. This is only present if you intercept the request
      * as:'string'. Overwriting this will overwrite the request body sent to
      * the server.
      */
    var string: js.UndefOr[String] = js.native
    
    /**
      * Whatever request body gets sent to the server, tee() pipes an identical copy
      * to your writable stream. Your stream is held in memory, and only gets written
      * to if and when the request is sent to the server. In other words, your stream
      * sees whatever the server sees. If the server sees nothing, your stream sees
      * nothing. You can tee() as many times as you want.
      *
      * @param stream - target stream
      */
    def tee(stream: Writable): Unit = js.native
    
    /**
      * Root-relative request URL, including query string, like /foo/bar?baz=qux
      */
    var url: String = js.native
  }
  
  @JSImport("hoxy", "Response")
  @js.native
  class Response protected () extends StObject {
    
    /**
      * Response body parsed as DOM. This object is only present if you intercept
      * the response as:'$'. This is a cheerio object, which provides a jQuery-like
      * API. Changes made to it will be seen by the client.
      */
    @JSName("$")
    var $: js.UndefOr[ReturnType[CheerioAPI]] = js.native
    
    /**
      * Response body binary buffer. This is only present if you intercept the
      * response as:'buffer'. Changes made to this object will be seen by the client.
      */
    var buffer: js.UndefOr[Buffer] = js.native
    
    /**
      * HTTP response header name/value JS object. Header names are all-lowercase,
      * such as 'content-type'.
      */
    var headers: Record[String, String] = js.native
    
    /**
      * Response body parsed as JSON. This is only present if you intercept the
      * response as:'json'. Changes to this object will be seen by the client.
      */
    var json: js.UndefOr[js.Any] = js.native
    
    /**
      * Simulates slowness during request phase. With this method you can set a minimum
      * latency and/or maximum transfer rate. Since these are minimum/maximum, if your
      * native connection is already slower than these values, this method will have no
      * effect.
      */
    def slow(opts: PartialSlow): Unit = js.native
    
    /**
      * HTTP status code being sent to the client.
      */
    var statusCode: Double = js.native
    
    /**
      * Response body string. This is only present if you intercept the response
      * as:'string'. Overwriting this will overwrite the response body sent to the
      * client.
      */
    var string: js.UndefOr[String] = js.native
    
    /**
      * Whatever request body gets sent to the server, tee() pipes an identical copy
      * to your writable stream. Your stream is held in memory, and only gets written
      * to if and when the request is sent to the server. In other words, your stream
      * sees whatever the server sees. If the server sees nothing, your stream sees
      * nothing. You can tee() as many times as you want.
      *
      * @param stream - target stream
      */
    def tee(stream: Writable): Unit = js.native
  }
  
  @JSImport("hoxy", "createServer")
  @js.native
  def createServer(): Proxy = js.native
  @JSImport("hoxy", "createServer")
  @js.native
  def createServer(opts: CreateServerOptions): Proxy = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.hoxy.hoxyStrings.$
    - typings.hoxy.hoxyStrings.json
    - typings.hoxy.hoxyStrings.params
    - typings.hoxy.hoxyStrings.buffer
    - typings.hoxy.hoxyStrings.string
  */
  trait BodyParser extends StObject
  object BodyParser {
    
    @scala.inline
    def $: typings.hoxy.hoxyStrings.$ = "$".asInstanceOf[typings.hoxy.hoxyStrings.$]
    
    @scala.inline
    def buffer: typings.hoxy.hoxyStrings.buffer = "buffer".asInstanceOf[typings.hoxy.hoxyStrings.buffer]
    
    @scala.inline
    def json: typings.hoxy.hoxyStrings.json = "json".asInstanceOf[typings.hoxy.hoxyStrings.json]
    
    @scala.inline
    def params: typings.hoxy.hoxyStrings.params = "params".asInstanceOf[typings.hoxy.hoxyStrings.params]
    
    @scala.inline
    def string: typings.hoxy.hoxyStrings.string = "string".asInstanceOf[typings.hoxy.hoxyStrings.string]
  }
  
  @js.native
  trait CertificateParams extends StObject {
    
    var cert: String | (js.Array[Buffer | String]) | Buffer = js.native
    
    var key: String | (js.Array[Buffer | js.Object | String]) | Buffer = js.native
  }
  object CertificateParams {
    
    @scala.inline
    def apply(
      cert: String | (js.Array[Buffer | String]) | Buffer,
      key: String | (js.Array[Buffer | js.Object | String]) | Buffer
    ): CertificateParams = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateParams]
    }
    
    @scala.inline
    implicit class CertificateParamsMutableBuilder[Self <: CertificateParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCert(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertVarargs(value: (Buffer | String)*): Self = StObject.set(x, "cert", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: String | (js.Array[Buffer | js.Object | String]) | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyVarargs(value: (Buffer | js.Object | String)*): Self = StObject.set(x, "key", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CreateServerOptions extends StObject {
    
    /**
      * If present, this should contain a key/cert combo representing a certificate
      * authority that your client trusts. See these instructions for how to
      * generate these files. You'll then need to configure your client to use this
      * proxy for https in addition to http. Once you've got all of that set up,
      * Hoxy will generate fake keys/cert combos for every hostname you visit,
      * caching them in memory for subsequent visits, thus allowing the proxy to
      * handle https requests as cleartext
      */
    var certAuthority: js.UndefOr[CertificateParams] = js.native
    
    /**
      *  If present, this proxy will run as a reverse proxy for the given server.
      *  This allows you to point your client directly at the proxy, instead of
      *  configuring it in the client's proxy settings.
      *  This value should take the form scheme://host:port.
      */
    var reverse: js.UndefOr[String] = js.native
    
    /**
      * Latency emulation
      */
    var slow: js.UndefOr[Slow] = js.native
    
    /**
      * Should only be used in combination with reverse. If present, causes Hoxy to
      * run as an https server. Passed as opts to https.createServer(opts, function)
      */
    var tls: js.UndefOr[CertificateParams] = js.native
    
    /**
      * If present, this proxy will in turn use another proxy.
      * This allows Hoxy to play well with other proxies.
      * This value should take the form host:port
      */
    var upstreamProxy: js.UndefOr[String] = js.native
  }
  object CreateServerOptions {
    
    @scala.inline
    def apply(): CreateServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateServerOptions]
    }
    
    @scala.inline
    implicit class CreateServerOptionsMutableBuilder[Self <: CreateServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertAuthority(value: CertificateParams): Self = StObject.set(x, "certAuthority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertAuthorityUndefined: Self = StObject.set(x, "certAuthority", js.undefined)
      
      @scala.inline
      def setReverse(value: String): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setSlow(value: Slow): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      @scala.inline
      def setTls(value: CertificateParams): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      @scala.inline
      def setUpstreamProxy(value: String): Self = StObject.set(x, "upstreamProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpstreamProxyUndefined: Self = StObject.set(x, "upstreamProxy", js.undefined)
    }
  }
  
  type Filter[T] = RegExp | TesterFunction[T] | T
  
  /* Rewritten from type alias, can be one of: 
    - typings.hoxy.hoxyStrings.POST
    - typings.hoxy.hoxyStrings.GET
    - typings.hoxy.hoxyStrings.PUT
    - typings.hoxy.hoxyStrings.PATCH
    - typings.hoxy.hoxyStrings.DELETE
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    @scala.inline
    def DELETE: typings.hoxy.hoxyStrings.DELETE = "DELETE".asInstanceOf[typings.hoxy.hoxyStrings.DELETE]
    
    @scala.inline
    def GET: typings.hoxy.hoxyStrings.GET = "GET".asInstanceOf[typings.hoxy.hoxyStrings.GET]
    
    @scala.inline
    def PATCH: typings.hoxy.hoxyStrings.PATCH = "PATCH".asInstanceOf[typings.hoxy.hoxyStrings.PATCH]
    
    @scala.inline
    def POST: typings.hoxy.hoxyStrings.POST = "POST".asInstanceOf[typings.hoxy.hoxyStrings.POST]
    
    @scala.inline
    def PUT: typings.hoxy.hoxyStrings.PUT = "PUT".asInstanceOf[typings.hoxy.hoxyStrings.PUT]
  }
  
  @js.native
  trait InterceptOptions extends StObject {
    
    /**
      * Body-parsers
      */
    var as: js.UndefOr[BodyParser] = js.native
    
    /**
      * Match the full content-type header of the request or
      * response (depending on the phase)
      */
    var contentType: js.UndefOr[Filter[String]] = js.native
    
    /**
      * Match the full request URL including protocol and hostname.
      * Patterns like /foo/ * are allowed
      */
    var fullUrl: js.UndefOr[Filter[String]] = js.native
    
    /**
      * Match the host, not including :port.
      */
    var hostname: js.UndefOr[Filter[String]] = js.native
    
    /**
      * Match the all-uppercase HTTP request method
      */
    var method: js.UndefOr[Filter[HttpMethod]] = js.native
    
    /**
      * Match just the mime type portion of the content-type header
      * of the request or response (depending on the phase). I.e.,
      * if the entire header is "text/html; charset=utf-8", just
      * match the "text/html" part
      */
    var mimeType: js.UndefOr[Filter[String]] = js.native
    
    /**
      * Request phase to listen to
      */
    var phase: Phase = js.native
    
    /**
      * Match the port number.
      */
    var port: js.UndefOr[Filter[Double | String]] = js.native
    
    /**
      * Match the request protocol
      */
    var protocol: js.UndefOr[Filter[String]] = js.native
    
    /**
      * Same as contentType but only matches request
      */
    var requestContentType: js.UndefOr[Filter[String]] = js.native
    
    /**
      * Same as mimeType but only matches request
      */
    var requestMimeType: js.UndefOr[Filter[String]] = js.native
    
    /**
      * Same as contentType but only matches response
      */
    var responseContentType: js.UndefOr[Filter[String]] = js.native
    
    /**
      * Same as mimeType but only matches response
      */
    var responseMimeType: js.UndefOr[Filter[String]] = js.native
    
    /**
      * Match the request URL. Patterns like /foo/ * are allowed
      */
    var url: js.UndefOr[Filter[String]] = js.native
  }
  object InterceptOptions {
    
    @scala.inline
    def apply(phase: Phase): InterceptOptions = {
      val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterceptOptions]
    }
    
    @scala.inline
    implicit class InterceptOptionsMutableBuilder[Self <: InterceptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: BodyParser): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setContentType(value: Filter[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeFunction1(value: String => Boolean): Self = StObject.set(x, "contentType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setFullUrl(value: Filter[String]): Self = StObject.set(x, "fullUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullUrlFunction1(value: String => Boolean): Self = StObject.set(x, "fullUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFullUrlUndefined: Self = StObject.set(x, "fullUrl", js.undefined)
      
      @scala.inline
      def setHostname(value: Filter[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameFunction1(value: String => Boolean): Self = StObject.set(x, "hostname", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setMethod(value: Filter[HttpMethod]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodFunction1(value: HttpMethod => Boolean): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMimeType(value: Filter[String]): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeFunction1(value: String => Boolean): Self = StObject.set(x, "mimeType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setPhase(value: Phase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Filter[Double | String]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortFunction1(value: Double | String => Boolean): Self = StObject.set(x, "port", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: Filter[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolFunction1(value: String => Boolean): Self = StObject.set(x, "protocol", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRequestContentType(value: Filter[String]): Self = StObject.set(x, "requestContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestContentTypeFunction1(value: String => Boolean): Self = StObject.set(x, "requestContentType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestContentTypeUndefined: Self = StObject.set(x, "requestContentType", js.undefined)
      
      @scala.inline
      def setRequestMimeType(value: Filter[String]): Self = StObject.set(x, "requestMimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestMimeTypeFunction1(value: String => Boolean): Self = StObject.set(x, "requestMimeType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestMimeTypeUndefined: Self = StObject.set(x, "requestMimeType", js.undefined)
      
      @scala.inline
      def setResponseContentType(value: Filter[String]): Self = StObject.set(x, "responseContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseContentTypeFunction1(value: String => Boolean): Self = StObject.set(x, "responseContentType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResponseContentTypeUndefined: Self = StObject.set(x, "responseContentType", js.undefined)
      
      @scala.inline
      def setResponseMimeType(value: Filter[String]): Self = StObject.set(x, "responseMimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseMimeTypeFunction1(value: String => Boolean): Self = StObject.set(x, "responseMimeType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResponseMimeTypeUndefined: Self = StObject.set(x, "responseMimeType", js.undefined)
      
      @scala.inline
      def setUrl(value: Filter[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlFunction1(value: String => Boolean): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type InterceptionHandler = js.ThisFunction3[
    /* this */ Proxy, 
    /* req */ Request, 
    /* res */ Response, 
    /* cycle */ Cycle, 
    js.Promise[Unit] | Unit
  ]
  
  @js.native
  trait Log extends StObject {
    
    var error: js.UndefOr[Error] = js.native
    
    var level: LogLevel = js.native
    
    var message: String = js.native
  }
  object Log {
    
    @scala.inline
    def apply(level: LogLevel, message: String): Log = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Log]
    }
    
    @scala.inline
    implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hoxy.hoxyStrings.error
    - typings.hoxy.hoxyStrings.warn
    - typings.hoxy.hoxyStrings.info
    - typings.hoxy.hoxyStrings.debug
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    @scala.inline
    def debug: typings.hoxy.hoxyStrings.debug = "debug".asInstanceOf[typings.hoxy.hoxyStrings.debug]
    
    @scala.inline
    def error: typings.hoxy.hoxyStrings.error = "error".asInstanceOf[typings.hoxy.hoxyStrings.error]
    
    @scala.inline
    def info: typings.hoxy.hoxyStrings.info = "info".asInstanceOf[typings.hoxy.hoxyStrings.info]
    
    @scala.inline
    def warn: typings.hoxy.hoxyStrings.warn = "warn".asInstanceOf[typings.hoxy.hoxyStrings.warn]
  }
  
  type LoggerCallbackFunction = js.Function1[/* log */ Log, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.hoxy.hoxyStrings.request
    - typings.hoxy.hoxyStrings.`request-sent`
    - typings.hoxy.hoxyStrings.response
    - typings.hoxy.hoxyStrings.`response-sent`
  */
  trait Phase extends StObject
  object Phase {
    
    @scala.inline
    def request: typings.hoxy.hoxyStrings.request = "request".asInstanceOf[typings.hoxy.hoxyStrings.request]
    
    @scala.inline
    def `request-sent`: typings.hoxy.hoxyStrings.`request-sent` = "request-sent".asInstanceOf[typings.hoxy.hoxyStrings.`request-sent`]
    
    @scala.inline
    def response: typings.hoxy.hoxyStrings.response = "response".asInstanceOf[typings.hoxy.hoxyStrings.response]
    
    @scala.inline
    def `response-sent`: typings.hoxy.hoxyStrings.`response-sent` = "response-sent".asInstanceOf[typings.hoxy.hoxyStrings.`response-sent`]
  }
  
  type PossibleErrorCallback = js.Function1[/* err */ js.UndefOr[Error], js.Any]
  
  @js.native
  trait ServeOptions extends StObject {
    
    /**
      * Which local directory to serve out of. Defaults to filesystem root "/"
      */
    var docroot: js.UndefOr[String] = js.native
    
    /**
      * Which file to serve. Defaults to the request URL. Normally this would
      * be used in mutual exclusion with docroot. Strictly speaking, path is
      * always rooted to docroot, which defaults to "/"
      */
    var path: js.UndefOr[String] = js.native
    
    /**
      * Mainly relevant when using the docroot option. Describes the relationship
      * between the local docroot and the remote one. Strictly speaking, this
      * controls what happens when the local docroot is missing a requested file.
      * Accepted values:
      * * replace - (default) Replaces the remote docroot with the local one. In
      * other words, if a requested file doesn't exist locally, it populates the
      * response with a 404, even if it would have been found remotely.
      * * overlay - Overlays the local docroot on top of the remote one. In other
      * words, if a requested file doesn't exist locally, the request will
      * transparently fall through to the remote server.
      * * mirror - Automatically mirror the remote docroot locally. In other words,
      * if a requested file doesn't exist locally, it's copied to the local docroot
      * from the remote one, and will be found locally on subsequent requests.
      */
    var strategy: js.UndefOr[ServeStrategy] = js.native
  }
  object ServeOptions {
    
    @scala.inline
    def apply(): ServeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServeOptions]
    }
    
    @scala.inline
    implicit class ServeOptionsMutableBuilder[Self <: ServeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocroot(value: String): Self = StObject.set(x, "docroot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocrootUndefined: Self = StObject.set(x, "docroot", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setStrategy(value: ServeStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hoxy.hoxyStrings.replace
    - typings.hoxy.hoxyStrings.overlay
    - typings.hoxy.hoxyStrings.mirror
  */
  trait ServeStrategy extends StObject
  object ServeStrategy {
    
    @scala.inline
    def mirror: typings.hoxy.hoxyStrings.mirror = "mirror".asInstanceOf[typings.hoxy.hoxyStrings.mirror]
    
    @scala.inline
    def overlay: typings.hoxy.hoxyStrings.overlay = "overlay".asInstanceOf[typings.hoxy.hoxyStrings.overlay]
    
    @scala.inline
    def replace: typings.hoxy.hoxyStrings.replace = "replace".asInstanceOf[typings.hoxy.hoxyStrings.replace]
  }
  
  @js.native
  trait Slow extends StObject {
    
    /**
      * Imposes a single rate-limiting bottleneck (in bytes per second) on all downloads
      */
    var down: Double = js.native
    
    /**
      * Imposes a single rate-limiting bottleneck (in bytes per second) on all throughput
      */
    var latency: Double = js.native
    
    /**
      * Imposes a delay (in milliseconds) between all requests and responses
      */
    var rate: Double = js.native
    
    /**
      * Imposes a single rate-limiting bottleneck (in bytes per second) on all uploads
      */
    var up: Double = js.native
  }
  object Slow {
    
    @scala.inline
    def apply(down: Double, latency: Double, rate: Double, up: Double): Slow = {
      val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
      __obj.asInstanceOf[Slow]
    }
    
    @scala.inline
    implicit class SlowMutableBuilder[Self <: Slow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDown(value: Double): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    }
  }
  
  type TesterFunction[T] = js.Function1[/* arg */ T, Boolean]
}

package typings.http2Wrapper

import typings.http2Wrapper.anon.AgentOptionsproxyOptionsP
import typings.http2Wrapper.anon.AgentOptionsproxyOptionsPALPNProtocols
import typings.http2Wrapper.anon.AgentOptionsproxyOptionsPMaxCachedTlsSessions
import typings.http2Wrapper.anon.CreateResolveProtocol
import typings.http2Wrapper.anon.Http
import typings.http2Wrapper.http2WrapperBooleans.`false`
import typings.node.AbortSignal
import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import typings.node.dnsMod.LookupOneOptions
import typings.node.eventsMod.EventEmitter
import typings.node.http2Mod.ClientHttp2Session
import typings.node.http2Mod.ClientHttp2Stream
import typings.node.http2Mod.ClientSessionOptions
import typings.node.http2Mod.ClientSessionRequestOptions
import typings.node.http2Mod.Http2SecureServer
import typings.node.http2Mod.Http2Server
import typings.node.http2Mod.IncomingHttpHeaders
import typings.node.http2Mod.SecureClientSessionOptions
import typings.node.http2Mod.SecureServerOptions
import typings.node.http2Mod.ServerHttp2Stream
import typings.node.http2Mod.ServerOptions
import typings.node.http2Mod.Settings
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.LookupFunction
import typings.node.nodeColonnetMod.Socket
import typings.node.nodeColonurlMod.URL
import typings.node.streamMod.ReadableOptions
import typings.node.tlsMod.ConnectionOptions
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PxfObject
import typings.node.tlsMod.SecureVersion
import typings.node.tlsMod.TLSSocket
import typings.node.urlMod.URL_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http2-wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("http2-wrapper", "Agent")
  @js.native
  open class Agent () extends EventEmitter {
    def this(options: AgentOptions) = this()
    
    def closeEmptySessions(): Unit = js.native
    def closeEmptySessions(count: Double): Unit = js.native
    
    def createConnection(origin: URL_, options: SecureClientSessionOptions): js.Promise[TLSSocket] = js.native
    
    def destroy(): Unit = js.native
    def destroy(reason: js.Error): Unit = js.native
    
    var emptySessionCount: Double = js.native
    
    def getSession(origin: String): js.Promise[ClientHttp2Session] = js.native
    def getSession(origin: String, options: Unit, listeners: PromiseListeners): js.Promise[ClientHttp2Session] = js.native
    def getSession(origin: String, options: SecureClientSessionOptions): js.Promise[ClientHttp2Session] = js.native
    def getSession(origin: String, options: SecureClientSessionOptions, listeners: PromiseListeners): js.Promise[ClientHttp2Session] = js.native
    def getSession(origin: URL_): js.Promise[ClientHttp2Session] = js.native
    def getSession(origin: URL_, options: Unit, listeners: PromiseListeners): js.Promise[ClientHttp2Session] = js.native
    def getSession(origin: URL_, options: SecureClientSessionOptions): js.Promise[ClientHttp2Session] = js.native
    def getSession(origin: URL_, options: SecureClientSessionOptions, listeners: PromiseListeners): js.Promise[ClientHttp2Session] = js.native
    
    var maxEmptySessions: Double = js.native
    
    var maxSessions: Double = js.native
    
    def normalizeOptions(options: ClientSessionRequestOptions): String = js.native
    
    var pendingSessionCount: Double = js.native
    
    var protocol: String = js.native
    
    var queue: Record[String, Record[String, EntryFunction]] = js.native
    
    def request(origin: String): js.Promise[ClientHttp2Stream] = js.native
    def request(origin: String, options: Unit, headers: Unit, streamOptions: ClientSessionRequestOptions): js.Promise[ClientHttp2Stream] = js.native
    def request(origin: String, options: Unit, headers: OutgoingHttpHeaders): js.Promise[ClientHttp2Stream] = js.native
    def request(
      origin: String,
      options: Unit,
      headers: OutgoingHttpHeaders,
      streamOptions: ClientSessionRequestOptions
    ): js.Promise[ClientHttp2Stream] = js.native
    def request(origin: String, options: SecureClientSessionOptions): js.Promise[ClientHttp2Stream] = js.native
    def request(
      origin: String,
      options: SecureClientSessionOptions,
      headers: Unit,
      streamOptions: ClientSessionRequestOptions
    ): js.Promise[ClientHttp2Stream] = js.native
    def request(origin: String, options: SecureClientSessionOptions, headers: OutgoingHttpHeaders): js.Promise[ClientHttp2Stream] = js.native
    def request(
      origin: String,
      options: SecureClientSessionOptions,
      headers: OutgoingHttpHeaders,
      streamOptions: ClientSessionRequestOptions
    ): js.Promise[ClientHttp2Stream] = js.native
    def request(origin: URL_): js.Promise[ClientHttp2Stream] = js.native
    def request(origin: URL_, options: Unit, headers: Unit, streamOptions: ClientSessionRequestOptions): js.Promise[ClientHttp2Stream] = js.native
    def request(origin: URL_, options: Unit, headers: OutgoingHttpHeaders): js.Promise[ClientHttp2Stream] = js.native
    def request(
      origin: URL_,
      options: Unit,
      headers: OutgoingHttpHeaders,
      streamOptions: ClientSessionRequestOptions
    ): js.Promise[ClientHttp2Stream] = js.native
    def request(origin: URL_, options: SecureClientSessionOptions): js.Promise[ClientHttp2Stream] = js.native
    def request(
      origin: URL_,
      options: SecureClientSessionOptions,
      headers: Unit,
      streamOptions: ClientSessionRequestOptions
    ): js.Promise[ClientHttp2Stream] = js.native
    def request(origin: URL_, options: SecureClientSessionOptions, headers: OutgoingHttpHeaders): js.Promise[ClientHttp2Stream] = js.native
    def request(
      origin: URL_,
      options: SecureClientSessionOptions,
      headers: OutgoingHttpHeaders,
      streamOptions: ClientSessionRequestOptions
    ): js.Promise[ClientHttp2Stream] = js.native
    
    var sessionCount: Double = js.native
    
    var sessions: Record[String, js.Array[ClientHttp2Session]] = js.native
    
    var settings: Settings = js.native
    
    var timeout: Double = js.native
    
    var tlsSessionCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify QuickLRU<string, string> */ Any = js.native
  }
  /* static members */
  object Agent {
    
    @JSImport("http2-wrapper", "Agent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def connect(origin: URL_, options: SecureClientSessionOptions): TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(origin.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TLSSocket]
  }
  
  /**
    * This object is created internally and returned from {@link request}. It
    * represents an _in-progress_ request whose header has already been queued. The
    * header is still mutable using the `setHeader(name, value)`,`getHeader(name)`, `removeHeader(name)` API. The actual header will
    * be sent along with the first data chunk or when calling `request.end()`.
    *
    * To get the response, add a listener for `'response'` to the request object.`'response'` will be emitted from the request object when the response
    * headers have been received. The `'response'` event is executed with one
    * argument which is an instance of {@link IncomingMessage}.
    *
    * During the `'response'` event, one can add listeners to the
    * response object; particularly to listen for the `'data'` event.
    *
    * If no `'response'` handler is added, then the response will be
    * entirely discarded. However, if a `'response'` event handler is added,
    * then the data from the response object **must** be consumed, either by
    * calling `response.read()` whenever there is a `'readable'` event, or
    * by adding a `'data'` handler, or by calling the `.resume()` method.
    * Until the data is consumed, the `'end'` event will not fire. Also, until
    * the data is read it will consume memory that can eventually lead to a
    * 'process out of memory' error.
    *
    * For backward compatibility, `res` will only emit `'error'` if there is an`'error'` listener registered.
    *
    * Node.js does not check whether Content-Length and the length of the
    * body which has been transmitted are equal or not.
    * @since v0.1.17
    */
  @JSImport("http2-wrapper", "ClientRequest")
  @js.native
  open class ClientRequest protected ()
    extends typings.node.httpMod.ClientRequest {
    def this(url: String) = this()
    def this(url: ClientRequestArgs) = this()
    def this(url: URL) = this()
    def this(url: String, cb: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]) = this()
    def this(url: ClientRequestArgs, cb: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]) = this()
    def this(url: URL, cb: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]) = this()
  }
  
  @JSImport("http2-wrapper", "Http2ServerRequest")
  @js.native
  open class Http2ServerRequest protected ()
    extends typings.node.http2Mod.Http2ServerRequest {
    def this(
      stream: ServerHttp2Stream,
      headers: IncomingHttpHeaders,
      options: ReadableOptions,
      rawHeaders: js.Array[String]
    ) = this()
  }
  
  @JSImport("http2-wrapper", "Http2ServerResponse")
  @js.native
  open class Http2ServerResponse protected ()
    extends typings.node.http2Mod.Http2ServerResponse {
    def this(stream: ServerHttp2Stream) = this()
  }
  
  /**
    * An `IncomingMessage` object is created by {@link Server} or {@link ClientRequest} and passed as the first argument to the `'request'` and `'response'` event respectively. It may be used to
    * access response
    * status, headers and data.
    *
    * Different from its `socket` value which is a subclass of `stream.Duplex`, the`IncomingMessage` itself extends `stream.Readable` and is created separately to
    * parse and emit the incoming HTTP headers and payload, as the underlying socket
    * may be reused multiple times in case of keep-alive.
    * @since v0.1.17
    */
  @JSImport("http2-wrapper", "IncomingMessage")
  @js.native
  open class IncomingMessage protected ()
    extends typings.node.httpMod.IncomingMessage {
    def this(socket: Socket) = this()
  }
  
  @JSImport("http2-wrapper", "auto")
  @js.native
  val auto: (RequestFunction[js.Promise[typings.node.httpMod.ClientRequest], AutoRequestOptions]) & CreateResolveProtocol = js.native
  
  inline def connect(authority: String): ClientHttp2Session = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any]).asInstanceOf[ClientHttp2Session]
  inline def connect(
    authority: String,
    listener: js.Function2[
      /* session */ ClientHttp2Session, 
      /* socket */ Socket | typings.node.nodeColontlsMod.TLSSocket, 
      Unit
    ]
  ): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
  inline def connect(
    authority: String,
    options: Unit,
    listener: js.Function2[
      /* session */ ClientHttp2Session, 
      /* socket */ Socket | typings.node.nodeColontlsMod.TLSSocket, 
      Unit
    ]
  ): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
  inline def connect(authority: String, options: ClientSessionOptions): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
  inline def connect(
    authority: String,
    options: ClientSessionOptions,
    listener: js.Function2[
      /* session */ ClientHttp2Session, 
      /* socket */ Socket | typings.node.nodeColontlsMod.TLSSocket, 
      Unit
    ]
  ): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
  inline def connect(authority: String, options: SecureClientSessionOptions): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
  inline def connect(
    authority: String,
    options: SecureClientSessionOptions,
    listener: js.Function2[
      /* session */ ClientHttp2Session, 
      /* socket */ Socket | typings.node.nodeColontlsMod.TLSSocket, 
      Unit
    ]
  ): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
  inline def connect(authority: URL): ClientHttp2Session = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any]).asInstanceOf[ClientHttp2Session]
  inline def connect(
    authority: URL,
    listener: js.Function2[
      /* session */ ClientHttp2Session, 
      /* socket */ Socket | typings.node.nodeColontlsMod.TLSSocket, 
      Unit
    ]
  ): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
  inline def connect(
    authority: URL,
    options: Unit,
    listener: js.Function2[
      /* session */ ClientHttp2Session, 
      /* socket */ Socket | typings.node.nodeColontlsMod.TLSSocket, 
      Unit
    ]
  ): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
  inline def connect(authority: URL, options: ClientSessionOptions): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
  inline def connect(
    authority: URL,
    options: ClientSessionOptions,
    listener: js.Function2[
      /* session */ ClientHttp2Session, 
      /* socket */ Socket | typings.node.nodeColontlsMod.TLSSocket, 
      Unit
    ]
  ): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
  inline def connect(authority: URL, options: SecureClientSessionOptions): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
  inline def connect(
    authority: URL,
    options: SecureClientSessionOptions,
    listener: js.Function2[
      /* session */ ClientHttp2Session, 
      /* socket */ Socket | typings.node.nodeColontlsMod.TLSSocket, 
      Unit
    ]
  ): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
  
  object constants {
    
    @JSImport("http2-wrapper", "constants.DEFAULT_SETTINGS_ENABLE_PUSH")
    @js.native
    val DEFAULT_SETTINGS_ENABLE_PUSH: Double = js.native
    
    @JSImport("http2-wrapper", "constants.DEFAULT_SETTINGS_HEADER_TABLE_SIZE")
    @js.native
    val DEFAULT_SETTINGS_HEADER_TABLE_SIZE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.DEFAULT_SETTINGS_INITIAL_WINDOW_SIZE")
    @js.native
    val DEFAULT_SETTINGS_INITIAL_WINDOW_SIZE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.DEFAULT_SETTINGS_MAX_FRAME_SIZE")
    @js.native
    val DEFAULT_SETTINGS_MAX_FRAME_SIZE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_ACCEPT")
    @js.native
    val HTTP2_HEADER_ACCEPT: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_ACCEPT_CHARSET")
    @js.native
    val HTTP2_HEADER_ACCEPT_CHARSET: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_ACCEPT_ENCODING")
    @js.native
    val HTTP2_HEADER_ACCEPT_ENCODING: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_ACCEPT_LANGUAGE")
    @js.native
    val HTTP2_HEADER_ACCEPT_LANGUAGE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_ACCEPT_RANGES")
    @js.native
    val HTTP2_HEADER_ACCEPT_RANGES: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_ACCESS_CONTROL_ALLOW_ORIGIN")
    @js.native
    val HTTP2_HEADER_ACCESS_CONTROL_ALLOW_ORIGIN: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_AGE")
    @js.native
    val HTTP2_HEADER_AGE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_ALLOW")
    @js.native
    val HTTP2_HEADER_ALLOW: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_AUTHORITY")
    @js.native
    val HTTP2_HEADER_AUTHORITY: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_AUTHORIZATION")
    @js.native
    val HTTP2_HEADER_AUTHORIZATION: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_CACHE_CONTROL")
    @js.native
    val HTTP2_HEADER_CACHE_CONTROL: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_CONNECTION")
    @js.native
    val HTTP2_HEADER_CONNECTION: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_CONTENT_DISPOSITION")
    @js.native
    val HTTP2_HEADER_CONTENT_DISPOSITION: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_CONTENT_ENCODING")
    @js.native
    val HTTP2_HEADER_CONTENT_ENCODING: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_CONTENT_LANGUAGE")
    @js.native
    val HTTP2_HEADER_CONTENT_LANGUAGE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_CONTENT_LENGTH")
    @js.native
    val HTTP2_HEADER_CONTENT_LENGTH: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_CONTENT_LOCATION")
    @js.native
    val HTTP2_HEADER_CONTENT_LOCATION: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_CONTENT_MD5")
    @js.native
    val HTTP2_HEADER_CONTENT_MD5: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_CONTENT_RANGE")
    @js.native
    val HTTP2_HEADER_CONTENT_RANGE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_CONTENT_TYPE")
    @js.native
    val HTTP2_HEADER_CONTENT_TYPE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_COOKIE")
    @js.native
    val HTTP2_HEADER_COOKIE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_DATE")
    @js.native
    val HTTP2_HEADER_DATE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_ETAG")
    @js.native
    val HTTP2_HEADER_ETAG: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_EXPECT")
    @js.native
    val HTTP2_HEADER_EXPECT: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_EXPIRES")
    @js.native
    val HTTP2_HEADER_EXPIRES: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_FROM")
    @js.native
    val HTTP2_HEADER_FROM: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_HOST")
    @js.native
    val HTTP2_HEADER_HOST: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_HTTP2_SETTINGS")
    @js.native
    val HTTP2_HEADER_HTTP2_SETTINGS: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_IF_MATCH")
    @js.native
    val HTTP2_HEADER_IF_MATCH: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_IF_MODIFIED_SINCE")
    @js.native
    val HTTP2_HEADER_IF_MODIFIED_SINCE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_IF_NONE_MATCH")
    @js.native
    val HTTP2_HEADER_IF_NONE_MATCH: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_IF_RANGE")
    @js.native
    val HTTP2_HEADER_IF_RANGE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_IF_UNMODIFIED_SINCE")
    @js.native
    val HTTP2_HEADER_IF_UNMODIFIED_SINCE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_KEEP_ALIVE")
    @js.native
    val HTTP2_HEADER_KEEP_ALIVE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_LAST_MODIFIED")
    @js.native
    val HTTP2_HEADER_LAST_MODIFIED: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_LINK")
    @js.native
    val HTTP2_HEADER_LINK: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_LOCATION")
    @js.native
    val HTTP2_HEADER_LOCATION: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_MAX_FORWARDS")
    @js.native
    val HTTP2_HEADER_MAX_FORWARDS: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_METHOD")
    @js.native
    val HTTP2_HEADER_METHOD: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_PATH")
    @js.native
    val HTTP2_HEADER_PATH: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_PREFER")
    @js.native
    val HTTP2_HEADER_PREFER: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_PROXY_AUTHENTICATE")
    @js.native
    val HTTP2_HEADER_PROXY_AUTHENTICATE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_PROXY_AUTHORIZATION")
    @js.native
    val HTTP2_HEADER_PROXY_AUTHORIZATION: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_PROXY_CONNECTION")
    @js.native
    val HTTP2_HEADER_PROXY_CONNECTION: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_RANGE")
    @js.native
    val HTTP2_HEADER_RANGE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_REFERER")
    @js.native
    val HTTP2_HEADER_REFERER: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_REFRESH")
    @js.native
    val HTTP2_HEADER_REFRESH: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_RETRY_AFTER")
    @js.native
    val HTTP2_HEADER_RETRY_AFTER: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_SCHEME")
    @js.native
    val HTTP2_HEADER_SCHEME: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_SERVER")
    @js.native
    val HTTP2_HEADER_SERVER: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_SET_COOKIE")
    @js.native
    val HTTP2_HEADER_SET_COOKIE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_STATUS")
    @js.native
    val HTTP2_HEADER_STATUS: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_STRICT_TRANSPORT_SECURITY")
    @js.native
    val HTTP2_HEADER_STRICT_TRANSPORT_SECURITY: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_TE")
    @js.native
    val HTTP2_HEADER_TE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_TRANSFER_ENCODING")
    @js.native
    val HTTP2_HEADER_TRANSFER_ENCODING: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_UPGRADE")
    @js.native
    val HTTP2_HEADER_UPGRADE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_USER_AGENT")
    @js.native
    val HTTP2_HEADER_USER_AGENT: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_VARY")
    @js.native
    val HTTP2_HEADER_VARY: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_VIA")
    @js.native
    val HTTP2_HEADER_VIA: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_HEADER_WWW_AUTHENTICATE")
    @js.native
    val HTTP2_HEADER_WWW_AUTHENTICATE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_ACL")
    @js.native
    val HTTP2_METHOD_ACL: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_BASELINE_CONTROL")
    @js.native
    val HTTP2_METHOD_BASELINE_CONTROL: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_BIND")
    @js.native
    val HTTP2_METHOD_BIND: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_CHECKIN")
    @js.native
    val HTTP2_METHOD_CHECKIN: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_CHECKOUT")
    @js.native
    val HTTP2_METHOD_CHECKOUT: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_CONNECT")
    @js.native
    val HTTP2_METHOD_CONNECT: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_COPY")
    @js.native
    val HTTP2_METHOD_COPY: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_DELETE")
    @js.native
    val HTTP2_METHOD_DELETE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_GET")
    @js.native
    val HTTP2_METHOD_GET: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_HEAD")
    @js.native
    val HTTP2_METHOD_HEAD: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_LABEL")
    @js.native
    val HTTP2_METHOD_LABEL: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_LINK")
    @js.native
    val HTTP2_METHOD_LINK: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_LOCK")
    @js.native
    val HTTP2_METHOD_LOCK: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_MERGE")
    @js.native
    val HTTP2_METHOD_MERGE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_MKACTIVITY")
    @js.native
    val HTTP2_METHOD_MKACTIVITY: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_MKCALENDAR")
    @js.native
    val HTTP2_METHOD_MKCALENDAR: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_MKCOL")
    @js.native
    val HTTP2_METHOD_MKCOL: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_MKREDIRECTREF")
    @js.native
    val HTTP2_METHOD_MKREDIRECTREF: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_MKWORKSPACE")
    @js.native
    val HTTP2_METHOD_MKWORKSPACE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_MOVE")
    @js.native
    val HTTP2_METHOD_MOVE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_OPTIONS")
    @js.native
    val HTTP2_METHOD_OPTIONS: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_ORDERPATCH")
    @js.native
    val HTTP2_METHOD_ORDERPATCH: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_PATCH")
    @js.native
    val HTTP2_METHOD_PATCH: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_POST")
    @js.native
    val HTTP2_METHOD_POST: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_PRI")
    @js.native
    val HTTP2_METHOD_PRI: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_PROPFIND")
    @js.native
    val HTTP2_METHOD_PROPFIND: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_PROPPATCH")
    @js.native
    val HTTP2_METHOD_PROPPATCH: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_PUT")
    @js.native
    val HTTP2_METHOD_PUT: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_REBIND")
    @js.native
    val HTTP2_METHOD_REBIND: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_REPORT")
    @js.native
    val HTTP2_METHOD_REPORT: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_SEARCH")
    @js.native
    val HTTP2_METHOD_SEARCH: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_TRACE")
    @js.native
    val HTTP2_METHOD_TRACE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_UNBIND")
    @js.native
    val HTTP2_METHOD_UNBIND: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_UNCHECKOUT")
    @js.native
    val HTTP2_METHOD_UNCHECKOUT: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_UNLINK")
    @js.native
    val HTTP2_METHOD_UNLINK: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_UNLOCK")
    @js.native
    val HTTP2_METHOD_UNLOCK: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_UPDATE")
    @js.native
    val HTTP2_METHOD_UPDATE: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_UPDATEREDIRECTREF")
    @js.native
    val HTTP2_METHOD_UPDATEREDIRECTREF: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP2_METHOD_VERSION_CONTROL")
    @js.native
    val HTTP2_METHOD_VERSION_CONTROL: String = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_ACCEPTED")
    @js.native
    val HTTP_STATUS_ACCEPTED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_ALREADY_REPORTED")
    @js.native
    val HTTP_STATUS_ALREADY_REPORTED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_BAD_GATEWAY")
    @js.native
    val HTTP_STATUS_BAD_GATEWAY: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_BAD_REQUEST")
    @js.native
    val HTTP_STATUS_BAD_REQUEST: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_BANDWIDTH_LIMIT_EXCEEDED")
    @js.native
    val HTTP_STATUS_BANDWIDTH_LIMIT_EXCEEDED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_CONFLICT")
    @js.native
    val HTTP_STATUS_CONFLICT: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_CONTINUE")
    @js.native
    val HTTP_STATUS_CONTINUE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_CREATED")
    @js.native
    val HTTP_STATUS_CREATED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_EXPECTATION_FAILED")
    @js.native
    val HTTP_STATUS_EXPECTATION_FAILED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_FAILED_DEPENDENCY")
    @js.native
    val HTTP_STATUS_FAILED_DEPENDENCY: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_FORBIDDEN")
    @js.native
    val HTTP_STATUS_FORBIDDEN: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_FOUND")
    @js.native
    val HTTP_STATUS_FOUND: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_GATEWAY_TIMEOUT")
    @js.native
    val HTTP_STATUS_GATEWAY_TIMEOUT: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_GONE")
    @js.native
    val HTTP_STATUS_GONE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_HTTP_VERSION_NOT_SUPPORTED")
    @js.native
    val HTTP_STATUS_HTTP_VERSION_NOT_SUPPORTED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_IM_USED")
    @js.native
    val HTTP_STATUS_IM_USED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_INSUFFICIENT_STORAGE")
    @js.native
    val HTTP_STATUS_INSUFFICIENT_STORAGE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_INTERNAL_SERVER_ERROR")
    @js.native
    val HTTP_STATUS_INTERNAL_SERVER_ERROR: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_LENGTH_REQUIRED")
    @js.native
    val HTTP_STATUS_LENGTH_REQUIRED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_LOCKED")
    @js.native
    val HTTP_STATUS_LOCKED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_LOOP_DETECTED")
    @js.native
    val HTTP_STATUS_LOOP_DETECTED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_METHOD_NOT_ALLOWED")
    @js.native
    val HTTP_STATUS_METHOD_NOT_ALLOWED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_MISDIRECTED_REQUEST")
    @js.native
    val HTTP_STATUS_MISDIRECTED_REQUEST: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_MOVED_PERMANENTLY")
    @js.native
    val HTTP_STATUS_MOVED_PERMANENTLY: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_MULTIPLE_CHOICES")
    @js.native
    val HTTP_STATUS_MULTIPLE_CHOICES: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_MULTI_STATUS")
    @js.native
    val HTTP_STATUS_MULTI_STATUS: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_NETWORK_AUTHENTICATION_REQUIRED")
    @js.native
    val HTTP_STATUS_NETWORK_AUTHENTICATION_REQUIRED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_NON_AUTHORITATIVE_INFORMATION")
    @js.native
    val HTTP_STATUS_NON_AUTHORITATIVE_INFORMATION: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_NOT_ACCEPTABLE")
    @js.native
    val HTTP_STATUS_NOT_ACCEPTABLE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_NOT_EXTENDED")
    @js.native
    val HTTP_STATUS_NOT_EXTENDED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_NOT_FOUND")
    @js.native
    val HTTP_STATUS_NOT_FOUND: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_NOT_IMPLEMENTED")
    @js.native
    val HTTP_STATUS_NOT_IMPLEMENTED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_NOT_MODIFIED")
    @js.native
    val HTTP_STATUS_NOT_MODIFIED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_NO_CONTENT")
    @js.native
    val HTTP_STATUS_NO_CONTENT: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_OK")
    @js.native
    val HTTP_STATUS_OK: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_PARTIAL_CONTENT")
    @js.native
    val HTTP_STATUS_PARTIAL_CONTENT: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_PAYLOAD_TOO_LARGE")
    @js.native
    val HTTP_STATUS_PAYLOAD_TOO_LARGE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_PAYMENT_REQUIRED")
    @js.native
    val HTTP_STATUS_PAYMENT_REQUIRED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_PERMANENT_REDIRECT")
    @js.native
    val HTTP_STATUS_PERMANENT_REDIRECT: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_PRECONDITION_FAILED")
    @js.native
    val HTTP_STATUS_PRECONDITION_FAILED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_PRECONDITION_REQUIRED")
    @js.native
    val HTTP_STATUS_PRECONDITION_REQUIRED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_PROCESSING")
    @js.native
    val HTTP_STATUS_PROCESSING: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_PROXY_AUTHENTICATION_REQUIRED")
    @js.native
    val HTTP_STATUS_PROXY_AUTHENTICATION_REQUIRED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_RANGE_NOT_SATISFIABLE")
    @js.native
    val HTTP_STATUS_RANGE_NOT_SATISFIABLE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_REQUEST_HEADER_FIELDS_TOO_LARGE")
    @js.native
    val HTTP_STATUS_REQUEST_HEADER_FIELDS_TOO_LARGE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_REQUEST_TIMEOUT")
    @js.native
    val HTTP_STATUS_REQUEST_TIMEOUT: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_RESET_CONTENT")
    @js.native
    val HTTP_STATUS_RESET_CONTENT: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_SEE_OTHER")
    @js.native
    val HTTP_STATUS_SEE_OTHER: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_SERVICE_UNAVAILABLE")
    @js.native
    val HTTP_STATUS_SERVICE_UNAVAILABLE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_SWITCHING_PROTOCOLS")
    @js.native
    val HTTP_STATUS_SWITCHING_PROTOCOLS: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_TEAPOT")
    @js.native
    val HTTP_STATUS_TEAPOT: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_TEMPORARY_REDIRECT")
    @js.native
    val HTTP_STATUS_TEMPORARY_REDIRECT: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_TOO_MANY_REQUESTS")
    @js.native
    val HTTP_STATUS_TOO_MANY_REQUESTS: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_UNAUTHORIZED")
    @js.native
    val HTTP_STATUS_UNAUTHORIZED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_UNAVAILABLE_FOR_LEGAL_REASONS")
    @js.native
    val HTTP_STATUS_UNAVAILABLE_FOR_LEGAL_REASONS: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_UNORDERED_COLLECTION")
    @js.native
    val HTTP_STATUS_UNORDERED_COLLECTION: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_UNPROCESSABLE_ENTITY")
    @js.native
    val HTTP_STATUS_UNPROCESSABLE_ENTITY: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_UNSUPPORTED_MEDIA_TYPE")
    @js.native
    val HTTP_STATUS_UNSUPPORTED_MEDIA_TYPE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_UPGRADE_REQUIRED")
    @js.native
    val HTTP_STATUS_UPGRADE_REQUIRED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_URI_TOO_LONG")
    @js.native
    val HTTP_STATUS_URI_TOO_LONG: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_USE_PROXY")
    @js.native
    val HTTP_STATUS_USE_PROXY: Double = js.native
    
    @JSImport("http2-wrapper", "constants.HTTP_STATUS_VARIANT_ALSO_NEGOTIATES")
    @js.native
    val HTTP_STATUS_VARIANT_ALSO_NEGOTIATES: Double = js.native
    
    @JSImport("http2-wrapper", "constants.MAX_INITIAL_WINDOW_SIZE")
    @js.native
    val MAX_INITIAL_WINDOW_SIZE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.MAX_MAX_FRAME_SIZE")
    @js.native
    val MAX_MAX_FRAME_SIZE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.MIN_MAX_FRAME_SIZE")
    @js.native
    val MIN_MAX_FRAME_SIZE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_CANCEL")
    @js.native
    val NGHTTP2_CANCEL: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_COMPRESSION_ERROR")
    @js.native
    val NGHTTP2_COMPRESSION_ERROR: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_CONNECT_ERROR")
    @js.native
    val NGHTTP2_CONNECT_ERROR: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_DEFAULT_WEIGHT")
    @js.native
    val NGHTTP2_DEFAULT_WEIGHT: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_ENHANCE_YOUR_CALM")
    @js.native
    val NGHTTP2_ENHANCE_YOUR_CALM: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_ERR_FRAME_SIZE_ERROR")
    @js.native
    val NGHTTP2_ERR_FRAME_SIZE_ERROR: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_FLAG_ACK")
    @js.native
    val NGHTTP2_FLAG_ACK: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_FLAG_END_HEADERS")
    @js.native
    val NGHTTP2_FLAG_END_HEADERS: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_FLAG_END_STREAM")
    @js.native
    val NGHTTP2_FLAG_END_STREAM: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_FLAG_NONE")
    @js.native
    val NGHTTP2_FLAG_NONE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_FLAG_PADDED")
    @js.native
    val NGHTTP2_FLAG_PADDED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_FLAG_PRIORITY")
    @js.native
    val NGHTTP2_FLAG_PRIORITY: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_FLOW_CONTROL_ERROR")
    @js.native
    val NGHTTP2_FLOW_CONTROL_ERROR: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_FRAME_SIZE_ERROR")
    @js.native
    val NGHTTP2_FRAME_SIZE_ERROR: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_HTTP_1_1_REQUIRED")
    @js.native
    val NGHTTP2_HTTP_1_1_REQUIRED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_INADEQUATE_SECURITY")
    @js.native
    val NGHTTP2_INADEQUATE_SECURITY: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_INTERNAL_ERROR")
    @js.native
    val NGHTTP2_INTERNAL_ERROR: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_NO_ERROR")
    @js.native
    val NGHTTP2_NO_ERROR: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_PROTOCOL_ERROR")
    @js.native
    val NGHTTP2_PROTOCOL_ERROR: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_REFUSED_STREAM")
    @js.native
    val NGHTTP2_REFUSED_STREAM: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_SESSION_CLIENT")
    @js.native
    val NGHTTP2_SESSION_CLIENT: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_SESSION_SERVER")
    @js.native
    val NGHTTP2_SESSION_SERVER: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_SETTINGS_ENABLE_PUSH")
    @js.native
    val NGHTTP2_SETTINGS_ENABLE_PUSH: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_SETTINGS_HEADER_TABLE_SIZE")
    @js.native
    val NGHTTP2_SETTINGS_HEADER_TABLE_SIZE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_SETTINGS_INITIAL_WINDOW_SIZE")
    @js.native
    val NGHTTP2_SETTINGS_INITIAL_WINDOW_SIZE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_SETTINGS_MAX_CONCURRENT_STREAMS")
    @js.native
    val NGHTTP2_SETTINGS_MAX_CONCURRENT_STREAMS: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_SETTINGS_MAX_FRAME_SIZE")
    @js.native
    val NGHTTP2_SETTINGS_MAX_FRAME_SIZE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_SETTINGS_MAX_HEADER_LIST_SIZE")
    @js.native
    val NGHTTP2_SETTINGS_MAX_HEADER_LIST_SIZE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_SETTINGS_TIMEOUT")
    @js.native
    val NGHTTP2_SETTINGS_TIMEOUT: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_STREAM_CLOSED")
    @js.native
    val NGHTTP2_STREAM_CLOSED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_STREAM_STATE_CLOSED")
    @js.native
    val NGHTTP2_STREAM_STATE_CLOSED: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_STREAM_STATE_HALF_CLOSED_LOCAL")
    @js.native
    val NGHTTP2_STREAM_STATE_HALF_CLOSED_LOCAL: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_STREAM_STATE_HALF_CLOSED_REMOTE")
    @js.native
    val NGHTTP2_STREAM_STATE_HALF_CLOSED_REMOTE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_STREAM_STATE_IDLE")
    @js.native
    val NGHTTP2_STREAM_STATE_IDLE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_STREAM_STATE_OPEN")
    @js.native
    val NGHTTP2_STREAM_STATE_OPEN: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_STREAM_STATE_RESERVED_LOCAL")
    @js.native
    val NGHTTP2_STREAM_STATE_RESERVED_LOCAL: Double = js.native
    
    @JSImport("http2-wrapper", "constants.NGHTTP2_STREAM_STATE_RESERVED_REMOTE")
    @js.native
    val NGHTTP2_STREAM_STATE_RESERVED_REMOTE: Double = js.native
    
    @JSImport("http2-wrapper", "constants.PADDING_STRATEGY_CALLBACK")
    @js.native
    val PADDING_STRATEGY_CALLBACK: Double = js.native
    
    @JSImport("http2-wrapper", "constants.PADDING_STRATEGY_MAX")
    @js.native
    val PADDING_STRATEGY_MAX: Double = js.native
    
    @JSImport("http2-wrapper", "constants.PADDING_STRATEGY_NONE")
    @js.native
    val PADDING_STRATEGY_NONE: Double = js.native
  }
  
  inline def createSecureServer(): Http2SecureServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")().asInstanceOf[Http2SecureServer]
  inline def createSecureServer(
    onRequestHandler: js.Function2[
      /* request */ typings.node.http2Mod.Http2ServerRequest, 
      /* response */ typings.node.http2Mod.Http2ServerResponse, 
      Unit
    ]
  ): Http2SecureServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(onRequestHandler.asInstanceOf[js.Any]).asInstanceOf[Http2SecureServer]
  inline def createSecureServer(options: SecureServerOptions): Http2SecureServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any]).asInstanceOf[Http2SecureServer]
  inline def createSecureServer(
    options: SecureServerOptions,
    onRequestHandler: js.Function2[
      /* request */ typings.node.http2Mod.Http2ServerRequest, 
      /* response */ typings.node.http2Mod.Http2ServerResponse, 
      Unit
    ]
  ): Http2SecureServer = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any], onRequestHandler.asInstanceOf[js.Any])).asInstanceOf[Http2SecureServer]
  
  inline def createServer(): Http2Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Http2Server]
  inline def createServer(
    onRequestHandler: js.Function2[
      /* request */ typings.node.http2Mod.Http2ServerRequest, 
      /* response */ typings.node.http2Mod.Http2ServerResponse, 
      Unit
    ]
  ): Http2Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(onRequestHandler.asInstanceOf[js.Any]).asInstanceOf[Http2Server]
  inline def createServer(options: ServerOptions): Http2Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Http2Server]
  inline def createServer(
    options: ServerOptions,
    onRequestHandler: js.Function2[
      /* request */ typings.node.http2Mod.Http2ServerRequest, 
      /* response */ typings.node.http2Mod.Http2ServerResponse, 
      Unit
    ]
  ): Http2Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], onRequestHandler.asInstanceOf[js.Any])).asInstanceOf[Http2Server]
  
  @JSImport("http2-wrapper", "get")
  @js.native
  val get: RequestFunction[typings.node.httpMod.ClientRequest, RequestOptions] = js.native
  
  inline def getDefaultSettings(): Settings = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultSettings")().asInstanceOf[Settings]
  
  inline def getPackedSettings(settings: Settings): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackedSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def getUnpackedSettings(buf: js.typedarray.Uint8Array): Settings = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnpackedSettings")(buf.asInstanceOf[js.Any]).asInstanceOf[Settings]
  
  @JSImport("http2-wrapper", "globalAgent")
  @js.native
  val globalAgent: Agent = js.native
  
  object proxies {
    
    @JSImport("http2-wrapper", "proxies.Http2OverHttp")
    @js.native
    open class Http2OverHttp protected () extends Agent {
      def this(options: AgentOptionsproxyOptionsPMaxCachedTlsSessions) = this()
    }
    
    @JSImport("http2-wrapper", "proxies.Http2OverHttp2")
    @js.native
    open class Http2OverHttp2 protected () extends Agent {
      def this(options: AgentOptionsproxyOptionsPMaxCachedTlsSessions) = this()
    }
    
    @JSImport("http2-wrapper", "proxies.Http2OverHttps")
    @js.native
    open class Http2OverHttps protected () extends Agent {
      def this(options: AgentOptionsproxyOptionsPMaxCachedTlsSessions) = this()
    }
    
    @JSImport("http2-wrapper", "proxies.HttpOverHttp2")
    @js.native
    open class HttpOverHttp2 protected ()
      extends typings.node.httpMod.Agent {
      def this(options: AgentOptionsproxyOptionsP) = this()
    }
    
    @JSImport("http2-wrapper", "proxies.HttpsOverHttp2")
    @js.native
    open class HttpsOverHttp2 protected ()
      extends typings.node.httpsMod.Agent {
      def this(options: AgentOptionsproxyOptionsPALPNProtocols) = this()
    }
  }
  
  @JSImport("http2-wrapper", "request")
  @js.native
  val request: RequestFunction[typings.node.httpMod.ClientRequest, RequestOptions] = js.native
  
  @JSImport("http2-wrapper", "sensitiveHeaders")
  @js.native
  val sensitiveHeaders: js.Symbol = js.native
  
  trait AgentOptions extends StObject {
    
    var maxCachedTlsSessions: js.UndefOr[Double] = js.undefined
    
    var maxEmptySessions: js.UndefOr[Double] = js.undefined
    
    var maxSessions: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AgentOptions {
    
    inline def apply(): AgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgentOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AgentOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxCachedTlsSessions(value: Double): Self = StObject.set(x, "maxCachedTlsSessions", value.asInstanceOf[js.Any])
      
      inline def setMaxCachedTlsSessionsUndefined: Self = StObject.set(x, "maxCachedTlsSessions", js.undefined)
      
      inline def setMaxEmptySessions(value: Double): Self = StObject.set(x, "maxEmptySessions", value.asInstanceOf[js.Any])
      
      inline def setMaxEmptySessionsUndefined: Self = StObject.set(x, "maxEmptySessions", js.undefined)
      
      inline def setMaxSessions(value: Double): Self = StObject.set(x, "maxSessions", value.asInstanceOf[js.Any])
      
      inline def setMaxSessionsUndefined: Self = StObject.set(x, "maxSessions", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<http2-wrapper.http2-wrapper.RequestOptions, 'agent' | 'h2session'> */
  trait AutoRequestOptions extends StObject {
    
    var ALPNProtocols: js.UndefOr[js.Array[String]] = js.undefined
    
    var _defaultAgent: js.UndefOr[typings.node.httpMod.Agent] = js.undefined
    
    var agent: js.UndefOr[Http] = js.undefined
    
    var auth: js.UndefOr[String | Null] = js.undefined
    
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var clientCertEngine: js.UndefOr[String] = js.undefined
    
    var createConnection: js.UndefOr[
        js.Function2[
          /* options */ this.type, 
          /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit], 
          Socket
        ]
      ] = js.undefined
    
    var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var defaultPort: js.UndefOr[Double | String] = js.undefined
    
    var dhparam: js.UndefOr[String | Buffer] = js.undefined
    
    var ecdhCurve: js.UndefOr[String] = js.undefined
    
    var family: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String | Null] = js.undefined
    
    var hostname: js.UndefOr[String | Null] = js.undefined
    
    var key: js.UndefOr[String | Buffer | (js.Array[String | Buffer | KeyObject])] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var lookup: js.UndefOr[LookupFunction] = js.undefined
    
    var maxHeaderSize: js.UndefOr[Double] = js.undefined
    
    var maxVersion: js.UndefOr[SecureVersion] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var minVersion: js.UndefOr[SecureVersion] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String | Null] = js.undefined
    
    var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.undefined
    
    var port: js.UndefOr[Double | String | Null] = js.undefined
    
    var privateKeyEngine: js.UndefOr[String] = js.undefined
    
    var privateKeyIdentifier: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String | Null] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var resolveProtocol: js.UndefOr[ResolveProtocolFunction] = js.undefined
    
    var secureOptions: js.UndefOr[Double] = js.undefined
    
    var secureProtocol: js.UndefOr[String] = js.undefined
    
    var servername: js.UndefOr[String] = js.undefined
    
    var sessionIdContext: js.UndefOr[String] = js.undefined
    
    var sessionTimeout: js.UndefOr[Double] = js.undefined
    
    var setHost: js.UndefOr[Boolean] = js.undefined
    
    var sigalgs: js.UndefOr[String] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
    
    var ticketKeys: js.UndefOr[Buffer] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tlsSession: js.UndefOr[Buffer] = js.undefined
  }
  object AutoRequestOptions {
    
    inline def apply(): AutoRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setALPNProtocols(value: js.Array[String]): Self = StObject.set(x, "ALPNProtocols", value.asInstanceOf[js.Any])
      
      inline def setALPNProtocolsUndefined: Self = StObject.set(x, "ALPNProtocols", js.undefined)
      
      inline def setALPNProtocolsVarargs(value: String*): Self = StObject.set(x, "ALPNProtocols", js.Array(value*))
      
      inline def setAgent(value: Http): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value*))
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
      
      inline def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
      
      inline def setCreateConnection(
        value: (AutoRequestOptions, /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit]) => Socket
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
      
      inline def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
      
      inline def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      inline def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      inline def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value*))
      
      inline def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      inline def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      inline def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
      
      inline def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
      
      inline def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      inline def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      inline def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setKey(value: String | Buffer | (js.Array[String | Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (String | Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLookup(
        value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
      
      inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      inline def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      inline def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      inline def setMaxVersion(value: SecureVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      inline def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMinVersion(value: SecureVersion): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      inline def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value*))
      
      inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPrivateKeyEngine(value: String): Self = StObject.set(x, "privateKeyEngine", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyEngineUndefined: Self = StObject.set(x, "privateKeyEngine", js.undefined)
      
      inline def setPrivateKeyIdentifier(value: String): Self = StObject.set(x, "privateKeyIdentifier", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyIdentifierUndefined: Self = StObject.set(x, "privateKeyIdentifier", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setResolveProtocol(value: /* options */ AutoRequestOptions => js.Promise[ResolveProtocolResult]): Self = StObject.set(x, "resolveProtocol", js.Any.fromFunction1(value))
      
      inline def setResolveProtocolUndefined: Self = StObject.set(x, "resolveProtocol", js.undefined)
      
      inline def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
      
      inline def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
      
      inline def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      inline def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      inline def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      inline def setSessionIdContext(value: String): Self = StObject.set(x, "sessionIdContext", value.asInstanceOf[js.Any])
      
      inline def setSessionIdContextUndefined: Self = StObject.set(x, "sessionIdContext", js.undefined)
      
      inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      inline def setSetHost(value: Boolean): Self = StObject.set(x, "setHost", value.asInstanceOf[js.Any])
      
      inline def setSetHostUndefined: Self = StObject.set(x, "setHost", js.undefined)
      
      inline def setSigalgs(value: String): Self = StObject.set(x, "sigalgs", value.asInstanceOf[js.Any])
      
      inline def setSigalgsUndefined: Self = StObject.set(x, "sigalgs", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
      
      inline def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTlsSession(value: Buffer): Self = StObject.set(x, "tlsSession", value.asInstanceOf[js.Any])
      
      inline def setTlsSessionUndefined: Self = StObject.set(x, "tlsSession", js.undefined)
      
      inline def set_defaultAgent(value: typings.node.httpMod.Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
      
      inline def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
    }
  }
  
  @js.native
  trait EntryFunction extends StObject {
    
    def apply(): js.Promise[Unit] = js.native
    
    var completed: Boolean = js.native
    
    var destroyed: Boolean = js.native
    
    var listeners: PromiseListeners = js.native
  }
  
  type Promisable[T] = T | js.Promise[T]
  
  trait PromiseListeners extends StObject {
    
    def reject(error: js.Error): Unit
    
    def resolve(value: Any): Unit
  }
  object PromiseListeners {
    
    inline def apply(reject: js.Error => Unit, resolve: Any => Unit): PromiseListeners = {
      val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[PromiseListeners]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromiseListeners] (val x: Self) extends AnyVal {
      
      inline def setReject(value: js.Error => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: Any => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  trait ProxyOptions extends StObject {
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var url: URL_ | String
  }
  object ProxyOptions {
    
    inline def apply(url: URL_ | String): ProxyOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProxyOptions] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setUrl(value: URL_ | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type RequestFunction[T, O] = (js.Function3[
    /* url */ String | URL_, 
    /* options */ js.UndefOr[O], 
    /* callback */ js.UndefOr[js.Function1[/* response */ typings.node.httpMod.IncomingMessage, Unit]], 
    T
  ]) & (js.Function2[
    /* url */ String | URL_, 
    /* callback */ js.UndefOr[js.Function1[/* response */ typings.node.httpMod.IncomingMessage, Unit]], 
    T
  ]) & (js.Function2[
    /* options */ O, 
    /* callback */ js.UndefOr[js.Function1[/* response */ typings.node.httpMod.IncomingMessage, Unit]], 
    T
  ])
  
  /* Inlined parent std.Omit<node.https.RequestOptions, 'session' | 'agent'> */
  trait RequestOptions extends StObject {
    
    // Required because @types/node is missing types
    var ALPNProtocols: js.UndefOr[js.Array[String]] = js.undefined
    
    var _defaultAgent: js.UndefOr[typings.node.httpMod.Agent] = js.undefined
    
    var agent: js.UndefOr[Agent | `false`] = js.undefined
    
    var auth: js.UndefOr[String | Null] = js.undefined
    
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var clientCertEngine: js.UndefOr[String] = js.undefined
    
    var createConnection: js.UndefOr[
        js.Function2[
          /* options */ this.type, 
          /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit], 
          Socket
        ]
      ] = js.undefined
    
    var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var defaultPort: js.UndefOr[Double | String] = js.undefined
    
    var dhparam: js.UndefOr[String | Buffer] = js.undefined
    
    var ecdhCurve: js.UndefOr[String] = js.undefined
    
    var family: js.UndefOr[Double] = js.undefined
    
    var h2session: js.UndefOr[ClientHttp2Session] = js.undefined
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String | Null] = js.undefined
    
    var hostname: js.UndefOr[String | Null] = js.undefined
    
    var key: js.UndefOr[String | Buffer | (js.Array[String | Buffer | KeyObject])] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var lookup: js.UndefOr[LookupFunction] = js.undefined
    
    var maxHeaderSize: js.UndefOr[Double] = js.undefined
    
    var maxVersion: js.UndefOr[SecureVersion] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var minVersion: js.UndefOr[SecureVersion] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String | Null] = js.undefined
    
    var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.undefined
    
    var port: js.UndefOr[Double | String | Null] = js.undefined
    
    var privateKeyEngine: js.UndefOr[String] = js.undefined
    
    var privateKeyIdentifier: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String | Null] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var secureOptions: js.UndefOr[Double] = js.undefined
    
    var secureProtocol: js.UndefOr[String] = js.undefined
    
    var servername: js.UndefOr[String] = js.undefined
    
    var sessionIdContext: js.UndefOr[String] = js.undefined
    
    var sessionTimeout: js.UndefOr[Double] = js.undefined
    
    var setHost: js.UndefOr[Boolean] = js.undefined
    
    var sigalgs: js.UndefOr[String] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
    
    var ticketKeys: js.UndefOr[Buffer] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tlsSession: js.UndefOr[Buffer] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      inline def setALPNProtocols(value: js.Array[String]): Self = StObject.set(x, "ALPNProtocols", value.asInstanceOf[js.Any])
      
      inline def setALPNProtocolsUndefined: Self = StObject.set(x, "ALPNProtocols", js.undefined)
      
      inline def setALPNProtocolsVarargs(value: String*): Self = StObject.set(x, "ALPNProtocols", js.Array(value*))
      
      inline def setAgent(value: Agent | `false`): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value*))
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
      
      inline def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
      
      inline def setCreateConnection(
        value: (RequestOptions, /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit]) => Socket
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
      
      inline def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
      
      inline def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      inline def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      inline def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value*))
      
      inline def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      inline def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      inline def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
      
      inline def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
      
      inline def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      inline def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setH2session(value: ClientHttp2Session): Self = StObject.set(x, "h2session", value.asInstanceOf[js.Any])
      
      inline def setH2sessionUndefined: Self = StObject.set(x, "h2session", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      inline def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setKey(value: String | Buffer | (js.Array[String | Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (String | Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLookup(
        value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
      
      inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      inline def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      inline def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      inline def setMaxVersion(value: SecureVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      inline def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMinVersion(value: SecureVersion): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      inline def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value*))
      
      inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPrivateKeyEngine(value: String): Self = StObject.set(x, "privateKeyEngine", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyEngineUndefined: Self = StObject.set(x, "privateKeyEngine", js.undefined)
      
      inline def setPrivateKeyIdentifier(value: String): Self = StObject.set(x, "privateKeyIdentifier", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyIdentifierUndefined: Self = StObject.set(x, "privateKeyIdentifier", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
      
      inline def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
      
      inline def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      inline def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      inline def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      inline def setSessionIdContext(value: String): Self = StObject.set(x, "sessionIdContext", value.asInstanceOf[js.Any])
      
      inline def setSessionIdContextUndefined: Self = StObject.set(x, "sessionIdContext", js.undefined)
      
      inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      inline def setSetHost(value: Boolean): Self = StObject.set(x, "setHost", value.asInstanceOf[js.Any])
      
      inline def setSetHostUndefined: Self = StObject.set(x, "setHost", js.undefined)
      
      inline def setSigalgs(value: String): Self = StObject.set(x, "sigalgs", value.asInstanceOf[js.Any])
      
      inline def setSigalgsUndefined: Self = StObject.set(x, "sigalgs", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
      
      inline def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTlsSession(value: Buffer): Self = StObject.set(x, "tlsSession", value.asInstanceOf[js.Any])
      
      inline def setTlsSessionUndefined: Self = StObject.set(x, "tlsSession", js.undefined)
      
      inline def set_defaultAgent(value: typings.node.httpMod.Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
      
      inline def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
    }
  }
  
  type ResolveProtocolConnectFunction = js.Function2[
    /* options */ ConnectionOptions, 
    /* callback */ js.Function0[Unit], 
    Promisable[TLSSocket]
  ]
  
  type ResolveProtocolFunction = js.Function1[/* options */ AutoRequestOptions, js.Promise[ResolveProtocolResult]]
  
  trait ResolveProtocolResult extends StObject {
    
    var alpnProtocol: String
    
    var socket: js.UndefOr[TLSSocket] = js.undefined
    
    var timeout: js.UndefOr[Boolean] = js.undefined
  }
  object ResolveProtocolResult {
    
    inline def apply(alpnProtocol: String): ResolveProtocolResult = {
      val __obj = js.Dynamic.literal(alpnProtocol = alpnProtocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveProtocolResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveProtocolResult] (val x: Self) extends AnyVal {
      
      inline def setAlpnProtocol(value: String): Self = StObject.set(x, "alpnProtocol", value.asInstanceOf[js.Any])
      
      inline def setSocket(value: TLSSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      inline def setTimeout(value: Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}

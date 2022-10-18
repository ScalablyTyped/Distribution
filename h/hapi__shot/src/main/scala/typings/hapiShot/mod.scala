package typings.hapiShot

import typings.hapiShot.anon.Close
import typings.hapiShot.anon.ReadonlyIncomingHttpHeade
import typings.hapiShot.anon.Req
import typings.hapiShot.hapiShotStrings.`1Dot1`
import typings.node.NodeJS.Dict
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQueryInput
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/shot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inject(dispatchFunc: InjectionListener | MaybeInjectionListener, options: String): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(dispatchFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
  inline def inject(dispatchFunc: InjectionListener | MaybeInjectionListener, options: RequestOptions): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(dispatchFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
  
  inline def isInjection(obj: MaybeInjectedRequest): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInjection")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isInjection(obj: ServerResponse[IncomingMessage]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInjection")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {readonly [ P in keyof node.stream.Readable ]: node.stream.Readable[P]} */ trait InjectedRequest extends StObject {
    
    val connection: MockSocket
    
    val headers: ReadonlyIncomingHttpHeade
    
    val httpVersion: `1Dot1`
    
    val method: String
    
    val socket: MockSocket
    
    val url: String
  }
  object InjectedRequest {
    
    inline def apply(
      connection: MockSocket,
      headers: ReadonlyIncomingHttpHeade,
      method: String,
      socket: MockSocket,
      url: String
    ): InjectedRequest = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpVersion = "1.1", method = method.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedRequest]
    }
    
    extension [Self <: InjectedRequest](x: Self) {
      
      inline def setConnection(value: MockSocket): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: ReadonlyIncomingHttpHeade): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHttpVersion(value: `1Dot1`): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setSocket(value: MockSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type InjectionListener = js.Function2[/* req */ InjectedRequest, /* res */ ServerResponse[IncomingMessage], Unit]
  
  type MaybeInjectedRequest = InjectedRequest | IncomingMessage
  
  type MaybeInjectionListener = js.Function2[/* req */ MaybeInjectedRequest, /* res */ ServerResponse[IncomingMessage], Unit]
  
  @js.native
  trait MockSocket extends EventEmitter {
    
    def end(): Unit = js.native
    
    val remoteAddress: String = js.native
    
    def setTimeout(): Unit = js.native
  }
  
  /* Inlined std.Pick<node.url.UrlObject, 'protocol' | 'hostname' | 'port' | 'query'> & {  pathname :string} */
  trait PartialURL extends StObject {
    
    var hostname: js.UndefOr[String | Null] = js.undefined
    
    var pathname: String
    
    var port: js.UndefOr[String | Double | Null] = js.undefined
    
    var protocol: js.UndefOr[String | Null] = js.undefined
    
    var query: js.UndefOr[String | Null | ParsedUrlQueryInput] = js.undefined
  }
  object PartialURL {
    
    inline def apply(pathname: String): PartialURL = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialURL]
    }
    
    extension [Self <: PartialURL](x: Self) {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQuery(value: String | ParsedUrlQueryInput): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait RequestOptions extends StObject {
    
    /**
      * The HTTP HOST header value to be used if no header is provided,
      * and the url does not include an authority component.
      *
      * @default 'localhost'
      */
    var authority: js.UndefOr[String] = js.undefined
    
    /**
      * The request headers.
      */
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    /**
      * The HTTP request method.
      *
      * @default 'GET'
      */
    var method: js.UndefOr[String] = js.undefined
    
    /**
      * A request payload. Can be a string, Buffer, Stream or object that will be stringified.
      */
    var payload: js.UndefOr[String | Buffer | Stream | js.Object] = js.undefined
    
    /**
      * The client remote address.
      *
      * @default '127.0.0.1'
      */
    var remoteAddress: js.UndefOr[String] = js.undefined
    
    /**
      * an object containing flags to simulate various conditions:
      */
    var simulate: js.UndefOr[Close] = js.undefined
    
    /**
      * The request URL.
      */
    var url: String | PartialURL
    
    /**
      * Optional flag to validate this options object.
      *
      * @default true
      */
    var validate: js.UndefOr[Boolean] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(url: String | PartialURL): RequestOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPayload(value: String | Buffer | Stream | js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddressUndefined: Self = StObject.set(x, "remoteAddress", js.undefined)
      
      inline def setSimulate(value: Close): Self = StObject.set(x, "simulate", value.asInstanceOf[js.Any])
      
      inline def setSimulateUndefined: Self = StObject.set(x, "simulate", js.undefined)
      
      inline def setUrl(value: String | PartialURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait ResponseObject extends StObject {
    
    /**
      * An object containing the response headers.
      */
    var headers: OutgoingHttpHeaders
    
    /**
      * The payload as a UTF-8 encoded string.
      */
    var payload: String
    
    /**
      * An object containing the raw request and response objects.
      */
    var raw: Req
    
    /**
      * The raw payload as a Buffer.
      */
    var rawPayload: Buffer
    
    /**
      * The HTTP status code.
      */
    var statusCode: Double
    
    /**
      * The HTTP status message.
      */
    var statusMessage: String
    
    /**
      * An object containing the response trailers
      */
    var trailers: Dict[String]
  }
  object ResponseObject {
    
    inline def apply(
      headers: OutgoingHttpHeaders,
      payload: String,
      raw: Req,
      rawPayload: Buffer,
      statusCode: Double,
      statusMessage: String,
      trailers: Dict[String]
    ): ResponseObject = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rawPayload = rawPayload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseObject]
    }
    
    extension [Self <: ResponseObject](x: Self) {
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: Req): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawPayload(value: Buffer): Self = StObject.set(x, "rawPayload", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setTrailers(value: Dict[String]): Self = StObject.set(x, "trailers", value.asInstanceOf[js.Any])
    }
  }
}

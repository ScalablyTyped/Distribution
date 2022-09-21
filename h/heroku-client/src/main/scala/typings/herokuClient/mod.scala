package typings.herokuClient

import typings.herokuClient.anon.Encryptor
import typings.herokuClient.herokuClientStrings.DELETE
import typings.herokuClient.herokuClientStrings.GET
import typings.herokuClient.herokuClientStrings.PATCH
import typings.herokuClient.herokuClientStrings.POST
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("heroku-client", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Heroku {
    def this(options: HerokuClientOptions) = this()
  }
  
  @js.native
  trait Heroku extends StObject {
    
    def delete(path: String): ReturnType[js.Function0[js.Promise[Any]]] = js.native
    def delete(path: String, options: HerokuClientOptions): ReturnType[js.Function0[js.Promise[Any]]] = js.native
    
    def get(path: String): ReturnType[js.Function0[js.Promise[Any]]] = js.native
    def get(path: String, options: HerokuClientOptions): ReturnType[js.Function0[js.Promise[Any]]] = js.native
    
    var options: HerokuClientOptions = js.native
    
    def patch(path: String): ReturnType[js.Function0[js.Promise[Any]]] = js.native
    def patch(path: String, options: HerokuClientOptions): ReturnType[js.Function0[js.Promise[Any]]] = js.native
    
    def post(path: String): ReturnType[js.Function0[js.Promise[Any]]] = js.native
    def post(path: String, options: HerokuClientOptions): ReturnType[js.Function0[js.Promise[Any]]] = js.native
    
    def put(path: String): ReturnType[js.Function0[js.Promise[Any]]] = js.native
    def put(path: String, options: HerokuClientOptions): ReturnType[js.Function0[js.Promise[Any]]] = js.native
    
    def request(options: HerokuClientOptions): ReturnType[js.Function0[js.Promise[Any]]] = js.native
  }
  
  /* Inlined parent std.Partial<heroku-client.heroku-client.RequestURL> */
  trait HerokuClientOptions extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var cache: js.UndefOr[Encryptor] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var debugHeaders: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var logger: js.UndefOr[RequestLogger] = js.undefined
    
    var method: js.UndefOr[GET | POST | PATCH | DELETE] = js.undefined
    
    var middleware: js.UndefOr[
        js.Function2[/* res */ ServerResponse[IncomingMessage], /* cbk */ js.Function0[Unit], Unit]
      ] = js.undefined
    
    var parseJSON: js.UndefOr[Boolean] = js.undefined
    
    var partial: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object HerokuClientOptions {
    
    inline def apply(): HerokuClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HerokuClientOptions]
    }
    
    extension [Self <: HerokuClientOptions](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: Encryptor): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugHeaders(value: String): Self = StObject.set(x, "debugHeaders", value.asInstanceOf[js.Any])
      
      inline def setDebugHeadersUndefined: Self = StObject.set(x, "debugHeaders", js.undefined)
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setLogger(value: RequestLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMethod(value: GET | POST | PATCH | DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMiddleware(value: (/* res */ ServerResponse[IncomingMessage], /* cbk */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "middleware", js.Any.fromFunction2(value))
      
      inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
      
      inline def setParseJSON(value: Boolean): Self = StObject.set(x, "parseJSON", value.asInstanceOf[js.Any])
      
      inline def setParseJSONUndefined: Self = StObject.set(x, "parseJSON", js.undefined)
      
      inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<heroku-client.heroku-client.HerokuClientOptions, keyof heroku-client.heroku-client.RequestURL> */
  /* Inlined parent heroku-client.heroku-client.RequestURL */
  @js.native
  trait Request extends StObject {
    
    var agent: Agent = js.native
    
    var aggregate: js.UndefOr[js.Array[Any]] = js.native
    
    var body: js.UndefOr[Any] = js.native
    
    var cache: js.UndefOr[Encryptor] = js.native
    
    var cachedResponse: js.UndefOr[ServerResponse[IncomingMessage]] = js.native
    
    var certs: js.Array[Buffer] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var debugHeaders: js.UndefOr[String] = js.native
    
    def handleError(error: ServerResponse[IncomingMessage]): Unit = js.native
    
    /**
      * In the event of a non-successful API request,
      * fail with an appropriate error message and
      * status code.
      */
    def handleFailure(res: ServerResponse[IncomingMessage], buffer: String): Unit = js.native
    def handleFailure(res: ServerResponse[IncomingMessage], buffer: Buffer): Unit = js.native
    
    /**
      * Handle an API response, returning the API response.
      */
    def handleResponse(res: ServerResponse[IncomingMessage]): Unit = js.native
    
    /**
      * In the event of a successful API response,
      * respond with the response body.
      */
    def handleSuccess(res: ServerResponse[IncomingMessage], buffer: String): Unit = js.native
    def handleSuccess(res: ServerResponse[IncomingMessage], buffer: Buffer): Unit = js.native
    
    var headers: js.UndefOr[Record[String, String]] = js.native
    
    var host: String = js.native
    
    def isRetryAllowed(error: ServerResponse[IncomingMessage]): Boolean = js.native
    
    var json: js.UndefOr[Boolean] = js.native
    
    def logRequest(req: ClientRequest): Unit = js.native
    
    /**
      * Log the API response.
      */
    def logResponse(res: ServerResponse[IncomingMessage]): Unit = js.native
    
    var logger: js.UndefOr[RequestLogger] = js.native
    
    var method: js.UndefOr[GET | POST | PATCH | DELETE] = js.native
    
    var middleware: js.UndefOr[
        js.Function2[/* res */ ServerResponse[IncomingMessage], /* cbk */ js.Function0[Unit], Unit]
      ] = js.native
    
    var nextRange: js.UndefOr[String] = js.native
    
    /**
      * Since this request isn't the full response (206 or
      * 304 with a cached Next-Range), perform the next
      * request for more data.
      */
    def nextRequest(nextRange: String, body: js.Array[String | js.Object]): Unit = js.native
    
    var options: HerokuClientOptions = js.native
    
    /**
      * Get the request body, and parse it (or not) as appropriate.
      * - Parse JSON by default.
      * - If parseJSON is `false`, it will not parse.
      */
    def parseBody(body: String): String | js.Object = js.native
    def parseBody(body: Buffer): String | js.Object = js.native
    
    var parseJSON: js.UndefOr[Boolean] = js.native
    
    var partial: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var port: Double = js.native
    
    var promise: js.Promise[Any] = js.native
    
    def reject(err: Any): Unit = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    /**
      * Perform the actual API request.
      */
    def request(): js.Promise[Any] = js.native
    
    def resolve(`val`: Any): Unit = js.native
    
    var retries: js.UndefOr[Double] = js.native
    
    var secure: Boolean = js.native
    
    /**
      * If the request options include a timeout,
      * set the timeout and provide a callback
      * function in case the request exceeds the
      * timeout period.
      */
    def setRequestTimeout(req: ClientRequest): Unit = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var token: js.UndefOr[String] = js.native
    
    /**
      * If given an object, sets aggregate to object,
      * otherwise concats array onto aggregate.
      */
    def updateAggregate(aggregate: js.Array[String | js.Object]): Unit = js.native
    
    var userAgent: js.UndefOr[String] = js.native
    
    /**
      * If the request options include a body,
      * write the body to the request and set
      * an appropriate 'Content-length' header.
      */
    def writeBody(req: ClientRequest): Unit = js.native
  }
  
  trait RequestCache extends StObject {
    
    def get(key: String, cb: js.Function2[/* err */ Any, /* value */ Any, Unit]): Unit
    
    def set(key: String, value: Any): Unit
  }
  object RequestCache {
    
    inline def apply(
      get: (String, js.Function2[/* err */ Any, /* value */ Any, Unit]) => Unit,
      set: (String, Any) => Unit
    ): RequestCache = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[RequestCache]
    }
    
    extension [Self <: RequestCache](x: Self) {
      
      inline def setGet(value: (String, js.Function2[/* err */ Any, /* value */ Any, Unit]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait RequestLogger extends StObject {
    
    def log(msg: Any): Unit
  }
  object RequestLogger {
    
    inline def apply(log: Any => Unit): RequestLogger = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
      __obj.asInstanceOf[RequestLogger]
    }
    
    extension [Self <: RequestLogger](x: Self) {
      
      inline def setLog(value: Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    }
  }
  
  trait RequestURL extends StObject {
    
    var host: String
    
    var port: Double
    
    var secure: Boolean
  }
  object RequestURL {
    
    inline def apply(host: String, port: Double, secure: Boolean): RequestURL = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestURL]
    }
    
    extension [Self <: RequestURL](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
}

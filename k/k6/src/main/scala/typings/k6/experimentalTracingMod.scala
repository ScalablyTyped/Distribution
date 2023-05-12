package typings.k6

import typings.k6.httpMod.RefinedParams
import typings.k6.httpMod.RefinedResponse
import typings.k6.httpMod.RequestBody
import typings.k6.httpMod.ResponseType
import typings.k6.k6Strings.`http-url`
import typings.k6.k6Strings.jaeger
import typings.k6.k6Strings.w3c
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalTracingMod {
  
  @JSImport("k6/experimental/tracing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("k6/experimental/tracing", "Client")
  @js.native
  open class Client protected () extends StObject {
    /**
      * Instantiates a new tracing Client.
      *
      * @param options - The options to use for this Client.
      */
    def this(options: Options) = this()
    
    /**
      * The asyncRequest method starts the process of performing a HTTP request
      * asynchronously, returning a promise which is fulfilled once the response
      * is available. The performed request is instrumented with trace context
      * headers.
      *
      * @param method - HTTP method.
      * @param url - Request URL.
      * @param body - Request body. Object form encoded.
      * @param params - Request parameters.
      * @returns Resulting response.
      */
    def asyncRequest[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String): js.Promise[RefinedResponse[RT]] = js.native
    def asyncRequest[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: Null, params: RefinedParams[RT]): js.Promise[RefinedResponse[RT]] = js.native
    def asyncRequest[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: Unit, params: RefinedParams[RT]): js.Promise[RefinedResponse[RT]] = js.native
    def asyncRequest[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody): js.Promise[RefinedResponse[RT]] = js.native
    def asyncRequest[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody, params: RefinedParams[RT]): js.Promise[RefinedResponse[RT]] = js.native
    def asyncRequest[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL): js.Promise[RefinedResponse[RT]] = js.native
    def asyncRequest[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: Null, params: RefinedParams[RT]): js.Promise[RefinedResponse[RT]] = js.native
    def asyncRequest[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: Unit, params: RefinedParams[RT]): js.Promise[RefinedResponse[RT]] = js.native
    def asyncRequest[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: RequestBody): js.Promise[RefinedResponse[RT]] = js.native
    def asyncRequest[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: RequestBody, params: RefinedParams[RT]): js.Promise[RefinedResponse[RT]] = js.native
    
    /**
      * Performs a DELETE request instrumented with trace context
      * headers.
      *
      * @param url - Request URL.
      * @param body - Discouraged. Request body. Object form encoded.
      * @param params - Request parameters.
      * @returns Resulting response.
      */
    def del[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
    def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
    def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = js.native
    def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = js.native
    def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    
    /**
      * Performs a GET request instrumented with trace context headers.
      *
      * @param url - Request URL.
      * @param params - Request parameters.
      * @returns Resulting response.
      */
    def get[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
    def get[RT /* <: js.UndefOr[ResponseType] */](url: String, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def get[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = js.native
    def get[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    
    /**
      * Performs a HEAD request instrumented with trace context headers.
      *
      * @param url - Request URL.
      * @param params - Request parameters.
      * @returns Resulting response.
      */
    def head[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
    def head[RT /* <: js.UndefOr[ResponseType] */](url: String, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def head[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = js.native
    def head[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    
    /**
      * Performs an OPTIONS request instrumented with trace context headers.
      *
      * @param url - Request URL.
      * @param body - Request body. Object form encoded.
      * @param params - Request parameters.
      * @returns Resulting response.
      */
    def options[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
    def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
    def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = js.native
    def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = js.native
    def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    
    /**
      * Performs a PATCH request instrumented with trace context headers.
      *
      * @param url - Request URL.
      * @param body - Request body. Object form encoded.
      * @param params - Request parameters.
      * @returns Resulting response.
      */
    def patch[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
    def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
    def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = js.native
    def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = js.native
    def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    
    /**
      * Performs a POST request instrumented with trace context headers.
      *
      * @param url - Request URL.
      * @param body - Request body. Object form encoded.
      * @param params - Request parameters.
      * @returns Resulting response.
      */
    def post[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
    def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
    def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = js.native
    def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = js.native
    def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    
    /**
      * Performs a PUT request instrumented with trace context headers.
      *
      * @param url - Request URL.
      * @param body - Request body. Object form encoded.
      * @param params - Request parameters.
      * @returns Resulting response.
      */
    def put[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
    def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
    def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = js.native
    def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = js.native
    def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    
    /**
      * Performs a HTTP request instrumented with trace context headers.
      *
      * @param method - HTTP method.
      * @param url - Request URL.
      * @param body - Request body. Object form encoded.
      * @param params - Request parameters.
      * @returns Resulting response.
      */
    def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String): RefinedResponse[RT] = js.native
    def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody): RefinedResponse[RT] = js.native
    def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL): RefinedResponse[RT] = js.native
    def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
    def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: RequestBody): RefinedResponse[RT] = js.native
    def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  }
  
  inline def instrumentHTTP(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("instrumentHTTP")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait HttpURL extends StObject {
    
    var __brand: `http-url`
  }
  object HttpURL {
    
    inline def apply(): HttpURL = {
      val __obj = js.Dynamic.literal(__brand = "http-url")
      __obj.asInstanceOf[HttpURL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpURL] (val x: Self) extends AnyVal {
      
      inline def set__brand(value: `http-url`): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * The trace context propagation format.
      *
      * Currently supported: `w3c` and `jaeger`.
      *
      * Defaults to `w3c`.
      */
    var propagator: w3c | jaeger
    
    /**
      * The probability of each request having
      * its `sampled` flag set to true.
      * Its value should be within the `0 <= n <= 100` bounds.
      *
      * Defaults to `100`.
      */
    var sampling: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(propagator: w3c | jaeger): Options = {
      val __obj = js.Dynamic.literal(propagator = propagator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPropagator(value: w3c | jaeger): Self = StObject.set(x, "propagator", value.asInstanceOf[js.Any])
      
      inline def setSampling(value: Double): Self = StObject.set(x, "sampling", value.asInstanceOf[js.Any])
      
      inline def setSamplingUndefined: Self = StObject.set(x, "sampling", js.undefined)
    }
  }
}

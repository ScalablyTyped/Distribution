package typings.lightMyRequest

import org.scalablytyped.runtime.StringDictionary
import typings.lightMyRequest.anon.Close
import typings.lightMyRequest.anon.Hostname
import typings.lightMyRequest.anon.Req
import typings.lightMyRequest.lightMyRequestStrings.delete_
import typings.lightMyRequest.lightMyRequestStrings.get_
import typings.lightMyRequest.lightMyRequestStrings.head_
import typings.lightMyRequest.lightMyRequestStrings.options_
import typings.lightMyRequest.lightMyRequestStrings.patch_
import typings.lightMyRequest.lightMyRequestStrings.post_
import typings.lightMyRequest.lightMyRequestStrings.put_
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.streamMod.Readable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("light-my-request", "inject")
  @js.native
  def inject(dispatchFunc: DispatchFunc): Chain = js.native
  @JSImport("light-my-request", "inject")
  @js.native
  def inject(dispatchFunc: DispatchFunc, options: String): Chain = js.native
  @JSImport("light-my-request", "inject")
  @js.native
  def inject(dispatchFunc: DispatchFunc, options: String, callback: CallbackFunc): Unit = js.native
  @JSImport("light-my-request", "inject")
  @js.native
  def inject(dispatchFunc: DispatchFunc, options: InjectOptions): Chain = js.native
  @JSImport("light-my-request", "inject")
  @js.native
  def inject(dispatchFunc: DispatchFunc, options: InjectOptions, callback: CallbackFunc): Unit = js.native
  
  @JSImport("light-my-request", "isInjection")
  @js.native
  def isInjection(obj: Request): Boolean = js.native
  @JSImport("light-my-request", "isInjection")
  @js.native
  def isInjection(obj: Response): Boolean = js.native
  
  type CallbackFunc = js.Function2[/* err */ Error, /* response */ Response, Unit]
  
  @js.native
  trait Chain
    extends js.Promise[Response] {
    
    def body(body: InjectPayload): Chain = js.native
    
    def cookies(query: js.Object): Chain = js.native
    
    def delete(url: String): Chain = js.native
    
    def end(): js.Promise[Response] = js.native
    def end(callback: CallbackFunc): Unit = js.native
    
    def get(url: String): Chain = js.native
    
    def head(url: String): Chain = js.native
    
    def headers(headers: IncomingHttpHeaders): Chain = js.native
    def headers(headers: OutgoingHttpHeaders): Chain = js.native
    
    def options(url: String): Chain = js.native
    
    def patch(url: String): Chain = js.native
    
    def payload(payload: InjectPayload): Chain = js.native
    
    def post(url: String): Chain = js.native
    
    def put(url: String): Chain = js.native
    
    def query(query: js.Object): Chain = js.native
    
    def trace(url: String): Chain = js.native
  }
  
  type DispatchFunc = js.Function2[/* req */ Request, /* res */ Response, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.lightMyRequest.lightMyRequestStrings.DELETE
    - typings.lightMyRequest.lightMyRequestStrings.delete_
    - typings.lightMyRequest.lightMyRequestStrings.GET
    - typings.lightMyRequest.lightMyRequestStrings.get_
    - typings.lightMyRequest.lightMyRequestStrings.HEAD
    - typings.lightMyRequest.lightMyRequestStrings.head_
    - typings.lightMyRequest.lightMyRequestStrings.PATCH
    - typings.lightMyRequest.lightMyRequestStrings.patch_
    - typings.lightMyRequest.lightMyRequestStrings.POST
    - typings.lightMyRequest.lightMyRequestStrings.post_
    - typings.lightMyRequest.lightMyRequestStrings.PUT
    - typings.lightMyRequest.lightMyRequestStrings.put_
    - typings.lightMyRequest.lightMyRequestStrings.OPTIONS
    - typings.lightMyRequest.lightMyRequestStrings.options_
  */
  trait HTTPMethods extends StObject
  object HTTPMethods {
    
    @scala.inline
    def DELETE: typings.lightMyRequest.lightMyRequestStrings.DELETE = "DELETE".asInstanceOf[typings.lightMyRequest.lightMyRequestStrings.DELETE]
    
    @scala.inline
    def GET: typings.lightMyRequest.lightMyRequestStrings.GET = "GET".asInstanceOf[typings.lightMyRequest.lightMyRequestStrings.GET]
    
    @scala.inline
    def HEAD: typings.lightMyRequest.lightMyRequestStrings.HEAD = "HEAD".asInstanceOf[typings.lightMyRequest.lightMyRequestStrings.HEAD]
    
    @scala.inline
    def OPTIONS: typings.lightMyRequest.lightMyRequestStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.lightMyRequest.lightMyRequestStrings.OPTIONS]
    
    @scala.inline
    def PATCH: typings.lightMyRequest.lightMyRequestStrings.PATCH = "PATCH".asInstanceOf[typings.lightMyRequest.lightMyRequestStrings.PATCH]
    
    @scala.inline
    def POST: typings.lightMyRequest.lightMyRequestStrings.POST = "POST".asInstanceOf[typings.lightMyRequest.lightMyRequestStrings.POST]
    
    @scala.inline
    def PUT: typings.lightMyRequest.lightMyRequestStrings.PUT = "PUT".asInstanceOf[typings.lightMyRequest.lightMyRequestStrings.PUT]
    
    @scala.inline
    def delete: delete_ = "delete".asInstanceOf[delete_]
    
    @scala.inline
    def get: get_ = "get".asInstanceOf[get_]
    
    @scala.inline
    def head: head_ = "head".asInstanceOf[head_]
    
    @scala.inline
    def options: options_ = "options".asInstanceOf[options_]
    
    @scala.inline
    def patch: patch_ = "patch".asInstanceOf[patch_]
    
    @scala.inline
    def post: post_ = "post".asInstanceOf[post_]
    
    @scala.inline
    def put: put_ = "put".asInstanceOf[put_]
  }
  
  @js.native
  trait InjectOptions extends StObject {
    
    var authority: js.UndefOr[String] = js.native
    
    var cookies: js.UndefOr[StringDictionary[String]] = js.native
    
    var headers: js.UndefOr[IncomingHttpHeaders | OutgoingHttpHeaders] = js.native
    
    var method: js.UndefOr[HTTPMethods] = js.native
    
    var path: js.UndefOr[String | Hostname] = js.native
    
    var payload: js.UndefOr[InjectPayload] = js.native
    
    var query: js.UndefOr[String | (StringDictionary[String | js.Array[String]])] = js.native
    
    var remoteAddress: js.UndefOr[String] = js.native
    
    var server: js.UndefOr[Server] = js.native
    
    var simulate: js.UndefOr[Close] = js.native
    
    var url: js.UndefOr[String | Hostname] = js.native
    
    var validate: js.UndefOr[Boolean] = js.native
  }
  object InjectOptions {
    
    @scala.inline
    def apply(): InjectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InjectOptions]
    }
    
    @scala.inline
    implicit class InjectOptionsMutableBuilder[Self <: InjectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      @scala.inline
      def setCookies(value: StringDictionary[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setHeaders(value: IncomingHttpHeaders | OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: HTTPMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPath(value: String | Hostname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPayload(value: InjectPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setQuery(value: String | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteAddressUndefined: Self = StObject.set(x, "remoteAddress", js.undefined)
      
      @scala.inline
      def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      @scala.inline
      def setSimulate(value: Close): Self = StObject.set(x, "simulate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimulateUndefined: Self = StObject.set(x, "simulate", js.undefined)
      
      @scala.inline
      def setUrl(value: String | Hostname): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  type InjectPayload = String | js.Object | Buffer | ReadableStream
  
  @js.native
  trait Request extends Readable {
    
    // @deprecated
    var connection: js.Object = js.native
    
    var headers: IncomingHttpHeaders = js.native
    
    var httpVersion: String = js.native
    
    var method: HTTPMethods = js.native
    
    def prepare(next: js.Function0[Unit]): Unit = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait Response extends ServerResponse {
    
    var body: String = js.native
    
    var cookies: js.Array[js.Object] = js.native
    
    var headers: OutgoingHttpHeaders = js.native
    
    def json[T](): T = js.native
    
    var payload: String = js.native
    
    var raw: Req = js.native
    
    var rawPayload: Buffer = js.native
    
    var trailers: StringDictionary[String] = js.native
  }
}

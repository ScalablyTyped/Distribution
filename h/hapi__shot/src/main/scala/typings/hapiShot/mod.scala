package typings.hapiShot

import org.scalablytyped.runtime.StringDictionary
import typings.hapiShot.anon.Close
import typings.hapiShot.anon.Req
import typings.node.Buffer
import typings.node.httpMod.ServerResponse
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/shot", "inject")
  @js.native
  def inject(dispatchFunc: Listener, options: RequestOptions): js.Promise[ResponseObject] = js.native
  
  @JSImport("@hapi/shot", "isInjection")
  @js.native
  def isInjection(obj: js.Any): Boolean = js.native
  
  type Headers = StringDictionary[String | js.Array[String]]
  
  type Listener = js.Function2[/* req */ SimulatedRequestObject, /* res */ SimulatedResponseObject, Unit]
  
  @js.native
  trait RequestOptions extends StObject {
    
    /** a string specifying the HTTP HOST header value to be used if no header is provided, and the url does not include an authority component. Defaults to 'localhost'. */
    var authority: js.UndefOr[String] = js.native
    
    /** an optional object containing request headers. */
    var headers: js.UndefOr[Headers] = js.native
    
    /** a string specifying the HTTP request method, defaulting to 'GET'. */
    var method: js.UndefOr[String] = js.native
    
    /** an optional request payload. Can be a string, Buffer, Stream or object. */
    var payload: js.UndefOr[String | Buffer | Stream | js.Object] = js.native
    
    /** an optional string specifying the client remote address. Defaults to '127.0.0.1'. */
    var remoteAddress: js.UndefOr[String] = js.native
    
    /** an object containing flags to simulate various conditions: */
    var simulate: js.UndefOr[Close] = js.native
    
    /** a string specifying the request URL. */
    var url: String = js.native
    
    /** Optional flag to validate this options object. Defaults to true. */
    var validate: js.UndefOr[Boolean] = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply(url: String): RequestOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPayload(value: String | Buffer | Stream | js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteAddressUndefined: Self = StObject.set(x, "remoteAddress", js.undefined)
      
      @scala.inline
      def setSimulate(value: Close): Self = StObject.set(x, "simulate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimulateUndefined: Self = StObject.set(x, "simulate", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  @js.native
  trait ResponseObject extends StObject {
    
    /** an object containing the response headers. */
    var headers: Headers = js.native
    
    /** the payload as a UTF-8 encoded string. */
    var payload: String = js.native
    
    /** an object containing the raw request and response objects where: */
    var raw: Req = js.native
    
    /** the raw payload as a Buffer. */
    var rawPayload: Buffer = js.native
    
    /** the HTTP status code. */
    var statusCode: Double = js.native
    
    /** the HTTP status message. */
    var statusMessage: String = js.native
    
    /** an object containing the response trailers. */
    var trailers: StringDictionary[js.Any] = js.native
  }
  object ResponseObject {
    
    @scala.inline
    def apply(
      headers: Headers,
      payload: String,
      raw: Req,
      rawPayload: Buffer,
      statusCode: Double,
      statusMessage: String,
      trailers: StringDictionary[js.Any]
    ): ResponseObject = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rawPayload = rawPayload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseObject]
    }
    
    @scala.inline
    implicit class ResponseObjectMutableBuilder[Self <: ResponseObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: Req): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawPayload(value: Buffer): Self = StObject.set(x, "rawPayload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailers(value: StringDictionary[js.Any]): Self = StObject.set(x, "trailers", value.asInstanceOf[js.Any])
    }
  }
  
  type SimulatedRequestObject = Readable
  
  type SimulatedResponseObject = ServerResponse
}

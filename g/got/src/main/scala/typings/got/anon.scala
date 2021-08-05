package typings.got

import org.scalablytyped.runtime.Instantiable0
import typings.got.gotBooleans.`true`
import typings.got.mod.AgentOptions
import typings.got.mod.Cache
import typings.got.mod.GotBodyFn
import typings.got.mod.GotBodyOptions
import typings.got.mod.GotEmitter
import typings.got.mod.GotExtend
import typings.got.mod.GotFormFn
import typings.got.mod.GotFormOptions
import typings.got.mod.GotJSONFn
import typings.got.mod.GotJSONOptions
import typings.got.mod.GotOptions
import typings.got.mod.GotPromise
import typings.got.mod.GotStreamFn
import typings.got.mod.GotUrl
import typings.got.mod.HTTPError
import typings.got.mod.Hooks
import typings.got.mod.MaxRedirectsError
import typings.got.mod.ParseError
import typings.got.mod.ReadError
import typings.got.mod.RequestError
import typings.got.mod.RequestFunction
import typings.got.mod.RetryOptions
import typings.got.mod.TimeoutError
import typings.got.mod.TimeoutOptions
import typings.got.mod.UnsupportedProtocolError
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.Socket
import typings.node.streamMod.Duplex
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PxfObject
import typings.node.tlsMod.SecureVersion
import typings.node.urlMod.URLSearchParams
import typings.std.Error
import typings.std.Partial
import typings.std.Record
import typings.toughCookie.mod.CookieJar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CancelError extends StObject {
    
    var CancelError: Instantiable0[typings.got.mod.CancelError]
    
    var HTTPError: Instantiable0[typings.got.mod.HTTPError]
    
    var MaxRedirectsError: Instantiable0[typings.got.mod.MaxRedirectsError]
    
    var ParseError: Instantiable0[typings.got.mod.ParseError]
    
    var ReadError: Instantiable0[typings.got.mod.ReadError]
    
    var RequestError: Instantiable0[typings.got.mod.RequestError]
    
    var TimeoutError: Instantiable0[typings.got.mod.TimeoutError]
    
    var UnsupportedProtocolError: Instantiable0[typings.got.mod.UnsupportedProtocolError]
    
    def extend(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull
    def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin
    def extend(options: GotJSONOptions): GotInstanceGotJSONFn
    @JSName("extend")
    def extend_GotInstanceGotBodyFnstrin(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin
    @JSName("extend")
    def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull
    @JSName("extend")
    var extend_Original: GotExtend
    
    def stream(url: GotUrl): GotEmitter & Duplex
    def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter & Duplex
    @JSName("stream")
    var stream_Original: GotStreamFn & Recordgetpostputpatchhead
  }
  object CancelError {
    
    inline def apply(
      CancelError: Instantiable0[typings.got.mod.CancelError],
      HTTPError: Instantiable0[HTTPError],
      MaxRedirectsError: Instantiable0[MaxRedirectsError],
      ParseError: Instantiable0[ParseError],
      ReadError: Instantiable0[ReadError],
      RequestError: Instantiable0[RequestError],
      TimeoutError: Instantiable0[TimeoutError],
      UnsupportedProtocolError: Instantiable0[UnsupportedProtocolError],
      extend: GotExtend,
      stream: GotStreamFn & Recordgetpostputpatchhead
    ): CancelError = {
      val __obj = js.Dynamic.literal(CancelError = CancelError.asInstanceOf[js.Any], HTTPError = HTTPError.asInstanceOf[js.Any], MaxRedirectsError = MaxRedirectsError.asInstanceOf[js.Any], ParseError = ParseError.asInstanceOf[js.Any], ReadError = ReadError.asInstanceOf[js.Any], RequestError = RequestError.asInstanceOf[js.Any], TimeoutError = TimeoutError.asInstanceOf[js.Any], UnsupportedProtocolError = UnsupportedProtocolError.asInstanceOf[js.Any], extend = extend.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelError]
    }
    
    extension [Self <: CancelError](x: Self) {
      
      inline def setCancelError(value: Instantiable0[typings.got.mod.CancelError]): Self = StObject.set(x, "CancelError", value.asInstanceOf[js.Any])
      
      inline def setExtend(value: GotExtend): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      inline def setHTTPError(value: Instantiable0[HTTPError]): Self = StObject.set(x, "HTTPError", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsError(value: Instantiable0[MaxRedirectsError]): Self = StObject.set(x, "MaxRedirectsError", value.asInstanceOf[js.Any])
      
      inline def setParseError(value: Instantiable0[ParseError]): Self = StObject.set(x, "ParseError", value.asInstanceOf[js.Any])
      
      inline def setReadError(value: Instantiable0[ReadError]): Self = StObject.set(x, "ReadError", value.asInstanceOf[js.Any])
      
      inline def setRequestError(value: Instantiable0[RequestError]): Self = StObject.set(x, "RequestError", value.asInstanceOf[js.Any])
      
      inline def setStream(value: GotStreamFn & Recordgetpostputpatchhead): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setTimeoutError(value: Instantiable0[TimeoutError]): Self = StObject.set(x, "TimeoutError", value.asInstanceOf[js.Any])
      
      inline def setUnsupportedProtocolError(value: Instantiable0[UnsupportedProtocolError]): Self = StObject.set(x, "UnsupportedProtocolError", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined got.got.GotInstance<got.got.GotBodyFn<null>> */
  @js.native
  trait GotInstanceGotBodyFnnull extends StObject {
    
    def apply(url: GotUrl): GotPromise[String | Buffer] = js.native
    def apply(url: GotUrl, options: GotBodyOptions[Null]): GotPromise[String | Buffer] = js.native
    
    var CancelError: Instantiable0[typings.got.mod.CancelError] = js.native
    
    var HTTPError: Instantiable0[typings.got.mod.HTTPError] = js.native
    
    var MaxRedirectsError: Instantiable0[typings.got.mod.MaxRedirectsError] = js.native
    
    var ParseError: Instantiable0[typings.got.mod.ParseError] = js.native
    
    var ReadError: Instantiable0[typings.got.mod.ReadError] = js.native
    
    var RequestError: Instantiable0[typings.got.mod.RequestError] = js.native
    
    var TimeoutError: Instantiable0[typings.got.mod.TimeoutError] = js.native
    
    var UnsupportedProtocolError: Instantiable0[typings.got.mod.UnsupportedProtocolError] = js.native
    
    def delete(url: GotUrl): GotPromise[String | Buffer] = js.native
    def delete(url: GotUrl, options: GotBodyOptions[Null]): GotPromise[String | Buffer] = js.native
    @JSName("delete")
    var delete_Original: GotBodyFn[Null] = js.native
    
    def extend(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
    def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
    def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
    @JSName("extend")
    def extend_GotInstanceGotBodyFnstrin(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
    @JSName("extend")
    def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
    @JSName("extend")
    var extend_Original: GotExtend = js.native
    
    def get(url: GotUrl): GotPromise[String | Buffer] = js.native
    def get(url: GotUrl, options: GotBodyOptions[Null]): GotPromise[String | Buffer] = js.native
    @JSName("get")
    var get_Original: GotBodyFn[Null] = js.native
    
    def head(url: GotUrl): GotPromise[String | Buffer] = js.native
    def head(url: GotUrl, options: GotBodyOptions[Null]): GotPromise[String | Buffer] = js.native
    @JSName("head")
    var head_Original: GotBodyFn[Null] = js.native
    
    def patch(url: GotUrl): GotPromise[String | Buffer] = js.native
    def patch(url: GotUrl, options: GotBodyOptions[Null]): GotPromise[String | Buffer] = js.native
    @JSName("patch")
    var patch_Original: GotBodyFn[Null] = js.native
    
    def post(url: GotUrl): GotPromise[String | Buffer] = js.native
    def post(url: GotUrl, options: GotBodyOptions[Null]): GotPromise[String | Buffer] = js.native
    @JSName("post")
    var post_Original: GotBodyFn[Null] = js.native
    
    def put(url: GotUrl): GotPromise[String | Buffer] = js.native
    def put(url: GotUrl, options: GotBodyOptions[Null]): GotPromise[String | Buffer] = js.native
    @JSName("put")
    var put_Original: GotBodyFn[Null] = js.native
    
    def stream(url: GotUrl): GotEmitter & Duplex = js.native
    def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter & Duplex = js.native
    @JSName("stream")
    var stream_Original: GotStreamFn & Recordgetpostputpatchhead = js.native
  }
  
  /* Inlined got.got.GotInstance<got.got.GotBodyFn<string>> */
  @js.native
  trait GotInstanceGotBodyFnstrin extends StObject {
    
    def apply(url: GotUrl): GotPromise[String | Buffer] = js.native
    def apply(url: GotUrl, options: GotBodyOptions[String]): GotPromise[String | Buffer] = js.native
    
    var CancelError: Instantiable0[typings.got.mod.CancelError] = js.native
    
    var HTTPError: Instantiable0[typings.got.mod.HTTPError] = js.native
    
    var MaxRedirectsError: Instantiable0[typings.got.mod.MaxRedirectsError] = js.native
    
    var ParseError: Instantiable0[typings.got.mod.ParseError] = js.native
    
    var ReadError: Instantiable0[typings.got.mod.ReadError] = js.native
    
    var RequestError: Instantiable0[typings.got.mod.RequestError] = js.native
    
    var TimeoutError: Instantiable0[typings.got.mod.TimeoutError] = js.native
    
    var UnsupportedProtocolError: Instantiable0[typings.got.mod.UnsupportedProtocolError] = js.native
    
    def delete(url: GotUrl): GotPromise[String | Buffer] = js.native
    def delete(url: GotUrl, options: GotBodyOptions[String]): GotPromise[String | Buffer] = js.native
    @JSName("delete")
    var delete_Original: GotBodyFn[String] = js.native
    
    def extend(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
    def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
    def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
    @JSName("extend")
    def extend_GotInstanceGotBodyFnstrin(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
    @JSName("extend")
    def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
    @JSName("extend")
    var extend_Original: GotExtend = js.native
    
    def get(url: GotUrl): GotPromise[String | Buffer] = js.native
    def get(url: GotUrl, options: GotBodyOptions[String]): GotPromise[String | Buffer] = js.native
    @JSName("get")
    var get_Original: GotBodyFn[String] = js.native
    
    def head(url: GotUrl): GotPromise[String | Buffer] = js.native
    def head(url: GotUrl, options: GotBodyOptions[String]): GotPromise[String | Buffer] = js.native
    @JSName("head")
    var head_Original: GotBodyFn[String] = js.native
    
    def patch(url: GotUrl): GotPromise[String | Buffer] = js.native
    def patch(url: GotUrl, options: GotBodyOptions[String]): GotPromise[String | Buffer] = js.native
    @JSName("patch")
    var patch_Original: GotBodyFn[String] = js.native
    
    def post(url: GotUrl): GotPromise[String | Buffer] = js.native
    def post(url: GotUrl, options: GotBodyOptions[String]): GotPromise[String | Buffer] = js.native
    @JSName("post")
    var post_Original: GotBodyFn[String] = js.native
    
    def put(url: GotUrl): GotPromise[String | Buffer] = js.native
    def put(url: GotUrl, options: GotBodyOptions[String]): GotPromise[String | Buffer] = js.native
    @JSName("put")
    var put_Original: GotBodyFn[String] = js.native
    
    def stream(url: GotUrl): GotEmitter & Duplex = js.native
    def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter & Duplex = js.native
    @JSName("stream")
    var stream_Original: GotStreamFn & Recordgetpostputpatchhead = js.native
  }
  
  /* Inlined got.got.GotInstance<got.got.GotFormFn<null>> */
  @js.native
  trait GotInstanceGotFormFnnull extends StObject {
    
    def apply(url: GotUrl): GotPromise[String | Buffer] = js.native
    def apply(url: GotUrl, options: PartialGotFormOptionsnull): GotPromise[String | Buffer] = js.native
    
    var CancelError: Instantiable0[typings.got.mod.CancelError] = js.native
    
    var HTTPError: Instantiable0[typings.got.mod.HTTPError] = js.native
    
    var MaxRedirectsError: Instantiable0[typings.got.mod.MaxRedirectsError] = js.native
    
    var ParseError: Instantiable0[typings.got.mod.ParseError] = js.native
    
    var ReadError: Instantiable0[typings.got.mod.ReadError] = js.native
    
    var RequestError: Instantiable0[typings.got.mod.RequestError] = js.native
    
    var TimeoutError: Instantiable0[typings.got.mod.TimeoutError] = js.native
    
    var UnsupportedProtocolError: Instantiable0[typings.got.mod.UnsupportedProtocolError] = js.native
    
    def delete(url: GotUrl): GotPromise[String | Buffer] = js.native
    def delete(url: GotUrl, options: Partial[GotFormOptions[Null]]): GotPromise[String | Buffer] = js.native
    @JSName("delete")
    var delete_Original: GotFormFn[Null] = js.native
    
    def extend(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
    def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
    def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
    @JSName("extend")
    def extend_GotInstanceGotBodyFnstrin(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
    @JSName("extend")
    def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
    @JSName("extend")
    var extend_Original: GotExtend = js.native
    
    def get(url: GotUrl): GotPromise[String | Buffer] = js.native
    def get(url: GotUrl, options: Partial[GotFormOptions[Null]]): GotPromise[String | Buffer] = js.native
    @JSName("get")
    var get_Original: GotFormFn[Null] = js.native
    
    def head(url: GotUrl): GotPromise[String | Buffer] = js.native
    def head(url: GotUrl, options: Partial[GotFormOptions[Null]]): GotPromise[String | Buffer] = js.native
    @JSName("head")
    var head_Original: GotFormFn[Null] = js.native
    
    def patch(url: GotUrl): GotPromise[String | Buffer] = js.native
    def patch(url: GotUrl, options: Partial[GotFormOptions[Null]]): GotPromise[String | Buffer] = js.native
    @JSName("patch")
    var patch_Original: GotFormFn[Null] = js.native
    
    def post(url: GotUrl): GotPromise[String | Buffer] = js.native
    def post(url: GotUrl, options: Partial[GotFormOptions[Null]]): GotPromise[String | Buffer] = js.native
    @JSName("post")
    var post_Original: GotFormFn[Null] = js.native
    
    def put(url: GotUrl): GotPromise[String | Buffer] = js.native
    def put(url: GotUrl, options: Partial[GotFormOptions[Null]]): GotPromise[String | Buffer] = js.native
    @JSName("put")
    var put_Original: GotFormFn[Null] = js.native
    
    def stream(url: GotUrl): GotEmitter & Duplex = js.native
    def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter & Duplex = js.native
    @JSName("stream")
    var stream_Original: GotStreamFn & Recordgetpostputpatchhead = js.native
  }
  
  /* Inlined got.got.GotInstance<got.got.GotFormFn<string>> */
  @js.native
  trait GotInstanceGotFormFnstrin extends StObject {
    
    def apply(url: GotUrl): GotPromise[String | Buffer] = js.native
    def apply(url: GotUrl, options: PartialGotFormOptionsstri): GotPromise[String | Buffer] = js.native
    
    var CancelError: Instantiable0[typings.got.mod.CancelError] = js.native
    
    var HTTPError: Instantiable0[typings.got.mod.HTTPError] = js.native
    
    var MaxRedirectsError: Instantiable0[typings.got.mod.MaxRedirectsError] = js.native
    
    var ParseError: Instantiable0[typings.got.mod.ParseError] = js.native
    
    var ReadError: Instantiable0[typings.got.mod.ReadError] = js.native
    
    var RequestError: Instantiable0[typings.got.mod.RequestError] = js.native
    
    var TimeoutError: Instantiable0[typings.got.mod.TimeoutError] = js.native
    
    var UnsupportedProtocolError: Instantiable0[typings.got.mod.UnsupportedProtocolError] = js.native
    
    def delete(url: GotUrl): GotPromise[String | Buffer] = js.native
    def delete(url: GotUrl, options: Partial[GotFormOptions[String]]): GotPromise[String | Buffer] = js.native
    @JSName("delete")
    var delete_Original: GotFormFn[String] = js.native
    
    def extend(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
    def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
    def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
    @JSName("extend")
    def extend_GotInstanceGotBodyFnstrin(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
    @JSName("extend")
    def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
    @JSName("extend")
    var extend_Original: GotExtend = js.native
    
    def get(url: GotUrl): GotPromise[String | Buffer] = js.native
    def get(url: GotUrl, options: Partial[GotFormOptions[String]]): GotPromise[String | Buffer] = js.native
    @JSName("get")
    var get_Original: GotFormFn[String] = js.native
    
    def head(url: GotUrl): GotPromise[String | Buffer] = js.native
    def head(url: GotUrl, options: Partial[GotFormOptions[String]]): GotPromise[String | Buffer] = js.native
    @JSName("head")
    var head_Original: GotFormFn[String] = js.native
    
    def patch(url: GotUrl): GotPromise[String | Buffer] = js.native
    def patch(url: GotUrl, options: Partial[GotFormOptions[String]]): GotPromise[String | Buffer] = js.native
    @JSName("patch")
    var patch_Original: GotFormFn[String] = js.native
    
    def post(url: GotUrl): GotPromise[String | Buffer] = js.native
    def post(url: GotUrl, options: Partial[GotFormOptions[String]]): GotPromise[String | Buffer] = js.native
    @JSName("post")
    var post_Original: GotFormFn[String] = js.native
    
    def put(url: GotUrl): GotPromise[String | Buffer] = js.native
    def put(url: GotUrl, options: Partial[GotFormOptions[String]]): GotPromise[String | Buffer] = js.native
    @JSName("put")
    var put_Original: GotFormFn[String] = js.native
    
    def stream(url: GotUrl): GotEmitter & Duplex = js.native
    def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter & Duplex = js.native
    @JSName("stream")
    var stream_Original: GotStreamFn & Recordgetpostputpatchhead = js.native
  }
  
  /* Inlined got.got.GotInstance<got.got.GotJSONFn> */
  @js.native
  trait GotInstanceGotJSONFn extends StObject {
    
    def apply(url: GotUrl): GotPromise[js.Any] = js.native
    def apply(url: GotUrl, options: PartialGotJSONOptions): GotPromise[js.Any] = js.native
    
    var CancelError: Instantiable0[typings.got.mod.CancelError] = js.native
    
    var HTTPError: Instantiable0[typings.got.mod.HTTPError] = js.native
    
    var MaxRedirectsError: Instantiable0[typings.got.mod.MaxRedirectsError] = js.native
    
    var ParseError: Instantiable0[typings.got.mod.ParseError] = js.native
    
    var ReadError: Instantiable0[typings.got.mod.ReadError] = js.native
    
    var RequestError: Instantiable0[typings.got.mod.RequestError] = js.native
    
    var TimeoutError: Instantiable0[typings.got.mod.TimeoutError] = js.native
    
    var UnsupportedProtocolError: Instantiable0[typings.got.mod.UnsupportedProtocolError] = js.native
    
    def delete(url: GotUrl): GotPromise[js.Any] = js.native
    def delete(url: GotUrl, options: PartialGotJSONOptions): GotPromise[js.Any] = js.native
    @JSName("delete")
    var delete_Original: GotJSONFn = js.native
    
    def extend(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
    def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
    def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
    @JSName("extend")
    def extend_GotInstanceGotBodyFnstrin(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
    @JSName("extend")
    def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
    @JSName("extend")
    var extend_Original: GotExtend = js.native
    
    def get(url: GotUrl): GotPromise[js.Any] = js.native
    def get(url: GotUrl, options: PartialGotJSONOptions): GotPromise[js.Any] = js.native
    @JSName("get")
    var get_Original: GotJSONFn = js.native
    
    def head(url: GotUrl): GotPromise[js.Any] = js.native
    def head(url: GotUrl, options: PartialGotJSONOptions): GotPromise[js.Any] = js.native
    @JSName("head")
    var head_Original: GotJSONFn = js.native
    
    def patch(url: GotUrl): GotPromise[js.Any] = js.native
    def patch(url: GotUrl, options: PartialGotJSONOptions): GotPromise[js.Any] = js.native
    @JSName("patch")
    var patch_Original: GotJSONFn = js.native
    
    def post(url: GotUrl): GotPromise[js.Any] = js.native
    def post(url: GotUrl, options: PartialGotJSONOptions): GotPromise[js.Any] = js.native
    @JSName("post")
    var post_Original: GotJSONFn = js.native
    
    def put(url: GotUrl): GotPromise[js.Any] = js.native
    def put(url: GotUrl, options: PartialGotJSONOptions): GotPromise[js.Any] = js.native
    @JSName("put")
    var put_Original: GotJSONFn = js.native
    
    def stream(url: GotUrl): GotEmitter & Duplex = js.native
    def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter & Duplex = js.native
    @JSName("stream")
    var stream_Original: GotStreamFn & Recordgetpostputpatchhead = js.native
  }
  
  /* Inlined std.Partial<got.got.GotFormOptions<null>> */
  trait PartialGotFormOptionsnull extends StObject {
    
    var _defaultAgent: js.UndefOr[Agent] = js.undefined
    
    var agent: js.UndefOr[Agent | Boolean | AgentOptions] = js.undefined
    
    var auth: js.UndefOr[String | Null] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var cache: js.UndefOr[Cache] = js.undefined
    
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var clientCertEngine: js.UndefOr[String] = js.undefined
    
    var cookieJar: js.UndefOr[CookieJar] = js.undefined
    
    var createConnection: js.UndefOr[
        js.Function2[
          /* options */ this.type, 
          /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
          Socket
        ]
      ] = js.undefined
    
    var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var decompress: js.UndefOr[Boolean] = js.undefined
    
    var defaultPort: js.UndefOr[Double | String] = js.undefined
    
    var dhparam: js.UndefOr[String | Buffer] = js.undefined
    
    var ecdhCurve: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[Null] = js.undefined
    
    var family: js.UndefOr[Double] = js.undefined
    
    var followRedirect: js.UndefOr[Boolean] = js.undefined
    
    var form: js.UndefOr[`true`] = js.undefined
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.undefined
    
    var hooks: js.UndefOr[Hooks[GotFormOptions[Null], Record[String, js.Any]]] = js.undefined
    
    var host: js.UndefOr[String | Null] = js.undefined
    
    var hostname: js.UndefOr[String | Null] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String | Buffer | (js.Array[Buffer | KeyObject])] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
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
    
    var query: js.UndefOr[(Record[String, js.Any]) | URLSearchParams | String] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var request: js.UndefOr[RequestFunction] = js.undefined
    
    var retry: js.UndefOr[Double | RetryOptions] = js.undefined
    
    var secureOptions: js.UndefOr[Double] = js.undefined
    
    var secureProtocol: js.UndefOr[String] = js.undefined
    
    var servername: js.UndefOr[String] = js.undefined
    
    var sessionIdContext: js.UndefOr[String] = js.undefined
    
    var sessionTimeout: js.UndefOr[Double] = js.undefined
    
    var setHost: js.UndefOr[Boolean] = js.undefined
    
    var sigalgs: js.UndefOr[String] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
    
    var throwHttpErrors: js.UndefOr[Boolean] = js.undefined
    
    var ticketKeys: js.UndefOr[Buffer] = js.undefined
    
    var timeout: js.UndefOr[Double | TimeoutOptions] = js.undefined
    
    var useElectronNet: js.UndefOr[Boolean] = js.undefined
  }
  object PartialGotFormOptionsnull {
    
    inline def apply(): PartialGotFormOptionsnull = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialGotFormOptionsnull]
    }
    
    extension [Self <: PartialGotFormOptionsnull](x: Self) {
      
      inline def setAgent(value: Agent | Boolean | AgentOptions): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBody(value: Record[String, js.Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
      
      inline def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
      
      inline def setCookieJar(value: CookieJar): Self = StObject.set(x, "cookieJar", value.asInstanceOf[js.Any])
      
      inline def setCookieJarUndefined: Self = StObject.set(x, "cookieJar", js.undefined)
      
      inline def setCreateConnection(
        value: (PartialGotFormOptionsnull, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
      
      inline def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
      
      inline def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      inline def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      inline def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value :_*))
      
      inline def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      inline def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
      
      inline def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      inline def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      inline def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
      
      inline def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
      
      inline def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      inline def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      inline def setForm(value: `true`): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      inline def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      inline def setHooks(value: Hooks[GotFormOptions[Null], Record[String, js.Any]]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
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
      
      inline def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value :_*))
      
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
      
      inline def setQuery(value: (Record[String, js.Any]) | URLSearchParams | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setRequest(value: RequestFunction): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setRetry(value: Double | RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
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
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
      
      inline def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
      
      inline def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
      
      inline def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
      
      inline def setTimeout(value: Double | TimeoutOptions): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUseElectronNet(value: Boolean): Self = StObject.set(x, "useElectronNet", value.asInstanceOf[js.Any])
      
      inline def setUseElectronNetUndefined: Self = StObject.set(x, "useElectronNet", js.undefined)
      
      inline def set_defaultAgent(value: Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
      
      inline def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
    }
  }
  
  /* Inlined std.Partial<got.got.GotFormOptions<string>> */
  trait PartialGotFormOptionsstri extends StObject {
    
    var _defaultAgent: js.UndefOr[Agent] = js.undefined
    
    var agent: js.UndefOr[Agent | Boolean | AgentOptions] = js.undefined
    
    var auth: js.UndefOr[String | Null] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var cache: js.UndefOr[Cache] = js.undefined
    
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var clientCertEngine: js.UndefOr[String] = js.undefined
    
    var cookieJar: js.UndefOr[CookieJar] = js.undefined
    
    var createConnection: js.UndefOr[
        js.Function2[
          /* options */ this.type, 
          /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
          Socket
        ]
      ] = js.undefined
    
    var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var decompress: js.UndefOr[Boolean] = js.undefined
    
    var defaultPort: js.UndefOr[Double | String] = js.undefined
    
    var dhparam: js.UndefOr[String | Buffer] = js.undefined
    
    var ecdhCurve: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var family: js.UndefOr[Double] = js.undefined
    
    var followRedirect: js.UndefOr[Boolean] = js.undefined
    
    var form: js.UndefOr[`true`] = js.undefined
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.undefined
    
    var hooks: js.UndefOr[Hooks[GotFormOptions[String], Record[String, js.Any]]] = js.undefined
    
    var host: js.UndefOr[String | Null] = js.undefined
    
    var hostname: js.UndefOr[String | Null] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String | Buffer | (js.Array[Buffer | KeyObject])] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
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
    
    var query: js.UndefOr[(Record[String, js.Any]) | URLSearchParams | String] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var request: js.UndefOr[RequestFunction] = js.undefined
    
    var retry: js.UndefOr[Double | RetryOptions] = js.undefined
    
    var secureOptions: js.UndefOr[Double] = js.undefined
    
    var secureProtocol: js.UndefOr[String] = js.undefined
    
    var servername: js.UndefOr[String] = js.undefined
    
    var sessionIdContext: js.UndefOr[String] = js.undefined
    
    var sessionTimeout: js.UndefOr[Double] = js.undefined
    
    var setHost: js.UndefOr[Boolean] = js.undefined
    
    var sigalgs: js.UndefOr[String] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
    
    var throwHttpErrors: js.UndefOr[Boolean] = js.undefined
    
    var ticketKeys: js.UndefOr[Buffer] = js.undefined
    
    var timeout: js.UndefOr[Double | TimeoutOptions] = js.undefined
    
    var useElectronNet: js.UndefOr[Boolean] = js.undefined
  }
  object PartialGotFormOptionsstri {
    
    inline def apply(): PartialGotFormOptionsstri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialGotFormOptionsstri]
    }
    
    extension [Self <: PartialGotFormOptionsstri](x: Self) {
      
      inline def setAgent(value: Agent | Boolean | AgentOptions): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBody(value: Record[String, js.Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
      
      inline def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
      
      inline def setCookieJar(value: CookieJar): Self = StObject.set(x, "cookieJar", value.asInstanceOf[js.Any])
      
      inline def setCookieJarUndefined: Self = StObject.set(x, "cookieJar", js.undefined)
      
      inline def setCreateConnection(
        value: (PartialGotFormOptionsstri, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
      
      inline def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
      
      inline def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      inline def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      inline def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value :_*))
      
      inline def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      inline def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
      
      inline def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      inline def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      inline def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
      
      inline def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
      
      inline def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      inline def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      inline def setForm(value: `true`): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      inline def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      inline def setHooks(value: Hooks[GotFormOptions[String], Record[String, js.Any]]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
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
      
      inline def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value :_*))
      
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
      
      inline def setQuery(value: (Record[String, js.Any]) | URLSearchParams | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setRequest(value: RequestFunction): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setRetry(value: Double | RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
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
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
      
      inline def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
      
      inline def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
      
      inline def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
      
      inline def setTimeout(value: Double | TimeoutOptions): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUseElectronNet(value: Boolean): Self = StObject.set(x, "useElectronNet", value.asInstanceOf[js.Any])
      
      inline def setUseElectronNetUndefined: Self = StObject.set(x, "useElectronNet", js.undefined)
      
      inline def set_defaultAgent(value: Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
      
      inline def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
    }
  }
  
  /* Inlined std.Partial<got.got.GotJSONOptions> */
  trait PartialGotJSONOptions extends StObject {
    
    var _defaultAgent: js.UndefOr[Agent] = js.undefined
    
    var agent: js.UndefOr[Agent | Boolean | AgentOptions] = js.undefined
    
    var auth: js.UndefOr[String | Null] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[js.Object] = js.undefined
    
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var cache: js.UndefOr[Cache] = js.undefined
    
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var clientCertEngine: js.UndefOr[String] = js.undefined
    
    var cookieJar: js.UndefOr[CookieJar] = js.undefined
    
    var createConnection: js.UndefOr[
        js.Function2[
          /* options */ this.type, 
          /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
          Socket
        ]
      ] = js.undefined
    
    var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var decompress: js.UndefOr[Boolean] = js.undefined
    
    var defaultPort: js.UndefOr[Double | String] = js.undefined
    
    var dhparam: js.UndefOr[String | Buffer] = js.undefined
    
    var ecdhCurve: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var family: js.UndefOr[Double] = js.undefined
    
    var followRedirect: js.UndefOr[Boolean] = js.undefined
    
    var form: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.undefined
    
    var hooks: js.UndefOr[Hooks[GotJSONOptions, js.Object]] = js.undefined
    
    var host: js.UndefOr[String | Null] = js.undefined
    
    var hostname: js.UndefOr[String | Null] = js.undefined
    
    var json: js.UndefOr[`true`] = js.undefined
    
    var key: js.UndefOr[String | Buffer | (js.Array[Buffer | KeyObject])] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
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
    
    var query: js.UndefOr[(Record[String, js.Any]) | URLSearchParams | String] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var request: js.UndefOr[RequestFunction] = js.undefined
    
    var retry: js.UndefOr[Double | RetryOptions] = js.undefined
    
    var secureOptions: js.UndefOr[Double] = js.undefined
    
    var secureProtocol: js.UndefOr[String] = js.undefined
    
    var servername: js.UndefOr[String] = js.undefined
    
    var sessionIdContext: js.UndefOr[String] = js.undefined
    
    var sessionTimeout: js.UndefOr[Double] = js.undefined
    
    var setHost: js.UndefOr[Boolean] = js.undefined
    
    var sigalgs: js.UndefOr[String] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
    
    var throwHttpErrors: js.UndefOr[Boolean] = js.undefined
    
    var ticketKeys: js.UndefOr[Buffer] = js.undefined
    
    var timeout: js.UndefOr[Double | TimeoutOptions] = js.undefined
    
    var useElectronNet: js.UndefOr[Boolean] = js.undefined
  }
  object PartialGotJSONOptions {
    
    inline def apply(): PartialGotJSONOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialGotJSONOptions]
    }
    
    extension [Self <: PartialGotJSONOptions](x: Self) {
      
      inline def setAgent(value: Agent | Boolean | AgentOptions): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
      
      inline def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
      
      inline def setCookieJar(value: CookieJar): Self = StObject.set(x, "cookieJar", value.asInstanceOf[js.Any])
      
      inline def setCookieJarUndefined: Self = StObject.set(x, "cookieJar", js.undefined)
      
      inline def setCreateConnection(
        value: (PartialGotJSONOptions, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
      
      inline def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
      
      inline def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      inline def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      inline def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value :_*))
      
      inline def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      inline def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
      
      inline def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      inline def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      inline def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
      
      inline def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
      
      inline def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      inline def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      inline def setForm(value: Boolean): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      inline def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      inline def setHooks(value: Hooks[GotJSONOptions, js.Object]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
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
      
      inline def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value :_*))
      
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
      
      inline def setQuery(value: (Record[String, js.Any]) | URLSearchParams | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setRequest(value: RequestFunction): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setRetry(value: Double | RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
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
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
      
      inline def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
      
      inline def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
      
      inline def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
      
      inline def setTimeout(value: Double | TimeoutOptions): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUseElectronNet(value: Boolean): Self = StObject.set(x, "useElectronNet", value.asInstanceOf[js.Any])
      
      inline def setUseElectronNetUndefined: Self = StObject.set(x, "useElectronNet", js.undefined)
      
      inline def set_defaultAgent(value: Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
      
      inline def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
    }
  }
  
  /* Inlined std.Record<'get' | 'post' | 'put' | 'patch' | 'head' | 'delete', got.got.GotStreamFn> */
  trait Recordgetpostputpatchhead extends StObject {
    
    def delete(url: GotUrl): GotEmitter & Duplex
    def delete(url: GotUrl, options: GotOptions[String | Null]): GotEmitter & Duplex
    @JSName("delete")
    var delete_Original: GotStreamFn
    
    def get(url: GotUrl): GotEmitter & Duplex
    def get(url: GotUrl, options: GotOptions[String | Null]): GotEmitter & Duplex
    @JSName("get")
    var get_Original: GotStreamFn
    
    def head(url: GotUrl): GotEmitter & Duplex
    def head(url: GotUrl, options: GotOptions[String | Null]): GotEmitter & Duplex
    @JSName("head")
    var head_Original: GotStreamFn
    
    def patch(url: GotUrl): GotEmitter & Duplex
    def patch(url: GotUrl, options: GotOptions[String | Null]): GotEmitter & Duplex
    @JSName("patch")
    var patch_Original: GotStreamFn
    
    def post(url: GotUrl): GotEmitter & Duplex
    def post(url: GotUrl, options: GotOptions[String | Null]): GotEmitter & Duplex
    @JSName("post")
    var post_Original: GotStreamFn
    
    def put(url: GotUrl): GotEmitter & Duplex
    def put(url: GotUrl, options: GotOptions[String | Null]): GotEmitter & Duplex
    @JSName("put")
    var put_Original: GotStreamFn
  }
  object Recordgetpostputpatchhead {
    
    inline def apply(
      delete: (/* url */ GotUrl, /* options */ js.UndefOr[GotOptions[String | Null]]) => GotEmitter & Duplex,
      get: (/* url */ GotUrl, /* options */ js.UndefOr[GotOptions[String | Null]]) => GotEmitter & Duplex,
      head: (/* url */ GotUrl, /* options */ js.UndefOr[GotOptions[String | Null]]) => GotEmitter & Duplex,
      patch: (/* url */ GotUrl, /* options */ js.UndefOr[GotOptions[String | Null]]) => GotEmitter & Duplex,
      post: (/* url */ GotUrl, /* options */ js.UndefOr[GotOptions[String | Null]]) => GotEmitter & Duplex,
      put: (/* url */ GotUrl, /* options */ js.UndefOr[GotOptions[String | Null]]) => GotEmitter & Duplex
    ): Recordgetpostputpatchhead = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction2(delete), get = js.Any.fromFunction2(get), head = js.Any.fromFunction2(head), patch = js.Any.fromFunction2(patch), post = js.Any.fromFunction2(post), put = js.Any.fromFunction2(put))
      __obj.asInstanceOf[Recordgetpostputpatchhead]
    }
    
    extension [Self <: Recordgetpostputpatchhead](x: Self) {
      
      inline def setDelete(
        value: (/* url */ GotUrl, /* options */ js.UndefOr[GotOptions[String | Null]]) => GotEmitter & Duplex
      ): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
      
      inline def setGet(
        value: (/* url */ GotUrl, /* options */ js.UndefOr[GotOptions[String | Null]]) => GotEmitter & Duplex
      ): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setHead(
        value: (/* url */ GotUrl, /* options */ js.UndefOr[GotOptions[String | Null]]) => GotEmitter & Duplex
      ): Self = StObject.set(x, "head", js.Any.fromFunction2(value))
      
      inline def setPatch(
        value: (/* url */ GotUrl, /* options */ js.UndefOr[GotOptions[String | Null]]) => GotEmitter & Duplex
      ): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
      
      inline def setPost(
        value: (/* url */ GotUrl, /* options */ js.UndefOr[GotOptions[String | Null]]) => GotEmitter & Duplex
      ): Self = StObject.set(x, "post", js.Any.fromFunction2(value))
      
      inline def setPut(
        value: (/* url */ GotUrl, /* options */ js.UndefOr[GotOptions[String | Null]]) => GotEmitter & Duplex
      ): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
    }
  }
}

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
import typings.got.mod.Hooks
import typings.got.mod.RequestFunction
import typings.got.mod.RetryOptions
import typings.got.mod.TimeoutOptions
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequestArgs
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CancelError extends StObject {
    
    var CancelError: Instantiable0[typings.got.mod.CancelError] = js.native
    
    var HTTPError: Instantiable0[typings.got.mod.HTTPError] = js.native
    
    var MaxRedirectsError: Instantiable0[typings.got.mod.MaxRedirectsError] = js.native
    
    var ParseError: Instantiable0[typings.got.mod.ParseError] = js.native
    
    var ReadError: Instantiable0[typings.got.mod.ReadError] = js.native
    
    var RequestError: Instantiable0[typings.got.mod.RequestError] = js.native
    
    var TimeoutError: Instantiable0[typings.got.mod.TimeoutError] = js.native
    
    var UnsupportedProtocolError: Instantiable0[typings.got.mod.UnsupportedProtocolError] = js.native
    
    def extend(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
    def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
    def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
    @JSName("extend")
    def extend_GotInstanceGotBodyFnstrin(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
    @JSName("extend")
    def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
    @JSName("extend")
    var extend_Original: GotExtend = js.native
    
    def stream(url: GotUrl): GotEmitter with Duplex = js.native
    def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
    @JSName("stream")
    var stream_Original: GotStreamFn with Recordgetpostputpatchhead = js.native
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
    
    def stream(url: GotUrl): GotEmitter with Duplex = js.native
    def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
    @JSName("stream")
    var stream_Original: GotStreamFn with Recordgetpostputpatchhead = js.native
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
    
    def stream(url: GotUrl): GotEmitter with Duplex = js.native
    def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
    @JSName("stream")
    var stream_Original: GotStreamFn with Recordgetpostputpatchhead = js.native
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
    
    def stream(url: GotUrl): GotEmitter with Duplex = js.native
    def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
    @JSName("stream")
    var stream_Original: GotStreamFn with Recordgetpostputpatchhead = js.native
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
    
    def stream(url: GotUrl): GotEmitter with Duplex = js.native
    def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
    @JSName("stream")
    var stream_Original: GotStreamFn with Recordgetpostputpatchhead = js.native
  }
  
  /* Inlined got.got.GotInstance<got.got.GotJSONFn> */
  @js.native
  trait GotInstanceGotJSONFn extends StObject {
    
    def apply(url: GotUrl): GotPromise[_] = js.native
    def apply(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
    
    var CancelError: Instantiable0[typings.got.mod.CancelError] = js.native
    
    var HTTPError: Instantiable0[typings.got.mod.HTTPError] = js.native
    
    var MaxRedirectsError: Instantiable0[typings.got.mod.MaxRedirectsError] = js.native
    
    var ParseError: Instantiable0[typings.got.mod.ParseError] = js.native
    
    var ReadError: Instantiable0[typings.got.mod.ReadError] = js.native
    
    var RequestError: Instantiable0[typings.got.mod.RequestError] = js.native
    
    var TimeoutError: Instantiable0[typings.got.mod.TimeoutError] = js.native
    
    var UnsupportedProtocolError: Instantiable0[typings.got.mod.UnsupportedProtocolError] = js.native
    
    def delete(url: GotUrl): GotPromise[_] = js.native
    def delete(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
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
    
    def get(url: GotUrl): GotPromise[_] = js.native
    def get(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
    @JSName("get")
    var get_Original: GotJSONFn = js.native
    
    def head(url: GotUrl): GotPromise[_] = js.native
    def head(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
    @JSName("head")
    var head_Original: GotJSONFn = js.native
    
    def patch(url: GotUrl): GotPromise[_] = js.native
    def patch(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
    @JSName("patch")
    var patch_Original: GotJSONFn = js.native
    
    def post(url: GotUrl): GotPromise[_] = js.native
    def post(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
    @JSName("post")
    var post_Original: GotJSONFn = js.native
    
    def put(url: GotUrl): GotPromise[_] = js.native
    def put(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
    @JSName("put")
    var put_Original: GotJSONFn = js.native
    
    def stream(url: GotUrl): GotEmitter with Duplex = js.native
    def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
    @JSName("stream")
    var stream_Original: GotStreamFn with Recordgetpostputpatchhead = js.native
  }
  
  /* Inlined std.Partial<got.got.GotFormOptions<null>> */
  @js.native
  trait PartialGotFormOptionsnull extends StObject {
    
    var _defaultAgent: js.UndefOr[Agent] = js.native
    
    var agent: js.UndefOr[Agent | Boolean | AgentOptions] = js.native
    
    var auth: js.UndefOr[String | Null] = js.native
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var body: js.UndefOr[Record[String, _]] = js.native
    
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    var cache: js.UndefOr[Cache] = js.native
    
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    var ciphers: js.UndefOr[String] = js.native
    
    var clientCertEngine: js.UndefOr[String] = js.native
    
    var cookieJar: js.UndefOr[CookieJar] = js.native
    
    var createConnection: js.UndefOr[
        js.Function2[
          /* options */ ClientRequestArgs, 
          /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
          Socket
        ]
      ] = js.native
    
    var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    var decompress: js.UndefOr[Boolean] = js.native
    
    var defaultPort: js.UndefOr[Double | String] = js.native
    
    var dhparam: js.UndefOr[String | Buffer] = js.native
    
    var ecdhCurve: js.UndefOr[String] = js.native
    
    var encoding: js.UndefOr[Null] = js.native
    
    var family: js.UndefOr[Double] = js.native
    
    var followRedirect: js.UndefOr[Boolean] = js.native
    
    var form: js.UndefOr[`true`] = js.native
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.native
    
    var hooks: js.UndefOr[Hooks[GotFormOptions[Null], Record[String, _]]] = js.native
    
    var host: js.UndefOr[String | Null] = js.native
    
    var hostname: js.UndefOr[String | Null] = js.native
    
    var json: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String | Buffer | (js.Array[Buffer | KeyObject])] = js.native
    
    var localAddress: js.UndefOr[String] = js.native
    
    var maxHeaderSize: js.UndefOr[Double] = js.native
    
    var maxVersion: js.UndefOr[SecureVersion] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var minVersion: js.UndefOr[SecureVersion] = js.native
    
    var passphrase: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String | Null] = js.native
    
    var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.native
    
    var port: js.UndefOr[Double | String | Null] = js.native
    
    var privateKeyEngine: js.UndefOr[String] = js.native
    
    var privateKeyIdentifier: js.UndefOr[String] = js.native
    
    var protocol: js.UndefOr[String | Null] = js.native
    
    var query: js.UndefOr[(Record[String, _]) | URLSearchParams | String] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    var request: js.UndefOr[RequestFunction] = js.native
    
    var retry: js.UndefOr[Double | RetryOptions] = js.native
    
    var secureOptions: js.UndefOr[Double] = js.native
    
    var secureProtocol: js.UndefOr[String] = js.native
    
    var servername: js.UndefOr[String] = js.native
    
    var sessionIdContext: js.UndefOr[String] = js.native
    
    var sessionTimeout: js.UndefOr[Double] = js.native
    
    var setHost: js.UndefOr[Boolean] = js.native
    
    var sigalgs: js.UndefOr[String] = js.native
    
    var socketPath: js.UndefOr[String] = js.native
    
    var throwHttpErrors: js.UndefOr[Boolean] = js.native
    
    var ticketKeys: js.UndefOr[Buffer] = js.native
    
    var timeout: js.UndefOr[Double | TimeoutOptions] = js.native
    
    var useElectronNet: js.UndefOr[Boolean] = js.native
  }
  object PartialGotFormOptionsnull {
    
    @scala.inline
    def apply(): PartialGotFormOptionsnull = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialGotFormOptionsnull]
    }
    
    @scala.inline
    implicit class PartialGotFormOptionsnullMutableBuilder[Self <: PartialGotFormOptionsnull] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | Boolean | AgentOptions): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setBody(value: Record[String, _]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
      
      @scala.inline
      def setCookieJar(value: CookieJar): Self = StObject.set(x, "cookieJar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieJarUndefined: Self = StObject.set(x, "cookieJar", js.undefined)
      
      @scala.inline
      def setCreateConnection(
        value: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
      
      @scala.inline
      def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      @scala.inline
      def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value :_*))
      
      @scala.inline
      def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
      
      @scala.inline
      def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      @scala.inline
      def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
      
      @scala.inline
      def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      @scala.inline
      def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      @scala.inline
      def setForm(value: `true`): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      @scala.inline
      def setHooks(value: Hooks[GotFormOptions[Null], Record[String, _]]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKeyVarargs(value: (Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      @scala.inline
      def setMaxVersion(value: SecureVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMinVersion(value: SecureVersion): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value :_*))
      
      @scala.inline
      def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrivateKeyEngine(value: String): Self = StObject.set(x, "privateKeyEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyEngineUndefined: Self = StObject.set(x, "privateKeyEngine", js.undefined)
      
      @scala.inline
      def setPrivateKeyIdentifier(value: String): Self = StObject.set(x, "privateKeyIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyIdentifierUndefined: Self = StObject.set(x, "privateKeyIdentifier", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setQuery(value: (Record[String, _]) | URLSearchParams | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setRequest(value: RequestFunction): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setRetry(value: Double | RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
      
      @scala.inline
      def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      @scala.inline
      def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      @scala.inline
      def setSessionIdContext(value: String): Self = StObject.set(x, "sessionIdContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIdContextUndefined: Self = StObject.set(x, "sessionIdContext", js.undefined)
      
      @scala.inline
      def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      @scala.inline
      def setSetHost(value: Boolean): Self = StObject.set(x, "setHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetHostUndefined: Self = StObject.set(x, "setHost", js.undefined)
      
      @scala.inline
      def setSigalgs(value: String): Self = StObject.set(x, "sigalgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigalgsUndefined: Self = StObject.set(x, "sigalgs", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
      
      @scala.inline
      def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double | TimeoutOptions): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUseElectronNet(value: Boolean): Self = StObject.set(x, "useElectronNet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseElectronNetUndefined: Self = StObject.set(x, "useElectronNet", js.undefined)
      
      @scala.inline
      def set_defaultAgent(value: Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
    }
  }
  
  /* Inlined std.Partial<got.got.GotFormOptions<string>> */
  @js.native
  trait PartialGotFormOptionsstri extends StObject {
    
    var _defaultAgent: js.UndefOr[Agent] = js.native
    
    var agent: js.UndefOr[Agent | Boolean | AgentOptions] = js.native
    
    var auth: js.UndefOr[String | Null] = js.native
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var body: js.UndefOr[Record[String, _]] = js.native
    
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    var cache: js.UndefOr[Cache] = js.native
    
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    var ciphers: js.UndefOr[String] = js.native
    
    var clientCertEngine: js.UndefOr[String] = js.native
    
    var cookieJar: js.UndefOr[CookieJar] = js.native
    
    var createConnection: js.UndefOr[
        js.Function2[
          /* options */ ClientRequestArgs, 
          /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
          Socket
        ]
      ] = js.native
    
    var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    var decompress: js.UndefOr[Boolean] = js.native
    
    var defaultPort: js.UndefOr[Double | String] = js.native
    
    var dhparam: js.UndefOr[String | Buffer] = js.native
    
    var ecdhCurve: js.UndefOr[String] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var family: js.UndefOr[Double] = js.native
    
    var followRedirect: js.UndefOr[Boolean] = js.native
    
    var form: js.UndefOr[`true`] = js.native
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.native
    
    var hooks: js.UndefOr[Hooks[GotFormOptions[String], Record[String, _]]] = js.native
    
    var host: js.UndefOr[String | Null] = js.native
    
    var hostname: js.UndefOr[String | Null] = js.native
    
    var json: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String | Buffer | (js.Array[Buffer | KeyObject])] = js.native
    
    var localAddress: js.UndefOr[String] = js.native
    
    var maxHeaderSize: js.UndefOr[Double] = js.native
    
    var maxVersion: js.UndefOr[SecureVersion] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var minVersion: js.UndefOr[SecureVersion] = js.native
    
    var passphrase: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String | Null] = js.native
    
    var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.native
    
    var port: js.UndefOr[Double | String | Null] = js.native
    
    var privateKeyEngine: js.UndefOr[String] = js.native
    
    var privateKeyIdentifier: js.UndefOr[String] = js.native
    
    var protocol: js.UndefOr[String | Null] = js.native
    
    var query: js.UndefOr[(Record[String, _]) | URLSearchParams | String] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    var request: js.UndefOr[RequestFunction] = js.native
    
    var retry: js.UndefOr[Double | RetryOptions] = js.native
    
    var secureOptions: js.UndefOr[Double] = js.native
    
    var secureProtocol: js.UndefOr[String] = js.native
    
    var servername: js.UndefOr[String] = js.native
    
    var sessionIdContext: js.UndefOr[String] = js.native
    
    var sessionTimeout: js.UndefOr[Double] = js.native
    
    var setHost: js.UndefOr[Boolean] = js.native
    
    var sigalgs: js.UndefOr[String] = js.native
    
    var socketPath: js.UndefOr[String] = js.native
    
    var throwHttpErrors: js.UndefOr[Boolean] = js.native
    
    var ticketKeys: js.UndefOr[Buffer] = js.native
    
    var timeout: js.UndefOr[Double | TimeoutOptions] = js.native
    
    var useElectronNet: js.UndefOr[Boolean] = js.native
  }
  object PartialGotFormOptionsstri {
    
    @scala.inline
    def apply(): PartialGotFormOptionsstri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialGotFormOptionsstri]
    }
    
    @scala.inline
    implicit class PartialGotFormOptionsstriMutableBuilder[Self <: PartialGotFormOptionsstri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | Boolean | AgentOptions): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setBody(value: Record[String, _]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
      
      @scala.inline
      def setCookieJar(value: CookieJar): Self = StObject.set(x, "cookieJar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieJarUndefined: Self = StObject.set(x, "cookieJar", js.undefined)
      
      @scala.inline
      def setCreateConnection(
        value: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
      
      @scala.inline
      def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      @scala.inline
      def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value :_*))
      
      @scala.inline
      def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
      
      @scala.inline
      def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      @scala.inline
      def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
      
      @scala.inline
      def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      @scala.inline
      def setForm(value: `true`): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      @scala.inline
      def setHooks(value: Hooks[GotFormOptions[String], Record[String, _]]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKeyVarargs(value: (Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      @scala.inline
      def setMaxVersion(value: SecureVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMinVersion(value: SecureVersion): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value :_*))
      
      @scala.inline
      def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrivateKeyEngine(value: String): Self = StObject.set(x, "privateKeyEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyEngineUndefined: Self = StObject.set(x, "privateKeyEngine", js.undefined)
      
      @scala.inline
      def setPrivateKeyIdentifier(value: String): Self = StObject.set(x, "privateKeyIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyIdentifierUndefined: Self = StObject.set(x, "privateKeyIdentifier", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setQuery(value: (Record[String, _]) | URLSearchParams | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setRequest(value: RequestFunction): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setRetry(value: Double | RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
      
      @scala.inline
      def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      @scala.inline
      def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      @scala.inline
      def setSessionIdContext(value: String): Self = StObject.set(x, "sessionIdContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIdContextUndefined: Self = StObject.set(x, "sessionIdContext", js.undefined)
      
      @scala.inline
      def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      @scala.inline
      def setSetHost(value: Boolean): Self = StObject.set(x, "setHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetHostUndefined: Self = StObject.set(x, "setHost", js.undefined)
      
      @scala.inline
      def setSigalgs(value: String): Self = StObject.set(x, "sigalgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigalgsUndefined: Self = StObject.set(x, "sigalgs", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
      
      @scala.inline
      def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double | TimeoutOptions): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUseElectronNet(value: Boolean): Self = StObject.set(x, "useElectronNet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseElectronNetUndefined: Self = StObject.set(x, "useElectronNet", js.undefined)
      
      @scala.inline
      def set_defaultAgent(value: Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
    }
  }
  
  /* Inlined std.Partial<got.got.GotJSONOptions> */
  @js.native
  trait PartialGotJSONOptions extends StObject {
    
    var _defaultAgent: js.UndefOr[Agent] = js.native
    
    var agent: js.UndefOr[Agent | Boolean | AgentOptions] = js.native
    
    var auth: js.UndefOr[String | Null] = js.native
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var body: js.UndefOr[js.Object] = js.native
    
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    var cache: js.UndefOr[Cache] = js.native
    
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    var ciphers: js.UndefOr[String] = js.native
    
    var clientCertEngine: js.UndefOr[String] = js.native
    
    var cookieJar: js.UndefOr[CookieJar] = js.native
    
    var createConnection: js.UndefOr[
        js.Function2[
          /* options */ ClientRequestArgs, 
          /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
          Socket
        ]
      ] = js.native
    
    var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    var decompress: js.UndefOr[Boolean] = js.native
    
    var defaultPort: js.UndefOr[Double | String] = js.native
    
    var dhparam: js.UndefOr[String | Buffer] = js.native
    
    var ecdhCurve: js.UndefOr[String] = js.native
    
    var encoding: js.UndefOr[String | Null] = js.native
    
    var family: js.UndefOr[Double] = js.native
    
    var followRedirect: js.UndefOr[Boolean] = js.native
    
    var form: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.native
    
    var hooks: js.UndefOr[Hooks[GotJSONOptions, js.Object]] = js.native
    
    var host: js.UndefOr[String | Null] = js.native
    
    var hostname: js.UndefOr[String | Null] = js.native
    
    var json: js.UndefOr[`true`] = js.native
    
    var key: js.UndefOr[String | Buffer | (js.Array[Buffer | KeyObject])] = js.native
    
    var localAddress: js.UndefOr[String] = js.native
    
    var maxHeaderSize: js.UndefOr[Double] = js.native
    
    var maxVersion: js.UndefOr[SecureVersion] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var minVersion: js.UndefOr[SecureVersion] = js.native
    
    var passphrase: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String | Null] = js.native
    
    var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.native
    
    var port: js.UndefOr[Double | String | Null] = js.native
    
    var privateKeyEngine: js.UndefOr[String] = js.native
    
    var privateKeyIdentifier: js.UndefOr[String] = js.native
    
    var protocol: js.UndefOr[String | Null] = js.native
    
    var query: js.UndefOr[(Record[String, _]) | URLSearchParams | String] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    var request: js.UndefOr[RequestFunction] = js.native
    
    var retry: js.UndefOr[Double | RetryOptions] = js.native
    
    var secureOptions: js.UndefOr[Double] = js.native
    
    var secureProtocol: js.UndefOr[String] = js.native
    
    var servername: js.UndefOr[String] = js.native
    
    var sessionIdContext: js.UndefOr[String] = js.native
    
    var sessionTimeout: js.UndefOr[Double] = js.native
    
    var setHost: js.UndefOr[Boolean] = js.native
    
    var sigalgs: js.UndefOr[String] = js.native
    
    var socketPath: js.UndefOr[String] = js.native
    
    var throwHttpErrors: js.UndefOr[Boolean] = js.native
    
    var ticketKeys: js.UndefOr[Buffer] = js.native
    
    var timeout: js.UndefOr[Double | TimeoutOptions] = js.native
    
    var useElectronNet: js.UndefOr[Boolean] = js.native
  }
  object PartialGotJSONOptions {
    
    @scala.inline
    def apply(): PartialGotJSONOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialGotJSONOptions]
    }
    
    @scala.inline
    implicit class PartialGotJSONOptionsMutableBuilder[Self <: PartialGotJSONOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | Boolean | AgentOptions): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
      
      @scala.inline
      def setCookieJar(value: CookieJar): Self = StObject.set(x, "cookieJar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieJarUndefined: Self = StObject.set(x, "cookieJar", js.undefined)
      
      @scala.inline
      def setCreateConnection(
        value: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
      
      @scala.inline
      def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      @scala.inline
      def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value :_*))
      
      @scala.inline
      def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
      
      @scala.inline
      def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      @scala.inline
      def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
      
      @scala.inline
      def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      @scala.inline
      def setForm(value: Boolean): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      @scala.inline
      def setHooks(value: Hooks[GotJSONOptions, js.Object]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKeyVarargs(value: (Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      @scala.inline
      def setMaxVersion(value: SecureVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMinVersion(value: SecureVersion): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value :_*))
      
      @scala.inline
      def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrivateKeyEngine(value: String): Self = StObject.set(x, "privateKeyEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyEngineUndefined: Self = StObject.set(x, "privateKeyEngine", js.undefined)
      
      @scala.inline
      def setPrivateKeyIdentifier(value: String): Self = StObject.set(x, "privateKeyIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyIdentifierUndefined: Self = StObject.set(x, "privateKeyIdentifier", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setQuery(value: (Record[String, _]) | URLSearchParams | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setRequest(value: RequestFunction): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setRetry(value: Double | RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
      
      @scala.inline
      def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      @scala.inline
      def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      @scala.inline
      def setSessionIdContext(value: String): Self = StObject.set(x, "sessionIdContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIdContextUndefined: Self = StObject.set(x, "sessionIdContext", js.undefined)
      
      @scala.inline
      def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      @scala.inline
      def setSetHost(value: Boolean): Self = StObject.set(x, "setHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetHostUndefined: Self = StObject.set(x, "setHost", js.undefined)
      
      @scala.inline
      def setSigalgs(value: String): Self = StObject.set(x, "sigalgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigalgsUndefined: Self = StObject.set(x, "sigalgs", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
      
      @scala.inline
      def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double | TimeoutOptions): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUseElectronNet(value: Boolean): Self = StObject.set(x, "useElectronNet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseElectronNetUndefined: Self = StObject.set(x, "useElectronNet", js.undefined)
      
      @scala.inline
      def set_defaultAgent(value: Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
    }
  }
  
  /* Inlined std.Record<'get' | 'post' | 'put' | 'patch' | 'head' | 'delete', got.got.GotStreamFn> */
  @js.native
  trait Recordgetpostputpatchhead extends StObject {
    
    def delete(url: GotUrl): GotEmitter with Duplex = js.native
    def delete(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
    @JSName("delete")
    var delete_Original: GotStreamFn = js.native
    
    def get(url: GotUrl): GotEmitter with Duplex = js.native
    def get(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
    @JSName("get")
    var get_Original: GotStreamFn = js.native
    
    def head(url: GotUrl): GotEmitter with Duplex = js.native
    def head(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
    @JSName("head")
    var head_Original: GotStreamFn = js.native
    
    def patch(url: GotUrl): GotEmitter with Duplex = js.native
    def patch(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
    @JSName("patch")
    var patch_Original: GotStreamFn = js.native
    
    def post(url: GotUrl): GotEmitter with Duplex = js.native
    def post(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
    @JSName("post")
    var post_Original: GotStreamFn = js.native
    
    def put(url: GotUrl): GotEmitter with Duplex = js.native
    def put(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
    @JSName("put")
    var put_Original: GotStreamFn = js.native
  }
}

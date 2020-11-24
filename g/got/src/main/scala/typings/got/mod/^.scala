package typings.got.mod

import org.scalablytyped.runtime.Instantiable0
import typings.got.anon.GotInstanceGotBodyFnnull
import typings.got.anon.GotInstanceGotBodyFnstrin
import typings.got.anon.GotInstanceGotFormFnnull
import typings.got.anon.GotInstanceGotFormFnstrin
import typings.got.anon.GotInstanceGotJSONFn
import typings.got.anon.Recordgetpostputpatchhead
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("got", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(url: GotUrl): GotPromise[String] = js.native
  def apply(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
  def apply(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
  def apply(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
  
  var CancelError: Instantiable0[typings.got.mod.CancelError] = js.native
  
  var HTTPError: Instantiable0[typings.got.mod.HTTPError] = js.native
  
  var MaxRedirectsError: Instantiable0[typings.got.mod.MaxRedirectsError] = js.native
  
  var ParseError: Instantiable0[typings.got.mod.ParseError] = js.native
  
  var ReadError: Instantiable0[typings.got.mod.ReadError] = js.native
  
  var RequestError: Instantiable0[typings.got.mod.RequestError] = js.native
  
  var TimeoutError: Instantiable0[typings.got.mod.TimeoutError] = js.native
  
  var UnsupportedProtocolError: Instantiable0[typings.got.mod.UnsupportedProtocolError] = js.native
  
  def delete(url: GotUrl): GotPromise[String] = js.native
  def delete(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
  def delete(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
  def delete(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
  @JSName("delete")
  var delete_Original: GotFn = js.native
  
  def extend(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
  def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
  def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
  @JSName("extend")
  def extend_GotInstanceGotBodyFnstrin(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
  @JSName("extend")
  def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
  @JSName("extend")
  var extend_Original: GotExtend = js.native
  
  def get(url: GotUrl): GotPromise[String] = js.native
  def get(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
  def get(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
  def get(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
  @JSName("get")
  var get_Original: GotFn = js.native
  
  def head(url: GotUrl): GotPromise[String] = js.native
  def head(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
  def head(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
  def head(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
  @JSName("head")
  var head_Original: GotFn = js.native
  
  def patch(url: GotUrl): GotPromise[String] = js.native
  def patch(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
  def patch(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
  def patch(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
  @JSName("patch")
  var patch_Original: GotFn = js.native
  
  def post(url: GotUrl): GotPromise[String] = js.native
  def post(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
  def post(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
  def post(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
  @JSName("post")
  var post_Original: GotFn = js.native
  
  def put(url: GotUrl): GotPromise[String] = js.native
  def put(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
  def put(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
  def put(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
  @JSName("put")
  var put_Original: GotFn = js.native
  
  def stream(url: GotUrl): GotEmitter with Duplex = js.native
  def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
  @JSName("stream")
  var stream_Original: GotStreamFn with Recordgetpostputpatchhead = js.native
}

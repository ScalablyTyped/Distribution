package typings.got.anon

import org.scalablytyped.runtime.Instantiable0
import typings.got.mod.GotBodyOptions
import typings.got.mod.GotEmitter
import typings.got.mod.GotExtend
import typings.got.mod.GotFormOptions
import typings.got.mod.GotJSONFn
import typings.got.mod.GotJSONOptions
import typings.got.mod.GotOptions
import typings.got.mod.GotPromise
import typings.got.mod.GotStreamFn
import typings.got.mod.GotUrl
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined got.got.GotInstance<got.got.GotJSONFn> */
@js.native
trait GotInstanceGotJSONFn extends js.Object {
  var CancelError: Instantiable0[typings.got.mod.CancelError] = js.native
  var HTTPError: Instantiable0[typings.got.mod.HTTPError] = js.native
  var MaxRedirectsError: Instantiable0[typings.got.mod.MaxRedirectsError] = js.native
  var ParseError: Instantiable0[typings.got.mod.ParseError] = js.native
  var ReadError: Instantiable0[typings.got.mod.ReadError] = js.native
  var RequestError: Instantiable0[typings.got.mod.RequestError] = js.native
  var TimeoutError: Instantiable0[typings.got.mod.TimeoutError] = js.native
  var UnsupportedProtocolError: Instantiable0[typings.got.mod.UnsupportedProtocolError] = js.native
  @JSName("delete")
  var delete_Original: GotJSONFn = js.native
  @JSName("extend")
  var extend_Original: GotExtend = js.native
  @JSName("get")
  var get_Original: GotJSONFn = js.native
  @JSName("head")
  var head_Original: GotJSONFn = js.native
  @JSName("patch")
  var patch_Original: GotJSONFn = js.native
  @JSName("post")
  var post_Original: GotJSONFn = js.native
  @JSName("put")
  var put_Original: GotJSONFn = js.native
  @JSName("stream")
  var stream_Original: GotStreamFn with Recordgetpostputpatchhead = js.native
  def apply(url: GotUrl): GotPromise[_] = js.native
  def apply(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
  def delete(url: GotUrl): GotPromise[_] = js.native
  def delete(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
  def extend(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
  def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
  def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
  @JSName("extend")
  def extend_GotInstanceGotBodyFnstrin(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
  @JSName("extend")
  def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
  def get(url: GotUrl): GotPromise[_] = js.native
  def get(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
  def head(url: GotUrl): GotPromise[_] = js.native
  def head(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
  def patch(url: GotUrl): GotPromise[_] = js.native
  def patch(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
  def post(url: GotUrl): GotPromise[_] = js.native
  def post(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
  def put(url: GotUrl): GotPromise[_] = js.native
  def put(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
  def stream(url: GotUrl): GotEmitter with Duplex = js.native
  def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
}


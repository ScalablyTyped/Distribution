package typings.got

import typings.got.mod.GotEmitter
import typings.got.mod.GotOptions
import typings.got.mod.GotStreamFn
import typings.got.mod.GotUrl
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'get' | 'post' | 'put' | 'patch' | 'head' | 'delete', got.got.GotStreamFn> */
@js.native
trait Recordgetpostputpatchhead extends js.Object {
  @JSName("delete")
  var delete_Original: GotStreamFn = js.native
  @JSName("get")
  var get_Original: GotStreamFn = js.native
  @JSName("head")
  var head_Original: GotStreamFn = js.native
  @JSName("patch")
  var patch_Original: GotStreamFn = js.native
  @JSName("post")
  var post_Original: GotStreamFn = js.native
  @JSName("put")
  var put_Original: GotStreamFn = js.native
  def delete(url: GotUrl): GotEmitter with Duplex = js.native
  def delete(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
  def get(url: GotUrl): GotEmitter with Duplex = js.native
  def get(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
  def head(url: GotUrl): GotEmitter with Duplex = js.native
  def head(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
  def patch(url: GotUrl): GotEmitter with Duplex = js.native
  def patch(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
  def post(url: GotUrl): GotEmitter with Duplex = js.native
  def post(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
  def put(url: GotUrl): GotEmitter with Duplex = js.native
  def put(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
}


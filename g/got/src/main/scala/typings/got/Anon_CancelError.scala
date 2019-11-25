package typings.got

import org.scalablytyped.runtime.Instantiable0
import typings.got.gotMod.GotBodyFn
import typings.got.gotMod.GotBodyOptions
import typings.got.gotMod.GotEmitter
import typings.got.gotMod.GotExtend
import typings.got.gotMod.GotFormFn
import typings.got.gotMod.GotFormOptions
import typings.got.gotMod.GotInstance
import typings.got.gotMod.GotJSONFn
import typings.got.gotMod.GotJSONOptions
import typings.got.gotMod.GotOptions
import typings.got.gotMod.GotStreamFn
import typings.got.gotMod.GotUrl
import typings.got.gotStrings.delete_
import typings.got.gotStrings.get_
import typings.got.gotStrings.head_
import typings.got.gotStrings.patch
import typings.got.gotStrings.post_
import typings.got.gotStrings.put_
import typings.node.streamMod.Duplex
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CancelError extends js.Object {
  var CancelError: Instantiable0[typings.got.gotMod.CancelError] = js.native
  var HTTPError: Instantiable0[typings.got.gotMod.HTTPError] = js.native
  var MaxRedirectsError: Instantiable0[typings.got.gotMod.MaxRedirectsError] = js.native
  var ParseError: Instantiable0[typings.got.gotMod.ParseError] = js.native
  var ReadError: Instantiable0[typings.got.gotMod.ReadError] = js.native
  var RequestError: Instantiable0[typings.got.gotMod.RequestError] = js.native
  var TimeoutError: Instantiable0[typings.got.gotMod.TimeoutError] = js.native
  var UnsupportedProtocolError: Instantiable0[typings.got.gotMod.UnsupportedProtocolError] = js.native
  @JSName("extend")
  var extend_Original: GotExtend = js.native
  @JSName("stream")
  var stream_Original: GotStreamFn with (Record[get_ | post_ | put_ | patch | head_ | delete_, GotStreamFn]) = js.native
  def extend(options: GotBodyOptions[Null | String]): GotInstance[GotBodyFn[String]] = js.native
  def extend(options: GotFormOptions[Null | String]): GotInstance[GotFormFn[String]] = js.native
  def extend(options: GotJSONOptions): GotInstance[GotJSONFn] = js.native
  def stream(url: GotUrl): GotEmitter with Duplex = js.native
  def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
}


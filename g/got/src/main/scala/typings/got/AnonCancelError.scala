package typings.got

import org.scalablytyped.runtime.Instantiable0
import typings.got.gotStrings.delete_
import typings.got.gotStrings.get_
import typings.got.gotStrings.head_
import typings.got.gotStrings.patch
import typings.got.gotStrings.post_
import typings.got.gotStrings.put_
import typings.got.mod.GotBodyFn
import typings.got.mod.GotBodyOptions
import typings.got.mod.GotEmitter
import typings.got.mod.GotExtend
import typings.got.mod.GotFormFn
import typings.got.mod.GotFormOptions
import typings.got.mod.GotInstance
import typings.got.mod.GotJSONFn
import typings.got.mod.GotJSONOptions
import typings.got.mod.GotOptions
import typings.got.mod.GotStreamFn
import typings.got.mod.GotUrl
import typings.node.streamMod.Duplex
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelError extends js.Object {
  var CancelError: Instantiable0[typings.got.mod.CancelError] = js.native
  var HTTPError: Instantiable0[typings.got.mod.HTTPError] = js.native
  var MaxRedirectsError: Instantiable0[typings.got.mod.MaxRedirectsError] = js.native
  var ParseError: Instantiable0[typings.got.mod.ParseError] = js.native
  var ReadError: Instantiable0[typings.got.mod.ReadError] = js.native
  var RequestError: Instantiable0[typings.got.mod.RequestError] = js.native
  var TimeoutError: Instantiable0[typings.got.mod.TimeoutError] = js.native
  var UnsupportedProtocolError: Instantiable0[typings.got.mod.UnsupportedProtocolError] = js.native
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


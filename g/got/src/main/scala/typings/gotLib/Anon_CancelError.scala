package typings
package gotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CancelError extends js.Object {
  var CancelError: org.scalablytyped.runtime.Instantiable0[gotLib.gotMod.CancelError] = js.native
  var HTTPError: org.scalablytyped.runtime.Instantiable0[gotLib.gotMod.HTTPError] = js.native
  var MaxRedirectsError: org.scalablytyped.runtime.Instantiable0[gotLib.gotMod.MaxRedirectsError] = js.native
  var ParseError: org.scalablytyped.runtime.Instantiable0[gotLib.gotMod.ParseError] = js.native
  var ReadError: org.scalablytyped.runtime.Instantiable0[gotLib.gotMod.ReadError] = js.native
  var RequestError: org.scalablytyped.runtime.Instantiable0[gotLib.gotMod.RequestError] = js.native
  var TimeoutError: org.scalablytyped.runtime.Instantiable0[gotLib.gotMod.TimeoutError] = js.native
  var UnsupportedProtocolError: org.scalablytyped.runtime.Instantiable0[gotLib.gotMod.UnsupportedProtocolError] = js.native
  @JSName("stream")
  var stream_Original: gotLib.gotMod.gotNs.GotStreamFn with (stdLib.Record[
    gotLib.gotLibStrings.get | gotLib.gotLibStrings.post | gotLib.gotLibStrings.put | gotLib.gotLibStrings.patch | gotLib.gotLibStrings.head | gotLib.gotLibStrings.delete, 
    gotLib.gotMod.gotNs.GotStreamFn
  ]) = js.native
  def stream(url: gotLib.gotMod.gotNs.GotUrl): gotLib.gotMod.gotNs.GotEmitter with nodeLib.streamMod.Duplex = js.native
  def stream(
    url: gotLib.gotMod.gotNs.GotUrl,
    options: gotLib.gotMod.gotNs.GotOptions[java.lang.String | scala.Null]
  ): gotLib.gotMod.gotNs.GotEmitter with nodeLib.streamMod.Duplex = js.native
}


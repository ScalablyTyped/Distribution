package typings
package gotLib.gotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gotNs {
  type GotError = gotLib.gotMod.RequestError | gotLib.gotMod.ReadError | gotLib.gotMod.ParseError | gotLib.gotMod.HTTPError | gotLib.gotMod.MaxRedirectsError | gotLib.gotMod.UnsupportedProtocolError | gotLib.gotMod.CancelError | gotLib.gotMod.TimeoutError
  type GotPromise[B /* <: nodeLib.Buffer | java.lang.String | js.Object */] = stdLib.Promise[Response[B]] with gotLib.Anon_Cancel
  type GotStreamFn = js.Function2[
    /* url */ GotUrl, 
    /* options */ js.UndefOr[GotOptions[java.lang.String | scala.Null]], 
    GotEmitter with nodeLib.streamMod.Duplex
  ]
  type GotUrl = java.lang.String | nodeLib.httpsMod.RequestOptions | nodeLib.urlMod.Url | nodeLib.urlMod.URL
  type Hook[T] = js.Function1[/* options */ T, js.Any]
  type Hooks[T] = stdLib.Record[gotLib.gotLibStrings.beforeRequest, js.Array[Hook[T]]]
  type RetryFunction = js.Function2[/* retry */ scala.Double, /* error */ js.Any, scala.Double]
}

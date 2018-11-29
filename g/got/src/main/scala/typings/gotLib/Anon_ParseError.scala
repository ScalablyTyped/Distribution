package typings
package gotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ParseError extends js.Object {
  var CancelError: ScalablyTyped.runtime.Instantiable0[gotLib.gotMod.CancelError]
  var HTTPError: ScalablyTyped.runtime.Instantiable0[gotLib.gotMod.HTTPError]
  var MaxRedirectsError: ScalablyTyped.runtime.Instantiable0[gotLib.gotMod.MaxRedirectsError]
  var ParseError: ScalablyTyped.runtime.Instantiable0[gotLib.gotMod.ParseError]
  var ReadError: ScalablyTyped.runtime.Instantiable0[gotLib.gotMod.ReadError]
  var RequestError: ScalablyTyped.runtime.Instantiable0[gotLib.gotMod.RequestError]
  var TimeoutError: ScalablyTyped.runtime.Instantiable0[gotLib.gotMod.TimeoutError]
  var UnsupportedProtocolError: ScalablyTyped.runtime.Instantiable0[gotLib.gotMod.UnsupportedProtocolError]
  var stream: gotLib.gotMod.gotNs.GotStreamFn with (stdLib.Record[
    gotLib.gotLibStrings.get | gotLib.gotLibStrings.post | gotLib.gotLibStrings.put | gotLib.gotLibStrings.patch | gotLib.gotLibStrings.head | gotLib.gotLibStrings.delete, 
    gotLib.gotMod.gotNs.GotStreamFn
  ])
}


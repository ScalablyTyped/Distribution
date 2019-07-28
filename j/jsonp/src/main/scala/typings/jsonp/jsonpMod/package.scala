package typings.jsonp

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonpMod {
  type CancelFn = js.Function0[Unit]
  type RequestCallback = js.Function2[/* error */ Error | Null, /* data */ js.Any, Unit]
}

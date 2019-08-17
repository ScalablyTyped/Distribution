package typings.jsonp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonpMod {
  import typings.std.Error

  type CancelFn = js.Function0[Unit]
  type RequestCallback = js.Function2[/* error */ Error | Null, /* data */ js.Any, Unit]
}

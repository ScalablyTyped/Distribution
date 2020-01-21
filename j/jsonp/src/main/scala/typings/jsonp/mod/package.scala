package typings.jsonp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CancelFn = js.Function0[scala.Unit]
  type RequestCallback = js.Function2[/* error */ typings.std.Error | scala.Null, /* data */ js.Any, scala.Unit]
}

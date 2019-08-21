package typings.hostile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hostileMod {
  import typings.std.Error

  type Callback = js.Function1[/* error */ Error | Null, Unit]
  type GetCallback = js.Function2[/* error */ Error | Null, /* lines */ Lines, Unit]
  type Line = String | (js.Tuple2[String, String])
  type Lines = js.Array[Line]
}

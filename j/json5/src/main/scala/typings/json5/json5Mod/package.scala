package typings.json5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object json5Mod {
  type JSONReplacer = js.Function2[/* key */ String, /* value */ js.Any, js.Any | (js.Array[Double | String]) | Null]
}

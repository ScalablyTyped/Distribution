package typings.jjve

import typings.jjv.jjvMod.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jjveMod {
  type Env = js.Function3[/* schema */ js.Object, /* data */ js.Any, /* errors */ Errors, js.Array[Issue]]
}

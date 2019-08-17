package typings.iferr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iferrMod {
  import typings.std.Error

  type nodeCallback[T] = js.Function2[/* err */ Error | Null, /* repeated */ T, js.Any]
}

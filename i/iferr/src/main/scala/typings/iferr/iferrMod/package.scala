package typings.iferr

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iferrMod {
  type nodeCallback[T] = js.Function2[/* err */ Error | Null, /* repeated */ T, js.Any]
}

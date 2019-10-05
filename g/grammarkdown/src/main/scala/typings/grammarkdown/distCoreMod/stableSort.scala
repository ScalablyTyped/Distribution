package typings.grammarkdown.distCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/core", "stableSort")
@js.native
object stableSort extends js.Object {
  def apply[T](array: js.Array[T], comparer: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
}


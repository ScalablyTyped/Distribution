package typings.luminoAlgorithm.iterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/types/iter", "each")
@js.native
object each extends js.Object {
  def apply[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ Double, Boolean | Unit]
  ): Unit = js.native
}


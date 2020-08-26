package typings.knockout.mod.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "utils.arrayFilter")
@js.native
object arrayFilter extends js.Object {
  def apply[T](array: js.Array[T], predicate: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.Array[T] = js.native
  def apply[T](
    array: js.Array[T],
    predicate: js.Function2[/* item */ T, /* index */ Double, Boolean],
    predicateOwner: js.Any
  ): js.Array[T] = js.native
}


package typings.knockout.mod.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "utils.arrayFirst")
@js.native
object arrayFirst extends js.Object {
  def apply[T](array: js.Array[T], predicate: js.Function2[/* item */ T, /* index */ Double, Boolean]): T = js.native
  def apply[T](
    array: js.Array[T],
    predicate: js.Function2[/* item */ T, /* index */ Double, Boolean],
    predicateOwner: js.Any
  ): T = js.native
}


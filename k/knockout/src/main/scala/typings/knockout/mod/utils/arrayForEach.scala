package typings.knockout.mod.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "utils.arrayForEach")
@js.native
object arrayForEach extends js.Object {
  def apply[T](array: js.Array[T], action: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = js.native
  def apply[T](
    array: js.Array[T],
    action: js.Function2[/* item */ T, /* index */ Double, Unit],
    actionOwner: js.Any
  ): Unit = js.native
}


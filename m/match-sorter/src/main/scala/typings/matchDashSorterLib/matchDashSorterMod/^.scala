package typings
package matchDashSorterLib.matchDashSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("match-sorter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Takes an array of items and a value and returns a new array with the items that match the given value
    * @param items - the items to sort
    * @param value - the value to use for ranking
    * @param options - Some options to configure the sorter
    * @return the new sorted array
    */
  def apply[T](items: js.Array[T], value: java.lang.String): js.Array[T] = js.native
  def apply[T](
    items: js.Array[T],
    value: java.lang.String,
    options: matchDashSorterLib.matchDashSorterMod.Options[T]
  ): js.Array[T] = js.native
}


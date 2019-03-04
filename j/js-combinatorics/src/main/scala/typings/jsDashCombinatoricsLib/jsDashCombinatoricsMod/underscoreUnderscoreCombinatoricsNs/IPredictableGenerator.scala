package typings
package jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPredictableGenerator[T] extends IGenerator[T] {
  /**
  		 * Returns the nth element (indexed from 0).
  		 */
  def nth(n: scala.Double): T
}

object IPredictableGenerator {
  @scala.inline
  def apply[T](
    filter: js.Function1[js.Function1[T, scala.Boolean], js.Array[T]],
    forEach: js.Function1[js.Function1[T, scala.Unit], scala.Unit],
    length: scala.Double,
    map: js.Function1[js.Function1[T, js.Any], js.Array[js.Any]],
    next: js.Function0[T],
    nth: js.Function1[scala.Double, T],
    toArray: js.Function0[js.Array[T]]
  ): IPredictableGenerator[T] = {
    val __obj = js.Dynamic.literal(filter = filter, forEach = forEach, length = length, map = map, next = next, nth = nth, toArray = toArray)
  
    __obj.asInstanceOf[IPredictableGenerator[T]]
  }
}


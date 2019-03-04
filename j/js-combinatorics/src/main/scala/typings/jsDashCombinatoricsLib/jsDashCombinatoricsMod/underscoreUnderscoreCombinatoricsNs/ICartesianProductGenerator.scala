package typings
package jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICartesianProductGenerator[T] extends IPredictableGenerator[T] {
  /**
  		 * Arguments are integer coordinates.
  		 * Arguments can be out of bounds but it returns `undefined` in such cases.
  		 */
  def get(coordinates: scala.Double*): T
}

object ICartesianProductGenerator {
  @scala.inline
  def apply[T](
    filter: js.Function1[js.Function1[T, scala.Boolean], js.Array[T]],
    forEach: js.Function1[js.Function1[T, scala.Unit], scala.Unit],
    get: js.Function1[/* repeated */ scala.Double, T],
    length: scala.Double,
    map: js.Function1[js.Function1[T, js.Any], js.Array[js.Any]],
    next: js.Function0[T],
    nth: js.Function1[scala.Double, T],
    toArray: js.Function0[js.Array[T]]
  ): ICartesianProductGenerator[T] = {
    val __obj = js.Dynamic.literal(filter = filter, forEach = forEach, get = get, length = length, map = map, next = next, nth = nth, toArray = toArray)
  
    __obj.asInstanceOf[ICartesianProductGenerator[T]]
  }
}


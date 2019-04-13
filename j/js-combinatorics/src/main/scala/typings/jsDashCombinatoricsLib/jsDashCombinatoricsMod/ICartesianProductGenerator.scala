package typings
package jsDashCombinatoricsLib.jsDashCombinatoricsMod

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
    filter: js.Function1[T, scala.Boolean] => js.Array[T],
    forEach: js.Function1[T, scala.Unit] => scala.Unit,
    get: /* repeated */ scala.Double => T,
    length: scala.Double,
    map: js.Function1[T, js.Any] => js.Array[js.Any],
    next: () => T,
    nth: scala.Double => T,
    toArray: () => js.Array[T]
  ): ICartesianProductGenerator[T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), length = length, map = js.Any.fromFunction1(map), next = js.Any.fromFunction0(next), nth = js.Any.fromFunction1(nth), toArray = js.Any.fromFunction0(toArray))
  
    __obj.asInstanceOf[ICartesianProductGenerator[T]]
  }
}


package typings.jsCombinatorics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPredictableGenerator[T] extends IGenerator[T] {
  /**
  		 * Returns the nth element (indexed from 0).
  		 */
  def nth(n: Double): T
}

object IPredictableGenerator {
  @scala.inline
  def apply[T](
    filter: js.Function1[T, Boolean] => js.Array[T],
    forEach: js.Function1[T, Unit] => Unit,
    length: Double,
    map: js.Function1[T, js.Any] => js.Array[js.Any],
    next: () => T,
    nth: Double => T,
    toArray: () => js.Array[T]
  ): IPredictableGenerator[T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1(forEach), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), next = js.Any.fromFunction0(next), nth = js.Any.fromFunction1(nth), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[IPredictableGenerator[T]]
  }
}


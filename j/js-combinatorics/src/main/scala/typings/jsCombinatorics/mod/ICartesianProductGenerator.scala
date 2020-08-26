package typings.jsCombinatorics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICartesianProductGenerator[T] extends IPredictableGenerator[T] {
  /**
    * Arguments are integer coordinates.
    * Arguments can be out of bounds but it returns `undefined` in such cases.
    */
  def get(coordinates: Double*): T = js.native
}

object ICartesianProductGenerator {
  @scala.inline
  def apply[T](
    filter: js.Function1[T, Boolean] => js.Array[T],
    forEach: js.Function1[T, Unit] => Unit,
    get: /* repeated */ Double => T,
    length: Double,
    map: js.Function1[T, js.Any] => js.Array[js.Any],
    next: () => T,
    nth: Double => T,
    toArray: () => js.Array[T]
  ): ICartesianProductGenerator[T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), next = js.Any.fromFunction0(next), nth = js.Any.fromFunction1(nth), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[ICartesianProductGenerator[T]]
  }
  @scala.inline
  implicit class ICartesianProductGeneratorOps[Self <: ICartesianProductGenerator[_], T] (val x: Self with ICartesianProductGenerator[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: /* repeated */ Double => T): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}


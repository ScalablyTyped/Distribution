package typings.jsCombinatorics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGenerator[T] extends js.Object {
  /**
    * Returns the total number of elements to be generated. This equals the result of calling
    * `generator.toArray().length` but it is precalculated without actually generating any elements.
    * Handy when doing setup for a potentially long-running loop.
    */
  var length: Double = js.native
  /**
    * Returns an array of elements that return `true` for the filter function.
    */
  def filter(predicate: js.Function1[/* item */ T, Boolean]): js.Array[T] = js.native
  /**
    * Applies the callback function for each element.
    */
  def forEach(f: js.Function1[/* item */ T, Unit]): Unit = js.native
  /**
    * Returns an array that is the output of calling the callback function separately on each element.
    */
  def map[TResult](f: js.Function1[/* item */ T, TResult]): js.Array[TResult] = js.native
  /**
    * Returns the element or undefined if no more elements are available.
    */
  def next(): T = js.native
  /**
    * Returns an array of all elements.
    */
  def toArray(): js.Array[T] = js.native
}

object IGenerator {
  @scala.inline
  def apply[T](
    filter: js.Function1[/* item */ T, Boolean] => js.Array[T],
    forEach: js.Function1[/* item */ T, Unit] => Unit,
    length: Double,
    map: js.Function1[/* item */ T, js.Any] => js.Array[js.Any],
    next: () => T,
    toArray: () => js.Array[T]
  ): IGenerator[T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1(forEach), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), next = js.Any.fromFunction0(next), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[IGenerator[T]]
  }
  @scala.inline
  implicit class IGeneratorOps[Self <: IGenerator[_], T] (val x: Self with IGenerator[T]) extends AnyVal {
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
    def setFilter(value: js.Function1[/* item */ T, Boolean] => js.Array[T]): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setForEach(value: js.Function1[/* item */ T, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: js.Function1[/* item */ T, js.Any] => js.Array[js.Any]): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def setNext(value: () => T): Self = this.set("next", js.Any.fromFunction0(value))
    @scala.inline
    def setToArray(value: () => js.Array[T]): Self = this.set("toArray", js.Any.fromFunction0(value))
  }
  
}


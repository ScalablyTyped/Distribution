package typings
package jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGenerator[T] extends js.Object {
  /**
  		 * Returns the total number of elements to be generated. This equals the result of calling
    * `generator.toArray().length` but it is precalculated without actually generating any elements.
  		 * Handy when doing setup for a potentially long-running loop.
  		 */
  var length: scala.Double
  /**
  		 * Returns an array of elements that return `true` for the filter function.
  		 */
  def filter(predicate: js.Function1[/* item */ T, scala.Boolean]): js.Array[T]
  /**
  		 * Applies the callback function for each element.
  		 */
  def forEach(f: js.Function1[/* item */ T, scala.Unit]): scala.Unit
  /**
  		 * Returns an array that is the output of calling the callback function separately on each element.
  		 */
  def map[TResult](f: js.Function1[/* item */ T, TResult]): js.Array[TResult]
  /**
  		 * Returns the element or undefined if no more elements are available.
  		 */
  def next(): T
  /**
  		 * Returns an array of all elements.
  		 */
  def toArray(): js.Array[T]
}

object IGenerator {
  @scala.inline
  def apply[T](
    filter: js.Function1[js.Function1[/* item */ T, scala.Boolean], js.Array[T]],
    forEach: js.Function1[js.Function1[/* item */ T, scala.Unit], scala.Unit],
    length: scala.Double,
    map: js.Function1[js.Function1[/* item */ T, js.Any], js.Array[js.Any]],
    next: js.Function0[T],
    toArray: js.Function0[js.Array[T]]
  ): IGenerator[T] = {
    val __obj = js.Dynamic.literal(filter = filter, forEach = forEach, length = length, map = map, next = next, toArray = toArray)
  
    __obj.asInstanceOf[IGenerator[T]]
  }
}


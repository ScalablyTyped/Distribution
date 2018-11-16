package typings
package jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGenerator[T] extends js.Object {
  /**
  		 * Returns the number of elements to be generated which equals to generator.toArray().length
  		 * but it is precalculated without actually generating elements.
  		 * Handy when you prepare for large iteration.
  		 */
  var length: scala.Double
  /**
  		 * Returns an array with elements that passes the filter function.
  		 */
  def filter(predicate: js.Function1[/* item */ T, scala.Boolean]): js.Array[T]
  /**
  		 * Applies the callback function for each element.
  		 */
  def forEach(f: js.Function1[/* item */ T, scala.Unit]): scala.Unit
  /**
  		 * All elements at once with function applied to each element.
  		 */
  def map[TResult](f: js.Function1[/* item */ T, TResult]): js.Array[TResult]
  /**
  		 * Returns the element or undefined if no more element is available.
  		 */
  def next(): T
  /**
  		 * All elements at once.
  		 */
  def toArray(): js.Array[T]
}


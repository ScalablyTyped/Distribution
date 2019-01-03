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


package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayLikeMatchers[T] extends Matchers[ArrayLike[T]] {
  @JSName("not")
  var not_ArrayLikeMatchers: ArrayLikeMatchers[T] = js.native
  def toBe(expected: ArrayContaining[T]): scala.Boolean = js.native
  def toBe(expected: ArrayContaining[T], expectationFailOutput: js.Any): scala.Boolean = js.native
  def toContain(expected: Expected[T]): scala.Boolean = js.native
  def toContain(expected: Expected[T], expectationFailOutput: js.Any): scala.Boolean = js.native
  def toEqual(expected: ArrayContaining[T]): scala.Boolean = js.native
  def toEqual(expected: ArrayContaining[T], expectationFailOutput: js.Any): scala.Boolean = js.native
}


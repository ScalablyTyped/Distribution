package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayLikeMatchers[T] extends Matchers[ArrayLike[T]] {
  /**
    * Invert the matcher following this expect.
    */
  @JSName("not")
  var not_ArrayLikeMatchers: ArrayLikeMatchers[T] = js.native
  def toBe(expected: ArrayContaining_[T]): Boolean = js.native
  def toBe(expected: ArrayContaining_[T], expectationFailOutput: js.Any): Boolean = js.native
  def toContain(expected: Expected[T]): Boolean = js.native
  def toContain(expected: Expected[T], expectationFailOutput: js.Any): Boolean = js.native
  def toEqual(expected: ArrayContaining_[T]): Boolean = js.native
  def toEqual(expected: ArrayContaining_[T], expectationFailOutput: js.Any): Boolean = js.native
}


package typings.jasminewd2.jasmineNs

import typings.jasmine.jasmineNs.ArrayLike
import typings.jasmine.jasmineNs.Expected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayLikeMatchers[T] extends Matchers[ArrayLike[T]] {
  var not: ArrayLikeMatchers[T] = js.native
  def toBe(expected: Expected[ArrayLike[T]]): js.Promise[Unit] = js.native
  def toBe(expected: Expected[ArrayLike[T]], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  def toContain(expected: T): js.Promise[Unit] = js.native
  def toContain(expected: T, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  def toEqual(expected: Expected[ArrayLike[T]]): js.Promise[Unit] = js.native
  def toEqual(expected: Expected[ArrayLike[T]], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
}


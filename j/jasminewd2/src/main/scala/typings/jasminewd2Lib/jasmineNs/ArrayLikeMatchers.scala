package typings
package jasminewd2Lib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayLikeMatchers[T]
  extends Matchers[jasmineLib.jasmineNs.ArrayLike[T]] {
  var not: ArrayLikeMatchers[T] = js.native
  def toBe(expected: jasmineLib.jasmineNs.Expected[jasmineLib.jasmineNs.ArrayLike[T]]): js.Promise[scala.Unit] = js.native
  def toBe(
    expected: jasmineLib.jasmineNs.Expected[jasmineLib.jasmineNs.ArrayLike[T]],
    expectationFailOutput: js.Any
  ): js.Promise[scala.Unit] = js.native
  def toContain(expected: T): js.Promise[scala.Unit] = js.native
  def toContain(expected: T, expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toEqual(expected: jasmineLib.jasmineNs.Expected[jasmineLib.jasmineNs.ArrayLike[T]]): js.Promise[scala.Unit] = js.native
  def toEqual(
    expected: jasmineLib.jasmineNs.Expected[jasmineLib.jasmineNs.ArrayLike[T]],
    expectationFailOutput: js.Any
  ): js.Promise[scala.Unit] = js.native
}


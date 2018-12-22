package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncMatchers[T, U] extends js.Object {
  /**
           * Invert the matcher following this expect.
           */
  var not: AsyncMatchers[T, U] = js.native
  /**
           * Expect a promise to be rejected.
           * @param expectationFailOutput
           */
  def toBeRejected(): js.Promise[scala.Unit] = js.native
  /**
           * Expect a promise to be rejected.
           * @param expectationFailOutput
           */
  def toBeRejected(expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  /**
           * Expect a promise to be rejected with a value equal to the expected, using deep equality comparison.
           * @param expected - Value that the promise is expected to be rejected with.
           */
  def toBeRejectedWith(expected: Expected[U]): js.Promise[scala.Unit] = js.native
  /**
           * Expect a promise to be resolved.
           * @param expectationFailOutput
           */
  def toBeResolved(): js.Promise[scala.Unit] = js.native
  /**
           * Expect a promise to be resolved.
           * @param expectationFailOutput
           */
  def toBeResolved(expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  /**
           * Expect a promise to be resolved to a value equal to the expected, using deep equality comparison.
           * @param expected - Value that the promise is expected to resolve to.
           */
  def toBeResolvedTo(expected: Expected[T]): js.Promise[scala.Unit] = js.native
  /**
           * Add some context for an expect.
           * @param message - Additional context to show when the matcher fails.
           */
  def withContext(message: java.lang.String): AsyncMatchers[T, U] = js.native
}


package typings.jasminePromiseMatchers.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[T] extends js.Object {
  /**
  		 * Verifies that a value is a $q Promise.
  		 */
  def toBePromise(): Boolean
  /**
  		 * Verifies that a Promise is (or has been) rejected.
  		 */
  def toBeRejected(): Boolean
  /**
  		 * Verifies that a Promise is (or has been) rejected with the specified parameter.
  		 */
  def toBeRejectedWith(value: js.Any): Boolean
  /**
  		 * Verifies that a Promise is (or has been) resolved.
  		 */
  def toBeResolved(): Boolean
  /**
  		 * Verifies that a Promise is (or has been) resolved with the specified parameter.
  		 */
  def toBeResolvedWith(value: js.Any): Boolean
}

object Matchers {
  @scala.inline
  def apply[T](
    toBePromise: () => Boolean,
    toBeRejected: () => Boolean,
    toBeRejectedWith: js.Any => Boolean,
    toBeResolved: () => Boolean,
    toBeResolvedWith: js.Any => Boolean
  ): Matchers[T] = {
    val __obj = js.Dynamic.literal(toBePromise = js.Any.fromFunction0(toBePromise), toBeRejected = js.Any.fromFunction0(toBeRejected), toBeRejectedWith = js.Any.fromFunction1(toBeRejectedWith), toBeResolved = js.Any.fromFunction0(toBeResolved), toBeResolvedWith = js.Any.fromFunction1(toBeResolvedWith))
    __obj.asInstanceOf[Matchers[T]]
  }
}


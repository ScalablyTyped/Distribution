package typings
package jasmineDashPromiseDashMatchersLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[T] extends js.Object {
  /**
  		 * Verifies that a value is a $q Promise.
  		 */
  def toBePromise(): scala.Boolean
  /**
  		 * Verifies that a Promise is (or has been) rejected.
  		 */
  def toBeRejected(): scala.Boolean
  /**
  		 * Verifies that a Promise is (or has been) rejected with the specified parameter.
  		 */
  def toBeRejectedWith(value: js.Any): scala.Boolean
  /**
  		 * Verifies that a Promise is (or has been) resolved.
  		 */
  def toBeResolved(): scala.Boolean
  /**
  		 * Verifies that a Promise is (or has been) resolved with the specified parameter.
  		 */
  def toBeResolvedWith(value: js.Any): scala.Boolean
}

object Matchers {
  @scala.inline
  def apply[T](
    toBePromise: () => scala.Boolean,
    toBeRejected: () => scala.Boolean,
    toBeRejectedWith: js.Any => scala.Boolean,
    toBeResolved: () => scala.Boolean,
    toBeResolvedWith: js.Any => scala.Boolean
  ): Matchers[T] = {
    val __obj = js.Dynamic.literal(toBePromise = js.Any.fromFunction0(toBePromise), toBeRejected = js.Any.fromFunction0(toBeRejected), toBeRejectedWith = js.Any.fromFunction1(toBeRejectedWith), toBeResolved = js.Any.fromFunction0(toBeResolved), toBeResolvedWith = js.Any.fromFunction1(toBeResolvedWith))
  
    __obj.asInstanceOf[Matchers[T]]
  }
}


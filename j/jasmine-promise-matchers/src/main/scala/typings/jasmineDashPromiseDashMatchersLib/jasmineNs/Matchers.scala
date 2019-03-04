package typings
package jasmineDashPromiseDashMatchersLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[T] extends js.Object {
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
    toBeRejected: js.Function0[scala.Boolean],
    toBeRejectedWith: js.Function1[js.Any, scala.Boolean],
    toBeResolved: js.Function0[scala.Boolean],
    toBeResolvedWith: js.Function1[js.Any, scala.Boolean]
  ): Matchers[T] = {
    val __obj = js.Dynamic.literal(toBeRejected = toBeRejected, toBeRejectedWith = toBeRejectedWith, toBeResolved = toBeResolved, toBeResolvedWith = toBeResolvedWith)
  
    __obj.asInstanceOf[Matchers[T]]
  }
}


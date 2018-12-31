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


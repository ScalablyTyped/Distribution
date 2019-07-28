package typings.jasmineDashEs6DashPromiseDashMatchers.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[T] extends js.Object {
  /**
  		 * Verifies that a Promise is (or has been) rejected.
  		 */
  def toBeRejected(): Boolean = js.native
  def toBeRejected(done: js.Function0[Unit]): Boolean = js.native
  /**
  		 * Verifies that a Promise is (or has been) rejected with the specified parameter.
  		 */
  def toBeRejectedWith(value: js.Any): Boolean = js.native
  def toBeRejectedWith(value: js.Any, done: js.Function0[Unit]): Boolean = js.native
  /**
  		 * Verifies that a Promise is (or has been) resolved.
  		 */
  def toBeResolved(): Boolean = js.native
  def toBeResolved(done: js.Function0[Unit]): Boolean = js.native
  /**
  		 * Verifies that a Promise is (or has been) resolved with the specified parameter.
  		 */
  def toBeResolvedWith(value: js.Any): Boolean = js.native
  def toBeResolvedWith(value: js.Any, done: js.Function0[Unit]): Boolean = js.native
}


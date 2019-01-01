package typings
package jasmineDashGivenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoneFn extends js.Object {
  def apply(): scala.Unit = js.native
  /** fails the spec and indicates that it has completed. If the message is an Error, Error.message is used */
  def fail(): scala.Unit = js.native
  def fail(message: java.lang.String): scala.Unit = js.native
  def fail(message: stdLib.Error): scala.Unit = js.native
}


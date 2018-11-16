package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscribableFunctions[T] extends js.Object {
  def notifySubscribers(): scala.Unit = js.native
  def notifySubscribers(valueToWrite: T): scala.Unit = js.native
  def notifySubscribers(valueToWrite: T, event: java.lang.String): scala.Unit = js.native
}


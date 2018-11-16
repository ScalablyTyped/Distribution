package typings
package knockoutDashPreDashRenderedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscribableFunctions[T]
  extends /* key */ ScalablyTyped.runtime.StringDictionary[KnockoutBindingHandler] {
  def notifySubscribers(): scala.Unit = js.native
  def notifySubscribers(valueToWrite: T): scala.Unit = js.native
  def notifySubscribers(valueToWrite: T, event: java.lang.String): scala.Unit = js.native
}


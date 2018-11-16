package typings
package indefiniteDashObservableLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Observable[T] extends js.Object {
  def subscribe(observerOrNext: ObserverOrNext[T]): Subscription
}


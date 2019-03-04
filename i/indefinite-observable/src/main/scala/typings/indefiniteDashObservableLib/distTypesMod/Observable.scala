package typings
package indefiniteDashObservableLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observable[T] extends js.Object {
  def subscribe(observerOrNext: ObserverOrNext[T]): Subscription
}

object Observable {
  @scala.inline
  def apply[T](subscribe: js.Function1[ObserverOrNext[T], Subscription]): Observable[T] = {
    val __obj = js.Dynamic.literal(subscribe = subscribe)
  
    __obj.asInstanceOf[Observable[T]]
  }
}


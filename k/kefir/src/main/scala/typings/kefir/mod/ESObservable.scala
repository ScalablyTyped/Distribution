package typings.kefir.mod

import typings.kefir.AnonUnsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ESObservable[T, S] extends js.Object {
  def subscribe(callbacks: ESObserver[T, S]): AnonUnsubscribe
}

object ESObservable {
  @scala.inline
  def apply[T, S](subscribe: ESObserver[T, S] => AnonUnsubscribe): ESObservable[T, S] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[ESObservable[T, S]]
  }
}


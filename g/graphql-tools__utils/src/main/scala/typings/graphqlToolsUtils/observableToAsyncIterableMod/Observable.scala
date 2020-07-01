package typings.graphqlToolsUtils.observableToAsyncIterableMod

import typings.graphqlToolsUtils.anon.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observable[T] extends js.Object {
  def subscribe(observer: Observer[T]): Unsubscribe
}

object Observable {
  @scala.inline
  def apply[T](subscribe: Observer[T] => Unsubscribe): Observable[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Observable[T]]
  }
}


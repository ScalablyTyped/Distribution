package typings.graphqlToolsUtils.observableToAsyncIterableMod

import typings.graphqlToolsUtils.anon.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable[T] extends js.Object {
  def subscribe(observer: Observer[T]): Unsubscribe = js.native
}

object Observable {
  @scala.inline
  def apply[T](subscribe: Observer[T] => Unsubscribe): Observable[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Observable[T]]
  }
  @scala.inline
  implicit class ObservableOps[Self <: Observable[_], T] (val x: Self with Observable[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSubscribe(value: Observer[T] => Unsubscribe): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
  
}


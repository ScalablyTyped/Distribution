package typings.lazyJs.LazyJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncHandle[T] extends js.Object {
  def cancel(): Unit = js.native
  def onComplete(callback: Callback): Unit = js.native
  def onError(callback: ErrorCallback): Unit = js.native
}

object AsyncHandle {
  @scala.inline
  def apply[T](cancel: () => Unit, onComplete: Callback => Unit, onError: ErrorCallback => Unit): AsyncHandle[T] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), onComplete = js.Any.fromFunction1(onComplete), onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[AsyncHandle[T]]
  }
  @scala.inline
  implicit class AsyncHandleOps[Self <: AsyncHandle[_], T] (val x: Self with AsyncHandle[T]) extends AnyVal {
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setOnComplete(value: Callback => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setOnError(value: ErrorCallback => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
  }
  
}


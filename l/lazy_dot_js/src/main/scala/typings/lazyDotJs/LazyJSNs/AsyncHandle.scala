package typings.lazyDotJs.LazyJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncHandle[T] extends js.Object {
  def cancel(): Unit
  def onComplete(callback: Callback): Unit
  def onError(callback: ErrorCallback): Unit
}

object AsyncHandle {
  @scala.inline
  def apply[T](cancel: () => Unit, onComplete: Callback => Unit, onError: ErrorCallback => Unit): AsyncHandle[T] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), onComplete = js.Any.fromFunction1(onComplete), onError = js.Any.fromFunction1(onError))
  
    __obj.asInstanceOf[AsyncHandle[T]]
  }
}


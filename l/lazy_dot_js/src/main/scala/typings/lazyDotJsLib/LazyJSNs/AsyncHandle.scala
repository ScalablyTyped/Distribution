package typings
package lazyDotJsLib.LazyJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncHandle[T] extends js.Object {
  def cancel(): scala.Unit
  def onComplete(callback: Callback): scala.Unit
  def onError(callback: ErrorCallback): scala.Unit
}

object AsyncHandle {
  @scala.inline
  def apply[T](cancel: () => scala.Unit, onComplete: Callback => scala.Unit, onError: ErrorCallback => scala.Unit): AsyncHandle[T] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), onComplete = js.Any.fromFunction1(onComplete), onError = js.Any.fromFunction1(onError))
  
    __obj.asInstanceOf[AsyncHandle[T]]
  }
}


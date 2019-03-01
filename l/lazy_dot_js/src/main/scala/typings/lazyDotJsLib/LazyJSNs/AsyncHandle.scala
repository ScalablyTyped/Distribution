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
  def apply[T](
    cancel: js.Function0[scala.Unit],
    onComplete: js.Function1[Callback, scala.Unit],
    onError: js.Function1[ErrorCallback, scala.Unit]
  ): AsyncHandle[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("onComplete")(onComplete)
    __obj.updateDynamic("onError")(onError)
    __obj.asInstanceOf[AsyncHandle[T]]
  }
}


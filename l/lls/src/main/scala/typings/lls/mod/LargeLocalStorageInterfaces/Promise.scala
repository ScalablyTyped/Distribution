package typings.lls.mod.LargeLocalStorageInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[T] extends js.Object {
  def `catch`[U](): Promise[U] = js.native
  def `catch`[U](onRejected: js.Function1[/* error */ js.Any, U | Promise[U]]): Promise[U] = js.native
  def `then`[U](): Promise[U] = js.native
  def `then`[U](onFulfilled: js.Function1[/* value */ T, U | Promise[U]]): Promise[U] = js.native
  def `then`[U](
    onFulfilled: js.Function1[/* value */ T, Promise[U] | U],
    onRejected: js.Function1[/* error */ js.Any, Promise[U] | U | Unit]
  ): Promise[U] = js.native
}


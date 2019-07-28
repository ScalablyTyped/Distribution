package typings.jqueryDotAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAjaxFilePromise[T] extends js.Object {
  def abord(): Unit = js.native
  def always(error: IAjaxFileResultCallback[T]): IAjaxFilePromise[T] = js.native
  def done(success: IAjaxFileResultCallback[T]): IAjaxFilePromise[T] = js.native
  def fail(error: IAjaxFileResultCallback[T]): IAjaxFilePromise[T] = js.native
  def `then`(success: IAjaxFileResultCallback[T]): IAjaxFilePromise[T] = js.native
  def `then`(success: IAjaxFileResultCallback[T], error: IAjaxFileResultCallback[T]): IAjaxFilePromise[T] = js.native
}


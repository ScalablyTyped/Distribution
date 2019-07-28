package typings.html2canvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Html2CanvasPromise[R] extends Html2CanvasThenable[R] {
  def `catch`[U](): Html2CanvasPromise[U] = js.native
  def `catch`[U](onRejected: js.Function1[/* error */ js.Any, U | Html2CanvasThenable[U]]): Html2CanvasPromise[U] = js.native
}


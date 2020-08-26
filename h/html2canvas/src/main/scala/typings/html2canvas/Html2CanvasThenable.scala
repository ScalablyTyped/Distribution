package typings.html2canvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// FIXME:
// Find out a way to dependent on real Promise interface.
// And remove following custome Promise interface.
@js.native
trait Html2CanvasThenable[R] extends js.Object {
  def `then`[U](): Html2CanvasThenable[U] = js.native
  def `then`[U](
    onFulfilled: js.UndefOr[scala.Nothing],
    onRejected: js.Function1[/* error */ js.Any, Html2CanvasThenable[U] | U | Unit]
  ): Html2CanvasThenable[U] = js.native
  def `then`[U](onFulfilled: js.Function1[/* value */ R, U | Html2CanvasThenable[U]]): Html2CanvasThenable[U] = js.native
  def `then`[U](
    onFulfilled: js.Function1[/* value */ R, Html2CanvasThenable[U] | U],
    onRejected: js.Function1[/* error */ js.Any, Html2CanvasThenable[U] | U | Unit]
  ): Html2CanvasThenable[U] = js.native
}


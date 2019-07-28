package typings.materializeDashCss.MNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Toast")
@js.native
class Toast () extends ComponentBase[ToastOptions] {
  /**
    * Describes the current pan state of the Toast.
    */
  var panning: Boolean = js.native
  /**
    * The remaining amount of time in ms that the toast will stay before dismissal.
    */
  var timeRemaining: Double = js.native
  /**
    * remove a specific toast
    */
  def dismiss(): Unit = js.native
}

/* static members */
@JSGlobal("M.Toast")
@js.native
object Toast extends js.Object {
  /**
    * dismiss all toasts
    */
  def dismissAll(): Unit = js.native
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Toast = js.native
}


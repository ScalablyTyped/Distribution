package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Toast")
@js.native
class Toast () extends ComponentBase[ToastOptions] {
  /**
    * Describes the current pan state of the Toast.
    */
  var panning: scala.Boolean = js.native
  /**
    * The remaining amount of time in ms that the toast will stay before dismissal.
    */
  var timeRemaining: scala.Double = js.native
  /**
    * remove a specific toast
    */
  def dismiss(): scala.Unit = js.native
}

@JSGlobal("M.Toast")
@js.native
object Toast extends js.Object {
  /**
    * dismiss all toasts
    */
  def dismissAll(): scala.Unit = js.native
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Toast = js.native
}


package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toast extends ComponentBase[ToastOptions] {
  /**
    * Describes the current pan state of the Toast.
    */
  var panning: Boolean
  /**
    * The remaining amount of time in ms that the toast will stay before dismissal.
    */
  var timeRemaining: Double
  /**
    * remove a specific toast
    */
  def dismiss(): Unit
}

object Toast {
  @scala.inline
  def apply(dismiss: () => Unit, el: Element, options: ToastOptions, panning: Boolean, timeRemaining: Double): Toast = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), el = el.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], panning = panning.asInstanceOf[js.Any], timeRemaining = timeRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toast]
  }
}


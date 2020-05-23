package typings.ladda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindOptions extends js.Object {
  /**
    * A function to be called with the Ladda instance when a target button is clicked.
    */
  var callback: js.UndefOr[js.Function1[/* instance */ LaddaButton, Unit]] = js.undefined
  /**
    * Number of milliseconds to wait before automatically cancelling the animation.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object BindOptions {
  @scala.inline
  def apply(callback: /* instance */ LaddaButton => Unit = null, timeout: js.UndefOr[Double] = js.undefined): BindOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindOptions]
  }
}


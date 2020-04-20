package typings.materialProgressIndicator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCProgressIndicator extends js.Object {
  /**
    * Toggles the component between the determinate and indeterminate state.
    */
  var determinate: Boolean
  /**
    * The current progress value. Value should be between [0, 1].
    */
  var progress: Double
  /**
    * Puts the component in the closed state.
    */
  def close(): Unit
  /**
    * Puts the component in the open state.
    */
  def open(): Unit
}

object MDCProgressIndicator {
  @scala.inline
  def apply(close: () => Unit, determinate: Boolean, open: () => Unit, progress: Double): MDCProgressIndicator = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), determinate = determinate.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCProgressIndicator]
  }
}


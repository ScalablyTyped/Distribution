package typings.materialProgressIndicator.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCProgressIndicatorFoundation extends js.Object {
  /**
    * Puts the component in the closed state.
    */
  def close(): Unit = js.native
  /**
    * Puts the component in the open state.
    */
  def open(): Unit = js.native
  /**
    * Toggles the component between the determinate and indeterminate state.
    *
    * @param isDeterminate - Whether the component is in determinate state
    */
  def setDeterminate(isDeterminate: Boolean): Unit = js.native
  /**
    * Sets the current progress value.
    *
    * @param value - the current progress value, should be between [0,1]
    */
  def setProgress(value: Double): Unit = js.native
}

object MDCProgressIndicatorFoundation {
  @scala.inline
  def apply(close: () => Unit, open: () => Unit, setDeterminate: Boolean => Unit, setProgress: Double => Unit): MDCProgressIndicatorFoundation = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open), setDeterminate = js.Any.fromFunction1(setDeterminate), setProgress = js.Any.fromFunction1(setProgress))
    __obj.asInstanceOf[MDCProgressIndicatorFoundation]
  }
  @scala.inline
  implicit class MDCProgressIndicatorFoundationOps[Self <: MDCProgressIndicatorFoundation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDeterminate(value: Boolean => Unit): Self = this.set("setDeterminate", js.Any.fromFunction1(value))
    @scala.inline
    def setSetProgress(value: Double => Unit): Self = this.set("setProgress", js.Any.fromFunction1(value))
  }
  
}


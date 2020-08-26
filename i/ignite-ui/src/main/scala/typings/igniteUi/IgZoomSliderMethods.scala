package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgZoomSliderMethods extends js.Object {
  /**
    * Destroys widget.
    */
  def destroy(): Unit = js.native
  /**
    * Flushes the gauge.
    */
  def flush(): Unit = js.native
  def notifySizeChanged(): Unit = js.native
  def onAttachedToUI(): Unit = js.native
  def onDetachedFromUI(): Unit = js.native
}

object IgZoomSliderMethods {
  @scala.inline
  def apply(
    destroy: () => Unit,
    flush: () => Unit,
    notifySizeChanged: () => Unit,
    onAttachedToUI: () => Unit,
    onDetachedFromUI: () => Unit
  ): IgZoomSliderMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), notifySizeChanged = js.Any.fromFunction0(notifySizeChanged), onAttachedToUI = js.Any.fromFunction0(onAttachedToUI), onDetachedFromUI = js.Any.fromFunction0(onDetachedFromUI))
    __obj.asInstanceOf[IgZoomSliderMethods]
  }
  @scala.inline
  implicit class IgZoomSliderMethodsOps[Self <: IgZoomSliderMethods] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifySizeChanged(value: () => Unit): Self = this.set("notifySizeChanged", js.Any.fromFunction0(value))
    @scala.inline
    def setOnAttachedToUI(value: () => Unit): Self = this.set("onAttachedToUI", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDetachedFromUI(value: () => Unit): Self = this.set("onDetachedFromUI", js.Any.fromFunction0(value))
  }
  
}


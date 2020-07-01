package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgZoomSliderMethods extends js.Object {
  /**
    * Destroys widget.
    */
  def destroy(): Unit
  /**
    * Flushes the gauge.
    */
  def flush(): Unit
  def notifySizeChanged(): Unit
  def onAttachedToUI(): Unit
  def onDetachedFromUI(): Unit
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
}


package typings.igniteDashUi

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
}

object IgZoomSliderMethods {
  @scala.inline
  def apply(destroy: () => Unit, flush: () => Unit, notifySizeChanged: () => Unit): IgZoomSliderMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), notifySizeChanged = js.Any.fromFunction0(notifySizeChanged))
  
    __obj.asInstanceOf[IgZoomSliderMethods]
  }
}


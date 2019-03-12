package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgZoomSliderMethods extends js.Object {
  /**
  	 * Destroys widget.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Flushes the gauge.
  	 */
  def flush(): scala.Unit
  def notifySizeChanged(): scala.Unit
}

object IgZoomSliderMethods {
  @scala.inline
  def apply(destroy: () => scala.Unit, flush: () => scala.Unit, notifySizeChanged: () => scala.Unit): IgZoomSliderMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), notifySizeChanged = js.Any.fromFunction0(notifySizeChanged))
  
    __obj.asInstanceOf[IgZoomSliderMethods]
  }
}


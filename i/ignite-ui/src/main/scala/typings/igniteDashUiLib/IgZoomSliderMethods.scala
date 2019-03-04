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
  def apply(
    destroy: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    notifySizeChanged: js.Function0[scala.Unit]
  ): IgZoomSliderMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy, flush = flush, notifySizeChanged = notifySizeChanged)
  
    __obj.asInstanceOf[IgZoomSliderMethods]
  }
}


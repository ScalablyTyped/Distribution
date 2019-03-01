package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomChangedEventUIParam extends js.Object {
  /**
  	 * Gets reference to the igZoombar.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ZoomChangedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): ZoomChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ZoomChangedEventUIParam]
  }
}


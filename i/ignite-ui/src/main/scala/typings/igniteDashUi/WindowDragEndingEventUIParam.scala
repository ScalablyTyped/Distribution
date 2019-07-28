package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowDragEndingEventUIParam extends js.Object {
  /**
  	 * Gets reference to the igZoombar.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object WindowDragEndingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): WindowDragEndingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[WindowDragEndingEventUIParam]
  }
}


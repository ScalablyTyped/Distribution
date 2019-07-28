package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowDragStartingEventUIParam extends js.Object {
  /**
  	 * Gets reference to the igZoombar.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object WindowDragStartingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): WindowDragStartingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[WindowDragStartingEventUIParam]
  }
}


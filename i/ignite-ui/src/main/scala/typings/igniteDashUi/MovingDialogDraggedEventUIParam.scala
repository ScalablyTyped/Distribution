package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovingDialogDraggedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the ColumnMoving widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object MovingDialogDraggedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): MovingDialogDraggedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovingDialogDraggedEventUIParam]
  }
}


package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovingDialogOpenedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the ColumnMoving widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object MovingDialogOpenedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): MovingDialogOpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[MovingDialogOpenedEventUIParam]
  }
}


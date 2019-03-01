package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovingDialogContentsRenderedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the ColumnMoving widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object MovingDialogContentsRenderedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): MovingDialogContentsRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[MovingDialogContentsRenderedEventUIParam]
  }
}


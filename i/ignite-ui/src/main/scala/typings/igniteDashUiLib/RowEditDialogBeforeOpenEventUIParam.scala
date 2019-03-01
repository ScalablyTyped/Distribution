package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowEditDialogBeforeOpenEventUIParam extends js.Object {
  /**
  	 * Gets a reference to row edit dialog DOM element.
  	 */
  var dialogElement: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to GridUpdating.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object RowEditDialogBeforeOpenEventUIParam {
  @scala.inline
  def apply(dialogElement: js.Any = null, owner: js.Any = null): RowEditDialogBeforeOpenEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dialogElement != null) __obj.updateDynamic("dialogElement")(dialogElement)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[RowEditDialogBeforeOpenEventUIParam]
  }
}


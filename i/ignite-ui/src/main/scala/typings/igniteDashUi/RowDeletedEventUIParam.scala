package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDeletedEventUIParam extends js.Object {
  /**
  	 * Gets a jQuery object containing the TR element of the deleted row.
  	 */
  var element: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to GridUpdating.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the row's PK value.
  	 */
  var rowID: js.UndefOr[js.Any] = js.undefined
}

object RowDeletedEventUIParam {
  @scala.inline
  def apply(element: js.Any = null, owner: js.Any = null, rowID: js.Any = null): RowDeletedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (rowID != null) __obj.updateDynamic("rowID")(rowID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDeletedEventUIParam]
  }
}


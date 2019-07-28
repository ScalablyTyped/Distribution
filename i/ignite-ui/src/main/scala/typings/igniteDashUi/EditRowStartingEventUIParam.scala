package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditRowStartingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to GridUpdating.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Checks if the edit mode is for adding a new row.
  	 */
  var rowAdding: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets the row's PK value.
  	 */
  var rowID: js.UndefOr[js.Any] = js.undefined
}

object EditRowStartingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, rowAdding: js.UndefOr[Boolean] = js.undefined, rowID: js.Any = null): EditRowStartingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (!js.isUndefined(rowAdding)) __obj.updateDynamic("rowAdding")(rowAdding)
    if (rowID != null) __obj.updateDynamic("rowID")(rowID)
    __obj.asInstanceOf[EditRowStartingEventUIParam]
  }
}


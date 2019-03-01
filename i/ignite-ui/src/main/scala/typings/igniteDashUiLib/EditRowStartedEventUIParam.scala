package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditRowStartedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to GridUpdating.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Checks if the edit mode is for adding a new row.
  	 */
  var rowAdding: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the row's PK value.
  	 */
  var rowID: js.UndefOr[js.Any] = js.undefined
}

object EditRowStartedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, rowAdding: js.UndefOr[scala.Boolean] = js.undefined, rowID: js.Any = null): EditRowStartedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (!js.isUndefined(rowAdding)) __obj.updateDynamic("rowAdding")(rowAdding)
    if (rowID != null) __obj.updateDynamic("rowID")(rowID)
    __obj.asInstanceOf[EditRowStartedEventUIParam]
  }
}


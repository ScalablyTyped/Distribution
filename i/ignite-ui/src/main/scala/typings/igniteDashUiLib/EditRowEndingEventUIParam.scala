package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditRowEndingEventUIParam extends js.Object {
  /**
  	 * Gets the old value for the column with the specified key.
  	 */
  var oldValues: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to GridUpdating.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Checks if the edit mode is for adding a new row.
  	 */
  var rowAdding: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Check if any of the values is changed which will cause update in the data source. Can be manually set to false to prevent this update.
  	 */
  var update: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or set the new value for the column with the specified key.
  	 */
  var values: js.UndefOr[js.Any] = js.undefined
}

object EditRowEndingEventUIParam {
  @scala.inline
  def apply(
    oldValues: js.Any = null,
    owner: js.Any = null,
    rowAdding: js.UndefOr[scala.Boolean] = js.undefined,
    update: js.UndefOr[scala.Boolean] = js.undefined,
    values: js.Any = null
  ): EditRowEndingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (oldValues != null) __obj.updateDynamic("oldValues")(oldValues)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (!js.isUndefined(rowAdding)) __obj.updateDynamic("rowAdding")(rowAdding)
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[EditRowEndingEventUIParam]
  }
}


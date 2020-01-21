package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowAddedEventUIParam extends js.Object {
  /**
  	 * Gets the default value (before editing) for the column with the specified key.
  	 */
  var oldValues: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to GridUpdating.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the value for the column with the specified key.
  	 */
  var values: js.UndefOr[js.Any] = js.undefined
}

object RowAddedEventUIParam {
  @scala.inline
  def apply(oldValues: js.Any = null, owner: js.Any = null, values: js.Any = null): RowAddedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (oldValues != null) __obj.updateDynamic("oldValues")(oldValues.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowAddedEventUIParam]
  }
}


package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnShowingRefusedEventUIParam extends js.Object {
  /**
  	 * Array of column keys. Has a value only if the column's key is a string.
  	 */
  var columnKeys: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets a reference to the GridHiding widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnShowingRefusedEventUIParam {
  @scala.inline
  def apply(columnKeys: js.Array[_] = null, owner: js.Any = null): ColumnShowingRefusedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKeys != null) __obj.updateDynamic("columnKeys")(columnKeys.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnShowingRefusedEventUIParam]
  }
}


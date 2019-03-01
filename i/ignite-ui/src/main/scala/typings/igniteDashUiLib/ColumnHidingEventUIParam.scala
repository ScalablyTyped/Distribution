package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnHidingEventUIParam extends js.Object {
  /**
  	 * Gets the hidden column index. Has a value only if the column's key is a number.
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the hidden column key. Has a value only if the column's key is a string.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the GridHiding widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnHidingEventUIParam {
  @scala.inline
  def apply(
    columnIndex: scala.Int | scala.Double = null,
    columnKey: java.lang.String = null,
    owner: js.Any = null
  ): ColumnHidingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ColumnHidingEventUIParam]
  }
}


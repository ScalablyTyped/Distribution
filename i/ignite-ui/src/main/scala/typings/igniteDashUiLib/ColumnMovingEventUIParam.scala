package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnMovingEventUIParam extends js.Object {
  /**
  	 * Gets the column index of the column that was being moved.
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the column key of the column that was being moved.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the widget.
  	 */
  var owner: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the new column index of the column that was being moved.
  	 */
  var targetIndex: js.UndefOr[scala.Double] = js.undefined
}

object ColumnMovingEventUIParam {
  @scala.inline
  def apply(
    columnIndex: scala.Int | scala.Double = null,
    columnKey: java.lang.String = null,
    owner: java.lang.String = null,
    targetIndex: scala.Int | scala.Double = null
  ): ColumnMovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (targetIndex != null) __obj.updateDynamic("targetIndex")(targetIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMovingEventUIParam]
  }
}


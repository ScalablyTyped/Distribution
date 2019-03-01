package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnMovedEventUIParam extends js.Object {
  /**
  	 * Gets the column key of the column that was moved.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the new column index of the column that was being moved.
  	 */
  var newIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the previous column index of the column that was moved.
  	 */
  var oldIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets a reference to the widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnMovedEventUIParam {
  @scala.inline
  def apply(
    columnKey: java.lang.String = null,
    newIndex: scala.Int | scala.Double = null,
    oldIndex: scala.Int | scala.Double = null,
    owner: js.Any = null
  ): ColumnMovedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (newIndex != null) __obj.updateDynamic("newIndex")(newIndex.asInstanceOf[js.Any])
    if (oldIndex != null) __obj.updateDynamic("oldIndex")(oldIndex.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ColumnMovedEventUIParam]
  }
}


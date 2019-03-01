package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResizingRefusedEventUIParam extends js.Object {
  /**
  	 * Gets the resized column index.
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the resized column key.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the desired width(before min/max coercion) for the resized column.
  	 */
  var desiredWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets a reference to the GridResizing widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnResizingRefusedEventUIParam {
  @scala.inline
  def apply(
    columnIndex: scala.Int | scala.Double = null,
    columnKey: java.lang.String = null,
    desiredWidth: scala.Int | scala.Double = null,
    owner: js.Any = null
  ): ColumnResizingRefusedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (desiredWidth != null) __obj.updateDynamic("desiredWidth")(desiredWidth.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ColumnResizingRefusedEventUIParam]
  }
}


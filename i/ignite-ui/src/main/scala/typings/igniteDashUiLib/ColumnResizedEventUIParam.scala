package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResizedEventUIParam extends js.Object {
  /**
  	 * Gets the resized column index.
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the resized column key.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the final column width after resizing.
  	 */
  var newWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the original column width.
  	 */
  var originalWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets a reference to the GridResizing widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnResizedEventUIParam {
  @scala.inline
  def apply(
    columnIndex: scala.Int | scala.Double = null,
    columnKey: java.lang.String = null,
    newWidth: scala.Int | scala.Double = null,
    originalWidth: scala.Int | scala.Double = null,
    owner: js.Any = null
  ): ColumnResizedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (newWidth != null) __obj.updateDynamic("newWidth")(newWidth.asInstanceOf[js.Any])
    if (originalWidth != null) __obj.updateDynamic("originalWidth")(originalWidth.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ColumnResizedEventUIParam]
  }
}


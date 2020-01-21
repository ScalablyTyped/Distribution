package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResizedEventUIParam extends js.Object {
  /**
  	 * Gets the resized column index.
  	 */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the resized column key.
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the final column width after resizing.
  	 */
  var newWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the original column width.
  	 */
  var originalWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets a reference to the GridResizing widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnResizedEventUIParam {
  @scala.inline
  def apply(
    columnIndex: Int | Double = null,
    columnKey: String = null,
    newWidth: Int | Double = null,
    originalWidth: Int | Double = null,
    owner: js.Any = null
  ): ColumnResizedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (newWidth != null) __obj.updateDynamic("newWidth")(newWidth.asInstanceOf[js.Any])
    if (originalWidth != null) __obj.updateDynamic("originalWidth")(originalWidth.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnResizedEventUIParam]
  }
}


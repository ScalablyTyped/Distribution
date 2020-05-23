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
    columnIndex: js.UndefOr[Double] = js.undefined,
    columnKey: String = null,
    newWidth: js.UndefOr[Double] = js.undefined,
    originalWidth: js.UndefOr[Double] = js.undefined,
    owner: js.Any = null
  ): ColumnResizedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (!js.isUndefined(newWidth)) __obj.updateDynamic("newWidth")(newWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(originalWidth)) __obj.updateDynamic("originalWidth")(originalWidth.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnResizedEventUIParam]
  }
}


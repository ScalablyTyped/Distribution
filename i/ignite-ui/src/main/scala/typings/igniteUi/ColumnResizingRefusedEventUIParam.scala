package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResizingRefusedEventUIParam extends js.Object {
  /**
    * Gets the resized column index.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
    * Gets the resized column key.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
    * Gets the desired width(before min/max coercion) for the resized column.
    */
  var desiredWidth: js.UndefOr[Double] = js.undefined
  /**
    * Gets a reference to the GridResizing widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnResizingRefusedEventUIParam {
  @scala.inline
  def apply(
    columnIndex: js.UndefOr[Double] = js.undefined,
    columnKey: String = null,
    desiredWidth: js.UndefOr[Double] = js.undefined,
    owner: js.Any = null
  ): ColumnResizingRefusedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (!js.isUndefined(desiredWidth)) __obj.updateDynamic("desiredWidth")(desiredWidth.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnResizingRefusedEventUIParam]
  }
}


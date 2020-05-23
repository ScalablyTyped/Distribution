package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnMovedEventUIParam extends js.Object {
  /**
    * Gets the column key of the column that was moved.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
    * Gets the new column index of the column that was being moved.
    */
  var newIndex: js.UndefOr[Double] = js.undefined
  /**
    * Gets the previous column index of the column that was moved.
    */
  var oldIndex: js.UndefOr[Double] = js.undefined
  /**
    * Gets a reference to the widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnMovedEventUIParam {
  @scala.inline
  def apply(
    columnKey: String = null,
    newIndex: js.UndefOr[Double] = js.undefined,
    oldIndex: js.UndefOr[Double] = js.undefined,
    owner: js.Any = null
  ): ColumnMovedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (!js.isUndefined(newIndex)) __obj.updateDynamic("newIndex")(newIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oldIndex)) __obj.updateDynamic("oldIndex")(oldIndex.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMovedEventUIParam]
  }
}


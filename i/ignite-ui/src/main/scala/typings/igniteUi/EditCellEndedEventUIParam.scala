package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditCellEndedEventUIParam extends js.Object {
  /**
    * Gets the index of the column.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
    * Gets the key of the column.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
    * Gets a reference to the editor used for editing the column.
    */
  var editor: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets the old value.
    */
  var oldValue: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
    * Check if the edit mode is for adding a new row.
    */
  var rowAdding: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets the row's PK value.
    */
  var rowID: js.UndefOr[js.Any] = js.undefined
  /**
    * Check if the value is changed which will cause update in the data source. Can be manually set to false to prevent this update.
    */
  var update: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets the new value.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object EditCellEndedEventUIParam {
  @scala.inline
  def apply(
    columnIndex: js.UndefOr[Double] = js.undefined,
    columnKey: String = null,
    editor: js.Any = null,
    oldValue: js.Any = null,
    owner: js.Any = null,
    rowAdding: js.UndefOr[Boolean] = js.undefined,
    rowID: js.Any = null,
    update: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): EditCellEndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(rowAdding)) __obj.updateDynamic("rowAdding")(rowAdding.get.asInstanceOf[js.Any])
    if (rowID != null) __obj.updateDynamic("rowID")(rowID.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCellEndedEventUIParam]
  }
}


package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditCellStartedEventUIParam extends js.Object {
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
  	 * Gets a reference to GridUpdating.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Checks if the edit mode is for adding a new row.
  	 */
  var rowAdding: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets the row's PK value.
  	 */
  var rowID: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or set the value of the editor.
  	 */
  var value: js.UndefOr[js.Any] = js.undefined
}

object EditCellStartedEventUIParam {
  @scala.inline
  def apply(
    columnIndex: Int | Double = null,
    columnKey: String = null,
    editor: js.Any = null,
    owner: js.Any = null,
    rowAdding: js.UndefOr[Boolean] = js.undefined,
    rowID: js.Any = null,
    value: js.Any = null
  ): EditCellStartedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(rowAdding)) __obj.updateDynamic("rowAdding")(rowAdding.asInstanceOf[js.Any])
    if (rowID != null) __obj.updateDynamic("rowID")(rowID.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCellStartedEventUIParam]
  }
}


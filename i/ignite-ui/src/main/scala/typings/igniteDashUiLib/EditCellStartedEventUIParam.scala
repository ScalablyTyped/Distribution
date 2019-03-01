package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditCellStartedEventUIParam extends js.Object {
  /**
  	 * Gets the index of the column.
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the key of the column.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
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
  var rowAdding: js.UndefOr[scala.Boolean] = js.undefined
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
    columnIndex: scala.Int | scala.Double = null,
    columnKey: java.lang.String = null,
    editor: js.Any = null,
    owner: js.Any = null,
    rowAdding: js.UndefOr[scala.Boolean] = js.undefined,
    rowID: js.Any = null,
    value: js.Any = null
  ): EditCellStartedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (!js.isUndefined(rowAdding)) __obj.updateDynamic("rowAdding")(rowAdding)
    if (rowID != null) __obj.updateDynamic("rowID")(rowID)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EditCellStartedEventUIParam]
  }
}


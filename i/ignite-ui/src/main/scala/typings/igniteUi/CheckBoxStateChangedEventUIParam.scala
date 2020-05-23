package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBoxStateChangedEventUIParam extends js.Object {
  /**
    * Gets reference to the grid the RowSelectors are initialized for.
    */
  var grid: js.UndefOr[js.Any] = js.undefined
  /**
    * Checks if the header check box is the one being clicked. In this case no row related args are passed.
    */
  var isHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets reference to the igGridRowSelectors.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the row the clicked row selector resides in.
    */
  var row: js.UndefOr[String] = js.undefined
  /**
    * Gets the index of the row the clicked row selector resides in.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /**
    * Gets the key of the row the clicked row selector resides in.
    */
  var rowKey: js.UndefOr[String] = js.undefined
  /**
    * Gets reference to the row selector cell.
    */
  var rowSelector: js.UndefOr[String] = js.undefined
  /**
    * Gets the state of the checkbox ("on","off").
    */
  var state: js.UndefOr[String] = js.undefined
}

object CheckBoxStateChangedEventUIParam {
  @scala.inline
  def apply(
    grid: js.Any = null,
    isHeader: js.UndefOr[Boolean] = js.undefined,
    owner: js.Any = null,
    row: String = null,
    rowIndex: js.UndefOr[Double] = js.undefined,
    rowKey: String = null,
    rowSelector: String = null,
    state: String = null
  ): CheckBoxStateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeader)) __obj.updateDynamic("isHeader")(isHeader.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (rowSelector != null) __obj.updateDynamic("rowSelector")(rowSelector.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxStateChangedEventUIParam]
  }
}


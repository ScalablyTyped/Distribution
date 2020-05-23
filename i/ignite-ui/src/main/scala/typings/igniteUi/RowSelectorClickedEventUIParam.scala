package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowSelectorClickedEventUIParam extends js.Object {
  /**
    * Gets reference to the fixed row the clicked row selector resides in(if there are fixed columns).
    */
  var fixedRow: js.UndefOr[String] = js.undefined
  /**
    * Gets a reference to the grid the RowSelectors are initialized for.
    */
  var grid: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets reference to RowSelectors.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets reference to the row the clicked row selector resides in.
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
    * Gets a reference to the row selector cell.
    */
  var rowSelector: js.UndefOr[String] = js.undefined
}

object RowSelectorClickedEventUIParam {
  @scala.inline
  def apply(
    fixedRow: String = null,
    grid: js.Any = null,
    owner: js.Any = null,
    row: String = null,
    rowIndex: js.UndefOr[Double] = js.undefined,
    rowKey: String = null,
    rowSelector: String = null
  ): RowSelectorClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fixedRow != null) __obj.updateDynamic("fixedRow")(fixedRow.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (rowSelector != null) __obj.updateDynamic("rowSelector")(rowSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectorClickedEventUIParam]
  }
}


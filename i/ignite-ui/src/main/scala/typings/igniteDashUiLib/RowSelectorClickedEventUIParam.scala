package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowSelectorClickedEventUIParam extends js.Object {
  /**
  	 * Gets reference to the fixed row the clicked row selector resides in(if there are fixed columns).
  	 */
  var fixedRow: js.UndefOr[java.lang.String] = js.undefined
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
  var row: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the index of the row the clicked row selector resides in.
  	 */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the key of the row the clicked row selector resides in.
  	 */
  var rowKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the row selector cell.
  	 */
  var rowSelector: js.UndefOr[java.lang.String] = js.undefined
}

object RowSelectorClickedEventUIParam {
  @scala.inline
  def apply(
    fixedRow: java.lang.String = null,
    grid: js.Any = null,
    owner: js.Any = null,
    row: java.lang.String = null,
    rowIndex: scala.Int | scala.Double = null,
    rowKey: java.lang.String = null,
    rowSelector: java.lang.String = null
  ): RowSelectorClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fixedRow != null) __obj.updateDynamic("fixedRow")(fixedRow)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (row != null) __obj.updateDynamic("row")(row)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey)
    if (rowSelector != null) __obj.updateDynamic("rowSelector")(rowSelector)
    __obj.asInstanceOf[RowSelectorClickedEventUIParam]
  }
}


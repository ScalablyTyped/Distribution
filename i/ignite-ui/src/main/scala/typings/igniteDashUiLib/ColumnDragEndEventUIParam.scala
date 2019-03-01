package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDragEndEventUIParam extends js.Object {
  /**
  	 * Gets the column index of the column that was being dragged.
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the column key of the column that was being dragged.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the orginal th that was being dragged.
  	 */
  var header: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to cloned DOM element that was actually being dragged.
  	 */
  var helper: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the widget.
  	 */
  var owner: js.UndefOr[java.lang.String] = js.undefined
}

object ColumnDragEndEventUIParam {
  @scala.inline
  def apply(
    columnIndex: scala.Int | scala.Double = null,
    columnKey: java.lang.String = null,
    header: java.lang.String = null,
    helper: java.lang.String = null,
    owner: java.lang.String = null
  ): ColumnDragEndEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (header != null) __obj.updateDynamic("header")(header)
    if (helper != null) __obj.updateDynamic("helper")(helper)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ColumnDragEndEventUIParam]
  }
}


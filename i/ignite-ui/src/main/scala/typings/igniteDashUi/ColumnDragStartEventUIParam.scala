package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDragStartEventUIParam extends js.Object {
  /**
  	 * Gets the column index of the column being dragged.
  	 */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the column key of the column being dragged.
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the orginal th being dragged.
  	 */
  var header: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to cloned DOM element that's actually being dragged.
  	 */
  var helper: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the widget.
  	 */
  var owner: js.UndefOr[String] = js.undefined
}

object ColumnDragStartEventUIParam {
  @scala.inline
  def apply(
    columnIndex: Int | Double = null,
    columnKey: String = null,
    header: String = null,
    helper: String = null,
    owner: String = null
  ): ColumnDragStartEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (header != null) __obj.updateDynamic("header")(header)
    if (helper != null) __obj.updateDynamic("helper")(helper)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ColumnDragStartEventUIParam]
  }
}


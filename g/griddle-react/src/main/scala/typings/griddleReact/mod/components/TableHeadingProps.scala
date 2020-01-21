package typings.griddleReact.mod.components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeadingProps extends js.Object {
  var TableHeadingCell: js.Any
  var columnIds: js.UndefOr[js.Array[Double]] = js.undefined
  var columnTitles: js.UndefOr[js.Array[String]] = js.undefined
}

object TableHeadingProps {
  @scala.inline
  def apply(
    TableHeadingCell: js.Any,
    columnIds: js.Array[Double] = null,
    columnTitles: js.Array[String] = null
  ): TableHeadingProps = {
    val __obj = js.Dynamic.literal(TableHeadingCell = TableHeadingCell.asInstanceOf[js.Any])
    if (columnIds != null) __obj.updateDynamic("columnIds")(columnIds.asInstanceOf[js.Any])
    if (columnTitles != null) __obj.updateDynamic("columnTitles")(columnTitles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeadingProps]
  }
}


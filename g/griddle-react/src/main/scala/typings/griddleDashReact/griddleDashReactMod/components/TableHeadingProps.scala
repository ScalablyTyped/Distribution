package typings.griddleDashReact.griddleDashReactMod.components

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
    val __obj = js.Dynamic.literal(TableHeadingCell = TableHeadingCell)
    if (columnIds != null) __obj.updateDynamic("columnIds")(columnIds)
    if (columnTitles != null) __obj.updateDynamic("columnTitles")(columnTitles)
    __obj.asInstanceOf[TableHeadingProps]
  }
}


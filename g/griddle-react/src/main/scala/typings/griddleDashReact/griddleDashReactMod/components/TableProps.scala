package typings.griddleDashReact.griddleDashReactMod.components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends js.Object {
  var NoResults: js.UndefOr[js.Any] = js.undefined
  var TableBody: js.UndefOr[js.Any] = js.undefined
  var TableHeading: js.UndefOr[js.Any] = js.undefined
  var visibleRows: js.UndefOr[Double] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    NoResults: js.Any = null,
    TableBody: js.Any = null,
    TableHeading: js.Any = null,
    visibleRows: Int | Double = null
  ): TableProps = {
    val __obj = js.Dynamic.literal()
    if (NoResults != null) __obj.updateDynamic("NoResults")(NoResults.asInstanceOf[js.Any])
    if (TableBody != null) __obj.updateDynamic("TableBody")(TableBody.asInstanceOf[js.Any])
    if (TableHeading != null) __obj.updateDynamic("TableHeading")(TableHeading.asInstanceOf[js.Any])
    if (visibleRows != null) __obj.updateDynamic("visibleRows")(visibleRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
}


package typings.grommet.dataTableMod

import typings.grommet.anon.Aggregate
import typings.grommet.grommetStrings.avg
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.max
import typings.grommet.grommetStrings.middle
import typings.grommet.grommetStrings.min
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.sum
import typings.grommet.grommetStrings.top
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnConfig[TRowType] extends js.Object {
  var aggregate: js.UndefOr[avg | max | min | sum] = js.undefined
  var align: js.UndefOr[center | start | end] = js.undefined
  var footer: js.UndefOr[ReactNode | Aggregate] = js.undefined
  var header: js.UndefOr[String | ReactNode | Aggregate] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var property: String
  var render: js.UndefOr[js.Function1[/* datum */ TRowType, ReactNode]] = js.undefined
  var search: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[ColumnSizeType | String] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
  var verticalAlign: js.UndefOr[middle | top | bottom] = js.undefined
}

object ColumnConfig {
  @scala.inline
  def apply[TRowType](
    property: String,
    aggregate: avg | max | min | sum = null,
    align: center | start | end = null,
    footer: ReactNode | Aggregate = null,
    header: String | ReactNode | Aggregate = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    render: /* datum */ TRowType => ReactNode = null,
    search: js.UndefOr[Boolean] = js.undefined,
    size: ColumnSizeType | String = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: middle | top | bottom = null
  ): ColumnConfig[TRowType] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.get.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.get.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnConfig[TRowType]]
  }
}


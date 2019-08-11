package typings.grommet.componentsDataTableMod

import typings.grommet.Anon_AggregateAlign
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var columns: js.UndefOr[js.Array[Anon_AggregateAlign]] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var groupBy: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var onMore: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var primaryKey: js.UndefOr[String] = js.undefined
  var resizeable: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object DataTableProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    columns: js.Array[Anon_AggregateAlign] = null,
    data: js.Array[js.Object] = null,
    gridArea: GridAreaType = null,
    groupBy: String = null,
    margin: MarginType = null,
    onMore: /* repeated */ js.Any => _ = null,
    onSearch: /* repeated */ js.Any => _ = null,
    primaryKey: String = null,
    resizeable: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | String = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null
  ): DataTableProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (data != null) __obj.updateDynamic("data")(data)
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onMore != null) __obj.updateDynamic("onMore")(js.Any.fromFunction1(onMore))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (!js.isUndefined(resizeable)) __obj.updateDynamic("resizeable")(resizeable)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableProps]
  }
}


package typings.grommet.dataTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.grommet.anon.Background
import typings.grommet.anon.Direction
import typings.grommet.anon.Expand
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.BorderType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableProps[TRowType] extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  // Appearance
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var background: js.UndefOr[
    BackgroundType | (Sections[BackgroundType | js.Array[String], BackgroundType, BackgroundType])
  ] = js.undefined
  var border: js.UndefOr[BorderType | (Sections[BorderType, BorderType, BorderType])] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnConfig[TRowType]]] = js.undefined
  // Data
  var data: js.UndefOr[js.Array[TRowType]] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var groupBy: js.UndefOr[String | Expand] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  // Events
  var onClickRow: js.UndefOr[js.Function1[/* event */ MouseClick[TRowType] | KeyPress[TRowType], Unit]] = js.undefined
  var onMore: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* search */ String, Unit]] = js.undefined
  var onSort: js.UndefOr[js.Function1[/* sort */ Direction, Unit]] = js.undefined
  var pad: js.UndefOr[PadType | (Sections[PadType, PadType, PadType])] = js.undefined
  var primaryKey: js.UndefOr[String | Boolean] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var resizeable: js.UndefOr[Boolean] = js.undefined
  var rowProps: js.UndefOr[StringDictionary[Background]] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var sort: js.UndefOr[Direction] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object DataTableProps {
  @scala.inline
  def apply[TRowType](
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    background: BackgroundType | (Sections[BackgroundType | js.Array[String], BackgroundType, BackgroundType]) = null,
    border: BorderType | (Sections[BorderType, BorderType, BorderType]) = null,
    columns: js.Array[ColumnConfig[TRowType]] = null,
    data: js.Array[TRowType] = null,
    gridArea: GridAreaType = null,
    groupBy: String | Expand = null,
    margin: MarginType = null,
    onClickRow: /* event */ MouseClick[TRowType] | KeyPress[TRowType] => Unit = null,
    onMore: () => Unit = null,
    onSearch: /* search */ String => Unit = null,
    onSort: /* sort */ Direction => Unit = null,
    pad: PadType | (Sections[PadType, PadType, PadType]) = null,
    primaryKey: String | Boolean = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    resizeable: js.UndefOr[Boolean] = js.undefined,
    rowProps: StringDictionary[Background] = null,
    size: small | medium | large | xlarge | String = null,
    sort: Direction = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Double] = js.undefined
  ): DataTableProps[TRowType] = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClickRow != null) __obj.updateDynamic("onClickRow")(js.Any.fromFunction1(onClickRow))
    if (onMore != null) __obj.updateDynamic("onMore")(js.Any.fromFunction0(onMore))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1(onSort))
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeable)) __obj.updateDynamic("resizeable")(resizeable.get.asInstanceOf[js.Any])
    if (rowProps != null) __obj.updateDynamic("rowProps")(rowProps.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableProps[TRowType]]
  }
}


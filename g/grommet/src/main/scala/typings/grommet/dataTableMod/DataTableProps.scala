package typings.grommet.dataTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.grommet.AnonAggregateAlign
import typings.grommet.AnonAllBody
import typings.grommet.AnonArgsExpand
import typings.grommet.AnonBackground
import typings.grommet.AnonBody
import typings.grommet.AnonBodyBottom
import typings.grommet.AnonDatum
import typings.grommet.grommetStrings.all
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.top
import typings.grommet.grommetStrings.vertical
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var background: js.UndefOr[String | AnonBody] = js.undefined
  var border: js.UndefOr[
    Boolean | top | left | bottom | right | horizontal | vertical | all | AnonAllBody
  ] = js.undefined
  var columns: js.UndefOr[js.Array[AnonAggregateAlign]] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var groupBy: js.UndefOr[String | AnonArgsExpand] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var onClickRow: js.UndefOr[
    js.Function1[
      (/* event */ AnonDatum) | (/* event */ MouseEvent[Element, NativeMouseEvent]), 
      Unit
    ]
  ] = js.undefined
  var onMore: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* search */ String, Unit]] = js.undefined
  var pad: js.UndefOr[
    none | xxsmall | xsmall | small | medium | large | xlarge | AnonBodyBottom | String
  ] = js.undefined
  var primaryKey: js.UndefOr[String] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var resizeable: js.UndefOr[Boolean] = js.undefined
  var rowProps: js.UndefOr[StringDictionary[AnonBackground]] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object DataTableProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    background: String | AnonBody = null,
    border: Boolean | top | left | bottom | right | horizontal | vertical | all | AnonAllBody = null,
    columns: js.Array[AnonAggregateAlign] = null,
    data: js.Array[js.Object] = null,
    gridArea: GridAreaType = null,
    groupBy: String | AnonArgsExpand = null,
    margin: MarginType = null,
    onClickRow: (/* event */ AnonDatum) | (/* event */ MouseEvent[Element, NativeMouseEvent]) => Unit = null,
    onMore: /* repeated */ js.Any => _ = null,
    onSearch: /* search */ String => Unit = null,
    pad: none | xxsmall | xsmall | small | medium | large | xlarge | AnonBodyBottom | String = null,
    primaryKey: String = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    resizeable: js.UndefOr[Boolean] = js.undefined,
    rowProps: StringDictionary[AnonBackground] = null,
    size: small | medium | large | xlarge | String = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null
  ): DataTableProps = {
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
    if (onMore != null) __obj.updateDynamic("onMore")(js.Any.fromFunction1(onMore))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeable)) __obj.updateDynamic("resizeable")(resizeable.asInstanceOf[js.Any])
    if (rowProps != null) __obj.updateDynamic("rowProps")(rowProps.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableProps]
  }
}


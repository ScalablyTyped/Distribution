package typings.grommet.dataChartMod

import typings.grommet.anon.Column
import typings.grommet.anon.Guide
import typings.grommet.anon.Height
import typings.grommet.anon.Labels
import typings.grommet.grommetStrings.fill
import typings.grommet.grommetStrings.full
import typings.grommet.grommetStrings.hair
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.GapType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataChartProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var chart: ChartType | js.Array[ChartType]
  var data: js.Array[js.Object]
  var gap: js.UndefOr[GapType | Column] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
  var size: js.UndefOr[
    xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String
  ] = js.undefined
  var thickness: js.UndefOr[hair | xsmall | small | medium | large | xlarge | none | String] = js.undefined
  var xAxis: js.UndefOr[Boolean | Guide] = js.undefined
  var yAxis: js.UndefOr[Boolean | Labels] = js.undefined
}

object DataChartProps {
  @scala.inline
  def apply(
    chart: ChartType | js.Array[ChartType],
    data: js.Array[js.Object],
    a11yTitle: A11yTitleType = null,
    gap: GapType | Column = null,
    gridArea: GridAreaType = null,
    margin: MarginType = null,
    pad: PadType = null,
    size: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String = null,
    thickness: hair | xsmall | small | medium | large | xlarge | none | String = null,
    xAxis: Boolean | Guide = null,
    yAxis: Boolean | Labels = null
  ): DataChartProps = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataChartProps]
  }
}


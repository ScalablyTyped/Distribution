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

@js.native
trait DataChartProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  var chart: ChartType | js.Array[ChartType] = js.native
  var data: js.Array[js.Object] = js.native
  var gap: js.UndefOr[GapType | Column] = js.native
  var gridArea: js.UndefOr[GridAreaType] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  var pad: js.UndefOr[PadType] = js.native
  var size: js.UndefOr[
    xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String
  ] = js.native
  var thickness: js.UndefOr[hair | xsmall | small | medium | large | xlarge | none | String] = js.native
  var xAxis: js.UndefOr[Boolean | Guide] = js.native
  var yAxis: js.UndefOr[Boolean | Labels] = js.native
}

object DataChartProps {
  @scala.inline
  def apply(chart: ChartType | js.Array[ChartType], data: js.Array[js.Object]): DataChartProps = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataChartProps]
  }
  @scala.inline
  implicit class DataChartPropsOps[Self <: DataChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChartVarargs(value: ChartType*): Self = this.set("chart", js.Array(value :_*))
    @scala.inline
    def setChart(value: ChartType | js.Array[ChartType]): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setA11yTitle(value: A11yTitleType): Self = this.set("a11yTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA11yTitle: Self = this.set("a11yTitle", js.undefined)
    @scala.inline
    def setGap(value: GapType | Column): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setPad(value: PadType): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    @scala.inline
    def setSize(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setThickness(value: hair | xsmall | small | medium | large | xlarge | none | String): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    @scala.inline
    def setXAxis(value: Boolean | Guide): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    @scala.inline
    def setYAxis(value: Boolean | Labels): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
  }
  
}


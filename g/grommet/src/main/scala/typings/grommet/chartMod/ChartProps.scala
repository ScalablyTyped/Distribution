package typings.grommet.chartMod

import typings.grommet.anon.Color
import typings.grommet.anon.Height
import typings.grommet.anon.Label
import typings.grommet.anon.Value
import typings.grommet.anon.Vertical
import typings.grommet.grommetStrings.area
import typings.grommet.grommetStrings.bar
import typings.grommet.grommetStrings.fill
import typings.grommet.grommetStrings.full
import typings.grommet.grommetStrings.hair
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.line
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.point
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.EdgeSizeType
import typings.grommet.utilsMod.GapType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  var bounds: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var color: js.UndefOr[String | Color | js.Array[Value]] = js.native
  var dash: js.UndefOr[Boolean] = js.native
  var gap: js.UndefOr[GapType] = js.native
  var gridArea: js.UndefOr[GridAreaType] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var overflow: js.UndefOr[Boolean] = js.native
  var pad: js.UndefOr[EdgeSizeType | Vertical] = js.native
  var round: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[
    xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String
  ] = js.native
  var thickness: js.UndefOr[hair | xsmall | small | medium | large | xlarge | none | String] = js.native
  var `type`: js.UndefOr[bar | line | area | point] = js.native
  var values: js.Array[Double | js.Array[Double] | Label] = js.native
}

object ChartProps {
  @scala.inline
  def apply(values: js.Array[Double | js.Array[Double] | Label]): ChartProps = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps]
  }
  @scala.inline
  implicit class ChartPropsOps[Self <: ChartProps] (val x: Self) extends AnyVal {
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
    def setValuesVarargs(value: (Double | js.Array[Double] | Label)*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Double | js.Array[Double] | Label]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setA11yTitle(value: A11yTitleType): Self = this.set("a11yTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA11yTitle: Self = this.set("a11yTitle", js.undefined)
    @scala.inline
    def setAlignSelf(value: AlignSelfType): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setBoundsVarargs(value: js.Array[Double]*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: js.Array[js.Array[Double]]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setColorVarargs(value: Value*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: String | Color | js.Array[Value]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDash(value: Boolean): Self = this.set("dash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDash: Self = this.set("dash", js.undefined)
    @scala.inline
    def setGap(value: GapType): Self = this.set("gap", value.asInstanceOf[js.Any])
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
    def setOnClick(value: /* repeated */ js.Any => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnHover(value: /* repeated */ js.Any => _): Self = this.set("onHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    @scala.inline
    def setOverflow(value: Boolean): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setPad(value: EdgeSizeType | Vertical): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setSize(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setThickness(value: hair | xsmall | small | medium | large | xlarge | none | String): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    @scala.inline
    def setType(value: bar | line | area | point): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


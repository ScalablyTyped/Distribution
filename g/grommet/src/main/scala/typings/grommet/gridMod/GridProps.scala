package typings.grommet.gridMod

import typings.grommet.anon.Column
import typings.grommet.anon.Count
import typings.grommet.anon.End
import typings.grommet.grommetStrings.`1Slash2`
import typings.grommet.grommetStrings.`1Slash3`
import typings.grommet.grommetStrings.`1Slash4`
import typings.grommet.grommetStrings.`2Slash3`
import typings.grommet.grommetStrings.`2Slash4`
import typings.grommet.grommetStrings.`3Slash4`
import typings.grommet.grommetStrings.auto
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.flex
import typings.grommet.grommetStrings.full
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.stretch
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignContentType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.FillType
import typings.grommet.utilsMod.GapType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.JustifyContentType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PadType
import typings.grommet.utilsMod.PolymorphicType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  var align: js.UndefOr[start | center | end | stretch] = js.native
  var alignContent: js.UndefOr[AlignContentType] = js.native
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  var areas: js.UndefOr[js.Array[js.Array[String] | End]] = js.native
  var as: js.UndefOr[PolymorphicType] = js.native
  var columns: js.UndefOr[
    (js.Array[
      xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
    ]) | xsmall | small | medium | large | xlarge | Count | String
  ] = js.native
  var fill: js.UndefOr[FillType] = js.native
  var gap: js.UndefOr[GapType | Column] = js.native
  var gridArea: js.UndefOr[GridAreaType] = js.native
  var justify: js.UndefOr[start | center | end | stretch] = js.native
  var justifyContent: js.UndefOr[JustifyContentType] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  var pad: js.UndefOr[PadType] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var rows: js.UndefOr[
    (js.Array[
      xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
    ]) | xsmall | small | medium | large | xlarge | String
  ] = js.native
  var tag: js.UndefOr[PolymorphicType] = js.native
}

object GridProps {
  @scala.inline
  def apply(): GridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps]
  }
  @scala.inline
  implicit class GridPropsOps[Self <: GridProps] (val x: Self) extends AnyVal {
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
    def setA11yTitle(value: A11yTitleType): Self = this.set("a11yTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA11yTitle: Self = this.set("a11yTitle", js.undefined)
    @scala.inline
    def setAlign(value: start | center | end | stretch): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAlignContent(value: AlignContentType): Self = this.set("alignContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignContent: Self = this.set("alignContent", js.undefined)
    @scala.inline
    def setAlignSelf(value: AlignSelfType): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setAreasVarargs(value: (js.Array[String] | End)*): Self = this.set("areas", js.Array(value :_*))
    @scala.inline
    def setAreas(value: js.Array[js.Array[String] | End]): Self = this.set("areas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreas: Self = this.set("areas", js.undefined)
    @scala.inline
    def setAs(value: PolymorphicType): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setColumnsVarargs(
      value: (xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String])*
    ): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(
      value: (js.Array[
          xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
        ]) | xsmall | small | medium | large | xlarge | Count | String
    ): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setFill(value: FillType): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setGap(value: GapType | Column): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    @scala.inline
    def setJustify(value: start | center | end | stretch): Self = this.set("justify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustify: Self = this.set("justify", js.undefined)
    @scala.inline
    def setJustifyContent(value: JustifyContentType): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustifyContent: Self = this.set("justifyContent", js.undefined)
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setPad(value: PadType): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setRowsVarargs(
      value: (xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String])*
    ): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(
      value: (js.Array[
          xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
        ]) | xsmall | small | medium | large | xlarge | String
    ): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setTag(value: PolymorphicType): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}


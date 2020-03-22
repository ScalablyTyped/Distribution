package typings.grommet.gridMod

import typings.grommet.AnonColumn
import typings.grommet.AnonCount
import typings.grommet.AnonEnd
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

trait GridProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var align: js.UndefOr[start | center | end | stretch] = js.undefined
  var alignContent: js.UndefOr[AlignContentType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var areas: js.UndefOr[js.Array[AnonEnd | js.Array[String]]] = js.undefined
  var as: js.UndefOr[PolymorphicType] = js.undefined
  var columns: js.UndefOr[
    (js.Array[
      xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
    ]) | xsmall | small | medium | large | xlarge | AnonCount | String
  ] = js.undefined
  var fill: js.UndefOr[FillType] = js.undefined
  var gap: js.UndefOr[GapType | AnonColumn] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var justify: js.UndefOr[start | center | end | stretch] = js.undefined
  var justifyContent: js.UndefOr[JustifyContentType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
  var rows: js.UndefOr[
    (js.Array[
      xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
    ]) | xsmall | small | medium | large | xlarge | String
  ] = js.undefined
  var tag: js.UndefOr[PolymorphicType] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    align: start | center | end | stretch = null,
    alignContent: AlignContentType = null,
    alignSelf: AlignSelfType = null,
    areas: js.Array[AnonEnd | js.Array[String]] = null,
    as: PolymorphicType = null,
    columns: (js.Array[
      xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
    ]) | xsmall | small | medium | large | xlarge | AnonCount | String = null,
    fill: FillType = null,
    gap: GapType | AnonColumn = null,
    gridArea: GridAreaType = null,
    justify: start | center | end | stretch = null,
    justifyContent: JustifyContentType = null,
    margin: MarginType = null,
    pad: PadType = null,
    rows: (js.Array[
      xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
    ]) | xsmall | small | medium | large | xlarge | String = null,
    tag: PolymorphicType = null
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (areas != null) __obj.updateDynamic("areas")(areas.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
}


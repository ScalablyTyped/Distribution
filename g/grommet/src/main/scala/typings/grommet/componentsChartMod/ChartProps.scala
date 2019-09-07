package typings.grommet.componentsChartMod

import typings.grommet.Anon_Args
import typings.grommet.Anon_Color
import typings.grommet.Anon_Full
import typings.grommet.grommetStrings.area
import typings.grommet.grommetStrings.bar
import typings.grommet.grommetStrings.full
import typings.grommet.grommetStrings.hair
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.line
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var bounds: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var color: js.UndefOr[String | Anon_Color] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var overflow: js.UndefOr[Boolean] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | full | Anon_Full | String] = js.undefined
  var thickness: js.UndefOr[hair | xsmall | small | medium | large | xlarge | none | String] = js.undefined
  var `type`: js.UndefOr[bar | line | area] = js.undefined
  var values: js.Array[Double | js.Array[Double] | Anon_Args]
}

object ChartProps {
  @scala.inline
  def apply(
    values: js.Array[Double | js.Array[Double] | Anon_Args],
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    bounds: js.Array[js.Array[Double]] = null,
    color: String | Anon_Color = null,
    gridArea: GridAreaType = null,
    margin: MarginType = null,
    onClick: /* repeated */ js.Any => _ = null,
    onHover: /* repeated */ js.Any => _ = null,
    overflow: js.UndefOr[Boolean] = js.undefined,
    round: js.UndefOr[Boolean] = js.undefined,
    size: xxsmall | xsmall | small | medium | large | xlarge | full | Anon_Full | String = null,
    thickness: hair | xsmall | small | medium | large | xlarge | none | String = null,
    `type`: bar | line | area = null
  ): ChartProps = {
    val __obj = js.Dynamic.literal(values = values)
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow)
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps]
  }
}


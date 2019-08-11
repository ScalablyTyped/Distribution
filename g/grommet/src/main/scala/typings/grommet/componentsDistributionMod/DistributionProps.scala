package typings.grommet.componentsDistributionMod

import typings.grommet.Anon_ColorValue
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var children: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var gap: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var values: js.Array[Anon_ColorValue]
}

object DistributionProps {
  @scala.inline
  def apply(
    values: js.Array[Anon_ColorValue],
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    children: /* repeated */ js.Any => _ = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    gap: xsmall | small | medium | large | xlarge | String = null,
    gridArea: GridAreaType = null,
    margin: MarginType = null
  ): DistributionProps = {
    val __obj = js.Dynamic.literal(values = values)
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionProps]
  }
}


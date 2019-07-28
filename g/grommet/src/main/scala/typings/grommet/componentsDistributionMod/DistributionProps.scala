package typings.grommet.componentsDistributionMod

import typings.grommet.Anon_Bottom
import typings.grommet.Anon_ColorValue
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.stretch
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionProps extends js.Object {
  var a11yTitle: js.UndefOr[String] = js.undefined
  var alignSelf: js.UndefOr[start | center | end | stretch] = js.undefined
  var children: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var gap: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
  var gridArea: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String] = js.undefined
  var values: js.Array[Anon_ColorValue]
}

object DistributionProps {
  @scala.inline
  def apply(
    values: js.Array[Anon_ColorValue],
    a11yTitle: String = null,
    alignSelf: start | center | end | stretch = null,
    children: /* repeated */ js.Any => _ = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    gap: xsmall | small | medium | large | xlarge | String = null,
    gridArea: String = null,
    margin: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String = null
  ): DistributionProps = {
    val __obj = js.Dynamic.literal(values = values)
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionProps]
  }
}


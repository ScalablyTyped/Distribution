package typings.grommet.componentsMeterMod

import typings.grommet.Anon_ArgsColor
import typings.grommet.Anon_Bottom
import typings.grommet.Anon_ColorMedium
import typings.grommet.grommetStrings.bar
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.circle
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.full
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

trait MeterProps extends js.Object {
  var a11yTitle: js.UndefOr[String] = js.undefined
  var alignSelf: js.UndefOr[start | center | end | stretch] = js.undefined
  var background: js.UndefOr[String | Anon_ColorMedium] = js.undefined
  var gridArea: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | full | String] = js.undefined
  var thickness: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
  var `type`: js.UndefOr[bar | circle] = js.undefined
  var values: js.UndefOr[js.Array[Anon_ArgsColor]] = js.undefined
}

object MeterProps {
  @scala.inline
  def apply(
    a11yTitle: String = null,
    alignSelf: start | center | end | stretch = null,
    background: String | Anon_ColorMedium = null,
    gridArea: String = null,
    margin: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String = null,
    round: js.UndefOr[Boolean] = js.undefined,
    size: xsmall | small | medium | large | xlarge | full | String = null,
    thickness: xsmall | small | medium | large | xlarge | String = null,
    `type`: bar | circle = null,
    values: js.Array[Anon_ArgsColor] = null
  ): MeterProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[MeterProps]
  }
}


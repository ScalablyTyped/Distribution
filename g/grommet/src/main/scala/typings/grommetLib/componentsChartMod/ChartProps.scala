package typings
package grommetLib.componentsChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartProps extends js.Object {
  var a11yTitle: js.UndefOr[java.lang.String] = js.undefined
  var alignSelf: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var bounds: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  var color: js.UndefOr[java.lang.String | grommetLib.Anon_ColorMedium] = js.undefined
  var gridArea: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String
  ] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var overflow: js.UndefOr[scala.Boolean] = js.undefined
  var round: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.full | grommetLib.Anon_Full | java.lang.String
  ] = js.undefined
  var thickness: js.UndefOr[
    grommetLib.grommetLibStrings.hair | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.none | java.lang.String
  ] = js.undefined
  var `type`: js.UndefOr[
    grommetLib.grommetLibStrings.bar | grommetLib.grommetLibStrings.line | grommetLib.grommetLibStrings.area
  ] = js.undefined
  var values: js.Array[scala.Double | js.Array[scala.Double] | grommetLib.Anon_Args]
}

object ChartProps {
  @scala.inline
  def apply(
    values: js.Array[scala.Double | js.Array[scala.Double] | grommetLib.Anon_Args],
    a11yTitle: java.lang.String = null,
    alignSelf: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    bounds: js.Array[js.Array[scala.Double]] = null,
    color: java.lang.String | grommetLib.Anon_ColorMedium = null,
    gridArea: java.lang.String = null,
    margin: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String = null,
    onClick: js.Function1[/* repeated */ js.Any, _] = null,
    onHover: js.Function1[/* repeated */ js.Any, _] = null,
    overflow: js.UndefOr[scala.Boolean] = js.undefined,
    round: js.UndefOr[scala.Boolean] = js.undefined,
    size: grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.full | grommetLib.Anon_Full | java.lang.String = null,
    thickness: grommetLib.grommetLibStrings.hair | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.none | java.lang.String = null,
    `type`: grommetLib.grommetLibStrings.bar | grommetLib.grommetLibStrings.line | grommetLib.grommetLibStrings.area = null
  ): ChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("values")(values)
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onHover != null) __obj.updateDynamic("onHover")(onHover)
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow)
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps]
  }
}


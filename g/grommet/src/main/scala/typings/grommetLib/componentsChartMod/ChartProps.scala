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
  var color: js.UndefOr[java.lang.String | grommetLib.Anon_Opacity] = js.undefined
  var gridArea: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String
  ] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */js.Any, _]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* repeated */js.Any, _]] = js.undefined
  var overflow: js.UndefOr[scala.Boolean] = js.undefined
  var round: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.full | grommetLib.Anon_Height | java.lang.String
  ] = js.undefined
  var thickness: js.UndefOr[
    grommetLib.grommetLibStrings.hair | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.none | java.lang.String
  ] = js.undefined
  var `type`: js.UndefOr[
    grommetLib.grommetLibStrings.bar | grommetLib.grommetLibStrings.line | grommetLib.grommetLibStrings.area
  ] = js.undefined
  var values: scala.Double | js.Array[scala.Double] | js.Array[grommetLib.Anon_OnClickArgs]
}


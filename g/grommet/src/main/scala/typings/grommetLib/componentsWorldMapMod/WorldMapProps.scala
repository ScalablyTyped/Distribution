package typings
package grommetLib.componentsWorldMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldMapProps extends js.Object {
  var a11yTitle: js.UndefOr[java.lang.String] = js.undefined
  var alignSelf: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var color: js.UndefOr[java.lang.String | grommetLib.Anon_Dark] = js.undefined
  var continents: js.UndefOr[js.Array[grommetLib.Anon_Africa]] = js.undefined
  var gridArea: js.UndefOr[java.lang.String] = js.undefined
  var hoverColor: js.UndefOr[java.lang.String | grommetLib.Anon_Dark] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String
  ] = js.undefined
  var onSelectPlace: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var places: js.UndefOr[js.Array[grommetLib.Anon_ArgsColorLocation]] = js.undefined
}


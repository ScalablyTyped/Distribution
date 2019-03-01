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

object WorldMapProps {
  @scala.inline
  def apply(
    a11yTitle: java.lang.String = null,
    alignSelf: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    color: java.lang.String | grommetLib.Anon_Dark = null,
    continents: js.Array[grommetLib.Anon_Africa] = null,
    gridArea: java.lang.String = null,
    hoverColor: java.lang.String | grommetLib.Anon_Dark = null,
    margin: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String = null,
    onSelectPlace: js.Function1[/* repeated */ js.Any, _] = null,
    places: js.Array[grommetLib.Anon_ArgsColorLocation] = null
  ): WorldMapProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (continents != null) __obj.updateDynamic("continents")(continents)
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onSelectPlace != null) __obj.updateDynamic("onSelectPlace")(onSelectPlace)
    if (places != null) __obj.updateDynamic("places")(places)
    __obj.asInstanceOf[WorldMapProps]
  }
}


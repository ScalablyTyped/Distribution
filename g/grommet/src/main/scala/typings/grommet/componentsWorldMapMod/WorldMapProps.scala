package typings.grommet.componentsWorldMapMod

import typings.grommet.Anon_Africa
import typings.grommet.Anon_ArgsColorLocation
import typings.grommet.Anon_Bottom
import typings.grommet.Anon_Dark
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

trait WorldMapProps extends js.Object {
  var a11yTitle: js.UndefOr[String] = js.undefined
  var alignSelf: js.UndefOr[start | center | end | stretch] = js.undefined
  var color: js.UndefOr[String | Anon_Dark] = js.undefined
  var continents: js.UndefOr[js.Array[Anon_Africa]] = js.undefined
  var gridArea: js.UndefOr[String] = js.undefined
  var hoverColor: js.UndefOr[String | Anon_Dark] = js.undefined
  var margin: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String] = js.undefined
  var onSelectPlace: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var places: js.UndefOr[js.Array[Anon_ArgsColorLocation]] = js.undefined
}

object WorldMapProps {
  @scala.inline
  def apply(
    a11yTitle: String = null,
    alignSelf: start | center | end | stretch = null,
    color: String | Anon_Dark = null,
    continents: js.Array[Anon_Africa] = null,
    gridArea: String = null,
    hoverColor: String | Anon_Dark = null,
    margin: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String = null,
    onSelectPlace: /* repeated */ js.Any => _ = null,
    places: js.Array[Anon_ArgsColorLocation] = null
  ): WorldMapProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (continents != null) __obj.updateDynamic("continents")(continents)
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onSelectPlace != null) __obj.updateDynamic("onSelectPlace")(js.Any.fromFunction1(onSelectPlace))
    if (places != null) __obj.updateDynamic("places")(places)
    __obj.asInstanceOf[WorldMapProps]
  }
}


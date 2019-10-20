package typings.grommet.componentsWorldMapMod

import typings.grommet.Anon_Africa
import typings.grommet.Anon_ArgsColorLocation
import typings.grommet.Anon_Dark
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.FillType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldMapProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var continents: js.UndefOr[js.Array[Anon_Africa]] = js.undefined
  var fill: js.UndefOr[FillType] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var hoverColor: js.UndefOr[String | Anon_Dark] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var onSelectPlace: js.UndefOr[js.Function1[/* place */ js.Array[Double], Unit]] = js.undefined
  var places: js.UndefOr[js.Array[Anon_ArgsColorLocation]] = js.undefined
}

object WorldMapProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    color: ColorType = null,
    continents: js.Array[Anon_Africa] = null,
    fill: FillType = null,
    gridArea: GridAreaType = null,
    hoverColor: String | Anon_Dark = null,
    margin: MarginType = null,
    onSelectPlace: /* place */ js.Array[Double] => Unit = null,
    places: js.Array[Anon_ArgsColorLocation] = null
  ): WorldMapProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (continents != null) __obj.updateDynamic("continents")(continents)
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onSelectPlace != null) __obj.updateDynamic("onSelectPlace")(js.Any.fromFunction1(onSelectPlace))
    if (places != null) __obj.updateDynamic("places")(places)
    __obj.asInstanceOf[WorldMapProps]
  }
}


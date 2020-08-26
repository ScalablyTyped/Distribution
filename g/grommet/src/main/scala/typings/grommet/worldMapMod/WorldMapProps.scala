package typings.grommet.worldMapMod

import typings.grommet.anon.Dark
import typings.grommet.anon.Location
import typings.grommet.anon.Name
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.FillType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorldMapProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  var color: js.UndefOr[ColorType] = js.native
  var continents: js.UndefOr[js.Array[Name]] = js.native
  var fill: js.UndefOr[FillType] = js.native
  var gridArea: js.UndefOr[GridAreaType] = js.native
  var hoverColor: js.UndefOr[String | Dark] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  var onSelectPlace: js.UndefOr[js.Function1[/* place */ js.Array[Double], Unit]] = js.native
  var places: js.UndefOr[js.Array[Location]] = js.native
}

object WorldMapProps {
  @scala.inline
  def apply(): WorldMapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldMapProps]
  }
  @scala.inline
  implicit class WorldMapPropsOps[Self <: WorldMapProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setA11yTitle(value: A11yTitleType): Self = this.set("a11yTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA11yTitle: Self = this.set("a11yTitle", js.undefined)
    @scala.inline
    def setAlignSelf(value: AlignSelfType): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setColor(value: ColorType): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setContinentsVarargs(value: Name*): Self = this.set("continents", js.Array(value :_*))
    @scala.inline
    def setContinents(value: js.Array[Name]): Self = this.set("continents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinents: Self = this.set("continents", js.undefined)
    @scala.inline
    def setFill(value: FillType): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    @scala.inline
    def setHoverColor(value: String | Dark): Self = this.set("hoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverColor: Self = this.set("hoverColor", js.undefined)
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOnSelectPlace(value: /* place */ js.Array[Double] => Unit): Self = this.set("onSelectPlace", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectPlace: Self = this.set("onSelectPlace", js.undefined)
    @scala.inline
    def setPlacesVarargs(value: Location*): Self = this.set("places", js.Array(value :_*))
    @scala.inline
    def setPlaces(value: js.Array[Location]): Self = this.set("places", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaces: Self = this.set("places", js.undefined)
  }
  
}


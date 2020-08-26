package typings.leafletDraw.mod

import typings.leafletDraw.mod.DrawOptions.CircleOptions
import typings.leafletDraw.mod.DrawOptions.MarkerOptions
import typings.leafletDraw.mod.DrawOptions.PolygonOptions
import typings.leafletDraw.mod.DrawOptions.PolylineOptions
import typings.leafletDraw.mod.DrawOptions.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarOptions extends js.Object {
  var circle: js.UndefOr[CircleOptions] = js.native
  var circlemarker: js.UndefOr[CircleOptions] = js.native
  var marker: js.UndefOr[MarkerOptions] = js.native
  var polygon: js.UndefOr[PolygonOptions] = js.native
  var polyline: js.UndefOr[PolylineOptions] = js.native
  var rectangle: js.UndefOr[RectangleOptions] = js.native
}

object ToolbarOptions {
  @scala.inline
  def apply(): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarOptions]
  }
  @scala.inline
  implicit class ToolbarOptionsOps[Self <: ToolbarOptions] (val x: Self) extends AnyVal {
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
    def setCircle(value: CircleOptions): Self = this.set("circle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    @scala.inline
    def setCirclemarker(value: CircleOptions): Self = this.set("circlemarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCirclemarker: Self = this.set("circlemarker", js.undefined)
    @scala.inline
    def setMarker(value: MarkerOptions): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setPolygon(value: PolygonOptions): Self = this.set("polygon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolygon: Self = this.set("polygon", js.undefined)
    @scala.inline
    def setPolyline(value: PolylineOptions): Self = this.set("polyline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolyline: Self = this.set("polyline", js.undefined)
    @scala.inline
    def setRectangle(value: RectangleOptions): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRectangle: Self = this.set("rectangle", js.undefined)
  }
  
}


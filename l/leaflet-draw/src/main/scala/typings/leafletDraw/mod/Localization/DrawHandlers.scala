package typings.leafletDraw.mod.Localization

import typings.leafletDraw.anon.Error
import typings.leafletDraw.anon.Radius
import typings.leafletDraw.anon.TooltipCont
import typings.leafletDraw.anon.TooltipEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawHandlers extends js.Object {
  var circle: Radius = js.native
  var circlemarker: typings.leafletDraw.anon.Tooltip = js.native
  var marker: typings.leafletDraw.anon.Tooltip = js.native
  var polygon: TooltipCont = js.native
  var polyline: Error = js.native
  var rectangle: typings.leafletDraw.anon.Tooltip = js.native
  var simpleshape: TooltipEnd = js.native
}

object DrawHandlers {
  @scala.inline
  def apply(
    circle: Radius,
    circlemarker: typings.leafletDraw.anon.Tooltip,
    marker: typings.leafletDraw.anon.Tooltip,
    polygon: TooltipCont,
    polyline: Error,
    rectangle: typings.leafletDraw.anon.Tooltip,
    simpleshape: TooltipEnd
  ): DrawHandlers = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], circlemarker = circlemarker.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any], simpleshape = simpleshape.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawHandlers]
  }
  @scala.inline
  implicit class DrawHandlersOps[Self <: DrawHandlers] (val x: Self) extends AnyVal {
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
    def setCircle(value: Radius): Self = this.set("circle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCirclemarker(value: typings.leafletDraw.anon.Tooltip): Self = this.set("circlemarker", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarker(value: typings.leafletDraw.anon.Tooltip): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolygon(value: TooltipCont): Self = this.set("polygon", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolyline(value: Error): Self = this.set("polyline", value.asInstanceOf[js.Any])
    @scala.inline
    def setRectangle(value: typings.leafletDraw.anon.Tooltip): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def setSimpleshape(value: TooltipEnd): Self = this.set("simpleshape", value.asInstanceOf[js.Any])
  }
  
}


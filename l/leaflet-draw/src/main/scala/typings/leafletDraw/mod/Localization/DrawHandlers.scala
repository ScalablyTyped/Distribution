package typings.leafletDraw.mod.Localization

import typings.leafletDraw.anon.Error
import typings.leafletDraw.anon.Radius
import typings.leafletDraw.anon.TooltipCont
import typings.leafletDraw.anon.TooltipEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawHandlers extends js.Object {
  var circle: Radius
  var circlemarker: typings.leafletDraw.anon.Tooltip
  var marker: typings.leafletDraw.anon.Tooltip
  var polygon: TooltipCont
  var polyline: Error
  var rectangle: typings.leafletDraw.anon.Tooltip
  var simpleshape: TooltipEnd
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
}


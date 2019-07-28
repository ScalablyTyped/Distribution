package typings.leafletDashDraw.leafletMod

import typings.leafletDashDraw.leafletMod.DrawOptionsNs.CircleOptions
import typings.leafletDashDraw.leafletMod.DrawOptionsNs.MarkerOptions
import typings.leafletDashDraw.leafletMod.DrawOptionsNs.PolygonOptions
import typings.leafletDashDraw.leafletMod.DrawOptionsNs.PolylineOptions
import typings.leafletDashDraw.leafletMod.DrawOptionsNs.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarOptions extends js.Object {
  var circle: js.UndefOr[CircleOptions] = js.undefined
  var circlemarker: js.UndefOr[CircleOptions] = js.undefined
  var marker: js.UndefOr[MarkerOptions] = js.undefined
  var polygon: js.UndefOr[PolygonOptions] = js.undefined
  var polyline: js.UndefOr[PolylineOptions] = js.undefined
  var rectangle: js.UndefOr[RectangleOptions] = js.undefined
}

object ToolbarOptions {
  @scala.inline
  def apply(
    circle: CircleOptions = null,
    circlemarker: CircleOptions = null,
    marker: MarkerOptions = null,
    polygon: PolygonOptions = null,
    polyline: PolylineOptions = null,
    rectangle: RectangleOptions = null
  ): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    if (circle != null) __obj.updateDynamic("circle")(circle)
    if (circlemarker != null) __obj.updateDynamic("circlemarker")(circlemarker)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (polygon != null) __obj.updateDynamic("polygon")(polygon)
    if (polyline != null) __obj.updateDynamic("polyline")(polyline)
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    __obj.asInstanceOf[ToolbarOptions]
  }
}


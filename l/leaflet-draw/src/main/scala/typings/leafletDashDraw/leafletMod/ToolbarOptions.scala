package typings.leafletDashDraw.leafletMod

import typings.leafletDashDraw.leafletMod.DrawOptions.CircleOptions
import typings.leafletDashDraw.leafletMod.DrawOptions.MarkerOptions
import typings.leafletDashDraw.leafletMod.DrawOptions.PolygonOptions
import typings.leafletDashDraw.leafletMod.DrawOptions.PolylineOptions
import typings.leafletDashDraw.leafletMod.DrawOptions.RectangleOptions
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
    if (circle != null) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (circlemarker != null) __obj.updateDynamic("circlemarker")(circlemarker.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (polygon != null) __obj.updateDynamic("polygon")(polygon.asInstanceOf[js.Any])
    if (polyline != null) __obj.updateDynamic("polyline")(polyline.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarOptions]
  }
}


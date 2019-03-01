package typings
package leafletDashDrawLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarOptions extends js.Object {
  var circle: js.UndefOr[leafletDashDrawLib.leafletMod.DrawOptionsNs.CircleOptions] = js.undefined
  var circlemarker: js.UndefOr[leafletDashDrawLib.leafletMod.DrawOptionsNs.CircleOptions] = js.undefined
  var marker: js.UndefOr[leafletDashDrawLib.leafletMod.DrawOptionsNs.MarkerOptions] = js.undefined
  var polygon: js.UndefOr[leafletDashDrawLib.leafletMod.DrawOptionsNs.PolygonOptions] = js.undefined
  var polyline: js.UndefOr[leafletDashDrawLib.leafletMod.DrawOptionsNs.PolylineOptions] = js.undefined
  var rectangle: js.UndefOr[leafletDashDrawLib.leafletMod.DrawOptionsNs.RectangleOptions] = js.undefined
}

object ToolbarOptions {
  @scala.inline
  def apply(
    circle: leafletDashDrawLib.leafletMod.DrawOptionsNs.CircleOptions = null,
    circlemarker: leafletDashDrawLib.leafletMod.DrawOptionsNs.CircleOptions = null,
    marker: leafletDashDrawLib.leafletMod.DrawOptionsNs.MarkerOptions = null,
    polygon: leafletDashDrawLib.leafletMod.DrawOptionsNs.PolygonOptions = null,
    polyline: leafletDashDrawLib.leafletMod.DrawOptionsNs.PolylineOptions = null,
    rectangle: leafletDashDrawLib.leafletMod.DrawOptionsNs.RectangleOptions = null
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


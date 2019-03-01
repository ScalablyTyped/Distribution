package typings
package leafletDashDrawLib.leafletMod.ControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptions extends js.Object {
  /**
  			 * Circle draw handler options. Set to false to disable handler.
  			 *
  			 * Default value: {}
  			 */
  var circle: js.UndefOr[
    leafletDashDrawLib.leafletMod.DrawOptionsNs.CircleOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false`
  ] = js.undefined
  /**
  			 * Circle marker draw handler options. Set to false to disable handler.
  			 *
  			 * Default value: {}
  			 */
  var circlemarker: js.UndefOr[
    leafletDashDrawLib.leafletMod.DrawOptionsNs.CircleMarkerOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false`
  ] = js.undefined
  /**
  			 * Marker draw handler options. Set to false to disable handler.
  			 *
  			 * Default value: {}
  			 */
  var marker: js.UndefOr[
    leafletDashDrawLib.leafletMod.DrawOptionsNs.MarkerOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false`
  ] = js.undefined
  /**
  			 * Polygon draw handler options. Set to false to disable handler.
  			 *
  			 * Default value: {}
  			 */
  var polygon: js.UndefOr[
    leafletDashDrawLib.leafletMod.DrawOptionsNs.PolygonOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false`
  ] = js.undefined
  /**
  			 * Polyline draw handler options. Set to false to disable handler.
  			 *
  			 * Default value: {}
  			 */
  var polyline: js.UndefOr[
    leafletDashDrawLib.leafletMod.DrawOptionsNs.PolylineOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false`
  ] = js.undefined
  /**
  			 * Rectangle draw handler options. Set to false to disable handler.
  			 *
  			 * Default value: {}
  			 */
  var rectangle: js.UndefOr[
    leafletDashDrawLib.leafletMod.DrawOptionsNs.RectangleOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false`
  ] = js.undefined
}

object DrawOptions {
  @scala.inline
  def apply(
    circle: leafletDashDrawLib.leafletMod.DrawOptionsNs.CircleOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false` = null,
    circlemarker: leafletDashDrawLib.leafletMod.DrawOptionsNs.CircleMarkerOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false` = null,
    marker: leafletDashDrawLib.leafletMod.DrawOptionsNs.MarkerOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false` = null,
    polygon: leafletDashDrawLib.leafletMod.DrawOptionsNs.PolygonOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false` = null,
    polyline: leafletDashDrawLib.leafletMod.DrawOptionsNs.PolylineOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false` = null,
    rectangle: leafletDashDrawLib.leafletMod.DrawOptionsNs.RectangleOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false` = null
  ): DrawOptions = {
    val __obj = js.Dynamic.literal()
    if (circle != null) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (circlemarker != null) __obj.updateDynamic("circlemarker")(circlemarker.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (polygon != null) __obj.updateDynamic("polygon")(polygon.asInstanceOf[js.Any])
    if (polyline != null) __obj.updateDynamic("polyline")(polyline.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptions]
  }
}


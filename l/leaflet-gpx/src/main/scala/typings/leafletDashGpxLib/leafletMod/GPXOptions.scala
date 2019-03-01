package typings
package leafletDashGpxLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPXOptions extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var gpx_options: js.UndefOr[leafletDashGpxLib.Anon_ParseElements] = js.undefined
  var marker_options: js.UndefOr[leafletLib.leafletMod.MarkerOptions] = js.undefined
  var max_point_interval: js.UndefOr[scala.Double] = js.undefined
  var polyline_options: js.UndefOr[leafletLib.leafletMod.PolylineOptions] = js.undefined
}

object GPXOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    gpx_options: leafletDashGpxLib.Anon_ParseElements = null,
    marker_options: leafletLib.leafletMod.MarkerOptions = null,
    max_point_interval: scala.Int | scala.Double = null,
    polyline_options: leafletLib.leafletMod.PolylineOptions = null
  ): GPXOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (gpx_options != null) __obj.updateDynamic("gpx_options")(gpx_options)
    if (marker_options != null) __obj.updateDynamic("marker_options")(marker_options)
    if (max_point_interval != null) __obj.updateDynamic("max_point_interval")(max_point_interval.asInstanceOf[js.Any])
    if (polyline_options != null) __obj.updateDynamic("polyline_options")(polyline_options)
    __obj.asInstanceOf[GPXOptions]
  }
}


package typings.leafletGpx.mod

import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.PolylineOptions
import typings.leafletGpx.AnonParseElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPXOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var gpx_options: js.UndefOr[AnonParseElements] = js.undefined
  var marker_options: js.UndefOr[MarkerOptions] = js.undefined
  var max_point_interval: js.UndefOr[Double] = js.undefined
  var polyline_options: js.UndefOr[PolylineOptions] = js.undefined
}

object GPXOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    gpx_options: AnonParseElements = null,
    marker_options: MarkerOptions = null,
    max_point_interval: Int | Double = null,
    polyline_options: PolylineOptions = null
  ): GPXOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (gpx_options != null) __obj.updateDynamic("gpx_options")(gpx_options.asInstanceOf[js.Any])
    if (marker_options != null) __obj.updateDynamic("marker_options")(marker_options.asInstanceOf[js.Any])
    if (max_point_interval != null) __obj.updateDynamic("max_point_interval")(max_point_interval.asInstanceOf[js.Any])
    if (polyline_options != null) __obj.updateDynamic("polyline_options")(polyline_options.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPXOptions]
  }
}


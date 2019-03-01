package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONSourceOptions extends js.Object {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var buffer: js.UndefOr[scala.Double] = js.undefined
  var cluster: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var clusterMaxZoom: js.UndefOr[scala.Double] = js.undefined
  var clusterRadius: js.UndefOr[scala.Double] = js.undefined
  var data: js.UndefOr[
    (geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]) | (geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]) | java.lang.String
  ] = js.undefined
  var generateId: js.UndefOr[scala.Boolean] = js.undefined
  var lineMetrics: js.UndefOr[scala.Boolean] = js.undefined
  var maxzoom: js.UndefOr[scala.Double] = js.undefined
  var tolerance: js.UndefOr[scala.Double] = js.undefined
}

object GeoJSONSourceOptions {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    buffer: scala.Int | scala.Double = null,
    cluster: scala.Double | scala.Boolean = null,
    clusterMaxZoom: scala.Int | scala.Double = null,
    clusterRadius: scala.Int | scala.Double = null,
    data: (geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]) | (geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]) | java.lang.String = null,
    generateId: js.UndefOr[scala.Boolean] = js.undefined,
    lineMetrics: js.UndefOr[scala.Boolean] = js.undefined,
    maxzoom: scala.Int | scala.Double = null,
    tolerance: scala.Int | scala.Double = null
  ): GeoJSONSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (clusterMaxZoom != null) __obj.updateDynamic("clusterMaxZoom")(clusterMaxZoom.asInstanceOf[js.Any])
    if (clusterRadius != null) __obj.updateDynamic("clusterRadius")(clusterRadius.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(generateId)) __obj.updateDynamic("generateId")(generateId)
    if (!js.isUndefined(lineMetrics)) __obj.updateDynamic("lineMetrics")(lineMetrics)
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONSourceOptions]
  }
}


package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONSourceRaw
  extends Source
     with GeoJSONSourceOptions
     with AnySourceData {
  @JSName("type")
  var type_GeoJSONSourceRaw: mapboxDashGlLib.mapboxDashGlLibStrings.geojson
}

object GeoJSONSourceRaw {
  @scala.inline
  def apply(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.geojson,
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
  ): GeoJSONSourceRaw = {
    val __obj = js.Dynamic.literal(`type` = `type`)
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
    __obj.asInstanceOf[GeoJSONSourceRaw]
  }
}


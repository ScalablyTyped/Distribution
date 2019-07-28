package typings.mapboxDashGl.mapboxDashGlMod

import typings.geojson.geojsonMod.Feature
import typings.geojson.geojsonMod.FeatureCollection
import typings.geojson.geojsonMod.GeoJsonProperties
import typings.geojson.geojsonMod.Geometry
import typings.mapboxDashGl.mapboxDashGlStrings.geojson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONSourceRaw
  extends Source
     with GeoJSONSourceOptions
     with AnySourceData {
  @JSName("type")
  var type_GeoJSONSourceRaw: geojson
}

object GeoJSONSourceRaw {
  @scala.inline
  def apply(
    `type`: geojson,
    attribution: String = null,
    buffer: Int | Double = null,
    cluster: Double | Boolean = null,
    clusterMaxZoom: Int | Double = null,
    clusterRadius: Int | Double = null,
    data: (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String = null,
    generateId: js.UndefOr[Boolean] = js.undefined,
    lineMetrics: js.UndefOr[Boolean] = js.undefined,
    maxzoom: Int | Double = null,
    tolerance: Int | Double = null
  ): GeoJSONSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
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


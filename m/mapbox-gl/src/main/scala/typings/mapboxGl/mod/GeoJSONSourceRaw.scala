package typings.mapboxGl.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.mapboxGl.mapboxGlStrings.geojson
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
    buffer: js.UndefOr[Double] = js.undefined,
    cluster: Double | Boolean = null,
    clusterMaxZoom: js.UndefOr[Double] = js.undefined,
    clusterProperties: js.Object = null,
    clusterRadius: js.UndefOr[Double] = js.undefined,
    data: (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String = null,
    generateId: js.UndefOr[Boolean] = js.undefined,
    lineMetrics: js.UndefOr[Boolean] = js.undefined,
    maxzoom: js.UndefOr[Double] = js.undefined,
    promoteId: PromoteIdSpecification = null,
    tolerance: js.UndefOr[Double] = js.undefined
  ): GeoJSONSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.get.asInstanceOf[js.Any])
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (!js.isUndefined(clusterMaxZoom)) __obj.updateDynamic("clusterMaxZoom")(clusterMaxZoom.get.asInstanceOf[js.Any])
    if (clusterProperties != null) __obj.updateDynamic("clusterProperties")(clusterProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(clusterRadius)) __obj.updateDynamic("clusterRadius")(clusterRadius.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(generateId)) __obj.updateDynamic("generateId")(generateId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineMetrics)) __obj.updateDynamic("lineMetrics")(lineMetrics.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxzoom)) __obj.updateDynamic("maxzoom")(maxzoom.get.asInstanceOf[js.Any])
    if (promoteId != null) __obj.updateDynamic("promoteId")(promoteId.asInstanceOf[js.Any])
    if (!js.isUndefined(tolerance)) __obj.updateDynamic("tolerance")(tolerance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONSourceRaw]
  }
}


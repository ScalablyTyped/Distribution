package typings.mapboxGl.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONSourceOptions extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var buffer: js.UndefOr[Double] = js.undefined
  var cluster: js.UndefOr[Double | Boolean] = js.undefined
  var clusterMaxZoom: js.UndefOr[Double] = js.undefined
  var clusterProperties: js.UndefOr[js.Object] = js.undefined
  var clusterRadius: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[
    (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String
  ] = js.undefined
  var generateId: js.UndefOr[Boolean] = js.undefined
  var lineMetrics: js.UndefOr[Boolean] = js.undefined
  var maxzoom: js.UndefOr[Double] = js.undefined
  var promoteId: js.UndefOr[PromoteIdSpecification] = js.undefined
  var tolerance: js.UndefOr[Double] = js.undefined
}

object GeoJSONSourceOptions {
  @scala.inline
  def apply(
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
  ): GeoJSONSourceOptions = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[GeoJSONSourceOptions]
  }
}


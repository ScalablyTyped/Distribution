package typings.mapboxGl.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.mapboxGl.mapboxGlStrings.`raster-dem`
import typings.mapboxGl.mapboxGlStrings.canvas
import typings.mapboxGl.mapboxGlStrings.geojson
import typings.mapboxGl.mapboxGlStrings.image_
import typings.mapboxGl.mapboxGlStrings.mapbox
import typings.mapboxGl.mapboxGlStrings.raster
import typings.mapboxGl.mapboxGlStrings.terrarium
import typings.mapboxGl.mapboxGlStrings.tms
import typings.mapboxGl.mapboxGlStrings.vector
import typings.mapboxGl.mapboxGlStrings.video
import typings.mapboxGl.mapboxGlStrings.xyz
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxGl.mod.GeoJSONSourceRaw
  - typings.mapboxGl.mod.VideoSourceRaw
  - typings.mapboxGl.mod.ImageSourceRaw
  - typings.mapboxGl.mod.CanvasSourceRaw
  - typings.mapboxGl.mod.VectorSource
  - typings.mapboxGl.mod.RasterSource
  - typings.mapboxGl.mod.RasterDemSource
*/
trait AnySourceData extends js.Object

object AnySourceData {
  @scala.inline
  def ImageSourceRaw(`type`: image_, coordinates: js.Array[js.Array[Double]] = null, url: String = null): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  @scala.inline
  def RasterDemSource(
    `type`: `raster-dem`,
    attribution: String = null,
    bounds: js.Array[Double] = null,
    encoding: terrarium | mapbox = null,
    maxzoom: js.UndefOr[Double] = js.undefined,
    minzoom: js.UndefOr[Double] = js.undefined,
    tileSize: js.UndefOr[Double] = js.undefined,
    tiles: js.Array[String] = null,
    url: String = null
  ): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(maxzoom)) __obj.updateDynamic("maxzoom")(maxzoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minzoom)) __obj.updateDynamic("minzoom")(minzoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileSize)) __obj.updateDynamic("tileSize")(tileSize.get.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  @scala.inline
  def VectorSource(
    `type`: vector,
    attribution: String = null,
    bounds: js.Array[Double] = null,
    maxzoom: js.UndefOr[Double] = js.undefined,
    minzoom: js.UndefOr[Double] = js.undefined,
    promoteId: PromoteIdSpecification = null,
    scheme: xyz | tms = null,
    tiles: js.Array[String] = null,
    url: String = null
  ): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(maxzoom)) __obj.updateDynamic("maxzoom")(maxzoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minzoom)) __obj.updateDynamic("minzoom")(minzoom.get.asInstanceOf[js.Any])
    if (promoteId != null) __obj.updateDynamic("promoteId")(promoteId.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  @scala.inline
  def GeoJSONSourceRaw(
    `type`: geojson,
    attribution: String = null,
    buffer: js.UndefOr[Double] = js.undefined,
    cluster: Double | Boolean = null,
    clusterMaxZoom: js.UndefOr[Double] = js.undefined,
    clusterMinPoints: js.UndefOr[Double] = js.undefined,
    clusterProperties: js.Object = null,
    clusterRadius: js.UndefOr[Double] = js.undefined,
    data: (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String = null,
    generateId: js.UndefOr[Boolean] = js.undefined,
    lineMetrics: js.UndefOr[Boolean] = js.undefined,
    maxzoom: js.UndefOr[Double] = js.undefined,
    promoteId: PromoteIdSpecification = null,
    tolerance: js.UndefOr[Double] = js.undefined
  ): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.get.asInstanceOf[js.Any])
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (!js.isUndefined(clusterMaxZoom)) __obj.updateDynamic("clusterMaxZoom")(clusterMaxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clusterMinPoints)) __obj.updateDynamic("clusterMinPoints")(clusterMinPoints.get.asInstanceOf[js.Any])
    if (clusterProperties != null) __obj.updateDynamic("clusterProperties")(clusterProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(clusterRadius)) __obj.updateDynamic("clusterRadius")(clusterRadius.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(generateId)) __obj.updateDynamic("generateId")(generateId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineMetrics)) __obj.updateDynamic("lineMetrics")(lineMetrics.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxzoom)) __obj.updateDynamic("maxzoom")(maxzoom.get.asInstanceOf[js.Any])
    if (promoteId != null) __obj.updateDynamic("promoteId")(promoteId.asInstanceOf[js.Any])
    if (!js.isUndefined(tolerance)) __obj.updateDynamic("tolerance")(tolerance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  @scala.inline
  def RasterSource(
    `type`: raster,
    attribution: String = null,
    bounds: js.Array[Double] = null,
    maxzoom: js.UndefOr[Double] = js.undefined,
    minzoom: js.UndefOr[Double] = js.undefined,
    scheme: xyz | tms = null,
    tileSize: js.UndefOr[Double] = js.undefined,
    tiles: js.Array[String] = null,
    url: String = null
  ): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(maxzoom)) __obj.updateDynamic("maxzoom")(maxzoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minzoom)) __obj.updateDynamic("minzoom")(minzoom.get.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (!js.isUndefined(tileSize)) __obj.updateDynamic("tileSize")(tileSize.get.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  @scala.inline
  def CanvasSourceRaw(
    canvas: String | HTMLCanvasElement,
    coordinates: js.Array[js.Array[Double]],
    `type`: canvas,
    animate: js.UndefOr[Boolean] = js.undefined
  ): AnySourceData = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  @scala.inline
  def VideoSourceRaw(`type`: video, coordinates: js.Array[js.Array[Double]] = null, urls: js.Array[String] = null): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
}


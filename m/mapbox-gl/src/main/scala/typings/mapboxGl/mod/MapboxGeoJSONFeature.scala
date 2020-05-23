package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.mod.BBox
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.mapboxGl.mapboxGlStrings.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined geojson.geojson.Feature<geojson.geojson.Geometry, geojson.geojson.GeoJsonProperties> & {  layer  :mapbox-gl.mapbox-gl.Layer,   source  :string,   sourceLayer  :string,   state  :{[key: string] : any}} */
trait MapboxGeoJSONFeature extends js.Object {
  /**
    * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
    * The value of the bbox member is an array of length 2*n where n is the number of dimensions
    * represented in the contained geometries, with all axes of the most southwesterly point
    * followed by all axes of the more northeasterly point.
    * The axes order of a bbox follows the axes order of geometries.
    * https://tools.ietf.org/html/rfc7946#section-5
    */
  var bbox: js.UndefOr[BBox] = js.undefined
  /**
    * The feature's geometry
    */
  var geometry: Geometry
  /**
    * A value that uniquely identifies this feature in a
    * https://tools.ietf.org/html/rfc7946#section-3.2.
    */
  var id: js.UndefOr[String | Double] = js.undefined
  var layer: Layer
  /**
    * Properties associated with this feature.
    */
  var properties: GeoJsonProperties
  var source: String
  var sourceLayer: String
  var state: StringDictionary[js.Any]
  var `type`: Feature
}

object MapboxGeoJSONFeature {
  @scala.inline
  def apply(
    geometry: Geometry,
    layer: Layer,
    source: String,
    sourceLayer: String,
    state: StringDictionary[js.Any],
    `type`: Feature,
    bbox: BBox = null,
    id: String | Double = null,
    properties: GeoJsonProperties = null
  ): MapboxGeoJSONFeature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceLayer = sourceLayer.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxGeoJSONFeature]
  }
}


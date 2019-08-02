package typings.atMapboxMapboxDashSdk

import typings.geojson.geojsonMod.Feature
import typings.geojson.geojsonMod.GeoJsonProperties
import typings.geojson.geojsonMod.Geometry
import typings.geojson.geojsonMod.GeometryCollection
import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.geojson.geojsonMod.MultiPoint
import typings.geojson.geojsonMod.MultiPolygon
import typings.geojson.geojsonMod.Point
import typings.geojson.geojsonMod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object servicesDatasetsMod {
  /**
    * All GeoJSON types except for FeatureCollection.
    */
  type DataSetsFeature = Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection | (Feature[Geometry, GeoJsonProperties])
}

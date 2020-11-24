package typings.mapboxMapboxSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object datasetsMod {
  
  /**
    * All GeoJSON types except for FeatureCollection.
    */
  type DataSetsFeature = typings.geojson.mod.Point | typings.geojson.mod.MultiPoint | typings.geojson.mod.LineString | typings.geojson.mod.MultiLineString | typings.geojson.mod.Polygon | typings.geojson.mod.MultiPolygon | typings.geojson.mod.GeometryCollection | (typings.geojson.mod.Feature[typings.geojson.mod.Geometry, typings.geojson.mod.GeoJsonProperties])
}

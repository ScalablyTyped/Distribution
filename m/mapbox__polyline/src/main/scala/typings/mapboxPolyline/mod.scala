package typings.mapboxPolyline

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.LineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@mapbox/polyline", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decode(string: String): js.Array[js.Tuple2[Double, Double]] = js.native
  def decode(string: String, precision: Double): js.Array[js.Tuple2[Double, Double]] = js.native
  
  def encode(coordinates: js.Array[js.Tuple2[Double, Double]]): String = js.native
  def encode(coordinates: js.Array[js.Tuple2[Double, Double]], precision: Double): String = js.native
  
  def fromGeoJSON(geojson: Feature[LineString, GeoJsonProperties]): String = js.native
  def fromGeoJSON(geojson: Feature[LineString, GeoJsonProperties], precision: Double): String = js.native
  def fromGeoJSON(geojson: LineString): String = js.native
  def fromGeoJSON(geojson: LineString, precision: Double): String = js.native
  
  def toGeoJSON(string: String): LineString = js.native
  def toGeoJSON(string: String, precision: Double): LineString = js.native
}

package typings.mapboxPolyline

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.LineString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/polyline", "decode")
  @js.native
  def decode(string: String): js.Array[js.Tuple2[Double, Double]] = js.native
  @JSImport("@mapbox/polyline", "decode")
  @js.native
  def decode(string: String, precision: Double): js.Array[js.Tuple2[Double, Double]] = js.native
  
  @JSImport("@mapbox/polyline", "encode")
  @js.native
  def encode(coordinates: js.Array[js.Tuple2[Double, Double]]): String = js.native
  @JSImport("@mapbox/polyline", "encode")
  @js.native
  def encode(coordinates: js.Array[js.Tuple2[Double, Double]], precision: Double): String = js.native
  
  @JSImport("@mapbox/polyline", "fromGeoJSON")
  @js.native
  def fromGeoJSON(geojson: Feature[LineString, GeoJsonProperties]): String = js.native
  @JSImport("@mapbox/polyline", "fromGeoJSON")
  @js.native
  def fromGeoJSON(geojson: Feature[LineString, GeoJsonProperties], precision: Double): String = js.native
  @JSImport("@mapbox/polyline", "fromGeoJSON")
  @js.native
  def fromGeoJSON(geojson: LineString): String = js.native
  @JSImport("@mapbox/polyline", "fromGeoJSON")
  @js.native
  def fromGeoJSON(geojson: LineString, precision: Double): String = js.native
  
  @JSImport("@mapbox/polyline", "toGeoJSON")
  @js.native
  def toGeoJSON(string: String): LineString = js.native
  @JSImport("@mapbox/polyline", "toGeoJSON")
  @js.native
  def toGeoJSON(string: String, precision: Double): LineString = js.native
}

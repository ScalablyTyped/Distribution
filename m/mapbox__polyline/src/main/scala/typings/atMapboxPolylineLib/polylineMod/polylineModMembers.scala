package typings
package atMapboxPolylineLib.polylineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/polyline", JSImport.Namespace)
@js.native
object polylineModMembers extends js.Object {
  def decode(string: java.lang.String): js.Array[js.Array[scala.Double]] = js.native
  def decode(string: java.lang.String, precision: scala.Double): js.Array[js.Array[scala.Double]] = js.native
  def encode(coordinates: js.Array[js.Array[scala.Double]]): java.lang.String = js.native
  def encode(coordinates: js.Array[js.Array[scala.Double]], precision: scala.Double): java.lang.String = js.native
  def fromGeoJSON(
    geojson: geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.LineString, geojsonLib.geojsonMod.GeoJsonProperties]
  ): java.lang.String = js.native
  def fromGeoJSON(
    geojson: geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.LineString, geojsonLib.geojsonMod.GeoJsonProperties],
    precision: scala.Double
  ): java.lang.String = js.native
  def fromGeoJSON(geojson: geojsonLib.geojsonMod.LineString): java.lang.String = js.native
  def fromGeoJSON(geojson: geojsonLib.geojsonMod.LineString, precision: scala.Double): java.lang.String = js.native
  def toGeoJSON(string: java.lang.String): geojsonLib.geojsonMod.LineString = js.native
  def toGeoJSON(string: java.lang.String, precision: scala.Double): geojsonLib.geojsonMod.LineString = js.native
}


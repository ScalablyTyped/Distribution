package typings.mapboxPolyline

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.LineString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/polyline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(string: String): js.Array[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  @scala.inline
  def decode(string: String, precision: Double): js.Array[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(string.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  
  @scala.inline
  def encode(coordinates: js.Array[js.Tuple2[Double, Double]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(coordinates.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def encode(coordinates: js.Array[js.Tuple2[Double, Double]], precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(coordinates.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def fromGeoJSON(geojson: Feature[LineString, GeoJsonProperties]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGeoJSON")(geojson.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def fromGeoJSON(geojson: Feature[LineString, GeoJsonProperties], precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGeoJSON")(geojson.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def fromGeoJSON(geojson: LineString): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGeoJSON")(geojson.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def fromGeoJSON(geojson: LineString, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGeoJSON")(geojson.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toGeoJSON(string: String): LineString = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeoJSON")(string.asInstanceOf[js.Any]).asInstanceOf[LineString]
  @scala.inline
  def toGeoJSON(string: String, precision: Double): LineString = (^.asInstanceOf[js.Dynamic].applyDynamic("toGeoJSON")(string.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[LineString]
}

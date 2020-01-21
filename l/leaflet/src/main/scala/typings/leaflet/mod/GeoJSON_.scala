package typings.leaflet.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonObject
import typings.geojson.mod.GeometryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "GeoJSON")
@js.native
class GeoJSON_[P] () extends FeatureGroup_[P] {
  def this(geojson: GeoJsonObject) = this()
  def this(geojson: GeoJsonObject, options: GeoJSONOptions[P]) = this()
  var options: GeoJSONOptions[P] = js.native
  /**
    * Adds a GeoJSON object to the layer.
    */
  def addData(data: GeoJsonObject): Layer = js.native
  /**
    * Resets the given vector layer's style to the original GeoJSON style,
    * useful for resetting style after hover events.
    */
  def resetStyle(layer: Layer): Layer = js.native
  def setStyle(style: StyleFunction[P]): this.type = js.native
}

/* static members */
@JSImport("leaflet", "GeoJSON")
@js.native
object GeoJSON_ extends js.Object {
    // Using any[] to avoid artificially limiting valid calls
  /**
    * Normalize GeoJSON geometries/features into GeoJSON features.
    */
  def asFeature[P](geojson: Feature[GeometryObject, P]): Feature[GeometryObject, P] = js.native
  def asFeature[P](geojson: GeometryObject): Feature[GeometryObject, P] = js.native
  /**
    * Creates a LatLng object from an array of 2 numbers (longitude, latitude) or
    * 3 numbers (longitude, latitude, altitude) used in GeoJSON for points.
    */
  def coordsToLatLng(coords: js.Tuple2[Double, Double]): LatLng_ = js.native
  def coordsToLatLng(coords: js.Tuple3[Double, Double, Double]): LatLng_ = js.native
  /**
    * Creates a multidimensional array of LatLngs from a GeoJSON coordinates array.
    * levelsDeep specifies the nesting level (0 is for an array of points, 1 for an array of
    * arrays of points, etc., 0 by default).
    * Can use a custom coordsToLatLng function.
    */
  def coordsToLatLngs(coords: js.Array[_]): js.Array[_] = js.native
  def coordsToLatLngs(coords: js.Array[_], levelsDeep: Double): js.Array[_] = js.native
  def coordsToLatLngs(
    coords: js.Array[_],
    levelsDeep: Double,
    coordsToLatLng: js.Function1[
      /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]), 
      LatLng_
    ]
  ): js.Array[_] = js.native
  /**
    * Creates a Layer from a given GeoJSON feature. Can use a custom pointToLayer
    * and/or coordsToLatLng functions if provided as options.
    */
  def geometryToLayer[P](featureData: Feature[GeometryObject, P]): Layer = js.native
  def geometryToLayer[P](featureData: Feature[GeometryObject, P], options: GeoJSONOptions[P]): Layer = js.native
   // Using any[] to avoid artificially limiting valid calls
  /**
    * Reverse of coordsToLatLng
    */
  def latLngToCoords(latlng: LatLng_): (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) = js.native
  /**
    * Reverse of coordsToLatLngs closed determines whether the first point should be
    * appended to the end of the array to close the feature, only used when levelsDeep is 0.
    * False by default.
    */
  def latLngsToCoords(latlngs: js.Array[_]): js.Array[_] = js.native
  def latLngsToCoords(latlngs: js.Array[_], levelsDeep: Double): js.Array[_] = js.native
  def latLngsToCoords(latlngs: js.Array[_], levelsDeep: Double, closed: Boolean): js.Array[_] = js.native
}


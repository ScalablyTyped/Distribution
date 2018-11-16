package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "GeoJSON")
@js.native
class GeoJSON[P] () extends FeatureGroup[P] {
  def this(geojson: geojsonLib.geojsonMod.GeoJsonObject) = this()
  def this(geojson: geojsonLib.geojsonMod.GeoJsonObject, options: GeoJSONOptions[P]) = this()
  var options: GeoJSONOptions[P] = js.native
  /**
       * Adds a GeoJSON object to the layer.
       */
  def addData(data: geojsonLib.geojsonMod.GeoJsonObject): Layer = js.native
  /**
       * Resets the given vector layer's style to the original GeoJSON style,
       * useful for resetting style after hover events.
       */
  def resetStyle(layer: Layer): Layer = js.native
  /**
       * Same as FeatureGroup's setStyle method, but style-functions are also
       * allowed here to set the style according to the feature.
       */
  def setStyle(style: StyleFunction[P]): this.type = js.native
}

@JSImport("leaflet", "GeoJSON")
@js.native
object GeoJSON extends js.Object {
    // Using any[] to avoid artificially limiting valid calls
  /**
       * Normalize GeoJSON geometries/features into GeoJSON features.
       */
  def asFeature[P](geojson: geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, P]): geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, P] = js.native
    // Using any[] to avoid artificially limiting valid calls
  /**
       * Normalize GeoJSON geometries/features into GeoJSON features.
       */
  def asFeature[P](geojson: geojsonLib.geojsonMod.GeometryObject): geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, P] = js.native
  /**
       * Creates a LatLng object from an array of 2 numbers (longitude, latitude) or
       * 3 numbers (longitude, latitude, altitude) used in GeoJSON for points.
       */
  def coordsToLatLng(coords: js.Tuple2[scala.Double, scala.Double]): leafletLib.leafletMod.LatLng = js.native
  /**
       * Creates a LatLng object from an array of 2 numbers (longitude, latitude) or
       * 3 numbers (longitude, latitude, altitude) used in GeoJSON for points.
       */
  def coordsToLatLng(coords: js.Tuple3[scala.Double, scala.Double, scala.Double]): leafletLib.leafletMod.LatLng = js.native
  /**
       * Creates a multidimensional array of LatLngs from a GeoJSON coordinates array.
       * levelsDeep specifies the nesting level (0 is for an array of points, 1 for an array of
       * arrays of points, etc., 0 by default).
       * Can use a custom coordsToLatLng function.
       */
  def coordsToLatLngs(coords: js.Array[_]): js.Array[_] = js.native
  /**
       * Creates a multidimensional array of LatLngs from a GeoJSON coordinates array.
       * levelsDeep specifies the nesting level (0 is for an array of points, 1 for an array of
       * arrays of points, etc., 0 by default).
       * Can use a custom coordsToLatLng function.
       */
  def coordsToLatLngs(coords: js.Array[_], levelsDeep: scala.Double): js.Array[_] = js.native
  /**
       * Creates a multidimensional array of LatLngs from a GeoJSON coordinates array.
       * levelsDeep specifies the nesting level (0 is for an array of points, 1 for an array of
       * arrays of points, etc., 0 by default).
       * Can use a custom coordsToLatLng function.
       */
  def coordsToLatLngs(
    coords: js.Array[_],
    levelsDeep: scala.Double,
    coordsToLatLng: js.Function1[
      /* coords */ (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]), 
      leafletLib.leafletMod.LatLng
    ]
  ): js.Array[_] = js.native
  /**
       * Creates a Layer from a given GeoJSON feature. Can use a custom pointToLayer
       * and/or coordsToLatLng functions if provided as options.
       */
  def geometryToLayer[P](featureData: geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, P]): leafletLib.leafletMod.Layer = js.native
  /**
       * Creates a Layer from a given GeoJSON feature. Can use a custom pointToLayer
       * and/or coordsToLatLng functions if provided as options.
       */
  def geometryToLayer[P](
    featureData: geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, P],
    options: leafletLib.leafletMod.GeoJSONOptions[P]
  ): leafletLib.leafletMod.Layer = js.native
   // Using any[] to avoid artificially limiting valid calls
  /**
       * Reverse of coordsToLatLng
       */
  def latLngToCoords(latlng: leafletLib.leafletMod.LatLng): (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]) = js.native
  /**
       * Reverse of coordsToLatLngs closed determines whether the first point should be
       * appended to the end of the array to close the feature, only used when levelsDeep is 0.
       * False by default.
       */
  def latLngsToCoords(latlngs: js.Array[_]): js.Array[_] = js.native
  /**
       * Reverse of coordsToLatLngs closed determines whether the first point should be
       * appended to the end of the array to close the feature, only used when levelsDeep is 0.
       * False by default.
       */
  def latLngsToCoords(latlngs: js.Array[_], levelsDeep: scala.Double): js.Array[_] = js.native
  /**
       * Reverse of coordsToLatLngs closed determines whether the first point should be
       * appended to the end of the array to close the feature, only used when levelsDeep is 0.
       * False by default.
       */
  def latLngsToCoords(latlngs: js.Array[_], levelsDeep: scala.Double, closed: scala.Boolean): js.Array[_] = js.native
}


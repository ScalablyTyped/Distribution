package typings.leaflet.global.L

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonObject
import typings.geojson.mod.GeometryObject
import typings.leaflet.mod.GeoJSONOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("L.GeoJSON")
@js.native
open class GeoJSON__[P, G /* <: GeometryObject */] ()
  extends typings.leaflet.mod.GeoJSON__[P, G] {
  def this(geojson: GeoJsonObject) = this()
  def this(geojson: Unit, options: GeoJSONOptions[P, G]) = this()
  def this(geojson: GeoJsonObject, options: GeoJSONOptions[P, G]) = this()
}
/* static members */
object GeoJSON__ {
  
  @JSGlobal("L.GeoJSON")
  @js.native
  val ^ : js.Any = js.native
  
  inline def asFeature[P, G /* <: GeometryObject */](geojson: G): Feature[G, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("asFeature")(geojson.asInstanceOf[js.Any]).asInstanceOf[Feature[G, P]]
  // Using any[] to avoid artificially limiting valid calls
  /**
    * Normalize GeoJSON geometries/features into GeoJSON features.
    */
  inline def asFeature[P, G /* <: GeometryObject */](geojson: Feature[G, P]): Feature[G, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("asFeature")(geojson.asInstanceOf[js.Any]).asInstanceOf[Feature[G, P]]
  
  /**
    * Creates a LatLng object from an array of 2 numbers (longitude, latitude) or
    * 3 numbers (longitude, latitude, altitude) used in GeoJSON for points.
    */
  inline def coordsToLatLng(coords: js.Tuple2[Double, Double]): typings.leaflet.mod.LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("coordsToLatLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLng_]
  inline def coordsToLatLng(coords: js.Tuple3[Double, Double, Double]): typings.leaflet.mod.LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("coordsToLatLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLng_]
  
  /**
    * Creates a multidimensional array of LatLngs from a GeoJSON coordinates array.
    * levelsDeep specifies the nesting level (0 is for an array of points, 1 for an array of
    * arrays of points, etc., 0 by default).
    * Can use a custom coordsToLatLng function.
    */
  inline def coordsToLatLngs(coords: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("coordsToLatLngs")(coords.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def coordsToLatLngs(coords: js.Array[Any], levelsDeep: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("coordsToLatLngs")(coords.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def coordsToLatLngs(
    coords: js.Array[Any],
    levelsDeep: Double,
    coordsToLatLng: js.Function1[
      /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]), 
      typings.leaflet.mod.LatLng_
    ]
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("coordsToLatLngs")(coords.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any], coordsToLatLng.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def coordsToLatLngs(
    coords: js.Array[Any],
    levelsDeep: Unit,
    coordsToLatLng: js.Function1[
      /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]), 
      typings.leaflet.mod.LatLng_
    ]
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("coordsToLatLngs")(coords.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any], coordsToLatLng.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  /**
    * Creates a Layer from a given GeoJSON feature. Can use a custom pointToLayer
    * and/or coordsToLatLng functions if provided as options.
    */
  inline def geometryToLayer[P, G /* <: GeometryObject */](featureData: Feature[G, P]): typings.leaflet.mod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("geometryToLayer")(featureData.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Layer]
  inline def geometryToLayer[P, G /* <: GeometryObject */](featureData: Feature[G, P], options: GeoJSONOptions[P, G]): typings.leaflet.mod.Layer = (^.asInstanceOf[js.Dynamic].applyDynamic("geometryToLayer")(featureData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Layer]
  
  inline def getFeature[P, G /* <: GeometryObject */](layer: typings.leaflet.mod.Layer, newGeometry: G): Feature[G, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFeature")(layer.asInstanceOf[js.Any], newGeometry.asInstanceOf[js.Any])).asInstanceOf[Feature[G, P]]
  /**
    * Convert layer into GeoJSON feature
    */
  inline def getFeature[P, G /* <: GeometryObject */](layer: typings.leaflet.mod.Layer, newGeometry: Feature[G, P]): Feature[G, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFeature")(layer.asInstanceOf[js.Any], newGeometry.asInstanceOf[js.Any])).asInstanceOf[Feature[G, P]]
  
  // Using any[] to avoid artificially limiting valid calls
  /**
    * Reverse of coordsToLatLng
    */
  inline def latLngToCoords(latlng: typings.leaflet.mod.LatLng_): (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) = ^.asInstanceOf[js.Dynamic].applyDynamic("latLngToCoords")(latlng.asInstanceOf[js.Any]).asInstanceOf[(js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double])]
  
  /**
    * Reverse of coordsToLatLngs closed determines whether the first point should be
    * appended to the end of the array to close the feature, only used when levelsDeep is 0.
    * False by default.
    */
  inline def latLngsToCoords(latlngs: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("latLngsToCoords")(latlngs.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def latLngsToCoords(latlngs: js.Array[Any], levelsDeep: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("latLngsToCoords")(latlngs.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def latLngsToCoords(latlngs: js.Array[Any], levelsDeep: Double, closed: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("latLngsToCoords")(latlngs.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any], closed.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def latLngsToCoords(latlngs: js.Array[Any], levelsDeep: Unit, closed: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("latLngsToCoords")(latlngs.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any], closed.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}

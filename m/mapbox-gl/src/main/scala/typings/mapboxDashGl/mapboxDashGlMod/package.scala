package typings.mapboxDashGl

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.geojsonMod.Feature
import typings.geojson.geojsonMod.GeoJsonProperties
import typings.geojson.geojsonMod.Geometry
import typings.mapboxDashGl.Anon_Center
import typings.mapboxDashGl.Anon_Features
import typings.mapboxDashGl.Anon_Key
import typings.mapboxDashGl.mapboxDashGlStrings.bearing
import typings.mapboxDashGl.mapboxDashGlStrings.zoom
import typings.std.Pick
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapboxDashGlMod {
  type CameraForBoundsResult = (Required[Pick[CameraOptions, zoom | bearing]]) with Anon_Center
  type EventData = StringDictionary[js.Any]
  type Expression = js.Array[ExpressionName | js.Any]
  type LngLatBoundsLike = LngLatBounds | (js.Tuple2[LngLatLike, LngLatLike]) | (js.Tuple4[Double, Double, Double, Double])
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxDashGl.mapboxDashGlMod.LngLat
    - typings.mapboxDashGl.Anon_Lat
    - typings.mapboxDashGl.Anon_LatLon
    - js.Tuple2[scala.Double, scala.Double]
  */
  type LngLatLike = _LngLatLike | (js.Tuple2[Double, Double])
  type MapLayerMouseEvent = MapMouseEvent with Anon_Features
  type MapLayerTouchEvent = MapTouchEvent with Anon_Features
  type MapboxGeoJSONFeature = (Feature[Geometry, GeoJsonProperties]) with Anon_Key
  type PointLike = Point | (js.Tuple2[Double, Double])
  type Sources = StringDictionary[AnySourceData]
  type TransformRequestFunction = js.Function2[/* url */ String, /* resourceType */ ResourceType, RequestParameters]
}

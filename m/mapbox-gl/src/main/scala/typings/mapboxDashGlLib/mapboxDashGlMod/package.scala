package typings
package mapboxDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapboxDashGlMod {
  type EventData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Expression = js.Array[ExpressionName | js.Any]
  type LngLatBoundsLike = LngLatBounds | (js.Tuple2[LngLatLike, LngLatLike]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  /* Rewritten from type alias, can be one of: 
    - LngLat
    - mapboxDashGlLib.Anon_Lat
    - mapboxDashGlLib.Anon_LatLon
    - js.Tuple2[scala.Double, scala.Double]
  */
  type LngLatLike = _LngLatLike | (js.Tuple2[scala.Double, scala.Double])
  type MapLayerMouseEvent = MapMouseEvent with mapboxDashGlLib.Anon_Features
  type MapLayerTouchEvent = MapTouchEvent with mapboxDashGlLib.Anon_Features
  type MapboxGeoJSONFeature = (geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]) with mapboxDashGlLib.Anon_Key
  type PointLike = Point | (js.Tuple2[scala.Double, scala.Double])
  type Sources = org.scalablytyped.runtime.StringDictionary[AnySourceData]
  type TransformRequestFunction = js.Function2[/* url */ java.lang.String, /* resourceType */ ResourceType, RequestParameters]
}

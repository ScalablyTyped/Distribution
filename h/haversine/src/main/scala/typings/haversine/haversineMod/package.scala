package typings.haversine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object haversineMod {
  /* Rewritten from type alias, can be one of: 
    - typings.haversine.haversineMod.CoordinateLongitudeLatitude
    - typings.haversine.haversineMod.CoordinateLonLat
    - typings.haversine.haversineMod.CoordinateLatLng
    - typings.haversine.haversineMod.LatLonTuple
    - typings.haversine.haversineMod.GeoJSON
  */
  type Coordinate = _Coordinate | LatLonTuple
  type LatLonTuple = js.Tuple2[Double, Double]
  // The input & output types of haversine() both depend on the Options object.
  /* Rewritten from type alias, can be one of: 
    - typings.haversine.haversineMod.Coordinate
    - typings.haversine.haversineMod.GeoJSON
    - typings.haversine.haversineMod.CoordinateLatLng
    - typings.haversine.haversineMod.CoordinateLonLat
    - js.Tuple2[scala.Double, scala.Double]
    - typings.haversine.haversineMod.CoordinateLongitudeLatitude
  */
  type ParamType[T /* <: js.UndefOr[Options] */] = _ParamType[T] | (js.Tuple2[Double, Double]) | LatLonTuple
  type Return[T /* <: js.UndefOr[Options] */] = Double | Boolean
}

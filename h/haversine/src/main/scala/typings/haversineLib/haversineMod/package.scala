package typings
package haversineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object haversineMod {
  /* Rewritten from type alias, can be one of: 
    - CoordinateLongitudeLatitude
    - CoordinateLonLat
    - CoordinateLatLng
    - LatLonTuple
    - GeoJSON
  */
  type Coordinate = _Coordinate | LatLonTuple
  type LatLonTuple = js.Tuple2[scala.Double, scala.Double]
  // The input & output types of haversine() both depend on the Options object.
  /* Rewritten from type alias, can be one of: 
    - Coordinate
    - GeoJSON
    - CoordinateLatLng
    - CoordinateLonLat
    - js.Tuple2[scala.Double, scala.Double]
    - CoordinateLongitudeLatitude
  */
  type ParamType[T /* <: js.UndefOr[Options] */] = _ParamType[T] | (js.Tuple2[scala.Double, scala.Double]) | LatLonTuple
  type Return[T /* <: js.UndefOr[Options] */] = scala.Double | scala.Boolean
}

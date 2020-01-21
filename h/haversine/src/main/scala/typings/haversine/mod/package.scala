package typings.haversine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.haversine.mod.CoordinateLongitudeLatitude
    - typings.haversine.mod.CoordinateLonLat
    - typings.haversine.mod.CoordinateLatLng
    - typings.haversine.mod.LatLonTuple
    - typings.haversine.mod.GeoJSON
  */
  type Coordinate = typings.haversine.mod._Coordinate | typings.haversine.mod.LatLonTuple
  type LatLonTuple = js.Tuple2[scala.Double, scala.Double]
  // The input & output types of haversine() both depend on the Options object.
  /* Rewritten from type alias, can be one of: 
    - typings.haversine.mod.Coordinate
    - typings.haversine.mod.GeoJSON
    - typings.haversine.mod.CoordinateLatLng
    - typings.haversine.mod.CoordinateLonLat
    - js.Tuple2[scala.Double, scala.Double]
    - typings.haversine.mod.CoordinateLongitudeLatitude
  */
  type ParamType[T /* <: js.UndefOr[typings.haversine.mod.Options] */] = typings.haversine.mod._ParamType[T] | (js.Tuple2[scala.Double, scala.Double]) | typings.haversine.mod.LatLonTuple
  type Return[T /* <: js.UndefOr[typings.haversine.mod.Options] */] = scala.Double | scala.Boolean
}

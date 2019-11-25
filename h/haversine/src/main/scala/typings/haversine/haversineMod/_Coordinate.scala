package typings.haversine.haversineMod

import typings.haversine.Anon_Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Coordinate
  extends _ParamType[js.Any]

object _Coordinate {
  @scala.inline
  def CoordinateLongitudeLatitude(latitude: Double, longitude: Double): _Coordinate = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Coordinate]
  }
  @scala.inline
  def CoordinateLonLat(lat: Double, lon: Double): _Coordinate = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Coordinate]
  }
  @scala.inline
  def CoordinateLatLng(lat: Double, lng: Double): _Coordinate = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Coordinate]
  }
  @scala.inline
  def GeoJSON(geometry: Anon_Coordinates): _Coordinate = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Coordinate]
  }
}


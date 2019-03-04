package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressDisplayPosition extends js.Object {
  var Address: Anon_AdditionalData
  var DisplayPosition: Anon_LatitudeLongitude
  var LocationId: java.lang.String
  var LocationType: java.lang.String
  var MapView: Anon_BottomRight
  var NavigationPosition: js.Array[Anon_LatitudeLongitude]
}

object Anon_AddressDisplayPosition {
  @scala.inline
  def apply(
    Address: Anon_AdditionalData,
    DisplayPosition: Anon_LatitudeLongitude,
    LocationId: java.lang.String,
    LocationType: java.lang.String,
    MapView: Anon_BottomRight,
    NavigationPosition: js.Array[Anon_LatitudeLongitude]
  ): Anon_AddressDisplayPosition = {
    val __obj = js.Dynamic.literal(Address = Address, DisplayPosition = DisplayPosition, LocationId = LocationId, LocationType = LocationType, MapView = MapView, NavigationPosition = NavigationPosition)
  
    __obj.asInstanceOf[Anon_AddressDisplayPosition]
  }
}


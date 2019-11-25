package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressDisplayPosition extends js.Object {
  var Address: Anon_AdditionalData
  var DisplayPosition: Anon_LatitudeLongitude
  var LocationId: String
  var LocationType: String
  var MapView: Anon_BottomRight
  var NavigationPosition: js.Array[Anon_LatitudeLongitude]
}

object Anon_AddressDisplayPosition {
  @scala.inline
  def apply(
    Address: Anon_AdditionalData,
    DisplayPosition: Anon_LatitudeLongitude,
    LocationId: String,
    LocationType: String,
    MapView: Anon_BottomRight,
    NavigationPosition: js.Array[Anon_LatitudeLongitude]
  ): Anon_AddressDisplayPosition = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], DisplayPosition = DisplayPosition.asInstanceOf[js.Any], LocationId = LocationId.asInstanceOf[js.Any], LocationType = LocationType.asInstanceOf[js.Any], MapView = MapView.asInstanceOf[js.Any], NavigationPosition = NavigationPosition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AddressDisplayPosition]
  }
}


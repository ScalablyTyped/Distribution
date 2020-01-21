package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddressDisplayPosition extends js.Object {
  var Address: AnonAdditionalData
  var DisplayPosition: AnonLatitudeLongitude
  var LocationId: String
  var LocationType: String
  var MapView: AnonBottomRight
  var NavigationPosition: js.Array[AnonLatitudeLongitude]
}

object AnonAddressDisplayPosition {
  @scala.inline
  def apply(
    Address: AnonAdditionalData,
    DisplayPosition: AnonLatitudeLongitude,
    LocationId: String,
    LocationType: String,
    MapView: AnonBottomRight,
    NavigationPosition: js.Array[AnonLatitudeLongitude]
  ): AnonAddressDisplayPosition = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], DisplayPosition = DisplayPosition.asInstanceOf[js.Any], LocationId = LocationId.asInstanceOf[js.Any], LocationType = LocationType.asInstanceOf[js.Any], MapView = MapView.asInstanceOf[js.Any], NavigationPosition = NavigationPosition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddressDisplayPosition]
  }
}

